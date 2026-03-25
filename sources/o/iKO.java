package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iKO extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final Guideline AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C55251xgS OLrzqt;
    public final android.view.View copydefault;
    public final C55251xgS gEmmrt;

    public iKO(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.FrameLayout frameLayout, android.view.View view2, android.widget.ImageView imageView2, C55251xgS c55251xgS, Guideline guideline, android.widget.ImageView imageView3, C55251xgS c55251xgS2) {
        super(obj, view, i);
        this.EZpvd = imageView;
        this.AEQbTJ = frameLayout;
        this.copydefault = view2;
        this.KWHzl = imageView2;
        this.OLrzqt = c55251xgS;
        this.AhwBna = guideline;
        this.AYXKKw = imageView3;
        this.gEmmrt = c55251xgS2;
    }

    public static iKO KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iKO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iKO) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.zhUgOk, viewGroup, z, obj);
    }
}
