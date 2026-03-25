package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rvD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43748rvD extends AbstractC43750rvF {
    public static final ViewDataBinding.IncludedLayouts AhwBna;
    public static final android.util.SparseIntArray gEmmrt;
    public final LinearLayoutCompat isConnected;
    public long values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        AhwBna = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_toolbar"}, new int[]{1}, new int[]{C43662rtX.TaskDescription.hCLrkq});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.TarCU, 2);
        sparseIntArray.put(C43662rtX.ActionBar.RSDDiY, 3);
        sparseIntArray.put(C43662rtX.ActionBar.DcMfJK, 4);
        sparseIntArray.put(C43662rtX.ActionBar.heceqZ, 5);
        sparseIntArray.put(C43662rtX.ActionBar.DGUQLI, 6);
        sparseIntArray.put(C43662rtX.ActionBar.DcqEDu, 7);
        sparseIntArray.put(C43662rtX.ActionBar.hCLrkq, 8);
    }

    public C43748rvD(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, gEmmrt));
    }

    public C43748rvD(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (C52794wYp) objArr[7], (C52794wYp) objArr[8], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5], (C42274rMu) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3], (AbstractC43977rzU) objArr[1]);
        this.values = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.isConnected = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setContainedBinding(this.djBIcL);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 2L;
        }
        this.djBIcL.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.values != 0) {
                return true;
            }
            return this.djBIcL.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.djBIcL.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return copydefault((AbstractC43977rzU) obj, i2);
    }

    public final boolean copydefault(AbstractC43977rzU abstractC43977rzU, int i) {
        if (i != C43664rtZ.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.values |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.values;
            this.values = 0L;
        }
        if ((j & 2) != 0) {
            ViewBindingAdapter.setPaddingTop(this.isConnected, C33570myu.gEmmrt(getRoot().getContext()));
        }
        ViewDataBinding.executeBindingsOn(this.djBIcL);
    }
}
