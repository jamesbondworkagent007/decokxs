package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.dLX;

/* JADX INFO: loaded from: classes4.dex */
public class dMI extends dMJ {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray isConnected;
    public final android.widget.LinearLayout fetchVPNInfo;
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
        isConnected = sparseIntArray;
        sparseIntArray.put(dLX.Application.DCUTEIddSDPG, 1);
        sparseIntArray.put(dLX.Application.QIZEnU, 2);
        sparseIntArray.put(dLX.Application.hUfVAv, 3);
        sparseIntArray.put(dLX.Application.dNCPSb, 4);
        sparseIntArray.put(dLX.Application.QKudOq, 5);
        sparseIntArray.put(dLX.Application.dHguZz, 6);
        sparseIntArray.put(dLX.Application.gwTjWJ, 7);
        sparseIntArray.put(dLX.Application.UlJrfe, 8);
        sparseIntArray.put(dLX.Application.fetchVPNInfo, 9);
        sparseIntArray.put(dLX.Application.RdAHlO, 10);
    }

    public dMI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, DbNXlk, isConnected));
    }

    public dMI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYC) objArr[9], (android.view.View) objArr[4], (wYC) objArr[3], (ConstraintLayout) objArr[5], (android.widget.ImageView) objArr[7], (android.widget.TextView) objArr[6], (RecyclerView) objArr[10], (android.widget.TextView) objArr[8], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[2]);
        this.values = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fetchVPNInfo = linearLayout;
        linearLayout.setTag(null);
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
