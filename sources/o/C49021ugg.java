package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.edit.OKEditText;
import o.C48931uew;

/* JADX INFO: renamed from: o.ugg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49021ugg extends AbstractC49025ugk {
    public static final ViewDataBinding.IncludedLayouts AuCTelauCTel = null;
    public static final android.util.SparseIntArray wlaJM;
    public long zsXlph;

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
        wlaJM = sparseIntArray;
        sparseIntArray.put(C48931uew.StateListAnimator.iRxXKY, 1);
        sparseIntArray.put(C48931uew.StateListAnimator.AhwBna, 2);
        sparseIntArray.put(C48931uew.StateListAnimator.QSBOWP, 3);
        sparseIntArray.put(C48931uew.StateListAnimator.fJNWhG, 4);
        sparseIntArray.put(C48931uew.StateListAnimator.QHmsKR, 5);
        sparseIntArray.put(C48931uew.StateListAnimator.ejfBZ, 6);
        sparseIntArray.put(C48931uew.StateListAnimator.OBJEWx, 7);
        sparseIntArray.put(C48931uew.StateListAnimator.values, 8);
        sparseIntArray.put(C48931uew.StateListAnimator.ffGIBT, 9);
        sparseIntArray.put(C48931uew.StateListAnimator.fARcdN, 10);
        sparseIntArray.put(C48931uew.StateListAnimator.RKDWNf, 11);
        sparseIntArray.put(C48931uew.StateListAnimator.AuCTel, 12);
        sparseIntArray.put(C48931uew.StateListAnimator.valueOf, 13);
        sparseIntArray.put(C48931uew.StateListAnimator.AYXKKw, 14);
        sparseIntArray.put(C48931uew.StateListAnimator.DCUTEI, 15);
        sparseIntArray.put(C48931uew.StateListAnimator.isConnected, 16);
        sparseIntArray.put(C48931uew.StateListAnimator.zuWLRA, 17);
        sparseIntArray.put(C48931uew.StateListAnimator.djBIcL, 18);
        sparseIntArray.put(C48931uew.StateListAnimator.DXXBbs, 19);
        sparseIntArray.put(C48931uew.StateListAnimator.hDKMBd, 20);
        sparseIntArray.put(C48931uew.StateListAnimator.uzCIH, 21);
        sparseIntArray.put(C48931uew.StateListAnimator.hBpjJd, 22);
        sparseIntArray.put(C48931uew.StateListAnimator.wlaJM, 23);
        sparseIntArray.put(C48931uew.StateListAnimator.zuBGHE, 24);
        sparseIntArray.put(C48931uew.StateListAnimator.fIwbmz, 25);
    }

    public C49021ugg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 26, AuCTelauCTel, wlaJM));
    }

    public C49021ugg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[2], (C52794wYp) objArr[18], (C52794wYp) objArr[14], (C52794wYp) objArr[13], (C52794wYp) objArr[16], (C52794wYp) objArr[8], (C52794wYp) objArr[10], (C52794wYp) objArr[6], (C52794wYp) objArr[12], (C52794wYp) objArr[25], (C52794wYp) objArr[4], (C52794wYp) objArr[21], (android.widget.FrameLayout) objArr[20], (OKEditText) objArr[23], (OKEditText) objArr[24], (NestedScrollView) objArr[0], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[22]);
        this.zsXlph = -1L;
        this.fARcdN.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.zsXlph = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.zsXlph != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.zsXlph = 0L;
        }
    }
}
