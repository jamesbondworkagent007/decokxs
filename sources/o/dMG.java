package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.dLX;

/* JADX INFO: loaded from: classes4.dex */
public class dMG extends dMK {
    public static final ViewDataBinding.IncludedLayouts AkhnZx;
    public static final android.util.SparseIntArray values;
    public final android.widget.LinearLayout DbNXlk;
    public long fetchVPNInfo;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(11);
        AkhnZx = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_select_wallet_notice"}, new int[]{1}, new int[]{dLX.Fragment.wlaJM});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        values = sparseIntArray;
        sparseIntArray.put(dLX.Application.gkJEwt, 2);
        sparseIntArray.put(dLX.Application.EZpvd, 3);
        sparseIntArray.put(dLX.Application.KWHzl, 4);
        sparseIntArray.put(dLX.Application.AEQbTJ, 5);
        sparseIntArray.put(dLX.Application.gEmmrt, 6);
        sparseIntArray.put(dLX.Application.valueOf, 7);
        sparseIntArray.put(dLX.Application.djBIcL, 8);
        sparseIntArray.put(dLX.Application.fARcdN, 9);
        sparseIntArray.put(dLX.Application.iwGUEr, 10);
    }

    public dMG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, AkhnZx, values));
    }

    public dMG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[7], (android.widget.LinearLayout) objArr[6], (wYC) objArr[8], (android.widget.TextView) objArr[9], (android.widget.ImageView) objArr[10], (dMP) objArr[1], (ConstraintLayout) objArr[2]);
        this.fetchVPNInfo = -1L;
        setContainedBinding(this.djBIcL);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.DbNXlk = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 2L;
        }
        this.djBIcL.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fetchVPNInfo != 0) {
                return true;
            }
            return this.djBIcL.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.djBIcL.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return AEQbTJ((dMP) obj, i2);
    }

    public final boolean AEQbTJ(dMP dmp, int i) {
        if (i != dLZ.AEQbTJ) {
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
        ViewDataBinding.executeBindingsOn(this.djBIcL);
    }
}
