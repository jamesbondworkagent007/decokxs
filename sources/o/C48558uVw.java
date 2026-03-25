package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uVw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48558uVw extends AbstractC48554uVs {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final NestedScrollView djBIcL;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.AnimRes, 1);
        sparseIntArray.put(C48033uCm.Application.setContentdefault, 2);
        sparseIntArray.put(C48033uCm.Application.resultCodeToString, 3);
        sparseIntArray.put(C48033uCm.Application.ActivityResultRegistryKtrememberLauncherForActivityResultkey1, 4);
        sparseIntArray.put(C48033uCm.Application.createFromXmlInner, 5);
    }

    public C48558uVw(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AhwBna, valueOf));
    }

    public C48558uVw(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (RecyclerView) objArr[4], (C33546myW) objArr[3], (android.widget.TextView) objArr[1], (C55113xdn) objArr[5]);
        this.AYXKKw = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.djBIcL = nestedScrollView;
        nestedScrollView.setTag(null);
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
