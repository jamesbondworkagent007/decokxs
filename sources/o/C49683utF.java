package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C49720utq;

/* JADX INFO: renamed from: o.utF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49683utF extends AbstractC49686utI {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long djBIcL;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@androidx.annotation.Nullable java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@androidx.annotation.Nullable java.lang.String str) {
        this.OLrzqt = str;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(C49720utq.Application.AhwBna, 2);
        sparseIntArray.put(C49720utq.Application.AEQbTJ, 3);
    }

    public C49683utF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, gEmmrt, AhwBna));
    }

    public C49683utF(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[1], (android.widget.LinearLayout) objArr[3], (C55258xgZ) objArr[2]);
        this.djBIcL = -1L;
        this.KWHzl.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C49719utp.copydefault == i) {
            OLrzqt((java.lang.String) obj);
        } else if (C49719utp.OLrzqt == i) {
            EZpvd((java.lang.String) obj);
        } else if (C49719utp.AYXKKw == i) {
            AEQbTJ((java.lang.String) obj);
        } else {
            if (C49719utp.KWHzl != i) {
                return false;
            }
            EZpvd(((java.lang.Boolean) obj).booleanValue());
        }
        return true;
    }

    public void OLrzqt(@androidx.annotation.Nullable java.lang.String str) {
        this.copydefault = str;
        synchronized (this) {
            this.djBIcL |= 1;
        }
        notifyPropertyChanged(C49719utp.copydefault);
        super.requestRebind();
    }

    @Override // o.AbstractC49686utI
    public void EZpvd(boolean z) {
        this.EZpvd = z;
        synchronized (this) {
            this.djBIcL |= 8;
        }
        notifyPropertyChanged(C49719utp.KWHzl);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.djBIcL;
            this.djBIcL = 0L;
        }
        java.lang.String str = this.copydefault;
        boolean z = this.EZpvd;
        long j2 = j & 24;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 64L : 32L;
            }
            if (z) {
                i = 8;
            }
        }
        if ((17 & j) != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, str);
        }
        if ((j & 24) != 0) {
            this.values.setVisibility(i);
        }
    }
}
