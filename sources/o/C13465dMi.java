package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.dapp.view.DappBrowserMultiModeToolbar;
import o.dLX;

/* JADX INFO: renamed from: o.dMi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C13465dMi extends AbstractC13464dMh {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long valueOf;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(dLX.Application.DcqEDu, 2);
        sparseIntArray.put(dLX.Application.hBpjJd, 3);
        sparseIntArray.put(dLX.Application.dNCPSb, 4);
        sparseIntArray.put(dLX.Application.DAIeex, 5);
    }

    public C13465dMi(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, gEmmrt));
    }

    public C13465dMi(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (android.view.View) objArr[4], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[5], (android.widget.ProgressBar) objArr[3], (DappBrowserMultiModeToolbar) objArr[2]);
        this.valueOf = -1L;
        this.KWHzl.setTag(null);
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
