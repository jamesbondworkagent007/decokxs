package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C31788mDy {
    public static final C31788mDy copydefault = new C31788mDy();

    private C31788mDy() {
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.CharSequence charSequenceSubSequence = "";
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strReplace$default = C59449zhJ.replace$default(C59449zhJ.replace$default(str, "✅", "", false, 4, (java.lang.Object) null), " ❌", "", false, 4, (java.lang.Object) null);
        int length = strReplace$default.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!(!java.lang.Character.isDigit(strReplace$default.charAt(length)))) {
                    charSequenceSubSequence = strReplace$default.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return charSequenceSubSequence.toString();
    }
}
