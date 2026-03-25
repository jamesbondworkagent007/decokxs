package o;

import com.okinc.p2p.api.OtcExtraKeys;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;

/* JADX INFO: renamed from: o.xwb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56108xwb {
    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3151468) {
                if (iHashCode == 341203229) {
                    if (str.equals("subscription")) {
                        int i = C55688xof.Application.RIsQag;
                        if (str2 == null || str2.length() == 0) {
                            str2 = "0";
                        }
                        return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C56033xvF.fmtBotValueBySymbol$default("USDT", str2, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null))));
                    }
                } else if (iHashCode == 413749729 && str.equals("profit_sharing") && str3 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
                    return C33069mpW.copydefault(C55688xof.Application.RhlVAI, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.copydefault.EZpvd(str3, 2, 0, RoundingMode.DOWN))));
                }
            } else if (str.equals("free")) {
                return C33070mpX.AYXKKw(C55688xof.Application.glXhWM);
            }
        }
        return "--";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r2.equals("profit_sharing") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r2.equals("free") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return o.C33070mpX.AYXKKw(o.C55688xof.Application.RZOtbZ);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String copydefault(java.lang.String str, boolean z, java.lang.String str2) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3151468) {
                if (iHashCode != 341203229) {
                    if (iHashCode == 413749729) {
                    }
                } else if (str.equals("subscription")) {
                    if (z) {
                        return C33070mpX.AYXKKw(C55688xof.Application.RZOtbZ);
                    }
                    if (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
                        return C33070mpX.AYXKKw(C55688xof.Application.RZOtbZ);
                    }
                    return pTA.formatSimpleDate$default(new Date(java.lang.Long.parseLong(str2)), null, 1, null);
                }
            }
        }
        return "--";
    }
}
