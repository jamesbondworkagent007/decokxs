package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iHO extends iHN {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public final android.widget.FrameLayout hDKMBd;
    public long uzCIH;

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
        AuCTel = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.TarCU, 1);
        sparseIntArray.put(C25493ixk.ActionBar.UUsvzUhTFPAC, 2);
        sparseIntArray.put(C25493ixk.ActionBar.receiveFile, 3);
        sparseIntArray.put(C25493ixk.ActionBar.QUSxYX, 4);
        sparseIntArray.put(C25493ixk.ActionBar.DKr, 5);
        sparseIntArray.put(C25493ixk.ActionBar.HJWChPdIKEqB, 6);
        sparseIntArray.put(C25493ixk.ActionBar.hBpjJd, 7);
        sparseIntArray.put(C25493ixk.ActionBar.sSi, 8);
        sparseIntArray.put(C25493ixk.ActionBar.fdazkH, 9);
        sparseIntArray.put(C25493ixk.ActionBar.flVtFt, 10);
        sparseIntArray.put(C25493ixk.ActionBar.setProfilesSinceInitCount, 11);
        sparseIntArray.put(C25493ixk.ActionBar.QUeTTI, 12);
        sparseIntArray.put(C25493ixk.ActionBar.getStatusCode, 13);
        sparseIntArray.put(C25493ixk.ActionBar.drbYRJ, 14);
        sparseIntArray.put(C25493ixk.ActionBar.RcLksq, 15);
        sparseIntArray.put(C25493ixk.ActionBar.dLBcXg, 16);
        sparseIntArray.put(C25493ixk.ActionBar.DLGVGj, 17);
        sparseIntArray.put(C25493ixk.ActionBar.HJWChPQdUnVm, 18);
    }

    public iHO(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, fJNWhG, AuCTel));
    }

    public iHO(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C27130jpQ) objArr[4], (ConstraintLayout) objArr[10], (Guideline) objArr[7], (ConstraintLayout) objArr[1], (C27131jpR) objArr[16], (C55173xeu) objArr[17], (C27444jvM) objArr[13], (C55030xcJ) objArr[14], (C55113xdn) objArr[18], (C27447jvP) objArr[6], (C27443jvL) objArr[11], (android.view.View) objArr[15], (android.view.View) objArr[9], (android.widget.FrameLayout) objArr[2], (C27456jvY) objArr[5], (C27521jwk) objArr[12], (RecyclerView) objArr[8], (android.widget.TextView) objArr[3]);
        this.uzCIH = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.hDKMBd = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.uzCIH = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.uzCIH != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.uzCIH = 0L;
        }
    }
}
