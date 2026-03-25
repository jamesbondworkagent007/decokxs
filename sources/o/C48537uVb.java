package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uVb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48537uVb extends AbstractC48536uVa {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts OLrzqt;
    public final LinearLayoutCompat djBIcL;
    public long gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        OLrzqt = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"trade_impl_bot_guide_smart_portfolio_desc"}, new int[]{1}, new int[]{C48033uCm.Activity.DcMfJKDDUqPf});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DDxOgT, 2);
        sparseIntArray.put(C48033uCm.Application.onContentScrollStopped, 3);
        sparseIntArray.put(C48033uCm.Application.hideForSystem, 4);
    }

    public C48537uVb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, OLrzqt, AhwBna));
    }

    public C48537uVb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (uTO) objArr[1], (C52466wMl) objArr[2], (C52459wMe) objArr[4], (C52477wMw) objArr[3]);
        this.gEmmrt = -1L;
        setContainedBinding(this.KWHzl);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.djBIcL = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 2L;
        }
        this.KWHzl.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.gEmmrt != 0) {
                return true;
            }
            return this.KWHzl.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.KWHzl.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return KWHzl((uTO) obj, i2);
    }

    public final boolean KWHzl(uTO uto, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.gEmmrt |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.KWHzl);
    }
}
