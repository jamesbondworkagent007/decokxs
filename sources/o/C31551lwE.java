package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LiveData;

/* JADX INFO: renamed from: o.lwE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31551lwE extends AbstractC31595lwx {
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public static final android.util.SparseIntArray copydefault = null;
    public final ConstraintLayout AYXKKw;
    public long valueOf;

    public C31551lwE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, EZpvd, copydefault));
    }

    public C31551lwE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 5, (C52794wYp) objArr[1], (C52794wYp) objArr[2]);
        this.valueOf = -1L;
        this.AEQbTJ.setTag(null);
        this.OLrzqt.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 64L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C31350lsP.AEQbTJ != i) {
            return false;
        }
        AEQbTJ((lzS) obj);
        return true;
    }

    @Override // o.AbstractC31595lwx
    public void AEQbTJ(@androidx.annotation.Nullable lzS lzs) {
        this.KWHzl = lzs;
        synchronized (this) {
            this.valueOf |= 32;
        }
        notifyPropertyChanged(C31350lsP.AEQbTJ);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return KWHzl((LiveData) obj, i2);
        }
        if (i == 1) {
            return OLrzqt((LiveData) obj, i2);
        }
        if (i == 2) {
            return copydefault((LiveData) obj, i2);
        }
        if (i == 3) {
            return AEQbTJ((LiveData) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return EZpvd((LiveData) obj, i2);
    }

    public final boolean KWHzl(LiveData<java.lang.String> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 1;
        }
        return true;
    }

    public final boolean OLrzqt(LiveData<java.lang.String> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 2;
        }
        return true;
    }

    public final boolean copydefault(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 4;
        }
        return true;
    }

    public final boolean AEQbTJ(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 8;
        }
        return true;
    }

    public final boolean EZpvd(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 16;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a A[PHI: r2
  0x008a: PHI (r2v3 long) = (r2v0 long), (r2v9 long) binds: [B:27:0x005b, B:41:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df A[PHI: r2
  0x00df: PHI (r2v5 long) = (r2v4 long), (r2v7 long) binds: [B:57:0x00b3, B:71:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        int i;
        java.lang.String value;
        int i2;
        boolean z;
        java.lang.String str;
        java.lang.String value2;
        long j2;
        boolean zSafeUnbox;
        long j3;
        int i3;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        lzS lzs = this.KWHzl;
        if ((127 & j) == 0) {
            i = 0;
            value = null;
            i2 = 0;
            z = false;
            str = null;
        } else if ((j & 97) == 0) {
            value = null;
            if ((j & 98) == 0) {
                value2 = null;
                j2 = j & 100;
                if (j2 == 0) {
                    i2 = 0;
                    if ((j & 104) == 0) {
                        LiveData<java.lang.Boolean> liveDataEZpvd = lzs != null ? lzs.EZpvd() : null;
                        updateLiveDataRegistration(3, liveDataEZpvd);
                        zSafeUnbox = ViewDataBinding.safeUnbox(liveDataEZpvd != null ? liveDataEZpvd.getValue() : null);
                    } else {
                        zSafeUnbox = false;
                    }
                    j3 = j & 112;
                    if (j3 == 0) {
                        i3 = 0;
                        str = value2;
                        i = i3;
                        z = zSafeUnbox;
                    } else {
                        LiveData<java.lang.Boolean> liveDataKWHzl = lzs != null ? lzs.KWHzl() : null;
                        updateLiveDataRegistration(4, liveDataKWHzl);
                        boolean zSafeUnbox2 = ViewDataBinding.safeUnbox(liveDataKWHzl != null ? liveDataKWHzl.getValue() : null);
                        if (j3 != 0) {
                            j |= zSafeUnbox2 ? 1024L : 512L;
                        }
                        if (!zSafeUnbox2) {
                            i3 = 8;
                        }
                        str = value2;
                        i = i3;
                        z = zSafeUnbox;
                    }
                } else {
                    LiveData<java.lang.Boolean> liveDataCopydefault = lzs != null ? lzs.copydefault() : null;
                    updateLiveDataRegistration(2, liveDataCopydefault);
                    boolean zSafeUnbox3 = ViewDataBinding.safeUnbox(liveDataCopydefault != null ? liveDataCopydefault.getValue() : null);
                    if (j2 != 0) {
                        j |= zSafeUnbox3 ? 256L : 128L;
                    }
                    if (!zSafeUnbox3) {
                        i2 = 8;
                    }
                    if ((j & 104) == 0) {
                    }
                    j3 = j & 112;
                    if (j3 == 0) {
                    }
                }
            } else {
                LiveData<java.lang.String> liveDataOLrzqt = lzs != null ? lzs.OLrzqt() : null;
                updateLiveDataRegistration(1, liveDataOLrzqt);
                if (liveDataOLrzqt != null) {
                    value2 = liveDataOLrzqt.getValue();
                }
                j2 = j & 100;
                if (j2 == 0) {
                }
            }
        } else {
            LiveData<java.lang.String> liveDataAEQbTJ = lzs != null ? lzs.AEQbTJ() : null;
            updateLiveDataRegistration(0, liveDataAEQbTJ);
            if (liveDataAEQbTJ != null) {
                value = liveDataAEQbTJ.getValue();
            }
            if ((j & 98) == 0) {
            }
        }
        if ((104 & j) != 0) {
            this.AEQbTJ.setEnabled(z);
        }
        if ((j & 98) != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, str);
        }
        if ((112 & j) != 0) {
            this.AEQbTJ.setVisibility(i);
        }
        if ((97 & j) != 0) {
            TextViewBindingAdapter.setText(this.OLrzqt, value);
        }
        if ((j & 100) != 0) {
            this.OLrzqt.setVisibility(i2);
        }
    }
}
