package com.okinc.auth.impl.reset2fa.ui.linknewmfa;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.account.api.model.security.otp.OtpInputType;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C33070mpX;
import o.C43251rlk;
import o.C56390yDp;
import o.C8206ayP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Rebind2faViewModel extends AbstractC33073mpa {
    public final MutableLiveData<Boolean> AEQbTJ;
    public final LiveData<Boolean> AYXKKw;
    public final LiveData<Boolean> AhwBna;
    public final LiveData<Pair<String, String>> EZpvd;
    public final MutableLiveData<Boolean> KWHzl;
    public final MutableLiveData<OtpInputType> OLrzqt;
    public final MutableLiveData<Pair<String, String>> copydefault;
    public final SavedStateHandle djBIcL;
    public final LiveData<OtpInputType> gEmmrt;
    public final OtpInputType valueOf;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OtpInputType.values().length];
            try {
                iArr[OtpInputType.SMS_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtpInputType.EMAIL_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OtpInputType.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OtpInputType.SMS_EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OtpInputType.SMS_GOOGLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OtpInputType.EMAIL_GOOGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Pair<String, String>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<OtpInputType> copydefault() {
        return this.gEmmrt;
    }

    @yCM
    public Rebind2faViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = savedStateHandle;
        OtpInputType otpInputType = (OtpInputType) savedStateHandle.get("KEY_TYPE");
        otpInputType = otpInputType == null ? OtpInputType.NO_2FA : otpInputType;
        this.valueOf = otpInputType;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(EZpvd()));
        this.AEQbTJ = mutableLiveData;
        this.AYXKKw = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(Boolean.valueOf(KWHzl()));
        this.KWHzl = mutableLiveData2;
        this.AhwBna = mutableLiveData2;
        MutableLiveData<OtpInputType> mutableLiveData3 = new MutableLiveData<>(otpInputType);
        this.OLrzqt = mutableLiveData3;
        this.gEmmrt = mutableLiveData3;
        MutableLiveData<Pair<String, String>> mutableLiveData4 = new MutableLiveData<>();
        this.copydefault = mutableLiveData4;
        this.EZpvd = mutableLiveData4;
        AhwBna();
    }

    public final void AhwBna() {
        String strAYXKKw;
        String strAYXKKw2;
        String strAYXKKw3;
        boolean zAEQbTJ = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.P2P);
        int i = TaskDescription.copydefault[this.valueOf.ordinal()];
        if (i == 1) {
            MutableLiveData<Pair<String, String>> mutableLiveData = this.copydefault;
            String strAYXKKw4 = C33070mpX.AYXKKw(C8206ayP.Dialog.DbNXlk);
            if (zAEQbTJ) {
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.zhUgOk);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.zuBGHE);
            }
            mutableLiveData.setValue(C56390yDp.OLrzqt(strAYXKKw4, strAYXKKw));
            return;
        }
        if (i == 2) {
            MutableLiveData<Pair<String, String>> mutableLiveData2 = this.copydefault;
            String strAYXKKw5 = C33070mpX.AYXKKw(C8206ayP.Dialog.isConnected);
            if (zAEQbTJ) {
                strAYXKKw2 = C33070mpX.AYXKKw(C8206ayP.Dialog.zlvcHA);
            } else {
                strAYXKKw2 = C33070mpX.AYXKKw(C8206ayP.Dialog.AwvSrB);
            }
            mutableLiveData2.setValue(C56390yDp.OLrzqt(strAYXKKw5, strAYXKKw2));
            return;
        }
        MutableLiveData<Pair<String, String>> mutableLiveData3 = this.copydefault;
        String strAYXKKw6 = C33070mpX.AYXKKw(C8206ayP.Dialog.fetchVPNInfo);
        if (zAEQbTJ) {
            strAYXKKw3 = C33070mpX.AYXKKw(C8206ayP.Dialog.zYHWMc);
        } else {
            strAYXKKw3 = C33070mpX.AYXKKw(C8206ayP.Dialog.sSMYrx);
        }
        mutableLiveData3.setValue(C56390yDp.OLrzqt(strAYXKKw6, strAYXKKw3));
    }

    public final boolean EZpvd() {
        int i = TaskDescription.copydefault[this.valueOf.ordinal()];
        return i == 1 || i == 3 || i == 4 || i == 5;
    }

    public final boolean KWHzl() {
        int i = TaskDescription.copydefault[this.valueOf.ordinal()];
        return i == 2 || i == 3 || i == 4 || i == 6;
    }
}
