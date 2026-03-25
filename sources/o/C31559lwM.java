package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31559lwM extends AbstractC31558lwL {
    public static final ViewDataBinding.IncludedLayouts getFieldNames = null;
    public static final android.util.SparseIntArray iwGUEr;
    public long hDKMBd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31558lwL
    public void EZpvd(@androidx.annotation.Nullable OtcAgentTradeCardMessageViewProvider.StateListAnimator stateListAnimator) {
        this.djBIcL = stateListAnimator;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        iwGUEr = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.ejfBZ, 1);
        sparseIntArray.put(C31351lsQ.Application.DjwCMv, 2);
        sparseIntArray.put(C31351lsQ.Application.RXzakW, 3);
        sparseIntArray.put(C31351lsQ.Application.hNurIN, 4);
        sparseIntArray.put(C31351lsQ.Application.gCZUJG, 5);
        sparseIntArray.put(C31351lsQ.Application.apAOXX, 6);
        sparseIntArray.put(C31351lsQ.Application.ORWKdN, 7);
        sparseIntArray.put(C31351lsQ.Application.GPCHlQ, 8);
        sparseIntArray.put(C31351lsQ.Application.dbUqJD, 9);
        sparseIntArray.put(C31351lsQ.Application.DGUQLIdZmdUa, 10);
        sparseIntArray.put(C31351lsQ.Application.zSsVtY, 11);
        sparseIntArray.put(C31351lsQ.Application.fBE, 12);
        sparseIntArray.put(C31351lsQ.Application.setPageName, 13);
        sparseIntArray.put(C31351lsQ.Application.NRYds, 14);
        sparseIntArray.put(C31351lsQ.Application.dlRikr, 15);
        sparseIntArray.put(C31351lsQ.Application.fdt, 16);
        sparseIntArray.put(C31351lsQ.Application.UJEglR, 17);
        sparseIntArray.put(C31351lsQ.Application.finit, 18);
        sparseIntArray.put(C31351lsQ.Application.gsvlRV, 19);
        sparseIntArray.put(C31351lsQ.Application.hdpuIA, 20);
    }

    public C31559lwM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, getFieldNames, iwGUEr));
    }

    public C31559lwM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[1], (C52794wYp) objArr[18], (android.widget.TextView) objArr[3], (android.widget.LinearLayout) objArr[10], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12], (android.widget.ImageView) objArr[19], (android.widget.TextView) objArr[20], (android.widget.LinearLayout) objArr[4], (android.widget.TextView) objArr[5], (C57635ymD) objArr[6], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[13], (android.widget.ImageView) objArr[16], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[17], (android.widget.LinearLayout) objArr[15], (android.widget.LinearLayout) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[2]);
        this.hDKMBd = -1L;
        this.values.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C31350lsP.KWHzl != i) {
            return false;
        }
        EZpvd((OtcAgentTradeCardMessageViewProvider.StateListAnimator) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.hDKMBd = 0L;
        }
    }
}
