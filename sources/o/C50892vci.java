package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.vci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50892vci extends AbstractC50890vcg {
    public static final android.util.SparseIntArray AkhnZx = null;
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public long isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C50892vci(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 10, DbNXlk, AkhnZx));
    }

    public C50892vci(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[8], (LinearLayoutCompat) objArr[3], (C55379xio) objArr[2], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[0], (C55379xio) objArr[1]);
        this.isConnected = -1L;
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        this.KWHzl.setTag(null);
        this.gEmmrt.setTag(null);
        this.AhwBna.setTag(null);
        this.djBIcL.setTag(null);
        this.AYXKKw.setTag(null);
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
