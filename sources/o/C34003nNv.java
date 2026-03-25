package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nNv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C34003nNv extends AbstractC34000nNs {
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public static final android.util.SparseIntArray OLrzqt;
    public long EZpvd;

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
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.sElUiK, 1);
    }

    public C34003nNv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, KWHzl, OLrzqt));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C34003nNv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        java.lang.Object obj = objArr[1];
        super(dataBindingComponent, view, 0, constraintLayout, obj != null ? nKZ.EZpvd((android.view.View) obj) : null);
        this.EZpvd = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.EZpvd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.EZpvd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.EZpvd = 0L;
        }
    }
}
