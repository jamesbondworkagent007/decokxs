package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nIB extends AbstractC33870nIx {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final ConstraintLayout AhwBna;
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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.uzCIH, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.sanitizeSessionIdIgnoreCase, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.gbIfDn, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.accept, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.OeZisf, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.QYNZmZ, 6);
    }

    public nIB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, gEmmrt, AYXKKw));
    }

    public nIB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C37158ooZ) objArr[1], (LinearLayoutCompat) objArr[4], (C37213opb) objArr[3], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (C37212opa) objArr[2]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
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
