package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48316uMz extends AbstractC48315uMy {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts djBIcL;
    public long fetchVPNInfo;
    public final ConstraintLayout values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        djBIcL = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"trade_impl_rsi_settings_layout"}, new int[]{2}, new int[]{C48033uCm.Activity.FSMca});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.flVtFt, 3);
        sparseIntArray.put(C48033uCm.Application.zNQIcI, 4);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatResultReceiverWrapper1, 5);
        sparseIntArray.put(C48033uCm.Application.PickVisualMediaRequestBuilder, 6);
        sparseIntArray.put(C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl, 7);
        sparseIntArray.put(C48033uCm.Application.sILrnl, 8);
    }

    public C48316uMz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, AhwBna));
    }

    public C48316uMz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (C33537myN) objArr[3], (C52794wYp) objArr[8], (C52702wVe) objArr[4], (C52702wVe) objArr[5], (C52702wVe) objArr[7], (C52701wVd) objArr[1], (uWI) objArr[2], (C47988uAv) objArr[6]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        this.gEmmrt.setTag(null);
        setContainedBinding(this.valueOf);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 2L;
        }
        this.valueOf.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fetchVPNInfo != 0) {
                return true;
            }
            return this.valueOf.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.valueOf.setLifecycleOwner(lifecycleOwner);
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
            this.fetchVPNInfo |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.valueOf);
    }
}
