package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17037evI extends AbstractC17039evK {
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public static final android.util.SparseIntArray djBIcL;
    public final android.widget.LinearLayout AhwBna;
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
        sparseIntArray.put(C13754dXa.ActionBar.DhEJvI, 1);
        sparseIntArray.put(C13754dXa.ActionBar.ijmTNW, 2);
        sparseIntArray.put(C13754dXa.ActionBar.onViewDetachedFromWindow, 3);
        sparseIntArray.put(C13754dXa.ActionBar.onViewAttachedToWindow, 4);
    }

    public C17037evI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, copydefault, djBIcL));
    }

    public C17037evI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55008xbo) objArr[2], (C55008xbo) objArr[1], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.valueOf = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AhwBna = linearLayout;
        linearLayout.setTag(null);
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
