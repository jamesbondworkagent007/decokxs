package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50858vcA extends AbstractC50860vcC {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public final android.widget.LinearLayout AuCTel;
    public final android.widget.LinearLayout fARcdN;
    public long fetchVPNInfo;

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
        sparseIntArray.put(C48033uCm.Application.cleanup, 5);
        sparseIntArray.put(C48033uCm.Application.gwTjWJ, 6);
        sparseIntArray.put(C48033uCm.Application.nriSR, 7);
        sparseIntArray.put(C48033uCm.Application.dHAKvv, 8);
        sparseIntArray.put(C48033uCm.Application.supportInvalidateOptionsMenu, 9);
        sparseIntArray.put(C48033uCm.Application.setSupportProgressBarIndeterminate, 10);
        sparseIntArray.put(C48033uCm.Application.setSupportProgressBarIndeterminateVisibility, 11);
        sparseIntArray.put(C48033uCm.Application.onWindowStartingSupportActionMode, 12);
        sparseIntArray.put(C48033uCm.Application.setSupportProgress, 13);
    }

    public C50858vcA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 14, DbNXlk, AkhnZx));
    }

    public C50858vcA(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.FrameLayout) objArr[6], (C55001xbh) objArr[7], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[8], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[0], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[5]);
        this.fetchVPNInfo = -1L;
        this.copydefault.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[2];
        this.fARcdN = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) objArr[3];
        this.AuCTel = linearLayout2;
        linearLayout2.setTag(null);
        this.OLrzqt.setTag(null);
        this.djBIcL.setTag(null);
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
