package o;

import com.okinc.unify_trade.bot.config.ContractDcaStopConditionType;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48179uHx {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX INFO: renamed from: o.uHx$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ContractDcaTriggerType.values().length];
            try {
                iArr[ContractDcaTriggerType.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48179uHx copy$default(C48179uHx c48179uHx, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c48179uHx.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c48179uHx.OLrzqt;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c48179uHx.djBIcL;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c48179uHx.copydefault;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            z = c48179uHx.KWHzl;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = c48179uHx.EZpvd;
        }
        return c48179uHx.AEQbTJ(str, str6, str7, str8, z2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48179uHx AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, boolean z, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C48179uHx(str, str2, str3, str4, z, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48179uHx)) {
            return false;
        }
        C48179uHx c48179uHx = (C48179uHx) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c48179uHx.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c48179uHx.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c48179uHx.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c48179uHx.copydefault) && this.KWHzl == c48179uHx.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c48179uHx.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TriggerConditionUiModel(strategy=" + this.AEQbTJ + ", condition=" + this.OLrzqt + ", triggerPx=" + this.djBIcL + ", botType=" + this.copydefault + ", isStart=" + this.KWHzl + ", investCcy=" + this.EZpvd + ")";
    }

    public C48179uHx(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, boolean z, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.djBIcL = str3;
        this.copydefault = str4;
        this.KWHzl = z;
        this.EZpvd = str5;
    }

    public final java.lang.String KWHzl() {
        java.lang.String strAYXKKw;
        java.lang.String str;
        java.lang.String str2 = this.copydefault;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "spot_dca")) {
            return GridStartTriggerType.Companion.copydefault(this.AEQbTJ);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "contract_dca")) {
            if (this.KWHzl) {
                ContractDcaTriggerType contractDcaTriggerTypeEZpvd = ContractDcaTriggerType.Companion.EZpvd(this.AEQbTJ);
                if (contractDcaTriggerTypeEZpvd != null && Application.copydefault[contractDcaTriggerTypeEZpvd.ordinal()] == 1) {
                    java.lang.String str3 = this.djBIcL;
                    if (str3 == null) {
                        str = "--";
                    } else {
                        str = xMR.copydefault.copydefault(str3) + " " + this.EZpvd;
                    }
                    return C33070mpX.AYXKKw(contractDcaTriggerTypeEZpvd.getShowMode()) + " | " + str;
                }
                java.lang.String strAYXKKw2 = contractDcaTriggerTypeEZpvd != null ? C33070mpX.AYXKKw(contractDcaTriggerTypeEZpvd.getShowMode()) : null;
                if (strAYXKKw2 != null) {
                    return strAYXKKw2;
                }
            } else {
                java.lang.String str4 = this.AEQbTJ;
                ContractDcaStopConditionType contractDcaStopConditionType = ContractDcaStopConditionType.PRICE;
                if (!Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) contractDcaStopConditionType.getMode())) {
                    return Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) ContractDcaStopConditionType.END_ROUND_STOP.getMode()) ? C33070mpX.AYXKKw(C55688xof.Application.stopBehavioSecDataCollection) : C33070mpX.AYXKKw(C55688xof.Application.DxnCrt);
                }
                java.lang.String str5 = this.OLrzqt;
                if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "cross_up")) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.cancel);
                } else if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "cross_down")) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getSessionID);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(contractDcaStopConditionType.getShowMode());
                }
                xMR xmr = xMR.copydefault;
                java.lang.String str6 = this.djBIcL;
                return strAYXKKw + " | " + xmr.copydefault(str6 != null ? str6 : "") + " " + this.EZpvd;
            }
        }
        return "";
    }
}
