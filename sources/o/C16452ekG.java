package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16452ekG extends AbstractC16446ekA {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final ConstraintLayout isConnected;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 1);
        sparseIntArray.put(C13754dXa.ActionBar.fsw, 2);
        sparseIntArray.put(C13754dXa.ActionBar.sbu, 3);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBase2, 4);
        sparseIntArray.put(C13754dXa.ActionBar.finit, 5);
        sparseIntArray.put(C13754dXa.ActionBar.dvKsVJ, 6);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfNUfqk, 7);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfNLfdT, 8);
        sparseIntArray.put(C13754dXa.ActionBar.RZMhtF, 9);
        sparseIntArray.put(C13754dXa.ActionBar.INotificationSideChannelStub, 10);
    }

    public C16452ekG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, DbNXlk, fetchVPNInfo));
    }

    public C16452ekG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5], (AppCompatImageView) objArr[3], (C55173xeu) objArr[8], (C52794wYp) objArr[7], (android.widget.TextView) objArr[2], (Group) objArr[9], (C55113xdn) objArr[10], (LinearLayoutCompat) objArr[4], (android.widget.TextView) objArr[1]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
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
