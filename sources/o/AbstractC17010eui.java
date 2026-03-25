package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17010eui extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final ConstraintLayout DbNXlk;
    public final wYK EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C33537myN copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fJNWhG;
    public final ConstraintLayout fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.ImageView valueOf;
    public final android.widget.TextView values;

    public AbstractC17010eui(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C52794wYp c52794wYp, wYK wyk, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.TextView textView7, android.widget.TextView textView8) {
        super(obj, view, i);
        this.copydefault = c33537myN;
        this.AEQbTJ = c52794wYp;
        this.EZpvd = wyk;
        this.OLrzqt = textView;
        this.KWHzl = textView2;
        this.AYXKKw = textView3;
        this.djBIcL = imageView;
        this.valueOf = imageView2;
        this.AhwBna = imageView3;
        this.gEmmrt = constraintLayout;
        this.fetchVPNInfo = constraintLayout2;
        this.DbNXlk = constraintLayout3;
        this.values = textView4;
        this.AkhnZx = textView5;
        this.isConnected = textView6;
        this.fJNWhG = textView7;
        this.fARcdN = textView8;
    }

    public static AbstractC17010eui EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17010eui AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17010eui) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.HJWChPUUMfbK, null, false, obj);
    }
}
