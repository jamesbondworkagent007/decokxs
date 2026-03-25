package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oPI extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final wYC EZpvd;
    public final C52794wYp KWHzl;
    public final ViewPager OLrzqt;
    public final C55172xet copydefault;
    public final C52794wYp gEmmrt;

    public oPI(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, wYC wyc, ViewPager viewPager, C52794wYp c52794wYp, C55172xet c55172xet, C52794wYp c52794wYp2) {
        super(obj, view, i);
        this.AEQbTJ = linearLayout;
        this.EZpvd = wyc;
        this.OLrzqt = viewPager;
        this.KWHzl = c52794wYp;
        this.copydefault = c55172xet;
        this.gEmmrt = c52794wYp2;
    }

    public static oPI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static oPI EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (oPI) ViewDataBinding.inflateInternal(layoutInflater, C35964oKf.Application.RSDDiY, null, false, obj);
    }
}
