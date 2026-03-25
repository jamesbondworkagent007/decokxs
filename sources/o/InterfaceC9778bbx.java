package o;

import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9778bbx {
    java.lang.String AEQbTJ();

    AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(java.lang.String str);

    boolean KWHzl();

    /* JADX INFO: renamed from: o.bbx$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        public static boolean KWHzl(@NotNull InterfaceC9778bbx interfaceC9778bbx, java.lang.String str) {
            if (str == null || str.length() == 0) {
                return true;
            }
            if (str.length() % 2 == 0 && C59449zhJ.AYXKKw(str, EIP1271Verifier.hexPrefix, true)) {
                java.lang.String strSubstring = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                for (int i = 0; i < strSubstring.length(); i++) {
                    char cCharAt = strSubstring.charAt(i);
                    if (('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < 'g') || ('A' <= cCharAt && cCharAt < 'G'))) {
                    }
                }
                return true;
            }
            return false;
        }
    }
}
