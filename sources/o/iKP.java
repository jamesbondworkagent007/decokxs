package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iKP extends ViewDataBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C55251xgS copydefault;
    public final C55251xgS djBIcL;
    public final android.widget.ImageView valueOf;

    public iKP(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, C55251xgS c55251xgS, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView2, android.view.View view2, C55251xgS c55251xgS2, android.widget.ImageView imageView3) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.copydefault = c55251xgS;
        this.EZpvd = frameLayout;
        this.KWHzl = imageView2;
        this.AEQbTJ = view2;
        this.djBIcL = c55251xgS2;
        this.valueOf = imageView3;
    }

    public static iKP KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iKP copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iKP) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.getLabel, viewGroup, z, obj);
    }
}
