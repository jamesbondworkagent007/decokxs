package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: renamed from: o.mGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31848mGd extends AbstractC31852mGh {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public final ConstraintLayout isConnected;
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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.DCUTEIddSDPG, 2);
        sparseIntArray.put(mDC.ActionBar.zAEkPU, 3);
        sparseIntArray.put(mDC.ActionBar.DCJXGO, 4);
        sparseIntArray.put(mDC.ActionBar.vLaW, 5);
        sparseIntArray.put(mDC.ActionBar.UlJrfe, 6);
        sparseIntArray.put(mDC.ActionBar.zDUObI, 7);
        sparseIntArray.put(mDC.ActionBar.UrRBLY, 8);
        sparseIntArray.put(mDC.ActionBar.DWgRXt, 9);
    }

    public C31848mGd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, AkhnZx));
    }

    public C31848mGd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[4], (android.widget.ImageView) objArr[6], (android.view.View) objArr[2], (android.widget.TextView) objArr[9], (ConstraintLayout) objArr[8], (android.widget.TextView) objArr[1], (android.widget.ImageView) objArr[5], (ConstraintLayout) objArr[3], (android.widget.TextView) objArr[7]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        this.AhwBna.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.values;
            this.values = 0L;
        }
        if ((j & 1) != 0) {
            C31908mIj.KWHzl(this.AhwBna, 2);
        }
    }
}
