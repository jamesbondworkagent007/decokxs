package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36024oMl extends AbstractC36020oMh {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final android.widget.LinearLayout fARcdN;
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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.DDjgSw, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.isInitInProgress, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.OqhRBMiKdSzF, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.sVaiLC, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.OqhRBM, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.dtVxwd, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.gqESXP, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.zHQtTQ, 8);
        sparseIntArray.put(C35964oKf.StateListAnimator.DCUTEI, 9);
        sparseIntArray.put(C35964oKf.StateListAnimator.ffGIBT, 10);
        sparseIntArray.put(C35964oKf.StateListAnimator.getPostValueLengthLimit, 11);
        sparseIntArray.put(C35964oKf.StateListAnimator.notify, 12);
    }

    public C36024oMl(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, AkhnZx));
    }

    public C36024oMl(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C39790pyw) objArr[11], (C55237xgE) objArr[9], (android.widget.RelativeLayout) objArr[10], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[5], (android.widget.LinearLayout) objArr[1], (C39786pys) objArr[12]);
        this.fetchVPNInfo = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fARcdN = linearLayout;
        linearLayout.setTag(null);
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
