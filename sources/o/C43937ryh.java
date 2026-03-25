package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.ryh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43937ryh extends AbstractC43938ryi {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray isConnected;
    public long AkhnZx;
    public final LinearLayoutCompat fetchVPNInfo;

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
        isConnected = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.UhxbNG, 1);
        sparseIntArray.put(C43662rtX.ActionBar.Ufzxmz, 2);
        sparseIntArray.put(C43662rtX.ActionBar.OHqIaq, 3);
        sparseIntArray.put(C43662rtX.ActionBar.dmfpNf, 4);
        sparseIntArray.put(C43662rtX.ActionBar.QSLkRj, 5);
        sparseIntArray.put(C43662rtX.ActionBar.OBJEWx, 6);
        sparseIntArray.put(C43662rtX.ActionBar.DLWbHP, 7);
        sparseIntArray.put(C43662rtX.ActionBar.QVsKAR, 8);
        sparseIntArray.put(C43662rtX.ActionBar.QSBOWP, 9);
    }

    public C43937ryh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, isConnected));
    }

    public C43937ryh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55251xgS) objArr[6], (wYK) objArr[9], (android.widget.ImageView) objArr[4], (LinearLayoutCompat) objArr[3], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[8], (android.view.View) objArr[1], (android.widget.TextView) objArr[2]);
        this.AkhnZx = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.fetchVPNInfo = linearLayoutCompat;
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
