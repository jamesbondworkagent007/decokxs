package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uUq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48525uUq extends AbstractC48527uUs {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final android.widget.LinearLayout fARcdN;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi21TransportControls, 1);
        sparseIntArray.put(C48033uCm.Application.MediaMetadataCompatRatingKey, 2);
        sparseIntArray.put(C48033uCm.Application.dNCPSb, 3);
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBarActionModeImpl, 4);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 5);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 6);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 7);
        sparseIntArray.put(C48033uCm.Application.DzCpqu, 8);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21, 9);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompat, 10);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatApi22, 11);
        sparseIntArray.put(C48033uCm.Application.onWindowVisibilityChanged, 12);
        sparseIntArray.put(C48033uCm.Application.onFitSystemWindows, 13);
    }

    public C48525uUq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, AkhnZx, fetchVPNInfo));
    }

    public C48525uUq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C47988uAv) objArr[3], (C53539wnR) objArr[5], (android.view.View) objArr[8], (android.widget.TextView) objArr[7], (android.widget.ImageView) objArr[10], (android.widget.LinearLayout) objArr[9], (C52563wQa) objArr[2], (NestedScrollView) objArr[1], (RecyclerView) objArr[11], (android.widget.TextView) objArr[13], (android.view.View) objArr[12], (uBL) objArr[4], (C54154wyx) objArr[6]);
        this.fIwbmz = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fARcdN = linearLayout;
        linearLayout.setTag(null);
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
