package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uVF extends uVE {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray values;
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
        values = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.uzCIH, 2);
        sparseIntArray.put(C48033uCm.Application.hDKMBd, 3);
        sparseIntArray.put(C48033uCm.Application.withContextAvailable, 4);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractSynchronousResult, 5);
        sparseIntArray.put(C48033uCm.Application.getGmsPickeractivity_release, 6);
        sparseIntArray.put(C48033uCm.Application.removeOnMenuVisibilityListener, 7);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsCaptureVideo, 8);
        sparseIntArray.put(C48033uCm.Application.SdSTJp, 9);
    }

    public uVF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 10, fetchVPNInfo, values));
    }

    public uVF(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (AppCompatImageView) objArr[3], (LinearLayoutCompat) objArr[1], (LinearLayoutCompat) objArr[0], (C55258xgZ) objArr[2], (C53553wnf) objArr[9], (C53573wnz) objArr[4], (C53573wnz) objArr[8], (C53573wnz) objArr[5], (C53573wnz) objArr[6], (C53573wnz) objArr[7]);
        this.isConnected = -1L;
        this.copydefault.setTag(null);
        this.EZpvd.setTag(null);
        setRootTag(viewArr);
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
