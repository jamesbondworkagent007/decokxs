package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uXZ extends AbstractC48618uYb {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray values;
    public final ConstraintLayout DbNXlk;
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
        sparseIntArray.put(C48033uCm.Application.OhcwxsRkSIEV, 1);
        sparseIntArray.put(C48033uCm.Application.Ohcwxs, 2);
        sparseIntArray.put(C48033uCm.Application.gCiISl, 3);
        sparseIntArray.put(C48033uCm.Application.HJWChPfvRMlC, 4);
        sparseIntArray.put(C48033uCm.Application.gvFztT, 5);
        sparseIntArray.put(C48033uCm.Application.BackHandlerKtBackHandler3, 6);
        sparseIntArray.put(C48033uCm.Application.clearMutated, 7);
        sparseIntArray.put(C48033uCm.Application.handleMediaPlayPauseKeySingleTapIfPending, 8);
        sparseIntArray.put(C48033uCm.Application.UscePu, 9);
        sparseIntArray.put(C48033uCm.Application.atDTRm, 10);
    }

    public uXZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, fetchVPNInfo, values));
    }

    public uXZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[9], (android.view.View) objArr[10], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[1], (C52794wYp) objArr[8], (C52794wYp) objArr[6], (C52794wYp) objArr[7]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
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
