package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uUm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48521uUm extends AbstractC48524uUp {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long fJNWhG;
    public final C50942vdf getNewProxyInstance;
    public final android.widget.LinearLayout hDKMBd;

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
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi21TransportControls, 3);
        sparseIntArray.put(C48033uCm.Application.DdI, 4);
        sparseIntArray.put(C48033uCm.Application.target, 5);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplBase6, 6);
        sparseIntArray.put(C48033uCm.Application.postOrRun, 7);
        sparseIntArray.put(C48033uCm.Application.dNCPSb, 8);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 9);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 10);
        sparseIntArray.put(C48033uCm.Application.putString, 11);
        sparseIntArray.put(C48033uCm.Application.onScrollChanged, 12);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 13);
        sparseIntArray.put(C48033uCm.Application.dPkBzA, 14);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompat, 15);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatApi22, 16);
        sparseIntArray.put(C48033uCm.Application.onWindowVisibilityChanged, 17);
        sparseIntArray.put(C48033uCm.Application.onFitSystemWindows, 18);
    }

    public C48521uUm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, ejfBZ, fIwbmz));
    }

    public C48521uUm(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C47988uAv) objArr[8], (C53539wnR) objArr[9], (android.widget.TextView) objArr[14], (LinearLayoutCompat) objArr[1], (android.widget.TextView) objArr[10], (ConstraintLayout) objArr[4], (android.widget.ImageView) objArr[15], (C50191vFg) objArr[7], (C50348vLb) objArr[6], (vKO) objArr[11], (NestedScrollView) objArr[3], (RecyclerView) objArr[16], (vKO) objArr[12], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[18], (android.view.View) objArr[17], (C54154wyx) objArr[13]);
        this.fJNWhG = -1L;
        this.EZpvd.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.hDKMBd = linearLayout;
        linearLayout.setTag(null);
        java.lang.Object obj = objArr[2];
        this.getNewProxyInstance = obj != null ? C50942vdf.EZpvd((android.view.View) obj) : null;
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
        synchronized (this) {
            this.fJNWhG = 0L;
        }
    }
}
