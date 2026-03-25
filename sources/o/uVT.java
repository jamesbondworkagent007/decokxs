package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uVT extends uVV {
    public static final android.util.SparseIntArray isConnected;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long fetchVPNInfo;

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
        sparseIntArray.put(C48033uCm.Application.DkIxYv, 1);
        sparseIntArray.put(C48033uCm.Application.onError, 2);
        sparseIntArray.put(C48033uCm.Application.TwilightManagerTwilightState, 3);
        sparseIntArray.put(C48033uCm.Application.DpxfQh, 4);
        sparseIntArray.put(C48033uCm.Application.getCustomActions, 5);
        sparseIntArray.put(C48033uCm.Application.newThumbRating, 6);
        sparseIntArray.put(C48033uCm.Application.buildRccMetadata, 7);
        sparseIntArray.put(C48033uCm.Application.invalidateOptionsMenu, 8);
        sparseIntArray.put(C48033uCm.Application.ReportDrawnCompositionsnapshotStateObserver1, 9);
        sparseIntArray.put(C48033uCm.Application.removeTab, 10);
    }

    public uVT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, values, isConnected));
    }

    public uVT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53560wnm) objArr[4], (android.widget.LinearLayout) objArr[1], (C53560wnm) objArr[2], (C53560wnm) objArr[6], (NestedScrollView) objArr[0], (C53560wnm) objArr[7], (C53560wnm) objArr[5], (C50347vLa) objArr[9], (C50347vLa) objArr[8], (AppCompatTextView) objArr[10], (C53560wnm) objArr[3]);
        this.fetchVPNInfo = -1L;
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
