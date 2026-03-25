package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47340toG extends AbstractC47338toE {
    public static final android.util.SparseIntArray fIwbmz;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long AuCTel;

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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.OxVOHk, 1);
        sparseIntArray.put(C47315tni.TaskDescription.DPHOMC, 2);
        sparseIntArray.put(C47315tni.TaskDescription.DGUQLIOvDItG, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DNMMPQ, 4);
        sparseIntArray.put(C47315tni.TaskDescription.fHqPtx, 5);
        sparseIntArray.put(C47315tni.TaskDescription.QDqgQU, 6);
        sparseIntArray.put(C47315tni.TaskDescription.DPhTBN, 7);
        sparseIntArray.put(C47315tni.TaskDescription.aJZHYI, 8);
        sparseIntArray.put(C47315tni.TaskDescription.ihnvzI, 9);
        sparseIntArray.put(C47315tni.TaskDescription.DaRZkR, 10);
        sparseIntArray.put(C47315tni.TaskDescription.DrNnAm, 11);
        sparseIntArray.put(C47315tni.TaskDescription.zblBkD, 12);
        sparseIntArray.put(C47315tni.TaskDescription.DGgnkA, 13);
        sparseIntArray.put(C47315tni.TaskDescription.OqFWZa, 14);
    }

    public C47340toG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, fJNWhG, fIwbmz));
    }

    public C47340toG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (syW) objArr[14], (android.widget.ImageView) objArr[1], (C55008xbo) objArr[12], (android.widget.LinearLayout) objArr[5], (android.view.View) objArr[4], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[6], (C45863szc) objArr[3], (android.widget.ToggleButton) objArr[8], (android.widget.ToggleButton) objArr[7], (RecyclerView) objArr[11], (syZ) objArr[9], (android.widget.ScrollView) objArr[0], (android.widget.TextView) objArr[2]);
        this.AuCTel = -1L;
        this.AkhnZx.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
