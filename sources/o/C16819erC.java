package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16819erC extends AbstractC16818erB {
    public static final android.util.SparseIntArray hDKMBd;
    public static final ViewDataBinding.IncludedLayouts uzCIH = null;
    public long getFieldNames;
    public final LinearLayoutCompat getNewProxyInstance;

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
        hDKMBd = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.gBtXYZ, 1);
        sparseIntArray.put(C13754dXa.ActionBar.zAGdSp, 2);
        sparseIntArray.put(C13754dXa.ActionBar.addMenuProvider, 3);
        sparseIntArray.put(C13754dXa.ActionBar.addOnConfigurationChangedListener, 4);
        sparseIntArray.put(C13754dXa.ActionBar.isAttachedToWindow, 5);
        sparseIntArray.put(C13754dXa.ActionBar.onComplete, 6);
        sparseIntArray.put(C13754dXa.ActionBar.RXxsjQ, 7);
        sparseIntArray.put(C13754dXa.ActionBar.ReportDrawnCompositionobserveReporter1, 8);
        sparseIntArray.put(C13754dXa.ActionBar.suggest, 9);
        sparseIntArray.put(C13754dXa.ActionBar.sendCommand, 10);
        sparseIntArray.put(C13754dXa.ActionBar.isInitInProgress, 11);
        sparseIntArray.put(C13754dXa.ActionBar.RVsVBY, 12);
        sparseIntArray.put(C13754dXa.ActionBar.onQueueChanged, 13);
        sparseIntArray.put(C13754dXa.ActionBar.onPlaybackStateChanged, 14);
        sparseIntArray.put(C13754dXa.ActionBar.onMetadataChanged, 15);
        sparseIntArray.put(C13754dXa.ActionBar.IMediaControllerCallback, 16);
        sparseIntArray.put(C13754dXa.ActionBar.onCaptioningEnabledChanged, 17);
        sparseIntArray.put(C13754dXa.ActionBar.onExtrasChanged, 18);
        sparseIntArray.put(C13754dXa.ActionBar.onQueueTitleChanged, 19);
        sparseIntArray.put(C13754dXa.ActionBar.RatingCompatStarStyle, 20);
    }

    public C16819erC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, uzCIH, hDKMBd));
    }

    public C16819erC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[12], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[6], (android.widget.ImageView) objArr[11], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[16], (android.widget.ImageView) objArr[20], (LinearLayoutCompat) objArr[17], (android.widget.TextView) objArr[19], (LinearLayoutCompat) objArr[18], (android.widget.TextView) objArr[15], (LinearLayoutCompat) objArr[14], (LinearLayoutCompat) objArr[13], (Barrier) objArr[10], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3], (C55251xgS) objArr[4], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9]);
        this.getFieldNames = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.getNewProxyInstance = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
