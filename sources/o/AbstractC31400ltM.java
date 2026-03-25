package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.ltM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31400ltM extends ViewDataBinding {
    public final ConstraintLayout copydefault;

    public AbstractC31400ltM(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.copydefault = constraintLayout;
    }

    public static AbstractC31400ltM KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31400ltM OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31400ltM) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.copydefault, null, false, obj);
    }
}
