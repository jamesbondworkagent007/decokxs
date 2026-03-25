package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.iMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23874iMn extends AbstractC23869iMi {
    public static final android.util.SparseIntArray AhwBna = null;
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public long gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C23874iMn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 4, copydefault, AhwBna));
    }

    public C23874iMn(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C52794wYp) objArr[3], (android.widget.ImageView) objArr[0], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1]);
        this.gEmmrt = -1L;
        this.EZpvd.setTag(null);
        this.KWHzl.setTag(null);
        this.AEQbTJ.setTag(null);
        this.OLrzqt.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
