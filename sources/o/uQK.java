package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQK extends uQG {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public final NestedScrollView AkhnZx;
    public long fetchVPNInfo;

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
        values = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DjzMc, 1);
        sparseIntArray.put(C48033uCm.Application.validateRelationship, 2);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi21, 3);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi213, 4);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi211, 5);
        sparseIntArray.put(C48033uCm.Application.RequiresOptIn, 6);
        sparseIntArray.put(C48033uCm.Application.UnZVfq, 7);
        sparseIntArray.put(C48033uCm.Application.RidNCX, 8);
        sparseIntArray.put(C48033uCm.Application.unregisterMediaButtonEventReceiver, 9);
        sparseIntArray.put(C48033uCm.Application.UNDaji, 10);
    }

    public uQK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, isConnected, values));
    }

    public uQK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53030wdm) objArr[8], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[7], (LinearLayoutCompat) objArr[1], (ConstraintLayout) objArr[2], (AppCompatImageView) objArr[4], (android.widget.LinearLayout) objArr[3], (C55258xgZ) objArr[5], (android.widget.FrameLayout) objArr[9], (android.view.View) objArr[6]);
        this.fetchVPNInfo = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.AkhnZx = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
