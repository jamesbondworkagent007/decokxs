package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nMv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33976nMv extends AbstractC33974nMt {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray AhwBna;
    public long valueOf;

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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.SdSTJp, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.SePrCP, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.RIuxYh, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.iwGUEr, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.DAIeex, 5);
    }

    public C33976nMv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AYXKKw, AhwBna));
    }

    public C33976nMv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[4], (C52794wYp) objArr[5], (ConstraintLayout) objArr[0], (C35893oHp) objArr[3], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2]);
        this.valueOf = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
