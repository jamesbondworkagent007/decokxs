package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: renamed from: o.mHb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31873mHb extends AbstractC31875mHd {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public long fetchVPNInfo;
    public final android.widget.FrameLayout values;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.DCUTEIddSDPG, 2);
        sparseIntArray.put(mDC.ActionBar.QHmsKR, 3);
        sparseIntArray.put(mDC.ActionBar.getNewProxyInstance, 4);
        sparseIntArray.put(mDC.ActionBar.gwTjWJ, 5);
        sparseIntArray.put(mDC.ActionBar.hDKMBd, 6);
        sparseIntArray.put(mDC.ActionBar.DTg, 7);
        sparseIntArray.put(mDC.ActionBar.getPriority, 8);
        sparseIntArray.put(mDC.ActionBar.AubY, 9);
        sparseIntArray.put(mDC.ActionBar.fBE, 10);
    }

    public C31873mHb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, DbNXlk, AkhnZx));
    }

    public C31873mHb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[6], (ConstraintLayout) objArr[9], (ConstraintLayout) objArr[3], (android.widget.ImageView) objArr[5], (android.view.View) objArr[2], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[10]);
        this.fetchVPNInfo = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.values = frameLayout;
        frameLayout.setTag(null);
        this.gEmmrt.setTag(null);
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
            C31908mIj.KWHzl(this.gEmmrt, 2);
        }
    }
}
