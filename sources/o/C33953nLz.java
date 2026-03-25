package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nLz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33953nLz extends AbstractC33949nLv {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long fetchVPNInfo;
    public final android.widget.LinearLayout isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@androidx.annotation.Nullable C35254nrp c35254nrp) {
        this.copydefault = c35254nrp;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.ikEgkI, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.fIwbmz, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.DaTmkG, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.ODCBUN, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.hCiIDQ, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.fruYXx, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.IYdWPz, 7);
    }

    public C33953nLz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, AhwBna));
    }

    public C33953nLz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[2], (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5], (android.widget.LinearLayout) objArr[1]);
        this.fetchVPNInfo = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.isConnected = linearLayout;
        linearLayout.setTag(null);
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
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        AEQbTJ((C35254nrp) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
