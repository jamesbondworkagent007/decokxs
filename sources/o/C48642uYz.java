package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uYz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48642uYz extends uYB {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long DbNXlk;
    public final NestedScrollView fJNWhG;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.FQMcgE, 1);
        sparseIntArray.put(C48033uCm.Application.DFbvW, 2);
        sparseIntArray.put(C48033uCm.Application.OEgNct, 3);
        sparseIntArray.put(C48033uCm.Application.RequiresApi, 4);
        sparseIntArray.put(C48033uCm.Application.dHguZz, 5);
        sparseIntArray.put(C48033uCm.Application.PickVisualMediaRequest, 6);
        sparseIntArray.put(C48033uCm.Application.ixgjPv, 7);
        sparseIntArray.put(C48033uCm.Application.OmPrLP, 8);
        sparseIntArray.put(C48033uCm.Application.getCurrentControllerInfo, 9);
        sparseIntArray.put(C48033uCm.Application.DztXDE, 10);
        sparseIntArray.put(C48033uCm.Application.gZKUVK, 11);
        sparseIntArray.put(C48033uCm.Application.addTab, 12);
    }

    public C48642uYz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, AkhnZx));
    }

    public C48642uYz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (vKO) objArr[5], (vKO) objArr[7], (android.widget.LinearLayout) objArr[1], (android.widget.LinearLayout) objArr[2], (C55258xgZ) objArr[3], (vKO) objArr[10], (C53021wdd) objArr[11], (vKO) objArr[8], (vKO) objArr[9], (vKO) objArr[6], (android.view.View) objArr[4], (vKO) objArr[12]);
        this.DbNXlk = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.fJNWhG = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
