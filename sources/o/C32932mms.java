package o;

import com.okinc.biz.statistics.util.ClientTimeIssue;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32932mms {
    public static final C32932mms AEQbTJ = new C32932mms();
    public static final int EZpvd;
    public static java.lang.String KWHzl;
    public static java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return KWHzl;
    }

    private C32932mms() {
    }

    static {
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        KWHzl = string;
        EZpvd = 8;
    }

    public final void AEQbTJ() {
        KWHzl = UUID.randomUUID().toString();
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt = str;
        pUU.KWHzl("TrackCommonParamsManager", "set launchSource: " + str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull C6909aYK c6909aYK) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c6909aYK, "");
        if (!c6909aYK.containsKey("launch_source") && (str2 = OLrzqt) != null) {
            c6909aYK.put("launch_source", str2);
        }
        if (!c6909aYK.containsKey(OtcExtraKeys.PARAMS_SESSION_ID)) {
            c6909aYK.put(OtcExtraKeys.PARAMS_SESSION_ID, KWHzl);
        }
        if (!c6909aYK.containsKey("client_ts")) {
            c6909aYK.put("client_ts", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        }
        ClientTimeIssue.AEQbTJ.EZpvd(str, (java.lang.String) c6909aYK.get("client_ts"), "checkAndAppendCommonParams");
        if (c6909aYK.containsKey("anchor_en_name")) {
            return;
        }
        c6909aYK.put("anchor_en_name", str);
    }
}
