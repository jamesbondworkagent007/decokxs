package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQQ extends uQO {
    public static final ViewDataBinding.IncludedLayouts QUSxYX = null;
    public static final android.util.SparseIntArray QfsBiF;
    public long QVAiDq;
    public final C50942vdf QbewEr;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        QfsBiF = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.gLWkOL, 4);
        sparseIntArray.put(C48033uCm.Application.QBiWsm, 5);
        sparseIntArray.put(C48033uCm.Application.UrRBLY, 6);
        sparseIntArray.put(C48033uCm.Application.fHqPtx, 7);
        sparseIntArray.put(C48033uCm.Application.IMediaSessionStub, 8);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseCommand, 9);
        sparseIntArray.put(C48033uCm.Application.playFromSearch, 10);
        sparseIntArray.put(C48033uCm.Application.DtnWsU, 11);
        sparseIntArray.put(C48033uCm.Application.removeCancellable, 12);
        sparseIntArray.put(C48033uCm.Application.sQOHWT, 13);
        sparseIntArray.put(C48033uCm.Application.getConnectivityMgr, 14);
        sparseIntArray.put(C48033uCm.Application.FF, 15);
        sparseIntArray.put(C48033uCm.Application.OHsvZP, 16);
        sparseIntArray.put(C48033uCm.Application.target, 17);
        sparseIntArray.put(C48033uCm.Application.postOrRun, 18);
        sparseIntArray.put(C48033uCm.Application.onRepeatModeChanged, 19);
        sparseIntArray.put(C48033uCm.Application.jNexW, 20);
        sparseIntArray.put(C48033uCm.Application.applyOptions, 21);
        sparseIntArray.put(C48033uCm.Application.fbC, 22);
        sparseIntArray.put(C48033uCm.Application.notifyNotificationWithChannel, 23);
        sparseIntArray.put(C48033uCm.Application.aPFruk, 24);
        sparseIntArray.put(C48033uCm.Application.setSubscription, 25);
        sparseIntArray.put(C48033uCm.Application.hasWindowFeature, 26);
        sparseIntArray.put(C48033uCm.Application.svUkWZ, 27);
        sparseIntArray.put(C48033uCm.Application.attachBaseContext2, 28);
        sparseIntArray.put(C48033uCm.Application.dXhJGx, 29);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 30);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatSearchResultReceiver, 31);
        sparseIntArray.put(C48033uCm.Application.dispatchMenuVisibilityChanged, 32);
        sparseIntArray.put(C48033uCm.Application.putString, 33);
        sparseIntArray.put(C48033uCm.Application.onScrollChanged, 34);
        sparseIntArray.put(C48033uCm.Application.NavItemSelectedListener, 35);
        sparseIntArray.put(C48033uCm.Application.setOnDismissListener, 36);
        sparseIntArray.put(C48033uCm.Application.RIsQag, 37);
        sparseIntArray.put(C48033uCm.Application.send, 38);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 39);
        sparseIntArray.put(C48033uCm.Application.wlaJM, 40);
    }

    public uQQ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 41, QUSxYX, QfsBiF));
    }

    public uQQ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (vKL) objArr[40], (C53513wms) objArr[7], (android.widget.FrameLayout) objArr[6], (wYK) objArr[22], (ConstraintLayout) objArr[20], (C53549wnb) objArr[4], (android.widget.TextView) objArr[11], (LinearLayoutCompat) objArr[1], (android.widget.TextView) objArr[16], (C55258xgZ) objArr[14], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[30], (android.widget.TextView) objArr[5], (android.widget.FrameLayout) objArr[24], (C55258xgZ) objArr[37], (C53539wnR) objArr[29], (C53539wnR) objArr[2], (C47988uAv) objArr[13], (ConstraintLayout) objArr[0], (C47988uAv) objArr[27], (C55320xhi) objArr[23], (C50348vLb) objArr[18], (android.widget.LinearLayout) objArr[21], (android.widget.LinearLayout) objArr[25], (android.widget.LinearLayout) objArr[31], (vKO) objArr[33], (C47988uAv) objArr[19], (C47988uAv) objArr[10], (C47988uAv) objArr[8], (android.widget.TextView) objArr[9], (RecyclerView) objArr[38], (C55258xgZ) objArr[12], (vKO) objArr[34], (android.widget.TextView) objArr[17], (vKO) objArr[32], (android.widget.TextView) objArr[36], (android.widget.TextView) objArr[28], (C55258xgZ) objArr[26], (android.widget.TextView) objArr[35], (C54154wyx) objArr[39]);
        this.QVAiDq = -1L;
        this.AhwBna.setTag(null);
        this.fJNWhG.setTag(null);
        this.fARcdN.setTag(null);
        java.lang.Object obj = objArr[3];
        this.QbewEr = obj != null ? C50942vdf.EZpvd((android.view.View) obj) : null;
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.QVAiDq = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.QVAiDq != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C48034uCn.OLrzqt != i) {
            return false;
        }
        OLrzqt((C55915xsu) obj);
        return true;
    }

    public void OLrzqt(@androidx.annotation.Nullable C55915xsu c55915xsu) {
        this.wlaJM = c55915xsu;
        synchronized (this) {
            this.QVAiDq |= 2;
        }
        notifyPropertyChanged(C48034uCn.OLrzqt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return KWHzl((ObservableField) obj, i2);
    }

    private boolean KWHzl(ObservableField<MaxAvailableResp> observableField, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.QVAiDq |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.QVAiDq;
            this.QVAiDq = 0L;
        }
        C55915xsu c55915xsu = this.wlaJM;
        long j2 = j & 7;
        java.lang.String strOLrzqt = null;
        if (j2 != 0) {
            ObservableField<MaxAvailableResp> observableFieldAEQbTJ = c55915xsu != null ? c55915xsu.AEQbTJ() : null;
            updateRegistration(0, observableFieldAEQbTJ);
            MaxAvailableResp maxAvailableResp = observableFieldAEQbTJ != null ? observableFieldAEQbTJ.get() : null;
            if (c55915xsu != null) {
                strOLrzqt = c55915xsu.OLrzqt(maxAvailableResp, true);
            }
        }
        if (j2 != 0) {
            this.fJNWhG.setFooterAvaValue(strOLrzqt);
        }
    }
}
