package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.trG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47497trG extends AbstractC47493trA {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray isConnected;
    public long fetchVPNInfo;
    public final C45379sog values;

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
        sparseIntArray.put(C47315tni.TaskDescription.DGGHxk, 1);
        sparseIntArray.put(C47315tni.TaskDescription.giSNqX, 2);
        sparseIntArray.put(C47315tni.TaskDescription.invokespecialROgMPW, 3);
        sparseIntArray.put(C47315tni.TaskDescription.QCjLjM, 4);
        sparseIntArray.put(C47315tni.TaskDescription.QwvEab, 5);
        sparseIntArray.put(C47315tni.TaskDescription.UlJrfe, 6);
        sparseIntArray.put(C47315tni.TaskDescription.QSLkRj, 7);
        sparseIntArray.put(C47315tni.TaskDescription.AkhnZx, 8);
        sparseIntArray.put(C47315tni.TaskDescription.USBtdM, 9);
        sparseIntArray.put(C47315tni.TaskDescription.DPHOMC, 10);
        sparseIntArray.put(C47315tni.TaskDescription.DsL, 11);
    }

    public C47497trG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, DbNXlk, isConnected));
    }

    public C47497trG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[8], (ConstraintLayout) objArr[2], (android.widget.ImageView) objArr[4], (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[9], (android.widget.ImageView) objArr[5], (android.widget.TextView) objArr[6], (wYB) objArr[3], (android.widget.LinearLayout) objArr[10], (android.widget.TextView) objArr[11], (C45379sog) objArr[1]);
        this.fetchVPNInfo = -1L;
        C45379sog c45379sog = (C45379sog) objArr[0];
        this.values = c45379sog;
        c45379sog.setTag(null);
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
