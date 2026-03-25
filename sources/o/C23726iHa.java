package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23726iHa extends iGU {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final android.widget.LinearLayout fetchVPNInfo;
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
        sparseIntArray.put(C25493ixk.ActionBar.iwGUEr, 1);
        sparseIntArray.put(C25493ixk.ActionBar.UeEOUB, 2);
        sparseIntArray.put(C25493ixk.ActionBar.Dfv, 3);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplApi213, 4);
        sparseIntArray.put(C25493ixk.ActionBar.ICustomTabsCallbackDefault, 5);
        sparseIntArray.put(C25493ixk.ActionBar.QhsCdEQhsCdE, 6);
        sparseIntArray.put(C25493ixk.ActionBar.QTtQrx, 7);
        sparseIntArray.put(C25493ixk.ActionBar.zdxASf, 8);
        sparseIntArray.put(C25493ixk.ActionBar.djBIcL, 9);
        sparseIntArray.put(C25493ixk.ActionBar.OKvQBs, 10);
    }

    public C23726iHa(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, isConnected, AkhnZx));
    }

    public C23726iHa(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[9], (C33537myN) objArr[1], (android.view.View) objArr[2], (android.widget.ImageView) objArr[3], (C33603mza) objArr[8], (C55173xeu) objArr[10], (android.view.View) objArr[6], (C33546myW) objArr[7], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4]);
        this.values = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fetchVPNInfo = linearLayout;
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
