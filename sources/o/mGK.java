package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public class mGK extends mGE {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray djBIcL;
    public final ConstraintLayout AhwBna;
    public long gEmmrt;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.DCUTEIddSDPG, 2);
        sparseIntArray.put(mDC.ActionBar.zAEkPU, 3);
        sparseIntArray.put(mDC.ActionBar.zDUObI, 4);
        sparseIntArray.put(mDC.ActionBar.DWgRXt, 5);
        sparseIntArray.put(mDC.ActionBar.UrRBLY, 6);
    }

    public mGK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AYXKKw, djBIcL));
    }

    public mGK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[2], (android.widget.TextView) objArr[5], (ConstraintLayout) objArr[6], (android.widget.TextView) objArr[1], (ConstraintLayout) objArr[3], (android.widget.TextView) objArr[4]);
        this.gEmmrt = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.gEmmrt;
            this.gEmmrt = 0L;
        }
        if ((j & 1) != 0) {
            C31908mIj.KWHzl(this.KWHzl, 2);
        }
    }
}
