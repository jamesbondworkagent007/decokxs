package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public class mFE extends mFA {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fIwbmz = null;
    public long fJNWhG;

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
        sparseIntArray.put(mDC.ActionBar.QKudOq, 1);
        sparseIntArray.put(mDC.ActionBar.gUEfcq, 2);
        sparseIntArray.put(mDC.ActionBar.dUDNAs, 3);
        sparseIntArray.put(mDC.ActionBar.fZBcTu, 4);
        sparseIntArray.put(mDC.ActionBar.finit, 5);
        sparseIntArray.put(mDC.ActionBar.fIwbmz, 6);
        sparseIntArray.put(mDC.ActionBar.RlQdEF, 7);
        sparseIntArray.put(mDC.ActionBar.DGUQLIDGUQLI, 8);
        sparseIntArray.put(mDC.ActionBar.zLjUOn, 9);
        sparseIntArray.put(mDC.ActionBar.OqFWZa, 10);
        sparseIntArray.put(mDC.ActionBar.zSsVtY, 11);
        sparseIntArray.put(mDC.ActionBar.wlaJM, 12);
        sparseIntArray.put(mDC.ActionBar.DarRvM, 13);
        sparseIntArray.put(mDC.ActionBar.DGUQLIekVPG, 14);
        sparseIntArray.put(mDC.ActionBar.EZpvd, 15);
    }

    public mFE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fIwbmz, AuCTel));
    }

    public mFE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[15], (ConstraintLayout) objArr[6], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[9], (ConstraintLayout) objArr[12], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[1], (wYC) objArr[7], (wYC) objArr[10], (wYC) objArr[13], (C55251xgS) objArr[3], (ConstraintLayout) objArr[2], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[14]);
        this.fJNWhG = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fJNWhG = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fJNWhG != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fJNWhG = 0L;
        }
    }
}
