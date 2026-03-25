package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.uYo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48631uYo extends AbstractC48629uYm {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray values = null;
    public long fetchVPNInfo;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C48631uYo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 12, AkhnZx, values));
    }

    public C48631uYo(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C52794wYp) objArr[11], (AppCompatTextView) objArr[6], (android.view.View) objArr[5], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[1], (RecyclerView) objArr[10], (AppCompatTextView) objArr[0], (AppCompatTextView) objArr[8], (Barrier) objArr[4], (Barrier) objArr[9]);
        this.fetchVPNInfo = -1L;
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.KWHzl.setTag(null);
        this.AhwBna.setTag(null);
        this.AYXKKw.setTag(null);
        this.valueOf.setTag(null);
        this.gEmmrt.setTag(null);
        this.djBIcL.setTag(null);
        this.isConnected.setTag(null);
        this.DbNXlk.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
