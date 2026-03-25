package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16299ehM extends AbstractC16296ehJ {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public final CoordinatorLayout AYXKKw;
    public long djBIcL;

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
        sparseIntArray.put(C13754dXa.ActionBar.AxsJAYsNCnLh, 1);
        sparseIntArray.put(C13754dXa.ActionBar.getStatusCode, 2);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatCallbackStubApi23, 3);
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiver, 4);
        sparseIntArray.put(C13754dXa.ActionBar.putInt, 5);
    }

    public C16299ehM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, gEmmrt, valueOf));
    }

    public C16299ehM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[1], (CollapsingToolbarLayout) objArr[2], (android.widget.FrameLayout) objArr[5], (androidx.legacy.widget.Space) objArr[3], (androidx.appcompat.widget.Toolbar) objArr[4]);
        this.djBIcL = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.AYXKKw = coordinatorLayout;
        coordinatorLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
