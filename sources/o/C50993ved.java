package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.ved, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50993ved extends AbstractC50995vef {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public final ConstraintLayout ejfBZ;
    public long fetchVPNInfo;

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
        values = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.scaleBitmap, 1);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 2);
        sparseIntArray.put(C48033uCm.Application.ActivityResultLauncher, 3);
        sparseIntArray.put(C48033uCm.Application.onTransact, 4);
        sparseIntArray.put(C48033uCm.Application.setDefaultImpl, 5);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaItem, 6);
        sparseIntArray.put(C48033uCm.Application.DcMfJKDGTeJD, 7);
        sparseIntArray.put(C48033uCm.Application.next, 8);
        sparseIntArray.put(C48033uCm.Application.sendShuffleMode, 9);
        sparseIntArray.put(C48033uCm.Application.unregisterOnBackInvokedCallback, 10);
        sparseIntArray.put(C48033uCm.Application.rate, 11);
        sparseIntArray.put(C48033uCm.Application.sendRepeatMode, 12);
    }

    public C50993ved(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, values));
    }

    public C50993ved(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53539wnR) objArr[2], (C52794wYp) objArr[7], (wYK) objArr[4], (C55258xgZ) objArr[5], (C52794wYp) objArr[6], (C52794wYp) objArr[1], (C53539wnR) objArr[8], (C53539wnR) objArr[11], (C53539wnR) objArr[12], (C53539wnR) objArr[9], (C52794wYp) objArr[10], (C53539wnR) objArr[3]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ejfBZ = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
