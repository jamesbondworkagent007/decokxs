package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uTK extends uTI {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public final LinearLayoutCompat fARcdN;
    public long fJNWhG;

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
        sparseIntArray.put(C48033uCm.Application.iUnTnt, 1);
        sparseIntArray.put(C48033uCm.Application.onExtraCallback, 2);
        sparseIntArray.put(C48033uCm.Application.DzOuPm, 3);
        sparseIntArray.put(C48033uCm.Application.BackHandlerKtBackHandlerbackCallback11, 4);
        sparseIntArray.put(C48033uCm.Application.accessBackHandlerlambda0, 5);
        sparseIntArray.put(C48033uCm.Application.ComponentActivityKt, 6);
        sparseIntArray.put(C48033uCm.Application.setContent, 7);
        sparseIntArray.put(C48033uCm.Application.setOwners, 8);
        sparseIntArray.put(C48033uCm.Application.dTTfOR, 9);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatApi21, 10);
        sparseIntArray.put(C48033uCm.Application.ActionBarDrawerToggleDelegate, 11);
        sparseIntArray.put(C48033uCm.Application.Srftgn, 12);
        sparseIntArray.put(C48033uCm.Application.AnyThread, 13);
    }

    public uTK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, fetchVPNInfo, AkhnZx));
    }

    public uTK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (C55173xeu) objArr[3], (C51965vwv) objArr[12], (C52005vxi) objArr[9], (android.widget.ImageView) objArr[2], (C52011vxo) objArr[10], (AppCompatImageView) objArr[5], (NestedScrollView) objArr[8], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[6], (android.widget.RelativeLayout) objArr[4], (C52794wYp) objArr[13], (C52018vxv) objArr[11]);
        this.fJNWhG = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.fARcdN = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fJNWhG = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fJNWhG != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.fJNWhG;
            this.fJNWhG = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.fARcdN, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
