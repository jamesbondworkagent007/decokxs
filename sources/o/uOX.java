package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uOX extends uOW {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
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
        sparseIntArray.put(C48033uCm.Application.setPositiveButton, 1);
        sparseIntArray.put(C48033uCm.Application.setOnItemSelectedListener, 2);
        sparseIntArray.put(C48033uCm.Application.getWindowCallback, 3);
        sparseIntArray.put(C48033uCm.Application.getSubDecor, 4);
        sparseIntArray.put(C48033uCm.Application.AppCompatViewInflaterDeclaredOnClickListener, 5);
        sparseIntArray.put(C48033uCm.Application.createRatingBar, 6);
        sparseIntArray.put(C48033uCm.Application.getResultContract, 7);
        sparseIntArray.put(C48033uCm.Application.reportRunnablelambda2, 8);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImpl1, 9);
        sparseIntArray.put(C48033uCm.Application.geAOna, 10);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatCustomActionBuilder, 11);
    }

    public uOX(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, DbNXlk, fetchVPNInfo));
    }

    public uOX(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[10], (RecyclerView) objArr[11], (ConstraintLayout) objArr[8], (C33546myW) objArr[0], (android.view.View) objArr[7], (android.widget.TextView) objArr[2], (C55258xgZ) objArr[1], (android.widget.TextView) objArr[4], (C55258xgZ) objArr[3], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[6], (C55258xgZ) objArr[5]);
        this.isConnected = -1L;
        this.copydefault.setTag(null);
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
