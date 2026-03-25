package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.tradingbot.impl.strategy.view.TickerIconView;

/* JADX INFO: renamed from: o.vcs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50902vcs extends AbstractC50899vcp {
    public static final android.util.SparseIntArray AYXKKw = null;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AhwBna;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C50902vcs(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 7, gEmmrt, AYXKKw));
    }

    public C50902vcs(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.TextView) objArr[5], (C55251xgS) objArr[1], (TickerIconView) objArr[6], (android.widget.TextView) objArr[3], (C55251xgS) objArr[0], (TickerIconView) objArr[4], (Barrier) objArr[2]);
        this.AhwBna = -1L;
        this.OLrzqt.setTag(null);
        this.KWHzl.setTag(null);
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.EZpvd.setTag(null);
        this.valueOf.setTag(null);
        this.djBIcL.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
