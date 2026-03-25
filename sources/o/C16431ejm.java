package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16431ejm extends AbstractC16433ejo {
    public static final ViewDataBinding.IncludedLayouts DbNXlk;
    public static final android.util.SparseIntArray isConnected;
    public final android.widget.LinearLayout fIwbmz;
    public long fetchVPNInfo;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        DbNXlk = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_transaction_reminder"}, new int[]{2}, new int[]{C13754dXa.TaskDescription.gwwzsY});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 3);
        sparseIntArray.put(C13754dXa.ActionBar.DzCpqu, 4);
        sparseIntArray.put(C13754dXa.ActionBar.getDescription, 5);
        sparseIntArray.put(C13754dXa.ActionBar.dump, 6);
        sparseIntArray.put(C13754dXa.ActionBar.invokespecialatDTRm, 7);
        sparseIntArray.put(C13754dXa.ActionBar.DFbvW, 8);
        sparseIntArray.put(C13754dXa.ActionBar.run, 9);
        sparseIntArray.put(C13754dXa.ActionBar.fkESqH, 10);
        sparseIntArray.put(C13754dXa.ActionBar.gFTCsA, 11);
        sparseIntArray.put(C13754dXa.ActionBar.RihMUf, 12);
    }

    public C16431ejm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, DbNXlk, isConnected));
    }

    public C16431ejm(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (C33537myN) objArr[3], (C57471yiz) objArr[9], (C57468yiw) objArr[10], (C57471yiz) objArr[7], (C57471yiz) objArr[8], (C55173xeu) objArr[12], (android.widget.FrameLayout) objArr[11], (C57422yiC) objArr[4], (android.widget.LinearLayout) objArr[1], (C57471yiz) objArr[6], (C57471yiz) objArr[5], (AbstractC17040evL) objArr[2]);
        this.fetchVPNInfo = -1L;
        this.djBIcL.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fIwbmz = linearLayout;
        linearLayout.setTag(null);
        setContainedBinding(this.AkhnZx);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 2L;
        }
        this.AkhnZx.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fetchVPNInfo != 0) {
                return true;
            }
            return this.AkhnZx.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AkhnZx.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return KWHzl((AbstractC17040evL) obj, i2);
    }

    public final boolean KWHzl(AbstractC17040evL abstractC17040evL, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fetchVPNInfo |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AkhnZx);
    }
}
