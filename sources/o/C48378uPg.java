package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uPg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48378uPg extends AbstractC48380uPi {
    public static final android.util.SparseIntArray ejfBZ;
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
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
        ejfBZ = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.MediaDescriptionCompat1, 1);
        sparseIntArray.put(C48033uCm.Application.Ranim, 2);
        sparseIntArray.put(C48033uCm.Application.ensureClassLoader, 3);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi24TransportControls, 4);
        sparseIntArray.put(C48033uCm.Application.DHEdFZ, 5);
        sparseIntArray.put(C48033uCm.Application.ActivityResult, 6);
        sparseIntArray.put(C48033uCm.Application.iZzfmt, 7);
        sparseIntArray.put(C48033uCm.Application.MediaDescriptionCompatApi23Builder, 8);
        sparseIntArray.put(C48033uCm.Application.Rinterpolator, 9);
        sparseIntArray.put(C48033uCm.Application.onSessionEvent, 10);
        sparseIntArray.put(C48033uCm.Application.finit, 11);
        sparseIntArray.put(C48033uCm.Application.parseTransition, 12);
        sparseIntArray.put(C48033uCm.Application.RhlVAI, 13);
        sparseIntArray.put(C48033uCm.Application.RsCxkX, 14);
        sparseIntArray.put(C48033uCm.Application.addSubscription, 15);
        sparseIntArray.put(C48033uCm.Application.OCdtug, 16);
    }

    public C48378uPg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, fARcdN, ejfBZ));
    }

    public C48378uPg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[11], (AppBarLayout) objArr[7], (C55173xeu) objArr[16], (android.widget.LinearLayout) objArr[13], (android.widget.FrameLayout) objArr[14], (AppCompatImageView) objArr[5], (android.widget.LinearLayout) objArr[1], (android.widget.LinearLayout) objArr[15], (android.widget.LinearLayout) objArr[8], (android.widget.FrameLayout) objArr[0], (C55254xgV) objArr[10], (C33537myN) objArr[4], (android.widget.FrameLayout) objArr[3], (C47969uAc) objArr[6], (C51623vqX) objArr[2], (C51612vqM) objArr[9], (ViewPager2) objArr[12]);
        this.fJNWhG = -1L;
        this.AYXKKw.setTag(null);
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
