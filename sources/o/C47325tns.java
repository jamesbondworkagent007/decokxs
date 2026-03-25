package o;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.uilab.edit.OKEditText;
import o.C47315tni;

/* JADX INFO: renamed from: o.tns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47325tns extends AbstractC47323tnq {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public final android.widget.TextView AuCTelauCTel;
    public final android.widget.TextView AubY;
    public final OKEditText getFieldNames;
    public final android.widget.LinearLayout getNewProxyInstance;
    public long hDKMBd;
    public InverseBindingListener iwGUEr;
    public final android.widget.TextView uzCIH;
    public InverseBindingListener wlaJM;
    public final OKEditText zLjUOn;
    public final android.widget.ImageView zsXlph;
    public final android.widget.TextView zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC47323tnq
    public void OLrzqt(@androidx.annotation.Nullable LiveData<java.lang.Boolean> liveData) {
        this.AYXKKw = liveData;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AuCTel = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.zlvcHA, 10);
        sparseIntArray.put(C47315tni.TaskDescription.gdmIOq, 11);
        sparseIntArray.put(C47315tni.TaskDescription.ffGIBT, 12);
        sparseIntArray.put(C47315tni.TaskDescription.OuxcSI, 13);
        sparseIntArray.put(C47315tni.TaskDescription.QfsBiF, 14);
    }

    public C47325tns(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, fARcdN, AuCTel));
    }

    public C47325tns(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 8, (C33537myN) objArr[1], (wYK) objArr[14], (android.widget.LinearLayout) objArr[12], (android.widget.LinearLayout) objArr[13], (C55018xby) objArr[10], (C55018xby) objArr[11], (C52794wYp) objArr[9]);
        this.iwGUEr = new InverseBindingListener() { // from class: o.tns.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = TextViewBindingAdapter.getTextString(C47325tns.this.getFieldNames);
                MutableLiveData<java.lang.String> mutableLiveData = C47325tns.this.AkhnZx;
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(textString);
                }
            }
        };
        this.wlaJM = new InverseBindingListener() { // from class: o.tns.4
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = TextViewBindingAdapter.getTextString(C47325tns.this.zLjUOn);
                MutableLiveData<java.lang.String> mutableLiveData = C47325tns.this.valueOf;
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(textString);
                }
            }
        };
        this.hDKMBd = -1L;
        this.AEQbTJ.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.getNewProxyInstance = linearLayout;
        linearLayout.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) objArr[2];
        this.uzCIH = textView;
        textView.setTag(null);
        OKEditText oKEditText = (OKEditText) objArr[3];
        this.getFieldNames = oKEditText;
        oKEditText.setTag(null);
        android.widget.TextView textView2 = (android.widget.TextView) objArr[4];
        this.AuCTelauCTel = textView2;
        textView2.setTag(null);
        OKEditText oKEditText2 = (OKEditText) objArr[5];
        this.zLjUOn = oKEditText2;
        oKEditText2.setTag(null);
        android.widget.ImageView imageView = (android.widget.ImageView) objArr[6];
        this.zsXlph = imageView;
        imageView.setTag(null);
        android.widget.TextView textView3 = (android.widget.TextView) objArr[7];
        this.AubY = textView3;
        textView3.setTag(null);
        android.widget.TextView textView4 = (android.widget.TextView) objArr[8];
        this.zuBGHE = textView4;
        textView4.setTag(null);
        this.fIwbmz.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C47317tnk.hDKMBd == i) {
            KWHzl((LiveData<java.lang.Integer>) obj);
        } else if (C47317tnk.AkhnZx == i) {
            OLrzqt((LiveData) obj);
        } else if (C47317tnk.AuCTel == i) {
            KWHzl((MutableLiveData<java.lang.String>) obj);
        } else if (C47317tnk.KWHzl == i) {
            copydefault((java.lang.String) obj);
        } else if (C47317tnk.EZpvd == i) {
            copydefault((MutableLiveData<java.lang.String>) obj);
        } else if (C47317tnk.OLrzqt == i) {
            EZpvd((java.lang.CharSequence) obj);
        } else if (C47317tnk.values == i) {
            AEQbTJ((LiveData<java.lang.Boolean>) obj);
        } else if (C47317tnk.AubY == i) {
            djBIcL((LiveData) obj);
        } else if (C47317tnk.uzCIH == i) {
            AEQbTJ((java.lang.CharSequence) obj);
        } else if (C47317tnk.AhwBna == i) {
            EZpvd((LiveData<java.lang.String>) obj);
        } else {
            if (C47317tnk.fJNWhG != i) {
                return false;
            }
            copydefault((LiveData<java.lang.Boolean>) obj);
        }
        return true;
    }

    @Override // o.AbstractC47323tnq
    public void KWHzl(@androidx.annotation.Nullable LiveData<java.lang.Integer> liveData) {
        updateLiveDataRegistration(0, liveData);
        this.isConnected = liveData;
        synchronized (this) {
            this.hDKMBd |= 1;
        }
        notifyPropertyChanged(C47317tnk.hDKMBd);
        super.requestRebind();
    }

    @Override // o.AbstractC47323tnq
    public void KWHzl(@androidx.annotation.Nullable MutableLiveData<java.lang.String> mutableLiveData) {
        updateLiveDataRegistration(2, mutableLiveData);
        this.AkhnZx = mutableLiveData;
        synchronized (this) {
            this.hDKMBd |= 4;
        }
        notifyPropertyChanged(C47317tnk.AuCTel);
        super.requestRebind();
    }

    @Override // o.AbstractC47323tnq
    public void copydefault(@androidx.annotation.Nullable java.lang.String str) {
        this.KWHzl = str;
        synchronized (this) {
            this.hDKMBd |= 256;
        }
        notifyPropertyChanged(C47317tnk.KWHzl);
        super.requestRebind();
    }

    @Override // o.AbstractC47323tnq
    public void copydefault(@androidx.annotation.Nullable MutableLiveData<java.lang.String> mutableLiveData) {
        updateLiveDataRegistration(3, mutableLiveData);
        this.valueOf = mutableLiveData;
        synchronized (this) {
            this.hDKMBd |= 8;
        }
        notifyPropertyChanged(C47317tnk.EZpvd);
        super.requestRebind();
    }

    @Override // o.AbstractC47323tnq
    public void EZpvd(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
        this.gEmmrt = charSequence;
        synchronized (this) {
            this.hDKMBd |= 512;
        }
        notifyPropertyChanged(C47317tnk.OLrzqt);
        super.requestRebind();
    }

    @Override // o.AbstractC47323tnq
    public void AEQbTJ(@androidx.annotation.Nullable LiveData<java.lang.Boolean> liveData) {
        updateLiveDataRegistration(4, liveData);
        this.djBIcL = liveData;
        synchronized (this) {
            this.hDKMBd |= 16;
        }
        notifyPropertyChanged(C47317tnk.values);
        super.requestRebind();
    }

    @Override // o.AbstractC47323tnq
    public void djBIcL(@androidx.annotation.Nullable LiveData<java.lang.CharSequence> liveData) {
        updateLiveDataRegistration(5, liveData);
        this.values = liveData;
        synchronized (this) {
            this.hDKMBd |= 32;
        }
        notifyPropertyChanged(C47317tnk.AubY);
        super.requestRebind();
    }

    @Override // o.AbstractC47323tnq
    public void AEQbTJ(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
        this.fetchVPNInfo = charSequence;
        synchronized (this) {
            this.hDKMBd |= 1024;
        }
        notifyPropertyChanged(C47317tnk.uzCIH);
        super.requestRebind();
    }

    @Override // o.AbstractC47323tnq
    public void EZpvd(@androidx.annotation.Nullable LiveData<java.lang.String> liveData) {
        updateLiveDataRegistration(6, liveData);
        this.AhwBna = liveData;
        synchronized (this) {
            this.hDKMBd |= 64;
        }
        notifyPropertyChanged(C47317tnk.AhwBna);
        super.requestRebind();
    }

    @Override // o.AbstractC47323tnq
    public void copydefault(@androidx.annotation.Nullable LiveData<java.lang.Boolean> liveData) {
        updateLiveDataRegistration(7, liveData);
        this.DbNXlk = liveData;
        synchronized (this) {
            this.hDKMBd |= 128;
        }
        notifyPropertyChanged(C47317tnk.fJNWhG);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        switch (i) {
            case 0:
                return copydefault((LiveData) obj, i2);
            case 1:
                return AEQbTJ((LiveData) obj, i2);
            case 2:
                return OLrzqt((MutableLiveData<java.lang.String>) obj, i2);
            case 3:
                return KWHzl((MutableLiveData<java.lang.String>) obj, i2);
            case 4:
                return KWHzl((LiveData<java.lang.Boolean>) obj, i2);
            case 5:
                return valueOf((LiveData) obj, i2);
            case 6:
                return EZpvd((LiveData) obj, i2);
            case 7:
                return OLrzqt((LiveData<java.lang.Boolean>) obj, i2);
            default:
                return false;
        }
    }

    public final boolean copydefault(LiveData<java.lang.Integer> liveData, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.hDKMBd |= 1;
        }
        return true;
    }

    public final boolean AEQbTJ(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.hDKMBd |= 2;
        }
        return true;
    }

    public final boolean OLrzqt(MutableLiveData<java.lang.String> mutableLiveData, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.hDKMBd |= 4;
        }
        return true;
    }

    public final boolean KWHzl(MutableLiveData<java.lang.String> mutableLiveData, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.hDKMBd |= 8;
        }
        return true;
    }

    public final boolean KWHzl(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.hDKMBd |= 16;
        }
        return true;
    }

    public final boolean valueOf(LiveData<java.lang.CharSequence> liveData, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.hDKMBd |= 32;
        }
        return true;
    }

    public final boolean EZpvd(LiveData<java.lang.String> liveData, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.hDKMBd |= 64;
        }
        return true;
    }

    public final boolean OLrzqt(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C47317tnk.copydefault) {
            return false;
        }
        synchronized (this) {
            this.hDKMBd |= 128;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        int iSafeUnbox;
        boolean zBooleanValue;
        synchronized (this) {
            j = this.hDKMBd;
            this.hDKMBd = 0L;
        }
        LiveData<java.lang.Integer> liveData = this.isConnected;
        MutableLiveData<java.lang.String> mutableLiveData = this.AkhnZx;
        java.lang.String str = this.KWHzl;
        MutableLiveData<java.lang.String> mutableLiveData2 = this.valueOf;
        java.lang.CharSequence charSequence = this.gEmmrt;
        LiveData<java.lang.Boolean> liveData2 = this.djBIcL;
        LiveData<java.lang.CharSequence> liveData3 = this.values;
        java.lang.CharSequence charSequence2 = this.fetchVPNInfo;
        LiveData<java.lang.String> liveData4 = this.AhwBna;
        LiveData<java.lang.Boolean> liveData5 = this.DbNXlk;
        long j2 = 2049 & j;
        boolean zSafeUnbox = false;
        if (j2 != 0) {
            iSafeUnbox = ViewDataBinding.safeUnbox(liveData != null ? liveData.getValue() : null);
        } else {
            iSafeUnbox = 0;
        }
        long j3 = j & 2052;
        java.lang.String value = (j3 == 0 || mutableLiveData == null) ? null : mutableLiveData.getValue();
        long j4 = j & 2056;
        java.lang.String value2 = (j4 == 0 || mutableLiveData2 == null) ? null : mutableLiveData2.getValue();
        long j5 = j & 2064;
        if (j5 == 0) {
            zBooleanValue = false;
        } else {
            java.lang.Boolean value3 = liveData2 != null ? liveData2.getValue() : null;
            if (value3 != null) {
                zBooleanValue = value3.booleanValue();
            }
        }
        long j6 = j & 2080;
        java.lang.CharSequence value4 = (j6 == 0 || liveData3 == null) ? null : liveData3.getValue();
        long j7 = j & 2112;
        java.lang.String value5 = (j7 == 0 || liveData4 == null) ? null : liveData4.getValue();
        long j8 = j & 2176;
        if (j8 != 0) {
            zSafeUnbox = ViewDataBinding.safeUnbox(liveData5 != null ? liveData5.getValue() : null);
        }
        boolean z = zSafeUnbox;
        if ((j & 2304) != 0) {
            C45383sok.KWHzl(this.AEQbTJ, str);
        }
        if ((j & 3072) != 0) {
            TextViewBindingAdapter.setText(this.uzCIH, charSequence2);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.setText(this.getFieldNames, value);
        }
        if ((PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH & j) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.getFieldNames, null, null, null, this.iwGUEr);
            TextViewBindingAdapter.setTextWatcher(this.zLjUOn, null, null, null, this.wlaJM);
        }
        if ((j & 2560) != 0) {
            TextViewBindingAdapter.setText(this.AuCTelauCTel, charSequence);
        }
        if (j4 != 0) {
            TextViewBindingAdapter.setText(this.zLjUOn, value2);
        }
        if (j2 != 0) {
            this.zsXlph.setImageResource(iSafeUnbox);
        }
        if (j6 != 0) {
            TextViewBindingAdapter.setText(this.AubY, value4);
        }
        if (j7 != 0) {
            TextViewBindingAdapter.setText(this.zuBGHE, value5);
        }
        if (j5 != 0) {
            this.zuBGHE.setVisibility(C57632ymA.AEQbTJ(zBooleanValue));
        }
        if (j8 != 0) {
            this.fIwbmz.setEnabled(z);
        }
    }
}
