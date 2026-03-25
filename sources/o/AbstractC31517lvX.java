package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31517lvX extends ViewDataBinding {
    public final C31513lvT AEQbTJ;
    public final C31513lvT AYXKKw;
    public final android.view.View EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final ConstraintLayout copydefault;

    public AbstractC31517lvX(java.lang.Object obj, android.view.View view, int i, C31513lvT c31513lvT, ConstraintLayout constraintLayout, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.view.View view2, C31513lvT c31513lvT2) {
        super(obj, view, i);
        this.AEQbTJ = c31513lvT;
        this.copydefault = constraintLayout;
        this.OLrzqt = frameLayout;
        this.KWHzl = imageView;
        this.EZpvd = view2;
        this.AYXKKw = c31513lvT2;
    }

    public static AbstractC31517lvX OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31517lvX KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31517lvX) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.AxsJAYaxsJAY, viewGroup, z, obj);
    }
}
