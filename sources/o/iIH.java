package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iIH extends ViewDataBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final C55251xgS KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView valueOf;

    public iIH(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, C55251xgS c55251xgS, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6) {
        super(obj, view, i);
        this.OLrzqt = appCompatTextView;
        this.EZpvd = appCompatTextView2;
        this.copydefault = appCompatTextView3;
        this.AEQbTJ = appCompatTextView4;
        this.KWHzl = c55251xgS;
        this.valueOf = appCompatTextView5;
        this.gEmmrt = appCompatTextView6;
    }

    public static iIH copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iIH EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iIH) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.RKDWNf, viewGroup, z, obj);
    }
}
