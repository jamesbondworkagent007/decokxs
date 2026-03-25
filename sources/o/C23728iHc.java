package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23728iHc extends AbstractC23731iHf {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AkhnZx;
    public final android.widget.LinearLayout isConnected;

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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.getNewProxyInstance, 1);
        sparseIntArray.put(C25493ixk.ActionBar.hgxRZI, 2);
        sparseIntArray.put(C25493ixk.ActionBar.closeSocket, 3);
        sparseIntArray.put(C25493ixk.ActionBar.addSocket, 4);
        sparseIntArray.put(C25493ixk.ActionBar.sIqKDg, 5);
        sparseIntArray.put(C25493ixk.ActionBar.zzJhsT, 6);
        sparseIntArray.put(C25493ixk.ActionBar.SUwuXE, 7);
        sparseIntArray.put(C25493ixk.ActionBar.dcEsSD, 8);
        sparseIntArray.put(C25493ixk.ActionBar.gkJEwt, 9);
    }

    public C23728iHc(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, gEmmrt, fetchVPNInfo));
    }

    public C23728iHc(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[9], (android.widget.ImageView) objArr[5], (android.widget.LinearLayout) objArr[6], (android.widget.LinearLayout) objArr[2], (C55008xbo) objArr[7], (android.widget.TextView) objArr[8], (C55258xgZ) objArr[3], (android.widget.TextView) objArr[4]);
        this.AkhnZx = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.isConnected = linearLayout;
        linearLayout.setTag(null);
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
