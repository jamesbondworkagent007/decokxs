package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48657uZn extends AbstractC48655uZl {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public final ConstraintLayout ejfBZ;
    public long fARcdN;

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
        AuCTel = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.GuardedBy, 1);
        sparseIntArray.put(C48033uCm.Application.onVolumeInfoChanged, 2);
        sparseIntArray.put(C48033uCm.Application.IMediaControllerCallbackStubProxy, 3);
        sparseIntArray.put(C48033uCm.Application.IMediaControllerCallbackStub, 4);
        sparseIntArray.put(C48033uCm.Application.DcMfJKfNLfdT, 5);
        sparseIntArray.put(C48033uCm.Application.DbvGUJ, 6);
        sparseIntArray.put(C48033uCm.Application.registerCallbackListener, 7);
        sparseIntArray.put(C48033uCm.Application.previous, 8);
        sparseIntArray.put(C48033uCm.Application.isCurrent, 9);
        sparseIntArray.put(C48033uCm.Application.getStateLabel, 10);
        sparseIntArray.put(C48033uCm.Application.DtnWsU, 11);
        sparseIntArray.put(C48033uCm.Application.DcMfJKsuEgdN, 12);
        sparseIntArray.put(C48033uCm.Application.bindToGooglePlayService, 13);
        sparseIntArray.put(C48033uCm.Application.getAdvertisingId, 14);
        sparseIntArray.put(C48033uCm.Application.QnnRaN, 15);
    }

    public C48657uZn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fJNWhG, AuCTel));
    }

    public C48657uZn(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55249xgQ) objArr[5], (wYK) objArr[13], (C55258xgZ) objArr[14], (android.widget.LinearLayout) objArr[12], (C52794wYp) objArr[15], (android.widget.TextView) objArr[11], (C47988uAv) objArr[6], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[9], (C55251xgS) objArr[4], (C55251xgS) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[8], (C55258xgZ) objArr[7], (C55372xih) objArr[1]);
        this.fARcdN = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ejfBZ = constraintLayout;
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
