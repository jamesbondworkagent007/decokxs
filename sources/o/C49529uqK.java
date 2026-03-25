package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.uqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49529uqK extends AbstractC49530uqL {
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public static final android.util.SparseIntArray OLrzqt = null;
    public long KWHzl;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C49529uqK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 1, EZpvd, OLrzqt));
    }

    public C49529uqK(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C55052xcf) objArr[0]);
        this.KWHzl = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.KWHzl = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.KWHzl != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.KWHzl = 0L;
        }
    }
}
