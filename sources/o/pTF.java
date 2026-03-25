package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pTF {
    public static boolean EZpvd;
    public static final pTF KWHzl = new pTF();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        EZpvd = z;
    }

    private pTF() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!EZpvd || C59449zhJ.endsWith$default(str, "✅", false, 2, null)) {
            return str;
        }
        return str + "✅";
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ((java.lang.CharSequence) str).toString();
    }

    public final java.lang.CharSequence AEQbTJ(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return KWHzl(charSequence);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(str).toString();
    }

    public final java.lang.CharSequence KWHzl(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        boolean z = C32979mnm.EZpvd.OLrzqt().getResources().getConfiguration().getLayoutDirection() == 1;
        if (!z) {
            return charSequence;
        }
        java.lang.CharSequence charSequenceUnicodeWrap = androidx.core.text.BidiFormatter.getInstance(z).unicodeWrap(charSequence);
        Intrinsics.copydefault(charSequenceUnicodeWrap);
        return charSequenceUnicodeWrap;
    }
}
