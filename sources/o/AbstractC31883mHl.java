package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.mDC;

/* JADX INFO: renamed from: o.mHl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC31883mHl extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C55237xgE AhwBna;
    public final ConstraintLayout EZpvd;
    public final C55113xdn KWHzl;
    public final C55173xeu OLrzqt;
    public final RecyclerView copydefault;
    public final C33603mza djBIcL;
    public final C57869yqZ gEmmrt;

    public AbstractC31883mHl(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, C55173xeu c55173xeu, android.widget.FrameLayout frameLayout, C55113xdn c55113xdn, RecyclerView recyclerView, C33603mza c33603mza, C57869yqZ c57869yqZ, C55237xgE c55237xgE) {
        super(obj, view, i);
        this.EZpvd = constraintLayout;
        this.OLrzqt = c55173xeu;
        this.AEQbTJ = frameLayout;
        this.KWHzl = c55113xdn;
        this.copydefault = recyclerView;
        this.djBIcL = c33603mza;
        this.gEmmrt = c57869yqZ;
        this.AhwBna = c55237xgE;
    }

    public static AbstractC31883mHl AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31883mHl copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31883mHl) ViewDataBinding.inflateInternal(layoutInflater, mDC.TaskDescription.dNCPSb, viewGroup, z, obj);
    }
}
