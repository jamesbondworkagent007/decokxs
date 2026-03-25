package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uOF extends uOE {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray isConnected;
    public long DbNXlk;
    public final NestedScrollView values;

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
        sparseIntArray.put(C48033uCm.Application.skipToNext, 1);
        sparseIntArray.put(C48033uCm.Application.DzkRMH, 2);
        sparseIntArray.put(C48033uCm.Application.MediaMetadataCompat, 3);
        sparseIntArray.put(C48033uCm.Application.getTabAt, 4);
        sparseIntArray.put(C48033uCm.Application.collapseActionView, 5);
        sparseIntArray.put(C48033uCm.Application.kcQGz, 6);
        sparseIntArray.put(C48033uCm.Application.RSDDiY, 7);
        sparseIntArray.put(C48033uCm.Application.ActivityViewModelLazyKtviewModels1, 8);
        sparseIntArray.put(C48033uCm.Application.getRccTransportControlFlagsFromActions, 9);
        sparseIntArray.put(C48033uCm.Application.setState, 10);
    }

    public uOF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, fetchVPNInfo, isConnected));
    }

    public uOF(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Flow) objArr[7], (ConstraintLayout) objArr[2], (android.widget.TextView) objArr[6], (ConstraintLayout) objArr[3], (C55173xeu) objArr[1], (C52585wQw) objArr[9], (C52588wQz) objArr[10], (RecyclerView) objArr[8], (C55258xgZ) objArr[4], (android.widget.TextView) objArr[5]);
        this.DbNXlk = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.values = nestedScrollView;
        nestedScrollView.setTag(null);
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
