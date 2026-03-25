package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: renamed from: o.mGm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31857mGm extends AbstractC31856mGl {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final android.widget.FrameLayout AkhnZx;
    public long values;

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
        sparseIntArray.put(mDC.ActionBar.DCUTEIddSDPG, 1);
        sparseIntArray.put(mDC.ActionBar.gHZMYf, 2);
        sparseIntArray.put(mDC.ActionBar.zAEkPU, 3);
        sparseIntArray.put(mDC.ActionBar.tIwhY, 4);
        sparseIntArray.put(mDC.ActionBar.hvKCwS, 5);
        sparseIntArray.put(mDC.ActionBar.iPSTqm, 6);
        sparseIntArray.put(mDC.ActionBar.zDUObI, 7);
        sparseIntArray.put(mDC.ActionBar.dNCPSb, 8);
        sparseIntArray.put(mDC.ActionBar.UeEOUB, 9);
    }

    public C31857mGm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, gEmmrt, fetchVPNInfo));
    }

    public C31857mGm(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[2], (android.widget.TextView) objArr[9], (ConstraintLayout) objArr[8], (android.view.View) objArr[1], (android.widget.TextView) objArr[6], (ConstraintLayout) objArr[5], (android.widget.ImageView) objArr[4], (ConstraintLayout) objArr[3], (android.widget.TextView) objArr[7]);
        this.values = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.AkhnZx = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
