package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16507elI extends ViewDataBinding {
    public final C13791dYk AEQbTJ;
    public final android.view.View AYXKKw;
    public final C33546myW AhwBna;
    public final C55173xeu AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final Barrier EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.TextView OLrzqt;
    public final RecyclerView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fARcdN;
    public final C52794wYp fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final ConstraintLayout valueOf;
    public final AppCompatTextView values;

    public AbstractC16507elI(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, Barrier barrier, android.widget.TextView textView, RecyclerView recyclerView, C13791dYk c13791dYk, android.view.View view2, android.widget.TextView textView2, C33546myW c33546myW, ConstraintLayout constraintLayout, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, C52794wYp c52794wYp2, AppCompatTextView appCompatTextView, C55173xeu c55173xeu, android.widget.TextView textView6, android.widget.TextView textView7) {
        super(obj, view, i);
        this.KWHzl = c52794wYp;
        this.EZpvd = barrier;
        this.OLrzqt = textView;
        this.copydefault = recyclerView;
        this.AEQbTJ = c13791dYk;
        this.AYXKKw = view2;
        this.gEmmrt = textView2;
        this.AhwBna = c33546myW;
        this.valueOf = constraintLayout;
        this.djBIcL = textView3;
        this.isConnected = textView4;
        this.DbNXlk = textView5;
        this.fetchVPNInfo = c52794wYp2;
        this.values = appCompatTextView;
        this.AkhnZx = c55173xeu;
        this.fARcdN = textView6;
        this.AuCTel = textView7;
    }

    public static AbstractC16507elI AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16507elI KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16507elI) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DGUQLIOvDItG, viewGroup, z, obj);
    }
}
