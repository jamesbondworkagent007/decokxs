package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import com.okinc.okimcore.model.remote.RelationInfo;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nNZ extends nNW {
    public static final android.util.SparseIntArray isConnected;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long DbNXlk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@androidx.annotation.Nullable RelationInfo relationInfo) {
        this.AYXKKw = relationInfo;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.invokespecialsiEkQe, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.fdazkH, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.fRNHEq, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.getNewProxyInstance, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.onLost, 6);
    }

    public nNZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, values, isConnected));
    }

    public nNZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[5], (wYK) objArr[1], (ConstraintLayout) objArr[0], (C35893oHp) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[6]);
        this.DbNXlk = -1L;
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 8L;
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
        if (C35342ntX.djBIcL == i) {
            EZpvd((RelationInfo) obj);
        } else if (C35342ntX.copydefault == i) {
            EZpvd(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (C35342ntX.KWHzl != i) {
                return false;
            }
            copydefault(((java.lang.Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // o.nNW
    public void EZpvd(boolean z) {
        this.AhwBna = z;
        synchronized (this) {
            this.DbNXlk |= 2;
        }
        notifyPropertyChanged(C35342ntX.copydefault);
        super.requestRebind();
    }

    @Override // o.nNW
    public void copydefault(boolean z) {
        this.EZpvd = z;
        synchronized (this) {
            this.DbNXlk |= 4;
        }
        notifyPropertyChanged(C35342ntX.KWHzl);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.DbNXlk;
            this.DbNXlk = 0L;
        }
        boolean z = this.AhwBna;
        boolean z2 = this.EZpvd;
        long j2 = j & 12;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z2 ? 32L : 16L;
            }
            if (!z2) {
                i = 8;
            }
        }
        if ((10 & j) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.AEQbTJ, z);
        }
        if ((j & 12) != 0) {
            this.AEQbTJ.setVisibility(i);
        }
    }
}
