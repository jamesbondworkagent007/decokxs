package o;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.buysell.ui.result.ConvertResultViewModel;
import com.okinc.convenientbanner.ConvenientBanner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.ltL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31399ltL extends AbstractC31397ltJ {
    public static final ViewDataBinding.IncludedLayouts AkhnZx;
    public static final android.util.SparseIntArray DbNXlk;
    public final ConstraintLayout AuCTel;
    public long fIwbmz;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        AkhnZx = includedLayouts;
        includedLayouts.setIncludes(6, new java.lang.String[]{"layout_buy_sell_footer"}, new int[]{7}, new int[]{C31351lsQ.ActionBar.OqFWZa});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.gbIfDn, 8);
        sparseIntArray.put(C31351lsQ.Application.zeUYeG, 9);
        sparseIntArray.put(C31351lsQ.Application.DwQSDd, 10);
        sparseIntArray.put(C31351lsQ.Application.aQtmcU, 11);
        sparseIntArray.put(C31351lsQ.Application.AuCTelauCTel, 12);
    }

    public C31399ltL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, AkhnZx, DbNXlk));
    }

    public C31399ltL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 6, (ConvenientBanner) objArr[12], (android.widget.ImageView) objArr[2], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[6], (LottieAnimationView) objArr[10], (android.widget.ScrollView) objArr[8], (android.widget.TextView) objArr[11], (AbstractC31595lwx) objArr[7], (ConstraintLayout) objArr[9], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.fIwbmz = -1L;
        this.EZpvd.setTag(null);
        this.KWHzl.setTag(null);
        this.OLrzqt.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AuCTel = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.gEmmrt);
        this.isConnected.setTag(null);
        this.values.setTag(null);
        this.fetchVPNInfo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 128L;
        }
        this.gEmmrt.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fIwbmz != 0) {
                return true;
            }
            return this.gEmmrt.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C31350lsP.AEQbTJ != i) {
            return false;
        }
        EZpvd((ConvertResultViewModel) obj);
        return true;
    }

    @Override // o.AbstractC31397ltJ
    public void EZpvd(@androidx.annotation.Nullable ConvertResultViewModel convertResultViewModel) {
        this.AYXKKw = convertResultViewModel;
        synchronized (this) {
            this.fIwbmz |= 64;
        }
        notifyPropertyChanged(C31350lsP.AEQbTJ);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.gEmmrt.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return AEQbTJ((LiveData) obj, i2);
        }
        if (i == 1) {
            return KWHzl((LiveData<java.lang.String>) obj, i2);
        }
        if (i == 2) {
            return EZpvd((LiveData) obj, i2);
        }
        if (i == 3) {
            return copydefault((LiveData) obj, i2);
        }
        if (i == 4) {
            return OLrzqt((LiveData<java.lang.String>) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return OLrzqt((AbstractC31595lwx) obj, i2);
    }

    public final boolean AEQbTJ(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 1;
        }
        return true;
    }

    public final boolean KWHzl(LiveData<java.lang.String> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 2;
        }
        return true;
    }

    public final boolean EZpvd(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 4;
        }
        return true;
    }

    public final boolean copydefault(LiveData<java.lang.String> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 8;
        }
        return true;
    }

    public final boolean OLrzqt(LiveData<java.lang.String> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 16;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC31595lwx abstractC31595lwx, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 32;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e A[PHI: r2
  0x004e: PHI (r2v3 long) = (r2v0 long), (r2v9 long) binds: [B:9:0x0020, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f A[PHI: r2
  0x009f: PHI (r2v5 long) = (r2v4 long), (r2v7 long) binds: [B:37:0x0070, B:51:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        java.lang.String str;
        int i;
        int i2;
        java.lang.String value;
        java.lang.String str2;
        java.lang.String value2;
        long j2;
        int i3;
        java.lang.String value3;
        synchronized (this) {
            j = this.fIwbmz;
            this.fIwbmz = 0L;
        }
        ConvertResultViewModel convertResultViewModel = this.AYXKKw;
        if ((223 & j) != 0) {
            long j3 = j & 193;
            if (j3 == 0) {
                i = 0;
                if ((j & 194) == 0) {
                    value2 = null;
                    j2 = j & 196;
                    if (j2 == 0) {
                        i3 = 0;
                        if ((j & 200) == 0) {
                            value3 = null;
                            if ((j & 208) == 0) {
                                str = value2;
                                str2 = value3;
                                i2 = i3;
                                value = null;
                            } else {
                                LiveData<java.lang.String> liveDataCopydefault = convertResultViewModel != null ? convertResultViewModel.copydefault() : null;
                                updateLiveDataRegistration(4, liveDataCopydefault);
                                if (liveDataCopydefault != null) {
                                    str2 = value3;
                                    value = liveDataCopydefault.getValue();
                                    str = value2;
                                    i2 = i3;
                                }
                            }
                        } else {
                            LiveData<java.lang.String> liveDataValueOf = convertResultViewModel != null ? convertResultViewModel.valueOf() : null;
                            updateLiveDataRegistration(3, liveDataValueOf);
                            if (liveDataValueOf != null) {
                                value3 = liveDataValueOf.getValue();
                            }
                            if ((j & 208) == 0) {
                            }
                        }
                    } else {
                        LiveData<java.lang.Boolean> liveDataEZpvd = convertResultViewModel != null ? convertResultViewModel.EZpvd() : null;
                        updateLiveDataRegistration(2, liveDataEZpvd);
                        boolean zSafeUnbox = ViewDataBinding.safeUnbox(liveDataEZpvd != null ? liveDataEZpvd.getValue() : null);
                        if (j2 != 0) {
                            j |= zSafeUnbox ? PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH : 1024L;
                        }
                        if (!zSafeUnbox) {
                            i3 = 4;
                        }
                        if ((j & 200) == 0) {
                        }
                    }
                } else {
                    LiveData<java.lang.String> liveDataKWHzl = convertResultViewModel != null ? convertResultViewModel.KWHzl() : null;
                    updateLiveDataRegistration(1, liveDataKWHzl);
                    if (liveDataKWHzl != null) {
                        value2 = liveDataKWHzl.getValue();
                    }
                    j2 = j & 196;
                    if (j2 == 0) {
                    }
                }
            } else {
                LiveData<java.lang.Boolean> liveDataAEQbTJ = convertResultViewModel != null ? convertResultViewModel.AEQbTJ() : null;
                updateLiveDataRegistration(0, liveDataAEQbTJ);
                boolean zSafeUnbox2 = ViewDataBinding.safeUnbox(liveDataAEQbTJ != null ? liveDataAEQbTJ.getValue() : null);
                if (j3 != 0) {
                    j |= zSafeUnbox2 ? 512L : 256L;
                }
                if (!zSafeUnbox2) {
                    i = 8;
                }
                if ((j & 194) == 0) {
                }
            }
        } else {
            str = null;
            i = 0;
            i2 = 0;
            value = null;
            str2 = null;
        }
        if ((j & 196) != 0) {
            this.EZpvd.setVisibility(i2);
        }
        if ((128 & j) != 0) {
            ViewBindingAdapter.setPaddingTop(this.KWHzl, C33570myu.gEmmrt(getRoot().getContext()));
        }
        if ((208 & j) != 0) {
            TextViewBindingAdapter.setText(this.isConnected, value);
        }
        if ((194 & j) != 0) {
            TextViewBindingAdapter.setText(this.values, str);
        }
        if ((193 & j) != 0) {
            this.values.setVisibility(i);
        }
        if ((j & 200) != 0) {
            TextViewBindingAdapter.setText(this.fetchVPNInfo, str2);
        }
        ViewDataBinding.executeBindingsOn(this.gEmmrt);
    }
}
