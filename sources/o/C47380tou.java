package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47380tou extends AbstractC47379tot {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray isConnected;
    public long AkhnZx;
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
        sparseIntArray.put(C47315tni.TaskDescription.tIwhY, 1);
        sparseIntArray.put(C47315tni.TaskDescription.QUSxYX, 2);
        sparseIntArray.put(C47315tni.TaskDescription.DPHOMC, 3);
        sparseIntArray.put(C47315tni.TaskDescription.gkJEwt, 4);
        sparseIntArray.put(C47315tni.TaskDescription.ggKfIT, 5);
        sparseIntArray.put(C47315tni.TaskDescription.spnCvw, 6);
        sparseIntArray.put(C47315tni.TaskDescription.QfJbVf, 7);
        sparseIntArray.put(C47315tni.TaskDescription.DPHsZd, 8);
        sparseIntArray.put(C47315tni.TaskDescription.copydefault, 9);
        sparseIntArray.put(C47315tni.TaskDescription.fGQ, 10);
        sparseIntArray.put(C47315tni.TaskDescription.AYXKKw, 11);
    }

    public C47380tou(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, DbNXlk, isConnected));
    }

    public C47380tou(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[9], (C52794wYp) objArr[11], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[1], (RecyclerView) objArr[7], (C52794wYp) objArr[10], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3]);
        this.AkhnZx = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.values = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
