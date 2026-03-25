package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.urr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49615urr extends AbstractC49614urq {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray djBIcL;
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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C49511upt.Application.UscePu, 1);
        sparseIntArray.put(C49511upt.Application.DGUQLIhJrIAr, 2);
        sparseIntArray.put(C49511upt.Application.UlJrfe, 3);
        sparseIntArray.put(C49511upt.Application.QwvEab, 4);
        sparseIntArray.put(C49511upt.Application.dUDNAs, 5);
        sparseIntArray.put(C49511upt.Application.aUsmxb, 6);
    }

    public C49615urr(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AYXKKw, djBIcL));
    }

    public C49615urr(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[4], (android.view.View) objArr[3], (android.view.View) objArr[5], (android.widget.TextView) objArr[6], (wYK) objArr[1], (android.widget.TextView) objArr[2], (android.widget.LinearLayout) objArr[0]);
        this.valueOf = -1L;
        this.AhwBna.setTag(null);
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
