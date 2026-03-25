package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16842erZ extends AbstractC16841erY {
    public static final android.util.SparseIntArray EZpvd;
    public static final ViewDataBinding.IncludedLayouts OLrzqt;
    public long AYXKKw;
    public final ConstraintLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC16841erY
    public void KWHzl(@androidx.annotation.Nullable C15489eKf c15489eKf) {
        this.AEQbTJ = c15489eKf;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        OLrzqt = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"item_common_head", "item_pending"}, new int[]{1, 2}, new int[]{C13754dXa.TaskDescription.getStatusCode, C13754dXa.TaskDescription.GGlJim});
        EZpvd = null;
    }

    public C16842erZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, OLrzqt, EZpvd));
    }

    public C16842erZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (AbstractC16746epj) objArr[1], (AbstractC16867ery) objArr[2]);
        this.AYXKKw = -1L;
        setContainedBinding(this.copydefault);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.gEmmrt = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.KWHzl);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 8L;
        }
        this.copydefault.invalidateAll();
        this.KWHzl.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AYXKKw != 0) {
                return true;
            }
            return this.copydefault.hasPendingBindings() || this.KWHzl.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.AEQbTJ != i) {
            return false;
        }
        KWHzl((C15489eKf) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
        this.KWHzl.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return copydefault((AbstractC16867ery) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return AEQbTJ((AbstractC16746epj) obj, i2);
    }

    private boolean copydefault(AbstractC16867ery abstractC16867ery, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        return true;
    }

    private boolean AEQbTJ(AbstractC16746epj abstractC16746epj, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.copydefault);
        ViewDataBinding.executeBindingsOn(this.KWHzl);
    }
}
