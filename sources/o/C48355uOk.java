package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uOk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48355uOk extends AbstractC48356uOl {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray isConnected;
    public final LinearLayoutCompat ejfBZ;
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
        isConnected = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.onAnimationStart, 1);
        sparseIntArray.put(C48033uCm.Application.getMenu, 2);
        sparseIntArray.put(C48033uCm.Application.ToolbarActionBar, 3);
        sparseIntArray.put(C48033uCm.Application.generateConfigDelta_densityDpi, 4);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContracts, 5);
        sparseIntArray.put(C48033uCm.Application.themifyContext, 6);
        sparseIntArray.put(C48033uCm.Application.createViewByPrefix, 7);
        sparseIntArray.put(C48033uCm.Application.isSystemPickerAvailableactivity_release, 8);
        sparseIntArray.put(C48033uCm.Application.createSeekBar, 9);
        sparseIntArray.put(C48033uCm.Application.createImageView, 10);
        sparseIntArray.put(C48033uCm.Application.bypassOnPanelClosed, 11);
        sparseIntArray.put(C48033uCm.Application.gwwzsY, 12);
    }

    public C48355uOk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, AkhnZx, isConnected));
    }

    public C48355uOk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55173xeu) objArr[12], (LinearLayoutCompat) objArr[5], (LinearLayoutCompat) objArr[8], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[4], (C52794wYp) objArr[11], (C55376xil) objArr[6], (android.widget.TextView) objArr[7], (C55376xil) objArr[9], (android.widget.TextView) objArr[10], (C55376xil) objArr[3], (android.widget.TextView) objArr[2]);
        this.fetchVPNInfo = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.ejfBZ = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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
