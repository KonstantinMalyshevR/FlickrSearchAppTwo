// Generated code from Butter Knife. Do not modify!
package ru.taximaster.testapp.ui.map;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ru.taximaster.testapp.R;

public class MapActivity_ViewBinding implements Unbinder {
  private MapActivity target;

  @UiThread
  public MapActivity_ViewBinding(MapActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MapActivity_ViewBinding(MapActivity target, View source) {
    this.target = target;

    target.image = Utils.findRequiredViewAsType(source, R.id.org_image, "field 'image'", ImageView.class);
    target.progress = Utils.findRequiredViewAsType(source, R.id.org_progress, "field 'progress'", ProgressBar.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.name_text, "field 'title'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MapActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.image = null;
    target.progress = null;
    target.title = null;
  }
}
