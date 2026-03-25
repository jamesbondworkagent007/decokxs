package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50839vbi extends AbstractC50840vbj {
    public static final android.util.SparseIntArray isConnected;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public final ConstraintLayout AkhnZx;
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
        isConnected = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.RAaltf, 1);
        sparseIntArray.put(C48033uCm.Application.Rstyle, 2);
        sparseIntArray.put(C48033uCm.Application.QVsKAR, 3);
        sparseIntArray.put(C48033uCm.Application.getOnBackPressedDispatcherannotations, 4);
        sparseIntArray.put(C48033uCm.Application.addOnMenuVisibilityListener, 5);
        sparseIntArray.put(C48033uCm.Application.isAvailable, 6);
        sparseIntArray.put(C48033uCm.Application.sJqpAA, 7);
        sparseIntArray.put(C48033uCm.Application.UkvvWh, 8);
        sparseIntArray.put(C48033uCm.Application.UeEOUB, 9);
        sparseIntArray.put(C48033uCm.Application.QYvkLl, 10);
    }

    public C50839vbi(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, values, isConnected));
    }

    public C50839vbi(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Flow) objArr[9], (android.widget.ImageView) objArr[3], (C52705wVh) objArr[10], (Guideline) objArr[1], (android.widget.TextView) objArr[7], (android.widget.LinearLayout) objArr[6], (android.widget.TextView) objArr[8], (android.view.View) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[2]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
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
