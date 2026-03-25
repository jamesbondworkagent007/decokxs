package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16426ejh extends AbstractC16421ejc {
    public static final ViewDataBinding.IncludedLayouts OLrzqt;
    public static final android.util.SparseIntArray valueOf;
    public final ConstraintLayout AYXKKw;
    public long AhwBna;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        OLrzqt = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"appbar_select_coin"}, new int[]{2}, new int[]{C13754dXa.TaskDescription.call});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.fAklCm, 1);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatApi24TransportControls, 3);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKOmnske, 4);
    }

    public C16426ejh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, OLrzqt, valueOf));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16426ejh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        AbstractC16413ejU abstractC16413ejU = (AbstractC16413ejU) objArr[2];
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[4];
        java.lang.Object obj = objArr[1];
        super(dataBindingComponent, view, 1, abstractC16413ejU, frameLayout, obj != null ? C17089ewH.EZpvd((android.view.View) obj) : null, (C55230xfy) objArr[3]);
        this.AhwBna = -1L;
        setContainedBinding(this.EZpvd);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 2L;
        }
        this.EZpvd.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AhwBna != 0) {
                return true;
            }
            return this.EZpvd.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return KWHzl((AbstractC16413ejU) obj, i2);
    }

    public final boolean KWHzl(AbstractC16413ejU abstractC16413ejU, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AhwBna |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AhwBna;
            this.AhwBna = 0L;
        }
        if ((j & 2) != 0) {
            ViewBindingAdapter.setPaddingTop(this.AYXKKw, C33570myu.AEQbTJ(getRoot().getContext()));
        }
        ViewDataBinding.executeBindingsOn(this.EZpvd);
    }
}
