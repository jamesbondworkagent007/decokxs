package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16412ejT extends AbstractC16410ejR {
    public static final ViewDataBinding.IncludedLayouts KWHzl;
    public static final android.util.SparseIntArray OLrzqt;
    public long EZpvd;
    public final ConstraintLayout valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        KWHzl = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"appbar_select_coin"}, new int[]{1}, new int[]{C13754dXa.TaskDescription.call});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.gCNefq, 2);
    }

    public C16412ejT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, KWHzl, OLrzqt));
    }

    public C16412ejT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (AbstractC16413ejU) objArr[1], (android.widget.FrameLayout) objArr[2]);
        this.EZpvd = -1L;
        setContainedBinding(this.copydefault);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.valueOf = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.EZpvd = 2L;
        }
        this.copydefault.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.EZpvd != 0) {
                return true;
            }
            return this.copydefault.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return KWHzl((AbstractC16413ejU) obj, i2);
    }

    private boolean KWHzl(AbstractC16413ejU abstractC16413ejU, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.EZpvd |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.EZpvd;
            this.EZpvd = 0L;
        }
        if ((j & 2) != 0) {
            ViewBindingAdapter.setPaddingTop(this.valueOf, C33570myu.AEQbTJ(getRoot().getContext()));
        }
        ViewDataBinding.executeBindingsOn(this.copydefault);
    }
}
