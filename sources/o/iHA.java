package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iHA extends AbstractC23751iHz {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long DbNXlk;

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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.bindToGooglePlayService, 1);
        sparseIntArray.put(C25493ixk.ActionBar.DRuYWY, 2);
        sparseIntArray.put(C25493ixk.ActionBar.DcMfJKsuEgdN, 3);
        sparseIntArray.put(C25493ixk.ActionBar.XW, 4);
        sparseIntArray.put(C25493ixk.ActionBar.DcMfJKfwDlxl, 5);
        sparseIntArray.put(C25493ixk.ActionBar.DwQSDd, 6);
        sparseIntArray.put(C25493ixk.ActionBar.abAflu, 7);
        sparseIntArray.put(C25493ixk.ActionBar.drbYRJ, 8);
        sparseIntArray.put(C25493ixk.ActionBar.DlmWDR, 9);
    }

    public iHA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, isConnected, fetchVPNInfo));
    }

    public iHA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[5], (android.widget.LinearLayout) objArr[4], (android.view.View) objArr[3], (C27204jql) objArr[0], (android.widget.FrameLayout) objArr[1], (C52794wYp) objArr[9], (android.widget.LinearLayout) objArr[6], (android.widget.LinearLayout) objArr[7], (C55030xcJ) objArr[8], (ConstraintLayout) objArr[2]);
        this.DbNXlk = -1L;
        this.KWHzl.setTag(null);
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
