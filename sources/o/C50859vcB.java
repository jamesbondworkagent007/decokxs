package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50859vcB extends AbstractC50909vcz {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long uzCIH;

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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.onActionItemClicked, 9);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImpl61, 10);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplAutoBatteryNightModeManager, 11);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatSessionFlags, 12);
        sparseIntArray.put(C48033uCm.Application.getQueueItem, 13);
        sparseIntArray.put(C48033uCm.Application.dxcTrN, 14);
        sparseIntArray.put(C48033uCm.Application.fFgQHt, 15);
        sparseIntArray.put(C48033uCm.Application.createViewFromTag, 16);
        sparseIntArray.put(C48033uCm.Application.verifyNotNull, 17);
    }

    public C50859vcB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 18, ejfBZ, fIwbmz));
    }

    public C50859vcB(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[15], (C49576urE) objArr[3], (C49576urE) objArr[6], (C51006veq) objArr[7], (C49581urJ) objArr[8], (android.widget.TextView) objArr[4], (android.widget.LinearLayout) objArr[5], (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[10], (C55251xgS) objArr[9], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[17], (android.widget.LinearLayout) objArr[2], (android.widget.LinearLayout) objArr[1]);
        this.uzCIH = -1L;
        this.OLrzqt.setTag(null);
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.valueOf.setTag(null);
        this.AYXKKw.setTag(null);
        this.gEmmrt.setTag(null);
        this.AhwBna.setTag(null);
        this.fJNWhG.setTag(null);
        this.AuCTel.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.uzCIH = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.uzCIH != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.uzCIH = 0L;
        }
    }
}
