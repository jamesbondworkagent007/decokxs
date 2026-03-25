package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23811iKe extends AbstractC23810iKd {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.FhERFw, 1);
        sparseIntArray.put(C25493ixk.ActionBar.UkuJRw, 2);
        sparseIntArray.put(C25493ixk.ActionBar.zeUJxr, 3);
        sparseIntArray.put(C25493ixk.ActionBar.onServiceConnected, 4);
        sparseIntArray.put(C25493ixk.ActionBar.alsFma, 5);
        sparseIntArray.put(C25493ixk.ActionBar.Ufzxmz, 6);
    }

    public C23811iKe(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AhwBna, djBIcL));
    }

    public C23811iKe(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[6], (android.widget.TextView) objArr[5], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[4], (ConstraintLayout) objArr[2]);
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
