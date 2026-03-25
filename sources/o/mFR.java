package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public class mFR extends mFQ {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AYXKKw;
    public final android.widget.FrameLayout valueOf;

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
        AhwBna = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.DCUTEIddSDPG, 1);
        sparseIntArray.put(mDC.ActionBar.fJNWhG, 2);
        sparseIntArray.put(mDC.ActionBar.gwTjWJ, 3);
        sparseIntArray.put(mDC.ActionBar.AuCTel, 4);
        sparseIntArray.put(mDC.ActionBar.DIIpTV, 5);
        sparseIntArray.put(mDC.ActionBar.zhUgOk, 6);
    }

    public mFR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, gEmmrt, AhwBna));
    }

    public mFR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[2], (android.widget.ImageView) objArr[3], (android.view.View) objArr[1], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5]);
        this.AYXKKw = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.valueOf = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
