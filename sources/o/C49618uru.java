package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import o.C49511upt;

/* JADX INFO: renamed from: o.uru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49618uru extends AbstractC49612uro {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C49511upt.Application.dxcTrN, 2);
        sparseIntArray.put(C49511upt.Application.djSkpj, 3);
        sparseIntArray.put(C49511upt.Application.fFgQHt, 4);
        sparseIntArray.put(C49511upt.Application.DAIeex, 5);
        sparseIntArray.put(C49511upt.Application.DNMMPQ, 6);
        sparseIntArray.put(C49511upt.Application.DsrFlB, 7);
        sparseIntArray.put(C49511upt.Application.RcXXUw, 8);
        sparseIntArray.put(C49511upt.Application.AxsJAYsNCnLh, 9);
    }

    public C49618uru(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 10, fetchVPNInfo, DbNXlk));
    }

    public C49618uru(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[8], (C55001xbh) objArr[3], (android.widget.TextView) objArr[4], (TextInputLayout) objArr[2], (ConstraintLayout) objArr[0], (android.widget.FrameLayout) objArr[9], (Barrier) objArr[5], (android.widget.FrameLayout) objArr[6], (android.widget.FrameLayout) objArr[7]);
        this.values = -1L;
        this.EZpvd.setTag(null);
        this.gEmmrt.setTag(null);
        setRootTag(viewArr);
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
