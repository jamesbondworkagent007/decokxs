package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uXe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48594uXe extends uWZ {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long fIwbmz;

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
        sparseIntArray.put(C48033uCm.Application.uzCIH, 3);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatPlaybackInfo, 4);
        sparseIntArray.put(C48033uCm.Application.hDKMBd, 5);
        sparseIntArray.put(C48033uCm.Application.openFileOutput, 6);
        sparseIntArray.put(C48033uCm.Application.CheckResult, 7);
        sparseIntArray.put(C48033uCm.Application.suggest, 8);
        sparseIntArray.put(C48033uCm.Application.component2, 9);
        sparseIntArray.put(C48033uCm.Application.ChecksSdkIntAtLeast, 10);
        sparseIntArray.put(C48033uCm.Application.RequiresOptIn, 11);
        sparseIntArray.put(C48033uCm.Application.fmdvVn, 12);
    }

    public C48594uXe(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 13, isConnected, fetchVPNInfo));
    }

    public C48594uXe(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (AppCompatImageView) objArr[5], (LinearLayoutCompat) objArr[2], (LinearLayoutCompat) objArr[0], (C55258xgZ) objArr[3], (android.widget.TextView) objArr[12], (LinearLayoutCompat) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[7], (android.view.View) objArr[11]);
        this.fIwbmz = -1L;
        this.OLrzqt.setTag(null);
        this.KWHzl.setTag(null);
        this.valueOf.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
