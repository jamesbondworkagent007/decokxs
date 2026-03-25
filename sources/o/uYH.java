package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uYH extends uYL {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray isConnected;
    public long AkhnZx;
    public final ConstraintLayout values;

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
        sparseIntArray.put(C48033uCm.Application.flVtFt, 1);
        sparseIntArray.put(C48033uCm.Application.onBackInvoked, 2);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi21CallbackProxy, 3);
        sparseIntArray.put(C48033uCm.Application.zlzhuY, 4);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseMediaSessionStub, 5);
        sparseIntArray.put(C48033uCm.Application.fromQueueItem, 6);
        sparseIntArray.put(C48033uCm.Application.hasEnabledCallbacks, 7);
        sparseIntArray.put(C48033uCm.Application.syncState, 8);
        sparseIntArray.put(C48033uCm.Application.sILrnl, 9);
    }

    public uYH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, isConnected));
    }

    public uYH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[9], (C52702wVe) objArr[4], (C52702wVe) objArr[3], (C52702wVe) objArr[5], (android.widget.LinearLayout) objArr[6], (C53530wnI) objArr[7], (C52701wVd) objArr[2], (C47988uAv) objArr[8]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
