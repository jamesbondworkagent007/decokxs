package o;

import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C32113mPz;
import o.C57669yml;
import o.mPT;

/* JADX INFO: loaded from: classes8.dex */
public class mPL extends mPJ implements mPT.TaskDescription {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final View.OnClickListener AkhnZx;
    public final ConstraintLayout AuCTel;
    public InverseBindingListener DbNXlk;
    public long fJNWhG;
    public final View.OnClickListener isConnected;
    public final View.OnClickListener values;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C32113mPz.FragmentManager.ODWQjV, 7);
        sparseIntArray.put(C32113mPz.FragmentManager.iwGUEr, 8);
    }

    public mPL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, fetchVPNInfo));
    }

    public mPL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 12, (android.widget.CheckBox) objArr[3], (android.widget.TextView) objArr[2], (android.view.View) objArr[8], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[1], (Barrier) objArr[7], (android.view.View) objArr[5]);
        this.DbNXlk = new InverseBindingListener() { // from class: o.mPL.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                ObservableBoolean observableBooleanAYXKKw;
                boolean zIsChecked = mPL.this.AEQbTJ.isChecked();
                C57669yml.ActionBar actionBar = mPL.this.EZpvd;
                if (actionBar == null || (observableBooleanAYXKKw = actionBar.AYXKKw()) == null) {
                    return;
                }
                observableBooleanAYXKKw.set(zIsChecked);
            }
        };
        this.fJNWhG = -1L;
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AuCTel = constraintLayout;
        constraintLayout.setTag(null);
        this.KWHzl.setTag(null);
        this.djBIcL.setTag(null);
        this.AYXKKw.setTag(null);
        this.gEmmrt.setTag(null);
        setRootTag(view);
        this.AkhnZx = new mPT(this, 2);
        this.isConnected = new mPT(this, 3);
        this.values = new mPT(this, 1);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fJNWhG = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (mPD.KWHzl != i) {
            return false;
        }
        KWHzl((C57669yml.ActionBar) obj);
        return true;
    }

    @Override // o.mPJ
    public void KWHzl(@androidx.annotation.Nullable C57669yml.ActionBar actionBar) {
        this.EZpvd = actionBar;
        synchronized (this) {
            this.fJNWhG |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        notifyPropertyChanged(mPD.KWHzl);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        switch (i) {
            case 0:
                return OLrzqt((ObservableBoolean) obj, i2);
            case 1:
                return copydefault((ObservableBoolean) obj, i2);
            case 2:
                return EZpvd((ObservableField<java.lang.String>) obj, i2);
            case 3:
                return AEQbTJ((ObservableBoolean) obj, i2);
            case 4:
                return valueOf((ObservableBoolean) obj, i2);
            case 5:
                return OLrzqt((ObservableField<java.lang.String>) obj, i2);
            case 6:
                return KWHzl((ObservableField<java.lang.String>) obj, i2);
            case 7:
                return djBIcL((ObservableBoolean) obj, i2);
            case 8:
                return AEQbTJ((ObservableField<java.lang.String>) obj, i2);
            case 9:
                return copydefault((ObservableField<java.lang.String>) obj, i2);
            case 10:
                return EZpvd((ObservableBoolean) obj, i2);
            case 11:
                return KWHzl((ObservableBoolean) obj, i2);
            default:
                return false;
        }
    }

    public final boolean OLrzqt(ObservableBoolean observableBoolean, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 1;
        }
        return true;
    }

    public final boolean copydefault(ObservableBoolean observableBoolean, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 2;
        }
        return true;
    }

    public final boolean EZpvd(ObservableField<java.lang.String> observableField, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 4;
        }
        return true;
    }

    public final boolean AEQbTJ(ObservableBoolean observableBoolean, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 8;
        }
        return true;
    }

    public final boolean valueOf(ObservableBoolean observableBoolean, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 16;
        }
        return true;
    }

    public final boolean OLrzqt(ObservableField<java.lang.String> observableField, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 32;
        }
        return true;
    }

    public final boolean KWHzl(ObservableField<java.lang.String> observableField, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 64;
        }
        return true;
    }

    public final boolean djBIcL(ObservableBoolean observableBoolean, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 128;
        }
        return true;
    }

    public final boolean AEQbTJ(ObservableField<java.lang.String> observableField, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 256;
        }
        return true;
    }

    public final boolean copydefault(ObservableField<java.lang.String> observableField, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 512;
        }
        return true;
    }

    public final boolean EZpvd(ObservableBoolean observableBoolean, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= 1024;
        }
        return true;
    }

    public final boolean KWHzl(ObservableBoolean observableBoolean, int i) {
        if (i != mPD.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fJNWhG |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014b A[PHI: r2
  0x014b: PHI (r2v9 long) = (r2v8 long), (r2v19 long) binds: [B:99:0x0121, B:112:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f7 A[PHI: r2
  0x01f7: PHI (r2v13 long) = (r2v12 long), (r2v15 long) binds: [B:155:0x01cd, B:168:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[PHI: r2
  0x0052: PHI (r2v3 long) = (r2v0 long), (r2v25 long) binds: [B:9:0x0028, B:22:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5 A[PHI: r2
  0x00b5: PHI (r2v5 long) = (r2v4 long), (r2v23 long) binds: [B:45:0x008d, B:58:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2 A[PHI: r2
  0x00e2: PHI (r2v7 long) = (r2v6 long), (r2v21 long) binds: [B:63:0x00ba, B:76:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        int i;
        java.lang.String str;
        int i2;
        boolean z;
        int i3;
        int i4;
        java.lang.String str2;
        int i5;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i6;
        int i7;
        long j2;
        long j3;
        long j4;
        java.lang.String str6;
        long j5;
        java.lang.String str7;
        int i8;
        long j6;
        int i9;
        ObservableBoolean observableBooleanEZpvd;
        synchronized (this) {
            j = this.fJNWhG;
            this.fJNWhG = 0L;
        }
        C57669yml.ActionBar actionBar = this.EZpvd;
        if ((16383 & j) != 0) {
            long j7 = j & 12289;
            if (j7 == 0) {
                i7 = 0;
                if ((j & 12290) == 0) {
                    z = false;
                    if ((j & 12292) == 0) {
                        str4 = null;
                        j2 = j & 12296;
                        if (j2 == 0) {
                            i3 = 0;
                            j3 = j & 12304;
                            if (j3 == 0) {
                                i5 = 0;
                                if ((j & 12320) == 0) {
                                    str3 = null;
                                    if ((j & 12352) == 0) {
                                        str5 = null;
                                        j4 = j & 12416;
                                        if (j4 == 0) {
                                            i4 = 0;
                                            if ((j & 12544) != 0) {
                                                ObservableField<java.lang.String> observableFieldOLrzqt = actionBar != null ? actionBar.OLrzqt() : null;
                                                updateRegistration(8, observableFieldOLrzqt);
                                                str2 = observableFieldOLrzqt != null ? observableFieldOLrzqt.get() : null;
                                                if ((j & 12800) == 0) {
                                                    str6 = null;
                                                    j5 = j & 13312;
                                                    if (j5 == 0) {
                                                        if (actionBar != null) {
                                                            observableBooleanEZpvd = actionBar.EZpvd();
                                                            str7 = str6;
                                                        } else {
                                                            str7 = str6;
                                                            observableBooleanEZpvd = null;
                                                        }
                                                        updateRegistration(10, observableBooleanEZpvd);
                                                        boolean z2 = observableBooleanEZpvd != null ? observableBooleanEZpvd.get() : false;
                                                        if (j5 != 0) {
                                                            j |= z2 ? PlaybackStateCompat.ACTION_PREPARE_FROM_URI : PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                                                        }
                                                        if (!z2) {
                                                            i8 = 8;
                                                        }
                                                        j6 = j & 14336;
                                                        if (j6 == 0) {
                                                            i9 = 0;
                                                            i2 = i8;
                                                            i = i9;
                                                            str = str7;
                                                            i6 = i7;
                                                        } else {
                                                            ObservableBoolean observableBooleanValueOf = actionBar != null ? actionBar.valueOf() : null;
                                                            updateRegistration(11, observableBooleanValueOf);
                                                            boolean z3 = observableBooleanValueOf != null ? observableBooleanValueOf.get() : false;
                                                            if (j6 != 0) {
                                                                j |= z3 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                                                            }
                                                            if (!z3) {
                                                                i9 = 8;
                                                            }
                                                            i2 = i8;
                                                            i = i9;
                                                            str = str7;
                                                            i6 = i7;
                                                        }
                                                    } else {
                                                        str7 = str6;
                                                    }
                                                    i8 = 0;
                                                    j6 = j & 14336;
                                                    if (j6 == 0) {
                                                    }
                                                } else {
                                                    ObservableField<java.lang.String> observableFieldAkhnZx = actionBar != null ? actionBar.AkhnZx() : null;
                                                    updateRegistration(9, observableFieldAkhnZx);
                                                    if (observableFieldAkhnZx != null) {
                                                        str6 = observableFieldAkhnZx.get();
                                                    }
                                                    j5 = j & 13312;
                                                    if (j5 == 0) {
                                                    }
                                                    i8 = 0;
                                                    j6 = j & 14336;
                                                    if (j6 == 0) {
                                                    }
                                                }
                                            }
                                            if ((j & 12800) == 0) {
                                            }
                                        } else {
                                            ObservableBoolean observableBooleanValues = actionBar != null ? actionBar.values() : null;
                                            updateRegistration(7, observableBooleanValues);
                                            boolean z4 = observableBooleanValues != null ? observableBooleanValues.get() : false;
                                            if (j4 != 0) {
                                                j |= z4 ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : 16384L;
                                            }
                                            if (!z4) {
                                                i4 = 8;
                                            }
                                            if ((j & 12544) != 0) {
                                            }
                                            if ((j & 12800) == 0) {
                                            }
                                        }
                                    } else {
                                        ObservableField<java.lang.String> observableFieldDbNXlk = actionBar != null ? actionBar.DbNXlk() : null;
                                        updateRegistration(6, observableFieldDbNXlk);
                                        if (observableFieldDbNXlk != null) {
                                            str5 = observableFieldDbNXlk.get();
                                        }
                                        j4 = j & 12416;
                                        if (j4 == 0) {
                                        }
                                    }
                                } else {
                                    ObservableField<java.lang.String> observableFieldGEmmrt = actionBar != null ? actionBar.gEmmrt() : null;
                                    updateRegistration(5, observableFieldGEmmrt);
                                    if (observableFieldGEmmrt != null) {
                                        str3 = observableFieldGEmmrt.get();
                                    }
                                    if ((j & 12352) == 0) {
                                    }
                                }
                            } else {
                                ObservableBoolean observableBooleanIsConnected = actionBar != null ? actionBar.isConnected() : null;
                                updateRegistration(4, observableBooleanIsConnected);
                                boolean z5 = observableBooleanIsConnected != null ? observableBooleanIsConnected.get() : false;
                                if (j3 != 0) {
                                    j |= z5 ? 8388608L : 4194304L;
                                }
                                if (!z5) {
                                    i5 = 8;
                                }
                                if ((j & 12320) == 0) {
                                }
                            }
                        } else {
                            ObservableBoolean observableBooleanAhwBna = actionBar != null ? actionBar.AhwBna() : null;
                            updateRegistration(3, observableBooleanAhwBna);
                            boolean z6 = observableBooleanAhwBna != null ? observableBooleanAhwBna.get() : false;
                            if (j2 != 0) {
                                j |= z6 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                            }
                            if (!z6) {
                                i3 = 8;
                            }
                            j3 = j & 12304;
                            if (j3 == 0) {
                            }
                        }
                    } else {
                        ObservableField<java.lang.String> observableFieldDjBIcL = actionBar != null ? actionBar.djBIcL() : null;
                        updateRegistration(2, observableFieldDjBIcL);
                        if (observableFieldDjBIcL != null) {
                            str4 = observableFieldDjBIcL.get();
                        }
                        j2 = j & 12296;
                        if (j2 == 0) {
                        }
                    }
                } else {
                    ObservableBoolean observableBooleanAYXKKw = actionBar != null ? actionBar.AYXKKw() : null;
                    updateRegistration(1, observableBooleanAYXKKw);
                    if (observableBooleanAYXKKw != null) {
                        z = observableBooleanAYXKKw.get();
                    }
                    if ((j & 12292) == 0) {
                    }
                }
            } else {
                ObservableBoolean observableBooleanCopydefault = actionBar != null ? actionBar.copydefault() : null;
                updateRegistration(0, observableBooleanCopydefault);
                boolean z7 = observableBooleanCopydefault != null ? observableBooleanCopydefault.get() : false;
                if (j7 != 0) {
                    j |= z7 ? 33554432L : 16777216L;
                }
                if (!z7) {
                    i7 = 8;
                }
                if ((j & 12290) == 0) {
                }
            }
        } else {
            i = 0;
            str = null;
            i2 = 0;
            z = false;
            i3 = 0;
            i4 = 0;
            str2 = null;
            i5 = 0;
            str3 = null;
            str4 = null;
            str5 = null;
            i6 = 0;
        }
        if ((j & 12544) != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, str2);
        }
        if ((j & 12289) != 0) {
            this.AEQbTJ.setVisibility(i6);
        }
        if ((j & 12290) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.AEQbTJ, z);
        }
        if ((PlaybackStateCompat.ACTION_PLAY_FROM_URI & j) != 0) {
            this.AEQbTJ.setOnClickListener(this.values);
            CompoundButtonBindingAdapter.setListeners(this.AEQbTJ, null, this.DbNXlk);
            this.KWHzl.setOnClickListener(this.AkhnZx);
            this.djBIcL.setOnClickListener(this.isConnected);
        }
        if ((j & 12320) != 0) {
            TextViewBindingAdapter.setText(this.copydefault, str3);
        }
        if ((j & 12296) != 0) {
            this.copydefault.setVisibility(i3);
        }
        if ((j & 12292) != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, str4);
        }
        if ((14336 & j) != 0) {
            this.KWHzl.setVisibility(i);
        }
        if ((12800 & j) != 0) {
            TextViewBindingAdapter.setText(this.djBIcL, str);
        }
        if ((12416 & j) != 0) {
            this.djBIcL.setVisibility(i4);
        }
        if ((12352 & j) != 0) {
            TextViewBindingAdapter.setText(this.AYXKKw, str5);
        }
        if ((j & 12304) != 0) {
            this.AYXKKw.setVisibility(i5);
        }
        if ((j & 13312) != 0) {
            this.gEmmrt.setVisibility(i2);
        }
    }

    @Override // o.mPT.TaskDescription
    public final void AEQbTJ(int i, android.view.View view) {
        C57669yml.ActionBar actionBar;
        if (i == 1) {
            C57669yml.ActionBar actionBar2 = this.EZpvd;
            if (actionBar2 != null) {
                actionBar2.fJNWhG();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (actionBar = this.EZpvd) != null) {
                actionBar.fIwbmz();
                return;
            }
            return;
        }
        C57669yml.ActionBar actionBar3 = this.EZpvd;
        if (actionBar3 != null) {
            actionBar3.ejfBZ();
        }
    }
}
