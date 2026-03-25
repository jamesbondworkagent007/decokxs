package o;

import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kPm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28116kPm {
    public static final java.util.Map<java.lang.String, java.lang.String> EZpvd(@NotNull C28109kPf c28109kPf, boolean z) {
        Intrinsics.checkNotNullParameter(c28109kPf, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[9];
        pairArr[0] = C56390yDp.OLrzqt("chain_id", c28109kPf.copydefault());
        pairArr[1] = C56390yDp.OLrzqt("business", "dex");
        pairArr[2] = C56390yDp.OLrzqt("from_chain_id", c28109kPf.copydefault());
        pairArr[3] = C56390yDp.OLrzqt("chain_name", c28109kPf.KWHzl());
        pairArr[4] = C56390yDp.OLrzqt("business_type", c28109kPf.AEQbTJ());
        pairArr[5] = C56390yDp.OLrzqt(OtcExtraKeys.CRYPTO_ORDER_TYPE, c28109kPf.OLrzqt());
        pairArr[6] = C56390yDp.OLrzqt("trace_id", c28109kPf.EZpvd());
        pairArr[7] = C56390yDp.OLrzqt("terminal", "android");
        pairArr[8] = C56390yDp.OLrzqt("sign_type", c28109kPf.AYXKKw() ? z ? "tee_autosign" : "tee_normalsign" : z ? "eoa_autosign" : "eoa_normalsign");
        return C56424yEw.djBIcL(pairArr);
    }
}
