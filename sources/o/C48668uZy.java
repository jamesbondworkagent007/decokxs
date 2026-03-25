package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48668uZy extends AbstractC48662uZs {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray DbNXlk;
    public final android.widget.LinearLayout fIwbmz;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.getDefaultCipherSuites, 1);
        sparseIntArray.put(C48033uCm.Application.getLastKnownLocation, 2);
        sparseIntArray.put(C48033uCm.Application.setCustomTitle, 3);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplBase2, 4);
        sparseIntArray.put(C48033uCm.Application.onItemLoaded, 5);
        sparseIntArray.put(C48033uCm.Application.RSDDiY, 6);
        sparseIntArray.put(C48033uCm.Application.hGuIrQ, 7);
        sparseIntArray.put(C48033uCm.Application.onCreate, 8);
        sparseIntArray.put(C48033uCm.Application.updateStateFromTypedArray, 9);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi21Callback, 10);
        sparseIntArray.put(C48033uCm.Application.QhYuFg, 11);
        sparseIntArray.put(C48033uCm.Application.DlABUU, 12);
    }

    public C48668uZy(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, AkhnZx, DbNXlk));
    }

    public C48668uZy(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Flow) objArr[6], (wYK) objArr[12], (RecyclerView) objArr[7], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[1], (C55251xgS) objArr[5], (C55251xgS) objArr[4], (android.widget.LinearLayout) objArr[10], (android.widget.LinearLayout) objArr[8], (C55251xgS) objArr[3], (C55251xgS) objArr[2], (android.view.View) objArr[9]);
        this.isConnected = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fIwbmz = linearLayout;
        linearLayout.setTag(null);
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
