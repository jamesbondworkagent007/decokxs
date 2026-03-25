package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ema, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16578ema extends AbstractC16581emd {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray fARcdN;
    public long fIwbmz;

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
        fARcdN = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.getVolumeAttributes, 1);
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 2);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKDSqxTE, 3);
        sparseIntArray.put(C13754dXa.ActionBar.MediaMetadataCompat, 4);
        sparseIntArray.put(C13754dXa.ActionBar.AxsJAYaxsJAY, 5);
        sparseIntArray.put(C13754dXa.ActionBar.OhcwxsRkSIEV, 6);
        sparseIntArray.put(C13754dXa.ActionBar.aQtmcU, 7);
        sparseIntArray.put(C13754dXa.ActionBar.fromMediaItem, 8);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaItem, 9);
        sparseIntArray.put(C13754dXa.ActionBar.ORrpqH, 10);
        sparseIntArray.put(C13754dXa.ActionBar.DDNONI, 11);
        sparseIntArray.put(C13754dXa.ActionBar.OqFWZa, 12);
        sparseIntArray.put(C13754dXa.ActionBar.fromQueueItemList, 13);
        sparseIntArray.put(C13754dXa.ActionBar.ZNPcth, 14);
        sparseIntArray.put(C13754dXa.ActionBar.getQueue, 15);
    }

    public C16578ema(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, AuCTel, fARcdN));
    }

    public C16578ema(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C57439yiT) objArr[5], (AppBarLayout) objArr[2], (android.widget.ImageView) objArr[12], (gBL) objArr[3], (android.view.View) objArr[7], (android.widget.ImageView) objArr[10], (C21321gxZ) objArr[6], (android.widget.TextView) objArr[11], (NestedScrollView) objArr[14], (android.widget.TextView) objArr[9], (ConstraintLayout) objArr[8], (CardView) objArr[4], (RecyclerView) objArr[15], (C33603mza) objArr[1], (C33546myW) objArr[0], (Group) objArr[13]);
        this.fIwbmz = -1L;
        this.isConnected.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
