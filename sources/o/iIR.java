package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iIR extends iIQ {
    public static final ViewDataBinding.IncludedLayouts isConnected;
    public static final android.util.SparseIntArray values;
    public long ejfBZ;
    public final ConstraintLayout fJNWhG;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        isConnected = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_invest_network_fees"}, new int[]{2}, new int[]{C25493ixk.Activity.UscePu});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        values = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.fMBJsc, 3);
        sparseIntArray.put(C25493ixk.ActionBar.gdmIOq, 4);
        sparseIntArray.put(C25493ixk.ActionBar.DQzvGNdrmXxu, 5);
        sparseIntArray.put(C25493ixk.ActionBar.DrqXHJ, 6);
        sparseIntArray.put(C25493ixk.ActionBar.DTg, 7);
        sparseIntArray.put(C25493ixk.ActionBar.gmHjFq, 8);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21, 9);
        sparseIntArray.put(C25493ixk.ActionBar.awiJhF, 10);
        sparseIntArray.put(C25493ixk.ActionBar.fbC, 11);
        sparseIntArray.put(C25493ixk.ActionBar.getActiveNotifications, 12);
        sparseIntArray.put(C25493ixk.ActionBar.SaJVGb, 13);
    }

    public iIR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, isConnected, values));
    }

    public iIR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[8], (android.view.View) objArr[7], (AppCompatImageView) objArr[6], (ConstraintLayout) objArr[10], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (C27302jsd) objArr[11], (AppCompatImageView) objArr[3], (C27208jqp) objArr[1], (AbstractC23809iKc) objArr[2], (android.widget.Space) objArr[13], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[9]);
        this.ejfBZ = -1L;
        this.gEmmrt.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fJNWhG = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.AhwBna);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 2L;
        }
        this.AhwBna.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.ejfBZ != 0) {
                return true;
            }
            return this.AhwBna.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AhwBna.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return AEQbTJ((AbstractC23809iKc) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC23809iKc abstractC23809iKc, int i) {
        if (i != C25488ixf.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.ejfBZ |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AhwBna);
    }
}
