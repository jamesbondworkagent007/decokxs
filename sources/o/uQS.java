package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQS extends uQW {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final NestedScrollView fetchVPNInfo;
    public long values;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.zagaMW, 1);
        sparseIntArray.put(C48033uCm.Application.fDu, 2);
        sparseIntArray.put(C48033uCm.Application.HJWChPOKBmQN, 3);
        sparseIntArray.put(C48033uCm.Application.sSi, 4);
        sparseIntArray.put(C48033uCm.Application.identifier, 5);
        sparseIntArray.put(C48033uCm.Application.dismissPopups, 6);
        sparseIntArray.put(C48033uCm.Application.callOnPanelClosed, 7);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatTransportControlsBase, 8);
    }

    public uQS(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, djBIcL));
    }

    public uQS(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55258xgZ) objArr[2], (android.widget.TextView) objArr[3], (android.widget.LinearLayout) objArr[1], (C55258xgZ) objArr[4], (android.widget.TextView) objArr[5], (RecyclerView) objArr[8], (C55258xgZ) objArr[6], (android.widget.TextView) objArr[7]);
        this.values = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.fetchVPNInfo = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
