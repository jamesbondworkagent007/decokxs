package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: renamed from: o.mHf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31877mHf extends AbstractC31872mHa {
    public static final android.util.SparseIntArray ejfBZ;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long fIwbmz;

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
        ejfBZ = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.valueOf, 2);
        sparseIntArray.put(mDC.ActionBar.DCUTEIddSDPG, 3);
        sparseIntArray.put(mDC.ActionBar.QHmsKR, 4);
        sparseIntArray.put(mDC.ActionBar.AxsJAYsNCnLh, 5);
        sparseIntArray.put(mDC.ActionBar.gwTjWJ, 6);
        sparseIntArray.put(mDC.ActionBar.DLWbHP, 7);
        sparseIntArray.put(mDC.ActionBar.QwvEab, 8);
        sparseIntArray.put(mDC.ActionBar.DGUQLIOvDItG, 9);
        sparseIntArray.put(mDC.ActionBar.OHqIaq, 10);
        sparseIntArray.put(mDC.ActionBar.DGUQLIdZmdUa, 11);
        sparseIntArray.put(mDC.ActionBar.DGgnkA, 12);
        sparseIntArray.put(mDC.ActionBar.UrRBLY, 13);
        sparseIntArray.put(mDC.ActionBar.fBE, 14);
        sparseIntArray.put(mDC.ActionBar.hBpjJd, 15);
    }

    public C31877mHf(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fJNWhG, ejfBZ));
    }

    public C31877mHf(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[2], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[4], (android.widget.ImageView) objArr[15], (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[10], (android.widget.ImageView) objArr[7], (ConstraintLayout) objArr[8], (android.view.View) objArr[3], (ConstraintLayout) objArr[13], (ConstraintLayout) objArr[12], (C31909mIk) objArr[0], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[11]);
        this.fIwbmz = -1L;
        this.AkhnZx.setTag(null);
        this.fetchVPNInfo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.fIwbmz;
            this.fIwbmz = 0L;
        }
        if ((j & 1) != 0) {
            C31908mIj.KWHzl(this.fetchVPNInfo, 2);
        }
    }
}
