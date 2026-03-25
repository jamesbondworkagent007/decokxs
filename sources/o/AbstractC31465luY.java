package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31465luY extends ViewDataBinding {
    public final C31596lwy AEQbTJ;
    public final C55187xfH AYXKKw;
    public final ConstraintLayout AhwBna;
    public final CoordinatorLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C31550lwD copydefault;
    public final C55173xeu djBIcL;
    public final RecyclerView gEmmrt;
    public final C55230xfy valueOf;
    public final C31553lwG values;

    public AbstractC31465luY(java.lang.Object obj, android.view.View view, int i, C31596lwy c31596lwy, C31550lwD c31550lwD, android.widget.TextView textView, CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, RecyclerView recyclerView, C55230xfy c55230xfy, C55187xfH c55187xfH, ConstraintLayout constraintLayout2, C55173xeu c55173xeu, C31553lwG c31553lwG) {
        super(obj, view, i);
        this.AEQbTJ = c31596lwy;
        this.copydefault = c31550lwD;
        this.KWHzl = textView;
        this.EZpvd = coordinatorLayout;
        this.OLrzqt = constraintLayout;
        this.gEmmrt = recyclerView;
        this.valueOf = c55230xfy;
        this.AYXKKw = c55187xfH;
        this.AhwBna = constraintLayout2;
        this.djBIcL = c55173xeu;
        this.values = c31553lwG;
    }

    public static AbstractC31465luY EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31465luY AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31465luY) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.OcIXYQ, viewGroup, z, obj);
    }
}
