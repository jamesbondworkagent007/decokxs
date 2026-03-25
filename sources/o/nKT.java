package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nKT extends nKU {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.nKU
    public void OLrzqt(boolean z) {
        this.OLrzqt = z;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.onLost, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.DvMhtu, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.OuxcSI, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.EZpvd, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.UhxbNG, 5);
    }

    public nKT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, valueOf, AYXKKw));
    }

    public nKT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[5], (android.widget.RelativeLayout) objArr[0], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2]);
        this.fetchVPNInfo = -1L;
        this.djBIcL.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 4L;
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
        if (C35342ntX.AhwBna == i) {
            KWHzl(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (C35342ntX.EZpvd != i) {
                return false;
            }
            OLrzqt(((java.lang.Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
