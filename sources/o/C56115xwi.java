package o;

import com.okinc.unify_trade.calculator.tpslprofit.SpTips;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.xwi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56115xwi {
    public final SpTips EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, @NotNull java.lang.String str8, boolean z2, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, boolean z3, java.lang.Boolean bool, @NotNull java.lang.String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str14, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd = C56117xwk.copydefault.EZpvd(str, str2, str3, str4, str5, str6, str7, z2, z, str8, str9, str10, str11, str12, str14);
        java.lang.String first = pairEZpvd.getFirst();
        java.lang.String second = pairEZpvd.getSecond();
        Objects.toString(first);
        Objects.toString(second);
        pUU.KWHzl("calculateByPrice", "instType: " + str + " instId:" + str2 + " orderType:" + str3 + " type:" + str4 + " spPrice:" + str5 + " amount:" + str6 + " orderPrice:" + str7 + " isContract:" + z + " mgnModule:" + str8 + " isPos:" + z2 + " ccy:" + str9 + " marginPrice:" + str10 + " liab:" + str11 + " positionPrice:" + str12 + " lever:" + str13 + " isStopProfit:" + z3 + " needPnlRatio:" + bool);
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            SpTips spTipsCopydefault = new C56116xwj().copydefault(str, str2, str3, str4, pairEZpvd.getFirst(), str6, str5, str7, z, str13, z3);
            return new SpTips(pairEZpvd.getFirst(), pairEZpvd.getSecond(), null, null, null, pairEZpvd.getFirst(), spTipsCopydefault != null ? spTipsCopydefault.getResult() : null, null, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, null);
        }
        return new SpTips(pairEZpvd.getFirst(), pairEZpvd.getSecond(), null, null, null, null, null, null, 252, null);
    }
}
