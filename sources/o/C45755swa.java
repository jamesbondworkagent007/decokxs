package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import o.C45716svX;

/* JADX INFO: renamed from: o.swa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C45755swa extends AbstractC45717svY {
    public static final ViewDataBinding.IncludedLayouts AwvSrB = null;
    public static final android.util.SparseIntArray gHZMYf;
    public final android.widget.LinearLayout AxsJAY;
    public long sSMYrx;

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
        gHZMYf = sparseIntArray;
        sparseIntArray.put(C45716svX.ActionBar.copydefault, 1);
        sparseIntArray.put(C45716svX.ActionBar.AEQbTJ, 2);
        sparseIntArray.put(C45716svX.ActionBar.UeEOUB, 3);
        sparseIntArray.put(C45716svX.ActionBar.OcIXYQ, 4);
        sparseIntArray.put(C45716svX.ActionBar.AubY, 5);
        sparseIntArray.put(C45716svX.ActionBar.AhwBna, 6);
        sparseIntArray.put(C45716svX.ActionBar.AuCTelauCTel, 7);
        sparseIntArray.put(C45716svX.ActionBar.valueOf, 8);
        sparseIntArray.put(C45716svX.ActionBar.wlaJM, 9);
        sparseIntArray.put(C45716svX.ActionBar.gEmmrt, 10);
        sparseIntArray.put(C45716svX.ActionBar.djBIcL, 11);
        sparseIntArray.put(C45716svX.ActionBar.zLjUOn, 12);
        sparseIntArray.put(C45716svX.ActionBar.AYXKKw, 13);
        sparseIntArray.put(C45716svX.ActionBar.AkhnZx, 14);
        sparseIntArray.put(C45716svX.ActionBar.zsXlph, 15);
        sparseIntArray.put(C45716svX.ActionBar.DbNXlk, 16);
        sparseIntArray.put(C45716svX.ActionBar.AwvSrB, 17);
        sparseIntArray.put(C45716svX.ActionBar.isConnected, 18);
        sparseIntArray.put(C45716svX.ActionBar.AxsJAY, 19);
        sparseIntArray.put(C45716svX.ActionBar.fetchVPNInfo, 20);
        sparseIntArray.put(C45716svX.ActionBar.zuBGHE, 21);
        sparseIntArray.put(C45716svX.ActionBar.values, 22);
        sparseIntArray.put(C45716svX.ActionBar.gHZMYf, 23);
        sparseIntArray.put(C45716svX.ActionBar.fIwbmz, 24);
        sparseIntArray.put(C45716svX.ActionBar.sSMYrx, 25);
        sparseIntArray.put(C45716svX.ActionBar.AuCTel, 26);
        sparseIntArray.put(C45716svX.ActionBar.fARcdN, 27);
        sparseIntArray.put(C45716svX.ActionBar.fJNWhG, 28);
        sparseIntArray.put(C45716svX.ActionBar.getNewProxyInstance, 29);
        sparseIntArray.put(C45716svX.ActionBar.KWHzl, 30);
    }

    public C45755swa(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 31, AwvSrB, gHZMYf));
    }

    public C45755swa(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (android.widget.FrameLayout) objArr[1], (C52794wYp) objArr[30], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[24], (android.widget.TextView) objArr[26], (android.widget.TextView) objArr[27], (android.widget.TextView) objArr[28], (android.widget.FrameLayout) objArr[29], (android.widget.ImageView) objArr[5], (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[9], (android.widget.ImageView) objArr[12], (android.widget.ImageView) objArr[15], (android.widget.ImageView) objArr[17], (android.widget.ImageView) objArr[19], (android.widget.ImageView) objArr[21], (android.widget.ImageView) objArr[23], (android.widget.ImageView) objArr[25], (NestedScrollView) objArr[4], (android.widget.TextView) objArr[3]);
        this.sSMYrx = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AxsJAY = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.sSMYrx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.sSMYrx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.sSMYrx;
            this.sSMYrx = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.AxsJAY, C33570myu.AEQbTJ(getRoot().getContext()));
        }
    }
}
