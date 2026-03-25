package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uMT extends uMR {
    public static final ViewDataBinding.IncludedLayouts zLjUOn = null;
    public static final android.util.SparseIntArray zsXlph;
    public long zuBGHE;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        zsXlph = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DdI, 2);
        sparseIntArray.put(C48033uCm.Application.target, 3);
        sparseIntArray.put(C48033uCm.Application.postOrRun, 4);
        sparseIntArray.put(C48033uCm.Application.onRepeatModeChanged, 5);
        sparseIntArray.put(C48033uCm.Application.jNexW, 6);
        sparseIntArray.put(C48033uCm.Application.applyOptions, 7);
        sparseIntArray.put(C48033uCm.Application.fbC, 8);
        sparseIntArray.put(C48033uCm.Application.notifyNotificationWithChannel, 9);
        sparseIntArray.put(C48033uCm.Application.aPFruk, 10);
        sparseIntArray.put(C48033uCm.Application.setSubscription, 11);
        sparseIntArray.put(C48033uCm.Application.hasWindowFeature, 12);
        sparseIntArray.put(C48033uCm.Application.svUkWZ, 13);
        sparseIntArray.put(C48033uCm.Application.attachBaseContext2, 14);
        sparseIntArray.put(C48033uCm.Application.dXhJGx, 15);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 16);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatSearchResultReceiver, 17);
        sparseIntArray.put(C48033uCm.Application.dispatchMenuVisibilityChanged, 18);
        sparseIntArray.put(C48033uCm.Application.putString, 19);
        sparseIntArray.put(C48033uCm.Application.onScrollChanged, 20);
        sparseIntArray.put(C48033uCm.Application.NavItemSelectedListener, 21);
        sparseIntArray.put(C48033uCm.Application.setOnDismissListener, 22);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 23);
        sparseIntArray.put(C48033uCm.Application.RIsQag, 24);
        sparseIntArray.put(C48033uCm.Application.send, 25);
        sparseIntArray.put(C48033uCm.Application.onShuffleModeChanged, 26);
    }

    public uMT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 27, zLjUOn, zsXlph));
    }

    public uMT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (wYK) objArr[8], (ConstraintLayout) objArr[6], (android.widget.TextView) objArr[16], (android.widget.FrameLayout) objArr[10], (C55258xgZ) objArr[24], (C53539wnR) objArr[15], (C53539wnR) objArr[1], (ConstraintLayout) objArr[2], (C47988uAv) objArr[13], (C55320xhi) objArr[9], (C50348vLb) objArr[4], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[11], (android.widget.LinearLayout) objArr[17], (vKO) objArr[19], (android.widget.TextView) objArr[26], (C47988uAv) objArr[5], (NestedScrollView) objArr[0], (RecyclerView) objArr[25], (vKO) objArr[20], (android.widget.TextView) objArr[3], (vKO) objArr[18], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[14], (C55258xgZ) objArr[12], (android.widget.TextView) objArr[21], (C54154wyx) objArr[23]);
        this.zuBGHE = -1L;
        this.valueOf.setTag(null);
        this.ejfBZ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.zuBGHE = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.zuBGHE != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C48034uCn.OLrzqt != i) {
            return false;
        }
        copydefault((C55915xsu) obj);
        return true;
    }

    public void copydefault(@androidx.annotation.Nullable C55915xsu c55915xsu) {
        this.fIwbmz = c55915xsu;
        synchronized (this) {
            this.zuBGHE |= 2;
        }
        notifyPropertyChanged(C48034uCn.OLrzqt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return OLrzqt((ObservableField) obj, i2);
    }

    public final boolean OLrzqt(ObservableField<MaxAvailableResp> observableField, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.zuBGHE |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.zuBGHE;
            this.zuBGHE = 0L;
        }
        C55915xsu c55915xsu = this.fIwbmz;
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
            this.valueOf.setFooterAvaValue(strOLrzqt);
        }
    }
}
