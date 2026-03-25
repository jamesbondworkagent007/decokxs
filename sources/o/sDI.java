package o;

import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C44105sDn;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sDI extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final CardView gEmmrt;

    public sDI(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.LinearLayout linearLayout, android.widget.FrameLayout frameLayout2, android.widget.TextView textView, android.widget.TextView textView2, android.widget.ImageView imageView2, CardView cardView, android.widget.ImageView imageView3) {
        super(obj, view, i);
        this.EZpvd = frameLayout;
        this.KWHzl = imageView;
        this.copydefault = linearLayout;
        this.AEQbTJ = frameLayout2;
        this.OLrzqt = textView;
        this.djBIcL = textView2;
        this.AYXKKw = imageView2;
        this.gEmmrt = cardView;
        this.AhwBna = imageView3;
    }

    public static sDI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static sDI KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (sDI) ViewDataBinding.inflateInternal(layoutInflater, C44105sDn.StateListAnimator.djBIcL, viewGroup, z, obj);
    }
}
