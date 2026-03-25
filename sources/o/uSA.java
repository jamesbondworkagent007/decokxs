package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uSA extends uSC {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray AhwBna;
    public final android.widget.LinearLayout isConnected;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.postOrRun, 1);
        sparseIntArray.put(C48033uCm.Application.ICustomTabsCallback, 2);
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBarActionModeImpl, 3);
        sparseIntArray.put(C48033uCm.Application.DaRZkR, 4);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 5);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 6);
        sparseIntArray.put(C48033uCm.Application.putString, 7);
        sparseIntArray.put(C48033uCm.Application.onScrollChanged, 8);
    }

    public uSA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AYXKKw, AhwBna));
    }

    public uSA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53539wnR) objArr[4], (android.widget.TextView) objArr[5], (C47988uAv) objArr[2], (C50191vFg) objArr[1], (vKO) objArr[7], (vKO) objArr[8], (uBL) objArr[3], (C54154wyx) objArr[6]);
        this.values = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.isConnected = linearLayout;
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
