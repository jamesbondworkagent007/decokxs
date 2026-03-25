package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16729epS extends AbstractC16732epV {
    public static final ViewDataBinding.IncludedLayouts djBIcL;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final ConstraintLayout AhwBna;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        djBIcL = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_defi_home_yield_coins"}, new int[]{1}, new int[]{C13754dXa.TaskDescription.ONJgbh});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ReportDrawnKtReportDrawn1, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultRegistryOwner, 3);
        sparseIntArray.put(C13754dXa.ActionBar.PickVisualMediaRequestBuilder, 4);
        sparseIntArray.put(C13754dXa.ActionBar.PickVisualMediaRequestdefault, 5);
    }

    public C16729epS(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, valueOf));
    }

    public C16729epS(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (AbstractC16971etw) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4]);
        this.AYXKKw = -1L;
        setContainedBinding(this.OLrzqt);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 2L;
        }
        this.OLrzqt.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AYXKKw != 0) {
                return true;
            }
            return this.OLrzqt.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return AEQbTJ((AbstractC16971etw) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC16971etw abstractC16971etw, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
    }
}
