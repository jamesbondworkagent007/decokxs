package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ets, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16967ets extends AbstractC16965etq {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public long DbNXlk;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.addTab, 5);
        sparseIntArray.put(C13754dXa.ActionBar.UseExperimental, 6);
        sparseIntArray.put(C13754dXa.ActionBar.gbIfDn, 7);
        sparseIntArray.put(C13754dXa.ActionBar.sVvuFk, 8);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatSearchCallback, 9);
        sparseIntArray.put(C13754dXa.ActionBar.onSearchResult, 10);
    }

    public C16967ets(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 11, AkhnZx, fetchVPNInfo));
    }

    public C16967ets(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (AppCompatTextView) objArr[8], (android.widget.LinearLayout) objArr[3], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[10], (android.widget.LinearLayout) objArr[4], (AppCompatTextView) objArr[9], (C14705dqW) objArr[1], (AppCompatTextView) objArr[0], (AppCompatTextView) objArr[6], (android.widget.LinearLayout) objArr[2], (AppCompatTextView) objArr[5]);
        this.DbNXlk = -1L;
        this.EZpvd.setTag(null);
        this.copydefault.setTag(null);
        this.djBIcL.setTag(null);
        this.gEmmrt.setTag(null);
        this.AhwBna.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
