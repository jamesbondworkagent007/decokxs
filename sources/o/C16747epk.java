package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16747epk extends AbstractC16746epj {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public final ConstraintLayout fARcdN;
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
        AuCTel = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.iMXFZQ, 1);
        sparseIntArray.put(C13754dXa.ActionBar.sjbWxX, 2);
        sparseIntArray.put(C13754dXa.ActionBar.IIEbr, 3);
        sparseIntArray.put(C13754dXa.ActionBar.wtf, 4);
        sparseIntArray.put(C13754dXa.ActionBar.isDevMode, 5);
        sparseIntArray.put(C13754dXa.ActionBar.unregisterCallbackListener, 6);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi21, 7);
        sparseIntArray.put(C13754dXa.ActionBar.fVBECu, 8);
        sparseIntArray.put(C13754dXa.ActionBar.f1053a, 9);
        sparseIntArray.put(C13754dXa.ActionBar.USBtdM, 10);
        sparseIntArray.put(C13754dXa.ActionBar.xxhdY, 11);
        sparseIntArray.put(C13754dXa.ActionBar.setShuffleMode, 12);
        sparseIntArray.put(C13754dXa.ActionBar.setRepeatMode, 13);
        sparseIntArray.put(C13754dXa.ActionBar.removeQueueItemAt, 14);
    }

    public C16747epk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, fetchVPNInfo, AuCTel));
    }

    public C16747epk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[10], (Guideline) objArr[11], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[5], (C15503eKt) objArr[14], (C15503eKt) objArr[13], (C15503eKt) objArr[12], (AppCompatImageView) objArr[6], (C15509eKz) objArr[7]);
        this.fIwbmz = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fARcdN = constraintLayout;
        constraintLayout.setTag(null);
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
