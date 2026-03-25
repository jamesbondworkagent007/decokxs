package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uXJ extends uXM {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.setHomeAsUpIndicator, 5);
        sparseIntArray.put(C48033uCm.Application.zUtmHU, 6);
        sparseIntArray.put(C48033uCm.Application.FractionRes, 7);
        sparseIntArray.put(C48033uCm.Application.getSupportActionBar, 8);
        sparseIntArray.put(C48033uCm.Application.TwilightCalculator, 9);
        sparseIntArray.put(C48033uCm.Application.getLocalNightMode, 10);
    }

    public uXJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 11, fetchVPNInfo, AkhnZx));
    }

    public uXJ(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[1], (C55372xih) objArr[7], (ConstraintLayout) objArr[0], (C55379xio) objArr[5], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[4], (C50032uzk) objArr[10], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[9]);
        this.isConnected = -1L;
        this.copydefault.setTag(null);
        this.OLrzqt.setTag(null);
        this.AYXKKw.setTag(null);
        this.AhwBna.setTag(null);
        this.valueOf.setTag(null);
        setRootTag(viewArr);
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
