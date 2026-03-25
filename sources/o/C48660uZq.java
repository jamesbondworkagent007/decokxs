package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48660uZq extends AbstractC48664uZu {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray values;
    public long DbNXlk;
    public final ConstraintLayout isConnected;

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
        sparseIntArray.put(C48033uCm.Application.GuardedBy, 1);
        sparseIntArray.put(C48033uCm.Application.onVolumeInfoChanged, 2);
        sparseIntArray.put(C48033uCm.Application.IMediaControllerCallbackStubProxy, 3);
        sparseIntArray.put(C48033uCm.Application.IMediaControllerCallbackStub, 4);
        sparseIntArray.put(C48033uCm.Application.DcMfJKfNLfdT, 5);
        sparseIntArray.put(C48033uCm.Application.DbvGUJ, 6);
        sparseIntArray.put(C48033uCm.Application.registerCallbackListener, 7);
        sparseIntArray.put(C48033uCm.Application.previous, 8);
        sparseIntArray.put(C48033uCm.Application.DtnWsU, 9);
        sparseIntArray.put(C48033uCm.Application.QnnRaN, 10);
    }

    public C48660uZq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, fetchVPNInfo, values));
    }

    public C48660uZq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55249xgQ) objArr[5], (C52794wYp) objArr[10], (android.widget.TextView) objArr[9], (C47988uAv) objArr[6], (C55251xgS) objArr[4], (C55251xgS) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[8], (C55258xgZ) objArr[7], (LinearLayoutCompat) objArr[1]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
