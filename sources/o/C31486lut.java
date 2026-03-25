package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31486lut extends AbstractC31484lur {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public final ConstraintLayout ejfBZ;
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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.DGUQLIekVPG, 2);
        sparseIntArray.put(C31351lsQ.Application.HJWChPOZOJIj, 3);
        sparseIntArray.put(C31351lsQ.Application.DjwCMv, 4);
        sparseIntArray.put(C31351lsQ.Application.QkdxfA, 5);
        sparseIntArray.put(C31351lsQ.Application.DcMfJK, 6);
        sparseIntArray.put(C31351lsQ.Application.dvImUD, 7);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKDGTeJD, 8);
        sparseIntArray.put(C31351lsQ.Application.stopBehavioSecDataCollection, 9);
        sparseIntArray.put(C31351lsQ.Application.DDjfYY, 10);
        sparseIntArray.put(C31351lsQ.Application.QSBOWP, 11);
        sparseIntArray.put(C31351lsQ.Application.aCSzUz, 12);
    }

    public C31486lut(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, fetchVPNInfo, AkhnZx));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31486lut(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        android.widget.ImageView imageView = (android.widget.ImageView) objArr[5];
        C52794wYp c52794wYp = (C52794wYp) objArr[11];
        lQY lqy = (lQY) objArr[7];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 0, constraintLayout, imageView, c52794wYp, lqy, obj != null ? C31562lwP.OLrzqt((android.view.View) obj) : null, (ConstraintLayout) objArr[6], (C55030xcJ) objArr[12], (ConstraintLayout) objArr[8], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[4], (ConstraintLayout) objArr[3]);
        this.isConnected = -1L;
        this.EZpvd.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[0];
        this.ejfBZ = constraintLayout2;
        constraintLayout2.setTag(null);
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
