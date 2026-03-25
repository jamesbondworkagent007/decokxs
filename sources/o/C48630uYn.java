package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.uYn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48630uYn extends AbstractC48634uYr {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray OLrzqt = null;
    public long djBIcL;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C48630uYn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 3, AEQbTJ, OLrzqt));
    }

    public C48630uYn(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C52794wYp) objArr[2], (RecyclerView) objArr[1], (C55258xgZ) objArr[0]);
        this.djBIcL = -1L;
        this.EZpvd.setTag(null);
        this.copydefault.setTag(null);
        this.KWHzl.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
