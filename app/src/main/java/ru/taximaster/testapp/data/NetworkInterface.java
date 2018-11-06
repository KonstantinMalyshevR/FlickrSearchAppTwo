package ru.taximaster.testapp.data;

/**
 * Created by Developer on 17.05.18.
 */

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.taximaster.testapp.data.pojo.FlickrResponse;

public interface ServiceApi {

    //Search Method
    @POST("services/rest/?method=flickr.photos.search")
    Observable<FlickrResponse> searchPhotos(@Query("api_key") String api_key,
                                            @Query("sort") String sort,
                                            @Query("content_type") String content_type,
                                            @Query("per_page") int per_page,
                                            @Query("page") int page,
                                            @Query("has_geo") int has_geo,
                                            @Query("media") String media,
                                            @Query("format") String format,
                                            @Query("nojsoncallback") String nojsoncallback,
                                            @Query("text") String text);
}