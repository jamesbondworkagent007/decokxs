package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nOk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C34019nOk extends AbstractC34018nOj {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray AkhnZx;
    public long fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@androidx.annotation.Nullable C35254nrp c35254nrp) {
        this.copydefault = c35254nrp;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.apNKau, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.invokespecialgBtXYZ, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.hTAtCx, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.fRNHEq, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.stopBehavioSecDataCollection, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.DkGEDn, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.values, 7);
    }

    public C34019nOk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AhwBna, AkhnZx));
    }

    public C34019nOk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[7], (ConstraintLayout) objArr[2], (android.widget.LinearLayout) objArr[0], (android.view.View) objArr[5], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[3]);
        this.fetchVPNInfo = -1L;
        this.KWHzl.setTag(null);
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
        OLrzqt((C35254nrp) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
