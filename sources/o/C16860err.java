package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.err, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16860err extends AbstractC16861ers {
    public static final ViewDataBinding.IncludedLayouts KWHzl;
    public static final android.util.SparseIntArray OLrzqt;
    public final ConstraintLayout AhwBna;
    public long djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC16861ers
    public void EZpvd(@androidx.annotation.Nullable C15489eKf c15489eKf) {
        this.AEQbTJ = c15489eKf;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        KWHzl = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"item_common_head", "item_pending"}, new int[]{1, 2}, new int[]{C13754dXa.TaskDescription.getStatusCode, C13754dXa.TaskDescription.GGlJim});
        OLrzqt = null;
    }

    public C16860err(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, KWHzl, OLrzqt));
    }

    public C16860err(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (AbstractC16746epj) objArr[1], (AbstractC16867ery) objArr[2]);
        this.djBIcL = -1L;
        setContainedBinding(this.EZpvd);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.copydefault);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 8L;
        }
        this.EZpvd.invalidateAll();
        this.copydefault.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.djBIcL != 0) {
                return true;
            }
            return this.EZpvd.hasPendingBindings() || this.copydefault.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.AEQbTJ != i) {
            return false;
        }
        EZpvd((C15489eKf) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return OLrzqt((AbstractC16867ery) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return copydefault((AbstractC16746epj) obj, i2);
    }

    private boolean OLrzqt(AbstractC16867ery abstractC16867ery, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.djBIcL |= 1;
        }
        return true;
    }

    private boolean copydefault(AbstractC16746epj abstractC16746epj, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.djBIcL |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.EZpvd);
        ViewDataBinding.executeBindingsOn(this.copydefault);
    }
}
