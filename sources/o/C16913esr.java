package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16913esr extends AbstractC16905esj {
    public static final ViewDataBinding.IncludedLayouts EZpvd;
    public static final android.util.SparseIntArray KWHzl;
    public final ConstraintLayout AYXKKw;
    public long AhwBna;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC16905esj
    public void copydefault(@androidx.annotation.Nullable C15489eKf c15489eKf) {
        this.copydefault = c15489eKf;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        EZpvd = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"item_common_head", "item_pending"}, new int[]{1, 2}, new int[]{C13754dXa.TaskDescription.getStatusCode, C13754dXa.TaskDescription.GGlJim});
        KWHzl = null;
    }

    public C16913esr(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, EZpvd, KWHzl));
    }

    public C16913esr(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (AbstractC16746epj) objArr[1], (AbstractC16867ery) objArr[2]);
        this.AhwBna = -1L;
        setContainedBinding(this.AEQbTJ);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.OLrzqt);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 8L;
        }
        this.AEQbTJ.invalidateAll();
        this.OLrzqt.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AhwBna != 0) {
                return true;
            }
            return this.AEQbTJ.hasPendingBindings() || this.OLrzqt.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.AEQbTJ != i) {
            return false;
        }
        copydefault((C15489eKf) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
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
            this.AhwBna |= 1;
        }
        return true;
    }

    private boolean copydefault(AbstractC16746epj abstractC16746epj, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AhwBna |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
    }
}
