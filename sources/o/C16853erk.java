package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16853erk extends AbstractC16857ero {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts copydefault;
    public long AhwBna;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC16857ero
    public void KWHzl(@androidx.annotation.Nullable C15489eKf c15489eKf) {
        this.AEQbTJ = c15489eKf;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        copydefault = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"item_common_head", "item_pending"}, new int[]{1, 2}, new int[]{C13754dXa.TaskDescription.getStatusCode, C13754dXa.TaskDescription.GGlJim});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.fbC, 3);
    }

    public C16853erk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, copydefault, AYXKKw));
    }

    public C16853erk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (RecyclerView) objArr[3], (AbstractC16746epj) objArr[1], (AbstractC16867ery) objArr[2]);
        this.AhwBna = -1L;
        setContainedBinding(this.OLrzqt);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.valueOf = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.EZpvd);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 8L;
        }
        this.OLrzqt.invalidateAll();
        this.EZpvd.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AhwBna != 0) {
                return true;
            }
            return this.OLrzqt.hasPendingBindings() || this.EZpvd.hasPendingBindings();
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
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return OLrzqt((AbstractC16867ery) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return EZpvd((AbstractC16746epj) obj, i2);
    }

    public final boolean OLrzqt(AbstractC16867ery abstractC16867ery, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AhwBna |= 1;
        }
        return true;
    }

    public final boolean EZpvd(AbstractC16746epj abstractC16746epj, int i) {
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
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
        ViewDataBinding.executeBindingsOn(this.EZpvd);
    }
}
