package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C17022euu extends AbstractC17025eux {
    public static final ViewDataBinding.IncludedLayouts gEmmrt;
    public static final android.util.SparseIntArray isConnected;
    public final NestedScrollView fetchVPNInfo;
    public long values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        gEmmrt = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_inputs_outputs_more"}, new int[]{3}, new int[]{C13754dXa.TaskDescription.HJWChPfrwjPh});
        includedLayouts.setIncludes(2, new java.lang.String[]{"layout_inputs_outputs_more"}, new int[]{4}, new int[]{C13754dXa.TaskDescription.HJWChPfrwjPh});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ReportDrawnAfter, 5);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatTransportControls, 6);
        sparseIntArray.put(C13754dXa.ActionBar.GVpNrsfQMcgE, 7);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultRegistryLifecycleContainer, 8);
        sparseIntArray.put(C13754dXa.ActionBar.skipToPrevious, 9);
    }

    public C17022euu(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, gEmmrt, isConnected));
    }

    public C17022euu(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (ConstraintLayout) objArr[1], (AbstractC17023euv) objArr[3], (AbstractC17023euv) objArr[4], (ConstraintLayout) objArr[2], (android.view.View) objArr[7], (RecyclerView) objArr[6], (RecyclerView) objArr[9], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[8]);
        this.values = -1L;
        this.OLrzqt.setTag(null);
        setContainedBinding(this.EZpvd);
        setContainedBinding(this.AEQbTJ);
        this.KWHzl.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.fetchVPNInfo = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 4L;
        }
        this.EZpvd.invalidateAll();
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.values != 0) {
                return true;
            }
            return this.EZpvd.hasPendingBindings() || this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return OLrzqt((AbstractC17023euv) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return copydefault((AbstractC17023euv) obj, i2);
    }

    public final boolean OLrzqt(AbstractC17023euv abstractC17023euv, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.values |= 1;
        }
        return true;
    }

    public final boolean copydefault(AbstractC17023euv abstractC17023euv, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.values |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.EZpvd);
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
