package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16837erU extends AbstractC16836erT {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt;
    public final ConstraintLayout AYXKKw;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        gEmmrt = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_network_fees"}, new int[]{2}, new int[]{C13754dXa.TaskDescription.QOeQqh});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.sQOHWT, 3);
        sparseIntArray.put(C13754dXa.ActionBar.RhjxDW, 4);
        sparseIntArray.put(C13754dXa.ActionBar.EmptySuper, 5);
    }

    public C16837erU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, gEmmrt, AhwBna));
    }

    public C16837erU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[3], (C57303yfq) objArr[1], (AbstractC17075evu) objArr[2], (AppCompatTextView) objArr[5]);
        this.valueOf = -1L;
        this.OLrzqt.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.AEQbTJ);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
        }
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.valueOf != 0) {
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
        return OLrzqt((AbstractC17075evu) obj, i2);
    }

    private boolean OLrzqt(AbstractC17075evu abstractC17075evu, int i) {
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
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
