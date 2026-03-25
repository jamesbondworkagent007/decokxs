package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46454tUy {
    public static final C46454tUy OLrzqt = new C46454tUy();
    public static final Regex EZpvd = new Regex("(?:[Hh][Tt][Tt][Pp][Ss]?://)?[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(?::\\d+)?(?:/[^\\s]*)?");
    public static final int KWHzl = 8;

    private C46454tUy() {
    }

    public final java.util.List<java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(Regex.findAll$default(EZpvd, str, 0, 2, null), new Function1() { // from class: o.tUx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46454tUy.AEQbTJ((MatchResult) obj);
            }
        }));
    }

    public static final java.lang.String AEQbTJ(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "");
        return matchResult.KWHzl();
    }
}
