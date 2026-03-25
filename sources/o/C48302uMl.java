package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48302uMl extends AbstractC48299uMi {
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long AuCTel;
    public final ConstraintLayout hDKMBd;

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
        sparseIntArray.put(C48033uCm.Application.Swccd, 1);
        sparseIntArray.put(C48033uCm.Application.hasHeart, 2);
        sparseIntArray.put(C48033uCm.Application.MediaDescriptionCompatApi21Builder, 3);
        sparseIntArray.put(C48033uCm.Application.getStarRating, 4);
        sparseIntArray.put(C48033uCm.Application.onPlaybackStateChanged, 5);
        sparseIntArray.put(C48033uCm.Application.onQueueChanged, 6);
        sparseIntArray.put(C48033uCm.Application.isThumbUp, 7);
        sparseIntArray.put(C48033uCm.Application.unsubscribe, 8);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplApi19, 9);
        sparseIntArray.put(C48033uCm.Application.RAQtXZ, 10);
        sparseIntArray.put(C48033uCm.Application.getBundle, 11);
        sparseIntArray.put(C48033uCm.Application.isReflectionWorking, 12);
        sparseIntArray.put(C48033uCm.Application.isRated, 13);
        sparseIntArray.put(C48033uCm.Application.IMediaControllerCallback, 14);
        sparseIntArray.put(C48033uCm.Application.getRatingStyle, 15);
        sparseIntArray.put(C48033uCm.Application.RatingCompat1, 16);
        sparseIntArray.put(C48033uCm.Application.onScrollStateChanged, 17);
    }

    public C48302uMl(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, fARcdN, fIwbmz));
    }

    public C48302uMl(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[12], (android.widget.FrameLayout) objArr[8], (ConstraintLayout) objArr[3], (C55113xdn) objArr[11], (C33624mzv) objArr[15], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[7], (C33624mzv) objArr[16], (android.widget.LinearLayout) objArr[13], (ConstraintLayout) objArr[4], (C52794wYp) objArr[14], (AppCompatTextView) objArr[5], (android.widget.TextView) objArr[6], (LinearLayoutCompat) objArr[9], (C33624mzv) objArr[17]);
        this.AuCTel = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.hDKMBd = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
