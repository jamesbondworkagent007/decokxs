package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public class hCS extends hCR {
    public static final android.util.SparseIntArray KWHzl;
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public long AYXKKw;
    public final LinearLayoutCompat gEmmrt;

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
        KWHzl = sparseIntArray;
        sparseIntArray.put(C23274hvD.Application.UiContext, 1);
        sparseIntArray.put(C23274hvD.Application.VisibleForTesting, 2);
        sparseIntArray.put(C23274hvD.Application.ActivityResultCallerKtExternalSyntheticLambda1, 3);
    }

    public hCS(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, copydefault, KWHzl));
    }

    public hCS(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55251xgS) objArr[3], (C55258xgZ) objArr[1], (AppCompatTextView) objArr[2]);
        this.AYXKKw = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.gEmmrt = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
