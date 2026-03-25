package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQZ extends uQT {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long AuCTel;
    public final ConstraintLayout fIwbmz;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.viewModels, 1);
        sparseIntArray.put(C48033uCm.Application.IResultReceiver2_Parcel, 2);
        sparseIntArray.put(C48033uCm.Application.viewModelsdefault, 3);
        sparseIntArray.put(C48033uCm.Application.ResultReceiverMyRunnable, 4);
        sparseIntArray.put(C48033uCm.Application.dispatchOnCreate, 5);
        sparseIntArray.put(C48033uCm.Application.ActivityViewModelLazyKt, 6);
        sparseIntArray.put(C48033uCm.Application.ResultReceiverMyResultReceiver, 7);
        sparseIntArray.put(C48033uCm.Application.DaRZkR, 8);
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBarActionModeImpl, 9);
        sparseIntArray.put(C48033uCm.Application.DcMfJKfNUfqk, 10);
        sparseIntArray.put(C48033uCm.Application.doInvalidatePanelMenu, 11);
        sparseIntArray.put(C48033uCm.Application.findMenuPanel, 12);
        sparseIntArray.put(C48033uCm.Application.iwGUEr, 13);
    }

    public uQZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, isConnected, AkhnZx));
    }

    public uQZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (vUW) objArr[13], (C50031uzj) objArr[8], (android.widget.LinearLayout) objArr[10], (C50653vWj) objArr[2], (android.widget.TextView) objArr[3], (C50621vVe) objArr[4], (ConstraintLayout) objArr[1], (android.widget.FrameLayout) objArr[7], (C50660vWq) objArr[6], (android.widget.TextView) objArr[12], (C55320xhi) objArr[11], (android.view.View) objArr[5], (uBL) objArr[9]);
        this.AuCTel = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fIwbmz = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
