package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iMs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23879iMs extends AbstractC23881iMu {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2, 1);
        sparseIntArray.put(C25493ixk.ActionBar.RidNCX, 2);
        sparseIntArray.put(C25493ixk.ActionBar.fromMediaItemList, 3);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaItem, 4);
        sparseIntArray.put(C25493ixk.ActionBar.getDescription, 5);
        sparseIntArray.put(C25493ixk.ActionBar.onShuffleModeChanged, 6);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserServiceCallbackImpl, 7);
    }

    public C23879iMs(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, AYXKKw));
    }

    public C23879iMs(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (android.widget.ImageView) objArr[7], (android.widget.LinearLayout) objArr[0], (android.widget.ImageView) objArr[1], (C55113xdn) objArr[3], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.view.View) objArr[6]);
        this.AkhnZx = -1L;
        this.EZpvd.setTag(null);
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
