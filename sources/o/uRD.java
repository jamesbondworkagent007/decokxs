package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uRD extends uRB {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
    public long DbNXlk;
    public final ConstraintLayout isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        djBIcL = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.getExtras, 5);
        sparseIntArray.put(C48033uCm.Application.onItemSelected, 6);
        sparseIntArray.put(C48033uCm.Application.closePanel, 7);
    }

    public uRD(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AhwBna, djBIcL));
    }

    public uRD(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[5], (android.widget.TextView) objArr[7], (AppCompatTextView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[6], (AppCompatTextView) objArr[1]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        this.copydefault.setTag(null);
        this.EZpvd.setTag(null);
        this.AYXKKw.setTag(null);
        this.valueOf.setTag(null);
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
        if (C48034uCn.KWHzl != i) {
            return false;
        }
        copydefault((SpreadArbitrageData) obj);
        return true;
    }

    public void copydefault(@androidx.annotation.Nullable SpreadArbitrageData spreadArbitrageData) {
        this.AEQbTJ = spreadArbitrageData;
        synchronized (this) {
            this.DbNXlk |= 1;
        }
        notifyPropertyChanged(C48034uCn.KWHzl);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String apy;
        java.lang.String buyInstId;
        java.lang.String spread;
        java.lang.String sellInstId;
        synchronized (this) {
            j = this.DbNXlk;
            this.DbNXlk = 0L;
        }
        SpreadArbitrageData spreadArbitrageData = this.AEQbTJ;
        long j2 = j & 3;
        if (j2 == 0 || spreadArbitrageData == null) {
            apy = null;
            buyInstId = null;
            spread = null;
            sellInstId = null;
        } else {
            apy = spreadArbitrageData.getApy();
            buyInstId = spreadArbitrageData.getBuyInstId();
            spread = spreadArbitrageData.getSpread();
            sellInstId = spreadArbitrageData.getSellInstId();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.copydefault, buyInstId);
            TextViewBindingAdapter.setText(this.EZpvd, apy);
            TextViewBindingAdapter.setText(this.AYXKKw, spread);
            TextViewBindingAdapter.setText(this.valueOf, sellInstId);
        }
    }
}
