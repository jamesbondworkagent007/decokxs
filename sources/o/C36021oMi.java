package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36021oMi extends AbstractC36022oMj {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long fetchVPNInfo;
    public final android.widget.RelativeLayout isConnected;

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
        sparseIntArray.put(C35964oKf.StateListAnimator.RsCxkX, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.RhlVAI, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.dkJJWw, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.fZBcTu, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.UeEOUB, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.validateAndPutInMap, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.search, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.zhUgOk, 8);
    }

    public C36021oMi(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, gEmmrt, valueOf));
    }

    public C36021oMi(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[5], (C52794wYp) objArr[4], (android.widget.TextView) objArr[8], (android.widget.LinearLayout) objArr[3], (C36250oUv) objArr[1], (android.widget.FrameLayout) objArr[2], (android.view.View) objArr[6], (C55237xgE) objArr[7]);
        this.fetchVPNInfo = -1L;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) objArr[0];
        this.isConnected = relativeLayout;
        relativeLayout.setTag(null);
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
