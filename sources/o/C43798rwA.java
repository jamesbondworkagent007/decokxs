package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43798rwA extends AbstractC43800rwC {
    public static final ViewDataBinding.IncludedLayouts djBIcL;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final LinearLayoutCompat isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        djBIcL = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_toolbar", "layout_footer"}, new int[]{1, 2}, new int[]{C43662rtX.TaskDescription.hCLrkq, C43662rtX.TaskDescription.DcqEDu});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.ihnvzI, 3);
        sparseIntArray.put(C43662rtX.ActionBar.apAOXX, 4);
        sparseIntArray.put(C43662rtX.ActionBar.RzdrRQ, 5);
        sparseIntArray.put(C43662rtX.ActionBar.UccSpe, 6);
        sparseIntArray.put(C43662rtX.ActionBar.RqmePg, 7);
    }

    public C43798rwA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, valueOf));
    }

    public C43798rwA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (AbstractC43970rzN) objArr[2], (android.widget.LinearLayout) objArr[3], (android.widget.LinearLayout) objArr[7], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5], (AbstractC43977rzU) objArr[1], (C55113xdn) objArr[4]);
        this.AYXKKw = -1L;
        setContainedBinding(this.AEQbTJ);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.isConnected = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setContainedBinding(this.gEmmrt);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 4L;
        }
        this.gEmmrt.invalidateAll();
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AYXKKw != 0) {
                return true;
            }
            return this.gEmmrt.hasPendingBindings() || this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.gEmmrt.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return copydefault((AbstractC43977rzU) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return KWHzl((AbstractC43970rzN) obj, i2);
    }

    private boolean copydefault(AbstractC43977rzU abstractC43977rzU, int i) {
        if (i != C43664rtZ.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        return true;
    }

    private boolean KWHzl(AbstractC43970rzN abstractC43970rzN, int i) {
        if (i != C43664rtZ.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.gEmmrt);
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
