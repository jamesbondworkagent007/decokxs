package o;

import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pWR {
    public static final java.lang.String OLrzqt(@NotNull DefiWebCoins defiWebCoins) {
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        return AEQbTJ(defiWebCoins.getTokenSymbol(), defiWebCoins.getChainName(), defiWebCoins.getTokenContractAddress());
    }

    public static final java.lang.String EZpvd(@NotNull DefiWebCoins defiWebCoins) {
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        return "DefiWebCoins" + defiWebCoins.getChainName() + defiWebCoins.getTokenSymbol() + defiWebCoins.getTokenName() + defiWebCoins.getTokenContractAddress();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        if (str3 != null && str3.length() > 8) {
            str3 = (str3 != null ? C59454zhO.AkhnZx(str3, 4) : null) + "..." + (str3 != null ? C59454zhO.isConnected(str3, 4) : null);
        }
        if ((str != null ? str.length() : 0) + 16 + (str2 != null ? str2.length() : 0) >= 38) {
            int length = 20 - (str2 != null ? str2.length() : 0);
            if (length <= 0) {
                str4 = "";
            } else {
                if ((str2 != null ? str2.length() : 0) > length) {
                    str4 = (str2 != null ? C59454zhO.AkhnZx(str2, length) : null) + "...· ";
                }
            }
        } else {
            str4 = str2 + " · ";
        }
        return str + " (" + str4 + str3 + ")";
    }
}
