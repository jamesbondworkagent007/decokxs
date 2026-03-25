package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.business.defi.dapp.net.search.DappDetailBean;
import o.dLX;

/* JADX INFO: renamed from: o.dMs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C13475dMs extends AbstractC13474dMr {
    public static final android.util.SparseIntArray AxsJAY;
    public static final ViewDataBinding.IncludedLayouts gHZMYf = null;
    public long sSMYrx;
    public final android.widget.TextView zuBGHE;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AxsJAY = sparseIntArray;
        sparseIntArray.put(dLX.Application.QOLQEE, 4);
        sparseIntArray.put(dLX.Application.gGvvIC, 5);
        sparseIntArray.put(dLX.Application.AuCTelauCTel, 6);
        sparseIntArray.put(dLX.Application.DTwDnp, 7);
        sparseIntArray.put(dLX.Application.QSLkRj, 8);
        sparseIntArray.put(dLX.Application.dvKsVJ, 9);
        sparseIntArray.put(dLX.Application.fZBcTu, 10);
        sparseIntArray.put(dLX.Application.UhxbNG, 11);
        sparseIntArray.put(dLX.Application.DarRvM, 12);
        sparseIntArray.put(dLX.Application.QUSxYX, 13);
        sparseIntArray.put(dLX.Application.fHqPtx, 14);
        sparseIntArray.put(dLX.Application.call, 15);
        sparseIntArray.put(dLX.Application.KDccX, 16);
        sparseIntArray.put(dLX.Application.run, 17);
        sparseIntArray.put(dLX.Application.heceqZ, 18);
        sparseIntArray.put(dLX.Application.getNewProxyInstance, 19);
        sparseIntArray.put(dLX.Application.RVsVBY, 20);
        sparseIntArray.put(dLX.Application.DCUTEI, 21);
        sparseIntArray.put(dLX.Application.gasjUx, 22);
        sparseIntArray.put(dLX.Application.flVtFt, 23);
        sparseIntArray.put(dLX.Application.ODWQjV, 24);
        sparseIntArray.put(dLX.Application.iZzfmt, 25);
        sparseIntArray.put(dLX.Application.OqFWZa, 26);
        sparseIntArray.put(dLX.Application.AxsJAYaxsJAY, 27);
        sparseIntArray.put(dLX.Application.fJNWhG, 28);
        sparseIntArray.put(dLX.Application.getFieldNames, 29);
    }

    public C13475dMs(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 30, gHZMYf, AxsJAY));
    }

    public C13475dMs(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYK) objArr[28], (wYK) objArr[29], (android.widget.LinearLayout) objArr[19], (android.widget.ImageView) objArr[6], (android.widget.RelativeLayout) objArr[4], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[3], (dAQ) objArr[13], (android.widget.FrameLayout) objArr[9], (android.widget.ImageView) objArr[10], (android.widget.ImageView) objArr[5], (ConstraintLayout) objArr[22], (android.widget.FrameLayout) objArr[23], (android.widget.FrameLayout) objArr[25], (android.widget.FrameLayout) objArr[27], (wYC) objArr[12], (android.view.View) objArr[24], (android.view.View) objArr[26], (android.widget.LinearLayout) objArr[21], (android.widget.TextView) objArr[2], (android.widget.RelativeLayout) objArr[8], (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[17], (android.widget.ImageView) objArr[15], (android.widget.LinearLayout) objArr[14], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[20], (android.widget.LinearLayout) objArr[11]);
        this.sSMYrx = -1L;
        this.djBIcL.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) objArr[1];
        this.zuBGHE = textView;
        textView.setTag(null);
        this.getFieldNames.setTag(null);
        this.iwGUEr.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.sSMYrx = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.sSMYrx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dLZ.KWHzl != i) {
            return false;
        }
        copydefault((DappDetailBean) obj);
        return true;
    }

    @Override // o.AbstractC13474dMr
    public void copydefault(@androidx.annotation.Nullable DappDetailBean dappDetailBean) {
        this.fJNWhG = dappDetailBean;
        synchronized (this) {
            this.sSMYrx |= 1;
        }
        notifyPropertyChanged(dLZ.KWHzl);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String rewardInfo;
        java.lang.String shortDescribe;
        java.lang.String name;
        synchronized (this) {
            j = this.sSMYrx;
            this.sSMYrx = 0L;
        }
        DappDetailBean dappDetailBean = this.fJNWhG;
        long j2 = j & 3;
        if (j2 == 0 || dappDetailBean == null) {
            rewardInfo = null;
            shortDescribe = null;
            name = null;
        } else {
            rewardInfo = dappDetailBean.getRewardInfo();
            shortDescribe = dappDetailBean.getShortDescribe();
            name = dappDetailBean.getName();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.djBIcL, shortDescribe);
            TextViewBindingAdapter.setText(this.zuBGHE, rewardInfo);
            TextViewBindingAdapter.setText(this.getFieldNames, name);
        }
    }
}
