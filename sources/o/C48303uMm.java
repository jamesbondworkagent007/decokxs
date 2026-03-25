package o;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48303uMm extends AbstractC48307uMq {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public final android.widget.RelativeLayout AuCTel;
    public long DbNXlk;
    public final android.widget.FrameLayout ejfBZ;
    public final LinearLayoutCompat fARcdN;
    public final LinearLayoutCompat fJNWhG;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        values = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.postToHandler, 6);
        sparseIntArray.put(C48033uCm.Application.invokespecialhlXVux, 7);
        sparseIntArray.put(C48033uCm.Application.dUDNAs, 8);
        sparseIntArray.put(C48033uCm.Application.onCaptioningEnabledChanged, 9);
        sparseIntArray.put(C48033uCm.Application.onQueueTitleChanged, 10);
        sparseIntArray.put(C48033uCm.Application.setRating, 11);
    }

    public C48303uMm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, isConnected, values));
    }

    public C48303uMm(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[3], (FragmentContainerView) objArr[8], (AppCompatTextView) objArr[7], (C55254xgV) objArr[9], (ViewPager2) objArr[10], (AppCompatImageView) objArr[6], (C33546myW) objArr[2], (C55173xeu) objArr[11]);
        this.DbNXlk = -1L;
        this.copydefault.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.fARcdN = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) objArr[1];
        this.AuCTel = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) objArr[4];
        this.fJNWhG = linearLayoutCompat2;
        linearLayoutCompat2.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[5];
        this.ejfBZ = frameLayout;
        frameLayout.setTag(null);
        this.AkhnZx.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 16L;
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
        if (C48034uCn.valueOf == i) {
            KWHzl(((java.lang.Boolean) obj).booleanValue());
        } else if (C48034uCn.AYXKKw == i) {
            EZpvd(((java.lang.Boolean) obj).booleanValue());
        } else if (C48034uCn.djBIcL == i) {
            copydefault(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (C48034uCn.DbNXlk != i) {
                return false;
            }
            OLrzqt(((java.lang.Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // o.AbstractC48307uMq
    public void KWHzl(boolean z) {
        this.KWHzl = z;
        synchronized (this) {
            this.DbNXlk |= 1;
        }
        notifyPropertyChanged(C48034uCn.valueOf);
        super.requestRebind();
    }

    @Override // o.AbstractC48307uMq
    public void EZpvd(boolean z) {
        this.OLrzqt = z;
        synchronized (this) {
            this.DbNXlk |= 2;
        }
        notifyPropertyChanged(C48034uCn.AYXKKw);
        super.requestRebind();
    }

    @Override // o.AbstractC48307uMq
    public void copydefault(boolean z) {
        this.djBIcL = z;
        synchronized (this) {
            this.DbNXlk |= 4;
        }
        notifyPropertyChanged(C48034uCn.djBIcL);
        super.requestRebind();
    }

    @Override // o.AbstractC48307uMq
    public void OLrzqt(boolean z) {
        this.valueOf = z;
        synchronized (this) {
            this.DbNXlk |= 8;
        }
        notifyPropertyChanged(C48034uCn.DbNXlk);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this) {
            j = this.DbNXlk;
            this.DbNXlk = 0L;
        }
        boolean z = this.KWHzl;
        boolean z2 = this.OLrzqt;
        boolean z3 = this.djBIcL;
        boolean z4 = this.valueOf;
        long j2 = j & 25;
        if (j2 != 0 && j2 != 0) {
            j = z ? j | PlaybackStateCompat.ACTION_SET_REPEAT_MODE : j | PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        }
        long j3 = j & 18;
        if (j3 != 0) {
            if (j3 != 0) {
                j |= z2 ? 81920L : 40960L;
            }
            i = z2 ? 0 : 8;
        } else {
            z2 = false;
            i = 0;
        }
        long j4 = j & 20;
        if (j4 != 0) {
            if (j4 != 0) {
                j |= z3 ? 320L : 160L;
            }
            int i6 = z3 ? 0 : 8;
            i2 = z3 ? 8 : 0;
            i3 = i6;
        } else {
            i2 = 0;
            i3 = 0;
        }
        long j5 = j & 24;
        if (j5 != 0) {
            if (j5 != 0) {
                j = z4 ? j | PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : j | PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            i4 = z4 ? 0 : 8;
        } else {
            i4 = 0;
        }
        if ((PlaybackStateCompat.ACTION_PREPARE_FROM_URI & j) != 0 && (j & 24) != 0) {
            j = z4 ? j | PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : j | PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        long j6 = j & 25;
        if (j6 != 0) {
            if (z) {
                z4 = true;
            }
            if (j6 != 0) {
                j |= z4 ? 1024L : 512L;
            }
            i5 = z4 ? 0 : 8;
        } else {
            i5 = 0;
        }
        if ((j & 25) != 0) {
            this.copydefault.setVisibility(i5);
        }
        if ((j & 18) != 0) {
            if (ViewDataBinding.getBuildSdkInt() >= 14) {
                this.fARcdN.setFitsSystemWindows(z2);
            }
            this.AuCTel.setVisibility(i);
        }
        if ((j & 24) != 0) {
            this.fJNWhG.setVisibility(i4);
        }
        if ((j & 20) != 0) {
            this.ejfBZ.setVisibility(i3);
            this.AkhnZx.setVisibility(i2);
        }
    }
}
