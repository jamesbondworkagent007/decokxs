package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iHV extends ViewDataBinding {
    public final C27130jpQ AEQbTJ;
    public final C27443jvL AYXKKw;
    public final C55113xdn AhwBna;
    public final android.widget.FrameLayout AkhnZx;
    public final RecyclerView AuCTel;
    public final android.view.View DbNXlk;
    public final Guideline EZpvd;
    public final C27131jpR KWHzl;
    public final C27204jql OLrzqt;
    public final ConstraintLayout copydefault;
    public final C27444jvM djBIcL;
    public final C27521jwk ejfBZ;
    public final android.widget.TextView fIwbmz;
    public final C27407juc fetchVPNInfo;
    public final C55173xeu gEmmrt;
    public final C27456jvY isConnected;
    public final C55030xcJ valueOf;
    public final android.view.View values;

    public iHV(java.lang.Object obj, android.view.View view, int i, C27130jpQ c27130jpQ, ConstraintLayout constraintLayout, Guideline guideline, C27204jql c27204jql, C27131jpR c27131jpR, C55173xeu c55173xeu, C27444jvM c27444jvM, C55030xcJ c55030xcJ, C55113xdn c55113xdn, C27443jvL c27443jvL, C27407juc c27407juc, android.view.View view2, android.view.View view3, android.widget.FrameLayout frameLayout, C27456jvY c27456jvY, C27521jwk c27521jwk, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = c27130jpQ;
        this.copydefault = constraintLayout;
        this.EZpvd = guideline;
        this.OLrzqt = c27204jql;
        this.KWHzl = c27131jpR;
        this.gEmmrt = c55173xeu;
        this.djBIcL = c27444jvM;
        this.valueOf = c55030xcJ;
        this.AhwBna = c55113xdn;
        this.AYXKKw = c27443jvL;
        this.fetchVPNInfo = c27407juc;
        this.values = view2;
        this.DbNXlk = view3;
        this.AkhnZx = frameLayout;
        this.isConnected = c27456jvY;
        this.ejfBZ = c27521jwk;
        this.AuCTel = recyclerView;
        this.fIwbmz = textView;
    }

    public static iHV OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        return OLrzqt(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iHV OLrzqt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iHV) ViewDataBinding.bind(obj, view, C25493ixk.Activity.UeEOUB);
    }
}
