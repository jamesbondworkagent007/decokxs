package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uZE extends uZB {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final android.widget.LinearLayout AuCTel;
    public long fARcdN;

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
        sparseIntArray.put(C48033uCm.Application.processPendingCallbacksLocked, 1);
        sparseIntArray.put(C48033uCm.Application.OtRJxF, 2);
        sparseIntArray.put(C48033uCm.Application.DjwCMv, 3);
        sparseIntArray.put(C48033uCm.Application.iLAtSv, 4);
        sparseIntArray.put(C48033uCm.Application.gdmIOq, 5);
        sparseIntArray.put(C48033uCm.Application.fXYAwm, 6);
        sparseIntArray.put(C48033uCm.Application.onBackPressedDispatcherlambda1, 7);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplApi21ExtraSession, 8);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1, 9);
        sparseIntArray.put(C48033uCm.Application.postOrRun, 10);
        sparseIntArray.put(C48033uCm.Application.onRequestPermissionsResult, 11);
        sparseIntArray.put(C48033uCm.Application.onNewIntent, 12);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsRequestPermission, 13);
    }

    public uZE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, DbNXlk, fetchVPNInfo));
    }

    public uZE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C51614vqO) objArr[6], (android.widget.TextView) objArr[5], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[2], (C51614vqO) objArr[10], (android.widget.TextView) objArr[9], (NestedScrollView) objArr[1], (C51614vqO) objArr[8], (C52794wYp) objArr[12], (C51614vqO) objArr[11], (C51614vqO) objArr[7], (C52794wYp) objArr[13]);
        this.fARcdN = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AuCTel = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
