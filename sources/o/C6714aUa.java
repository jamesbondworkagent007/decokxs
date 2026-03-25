package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.okinc.account.api.model.security.otp.OtpInputType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC6659aTX;
import o.AbstractC6733aUt;
import o.AbstractC6734aUu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aUa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6714aUa extends ViewModel {
    public final MutableLiveData<java.util.List<AbstractC6659aTX>> AEQbTJ;
    public final MutableLiveData<java.lang.Boolean> AYXKKw;
    public final MutableLiveData<java.lang.Boolean> AhwBna;
    public final MutableLiveData<java.lang.String> AkhnZx;
    public final LiveData<java.util.List<AbstractC6659aTX>> AuCTel;
    public final LiveData<java.lang.Boolean> AuCTelauCTel;
    public final LiveData<java.lang.Boolean> AubY;
    public final LiveData<java.lang.Boolean> AwvSrB;
    public final LiveData<java.lang.String> AxsJAY;
    public final LiveData<java.lang.String> DTwDnp;
    public final MutableLiveData<java.lang.String> DbNXlk;
    public final MutableLiveData<java.lang.Boolean> EZpvd;
    public final MutableLiveData<java.lang.Boolean> KWHzl;
    public final MutableLiveData<java.lang.Boolean> OLrzqt;
    public java.lang.String ORxRYg;
    public final LiveData<java.lang.String> OcIXYQ;
    public java.lang.String QKVWgx;
    public java.lang.String QOLQEE;
    public final LiveData<java.lang.String> QUSxYX;
    public int QVAiDq;
    public java.lang.String QbewEr;
    public final LiveData<java.lang.String> QfsBiF;
    public java.lang.String RJOkX;
    public final LiveData<java.lang.String> RcXXUw;
    public AbstractC6734aUu UeEOUB;
    public final LiveData<java.lang.String> aKErDB;
    public final MutableLiveData<java.lang.Boolean> copydefault;
    public final LiveData<java.lang.String> dNCPSb;
    public final MutableLiveData<java.lang.String> djBIcL;
    public final LiveData<java.lang.String> djSkpj;
    public AbstractC6733aUt dvKsVJ;
    public final MutableLiveData<java.lang.String> ejfBZ;
    public final MutableLiveData<java.lang.String> fARcdN;
    public final MutableLiveData<java.lang.String> fIwbmz;
    public final MutableLiveData<java.lang.String> fJNWhG;
    public final MutableLiveData<java.lang.String> fetchVPNInfo;
    public final java.util.List<OtpInputType> finit;
    public final MutableLiveData<java.lang.Boolean> gEmmrt;
    public java.lang.String gHZMYf;
    public final LiveData<java.lang.Boolean> getFieldNames;
    public final LiveData<java.lang.Boolean> getNewProxyInstance;
    public final LiveData<java.lang.Boolean> hDKMBd;
    public final MutableLiveData<java.lang.String> isConnected;
    public final java.util.List<OtpInputType> iwGUEr;
    public java.lang.String sSMYrx;
    public final java.util.List<OtpInputType> uzCIH;
    public final MutableLiveData<java.lang.Boolean> valueOf;
    public final MutableLiveData<java.lang.String> values;
    public final LiveData<java.lang.Boolean> wlaJM;
    public final LiveData<java.lang.Boolean> zLjUOn;
    public final LiveData<java.lang.Boolean> zsXlph;
    public final LiveData<java.lang.String> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.List<AbstractC6659aTX>> AEQbTJ() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> AYXKKw() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> AkhnZx() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC6733aUt AuCTel() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> EZpvd() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull AbstractC6733aUt abstractC6733aUt) {
        Intrinsics.checkNotNullParameter(abstractC6733aUt, "");
        this.dvKsVJ = abstractC6733aUt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> KWHzl() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> copydefault() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> djBIcL() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> ejfBZ() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> fIwbmz() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> fJNWhG() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> fetchVPNInfo() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> gEmmrt() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QbewEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> hDKMBd() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> iwGUEr() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> uzCIH() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> valueOf() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> values() {
        return this.RcXXUw;
    }

    public C6714aUa() {
        MutableLiveData<java.util.List<AbstractC6659aTX>> mutableLiveData = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData;
        this.AuCTel = mutableLiveData;
        this.ORxRYg = "";
        this.RJOkX = "";
        this.sSMYrx = "";
        this.QOLQEE = "";
        this.gHZMYf = "";
        this.QKVWgx = "";
        this.UeEOUB = AbstractC6734aUu.Activity.EZpvd;
        this.QbewEr = "";
        MutableLiveData<java.lang.String> mutableLiveData2 = new MutableLiveData<>("");
        this.fIwbmz = mutableLiveData2;
        this.djSkpj = mutableLiveData2;
        MutableLiveData<java.lang.String> mutableLiveData3 = new MutableLiveData<>("");
        this.fJNWhG = mutableLiveData3;
        this.dNCPSb = mutableLiveData3;
        this.dvKsVJ = AbstractC6733aUt.StateListAnimator.KWHzl;
        MutableLiveData<java.lang.String> mutableLiveData4 = new MutableLiveData<>("");
        this.ejfBZ = mutableLiveData4;
        this.RcXXUw = mutableLiveData4;
        MutableLiveData<java.lang.String> mutableLiveData5 = new MutableLiveData<>("");
        this.fARcdN = mutableLiveData5;
        this.aKErDB = mutableLiveData5;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        MutableLiveData<java.lang.Boolean> mutableLiveData6 = new MutableLiveData<>(bool);
        this.AYXKKw = mutableLiveData6;
        this.AubY = mutableLiveData6;
        MutableLiveData<java.lang.Boolean> mutableLiveData7 = new MutableLiveData<>(bool);
        this.copydefault = mutableLiveData7;
        this.getNewProxyInstance = mutableLiveData7;
        MutableLiveData<java.lang.Boolean> mutableLiveData8 = new MutableLiveData<>(bool);
        this.EZpvd = mutableLiveData8;
        this.AuCTelauCTel = mutableLiveData8;
        MutableLiveData<java.lang.Boolean> mutableLiveData9 = new MutableLiveData<>(bool);
        this.OLrzqt = mutableLiveData9;
        this.getFieldNames = mutableLiveData9;
        MutableLiveData<java.lang.Boolean> mutableLiveData10 = new MutableLiveData<>(bool);
        this.gEmmrt = mutableLiveData10;
        this.wlaJM = mutableLiveData10;
        MutableLiveData<java.lang.Boolean> mutableLiveData11 = new MutableLiveData<>(bool);
        this.KWHzl = mutableLiveData11;
        this.hDKMBd = mutableLiveData11;
        MutableLiveData<java.lang.Boolean> mutableLiveData12 = new MutableLiveData<>(bool);
        this.AhwBna = mutableLiveData12;
        this.zLjUOn = mutableLiveData12;
        MutableLiveData<java.lang.String> mutableLiveData13 = new MutableLiveData<>("");
        this.DbNXlk = mutableLiveData13;
        this.QfsBiF = mutableLiveData13;
        MutableLiveData<java.lang.String> mutableLiveData14 = new MutableLiveData<>("");
        this.AkhnZx = mutableLiveData14;
        this.OcIXYQ = mutableLiveData14;
        MutableLiveData<java.lang.String> mutableLiveData15 = new MutableLiveData<>("");
        this.values = mutableLiveData15;
        this.DTwDnp = mutableLiveData15;
        MutableLiveData<java.lang.String> mutableLiveData16 = new MutableLiveData<>("");
        this.djBIcL = mutableLiveData16;
        this.zuBGHE = mutableLiveData16;
        MutableLiveData<java.lang.String> mutableLiveData17 = new MutableLiveData<>("");
        this.isConnected = mutableLiveData17;
        this.QUSxYX = mutableLiveData17;
        MutableLiveData<java.lang.String> mutableLiveData18 = new MutableLiveData<>("");
        this.fetchVPNInfo = mutableLiveData18;
        this.AxsJAY = mutableLiveData18;
        this.zsXlph = Transformations.map(mutableLiveData4, new Function1() { // from class: o.aTZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C6714aUa.copydefault((java.lang.String) obj));
            }
        });
        MutableLiveData<java.lang.Boolean> mutableLiveData19 = new MutableLiveData<>(bool);
        this.valueOf = mutableLiveData19;
        this.AwvSrB = mutableLiveData19;
        OtpInputType otpInputType = OtpInputType.SMS_ONLY;
        OtpInputType otpInputType2 = OtpInputType.SMS_EMAIL;
        OtpInputType otpInputType3 = OtpInputType.SMS_GOOGLE;
        OtpInputType otpInputType4 = OtpInputType.ALL;
        this.finit = yDY.gEmmrt(otpInputType, otpInputType2, otpInputType3, otpInputType4);
        OtpInputType otpInputType5 = OtpInputType.GOOGLE_ONLY;
        OtpInputType otpInputType6 = OtpInputType.EMAIL_GOOGLE;
        this.uzCIH = yDY.gEmmrt(otpInputType5, otpInputType6, otpInputType3, otpInputType4);
        this.iwGUEr = yDY.gEmmrt(OtpInputType.EMAIL_ONLY, otpInputType6, otpInputType2, otpInputType4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.aUa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initDisplayList$default(C6714aUa c6714aUa, java.lang.Integer num, OtpInputType otpInputType, OtpInputType otpInputType2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            otpInputType = null;
        }
        if ((i & 4) != 0) {
            otpInputType2 = null;
        }
        if ((i & 8) != 0) {
            list = c6714aUa.fARcdN();
        }
        c6714aUa.OLrzqt(num, otpInputType, otpInputType2, list);
    }

    public final void OLrzqt(java.lang.Integer num, OtpInputType otpInputType, OtpInputType otpInputType2, @NotNull java.util.List<? extends AbstractC6659aTX> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (num != null) {
            this.QVAiDq = num.intValue();
        }
        if (otpInputType == null) {
            MutableLiveData<java.lang.Boolean> mutableLiveData = this.AYXKKw;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            mutableLiveData.setValue(bool);
            this.gEmmrt.setValue(bool);
            this.EZpvd.setValue(bool);
        } else {
            this.AYXKKw.setValue(java.lang.Boolean.valueOf(this.finit.contains(otpInputType)));
            this.gEmmrt.setValue(java.lang.Boolean.valueOf(this.uzCIH.contains(otpInputType)));
            this.EZpvd.setValue(java.lang.Boolean.valueOf(this.iwGUEr.contains(otpInputType)));
        }
        if (otpInputType2 == null) {
            MutableLiveData<java.lang.Boolean> mutableLiveData2 = this.copydefault;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            mutableLiveData2.setValue(bool2);
            this.KWHzl.setValue(bool2);
            this.OLrzqt.setValue(bool2);
        } else {
            this.copydefault.setValue(java.lang.Boolean.valueOf(this.finit.contains(otpInputType2)));
            this.KWHzl.setValue(java.lang.Boolean.valueOf(this.uzCIH.contains(otpInputType2)));
            this.OLrzqt.setValue(java.lang.Boolean.valueOf(this.iwGUEr.contains(otpInputType2)));
        }
        this.AEQbTJ.setValue(CollectionsKt___CollectionsKt.QbewEr(list));
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        java.lang.String value;
        Intrinsics.checkNotNullParameter(str, "");
        if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) && (value = this.AkhnZx.getValue()) != null && value.length() > 0) {
            this.AkhnZx.setValue("");
        }
        this.ORxRYg = str;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        java.lang.String value;
        Intrinsics.checkNotNullParameter(str, "");
        if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) && (value = this.djBIcL.getValue()) != null && value.length() > 0) {
            this.djBIcL.setValue("");
        }
        this.sSMYrx = str;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        java.lang.String value;
        Intrinsics.checkNotNullParameter(str, "");
        if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) && (value = this.fetchVPNInfo.getValue()) != null && value.length() > 0) {
            this.fetchVPNInfo.setValue("");
        }
        this.gHZMYf = str;
    }

    public static final boolean copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() > 0;
    }

    public final void OLrzqt(boolean z) {
        this.AhwBna.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void getNewProxyInstance() {
        this.DbNXlk.setValue("");
        this.AkhnZx.setValue("");
        this.values.setValue("");
        this.djBIcL.setValue("");
        this.isConnected.setValue("");
        this.fetchVPNInfo.setValue("");
    }

    public final void KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String str = map.get("1");
        if (str != null) {
            this.DbNXlk.setValue(str);
        }
        java.lang.String str2 = map.get("2");
        if (str2 != null) {
            this.values.setValue(str2);
        }
        java.lang.String str3 = map.get("0");
        if (str3 != null) {
            this.isConnected.setValue(str3);
        }
        java.lang.String str4 = map.get("3");
        if (str4 != null) {
            this.AkhnZx.setValue(str4);
        }
        java.lang.String str5 = map.get("5");
        if (str5 != null) {
            this.djBIcL.setValue(str5);
        }
        java.lang.String str6 = map.get("4");
        if (str6 != null) {
            this.fetchVPNInfo.setValue(str6);
        }
    }

    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ejfBZ.setValue(str);
    }

    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fIwbmz.setValue(str);
        this.valueOf.setValue(java.lang.Boolean.valueOf(str.length() > 0));
    }

    public final java.util.List<AbstractC6659aTX> fARcdN() {
        return yDY.gEmmrt(new AbstractC6659aTX.TaskDescription(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, false, false, 0, null, null, 131071, null), new AbstractC6659aTX.Activity(0, 0, 0, 0, null, null, 63, null), new AbstractC6659aTX.ActionBar(0, 0, 0, 0, 15, null));
    }
}
