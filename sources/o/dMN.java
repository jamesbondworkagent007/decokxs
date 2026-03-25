package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import o.dLX;

/* JADX INFO: loaded from: classes4.dex */
public class dMN extends dMH {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ;
    public static final android.util.SparseIntArray gEmmrt;
    public final android.widget.LinearLayout AhwBna;
    public long djBIcL;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        AEQbTJ = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_select_wallet_notice"}, new int[]{2}, new int[]{dLX.Fragment.wlaJM});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        gEmmrt = sparseIntArray;
        sparseIntArray.put(dLX.Application.akftKQ, 3);
        sparseIntArray.put(dLX.Application.OLrzqt, 4);
    }

    public dMN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, AEQbTJ, gEmmrt));
    }

    public dMN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[4], (dMP) objArr[2], (android.widget.FrameLayout) objArr[1], (android.widget.TextView) objArr[3]);
        this.djBIcL = -1L;
        setContainedBinding(this.copydefault);
        this.EZpvd.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AhwBna = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 2L;
        }
        this.copydefault.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.djBIcL != 0) {
                return true;
            }
            return this.copydefault.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return AEQbTJ((dMP) obj, i2);
    }

    private boolean AEQbTJ(dMP dmp, int i) {
        if (i != dLZ.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.djBIcL |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.copydefault);
    }
}
