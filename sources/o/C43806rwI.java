package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43806rwI extends AbstractC43799rwB {
    public static final android.util.SparseIntArray fARcdN;
    public static final ViewDataBinding.IncludedLayouts fIwbmz;
    public long ejfBZ;
    public final LinearLayoutCompat iwGUEr;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(18);
        fIwbmz = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_toolbar_select_wallet"}, new int[]{1}, new int[]{C43662rtX.TaskDescription.heceqZ});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fARcdN = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.QWpYiD, 2);
        sparseIntArray.put(C43662rtX.ActionBar.OuxcSI, 3);
        sparseIntArray.put(C43662rtX.ActionBar.zuWLRA, 4);
        sparseIntArray.put(C43662rtX.ActionBar.DarRvM, 5);
        sparseIntArray.put(C43662rtX.ActionBar.OqFWZa, 6);
        sparseIntArray.put(C43662rtX.ActionBar.DXXBbs, 7);
        sparseIntArray.put(C43662rtX.ActionBar.iUnTnt, 8);
        sparseIntArray.put(C43662rtX.ActionBar.DzkRMH, 9);
        sparseIntArray.put(C43662rtX.ActionBar.DlABUU, 10);
        sparseIntArray.put(C43662rtX.ActionBar.abAflu, 11);
        sparseIntArray.put(C43662rtX.ActionBar.DxnCrt, 12);
        sparseIntArray.put(C43662rtX.ActionBar.DwQSDd, 13);
        sparseIntArray.put(C43662rtX.ActionBar.glVQsU, 14);
        sparseIntArray.put(C43662rtX.ActionBar.QFTsTN, 15);
        sparseIntArray.put(C43662rtX.ActionBar.jNexW, 16);
        sparseIntArray.put(C43662rtX.ActionBar.run, 17);
    }

    public C43806rwI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, fIwbmz, fARcdN));
    }

    public C43806rwI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[7], (android.widget.TextView) objArr[5], (C55251xgS) objArr[3], (android.widget.TextView) objArr[4], (C52794wYp) objArr[17], (AbstractC43982rzZ) objArr[1], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[2]);
        this.ejfBZ = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.iwGUEr = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setContainedBinding(this.gEmmrt);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 2L;
        }
        this.gEmmrt.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.ejfBZ != 0) {
                return true;
            }
            return this.gEmmrt.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.gEmmrt.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return OLrzqt((AbstractC43982rzZ) obj, i2);
    }

    public final boolean OLrzqt(AbstractC43982rzZ abstractC43982rzZ, int i) {
        if (i != C43664rtZ.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.ejfBZ |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.gEmmrt);
    }
}
