package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iLo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23848iLo extends AbstractC23846iLm {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
    public long AkhnZx;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.setSubtitle, 1);
        sparseIntArray.put(C25493ixk.ActionBar.registerCallbackMessenger, 2);
        sparseIntArray.put(C25493ixk.ActionBar.removeSubscription, 3);
        sparseIntArray.put(C25493ixk.ActionBar.gezFCt, 4);
        sparseIntArray.put(C25493ixk.ActionBar.ddauOi, 5);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplApi212, 6);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplApi21, 7);
    }

    public C23848iLo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AhwBna, djBIcL));
    }

    public C23848iLo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[1], (ConstraintLayout) objArr[0]);
        this.AkhnZx = -1L;
        this.valueOf.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
