package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uRH extends uRC {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long ejfBZ;
    public final android.widget.LinearLayout fIwbmz;

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
        sparseIntArray.put(C48033uCm.Application.gGNlxh, 1);
        sparseIntArray.put(C48033uCm.Application.RemoteActionCompatParcelizer, 2);
        sparseIntArray.put(C48033uCm.Application.onNothingSelected, 3);
        sparseIntArray.put(C48033uCm.Application.RdAHlO, 4);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplActionBarDrawableToggleImpl, 5);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplPanelMenuPresenterCallback, 6);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatApi21CustomAction, 7);
        sparseIntArray.put(C48033uCm.Application.QkdxfA, 8);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatState, 9);
        sparseIntArray.put(C48033uCm.Application.isActive, 10);
        sparseIntArray.put(C48033uCm.Application.registerMediaButtonEventReceiver, 11);
        sparseIntArray.put(C48033uCm.Application.onProviderDisabled, 12);
        sparseIntArray.put(C48033uCm.Application.OuxcSI, 13);
        sparseIntArray.put(C48033uCm.Application.getChangingConfigurations, 14);
    }

    public uRH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, isConnected, AuCTel));
    }

    public uRH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[13], (android.view.View) objArr[8], (C55372xih) objArr[4], (ConstraintLayout) objArr[1], (C52794wYp) objArr[12], (C51601vqB) objArr[2], (android.widget.LinearLayout) objArr[10], (C52794wYp) objArr[11], (RecyclerView) objArr[9], (RecyclerView) objArr[7], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[3], (android.view.View) objArr[14]);
        this.ejfBZ = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fIwbmz = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
