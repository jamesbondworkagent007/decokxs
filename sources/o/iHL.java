package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iHL extends iHM {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final android.widget.FrameLayout AuCTel;
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
        sparseIntArray.put(C25493ixk.ActionBar.TarCU, 1);
        sparseIntArray.put(C25493ixk.ActionBar.hBpjJd, 2);
        sparseIntArray.put(C25493ixk.ActionBar.DKr, 3);
        sparseIntArray.put(C25493ixk.ActionBar.avCqka, 4);
        sparseIntArray.put(C25493ixk.ActionBar.DTg, 5);
        sparseIntArray.put(C25493ixk.ActionBar.sSi, 6);
        sparseIntArray.put(C25493ixk.ActionBar.flVtFt, 7);
        sparseIntArray.put(C25493ixk.ActionBar.QUeTTI, 8);
        sparseIntArray.put(C25493ixk.ActionBar.QUSxYX, 9);
        sparseIntArray.put(C25493ixk.ActionBar.drbYRJ, 10);
        sparseIntArray.put(C25493ixk.ActionBar.dLBcXg, 11);
        sparseIntArray.put(C25493ixk.ActionBar.DLGVGj, 12);
        sparseIntArray.put(C25493ixk.ActionBar.HJWChPQdUnVm, 13);
    }

    public iHL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, isConnected, AkhnZx));
    }

    public iHL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C27197jqe) objArr[9], (ConstraintLayout) objArr[7], (Guideline) objArr[2], (C27204jql) objArr[1], (C27131jpR) objArr[11], (android.view.View) objArr[5], (C55173xeu) objArr[12], (C55030xcJ) objArr[10], (C55113xdn) objArr[13], (C27407juc) objArr[4], (C27518jwh) objArr[3], (C27521jwk) objArr[8], (RecyclerView) objArr[6]);
        this.ejfBZ = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.AuCTel = frameLayout;
        frameLayout.setTag(null);
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
