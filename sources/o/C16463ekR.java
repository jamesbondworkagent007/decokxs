package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.item.OKRegularCell;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16463ekR extends AbstractC16462ekQ {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray DbNXlk;
    public final android.widget.LinearLayout fetchVPNInfo;
    public long values;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.RZNAhV, 1);
        sparseIntArray.put(C13754dXa.ActionBar.setPlaybackState, 2);
        sparseIntArray.put(C13754dXa.ActionBar.RqmePg, 3);
        sparseIntArray.put(C13754dXa.ActionBar.setQueueTitle, 4);
        sparseIntArray.put(C13754dXa.ActionBar.RzdrRQ, 5);
        sparseIntArray.put(C13754dXa.ActionBar.setQueue, 6);
        sparseIntArray.put(C13754dXa.ActionBar.iHkeWl, 7);
        sparseIntArray.put(C13754dXa.ActionBar.setPlaybackToLocal, 8);
        sparseIntArray.put(C13754dXa.ActionBar.RTWSvT, 9);
        sparseIntArray.put(C13754dXa.ActionBar.fromQueueItem, 10);
    }

    public C16463ekR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, AkhnZx, DbNXlk));
    }

    public C16463ekR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (OKRegularCell) objArr[1], (OKRegularCell) objArr[9], (OKRegularCell) objArr[3], (OKRegularCell) objArr[5], (OKRegularCell) objArr[7], (wYK) objArr[2], (wYK) objArr[4], (wYK) objArr[6], (wYK) objArr[8], (C55239xgG) objArr[10]);
        this.values = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fetchVPNInfo = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
