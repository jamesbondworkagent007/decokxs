package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uZI extends uZJ {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long fARcdN;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.GuardedBy, 1);
        sparseIntArray.put(C48033uCm.Application.onVolumeInfoChanged, 2);
        sparseIntArray.put(C48033uCm.Application.addQueueItem, 3);
        sparseIntArray.put(C48033uCm.Application.DcMfJKfNLfdT, 4);
        sparseIntArray.put(C48033uCm.Application.openFileOutput, 5);
        sparseIntArray.put(C48033uCm.Application.dcEsSD, 6);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatMediaControllerImplBase, 7);
        sparseIntArray.put(C48033uCm.Application.dESsmu, 8);
        sparseIntArray.put(C48033uCm.Application.component2, 9);
        sparseIntArray.put(C48033uCm.Application.sGvRiA, 10);
        sparseIntArray.put(C48033uCm.Application.ChecksSdkIntAtLeast, 11);
        sparseIntArray.put(C48033uCm.Application.allOf, 12);
        sparseIntArray.put(C48033uCm.Application.QnnRaN, 13);
    }

    public uZI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, isConnected, DbNXlk));
    }

    public uZI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55249xgQ) objArr[4], (C52794wYp) objArr[13], (LinearLayoutCompat) objArr[5], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[11], (LinearLayoutCompat) objArr[1], (android.widget.TextView) objArr[12]);
        this.fARcdN = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fIwbmz = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
