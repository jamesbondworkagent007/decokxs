package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47352toS extends AbstractC47356toW {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.DXXBbs, 1);
        sparseIntArray.put(C47315tni.TaskDescription.fiXcQa, 2);
        sparseIntArray.put(C47315tni.TaskDescription.DDjfYY, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DKtBnz, 4);
        sparseIntArray.put(C47315tni.TaskDescription.DLGVGj, 5);
        sparseIntArray.put(C47315tni.TaskDescription.geLlBI, 6);
        sparseIntArray.put(C47315tni.TaskDescription.iKEqwx, 7);
    }

    public C47352toS(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, AhwBna));
    }

    public C47352toS(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C45426spa) objArr[1], (ConstraintLayout) objArr[0], (C33604mzb) objArr[7], (C33603mza) objArr[5], (C33546myW) objArr[4], (RecyclerView) objArr[6], (C55173xeu) objArr[3], (C55173xeu) objArr[2]);
        this.fetchVPNInfo = -1L;
        this.EZpvd.setTag(null);
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
