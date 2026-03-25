package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.vdJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50920vdJ extends AbstractC50919vdI {
    public static final android.util.SparseIntArray AhwBna = null;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AYXKKw;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C50920vdJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 6, gEmmrt, AhwBna));
    }

    public C50920vdJ(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[2], (C47988uAv) objArr[1], (C53420wlE) objArr[0], (android.widget.TextView) objArr[3], (android.widget.Space) objArr[5]);
        this.AYXKKw = -1L;
        this.OLrzqt.setTag(null);
        this.KWHzl.setTag(null);
        this.EZpvd.setTag(null);
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.valueOf.setTag(null);
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
