package o;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.huawei.hms.utils.FileUtil;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47320tnn extends AbstractC47322tnp {
    public static final ViewDataBinding.IncludedLayouts fIwbmz;
    public static final android.util.SparseIntArray fJNWhG;
    public final android.widget.LinearLayout AuCTel;
    public long fARcdN;
    public final android.widget.LinearLayout getNewProxyInstance;
    public final android.widget.LinearLayout hDKMBd;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        fIwbmz = includedLayouts;
        int i = C47315tni.ActionBar.OFhtUX;
        int i2 = C47315tni.ActionBar.OHqIaq;
        includedLayouts.setIncludes(3, new java.lang.String[]{"layout_feedback_bounty_slogan", "layout_feedback_bounty_button", "layout_feedback_bounty_button", "layout_feedback_bounty_button"}, new int[]{6, 7, 8, 9}, new int[]{i, i2, i2, i2});
        includedLayouts.setIncludes(4, new java.lang.String[]{"layout_feedback_bounty_slogan", "layout_feedback_bounty_button"}, new int[]{10, 11}, new int[]{C47315tni.ActionBar.OFhtUX, C47315tni.ActionBar.OHqIaq});
        fJNWhG = null;
    }

    public C47320tnn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, fIwbmz, fJNWhG));
    }

    public C47320tnn(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 8, (C33537myN) objArr[1], (android.widget.TextView) objArr[2], (AbstractC47480tqo) objArr[7], (AbstractC47476tqk) objArr[10], (AbstractC47476tqk) objArr[6], (AbstractC47480tqo) objArr[8], (android.widget.TextView) objArr[5], (AbstractC47480tqo) objArr[11], (AbstractC47480tqo) objArr[9]);
        this.fARcdN = -1L;
        this.OLrzqt.setTag(null);
        this.AEQbTJ.setTag(null);
        setContainedBinding(this.copydefault);
        setContainedBinding(this.KWHzl);
        setContainedBinding(this.EZpvd);
        setContainedBinding(this.AhwBna);
        this.AYXKKw.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AuCTel = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) objArr[3];
        this.hDKMBd = linearLayout2;
        linearLayout2.setTag(null);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) objArr[4];
        this.getNewProxyInstance = linearLayout3;
        linearLayout3.setTag(null);
        setContainedBinding(this.DbNXlk);
        setContainedBinding(this.ejfBZ);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        this.EZpvd.invalidateAll();
        this.copydefault.invalidateAll();
        this.AhwBna.invalidateAll();
        this.ejfBZ.invalidateAll();
        this.KWHzl.invalidateAll();
        this.DbNXlk.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fARcdN != 0) {
                return true;
            }
            return this.EZpvd.hasPendingBindings() || this.copydefault.hasPendingBindings() || this.AhwBna.hasPendingBindings() || this.ejfBZ.hasPendingBindings() || this.KWHzl.hasPendingBindings() || this.DbNXlk.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C47317tnk.fetchVPNInfo == i) {
            AEQbTJ((LiveData<java.lang.Boolean>) obj);
        } else if (C47317tnk.KWHzl == i) {
            AEQbTJ((java.lang.String) obj);
        } else if (C47317tnk.AEQbTJ == i) {
            EZpvd((LiveData<java.lang.String>) obj);
        } else if (C47317tnk.isConnected == i) {
            KWHzl((java.lang.Boolean) obj);
        } else if (C47317tnk.valueOf == i) {
            EZpvd((java.lang.CharSequence) obj);
        } else if (C47317tnk.fIwbmz == i) {
            KWHzl((java.lang.CharSequence) obj);
        } else {
            if (C47317tnk.ejfBZ != i) {
                return false;
            }
            OLrzqt((java.lang.CharSequence) obj);
        }
        return true;
    }

    @Override // o.AbstractC47322tnp
    public void AEQbTJ(@androidx.annotation.Nullable LiveData<java.lang.Boolean> liveData) {
        updateLiveDataRegistration(1, liveData);
        this.isConnected = liveData;
        synchronized (this) {
            this.fARcdN |= 2;
        }
        notifyPropertyChanged(C47317tnk.fetchVPNInfo);
        super.requestRebind();
    }

    @Override // o.AbstractC47322tnp
    public void AEQbTJ(@androidx.annotation.Nullable java.lang.String str) {
        this.gEmmrt = str;
        synchronized (this) {
            this.fARcdN |= 256;
        }
        notifyPropertyChanged(C47317tnk.KWHzl);
        super.requestRebind();
    }

    @Override // o.AbstractC47322tnp
    public void EZpvd(@androidx.annotation.Nullable LiveData<java.lang.String> liveData) {
        updateLiveDataRegistration(3, liveData);
        this.djBIcL = liveData;
        synchronized (this) {
            this.fARcdN |= 8;
        }
        notifyPropertyChanged(C47317tnk.AEQbTJ);
        super.requestRebind();
    }

    @Override // o.AbstractC47322tnp
    public void KWHzl(@androidx.annotation.Nullable java.lang.Boolean bool) {
        this.AkhnZx = bool;
        synchronized (this) {
            this.fARcdN |= 512;
        }
        notifyPropertyChanged(C47317tnk.isConnected);
        super.requestRebind();
    }

    @Override // o.AbstractC47322tnp
    public void EZpvd(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
        this.valueOf = charSequence;
        synchronized (this) {
            this.fARcdN |= 1024;
        }
        notifyPropertyChanged(C47317tnk.valueOf);
        super.requestRebind();
    }

    @Override // o.AbstractC47322tnp
    public void KWHzl(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
        this.values = charSequence;
        synchronized (this) {
            this.fARcdN |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        notifyPropertyChanged(C47317tnk.fIwbmz);
        super.requestRebind();
    }

    @Override // o.AbstractC47322tnp
    public void OLrzqt(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
        this.fetchVPNInfo = charSequence;
        synchronized (this) {
            this.fARcdN |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        notifyPropertyChanged(C47317tnk.ejfBZ);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
        this.AhwBna.setLifecycleOwner(lifecycleOwner);
        this.ejfBZ.setLifecycleOwner(lifecycleOwner);
        this.KWHzl.setLifecycleOwner(lifecycleOwner);
        this.DbNXlk.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        switch (i) {
            case 0:
                return OLrzqt((AbstractC47476tqk) obj, i2);
            case 1:
                return copydefault((LiveData<java.lang.Boolean>) obj, i2);
            case 2:
                return AEQbTJ((AbstractC47476tqk) obj, i2);
            case 3:
                return OLrzqt((LiveData<java.lang.String>) obj, i2);
            case 4:
                return OLrzqt((AbstractC47480tqo) obj, i2);
            case 5:
                return EZpvd((AbstractC47480tqo) obj, i2);
            case 6:
                return KWHzl((AbstractC47480tqo) obj, i2);
            case 7:
                return copydefault((AbstractC47480tqo) obj, i2);
            default:
                return false;
        }
    }

    public final boolean OLrzqt(AbstractC47476tqk abstractC47476tqk, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 1;
        }
        return true;
    }

    public final boolean copydefault(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 2;
        }
        return true;
    }

    public final boolean AEQbTJ(AbstractC47476tqk abstractC47476tqk, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 4;
        }
        return true;
    }

    public final boolean OLrzqt(LiveData<java.lang.String> liveData, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 8;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC47480tqo abstractC47480tqo, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 16;
        }
        return true;
    }

    public final boolean EZpvd(AbstractC47480tqo abstractC47480tqo, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 32;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC47480tqo abstractC47480tqo, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 64;
        }
        return true;
    }

    public final boolean copydefault(AbstractC47480tqo abstractC47480tqo, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 128;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        boolean zBooleanValue;
        synchronized (this) {
            j = this.fARcdN;
            this.fARcdN = 0L;
        }
        LiveData<java.lang.Boolean> liveData = this.isConnected;
        java.lang.String str = this.gEmmrt;
        LiveData<java.lang.String> liveData2 = this.djBIcL;
        java.lang.Boolean bool = this.AkhnZx;
        java.lang.CharSequence charSequence = this.valueOf;
        java.lang.CharSequence charSequence2 = this.values;
        java.lang.CharSequence charSequence3 = this.fetchVPNInfo;
        long j2 = 8194 & j;
        java.lang.String value = null;
        if (j2 == 0) {
            zBooleanValue = false;
        } else {
            java.lang.Boolean value2 = liveData != null ? liveData.getValue() : null;
            if (value2 != null) {
                zBooleanValue = value2.booleanValue();
            }
        }
        long j3 = 8200 & j;
        if (j3 != 0 && liveData2 != null) {
            value = liveData2.getValue();
        }
        long j4 = j & 8704;
        boolean zSafeUnbox = j4 != 0 ? ViewDataBinding.safeUnbox(bool) : false;
        if ((j & 8448) != 0) {
            C45383sok.KWHzl(this.OLrzqt, str);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, value);
        }
        if (j2 != 0) {
            this.AEQbTJ.setVisibility(C57632ymA.AEQbTJ(zBooleanValue));
        }
        if ((PlaybackStateCompat.ACTION_PLAY_FROM_URI & j) != 0) {
            this.copydefault.OLrzqt(getRoot().getResources().getString(C47315tni.PendingIntent.zYHWMc));
            this.copydefault.copydefault(getRoot().getResources().getString(C47315tni.PendingIntent.DrqXHJ));
            this.AhwBna.OLrzqt(getRoot().getResources().getString(C47315tni.PendingIntent.DSiOMJ));
            this.AhwBna.copydefault(getRoot().getResources().getString(C47315tni.PendingIntent.DIIpTV));
            this.DbNXlk.OLrzqt(getRoot().getResources().getString(C47315tni.PendingIntent.fdOvFl));
            this.DbNXlk.copydefault(getRoot().getResources().getString(C47315tni.PendingIntent.fjfviF));
            this.ejfBZ.OLrzqt(getRoot().getResources().getString(C47315tni.PendingIntent.DUUtXg));
            this.ejfBZ.copydefault(getRoot().getResources().getString(C47315tni.PendingIntent.DGUQLIhJrIAr));
        }
        if ((12288 & j) != 0) {
            this.KWHzl.AEQbTJ(charSequence3);
        }
        if ((9216 & j) != 0) {
            this.EZpvd.AEQbTJ(charSequence);
        }
        if ((j & FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) != 0) {
            TextViewBindingAdapter.setText(this.AYXKKw, charSequence2);
        }
        if (j4 != 0) {
            this.hDKMBd.setVisibility(C57632ymA.AEQbTJ(zSafeUnbox));
        }
        ViewDataBinding.executeBindingsOn(this.EZpvd);
        ViewDataBinding.executeBindingsOn(this.copydefault);
        ViewDataBinding.executeBindingsOn(this.AhwBna);
        ViewDataBinding.executeBindingsOn(this.ejfBZ);
        ViewDataBinding.executeBindingsOn(this.KWHzl);
        ViewDataBinding.executeBindingsOn(this.DbNXlk);
    }
}
