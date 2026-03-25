package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iKF extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView AkhnZx;
    public final android.widget.ImageView AuCTel;
    public final android.widget.FrameLayout DbNXlk;
    public final C27267jrv EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final Guideline djBIcL;
    public final C27267jrv ejfBZ;
    public final C27226jrG fIwbmz;
    public final Guideline fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.ImageView isConnected;
    public final android.widget.LinearLayout valueOf;
    public final C27226jrG values;

    public iKF(java.lang.Object obj, android.view.View view, int i, C27267jrv c27267jrv, android.view.View view2, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.LinearLayout linearLayout, Guideline guideline, Guideline guideline2, android.widget.ImageView imageView2, C27226jrG c27226jrG, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView3, C27226jrG c27226jrG2, C27267jrv c27267jrv2, android.widget.ImageView imageView4) {
        super(obj, view, i);
        this.EZpvd = c27267jrv;
        this.KWHzl = view2;
        this.copydefault = imageView;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.gEmmrt = textView3;
        this.AhwBna = textView4;
        this.AYXKKw = textView5;
        this.valueOf = linearLayout;
        this.djBIcL = guideline;
        this.fetchVPNInfo = guideline2;
        this.isConnected = imageView2;
        this.values = c27226jrG;
        this.DbNXlk = frameLayout;
        this.AkhnZx = imageView3;
        this.fIwbmz = c27226jrG2;
        this.ejfBZ = c27267jrv2;
        this.AuCTel = imageView4;
    }

    public static iKF AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iKF OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iKF) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.zOIQXb, viewGroup, z, obj);
    }
}
