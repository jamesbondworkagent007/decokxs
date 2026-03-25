package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: renamed from: o.mGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31854mGj extends AbstractC31855mGk {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public final ConstraintLayout AYXKKw;
    public long gEmmrt;

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
        sparseIntArray.put(mDC.ActionBar.iwGUEr, 1);
        sparseIntArray.put(mDC.ActionBar.fBE, 2);
        sparseIntArray.put(mDC.ActionBar.zOIQXb, 3);
        sparseIntArray.put(mDC.ActionBar.dHguZz, 4);
    }

    public C31854mGj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, EZpvd, AhwBna));
    }

    public C31854mGj(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.gEmmrt = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
