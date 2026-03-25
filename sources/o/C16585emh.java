package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16585emh extends AbstractC16587emj {
    public static final android.util.SparseIntArray KWHzl;
    public static final ViewDataBinding.IncludedLayouts copydefault;
    public long AhwBna;
    public final ConstraintLayout djBIcL;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        copydefault = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_defi_approve_risky_banner"}, new int[]{2}, new int[]{C13754dXa.TaskDescription.QOjuYg});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        KWHzl = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.GQzpsZsQwTVT, 1);
        sparseIntArray.put(C13754dXa.ActionBar.onRepeatModeChanged, 3);
    }

    public C16585emh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, copydefault, KWHzl));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16585emh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        super(dataBindingComponent, view, 1, obj != null ? C17108ewa.EZpvd((android.view.View) obj) : null, (RecyclerView) objArr[3], (AbstractC16966etr) objArr[2]);
        this.AhwBna = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.djBIcL = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.AEQbTJ);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 2L;
        }
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AhwBna != 0) {
                return true;
            }
            return this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return AEQbTJ((AbstractC16966etr) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC16966etr abstractC16966etr, int i) {
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
        synchronized (this) {
            this.AhwBna = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
