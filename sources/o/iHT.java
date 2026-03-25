package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iHT extends ViewDataBinding {
    public final Guideline AEQbTJ;
    public final C55173xeu AYXKKw;
    public final C55113xdn AhwBna;
    public final RecyclerView AkhnZx;
    public final android.widget.FrameLayout AuCTel;
    public final C27521jwk DbNXlk;
    public final ConstraintLayout EZpvd;
    public final C27443jvL KWHzl;
    public final C27204jql OLrzqt;
    public final C27449jvR copydefault;
    public final C55030xcJ djBIcL;
    public final C27259jrn fIwbmz;
    public final android.widget.TextView fetchVPNInfo;
    public final C27131jpR gEmmrt;
    public final android.view.View isConnected;
    public final C27444jvM valueOf;
    public final android.view.View values;

    public iHT(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, C27443jvL c27443jvL, Guideline guideline, C27449jvR c27449jvR, C27204jql c27204jql, C27131jpR c27131jpR, C55173xeu c55173xeu, C27444jvM c27444jvM, C55030xcJ c55030xcJ, C55113xdn c55113xdn, android.view.View view2, android.view.View view3, C27521jwk c27521jwk, RecyclerView recyclerView, android.widget.TextView textView, C27259jrn c27259jrn, android.widget.FrameLayout frameLayout) {
        super(obj, view, i);
        this.EZpvd = constraintLayout;
        this.KWHzl = c27443jvL;
        this.AEQbTJ = guideline;
        this.copydefault = c27449jvR;
        this.OLrzqt = c27204jql;
        this.gEmmrt = c27131jpR;
        this.AYXKKw = c55173xeu;
        this.valueOf = c27444jvM;
        this.djBIcL = c55030xcJ;
        this.AhwBna = c55113xdn;
        this.isConnected = view2;
        this.values = view3;
        this.DbNXlk = c27521jwk;
        this.AkhnZx = recyclerView;
        this.fetchVPNInfo = textView;
        this.fIwbmz = c27259jrn;
        this.AuCTel = frameLayout;
    }

    public static iHT EZpvd(@androidx.annotation.NonNull android.view.View view) {
        return KWHzl(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iHT KWHzl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iHT) ViewDataBinding.bind(obj, view, C25493ixk.Activity.QbewEr);
    }
}
