package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nHN extends nHO {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public final android.widget.FrameLayout fetchVPNInfo;
    public long isConnected;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.adevsa, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.RuDPQV, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.ORrpqH, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.AuCTelauCTel, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.DIIpTV, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.DCUTEIdCUTEI, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.glXhWM, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.DTwDnp, 8);
    }

    public nHN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, AYXKKw));
    }

    public nHN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[4], (android.widget.Button) objArr[8], (android.widget.LinearLayout) objArr[6], (android.widget.FrameLayout) objArr[5], (android.widget.ImageView) objArr[2], (android.widget.FrameLayout) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[7]);
        this.isConnected = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.fetchVPNInfo = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
