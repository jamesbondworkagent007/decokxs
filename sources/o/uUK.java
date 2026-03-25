package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uUK extends uUN {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts values;
    public final ConstraintLayout AuCTel;
    public long fetchVPNInfo;
    public final NestedScrollView isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        values = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"trade_impl_explain_trailing_up_chart", "trade_impl_explain_trailing_down_chart"}, new int[]{2, 3}, new int[]{C48033uCm.Activity.XW, C48033uCm.Activity.DcMfJKfwDlxl});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.onTabReselected, 4);
        sparseIntArray.put(C48033uCm.Application.getContentDescription, 5);
        sparseIntArray.put(C48033uCm.Application.onTabSelected, 6);
        sparseIntArray.put(C48033uCm.Application.onDrawerClosed, 7);
        sparseIntArray.put(C48033uCm.Application.setText, 8);
        sparseIntArray.put(C48033uCm.Application.setPosition, 9);
        sparseIntArray.put(C48033uCm.Application.select, 10);
        sparseIntArray.put(C48033uCm.Application.ActionBarOnMenuVisibilityListener, 11);
        sparseIntArray.put(C48033uCm.Application.ActionBarNavigationMode, 12);
    }

    public uUK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, values, DbNXlk));
    }

    public uUK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (AppCompatImageView) objArr[11], (uUL) objArr[3], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[10], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[8], (uUO) objArr[2], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[7]);
        this.fetchVPNInfo = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.isConnected = nestedScrollView;
        nestedScrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.AuCTel = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.EZpvd);
        setContainedBinding(this.AhwBna);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 4L;
        }
        this.AhwBna.invalidateAll();
        this.EZpvd.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fetchVPNInfo != 0) {
                return true;
            }
            return this.AhwBna.hasPendingBindings() || this.EZpvd.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AhwBna.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return KWHzl((uUL) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return AEQbTJ((uUO) obj, i2);
    }

    public final boolean KWHzl(uUL uul, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.fetchVPNInfo |= 1;
        }
        return true;
    }

    public final boolean AEQbTJ(uUO uuo, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.fetchVPNInfo |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AhwBna);
        ViewDataBinding.executeBindingsOn(this.EZpvd);
    }
}
