package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48688uaR;

/* JADX INFO: renamed from: o.uaS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48689uaS extends AbstractC48690uaT {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public long ejfBZ;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C48688uaR.StateListAnimator.gEmmrt, 1);
        sparseIntArray.put(C48688uaR.StateListAnimator.DbNXlk, 2);
        sparseIntArray.put(C48688uaR.StateListAnimator.OLrzqt, 3);
        sparseIntArray.put(C48688uaR.StateListAnimator.valueOf, 4);
        sparseIntArray.put(C48688uaR.StateListAnimator.KWHzl, 5);
        sparseIntArray.put(C48688uaR.StateListAnimator.AkhnZx, 6);
        sparseIntArray.put(C48688uaR.StateListAnimator.copydefault, 7);
        sparseIntArray.put(C48688uaR.StateListAnimator.AEQbTJ, 8);
        sparseIntArray.put(C48688uaR.StateListAnimator.values, 9);
        sparseIntArray.put(C48688uaR.StateListAnimator.AhwBna, 10);
        sparseIntArray.put(C48688uaR.StateListAnimator.AYXKKw, 11);
        sparseIntArray.put(C48688uaR.StateListAnimator.EZpvd, 12);
    }

    public C48689uaS(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, fetchVPNInfo, AkhnZx));
    }

    public C48689uaS(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[12], (android.widget.TextView) objArr[8], (android.view.View) objArr[7], (wYC) objArr[5], (ConstraintLayout) objArr[3], (RecyclerView) objArr[11], (android.widget.TextView) objArr[4], (android.widget.LinearLayout) objArr[1], (Group) objArr[10], (Barrier) objArr[9], (android.view.View) objArr[2], (android.widget.TextView) objArr[6], (C55237xgE) objArr[0]);
        this.ejfBZ = -1L;
        this.isConnected.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
