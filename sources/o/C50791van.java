package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C48033uCm;

/* JADX INFO: renamed from: o.van, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50791van extends AbstractC50788vak {
    public static final ViewDataBinding.IncludedLayouts EZpvd;
    public static final android.util.SparseIntArray KWHzl;
    public long copydefault;
    public final android.widget.LinearLayout valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        EZpvd = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_filter_and_sort_bar"}, new int[]{1}, new int[]{C48033uCm.Activity.RAQtXZ});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        KWHzl = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.keyboardTargetTextChanged, 2);
    }

    public C50791van(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, EZpvd, KWHzl));
    }

    public C50791van(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (AbstractC48458uSd) objArr[1], (android.widget.FrameLayout) objArr[2]);
        this.copydefault = -1L;
        setContainedBinding(this.OLrzqt);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.valueOf = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.copydefault = 2L;
        }
        this.OLrzqt.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.copydefault != 0) {
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
        return copydefault((AbstractC48458uSd) obj, i2);
    }

    public final boolean copydefault(AbstractC48458uSd abstractC48458uSd, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.copydefault |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.copydefault = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
    }
}
