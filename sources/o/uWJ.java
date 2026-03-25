package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uWJ extends uWI {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final ConstraintLayout DbNXlk;
    public long isConnected;

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
        sparseIntArray.put(C48033uCm.Application.ComponentDialog, 1);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImpl, 2);
        sparseIntArray.put(C48033uCm.Application.attributeId, 3);
        sparseIntArray.put(C48033uCm.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, 4);
        sparseIntArray.put(C48033uCm.Application.getDrawerToggleDelegate, 5);
        sparseIntArray.put(C48033uCm.Application.toggle, 6);
        sparseIntArray.put(C48033uCm.Application.InterpolatorRes, 7);
        sparseIntArray.put(C48033uCm.Application.ActionBarDrawerToggleToolbarCompatDelegate, 8);
        sparseIntArray.put(C48033uCm.Application.Nullable, 9);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatCallbackHandler, 10);
    }

    public uWJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, AkhnZx, fetchVPNInfo));
    }

    public uWJ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[9], (Barrier) objArr[6], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[8]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
