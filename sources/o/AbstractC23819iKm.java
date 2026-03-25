package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23819iKm extends ViewDataBinding {
    public final android.widget.TextView EZpvd;
    public final C27438jvG KWHzl;
    public final C52794wYp OLrzqt;
    public final NestedScrollView copydefault;

    public AbstractC23819iKm(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, NestedScrollView nestedScrollView, android.widget.TextView textView, C27438jvG c27438jvG) {
        super(obj, view, i);
        this.OLrzqt = c52794wYp;
        this.copydefault = nestedScrollView;
        this.EZpvd = textView;
        this.KWHzl = c27438jvG;
    }

    public static AbstractC23819iKm EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC23819iKm OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC23819iKm) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.fsSxsn, viewGroup, z, obj);
    }
}
