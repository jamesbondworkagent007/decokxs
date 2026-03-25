package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57413yhu extends AbstractC57412yht {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final android.widget.LinearLayout isConnected;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C57406yhn.StateListAnimator.QSBOWP, 1);
        sparseIntArray.put(C57406yhn.StateListAnimator.RKDWNf, 2);
        sparseIntArray.put(C57406yhn.StateListAnimator.QHmsKR, 3);
        sparseIntArray.put(C57406yhn.StateListAnimator.DGgnkA, 4);
        sparseIntArray.put(C57406yhn.StateListAnimator.KDccX, 5);
        sparseIntArray.put(C57406yhn.StateListAnimator.djBIcL, 6);
        sparseIntArray.put(C57406yhn.StateListAnimator.copydefault, 7);
        sparseIntArray.put(C57406yhn.StateListAnimator.valueOf, 8);
        sparseIntArray.put(C57406yhn.StateListAnimator.AhwBna, 9);
        sparseIntArray.put(C57406yhn.StateListAnimator.AYXKKw, 10);
    }

    public C57413yhu(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, AkhnZx, fetchVPNInfo));
    }

    public C57413yhu(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[7], (C52794wYp) objArr[9], (android.view.View) objArr[8], (C57468yiw) objArr[10], (android.widget.LinearLayout) objArr[6], (AppCompatImageView) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4]);
        this.values = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.isConnected = linearLayout;
        linearLayout.setTag(null);
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
