package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tno, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47321tno extends AbstractC47319tnm {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public long isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.vLaW, 2);
        sparseIntArray.put(C47315tni.TaskDescription.invokespecialaVhqwO, 3);
        sparseIntArray.put(C47315tni.TaskDescription.invokespecialDaTmkG, 4);
        sparseIntArray.put(C47315tni.TaskDescription.RSDDiY, 5);
        sparseIntArray.put(C47315tni.TaskDescription.flVtFt, 6);
        sparseIntArray.put(C47315tni.TaskDescription.RAQtXZ, 7);
        sparseIntArray.put(C47315tni.TaskDescription.processStrongAuthMessage, 8);
    }

    public C47321tno(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, DbNXlk, fetchVPNInfo));
    }

    public C47321tno(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (android.widget.FrameLayout) objArr[6], (android.widget.LinearLayout) objArr[2], (android.widget.LinearLayout) objArr[0], (RecyclerView) objArr[7], (C55237xgE) objArr[5], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[8]);
        this.isConnected = -1L;
        this.AEQbTJ.setTag(null);
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C47317tnk.KWHzl != i) {
            return false;
        }
        KWHzl((java.lang.String) obj);
        return true;
    }

    @Override // o.AbstractC47319tnm
    public void KWHzl(@androidx.annotation.Nullable java.lang.String str) {
        this.KWHzl = str;
        synchronized (this) {
            this.isConnected |= 1;
        }
        notifyPropertyChanged(C47317tnk.KWHzl);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.isConnected;
            this.isConnected = 0L;
        }
        java.lang.String str = this.KWHzl;
        if ((j & 3) != 0) {
            C45383sok.KWHzl(this.AEQbTJ, str);
        }
    }
}
