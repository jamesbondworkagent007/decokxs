package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50841vbk extends AbstractC50833vbc {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long DbNXlk;
    public final ConstraintLayout fetchVPNInfo;

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
        sparseIntArray.put(C48033uCm.Application.RAaltf, 1);
        sparseIntArray.put(C48033uCm.Application.Rstyle, 2);
        sparseIntArray.put(C48033uCm.Application.addOnMenuVisibilityListener, 3);
        sparseIntArray.put(C48033uCm.Application.UeEOUB, 4);
        sparseIntArray.put(C48033uCm.Application.isAvailable, 5);
        sparseIntArray.put(C48033uCm.Application.sJqpAA, 6);
        sparseIntArray.put(C48033uCm.Application.UkvvWh, 7);
        sparseIntArray.put(C48033uCm.Application.UimiPO, 8);
        sparseIntArray.put(C48033uCm.Application.QVsKAR, 9);
        sparseIntArray.put(C48033uCm.Application.getOnBackPressedDispatcherannotations, 10);
        sparseIntArray.put(C48033uCm.Application.QYvkLl, 11);
    }

    public C50841vbk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, isConnected, AkhnZx));
    }

    public C50841vbk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Flow) objArr[4], (android.widget.ImageView) objArr[9], (C52705wVh) objArr[11], (Guideline) objArr[1], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[6], (android.widget.LinearLayout) objArr[5], (android.widget.TextView) objArr[7], (android.view.View) objArr[10], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
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
