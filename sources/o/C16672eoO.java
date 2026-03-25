package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16672eoO extends AbstractC16671eoN {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray values;
    public final ConstraintLayout fetchVPNInfo;
    public long isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@androidx.annotation.Nullable DappBTCUTXOInfo dappBTCUTXOInfo) {
        this.KWHzl = dappBTCUTXOInfo;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        values = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.onStart, 1);
        sparseIntArray.put(C13754dXa.ActionBar.isGmsPickerAvailableactivity_release, 2);
        sparseIntArray.put(C13754dXa.ActionBar.postWhenReportersAreDone, 3);
        sparseIntArray.put(C13754dXa.ActionBar.GVpNrs, 4);
        sparseIntArray.put(C13754dXa.ActionBar.NonNull, 5);
        sparseIntArray.put(C13754dXa.ActionBar.createCallback, 6);
        sparseIntArray.put(C13754dXa.ActionBar.scaleBitmap, 7);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultCallerLauncherresultContract2, 8);
        sparseIntArray.put(C13754dXa.ActionBar.QWSkGZ, 9);
    }

    public C16672eoO(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, DbNXlk, values));
    }

    public C16672eoO(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[9], (ConstraintLayout) objArr[4], (C57440yiU) objArr[7], (RecyclerView) objArr[6], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[8], (C55251xgS) objArr[2], (android.widget.TextView) objArr[5]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.isConnected != i) {
            return false;
        }
        OLrzqt((DappBTCUTXOInfo) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
