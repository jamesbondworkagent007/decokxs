package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: renamed from: o.mHm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31884mHm extends AbstractC31886mHo {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long isConnected;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.fvQaOB, 1);
        sparseIntArray.put(mDC.ActionBar.tIwhY, 2);
        sparseIntArray.put(mDC.ActionBar.fsSxsn, 3);
        sparseIntArray.put(mDC.ActionBar.AkhnZx, 4);
        sparseIntArray.put(mDC.ActionBar.isConnected, 5);
        sparseIntArray.put(mDC.ActionBar.DbNXlk, 6);
        sparseIntArray.put(mDC.ActionBar.QUSxYX, 7);
    }

    public C31884mHm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, gEmmrt));
    }

    public C31884mHm(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[6], (android.widget.LinearLayout) objArr[4], (android.widget.TextView) objArr[5], (android.widget.LinearLayout) objArr[0], (android.view.View) objArr[7], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[2]);
        this.isConnected = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
