package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.dapp.webview.DappTabData;
import o.dLX;

/* JADX INFO: renamed from: o.dMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C13470dMn extends AbstractC13473dMq {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long AYXKKw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@androidx.annotation.Nullable DappTabData dappTabData) {
        this.copydefault = dappTabData;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        gEmmrt = sparseIntArray;
        sparseIntArray.put(dLX.Application.DCUTEIddSDPG, 1);
        sparseIntArray.put(dLX.Application.gGvvIC, 2);
        sparseIntArray.put(dLX.Application.WS, 3);
        sparseIntArray.put(dLX.Application.AuCTelauCTel, 4);
        sparseIntArray.put(dLX.Application.DCUTEIdCUTEI, 5);
    }

    public C13470dMn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, gEmmrt));
    }

    public C13470dMn(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[4], (android.widget.ImageView) objArr[2], (ConstraintLayout) objArr[0], (C55064xcr) objArr[5], (android.widget.TextView) objArr[3], (android.widget.RelativeLayout) objArr[1]);
        this.AYXKKw = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dLZ.EZpvd != i) {
            return false;
        }
        copydefault((DappTabData) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
