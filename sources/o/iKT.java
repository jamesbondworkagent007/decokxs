package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iKT extends iKQ {
    public static final ViewDataBinding.IncludedLayouts getFieldNames = null;
    public static final android.util.SparseIntArray iwGUEr;
    public long hDKMBd;
    public final ConstraintLayout zsXlph;

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
        iwGUEr = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.fOrBHg, 1);
        sparseIntArray.put(C25493ixk.ActionBar.m, 2);
        sparseIntArray.put(C25493ixk.ActionBar.RFmUsE, 3);
        sparseIntArray.put(C25493ixk.ActionBar.zFtALg, 4);
        sparseIntArray.put(C25493ixk.ActionBar.hGuIrQ, 5);
        sparseIntArray.put(C25493ixk.ActionBar.pXZxY, 6);
        sparseIntArray.put(C25493ixk.ActionBar.HJWChP, 7);
        sparseIntArray.put(C25493ixk.ActionBar.RckOJh, 8);
        sparseIntArray.put(C25493ixk.ActionBar.GhqvEQ, 9);
        sparseIntArray.put(C25493ixk.ActionBar.fQQVvf, 10);
        sparseIntArray.put(C25493ixk.ActionBar.DXd, 11);
        sparseIntArray.put(C25493ixk.ActionBar.RIKbBf, 12);
        sparseIntArray.put(C25493ixk.ActionBar.Qsauvs, 13);
        sparseIntArray.put(C25493ixk.ActionBar.adwzgZ, 14);
        sparseIntArray.put(C25493ixk.ActionBar.UvfnWv, 15);
        sparseIntArray.put(C25493ixk.ActionBar.gasjUx, 16);
        sparseIntArray.put(C25493ixk.ActionBar.apNbdB, 17);
        sparseIntArray.put(C25493ixk.ActionBar.validateSHA256, 18);
        sparseIntArray.put(C25493ixk.ActionBar.pauseLocationServices, 19);
        sparseIntArray.put(C25493ixk.ActionBar.hlXVux, 20);
        sparseIntArray.put(C25493ixk.ActionBar.DDNONI, 21);
        sparseIntArray.put(C25493ixk.ActionBar.fvQaOB, 22);
    }

    public iKT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 23, getFieldNames, iwGUEr));
    }

    public iKT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[22], (C27235jrP) objArr[16], (android.widget.ImageView) objArr[17], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[11], (Barrier) objArr[7], (C27229jrJ) objArr[13], (android.widget.FrameLayout) objArr[14], (Barrier) objArr[12], (android.view.View) objArr[18], (android.widget.ImageView) objArr[21], (C27235jrP) objArr[15], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1]);
        this.hDKMBd = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.zsXlph = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.hDKMBd = 0L;
        }
    }
}
