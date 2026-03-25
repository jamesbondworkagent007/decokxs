package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.dLX;

/* JADX INFO: renamed from: o.dMt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C13476dMt extends AbstractC13472dMp {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final ConstraintLayout DbNXlk;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(dLX.Application.WS, 1);
        sparseIntArray.put(dLX.Application.AuCTelauCTel, 2);
        sparseIntArray.put(dLX.Application.dNCPSb, 3);
        sparseIntArray.put(dLX.Application.gGvvIC, 4);
        sparseIntArray.put(dLX.Application.DGOPHZ, 5);
        sparseIntArray.put(dLX.Application.QDqgQU, 6);
        sparseIntArray.put(dLX.Application.UeEOUB, 7);
        sparseIntArray.put(dLX.Application.OuxcSI, 8);
        sparseIntArray.put(dLX.Application.ULRxlR, 9);
        sparseIntArray.put(dLX.Application.sSMYrx, 10);
    }

    public C13476dMt(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, isConnected, fetchVPNInfo));
    }

    public C13476dMt(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (C52794wYp) objArr[10], (android.view.View) objArr[3], (C55008xbo) objArr[7], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[6], (C55008xbo) objArr[9]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
        constraintLayout.setTag(null);
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
