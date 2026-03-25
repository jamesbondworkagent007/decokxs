package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uXK extends uXI {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long fJNWhG;

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
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBar, 9);
        sparseIntArray.put(C48033uCm.Application.populateOptionsMenu, 10);
        sparseIntArray.put(C48033uCm.Application.aUsmxb, 11);
        sparseIntArray.put(C48033uCm.Application.setDefaultNightMode, 12);
    }

    public uXK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 13, values, fetchVPNInfo));
    }

    public uXK(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (AppCompatImageView) objArr[11], (ConstraintLayout) objArr[7], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[0], (C55379xio) objArr[3], (C55372xih) objArr[1], (C55379xio) objArr[2], (Barrier) objArr[4], (C50032uzk) objArr[12], (AppCompatTextView) objArr[10], (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[5]);
        this.fJNWhG = -1L;
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.OLrzqt.setTag(null);
        this.KWHzl.setTag(null);
        this.AhwBna.setTag(null);
        this.valueOf.setTag(null);
        this.AYXKKw.setTag(null);
        this.AkhnZx.setTag(null);
        this.isConnected.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fJNWhG = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fJNWhG != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fJNWhG = 0L;
        }
    }
}
