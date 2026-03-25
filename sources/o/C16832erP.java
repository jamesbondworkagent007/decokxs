package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16832erP extends AbstractC16828erL {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long AYXKKw;
    public final ConstraintLayout gEmmrt;

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
        sparseIntArray.put(C13754dXa.ActionBar.aWJMta, 1);
        sparseIntArray.put(C13754dXa.ActionBar.getQueueId, 2);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi211, 3);
        sparseIntArray.put(C13754dXa.ActionBar.jNexW, 4);
        sparseIntArray.put(C13754dXa.ActionBar.invokespecialDaTmkG, 5);
        sparseIntArray.put(C13754dXa.ActionBar.aKhcqp, 6);
    }

    public C16832erP(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, djBIcL, AhwBna));
    }

    public C16832erP(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55251xgS) objArr[5], (C10324bmM) objArr[6], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.gEmmrt = constraintLayout;
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
