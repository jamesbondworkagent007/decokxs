package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import o.C44105sDn;

/* JADX INFO: loaded from: classes10.dex */
public class sDC extends AbstractC44115sDx {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long AYXKKw;

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
        sparseIntArray.put(C44105sDn.ActionBar.RcXXUw, 1);
        sparseIntArray.put(C44105sDn.ActionBar.AYXKKw, 2);
        sparseIntArray.put(C44105sDn.ActionBar.aKErDB, 3);
        sparseIntArray.put(C44105sDn.ActionBar.AwvSrB, 4);
    }

    public sDC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, djBIcL, AhwBna));
    }

    public sDC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[2], new ViewStubProxy((android.view.ViewStub) objArr[4]), (android.widget.TextView) objArr[3], (ConstraintLayout) objArr[0], (oHK) objArr[1]);
        this.AYXKKw = -1L;
        this.EZpvd.setContainingBinding(this);
        this.OLrzqt.setTag(null);
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
        if (this.EZpvd.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.EZpvd.getBinding());
        }
    }
}
