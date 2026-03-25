package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uWj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48572uWj extends AbstractC48568uWf {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray DbNXlk;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.QXDzTk, 11);
    }

    public C48572uWj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 12, AkhnZx, DbNXlk));
    }

    public C48572uWj(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.ImageView) objArr[11], (Barrier) objArr[3], (AppCompatTextView) objArr[0], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[5], (android.widget.FrameLayout) objArr[1], (AppCompatTextView) objArr[10], (C55258xgZ) objArr[9], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[2], (C51293vkL) objArr[4]);
        this.isConnected = -1L;
        this.EZpvd.setTag(null);
        this.AEQbTJ.setTag(null);
        this.KWHzl.setTag(null);
        this.copydefault.setTag(null);
        this.AhwBna.setTag(null);
        this.djBIcL.setTag(null);
        this.gEmmrt.setTag(null);
        this.valueOf.setTag(null);
        this.AYXKKw.setTag(null);
        this.fetchVPNInfo.setTag(null);
        this.values.setTag(null);
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
