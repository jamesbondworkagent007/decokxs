package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uPY extends uPX {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final ConstraintLayout AkhnZx;
    public long values;

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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.isFullyDrawnReported, 1);
        sparseIntArray.put(C48033uCm.Application.flushLollipops, 2);
        sparseIntArray.put(C48033uCm.Application.StyleRes, 3);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImpl, 4);
        sparseIntArray.put(C48033uCm.Application.checkCloseActionMenu, 5);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplActionBarMenuCallback, 6);
        sparseIntArray.put(C48033uCm.Application.ActionBarTabListener, 7);
        sparseIntArray.put(C48033uCm.Application.RcvFxC, 8);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatApi22, 9);
        sparseIntArray.put(C48033uCm.Application.profile, 10);
    }

    public uPY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, isConnected, fetchVPNInfo));
    }

    public uPY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[10], (android.widget.TextView) objArr[8], (RecyclerView) objArr[9], (NestedScrollView) objArr[1], (C55372xih) objArr[3], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[2]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
