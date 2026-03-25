package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uUM extends uUL {
    public static final android.util.SparseIntArray ejfBZ;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo;
    public final ConstraintLayout AuCTel;
    public long fARcdN;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        fetchVPNInfo = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"trade_impl_explain_trailing_chart_classify"}, new int[]{1}, new int[]{C48033uCm.Activity.DcMfJKsgNvtZ});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        ejfBZ = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.ActionBarOnNavigationListener, 2);
        sparseIntArray.put(C48033uCm.Application.getVolumeAttributes, 3);
        sparseIntArray.put(C48033uCm.Application.isCaptioningEnabled, 4);
        sparseIntArray.put(C48033uCm.Application.getTag, 5);
        sparseIntArray.put(C48033uCm.Application.skipToQueueItem, 6);
        sparseIntArray.put(C48033uCm.Application.ZAwExL, 7);
        sparseIntArray.put(C48033uCm.Application.OfWYUE, 8);
        sparseIntArray.put(C48033uCm.Application.ZNPcth, 9);
        sparseIntArray.put(C48033uCm.Application.ijmTNW, 10);
        sparseIntArray.put(C48033uCm.Application.ZGRCNj, 11);
        sparseIntArray.put(C48033uCm.Application.setTabListener, 12);
        sparseIntArray.put(C48033uCm.Application.getToolbarNavigationClickListener, 13);
        sparseIntArray.put(C48033uCm.Application.getThemeUpIndicator, 14);
    }

    public uUM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, fetchVPNInfo, ejfBZ));
    }

    public uUM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (uUH) objArr[1], (AppCompatTextView) objArr[8], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[10], (android.widget.RelativeLayout) objArr[9], (AppCompatTextView) objArr[5], (android.widget.RelativeLayout) objArr[3], (AppCompatImageView) objArr[4], (android.widget.RelativeLayout) objArr[6], (AppCompatImageView) objArr[2], (android.widget.RelativeLayout) objArr[12], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[13]);
        this.fARcdN = -1L;
        setContainedBinding(this.AEQbTJ);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AuCTel = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 2L;
        }
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fARcdN != 0) {
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
        return copydefault((uUH) obj, i2);
    }

    public final boolean copydefault(uUH uuh, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
