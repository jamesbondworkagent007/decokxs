package o;

import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nNb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33983nNb extends nMX {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray AhwBna;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.RdAHlO, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.getUserContextRegisteredStatus, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKDCKfqPDCfLja, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.ibrGus, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.zMXLsR, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.ikcuIV, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.DAIeex, 7);
    }

    public C33983nNb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, AhwBna));
    }

    public C33983nNb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[7], (CardView) objArr[1], (ShapeableImageView) objArr[2], (android.widget.LinearLayout) objArr[3], (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5]);
        this.fetchVPNInfo = -1L;
        this.AEQbTJ.setTag(null);
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
