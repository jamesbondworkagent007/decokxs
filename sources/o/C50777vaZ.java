package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vaZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50777vaZ extends AbstractC50775vaX {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long DbNXlk;
    public final ConstraintLayout fetchVPNInfo;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.getExtras, 6);
        sparseIntArray.put(C48033uCm.Application.onItemSelected, 7);
        sparseIntArray.put(C48033uCm.Application.closePanel, 8);
        sparseIntArray.put(C48033uCm.Application.setMediaUri, 9);
    }

    public C50777vaZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, values, AkhnZx));
    }

    public C50777vaZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[6], (android.widget.LinearLayout) objArr[9], (android.widget.TextView) objArr[8], (AppCompatTextView) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[7], (AppCompatTextView) objArr[1]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
        this.KWHzl.setTag(null);
        this.AhwBna.setTag(null);
        this.valueOf.setTag(null);
        this.AYXKKw.setTag(null);
        this.djBIcL.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C48034uCn.copydefault != i) {
            return false;
        }
        EZpvd((FundingRateArbitrageData) obj);
        return true;
    }

    public void EZpvd(@androidx.annotation.Nullable FundingRateArbitrageData fundingRateArbitrageData) {
        this.copydefault = fundingRateArbitrageData;
        synchronized (this) {
            this.DbNXlk |= 1;
        }
        notifyPropertyChanged(C48034uCn.copydefault);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String nextFundingRate;
        java.lang.String apy;
        java.lang.String fundingRate;
        java.lang.String buyInstId;
        java.lang.String sellInstId;
        synchronized (this) {
            j = this.DbNXlk;
            this.DbNXlk = 0L;
        }
        FundingRateArbitrageData fundingRateArbitrageData = this.copydefault;
        long j2 = j & 3;
        if (j2 == 0 || fundingRateArbitrageData == null) {
            nextFundingRate = null;
            apy = null;
            fundingRate = null;
            buyInstId = null;
            sellInstId = null;
        } else {
            nextFundingRate = fundingRateArbitrageData.getNextFundingRate();
            apy = fundingRateArbitrageData.getApy();
            fundingRate = fundingRateArbitrageData.getFundingRate();
            sellInstId = fundingRateArbitrageData.getSellInstId();
            buyInstId = fundingRateArbitrageData.getBuyInstId();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, buyInstId);
            TextViewBindingAdapter.setText(this.AhwBna, fundingRate);
            this.valueOf.setText(nextFundingRate);
            TextViewBindingAdapter.setText(this.AYXKKw, apy);
            TextViewBindingAdapter.setText(this.djBIcL, sellInstId);
        }
    }
}
