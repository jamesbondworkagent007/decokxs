package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16510elL extends AbstractC16507elI {
    public static final android.util.SparseIntArray fIwbmz;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long ejfBZ;
    public final ConstraintLayout iwGUEr;

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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.setCurrentControllerInfo, 1);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatItemCallbackItemCallbackApi23, 2);
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiver2Default, 3);
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiverStubProxy, 4);
        sparseIntArray.put(C13754dXa.ActionBar.MediaMetadataCompatBitmapKey, 5);
        sparseIntArray.put(C13754dXa.ActionBar.getPlaybackSpeed, 6);
        sparseIntArray.put(C13754dXa.ActionBar.setActive, 7);
        sparseIntArray.put(C13754dXa.ActionBar.getDefaultCipherSuites, 8);
        sparseIntArray.put(C13754dXa.ActionBar.getLastPositionUpdateTime, 9);
        sparseIntArray.put(C13754dXa.ActionBar.handleOnBackPressed, 10);
        sparseIntArray.put(C13754dXa.ActionBar.remove, 11);
        sparseIntArray.put(C13754dXa.ActionBar.fQQVvf, 12);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatErrorCode, 13);
        sparseIntArray.put(C13754dXa.ActionBar.gCiISl, 14);
        sparseIntArray.put(C13754dXa.ActionBar.getIcon, 15);
        sparseIntArray.put(C13754dXa.ActionBar.getErrorCode, 16);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfNUfqk, 17);
    }

    public C16510elL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, fJNWhG, fIwbmz));
    }

    public C16510elL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[17], (Barrier) objArr[12], (android.widget.TextView) objArr[14], (RecyclerView) objArr[8], (C13791dYk) objArr[2], (android.view.View) objArr[5], (android.widget.TextView) objArr[7], (C33546myW) objArr[1], (ConstraintLayout) objArr[9], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[13], (C52794wYp) objArr[15], (AppCompatTextView) objArr[3], (C55173xeu) objArr[4], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[10]);
        this.ejfBZ = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.iwGUEr = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
