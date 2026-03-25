package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iHQ extends ViewDataBinding {
    public final Guideline AEQbTJ;
    public final C55030xcJ AYXKKw;
    public final C55173xeu AhwBna;
    public final C27518jwh AkhnZx;
    public final android.view.View DbNXlk;
    public final C27204jql EZpvd;
    public final ConstraintLayout KWHzl;
    public final C27197jqe OLrzqt;
    public final C27131jpR copydefault;
    public final C27444jvM djBIcL;
    public final RecyclerView fARcdN;
    public final android.view.View fetchVPNInfo;
    public final android.view.View gEmmrt;
    public final C27521jwk isConnected;
    public final C55113xdn valueOf;
    public final C27407juc values;

    public iHQ(java.lang.Object obj, android.view.View view, int i, C27197jqe c27197jqe, ConstraintLayout constraintLayout, Guideline guideline, C27204jql c27204jql, C27131jpR c27131jpR, android.view.View view2, C55173xeu c55173xeu, C27444jvM c27444jvM, C55030xcJ c55030xcJ, C55113xdn c55113xdn, C27407juc c27407juc, android.view.View view3, android.view.View view4, C27518jwh c27518jwh, C27521jwk c27521jwk, RecyclerView recyclerView) {
        super(obj, view, i);
        this.OLrzqt = c27197jqe;
        this.KWHzl = constraintLayout;
        this.AEQbTJ = guideline;
        this.EZpvd = c27204jql;
        this.copydefault = c27131jpR;
        this.gEmmrt = view2;
        this.AhwBna = c55173xeu;
        this.djBIcL = c27444jvM;
        this.AYXKKw = c55030xcJ;
        this.valueOf = c55113xdn;
        this.values = c27407juc;
        this.fetchVPNInfo = view3;
        this.DbNXlk = view4;
        this.AkhnZx = c27518jwh;
        this.isConnected = c27521jwk;
        this.fARcdN = recyclerView;
    }

    public static iHQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        return AEQbTJ(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iHQ AEQbTJ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iHQ) ViewDataBinding.bind(obj, view, C25493ixk.Activity.QfsBiF);
    }
}
