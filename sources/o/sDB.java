package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import o.C44105sDn;

/* JADX INFO: loaded from: classes10.dex */
public class sDB extends AbstractC44117sDz {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long djBIcL;

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
        sparseIntArray.put(C44105sDn.ActionBar.RcXXUw, 1);
        sparseIntArray.put(C44105sDn.ActionBar.AYXKKw, 2);
        sparseIntArray.put(C44105sDn.ActionBar.aKErDB, 3);
        sparseIntArray.put(C44105sDn.ActionBar.AwvSrB, 4);
    }

    public sDB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, AYXKKw, gEmmrt));
    }

    public sDB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[2], new ViewStubProxy((android.view.ViewStub) objArr[4]), (android.widget.TextView) objArr[3], (ConstraintLayout) objArr[0], (oHK) objArr[1]);
        this.djBIcL = -1L;
        this.KWHzl.setContainingBinding(this);
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
        if (this.KWHzl.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.KWHzl.getBinding());
        }
    }
}
