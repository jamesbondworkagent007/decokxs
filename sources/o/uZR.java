package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uZR extends uZS {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public long AkhnZx;
    public final android.widget.LinearLayout values;

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
        sparseIntArray.put(C48033uCm.Application.getDefaultCipherSuites, 1);
        sparseIntArray.put(C48033uCm.Application.getLastKnownLocation, 2);
        sparseIntArray.put(C48033uCm.Application.onMenuItemSelected, 3);
        sparseIntArray.put(C48033uCm.Application.RSDDiY, 4);
        sparseIntArray.put(C48033uCm.Application.hGuIrQ, 5);
        sparseIntArray.put(C48033uCm.Application.onCreate, 6);
        sparseIntArray.put(C48033uCm.Application.updateStateFromTypedArray, 7);
        sparseIntArray.put(C48033uCm.Application.SQPLEi, 8);
        sparseIntArray.put(C48033uCm.Application.ComponentActivity2, 9);
        sparseIntArray.put(C48033uCm.Application.QhYuFg, 10);
        sparseIntArray.put(C48033uCm.Application.DlABUU, 11);
    }

    public uZR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, DbNXlk, fetchVPNInfo));
    }

    public uZR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Flow) objArr[4], (wYK) objArr[11], (RecyclerView) objArr[5], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[1], (android.widget.LinearLayout) objArr[6], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[2], (android.view.View) objArr[7]);
        this.AkhnZx = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.values = linearLayout;
        linearLayout.setTag(null);
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
