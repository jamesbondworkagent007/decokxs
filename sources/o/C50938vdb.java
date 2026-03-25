package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50938vdb extends AbstractC50937vda {
    public static final android.util.SparseIntArray KWHzl;
    public static final ViewDataBinding.IncludedLayouts OLrzqt = null;
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
        KWHzl = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.aBDePw, 1);
        sparseIntArray.put(C48033uCm.Application.UCQKYV, 2);
    }

    public C50938vdb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, OLrzqt, KWHzl));
    }

    public C50938vdb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[2], (android.view.View) objArr[1], (android.widget.LinearLayout) objArr[0]);
        this.AYXKKw = -1L;
        this.copydefault.setTag(null);
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
