package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uYJ extends uYK {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts valueOf;
    public final ConstraintLayout AkhnZx;
    public long isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        valueOf = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"trade_impl_rsi_settings_layout"}, new int[]{2}, new int[]{C48033uCm.Activity.FSMca});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.flVtFt, 3);
        sparseIntArray.put(C48033uCm.Application.zNQIcI, 4);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatResultReceiverWrapper1, 5);
        sparseIntArray.put(C48033uCm.Application.syncState, 6);
        sparseIntArray.put(C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl, 7);
        sparseIntArray.put(C48033uCm.Application.DeprecatedSinceApi, 8);
        sparseIntArray.put(C48033uCm.Application.sILrnl, 9);
    }

    public uYJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, valueOf, DbNXlk));
    }

    public uYJ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (C33537myN) objArr[3], (C52794wYp) objArr[9], (C52702wVe) objArr[4], (C52702wVe) objArr[5], (uWI) objArr[2], (C52702wVe) objArr[7], (C52701wVd) objArr[1], (C52702wVe) objArr[8], (C47988uAv) objArr[6]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.EZpvd);
        this.gEmmrt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 2L;
        }
        this.EZpvd.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.isConnected != 0) {
                return true;
            }
            return this.EZpvd.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return copydefault((uWI) obj, i2);
    }

    private boolean copydefault(uWI uwi, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.EZpvd);
    }
}
