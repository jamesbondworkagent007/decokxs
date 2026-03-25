package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47327tnu extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final C55173xeu AhwBna;
    public final AppBarLayout EZpvd;
    public final CollapsingToolbarLayout KWHzl;
    public final OKAlertBanner OLrzqt;
    public final C33537myN copydefault;
    public final android.widget.TextView djBIcL;
    public final C55113xdn fetchVPNInfo;
    public final C55230xfy gEmmrt;
    public final android.widget.TextView valueOf;

    public AbstractC47327tnu(java.lang.Object obj, android.view.View view, int i, OKAlertBanner oKAlertBanner, AppBarLayout appBarLayout, C33537myN c33537myN, C52794wYp c52794wYp, CollapsingToolbarLayout collapsingToolbarLayout, android.widget.FrameLayout frameLayout, C55230xfy c55230xfy, android.widget.TextView textView, android.widget.TextView textView2, C55173xeu c55173xeu, C55113xdn c55113xdn) {
        super(obj, view, i);
        this.OLrzqt = oKAlertBanner;
        this.EZpvd = appBarLayout;
        this.copydefault = c33537myN;
        this.AEQbTJ = c52794wYp;
        this.KWHzl = collapsingToolbarLayout;
        this.AYXKKw = frameLayout;
        this.gEmmrt = c55230xfy;
        this.valueOf = textView;
        this.djBIcL = textView2;
        this.AhwBna = c55173xeu;
        this.fetchVPNInfo = c55113xdn;
    }

    public static AbstractC47327tnu AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47327tnu EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47327tnu) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.valueOf, null, false, obj);
    }
}
