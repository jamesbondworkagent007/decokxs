package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes6.dex */
public class iLA extends iLC {
    public static final android.util.SparseIntArray fetchVPNInfo = null;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public iLA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 9, valueOf, fetchVPNInfo));
    }

    public iLA(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[7], (C27212jqt) objArr[1], (android.widget.LinearLayout) objArr[6], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[5], (android.widget.TextView) objArr[0], (android.widget.TextView) objArr[2], (C55258xgZ) objArr[8]);
        this.isConnected = -1L;
        this.OLrzqt.setTag(null);
        this.AEQbTJ.setTag(null);
        this.KWHzl.setTag(null);
        this.copydefault.setTag(null);
        this.EZpvd.setTag(null);
        this.gEmmrt.setTag(null);
        this.AhwBna.setTag(null);
        this.djBIcL.setTag(null);
        this.AYXKKw.setTag(null);
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
