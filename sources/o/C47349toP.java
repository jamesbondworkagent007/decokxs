package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import o.C47315tni;

/* JADX INFO: renamed from: o.toP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47349toP extends AbstractC47347toN {
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public static final android.util.SparseIntArray OLrzqt;
    public long gEmmrt;
    public final CoordinatorLayout valueOf;

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
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.EZpvd, 1);
        sparseIntArray.put(C47315tni.TaskDescription.finit, 2);
        sparseIntArray.put(C47315tni.TaskDescription.dxcTrN, 3);
    }

    public C47349toP(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, KWHzl, OLrzqt));
    }

    public C47349toP(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[1], (android.widget.FrameLayout) objArr[2], (android.widget.FrameLayout) objArr[3]);
        this.gEmmrt = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.valueOf = coordinatorLayout;
        coordinatorLayout.setTag(null);
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
