package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.toB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47335toB extends AbstractC47383tox {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public long fIwbmz;

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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.reset, 1);
        sparseIntArray.put(C47315tni.TaskDescription.zLAIeZ, 2);
        sparseIntArray.put(C47315tni.TaskDescription.invokespecialgBtXYZ, 3);
        sparseIntArray.put(C47315tni.TaskDescription.invokespecialhlXVux, 4);
        sparseIntArray.put(C47315tni.TaskDescription.DaTmkG, 5);
        sparseIntArray.put(C47315tni.TaskDescription.DsL, 6);
        sparseIntArray.put(C47315tni.TaskDescription.hOMIpD, 7);
        sparseIntArray.put(C47315tni.TaskDescription.fetchVPNInfo, 8);
        sparseIntArray.put(C47315tni.TaskDescription.values, 9);
        sparseIntArray.put(C47315tni.TaskDescription.aCSzUz, 10);
        sparseIntArray.put(C47315tni.TaskDescription.isConnected, 11);
        sparseIntArray.put(C47315tni.TaskDescription.sSMYrx, 12);
    }

    public C47335toB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, AkhnZx, fetchVPNInfo));
    }

    public C47335toB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[11], (C52794wYp) objArr[8], (C52794wYp) objArr[9], (android.widget.LinearLayout) objArr[12], (ConstraintLayout) objArr[0], (NestedScrollView) objArr[1], (android.widget.LinearLayout) objArr[2], (android.widget.LinearLayout) objArr[3], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[5], (android.view.View) objArr[10], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[6]);
        this.fIwbmz = -1L;
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
