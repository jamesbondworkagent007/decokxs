package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iHI extends iHH {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long DbNXlk;
    public final android.widget.LinearLayout isConnected;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.DTwDnp, 1);
        sparseIntArray.put(C25493ixk.ActionBar.OcIXYQ, 2);
        sparseIntArray.put(C25493ixk.ActionBar.gHZMYf, 3);
        sparseIntArray.put(C25493ixk.ActionBar.swzYdv, 4);
        sparseIntArray.put(C25493ixk.ActionBar.hvKCwS, 5);
        sparseIntArray.put(C25493ixk.ActionBar.hlkKmr, 6);
        sparseIntArray.put(C25493ixk.ActionBar.fbC, 7);
        sparseIntArray.put(C25493ixk.ActionBar.sVXHln, 8);
    }

    public iHI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, AYXKKw));
    }

    public iHI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[3], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[6], (ConstraintLayout) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[8], (C27302jsd) objArr[7]);
        this.DbNXlk = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.isConnected = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
