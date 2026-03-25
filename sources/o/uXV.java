package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uXV extends uXU {
    public static final android.util.SparseIntArray getNewProxyInstance;
    public static final ViewDataBinding.IncludedLayouts iwGUEr = null;
    public final android.widget.LinearLayout getFieldNames;
    public long hDKMBd;

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
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.playFromMediaId, 1);
        sparseIntArray.put(C48033uCm.Application.DDjfYY, 2);
        sparseIntArray.put(C48033uCm.Application.ddhgMB, 3);
        sparseIntArray.put(C48033uCm.Application.getErrorCode, 4);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplApi191, 5);
        sparseIntArray.put(C48033uCm.Application.Rinteger, 6);
        sparseIntArray.put(C48033uCm.Application.Rtjmuc, 7);
        sparseIntArray.put(C48033uCm.Application.showForSystem, 8);
        sparseIntArray.put(C48033uCm.Application.onContentScrollStarted, 9);
        sparseIntArray.put(C48033uCm.Application.setShuffleMode, 10);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsPickVisualMediaSingleMimeType, 11);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatSubscription, 12);
        sparseIntArray.put(C48033uCm.Application.onPrepareListView, 13);
        sparseIntArray.put(C48033uCm.Application.removeSubscription, 14);
        sparseIntArray.put(C48033uCm.Application.shouldCenterSingleButton, 15);
        sparseIntArray.put(C48033uCm.Application.gdLjtZ, 16);
        sparseIntArray.put(C48033uCm.Application.trackPipAnimationHintView, 17);
        sparseIntArray.put(C48033uCm.Application.sendRequest, 18);
        sparseIntArray.put(C48033uCm.Application.createListView, 19);
        sparseIntArray.put(C48033uCm.Application.onPlaybackPositionUpdate, 20);
    }

    public uXV(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, iwGUEr, getNewProxyInstance));
    }

    public uXV(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[7], (ConstraintLayout) objArr[2], (C55258xgZ) objArr[16], (Guideline) objArr[3], (android.widget.LinearLayout) objArr[18], (android.widget.LinearLayout) objArr[14], (android.widget.LinearLayout) objArr[12], (C55173xeu) objArr[1], (android.widget.ImageView) objArr[10], (C55353xiO) objArr[20], (C55258xgZ) objArr[5], (C55249xgQ) objArr[4], (C55258xgZ) objArr[17], (C55258xgZ) objArr[11], (android.widget.ImageView) objArr[6], (C55258xgZ) objArr[15], (C55258xgZ) objArr[19], (C55258xgZ) objArr[13], (android.view.View) objArr[9], (android.view.View) objArr[8]);
        this.hDKMBd = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.getFieldNames = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.hDKMBd = 0L;
        }
    }
}
