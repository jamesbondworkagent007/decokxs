package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iHU extends iHQ {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long AuCTel;
    public final android.widget.FrameLayout fJNWhG;

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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.TarCU, 1);
        sparseIntArray.put(C25493ixk.ActionBar.DKr, 2);
        sparseIntArray.put(C25493ixk.ActionBar.avCqka, 3);
        sparseIntArray.put(C25493ixk.ActionBar.QUSxYX, 4);
        sparseIntArray.put(C25493ixk.ActionBar.hBpjJd, 5);
        sparseIntArray.put(C25493ixk.ActionBar.sSi, 6);
        sparseIntArray.put(C25493ixk.ActionBar.fdazkH, 7);
        sparseIntArray.put(C25493ixk.ActionBar.flVtFt, 8);
        sparseIntArray.put(C25493ixk.ActionBar.QUeTTI, 9);
        sparseIntArray.put(C25493ixk.ActionBar.DTg, 10);
        sparseIntArray.put(C25493ixk.ActionBar.getStatusCode, 11);
        sparseIntArray.put(C25493ixk.ActionBar.drbYRJ, 12);
        sparseIntArray.put(C25493ixk.ActionBar.RcLksq, 13);
        sparseIntArray.put(C25493ixk.ActionBar.dLBcXg, 14);
        sparseIntArray.put(C25493ixk.ActionBar.DLGVGj, 15);
        sparseIntArray.put(C25493ixk.ActionBar.HJWChPQdUnVm, 16);
    }

    public iHU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, ejfBZ, fIwbmz));
    }

    public iHU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C27197jqe) objArr[4], (ConstraintLayout) objArr[8], (Guideline) objArr[5], (C27204jql) objArr[1], (C27131jpR) objArr[14], (android.view.View) objArr[10], (C55173xeu) objArr[15], (C27444jvM) objArr[11], (C55030xcJ) objArr[12], (C55113xdn) objArr[16], (C27407juc) objArr[3], (android.view.View) objArr[13], (android.view.View) objArr[7], (C27518jwh) objArr[2], (C27521jwk) objArr[9], (RecyclerView) objArr[6]);
        this.AuCTel = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.fJNWhG = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
