// Generated code from Butter Knife. Do not modify!
package ru.taximaster.testapp.ui.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ru.taximaster.testapp.R;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131230758;

  private View view2131230826;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.button, "field 'button' and method 'onButtonClick'");
    target.button = Utils.castView(view, R.id.button, "field 'button'", Button.class);
    view2131230758 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButtonClick();
      }
    });
    target.editText = Utils.findRequiredViewAsType(source, R.id.editText, "field 'editText'", EditText.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'viewPager'", ViewPager.class);
    view = Utils.findRequiredView(source, R.id.map_text, "method 'onMap_textClick'");
    view2131230826 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMap_textClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.button = null;
    target.editText = null;
    target.viewPager = null;

    view2131230758.setOnClickListener(null);
    view2131230758 = null;
    view2131230826.setOnClickListener(null);
    view2131230826 = null;
  }
}
