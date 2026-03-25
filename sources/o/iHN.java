package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iHN extends ViewDataBinding {
    public final Guideline AEQbTJ;
    public final C27447jvP AYXKKw;
    public final C55030xcJ AhwBna;
    public final C27456jvY AkhnZx;
    public final android.widget.FrameLayout DbNXlk;
    public final C27131jpR EZpvd;
    public final ConstraintLayout KWHzl;
    public final C27130jpQ OLrzqt;
    public final ConstraintLayout copydefault;
    public final C27444jvM djBIcL;
    public final RecyclerView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final C27521jwk fIwbmz;
    public final C27443jvL fetchVPNInfo;
    public final C55173xeu gEmmrt;
    public final android.view.View isConnected;
    public final C55113xdn valueOf;
    public final android.view.View values;

    public iHN(java.lang.Object obj, android.view.View view, int i, C27130jpQ c27130jpQ, ConstraintLayout constraintLayout, Guideline guideline, ConstraintLayout constraintLayout2, C27131jpR c27131jpR, C55173xeu c55173xeu, C27444jvM c27444jvM, C55030xcJ c55030xcJ, C55113xdn c55113xdn, C27447jvP c27447jvP, C27443jvL c27443jvL, android.view.View view2, android.view.View view3, android.widget.FrameLayout frameLayout, C27456jvY c27456jvY, C27521jwk c27521jwk, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = c27130jpQ;
        this.copydefault = constraintLayout;
        this.AEQbTJ = guideline;
        this.KWHzl = constraintLayout2;
        this.EZpvd = c27131jpR;
        this.gEmmrt = c55173xeu;
        this.djBIcL = c27444jvM;
        this.AhwBna = c55030xcJ;
        this.valueOf = c55113xdn;
        this.AYXKKw = c27447jvP;
        this.fetchVPNInfo = c27443jvL;
        this.values = view2;
        this.isConnected = view3;
        this.DbNXlk = frameLayout;
        this.AkhnZx = c27456jvY;
        this.fIwbmz = c27521jwk;
        this.ejfBZ = recyclerView;
        this.fARcdN = textView;
    }

    public static iHN AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        return OLrzqt(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iHN OLrzqt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iHN) ViewDataBinding.bind(obj, view, C25493ixk.Activity.QUSxYX);
    }
}
