package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uWL extends uWN {
    public static final android.util.SparseIntArray getNewProxyInstance;
    public static final ViewDataBinding.IncludedLayouts iwGUEr = null;
    public long getFieldNames;
    public final ConstraintLayout hDKMBd;

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
        sparseIntArray.put(C48033uCm.Application.setMediaId, 1);
        sparseIntArray.put(C48033uCm.Application.QAQCdZ, 2);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplBase2, 3);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal, 4);
        sparseIntArray.put(C48033uCm.Application.iRgjgR, 5);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatResultReceiverWrapper, 6);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseMediaSessionStub, 7);
        sparseIntArray.put(C48033uCm.Application.djSkpj, 8);
        sparseIntArray.put(C48033uCm.Application.DGOPHZDGOPHZ, 9);
        sparseIntArray.put(C48033uCm.Application.DGgnkA, 10);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 11);
        sparseIntArray.put(C48033uCm.Application.addQueueItemAt, 12);
        sparseIntArray.put(C48033uCm.Application.config, 13);
        sparseIntArray.put(C48033uCm.Application.onShuffleModeChangedRemoved, 14);
        sparseIntArray.put(C48033uCm.Application.aKErDB, 15);
        sparseIntArray.put(C48033uCm.Application.setDisplayOptions, 16);
        sparseIntArray.put(C48033uCm.Application.setDisplayShowCustomEnabled, 17);
        sparseIntArray.put(C48033uCm.Application.isAttachedToWindow, 18);
        sparseIntArray.put(C48033uCm.Application.ActivityViewModelLazyKtviewModelsfactoryPromise1, 19);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi24, 20);
        sparseIntArray.put(C48033uCm.Application.hOMIpD, 21);
    }

    public uWL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 22, iwGUEr, getNewProxyInstance));
    }

    public uWL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C47988uAv) objArr[8], (ConstraintLayout) objArr[15], (android.widget.TextView) objArr[11], (ConstraintLayout) objArr[9], (C55258xgZ) objArr[10], (wYF) objArr[21], (C55258xgZ) objArr[13], (C55249xgQ) objArr[5], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[4], (C55251xgS) objArr[3], (C55372xih) objArr[1], (android.widget.TextView) objArr[14], (ConstraintLayout) objArr[12], (android.widget.TextView) objArr[20], (C47988uAv) objArr[7], (C50193vFi) objArr[6], (C55258xgZ) objArr[19], (wYK) objArr[18], (android.widget.TextView) objArr[17], (C55258xgZ) objArr[16]);
        this.getFieldNames = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.hDKMBd = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
