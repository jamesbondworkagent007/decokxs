package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16846erd extends AbstractC16843era {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna;
    public final ConstraintLayout gEmmrt;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        AhwBna = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_network_fees"}, new int[]{2}, new int[]{C13754dXa.TaskDescription.QOeQqh});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.sQOHWT, 3);
        sparseIntArray.put(C13754dXa.ActionBar.RhjxDW, 4);
        sparseIntArray.put(C13754dXa.ActionBar.onReceive, 5);
    }

    public C16846erd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AhwBna, AYXKKw));
    }

    public C16846erd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[3], (C57303yfq) objArr[1], (AbstractC17075evu) objArr[2]);
        this.valueOf = -1L;
        this.copydefault.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.gEmmrt = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.EZpvd);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
        }
        this.EZpvd.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.valueOf != 0) {
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
        return EZpvd((AbstractC17075evu) obj, i2);
    }

    public final boolean EZpvd(AbstractC17075evu abstractC17075evu, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.EZpvd);
    }
}
