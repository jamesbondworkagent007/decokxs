package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public class mFU extends mFO {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final android.widget.FrameLayout AkhnZx;
    public long fetchVPNInfo;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.DCUTEIddSDPG, 2);
        sparseIntArray.put(mDC.ActionBar.gHZMYf, 3);
        sparseIntArray.put(mDC.ActionBar.zAEkPU, 4);
        sparseIntArray.put(mDC.ActionBar.swzYdv, 5);
        sparseIntArray.put(mDC.ActionBar.vLaW, 6);
        sparseIntArray.put(mDC.ActionBar.zDUObI, 7);
        sparseIntArray.put(mDC.ActionBar.UrRBLY, 8);
        sparseIntArray.put(mDC.ActionBar.DWgRXt, 9);
        sparseIntArray.put(mDC.ActionBar.spnCvw, 10);
    }

    public mFU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, isConnected, DbNXlk));
    }

    public mFU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[10], (android.view.View) objArr[2], (android.widget.TextView) objArr[9], (ConstraintLayout) objArr[8], (android.widget.TextView) objArr[1], (ConstraintLayout) objArr[5], (android.widget.ImageView) objArr[6], (ConstraintLayout) objArr[4], (android.widget.TextView) objArr[7]);
        this.fetchVPNInfo = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.AkhnZx = frameLayout;
        frameLayout.setTag(null);
        this.AYXKKw.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.fetchVPNInfo;
            this.fetchVPNInfo = 0L;
        }
        if ((j & 1) != 0) {
            C31908mIj.KWHzl(this.AYXKKw, 2);
        }
    }
}
