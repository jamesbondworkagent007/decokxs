package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16493ekv extends AbstractC16491ekt {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.DNMMPQ, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getQueueItem, 4);
    }

    public C16493ekv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, AhwBna, AYXKKw));
    }

    public C16493ekv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1], (ConstraintLayout) objArr[0], (C55251xgS) objArr[4]);
        this.valueOf = -1L;
        this.copydefault.setTag(null);
        this.EZpvd.setTag(null);
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.OLrzqt != i) {
            return false;
        }
        OLrzqt((AddressData) obj);
        return true;
    }

    public void OLrzqt(@androidx.annotation.Nullable AddressData addressData) {
        this.OLrzqt = addressData;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(dTV.OLrzqt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String addressTips;
        java.lang.String addressFormat;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        AddressData addressData = this.OLrzqt;
        long j2 = j & 3;
        if (j2 == 0 || addressData == null) {
            addressTips = null;
            addressFormat = null;
        } else {
            addressTips = addressData.getAddressTips();
            addressFormat = addressData.getAddressFormat();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.copydefault, addressTips);
            TextViewBindingAdapter.setText(this.EZpvd, addressFormat);
        }
    }
}
