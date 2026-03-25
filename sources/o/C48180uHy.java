package o;

import com.okinc.unify_trade.bot.config.ContractDcaStopLossType;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48180uHy {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48180uHy copy$default(C48180uHy c48180uHy, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c48180uHy.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c48180uHy.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = c48180uHy.OLrzqt;
        }
        return c48180uHy.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48180uHy AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C48180uHy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48180uHy)) {
            return false;
        }
        C48180uHy c48180uHy = (C48180uHy) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48180uHy.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c48180uHy.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c48180uHy.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.String str = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "StopLossUiModel(botType=" + this.KWHzl + ", stopLossPercent=" + this.AEQbTJ + ", stopLossMode=" + this.OLrzqt + ")";
    }

    public C48180uHy(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String str = this.KWHzl;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "spot_dca")) {
            if (this.AEQbTJ.length() > 0) {
                return pTB.formatICUPercent$default(C33129mqd.EZpvd(this.AEQbTJ), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), null, java.lang.Double.valueOf(100.0d), null, 20, null);
            }
            return C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_dca")) {
            if (C33129mqd.valueOf(this.AEQbTJ, 0)) {
                return C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
            }
            return ContractDcaStopLossType.Companion.AEQbTJ(this.OLrzqt) + C56033xvF.fmtBotPnlPercent$default(this.AEQbTJ, false, 0, 6, null);
        }
        return C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
    }
}
