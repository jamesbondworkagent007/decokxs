package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uPU extends uPV {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fIwbmz = null;
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
        AuCTel = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.Ranim, 1);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi24TransportControls, 2);
        sparseIntArray.put(C48033uCm.Application.ActivityResult, 3);
        sparseIntArray.put(C48033uCm.Application.iZzfmt, 4);
        sparseIntArray.put(C48033uCm.Application.MediaDescriptionCompatApi23Builder, 5);
        sparseIntArray.put(C48033uCm.Application.Rinterpolator, 6);
        sparseIntArray.put(C48033uCm.Application.YqksP, 7);
        sparseIntArray.put(C48033uCm.Application.calculateTwilight, 8);
        sparseIntArray.put(C48033uCm.Application.onSessionEvent, 9);
        sparseIntArray.put(C48033uCm.Application.bindRcKey, 10);
        sparseIntArray.put(C48033uCm.Application.parseTransition, 11);
        sparseIntArray.put(C48033uCm.Application.RhlVAI, 12);
        sparseIntArray.put(C48033uCm.Application.RsCxkX, 13);
        sparseIntArray.put(C48033uCm.Application.addSubscription, 14);
        sparseIntArray.put(C48033uCm.Application.OCdtug, 15);
    }

    public uPU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fIwbmz, AuCTel));
    }

    public uPU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[4], (C51441vnA) objArr[7], (C55173xeu) objArr[15], (android.widget.LinearLayout) objArr[12], (android.widget.FrameLayout) objArr[13], (android.widget.LinearLayout) objArr[14], (android.widget.LinearLayout) objArr[5], (android.widget.FrameLayout) objArr[0], (C55254xgV) objArr[9], (C33537myN) objArr[2], (C47969uAc) objArr[3], (android.widget.ImageView) objArr[10], (C51623vqX) objArr[1], (C51625vqZ) objArr[6], (ConstraintLayout) objArr[8], (ViewPager2) objArr[11]);
        this.fARcdN = -1L;
        this.AYXKKw.setTag(null);
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
