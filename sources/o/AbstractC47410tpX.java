package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47410tpX extends ViewDataBinding {
    public final android.widget.ProgressBar AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.ImageView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    public AbstractC47410tpX(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.FrameLayout frameLayout, android.widget.ProgressBar progressBar, android.widget.ImageView imageView2, android.widget.ImageView imageView3, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.KWHzl = linearLayout;
        this.EZpvd = imageView;
        this.copydefault = frameLayout;
        this.AEQbTJ = progressBar;
        this.OLrzqt = imageView2;
        this.AYXKKw = imageView3;
        this.gEmmrt = textView;
        this.djBIcL = textView2;
        this.valueOf = textView3;
    }

    public static AbstractC47410tpX EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47410tpX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47410tpX) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.QkdxfA, viewGroup, z, obj);
    }
}
