package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uQz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48424uQz extends uQB {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long isConnected;
    public final ConstraintLayout values;

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
        sparseIntArray.put(C48033uCm.Application.dTTfOR, 1);
        sparseIntArray.put(C48033uCm.Application.onPrepare, 2);
        sparseIntArray.put(C48033uCm.Application.setPipParamsSourceRectHint, 3);
        sparseIntArray.put(C48033uCm.Application.fObYrO, 4);
        sparseIntArray.put(C48033uCm.Application.onPrepareFromUri, 5);
        sparseIntArray.put(C48033uCm.Application.onPrepareFromSearch, 6);
        sparseIntArray.put(C48033uCm.Application.OCdtug, 7);
        sparseIntArray.put(C48033uCm.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0, 8);
    }

    public C48424uQz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, djBIcL));
    }

    public C48424uQz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[7], (android.view.View) objArr[4], (AppCompatImageView) objArr[1], (RecyclerView) objArr[6], (AppCompatTextView) objArr[2], (C33546myW) objArr[5], (AppCompatTextView) objArr[3], (C55113xdn) objArr[8]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
