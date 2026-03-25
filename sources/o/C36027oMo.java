package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36027oMo extends AbstractC36028oMp {
    public static final android.util.SparseIntArray isConnected;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final android.widget.LinearLayout AkhnZx;
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
        isConnected = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.getRoot, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.IconCompatParcelizer, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.isScanInProgress, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.disconnect, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.aChkwz, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.fRNHEq, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.hfFNez, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.DGGHxk, 8);
        sparseIntArray.put(C35964oKf.StateListAnimator.sJPPOI, 9);
    }

    public C36027oMo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, valueOf, isConnected));
    }

    public C36027oMo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[8], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (RecyclerView) objArr[9], (RecyclerView) objArr[3], (android.widget.TextView) objArr[7], (android.widget.LinearLayout) objArr[2], (android.widget.FrameLayout) objArr[4], (android.view.View) objArr[1]);
        this.fetchVPNInfo = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AkhnZx = linearLayout;
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
