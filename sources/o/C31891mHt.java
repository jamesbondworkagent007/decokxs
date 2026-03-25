package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.mDC;

/* JADX INFO: renamed from: o.mHt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31891mHt extends AbstractC31883mHl {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray valueOf;
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
        valueOf = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.aKErDB, 1);
        sparseIntArray.put(mDC.ActionBar.RKcVTr, 2);
        sparseIntArray.put(mDC.ActionBar.hCLrkq, 3);
        sparseIntArray.put(mDC.ActionBar.DGOPHZDGOPHZ, 4);
        sparseIntArray.put(mDC.ActionBar.DBxZfM, 5);
        sparseIntArray.put(mDC.ActionBar.QVsKAR, 6);
        sparseIntArray.put(mDC.ActionBar.aUsmxb, 7);
    }

    public C31891mHt(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, valueOf));
    }

    public C31891mHt(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (C55173xeu) objArr[1], (android.widget.FrameLayout) objArr[6], (C55113xdn) objArr[7], (RecyclerView) objArr[5], (C33603mza) objArr[4], (C57869yqZ) objArr[3], (C55237xgE) objArr[2]);
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
