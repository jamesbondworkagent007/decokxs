package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.vdX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50934vdX extends AbstractC50936vdZ {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray KWHzl = null;
    public long AYXKKw;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C50934vdX(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 3, AEQbTJ, KWHzl));
    }

    public C50934vdX(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (wPT) objArr[1], (C55173xeu) objArr[2], (android.widget.TextView) objArr[0]);
        this.AYXKKw = -1L;
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(viewArr);
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
