package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31534lvo extends AbstractC31538lvs {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final ConstraintLayout fetchVPNInfo;
    public long values;

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
        sparseIntArray.put(C31351lsQ.Application.hCLrkq, 2);
        sparseIntArray.put(C31351lsQ.Application.ihnvzI, 3);
        sparseIntArray.put(C31351lsQ.Application.reset, 4);
        sparseIntArray.put(C31351lsQ.Application.zLAIeZ, 5);
        sparseIntArray.put(C31351lsQ.Application.DGgnkA, 6);
        sparseIntArray.put(C31351lsQ.Application.UrRBLY, 7);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKsuEgdN, 8);
        sparseIntArray.put(C31351lsQ.Application.DGUQLIOvDItG, 9);
        sparseIntArray.put(C31351lsQ.Application.DGUQLIekVPG, 10);
        sparseIntArray.put(C31351lsQ.Application.DPHsZd, 11);
    }

    public C31534lvo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, isConnected, AkhnZx));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31534lvo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[1];
        android.widget.TextView textView = (android.widget.TextView) objArr[7];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 0, frameLayout, textView, obj != null ? C31479lum.EZpvd((android.view.View) obj) : null, (C55230xfy) objArr[6], (android.widget.LinearLayout) objArr[9], (C55173xeu) objArr[10], (C52794wYp) objArr[11], (wYC) objArr[4], (androidx.appcompat.widget.Toolbar) objArr[3], (android.widget.TextView) objArr[5], (C55113xdn) objArr[8]);
        this.values = -1L;
        this.copydefault.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
