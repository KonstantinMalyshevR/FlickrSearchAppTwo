// Generated code from Butter Knife. Do not modify!
package ru.taximaster.testapp.ui.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ru.taximaster.testapp.R;

public class GridAdapter$GridViewHolders_ViewBinding implements Unbinder {
  private GridAdapter.GridViewHolders target;

  @UiThread
  public GridAdapter$GridViewHolders_ViewBinding(GridAdapter.GridViewHolders target, View source) {
    this.target = target;

    target.image = Utils.findRequiredViewAsType(source, R.id.image, "field 'image'", ImageView.class);
    target.progress = Utils.findRequiredViewAsType(source, R.id.progress, "field 'progress'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GridAdapter.GridViewHolders target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.image = null;
    target.progress = null;
  }
}
