package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public class mGI extends mGJ {
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public static final android.util.SparseIntArray copydefault;
    public long EZpvd;
    public final ConstraintLayout gEmmrt;

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
        copydefault = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.uzCIH, 1);
        sparseIntArray.put(mDC.ActionBar.DTg, 2);
    }

    public mGI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, KWHzl, copydefault));
    }

    public mGI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[2]);
        this.EZpvd = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.gEmmrt = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.EZpvd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.EZpvd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.EZpvd = 0L;
        }
    }
}
