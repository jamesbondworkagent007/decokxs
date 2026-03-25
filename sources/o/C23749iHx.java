package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23749iHx extends AbstractC23748iHw {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long ejfBZ;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.UimiPO, 1);
        sparseIntArray.put(C25493ixk.ActionBar.QXDzTk, 2);
        sparseIntArray.put(C25493ixk.ActionBar.fdt, 3);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21, 4);
        sparseIntArray.put(C25493ixk.ActionBar.unregisterCallbackMessenger, 5);
        sparseIntArray.put(C25493ixk.ActionBar.OqFWZa, 6);
        sparseIntArray.put(C25493ixk.ActionBar.gBtXYZ, 7);
        sparseIntArray.put(C25493ixk.ActionBar.DUUtXg, 8);
        sparseIntArray.put(C25493ixk.ActionBar.ruDxL, 9);
        sparseIntArray.put(C25493ixk.ActionBar.dXcUrg, 10);
        sparseIntArray.put(C25493ixk.ActionBar.onSessionDestroyed, 11);
        sparseIntArray.put(C25493ixk.ActionBar.giSNqX, 12);
    }

    public C23749iHx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, AkhnZx));
    }

    public C23749iHx(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[12], (android.widget.ImageView) objArr[6], (ConstraintLayout) objArr[2], (android.widget.ImageView) objArr[8], (android.widget.FrameLayout) objArr[7], (android.widget.ImageView) objArr[3], (android.view.View) objArr[10], (android.widget.LinearLayout) objArr[0], (NestedScrollView) objArr[9], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (android.widget.FrameLayout) objArr[11]);
        this.ejfBZ = -1L;
        this.AYXKKw.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
