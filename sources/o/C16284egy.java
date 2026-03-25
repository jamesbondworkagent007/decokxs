package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16284egy extends AbstractC16283egx {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final ConstraintLayout fJNWhG;
    public long isConnected;

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
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiver2StubProxy, 1);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi212, 2);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 3);
        sparseIntArray.put(C13754dXa.ActionBar.GCXiNH, 4);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi216, 5);
        sparseIntArray.put(C13754dXa.ActionBar.getTitle, 6);
        sparseIntArray.put(C13754dXa.ActionBar.getDescription, 7);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaItem1, 8);
        sparseIntArray.put(C13754dXa.ActionBar.invokespecialatDTRm, 9);
        sparseIntArray.put(C13754dXa.ActionBar.hdpuIA, 10);
        sparseIntArray.put(C13754dXa.ActionBar.DsrFlB, 11);
        sparseIntArray.put(C13754dXa.ActionBar.RvdRAu, 12);
    }

    public C16284egy(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, DbNXlk, fetchVPNInfo));
    }

    public C16284egy(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C16085edK) objArr[11], (wYF) objArr[12], (C16085edK) objArr[9], (C16085edK) objArr[10], (android.widget.ImageView) objArr[4], (android.widget.ImageView) objArr[2], (NestedScrollView) objArr[5], (C16085edK) objArr[7], (C16085edK) objArr[8], (OKReminder) objArr[6], (android.widget.TextView) objArr[3], (ConstraintLayout) objArr[1]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fJNWhG = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
