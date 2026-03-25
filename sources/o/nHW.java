package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.edit.OKEditText;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nHW extends nHQ {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public long fetchVPNInfo;

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
        values = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.fetchVPNInfo, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.adevsa, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.itxZVF, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.zYHWMc, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.atDTRm, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.sSMYrx, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.HrFqwD, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.fhUrPt, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.pause, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.dSJNDS, 10);
    }

    public nHW(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, isConnected, values));
    }

    public nHW(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[6], (OKEditText) objArr[4], (android.widget.ImageView) objArr[5], (C33603mza) objArr[9], (C57869yqZ) objArr[8], (android.widget.LinearLayout) objArr[0], (RecyclerView) objArr[10], (android.widget.FrameLayout) objArr[3], (C55237xgE) objArr[7], (android.widget.LinearLayout) objArr[2]);
        this.fetchVPNInfo = -1L;
        this.djBIcL.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
