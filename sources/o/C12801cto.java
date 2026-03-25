package o;

import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cto, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12801cto {
    public static final C12801cto EZpvd = new C12801cto();

    private C12801cto() {
    }

    public final java.lang.String KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.EZpvd(C33129mqd.valueOf(str2), true);
        if (!(c10854bwMCopydefault instanceof C10854bwM)) {
            c10854bwMCopydefault = null;
        }
        if (c10854bwMCopydefault != null && c10854bwMCopydefault.ejfBZ()) {
            if (str == null || str.length() == 0 || str.length() < 136) {
                return "";
            }
            if (C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
                java.lang.String strSubstring = str.substring(34, 74);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return EIP1271Verifier.hexPrefix + strSubstring;
            }
            java.lang.String strSubstring2 = str.substring(32, 72);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            return EIP1271Verifier.hexPrefix + strSubstring2;
        }
        if (c10854bwMCopydefault == null || !c10854bwMCopydefault.run() || str == null || str.length() == 0 || str.length() < 136) {
            return "";
        }
        if (C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
            xYW xyw = xYW.AEQbTJ;
            java.lang.String strSubstring3 = str.substring(34, 74);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            return xyw.isConnected(EIP1271Verifier.hexPrefix + strSubstring3);
        }
        xYW xyw2 = xYW.AEQbTJ;
        java.lang.String strSubstring4 = str.substring(32, 72);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
        return xyw2.isConnected(EIP1271Verifier.hexPrefix + strSubstring4);
    }
}
