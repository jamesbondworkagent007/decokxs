package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.urb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49599urb extends AbstractC49540uqV {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final android.widget.LinearLayout djBIcL;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C49511upt.Application.hBpjJd, 1);
        sparseIntArray.put(C49511upt.Application.AxsJAY, 2);
        sparseIntArray.put(C49511upt.Application.dvKsVJ, 3);
        sparseIntArray.put(C49511upt.Application.getPostValueLengthLimit, 4);
        sparseIntArray.put(C49511upt.Application.getNewProxyInstance, 5);
        sparseIntArray.put(C49511upt.Application.iwGUEr, 6);
    }

    public C49599urb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AYXKKw, gEmmrt));
    }

    public C49599urb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C54984xbQ) objArr[6], (C54984xbQ) objArr[5], (android.widget.LinearLayout) objArr[2], (android.widget.LinearLayout) objArr[3], (android.widget.LinearLayout) objArr[4], (android.widget.LinearLayout) objArr[1]);
        this.valueOf = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.djBIcL = linearLayout;
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
