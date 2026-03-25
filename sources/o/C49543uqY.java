package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49543uqY extends AbstractC49541uqW {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
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
        sparseIntArray.put(C49511upt.Application.DGgnkA, 1);
        sparseIntArray.put(C49511upt.Application.sSMYrx, 2);
        sparseIntArray.put(C49511upt.Application.QVAiDq, 3);
        sparseIntArray.put(C49511upt.Application.dNCPSb, 4);
        sparseIntArray.put(C49511upt.Application.wlaJM, 5);
    }

    public C49543uqY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AYXKKw, djBIcL));
    }

    public C49543uqY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[5], (android.widget.LinearLayout) objArr[2], (android.widget.FrameLayout) objArr[3], (android.widget.FrameLayout) objArr[4], (NestedScrollView) objArr[1]);
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
