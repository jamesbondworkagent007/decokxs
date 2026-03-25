package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public class mFX extends mFW {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final ConstraintLayout values;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.DCUTEIddSDPG, 2);
        sparseIntArray.put(mDC.ActionBar.zAEkPU, 3);
        sparseIntArray.put(mDC.ActionBar.vLaW, 4);
        sparseIntArray.put(mDC.ActionBar.zDUObI, 5);
        sparseIntArray.put(mDC.ActionBar.UrRBLY, 6);
        sparseIntArray.put(mDC.ActionBar.DWgRXt, 7);
    }

    public mFX(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, valueOf));
    }

    public mFX(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[2], (android.widget.TextView) objArr[7], (ConstraintLayout) objArr[6], (android.widget.TextView) objArr[1], (android.widget.ImageView) objArr[4], (ConstraintLayout) objArr[3], (android.widget.TextView) objArr[5]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        if ((j & 1) != 0) {
            C31908mIj.KWHzl(this.copydefault, 2);
        }
    }
}
