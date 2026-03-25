package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iKY extends iKV {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long DbNXlk;
    public final ConstraintLayout fetchVPNInfo;

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
        sparseIntArray.put(C25493ixk.ActionBar.DAgZj, 1);
        sparseIntArray.put(C25493ixk.ActionBar.sEAkxl, 2);
        sparseIntArray.put(C25493ixk.ActionBar.OqCbbx, 3);
        sparseIntArray.put(C25493ixk.ActionBar.nriSR, 4);
        sparseIntArray.put(C25493ixk.ActionBar.DuR, 5);
        sparseIntArray.put(C25493ixk.ActionBar.AYXKKw, 6);
        sparseIntArray.put(C25493ixk.ActionBar.DzOuPm, 7);
        sparseIntArray.put(C25493ixk.ActionBar.RAQtXZ, 8);
    }

    public iKY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, gEmmrt));
    }

    public iKY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[6], (android.widget.TextView) objArr[8], (android.widget.ImageView) objArr[5], (C27343jtR) objArr[3], (android.widget.FrameLayout) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[7]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
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
