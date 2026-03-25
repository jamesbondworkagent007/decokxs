package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nLZ extends AbstractC33955nMa {
    public static final android.util.SparseIntArray getNewProxyInstance;
    public static final ViewDataBinding.IncludedLayouts iwGUEr = null;
    public long zLjUOn;

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
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.htlTjW, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.znKlvJ, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.YFmri, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.DuXjdv, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.GFUIi, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.ardYFU, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.NRYds, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.DQzvGN, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKOmnske, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.dYepVG, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.DsrFlB, 11);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKfNLfdT, 12);
        sparseIntArray.put(C35399nuc.StateListAnimator.IKQXqd, 13);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKDCKfqPDCfLja, 14);
        sparseIntArray.put(C35399nuc.StateListAnimator.UPbYzn, 15);
        sparseIntArray.put(C35399nuc.StateListAnimator.OJuSTm, 16);
        sparseIntArray.put(C35399nuc.StateListAnimator.Ufzxmz, 17);
        sparseIntArray.put(C35399nuc.StateListAnimator.QCjLjM, 18);
        sparseIntArray.put(C35399nuc.StateListAnimator.FHvxmb, 19);
        sparseIntArray.put(C35399nuc.StateListAnimator.SlnMSS, 20);
        sparseIntArray.put(C35399nuc.StateListAnimator.DfrfUJ, 21);
        sparseIntArray.put(C35399nuc.StateListAnimator.DAIeex, 22);
    }

    public nLZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 23, iwGUEr, getNewProxyInstance));
    }

    public nLZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[22], (android.widget.TextView) objArr[18], (C55159xeg) objArr[16], (android.widget.FrameLayout) objArr[1], (android.widget.ImageView) objArr[11], (android.widget.TextView) objArr[17], (oIV) objArr[8], (android.widget.ImageView) objArr[3], (android.widget.LinearLayout) objArr[14], (LinearLayoutCompat) objArr[9], (android.widget.LinearLayout) objArr[12], (android.widget.TextView) objArr[21], (android.widget.LinearLayout) objArr[0], (android.widget.LinearLayout) objArr[19], (LinearLayoutCompat) objArr[5], (LinearLayoutCompat) objArr[4], (C55251xgS) objArr[7], (android.widget.ImageView) objArr[13], (android.widget.TextView) objArr[10], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[15]);
        this.zLjUOn = -1L;
        this.fetchVPNInfo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.zLjUOn = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.zLjUOn != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.zLjUOn = 0L;
        }
    }
}
