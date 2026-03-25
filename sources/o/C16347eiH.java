package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16347eiH extends AbstractC16351eiL {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final ConstraintLayout isConnected;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.XW, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ibrGus, 3);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickVisualMediaVideoOnly, 5);
        sparseIntArray.put(C13754dXa.ActionBar.getTag, 6);
        sparseIntArray.put(C13754dXa.ActionBar.DzkRMH, 7);
    }

    public C16347eiH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, gEmmrt));
    }

    public C16347eiH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (NestedScrollView) objArr[2], (C52794wYp) objArr[7], (android.widget.ImageView) objArr[3], (RecyclerView) objArr[6], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
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
