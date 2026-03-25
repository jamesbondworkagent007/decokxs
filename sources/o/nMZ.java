package o;

import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nMZ extends nMY {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray valueOf;
    public long AkhnZx;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.RdAHlO, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.getUserContextRegisteredStatus, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKDCKfqPDCfLja, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.ibrGus, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.zMXLsR, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.ikcuIV, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.DAIeex, 7);
    }

    public nMZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, valueOf));
    }

    public nMZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[7], (CardView) objArr[1], (ShapeableImageView) objArr[2], (android.widget.LinearLayout) objArr[3], (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5]);
        this.AkhnZx = -1L;
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
