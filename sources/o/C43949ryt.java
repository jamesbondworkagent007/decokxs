package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.ryt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43949ryt extends AbstractC43942rym {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long AkhnZx;
    public final LinearLayoutCompat DbNXlk;

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
        sparseIntArray.put(C43662rtX.ActionBar.iKEqwx, 1);
        sparseIntArray.put(C43662rtX.ActionBar.OHqIaq, 2);
        sparseIntArray.put(C43662rtX.ActionBar.QkdxfA, 3);
        sparseIntArray.put(C43662rtX.ActionBar.RKDWNf, 4);
        sparseIntArray.put(C43662rtX.ActionBar.hBpjJd, 5);
        sparseIntArray.put(C43662rtX.ActionBar.RdAHlO, 6);
        sparseIntArray.put(C43662rtX.ActionBar.gwTjWJ, 7);
        sparseIntArray.put(C43662rtX.ActionBar.iPSTqm, 8);
        sparseIntArray.put(C43662rtX.ActionBar.dHguZz, 9);
        sparseIntArray.put(C43662rtX.ActionBar.tIwhY, 10);
        sparseIntArray.put(C43662rtX.ActionBar.zAEkPU, 11);
    }

    public C43949ryt(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, isConnected, fetchVPNInfo));
    }

    public C43949ryt(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (C55001xbh) objArr[9], (android.widget.LinearLayout) objArr[7], (android.widget.TextView) objArr[6], (LinearLayoutCompat) objArr[5], (LinearLayoutCompat) objArr[2], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[11], (android.view.View) objArr[1]);
        this.AkhnZx = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.DbNXlk = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
