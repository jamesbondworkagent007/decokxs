package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43845rwv extends AbstractC43844rwu {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts valueOf;
    public long gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        valueOf = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_toolbar", "layout_footer"}, new int[]{1, 2}, new int[]{C43662rtX.TaskDescription.hCLrkq, C43662rtX.TaskDescription.DcqEDu});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        djBIcL = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.zsXlph, 3);
        sparseIntArray.put(C43662rtX.ActionBar.ULRxlR, 4);
    }

    public C43845rwv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, valueOf, djBIcL));
    }

    public C43845rwv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (C42224rKy) objArr[3], (AbstractC43970rzN) objArr[2], (C55055xci) objArr[4], (android.widget.LinearLayout) objArr[0], (AbstractC43977rzU) objArr[1]);
        this.gEmmrt = -1L;
        setContainedBinding(this.AEQbTJ);
        this.copydefault.setTag(null);
        setContainedBinding(this.KWHzl);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 4L;
        }
        this.KWHzl.invalidateAll();
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.gEmmrt != 0) {
                return true;
            }
            return this.KWHzl.hasPendingBindings() || this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.KWHzl.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return KWHzl((AbstractC43977rzU) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return KWHzl((AbstractC43970rzN) obj, i2);
    }

    private boolean KWHzl(AbstractC43977rzU abstractC43977rzU, int i) {
        if (i != C43664rtZ.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.gEmmrt |= 1;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC43970rzN abstractC43970rzN, int i) {
        if (i != C43664rtZ.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.gEmmrt |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.KWHzl);
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
