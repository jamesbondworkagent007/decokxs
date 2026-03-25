package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nMx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33978nMx extends AbstractC33975nMu {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long AhwBna;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.SdSTJp, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.SePrCP, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.RIuxYh, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.iwGUEr, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.aKErDB, 5);
    }

    public C33978nMx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, gEmmrt));
    }

    public C33978nMx(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[4], (C52794wYp) objArr[5], (ConstraintLayout) objArr[0], (C35893oHp) objArr[3], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2]);
        this.AhwBna = -1L;
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
