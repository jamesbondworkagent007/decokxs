package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uXL extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55258xgZ OLrzqt;
    public final C55251xgS copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;

    public uXL(java.lang.Object obj, android.view.View view, int i, C55251xgS c55251xgS, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, C55258xgZ c55258xgZ, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.copydefault = c55251xgS;
        this.KWHzl = linearLayout;
        this.AEQbTJ = linearLayout2;
        this.OLrzqt = c55258xgZ;
        this.EZpvd = textView;
        this.gEmmrt = textView2;
        this.djBIcL = textView3;
        this.AYXKKw = textView4;
        this.AhwBna = appCompatTextView;
    }

    public static uXL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uXL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uXL) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.GQzpsZ, viewGroup, z, obj);
    }
}
