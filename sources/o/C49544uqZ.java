package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49544uqZ extends AbstractC49601urd {
    public static final android.util.SparseIntArray EZpvd;
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public final android.widget.LinearLayout AhwBna;
    public long valueOf;

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
        EZpvd = sparseIntArray;
        sparseIntArray.put(C49511upt.Application.zlvcHA, 1);
        sparseIntArray.put(C49511upt.Application.DbNXlk, 2);
        sparseIntArray.put(C49511upt.Application.isConnected, 3);
    }

    public C49544uqZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, copydefault, EZpvd));
    }

    public C49544uqZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[3], (C55239xgG) objArr[2], (C55258xgZ) objArr[1]);
        this.valueOf = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AhwBna = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
