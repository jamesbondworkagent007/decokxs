package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uSB extends AbstractC48478uSx {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final android.widget.LinearLayout DbNXlk;
    public long gEmmrt;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.postOrRun, 1);
        sparseIntArray.put(C48033uCm.Application.ICustomTabsCallback, 2);
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBarActionModeImpl, 3);
        sparseIntArray.put(C48033uCm.Application.DaRZkR, 4);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 5);
        sparseIntArray.put(C48033uCm.Application.putString, 6);
        sparseIntArray.put(C48033uCm.Application.onScrollChanged, 7);
    }

    public uSB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, valueOf, AYXKKw));
    }

    public uSB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53539wnR) objArr[4], (android.widget.TextView) objArr[5], (C47988uAv) objArr[2], (C50191vFg) objArr[1], (vKO) objArr[6], (vKO) objArr[7], (uBL) objArr[3]);
        this.gEmmrt = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.DbNXlk = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
