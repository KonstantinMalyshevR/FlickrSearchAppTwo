// Generated code from Butter Knife. Do not modify!
package ru.taximaster.testapp.ui.slide;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ru.taximaster.testapp.R;

public class SlideActivity_ViewBinding implements Unbinder {
  private SlideActivity target;

  @UiThread
  public SlideActivity_ViewBinding(SlideActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SlideActivity_ViewBinding(SlideActivity target, View source) {
    this.target = target;

    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'viewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SlideActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.viewPager = null;
  }
}
