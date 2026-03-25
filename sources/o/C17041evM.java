package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17041evM extends AbstractC17044evP {
    public static final android.util.SparseIntArray AEQbTJ;
    public static final ViewDataBinding.IncludedLayouts KWHzl;
    public final android.widget.LinearLayout AYXKKw;
    public long EZpvd;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        KWHzl = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_view_memo_read_only"}, new int[]{1}, new int[]{C13754dXa.TaskDescription.aWuQzD});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.Zpvmxu, 2);
    }

    public C17041evM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, KWHzl, AEQbTJ));
    }

    public C17041evM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (C55008xbo) objArr[2], (AbstractC17050evV) objArr[1]);
        this.EZpvd = -1L;
        setContainedBinding(this.copydefault);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AYXKKw = linearLayout;
        linearLayout.setTag(null);
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
        return KWHzl((AbstractC17050evV) obj, i2);
    }

    public final boolean KWHzl(AbstractC17050evV abstractC17050evV, int i) {
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
        synchronized (this) {
            this.EZpvd = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.copydefault);
    }
}
