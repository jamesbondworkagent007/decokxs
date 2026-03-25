package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iME extends AbstractC23884iMx {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AYXKKw;

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
        sparseIntArray.put(C25493ixk.ActionBar.RidNCX, 1);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaItem, 2);
        sparseIntArray.put(C25493ixk.ActionBar.getDescription, 3);
        sparseIntArray.put(C25493ixk.ActionBar.onShuffleModeChanged, 4);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2, 5);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserServiceCallbackImpl, 6);
    }

    public iME(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, gEmmrt, AhwBna));
    }

    public iME(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[1], (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[5], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (android.view.View) objArr[4]);
        this.AYXKKw = -1L;
        this.EZpvd.setTag(null);
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
