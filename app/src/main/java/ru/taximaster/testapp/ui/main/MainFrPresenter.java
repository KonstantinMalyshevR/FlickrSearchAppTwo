package ru.taximaster.testapp.ui.main;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import ru.taximaster.testapp.data.NetworkService;
import ru.taximaster.testapp.data.NetworkInterface;
import ru.taximaster.testapp.data.pojo.FlickrResponse;
import ru.taximaster.testapp.data.pojo.FlickrResponseSinglePhoto;
import ru.taximaster.testapp.ui.base.BasePresenter;
import ru.taximaster.testapp.util.SupportClass;

/**
 * Created by Developer on 28.06.18.
 */

public class MainFrPresenter extends BasePresenter<MainFrMvpView> {

    private Disposable mDisposable;
    private List<FlickrResponseSinglePhoto> list_objects;
    private int pageNumber;

    public MainFrPresenter(int pageNumber) {
        this.pageNumber = pageNumber;

        list_objects = new ArrayList<>();
    }

    @Override
    public void attachView(MainFrMvpView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
        if (mDisposable != null) mDisposable.dispose();
    }

    public List<FlickrResponseSinglePhoto> getList_objects() {
        return list_objects;
    }

    public void downloadPage(String text){

        checkViewAttached();

        if (mDisposable != null && !mDisposable.isDisposed()) {
            mDisposable.dispose();
        }

        list_objects.clear();

        getMvpView().setProgress(true);

        NetworkInterface networkInterface = NetworkService.getApi();

        Observable<FlickrResponse> searchPhotos = networkInterface.searchPhotos(SupportClass.KEY, "relevance", "1", SupportClass.PER_PAGE_COUNT, pageNumber + 1, 1, "photos", "json", "1", text);

        searchPhotos
                .map(flickrResponse -> flickrResponse.getPhotos())
                .map(photos -> photos.getPhoto())
                //.flatMapIterable(photo -> photo)
                //.flatMap(photo -> networkInterface.getPhotoLocaton(SupportClass.KEY, photo.getId(),"json", "1"), (photo, geoResponse) -> Observable.just(toPhotoMapClass(photo, getPhotoUrl(photo), geoResponse.getImageLocation().getLocation())))
                //.flatMap(pMC -> pMC)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    private Observer<List<FlickrResponseSinglePhoto>> observer = new Observer<List<FlickrResponseSinglePhoto>>() {
        @Override
        public void onSubscribe(Disposable d) {
            mDisposable = d;
        }

        @Override
        public void onNext(List<FlickrResponseSinglePhoto> flickrResponseSinglePhotos) {
            list_objects.addAll(flickrResponseSinglePhotos);
        }

        @Override
        public void onError(Throwable e) {
            getMvpView().setProgress(false);
            getMvpView().showToastMessage("Что-то пошло не так=( " + e.getMessage());
        }

        @Override
        public void onComplete() {
            getMvpView().setProgress(false);
            getMvpView().setItems(list_objects);
        }
    };
}