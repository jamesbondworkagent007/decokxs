package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16987euL extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final C55251xgS EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;

    public AbstractC16987euL(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, C55251xgS c55251xgS, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.EZpvd = c55251xgS;
        this.copydefault = textView;
        this.KWHzl = textView2;
        this.AEQbTJ = textView3;
        this.AhwBna = textView4;
        this.gEmmrt = textView5;
        this.djBIcL = textView6;
    }

    public static AbstractC16987euL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16987euL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16987euL) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.HJWChPhFGucI, viewGroup, z, obj);
    }
}
