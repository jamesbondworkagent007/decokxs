package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nIc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33849nIc extends AbstractC33850nId {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public final android.widget.LinearLayout fetchVPNInfo;
    public long isConnected;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.zbGDDc, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.AxsJAY, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.DDxOgT, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.QbewEr, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.valueOf, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.DSiOMJ, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.dTTfOR, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.ddhgMB, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.getUriFromString, 9);
    }

    public C33849nIc(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, DbNXlk));
    }

    public C33849nIc(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (OKAlertBanner) objArr[5], (wYC) objArr[2], (android.widget.ImageView) objArr[4], (FragmentContainerView) objArr[6], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[3], (C55173xeu) objArr[7], (C55173xeu) objArr[8], (C55113xdn) objArr[9]);
        this.isConnected = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fetchVPNInfo = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
