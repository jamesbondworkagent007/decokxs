package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uVB extends AbstractC48561uVz {
    public static final ViewDataBinding.IncludedLayouts OLrzqt = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final ConstraintLayout AhwBna;
    public long valueOf;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.RFmUsE, 1);
        sparseIntArray.put(C48033uCm.Application.RLmrWm, 2);
        sparseIntArray.put(C48033uCm.Application.DcMfJKsfEqpH, 3);
        sparseIntArray.put(C48033uCm.Application.fmB, 4);
    }

    public uVB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, OLrzqt, gEmmrt));
    }

    public uVB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYF) objArr[4], (C51969vwz) objArr[3], (RecyclerView) objArr[2], (NestedScrollView) objArr[1]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
