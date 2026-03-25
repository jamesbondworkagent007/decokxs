package o;

import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.LeverageInfo;
import com.okinc.unify_trade.biz.LeverageReq;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49844uwH;
import o.InterfaceC54581xNr;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uwN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49850uwN {
    public BizInstrument AEQbTJ;
    public InterfaceC49844uwH.TaskDescription AhwBna;
    public java.lang.String DbNXlk;
    public java.lang.String EZpvd;
    public boolean KWHzl;
    public java.lang.String valueOf;
    public java.lang.String OLrzqt = "";
    public java.lang.String copydefault = "";
    public java.lang.String djBIcL = "";
    public final C56168xxi values = new C56168xxi();
    public final C56175xxp fetchVPNInfo = new C56175xxp();
    public final C56169xxj AYXKKw = new C56169xxj();
    public final C56111xwe<java.util.ArrayList<LeverageReq>> isConnected = new C56111xwe<>();
    public final C56111xwe<java.util.List<LeverageInfo>> gEmmrt = new C56111xwe<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInstrument AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.util.ArrayList<LeverageReq>> AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull InterfaceC49844uwH.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.AhwBna = taskDescription;
    }

    public void KWHzl() {
    }

    public void OLrzqt() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56175xxp fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.util.List<LeverageInfo>> valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi values() {
        return this.values;
    }

    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.copydefault = str2;
        this.djBIcL = str3;
        this.DbNXlk = str4;
        this.EZpvd = str5;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        InterfaceC49844uwH.TaskDescription taskDescription = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        this.AEQbTJ = suggestedInstrument$default;
        this.KWHzl = z;
        if (suggestedInstrument$default == null) {
            InterfaceC49844uwH.TaskDescription taskDescription2 = this.AhwBna;
            if (taskDescription2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                taskDescription = taskDescription2;
            }
            taskDescription.AEQbTJ(false);
        }
    }

    public boolean ejfBZ() {
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) "isolated");
    }

    public boolean fARcdN() {
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) "cross");
    }

    private final java.lang.String getFieldNames() {
        if (Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) "cash")) {
            return null;
        }
        return this.djBIcL;
    }

    public boolean fJNWhG() {
        xOW newProxyInstance;
        xOV xovEZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.OLrzqt()) ? false : true;
    }

    public boolean fIwbmz() {
        return Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) "buy");
    }

    public final java.lang.String DbNXlk() {
        if (ejfBZ()) {
            return this.DbNXlk;
        }
        return null;
    }

    public final java.lang.String EZpvd() {
        if (!fJNWhG() || !fARcdN() || this.KWHzl) {
            return this.EZpvd;
        }
        InterfaceC49844uwH.TaskDescription taskDescription = this.AhwBna;
        if (taskDescription == null) {
            Intrinsics.gEmmrt("");
            taskDescription = null;
        }
        return taskDescription.KWHzl();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r12.equals("59101") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r12.equals("59107") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        r12 = java.lang.Boolean.TRUE;
        r4 = r14.getMsg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x002e. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(boolean z, AdjustLeverRequiredData adjustLeverRequiredData, java.lang.Exception exc) {
        java.lang.Boolean boolValueOf;
        java.lang.String msg;
        java.lang.String msg2;
        InterfaceC49844uwH.TaskDescription taskDescription;
        java.lang.String availQuoteTransfer;
        java.lang.String availTransfer;
        java.lang.String quoteMargin;
        java.lang.String margin;
        java.lang.String quoteMaxAmount;
        java.lang.String maxAmount;
        if (z) {
            boolValueOf = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) (adjustLeverRequiredData != null ? adjustLeverRequiredData.getExistOrd() : null), (java.lang.Object) "true"));
            msg = null;
        } else if (exc instanceof BizApiException) {
            BizApiException bizApiException = (BizApiException) exc;
            java.lang.String code = bizApiException.getCode();
            int iHashCode = code.hashCode();
            if (iHashCode != 50693356) {
                switch (iHashCode) {
                    case 50693326:
                        break;
                    case 50693327:
                        if (code.equals("59102")) {
                            msg2 = bizApiException.getMsg();
                        } else {
                            msg2 = bizApiException.getMsg();
                        }
                        break;
                    case 50693328:
                        if (!code.equals("59103")) {
                        }
                        break;
                    case 50693329:
                        if (!code.equals("59104")) {
                        }
                        break;
                    case 50693330:
                        if (!code.equals("59105")) {
                        }
                        break;
                    default:
                        switch (iHashCode) {
                            case 50693333:
                                if (!code.equals("59108")) {
                                }
                                break;
                        }
                        break;
                }
            } else if (!code.equals("59110")) {
            }
            msg = msg2;
            boolValueOf = null;
        } else {
            boolValueOf = null;
            msg = null;
        }
        InterfaceC49844uwH.TaskDescription taskDescription2 = this.AhwBna;
        if (taskDescription2 == null) {
            Intrinsics.gEmmrt("");
            taskDescription = null;
        } else {
            taskDescription = taskDescription2;
        }
        java.lang.String str = this.valueOf;
        taskDescription.KWHzl(str == null ? "" : str, (adjustLeverRequiredData == null || (maxAmount = adjustLeverRequiredData.getMaxAmount()) == null) ? "" : maxAmount, (adjustLeverRequiredData == null || (quoteMaxAmount = adjustLeverRequiredData.getQuoteMaxAmount()) == null) ? "" : quoteMaxAmount, (adjustLeverRequiredData == null || (margin = adjustLeverRequiredData.getMargin()) == null) ? "" : margin, (adjustLeverRequiredData == null || (quoteMargin = adjustLeverRequiredData.getQuoteMargin()) == null) ? "" : quoteMargin);
        InterfaceC49844uwH.TaskDescription taskDescription3 = this.AhwBna;
        if (taskDescription3 == null) {
            Intrinsics.gEmmrt("");
            taskDescription3 = null;
        }
        java.lang.String str2 = this.valueOf;
        taskDescription3.EZpvd(str2 == null ? "" : str2, boolValueOf != null ? boolValueOf.booleanValue() : false, msg, (adjustLeverRequiredData == null || (availTransfer = adjustLeverRequiredData.getAvailTransfer()) == null) ? "" : availTransfer, (adjustLeverRequiredData == null || (availQuoteTransfer = adjustLeverRequiredData.getAvailQuoteTransfer()) == null) ? "" : availQuoteTransfer);
    }

    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC49844uwH.TaskDescription taskDescription = null;
        if (str.length() == 0) {
            InterfaceC49844uwH.TaskDescription taskDescription2 = this.AhwBna;
            if (taskDescription2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                taskDescription = taskDescription2;
            }
            taskDescription.EZpvd(str);
            return;
        }
        this.valueOf = str;
        C56168xxi c56168xxi = this.values;
        c56168xxi.AEQbTJ(this.KWHzl ? null : this.OLrzqt);
        c56168xxi.KWHzl(xVE.copydefault.EZpvd("MARGIN"));
        c56168xxi.copydefault(getFieldNames());
        c56168xxi.EZpvd(EZpvd());
        c56168xxi.djBIcL(DbNXlk());
        c56168xxi.OLrzqt(str);
        c56168xxi.AuCTel();
        xKK.Activity.execute$default(c56168xxi, 0L, 1, null);
    }

    public static final java.lang.String AEQbTJ(C49850uwN c49850uwN) {
        InterfaceC49844uwH.TaskDescription taskDescription = null;
        if (!c49850uwN.fJNWhG() || !c49850uwN.fARcdN()) {
            return null;
        }
        if (c49850uwN.KWHzl) {
            return c49850uwN.EZpvd;
        }
        InterfaceC49844uwH.TaskDescription taskDescription2 = c49850uwN.AhwBna;
        if (taskDescription2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            taskDescription = taskDescription2;
        }
        return taskDescription.KWHzl();
    }

    public static final java.lang.String copydefault(C49850uwN c49850uwN) {
        return (c49850uwN.fJNWhG() && c49850uwN.fARcdN()) ? "" : c49850uwN.OLrzqt;
    }

    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        LeverageReq leverageReq = new LeverageReq(copydefault(this), str, AEQbTJ(this), this.djBIcL, null);
        C56175xxp c56175xxp = this.fetchVPNInfo;
        c56175xxp.AEQbTJ(leverageReq);
        c56175xxp.AEQbTJ(this.isConnected);
        xKK.Activity.execute$default(c56175xxp, 0L, 1, null);
    }

    public static final java.lang.String KWHzl(C49850uwN c49850uwN) {
        InterfaceC49844uwH.TaskDescription taskDescription = null;
        if (!c49850uwN.fJNWhG() || !c49850uwN.fARcdN()) {
            return null;
        }
        if (c49850uwN.KWHzl) {
            return c49850uwN.EZpvd;
        }
        InterfaceC49844uwH.TaskDescription taskDescription2 = c49850uwN.AhwBna;
        if (taskDescription2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            taskDescription = taskDescription2;
        }
        return taskDescription.KWHzl();
    }

    public void djBIcL() {
        C56169xxj c56169xxj = this.AYXKKw;
        c56169xxj.OLrzqt(this.OLrzqt);
        c56169xxj.EZpvd(this.djBIcL);
        c56169xxj.copydefault(KWHzl(this));
        c56169xxj.AEQbTJ(this.gEmmrt);
        xKK.Activity.execute$default(c56169xxj, 0L, 1, null);
    }

    public void AuCTel() {
        this.values.AYXKKw();
        this.fetchVPNInfo.AYXKKw();
    }
}
