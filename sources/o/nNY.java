package o;

import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nNY extends nNV {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray isConnected;
    public long fARcdN;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@androidx.annotation.Nullable GroupMemberInfo groupMemberInfo) {
        this.AYXKKw = groupMemberInfo;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.invokespecialsiEkQe, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.getStatusCode, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.fdazkH, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.onLost, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.hQufeQ, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.sEcTXd, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.fRNHEq, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.getPostValueLengthLimit, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.QYvkLl, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.keyboardTargetTextChanged, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.dmfpNf, 11);
    }

    public nNY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, fetchVPNInfo, isConnected));
    }

    public nNY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[8], (AppCompatCheckBox) objArr[11], (ConstraintLayout) objArr[0], (C35893oHp) objArr[1], (ConstraintLayout) objArr[2], (C55251xgS) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[4]);
        this.fARcdN = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        KWHzl((GroupMemberInfo) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
