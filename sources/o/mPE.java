package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C32113mPz;

/* JADX INFO: loaded from: classes8.dex */
public class mPE extends mPG {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C32113mPz.FragmentManager.DAIeex, 1);
        sparseIntArray.put(C32113mPz.FragmentManager.OqFWZa, 2);
        sparseIntArray.put(C32113mPz.FragmentManager.gkJEwt, 3);
        sparseIntArray.put(C32113mPz.FragmentManager.AxsJAYsNCnLh, 4);
        sparseIntArray.put(C32113mPz.FragmentManager.OHqIaq, 5);
        sparseIntArray.put(C32113mPz.FragmentManager.AEQbTJ, 6);
    }

    public mPE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, djBIcL));
    }

    public mPE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[6], (ConstraintLayout) objArr[0], (android.widget.TextView) objArr[3], (android.view.View) objArr[1], (android.view.View) objArr[4], (android.widget.ImageView) objArr[2], (android.view.View) objArr[5]);
        this.AhwBna = -1L;
        this.EZpvd.setTag(null);
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
