package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31521lvb extends AbstractC31465luY {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray isConnected;
    public final ConstraintLayout AkhnZx;
    public long fetchVPNInfo;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.DcMfJKsuEgdN, 2);
        sparseIntArray.put(C31351lsQ.Application.Dmq, 3);
        sparseIntArray.put(C31351lsQ.Application.iZzfmt, 4);
        sparseIntArray.put(C31351lsQ.Application.DGgnkA, 5);
        sparseIntArray.put(C31351lsQ.Application.DcqEDu, 6);
        sparseIntArray.put(C31351lsQ.Application.DGUQLI, 7);
        sparseIntArray.put(C31351lsQ.Application.DNMMPQ, 8);
        sparseIntArray.put(C31351lsQ.Application.DaRZkR, 9);
        sparseIntArray.put(C31351lsQ.Application.OTwTPd, 10);
        sparseIntArray.put(C31351lsQ.Application.fLIjIY, 11);
    }

    public C31521lvb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, DbNXlk, isConnected));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31521lvb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[4];
        C31596lwy c31596lwyAEQbTJ = obj != null ? C31596lwy.AEQbTJ((android.view.View) obj) : null;
        java.lang.Object obj2 = objArr[3];
        C31550lwD c31550lwDAEQbTJ = obj2 != null ? C31550lwD.AEQbTJ((android.view.View) obj2) : null;
        android.widget.TextView textView = (android.widget.TextView) objArr[6];
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[7];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        RecyclerView recyclerView = (RecyclerView) objArr[10];
        C55230xfy c55230xfy = (C55230xfy) objArr[5];
        C55187xfH c55187xfH = (C55187xfH) objArr[9];
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[8];
        C55173xeu c55173xeu = (C55173xeu) objArr[11];
        java.lang.Object obj3 = objArr[2];
        super(dataBindingComponent, view, 0, c31596lwyAEQbTJ, c31550lwDAEQbTJ, textView, coordinatorLayout, constraintLayout, recyclerView, c55230xfy, c55187xfH, constraintLayout2, c55173xeu, obj3 != null ? C31553lwG.AEQbTJ((android.view.View) obj3) : null);
        this.fetchVPNInfo = -1L;
        this.OLrzqt.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout3;
        constraintLayout3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
