package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iHW extends iHV {
    public static final android.util.SparseIntArray fARcdN;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long iwGUEr;
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
        fARcdN = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.TarCU, 1);
        sparseIntArray.put(C25493ixk.ActionBar.UUsvzUhTFPAC, 2);
        sparseIntArray.put(C25493ixk.ActionBar.receiveFile, 3);
        sparseIntArray.put(C25493ixk.ActionBar.QUSxYX, 4);
        sparseIntArray.put(C25493ixk.ActionBar.DKr, 5);
        sparseIntArray.put(C25493ixk.ActionBar.avCqka, 6);
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

    public iHW(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, fJNWhG, fARcdN));
    }

    public iHW(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C27130jpQ) objArr[4], (ConstraintLayout) objArr[10], (Guideline) objArr[7], (C27204jql) objArr[1], (C27131jpR) objArr[16], (C55173xeu) objArr[17], (C27444jvM) objArr[13], (C55030xcJ) objArr[14], (C55113xdn) objArr[18], (C27443jvL) objArr[11], (C27407juc) objArr[6], (android.view.View) objArr[15], (android.view.View) objArr[9], (android.widget.FrameLayout) objArr[2], (C27456jvY) objArr[5], (C27521jwk) objArr[12], (RecyclerView) objArr[8], (android.widget.TextView) objArr[3]);
        this.iwGUEr = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.uzCIH = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.iwGUEr = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.iwGUEr != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.iwGUEr = 0L;
        }
    }
}
