package o;

import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import o.C48688uaR;

/* JADX INFO: renamed from: o.uaV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48692uaV extends AbstractC48691uaU {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray valueOf;
    public long DbNXlk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.gEmmrt = z;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C48688uaR.StateListAnimator.fetchVPNInfo, 2);
        sparseIntArray.put(C48688uaR.StateListAnimator.AuCTel, 3);
        sparseIntArray.put(C48688uaR.StateListAnimator.fIwbmz, 4);
    }

    public C48692uaV(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, AhwBna, valueOf));
    }

    public C48692uaV(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[0], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[2], (C55251xgS) objArr[3], (AppCompatTextView) objArr[4]);
        this.DbNXlk = -1L;
        this.copydefault.setTag(null);
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C48687uaQ.copydefault == i) {
            AEQbTJ(((java.lang.Boolean) obj).booleanValue());
        } else if (C48687uaQ.AEQbTJ == i) {
            EZpvd(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (C48687uaQ.EZpvd != i) {
                return false;
            }
            KWHzl(((java.lang.Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // o.AbstractC48691uaU
    public void AEQbTJ(boolean z) {
        this.AEQbTJ = z;
        synchronized (this) {
            this.DbNXlk |= 1;
        }
        notifyPropertyChanged(C48687uaQ.copydefault);
        super.requestRebind();
    }

    @Override // o.AbstractC48691uaU
    public void KWHzl(boolean z) {
        this.OLrzqt = z;
        synchronized (this) {
            this.DbNXlk |= 4;
        }
        notifyPropertyChanged(C48687uaQ.EZpvd);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        android.graphics.drawable.Drawable drawable;
        synchronized (this) {
            j = this.DbNXlk;
            this.DbNXlk = 0L;
        }
        boolean z = this.AEQbTJ;
        boolean z2 = this.OLrzqt;
        long j2 = j & 9;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
            if (!z) {
                i = 8;
            }
        }
        long j3 = j & 12;
        if (j3 != 0) {
            if (j3 != 0) {
                j |= z2 ? 128L : 64L;
            }
            drawable = AppCompatResources.getDrawable(this.KWHzl.getContext(), z2 ? C48688uaR.ActionBar.EZpvd : C48688uaR.ActionBar.OLrzqt);
        } else {
            drawable = null;
        }
        if ((12 & j) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.KWHzl, drawable);
        }
        if ((j & 9) != 0) {
            this.KWHzl.setVisibility(i);
        }
    }
}
