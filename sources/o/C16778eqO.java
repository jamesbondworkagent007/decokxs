package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.business.defi.wallet.hardware.keystone.KeystoneSelectAccountViewModel;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16778eqO extends AbstractC16771eqH {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray isConnected;
    public long fetchVPNInfo;
    public final ConstraintLayout values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.DKr, 8);
        sparseIntArray.put(C13754dXa.ActionBar.updateBackInvokedCallbackStateactivity_release, 9);
    }

    public C16778eqO(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, DbNXlk, isConnected));
    }

    public C16778eqO(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[1], (C55251xgS) objArr[2], (C55251xgS) objArr[7], (android.widget.ImageView) objArr[8], (AppCompatImageView) objArr[6], (ConstraintLayout) objArr[4], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[5]);
        this.fetchVPNInfo = -1L;
        this.OLrzqt.setTag(null);
        this.KWHzl.setTag(null);
        this.AEQbTJ.setTag(null);
        this.EZpvd.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        this.valueOf.setTag(null);
        this.AYXKKw.setTag(null);
        this.djBIcL.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.DbNXlk != i) {
            return false;
        }
        KWHzl((KeystoneSelectAccountViewModel.KeystoneAccountInfo) obj);
        return true;
    }

    public void KWHzl(@androidx.annotation.Nullable KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo) {
        this.gEmmrt = keystoneAccountInfo;
        synchronized (this) {
            this.fetchVPNInfo |= 1;
        }
        notifyPropertyChanged(dTV.DbNXlk);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String str;
        java.lang.String selectEthAddressTypeText;
        java.lang.String switchEthAddressTitle;
        int i;
        int i2;
        boolean z;
        boolean zIsShowSwitchEthAddress;
        boolean zIsAdded;
        synchronized (this) {
            j = this.fetchVPNInfo;
            this.fetchVPNInfo = 0L;
        }
        KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo = this.gEmmrt;
        long j2 = j & 3;
        java.lang.String str2 = null;
        if (j2 != 0) {
            if (keystoneAccountInfo != null) {
                java.lang.String accountName = keystoneAccountInfo.getAccountName();
                boolean zIsSelected = keystoneAccountInfo.isSelected();
                java.lang.String totalAsset = keystoneAccountInfo.getTotalAsset();
                selectEthAddressTypeText = keystoneAccountInfo.getSelectEthAddressTypeText();
                switchEthAddressTitle = keystoneAccountInfo.getSwitchEthAddressTitle();
                zIsAdded = keystoneAccountInfo.isAdded();
                zIsShowSwitchEthAddress = keystoneAccountInfo.isShowSwitchEthAddress();
                str = accountName;
                str2 = totalAsset;
                z = zIsSelected;
            } else {
                str = null;
                selectEthAddressTypeText = null;
                switchEthAddressTitle = null;
                zIsShowSwitchEthAddress = false;
                z = false;
                zIsAdded = false;
            }
            if (j2 != 0) {
                j |= z ? 512L : 256L;
            }
            if ((j & 3) != 0) {
                j |= zIsAdded ? 160L : 80L;
            }
            if ((j & 3) != 0) {
                j |= zIsShowSwitchEthAddress ? 8L : 4L;
            }
            int i3 = zIsAdded ? 8 : 0;
            int i4 = zIsAdded ? 0 : 8;
            i2 = zIsShowSwitchEthAddress ? 0 : 8;
            i = i4;
            i = i3;
        } else {
            str = null;
            selectEthAddressTypeText = null;
            switchEthAddressTitle = null;
            i = 0;
            i2 = 0;
            z = false;
        }
        if ((j & 3) != 0) {
            TextViewBindingAdapter.setText(this.OLrzqt, str2);
            TextViewBindingAdapter.setText(this.KWHzl, str);
            TextViewBindingAdapter.setText(this.AEQbTJ, selectEthAddressTypeText);
            this.EZpvd.setVisibility(i);
            this.valueOf.setSelected(z);
            this.valueOf.setVisibility(i);
            this.AYXKKw.setVisibility(i2);
            TextViewBindingAdapter.setText(this.djBIcL, switchEthAddressTitle);
        }
    }
}
