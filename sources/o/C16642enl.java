package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16642enl extends AbstractC16641enk {
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final android.widget.LinearLayout AYXKKw;
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
        sparseIntArray.put(C13754dXa.ActionBar.DzCpqu, 1);
        sparseIntArray.put(C13754dXa.ActionBar.extraCallbackWithResult, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ibnZAm, 3);
        sparseIntArray.put(C13754dXa.ActionBar.fkESqH, 4);
    }

    public C16642enl(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, copydefault, gEmmrt));
    }

    public C16642enl(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C57468yiw) objArr[4], (android.widget.LinearLayout) objArr[3], (android.widget.LinearLayout) objArr[1], (android.widget.LinearLayout) objArr[2]);
        this.AhwBna = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AYXKKw = linearLayout;
        linearLayout.setTag(null);
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
