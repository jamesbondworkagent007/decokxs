package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nMq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33971nMq extends AbstractC33969nMo {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long fetchVPNInfo;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.ODWQjV, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.DarRvM, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.OqFWZa, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.ffGIBT, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.gSBher, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.profile, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.scanPackages, 7);
    }

    public C33971nMq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, djBIcL));
    }

    public C33971nMq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (android.widget.ImageView) objArr[2], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[5], (C52794wYp) objArr[7], (android.widget.TextView) objArr[6]);
        this.fetchVPNInfo = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
