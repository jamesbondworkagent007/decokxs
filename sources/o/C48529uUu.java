package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uUu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48529uUu extends AbstractC48528uUt {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray iwGUEr;
    public long uzCIH;

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
        iwGUEr = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.postOrRun, 1);
        sparseIntArray.put(C48033uCm.Application.dNCPSb, 2);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 3);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 4);
        sparseIntArray.put(C48033uCm.Application.isBrowsable, 5);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 6);
        sparseIntArray.put(C48033uCm.Application.dPkBzA, 7);
        sparseIntArray.put(C48033uCm.Application.access001, 8);
        sparseIntArray.put(C48033uCm.Application.addOnPictureInPictureModeChangedListener, 9);
        sparseIntArray.put(C48033uCm.Application.addOnContextAvailableListener, 10);
        sparseIntArray.put(C48033uCm.Application.DGOPHZ, 11);
        sparseIntArray.put(C48033uCm.Application.call, 12);
        sparseIntArray.put(C48033uCm.Application.DCUTEIddSDPG, 13);
        sparseIntArray.put(C48033uCm.Application.WS, 14);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompat, 15);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatApi22, 16);
        sparseIntArray.put(C48033uCm.Application.onWindowVisibilityChanged, 17);
        sparseIntArray.put(C48033uCm.Application.onFitSystemWindows, 18);
    }

    public C48529uUu(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, ejfBZ, iwGUEr));
    }

    public C48529uUu(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C47988uAv) objArr[2], (C47988uAv) objArr[13], (C55239xgG) objArr[12], (C55258xgZ) objArr[11], (AppCompatTextView) objArr[14], (C53539wnR) objArr[3], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[4], (AppCompatImageView) objArr[15], (C50191vFg) objArr[1], (vKO) objArr[5], (NestedScrollView) objArr[0], (RecyclerView) objArr[16], (ConstraintLayout) objArr[8], (C55239xgG) objArr[10], (C55258xgZ) objArr[9], (android.widget.TextView) objArr[18], (android.view.View) objArr[17], (C54154wyx) objArr[6]);
        this.uzCIH = -1L;
        this.fetchVPNInfo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.uzCIH = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.uzCIH != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.uzCIH = 0L;
        }
    }
}
