package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16983euH extends AbstractC16982euG {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final ConstraintLayout isConnected;

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
        sparseIntArray.put(C13754dXa.ActionBar.init, 1);
        sparseIntArray.put(C13754dXa.ActionBar.onStart, 2);
        sparseIntArray.put(C13754dXa.ActionBar.max, 3);
        sparseIntArray.put(C13754dXa.ActionBar.SUwuXE, 4);
        sparseIntArray.put(C13754dXa.ActionBar.onStateChanged, 5);
        sparseIntArray.put(C13754dXa.ActionBar.getTabCount, 6);
        sparseIntArray.put(C13754dXa.ActionBar.RcXXUw, 7);
    }

    public C16983euH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AhwBna, valueOf));
    }

    public C16983euH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55251xgS) objArr[7], (ConstraintLayout) objArr[1], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[2], (C55251xgS) objArr[5], (android.view.View) objArr[3], (C55251xgS) objArr[6]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
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
