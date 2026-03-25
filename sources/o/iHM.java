package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iHM extends ViewDataBinding {
    public final Guideline AEQbTJ;
    public final C27407juc AYXKKw;
    public final C55113xdn AhwBna;
    public final C27518jwh DbNXlk;
    public final C27197jqe EZpvd;
    public final ConstraintLayout KWHzl;
    public final C27131jpR OLrzqt;
    public final C27204jql copydefault;
    public final C55030xcJ djBIcL;
    public final RecyclerView fetchVPNInfo;
    public final C55173xeu gEmmrt;
    public final android.view.View valueOf;
    public final C27521jwk values;

    public iHM(java.lang.Object obj, android.view.View view, int i, C27197jqe c27197jqe, ConstraintLayout constraintLayout, Guideline guideline, C27204jql c27204jql, C27131jpR c27131jpR, android.view.View view2, C55173xeu c55173xeu, C55030xcJ c55030xcJ, C55113xdn c55113xdn, C27407juc c27407juc, C27518jwh c27518jwh, C27521jwk c27521jwk, RecyclerView recyclerView) {
        super(obj, view, i);
        this.EZpvd = c27197jqe;
        this.KWHzl = constraintLayout;
        this.AEQbTJ = guideline;
        this.copydefault = c27204jql;
        this.OLrzqt = c27131jpR;
        this.valueOf = view2;
        this.gEmmrt = c55173xeu;
        this.djBIcL = c55030xcJ;
        this.AhwBna = c55113xdn;
        this.AYXKKw = c27407juc;
        this.DbNXlk = c27518jwh;
        this.values = c27521jwk;
        this.fetchVPNInfo = recyclerView;
    }

    public static iHM EZpvd(@androidx.annotation.NonNull android.view.View view) {
        return OLrzqt(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iHM OLrzqt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iHM) ViewDataBinding.bind(obj, view, C25493ixk.Activity.RJOkX);
    }
}
