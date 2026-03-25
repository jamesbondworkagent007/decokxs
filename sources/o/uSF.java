package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uSF extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final FragmentContainerView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final C51601vqB AkhnZx;
    public final android.widget.TextView AuCTel;
    public final C55258xgZ DbNXlk;
    public final FragmentContainerView EZpvd;
    public final FragmentContainerView KWHzl;
    public final C48208uIz OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final wPY djBIcL;
    public final LinearLayoutCompat ejfBZ;
    public final C55372xih fARcdN;
    public final C55372xih fIwbmz;
    public final android.widget.RelativeLayout fJNWhG;
    public final NestedScrollView fetchVPNInfo;
    public final C55249xgQ gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final android.widget.TextView getNewProxyInstance;
    public final android.widget.TextView hDKMBd;
    public final uII isConnected;
    public final LinearLayoutCompat iwGUEr;
    public final uRP valueOf;
    public final LinearLayoutCompat values;

    public uSF(java.lang.Object obj, android.view.View view, int i, LinearLayoutCompat linearLayoutCompat, android.widget.TextView textView, C48208uIz c48208uIz, FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2, uRP urp, FragmentContainerView fragmentContainerView3, wPY wpy, ConstraintLayout constraintLayout, C55249xgQ c55249xgQ, LinearLayoutCompat linearLayoutCompat2, C55258xgZ c55258xgZ, C51601vqB c51601vqB, NestedScrollView nestedScrollView, uII uii, android.widget.TextView textView2, C55372xih c55372xih, LinearLayoutCompat linearLayoutCompat3, C55372xih c55372xih2, android.widget.RelativeLayout relativeLayout, android.widget.TextView textView3, LinearLayoutCompat linearLayoutCompat4, android.widget.TextView textView4, android.widget.TextView textView5) {
        super(obj, view, i);
        this.copydefault = linearLayoutCompat;
        this.AEQbTJ = textView;
        this.OLrzqt = c48208uIz;
        this.EZpvd = fragmentContainerView;
        this.KWHzl = fragmentContainerView2;
        this.valueOf = urp;
        this.AYXKKw = fragmentContainerView3;
        this.djBIcL = wpy;
        this.AhwBna = constraintLayout;
        this.gEmmrt = c55249xgQ;
        this.values = linearLayoutCompat2;
        this.DbNXlk = c55258xgZ;
        this.AkhnZx = c51601vqB;
        this.fetchVPNInfo = nestedScrollView;
        this.isConnected = uii;
        this.AuCTel = textView2;
        this.fARcdN = c55372xih;
        this.ejfBZ = linearLayoutCompat3;
        this.fIwbmz = c55372xih2;
        this.fJNWhG = relativeLayout;
        this.hDKMBd = textView3;
        this.iwGUEr = linearLayoutCompat4;
        this.getNewProxyInstance = textView4;
        this.getFieldNames = textView5;
    }

    public static uSF OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        return AEQbTJ(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uSF AEQbTJ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uSF) ViewDataBinding.bind(obj, view, C48033uCm.Activity.invokespecialROgMPW);
    }
}
