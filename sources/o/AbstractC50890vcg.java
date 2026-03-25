package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50890vcg extends ViewDataBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;
    public final C55379xio gEmmrt;
    public final C55379xio valueOf;

    public AbstractC50890vcg(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, LinearLayoutCompat linearLayoutCompat, C55379xio c55379xio, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, C55379xio c55379xio2) {
        super(obj, view, i);
        this.AEQbTJ = appCompatTextView;
        this.copydefault = appCompatTextView2;
        this.OLrzqt = appCompatTextView3;
        this.EZpvd = appCompatTextView4;
        this.KWHzl = linearLayoutCompat;
        this.gEmmrt = c55379xio;
        this.AhwBna = appCompatTextView5;
        this.djBIcL = appCompatTextView6;
        this.AYXKKw = appCompatTextView7;
        this.valueOf = c55379xio2;
    }

    public static AbstractC50890vcg OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50890vcg copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50890vcg) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.icKaHr, viewGroup, z, obj);
    }
}
