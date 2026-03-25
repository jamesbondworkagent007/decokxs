package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uNE extends uNG {
    public static final ViewDataBinding.IncludedLayouts KWHzl;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final ConstraintLayout AhwBna;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        KWHzl = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"trade_impl_rsi_settings_layout"}, new int[]{2}, new int[]{C48033uCm.Activity.FSMca});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.zNQIcI, 3);
        sparseIntArray.put(C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl, 4);
    }

    public uNE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, KWHzl, valueOf));
    }

    public uNE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (C52702wVe) objArr[3], (uWI) objArr[2], (C52702wVe) objArr[4], (C52701wVd) objArr[1]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.AEQbTJ);
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 2L;
        }
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AYXKKw != 0) {
                return true;
            }
            return this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return KWHzl((uWI) obj, i2);
    }

    public final boolean KWHzl(uWI uwi, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
