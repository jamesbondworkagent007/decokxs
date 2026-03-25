package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.wallet.transfer.segwit.AddressAggregationData;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16447ekB extends AbstractC16497ekz {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long AuCTel;
    public final ConstraintLayout ejfBZ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@androidx.annotation.Nullable AddressAggregationData addressAggregationData) {
        this.djBIcL = addressAggregationData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@androidx.annotation.Nullable C14079deg c14079deg) {
        this.valueOf = c14079deg;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.aWJMta, 1);
        sparseIntArray.put(C13754dXa.ActionBar.getInterfaceDescriptor, 2);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPQdUnVm, 3);
        sparseIntArray.put(C13754dXa.ActionBar.RWIpjU, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ICustomTabsCallback, 5);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatRepeatMode, 6);
        sparseIntArray.put(C13754dXa.ActionBar.addOnMultiWindowModeChangedListener, 7);
        sparseIntArray.put(C13754dXa.ActionBar.OKvQBs, 8);
        sparseIntArray.put(C13754dXa.ActionBar.RequiresOptIn, 9);
        sparseIntArray.put(C13754dXa.ActionBar.RVsVBY, 10);
        sparseIntArray.put(C13754dXa.ActionBar.unsubscribe, 11);
    }

    public C16447ekB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, values, fetchVPNInfo));
    }

    public C16447ekB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[10], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[8], (ConstraintLayout) objArr[5], (android.widget.LinearLayout) objArr[2], (android.view.View) objArr[11], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (android.view.View) objArr[9]);
        this.AuCTel = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ejfBZ = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.OLrzqt == i) {
            KWHzl((AddressAggregationData) obj);
        } else {
            if (dTV.KWHzl != i) {
                return false;
            }
            KWHzl((C14079deg) obj);
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
