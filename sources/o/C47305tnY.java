package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47305tnY extends AbstractC47302tnV {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
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
        sparseIntArray.put(C47315tni.TaskDescription.zDUObI, 1);
        sparseIntArray.put(C47315tni.TaskDescription.ULRxlR, 2);
        sparseIntArray.put(C47315tni.TaskDescription.hBpjJd, 3);
        sparseIntArray.put(C47315tni.TaskDescription.dHguZz, 4);
        sparseIntArray.put(C47315tni.TaskDescription.dmfpNf, 5);
        sparseIntArray.put(C47315tni.TaskDescription.fJNWhG, 6);
        sparseIntArray.put(C47315tni.TaskDescription.uzCIH, 7);
        sparseIntArray.put(C47315tni.TaskDescription.QKudOq, 8);
        sparseIntArray.put(C47315tni.TaskDescription.DAIeex, 9);
    }

    public C47305tnY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, fetchVPNInfo, DbNXlk));
    }

    public C47305tnY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[6], (C52794wYp) objArr[7], (android.widget.LinearLayout) objArr[8], (C55173xeu) objArr[9], (android.widget.FrameLayout) objArr[4], (android.widget.FrameLayout) objArr[3], (android.widget.FrameLayout) objArr[5], (android.widget.FrameLayout) objArr[2], (android.widget.LinearLayout) objArr[1], (NestedScrollView) objArr[0]);
        this.isConnected = -1L;
        this.djBIcL.setTag(null);
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
