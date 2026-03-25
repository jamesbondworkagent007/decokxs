package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iHR extends iHT {
    public static final android.util.SparseIntArray ejfBZ;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long fARcdN;
    public final android.widget.FrameLayout uzCIH;

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
        ejfBZ = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.TarCU, 1);
        sparseIntArray.put(C25493ixk.ActionBar.f1060a, 2);
        sparseIntArray.put(C25493ixk.ActionBar.onQueueTitleChanged, 3);
        sparseIntArray.put(C25493ixk.ActionBar.MediaMetadataCompat1, 4);
        sparseIntArray.put(C25493ixk.ActionBar.DNMMPQ, 5);
        sparseIntArray.put(C25493ixk.ActionBar.hBpjJd, 6);
        sparseIntArray.put(C25493ixk.ActionBar.sSi, 7);
        sparseIntArray.put(C25493ixk.ActionBar.fdazkH, 8);
        sparseIntArray.put(C25493ixk.ActionBar.flVtFt, 9);
        sparseIntArray.put(C25493ixk.ActionBar.QUeTTI, 10);
        sparseIntArray.put(C25493ixk.ActionBar.RKDWNf, 11);
        sparseIntArray.put(C25493ixk.ActionBar.getStatusCode, 12);
        sparseIntArray.put(C25493ixk.ActionBar.drbYRJ, 13);
        sparseIntArray.put(C25493ixk.ActionBar.RcLksq, 14);
        sparseIntArray.put(C25493ixk.ActionBar.dLBcXg, 15);
        sparseIntArray.put(C25493ixk.ActionBar.DLGVGj, 16);
        sparseIntArray.put(C25493ixk.ActionBar.HJWChPQdUnVm, 17);
    }

    public iHR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, fJNWhG, ejfBZ));
    }

    public iHR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[9], (C27443jvL) objArr[11], (Guideline) objArr[6], (C27449jvR) objArr[5], (C27204jql) objArr[1], (C27131jpR) objArr[15], (C55173xeu) objArr[16], (C27444jvM) objArr[12], (C55030xcJ) objArr[13], (C55113xdn) objArr[17], (android.view.View) objArr[14], (android.view.View) objArr[8], (C27521jwk) objArr[10], (RecyclerView) objArr[7], (android.widget.TextView) objArr[2], (C27259jrn) objArr[4], (android.widget.FrameLayout) objArr[3]);
        this.fARcdN = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.uzCIH = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
