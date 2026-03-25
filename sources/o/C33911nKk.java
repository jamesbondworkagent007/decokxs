package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33911nKk extends AbstractC33912nKl {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public long AYXKKw;
    public final ConstraintLayout valueOf;

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
        sparseIntArray.put(C35399nuc.StateListAnimator.fetchVPNInfo, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.geAOna, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.ibnZAm, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.QMuEJi, 4);
    }

    public C33911nKk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, KWHzl, AhwBna));
    }

    public C33911nKk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C33604mzb) objArr[4], (RecyclerView) objArr[3], (C33546myW) objArr[2]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.valueOf = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
