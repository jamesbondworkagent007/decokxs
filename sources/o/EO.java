package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class EO {
    public static final java.util.Set<java.lang.Character> EZpvd = CollectionsKt___CollectionsKt.OqFWZa(new yIU('0', '9'));
    public static final java.util.Set<java.lang.Character> copydefault = yEE.AhwBna('e', 'E');
    public static final java.util.Set<java.lang.Character> AEQbTJ = yEE.AhwBna('-', '+');

    public static final boolean copydefault(char c) {
        return c >= 0 && c < ' ';
    }

    public static final java.lang.String copydefault(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1);
        int iKWHzl = 0;
        while (iKWHzl < str.length()) {
            char cCharAt = str.charAt(iKWHzl);
            if (cCharAt == '\\') {
                int i = iKWHzl + 2;
                char cCharAt2 = str.charAt(iKWHzl + 1);
                if (cCharAt2 == 'u') {
                    iKWHzl = KWHzl(str, i, sb) + i;
                } else {
                    if (cCharAt2 == '\\') {
                        sb.append(AbstractJsonLexerKt.STRING_ESC);
                    } else if (cCharAt2 == '/') {
                        sb.append(JsonPointer.SEPARATOR);
                    } else if (cCharAt2 == '\"') {
                        sb.append('\"');
                    } else if (cCharAt2 == 'b') {
                        sb.append('\b');
                    } else if (cCharAt2 == 'f') {
                        sb.append('\f');
                    } else if (cCharAt2 == 'r') {
                        sb.append('\r');
                    } else if (cCharAt2 == 'n') {
                        sb.append('\n');
                    } else if (cCharAt2 == 't') {
                        sb.append('\t');
                    } else {
                        throw new DeserializationException("Invalid escape character: `" + cCharAt2 + '`');
                    }
                    iKWHzl = i;
                }
            } else {
                sb.append(cCharAt);
                iKWHzl++;
            }
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final int KWHzl(java.lang.String str, int i, java.lang.StringBuilder sb) {
        int i2 = i + 4;
        if (i2 > str.length()) {
            throw new java.lang.IllegalStateException("Unexpected EOF reading escaped high surrogate".toString());
        }
        java.lang.String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        char cKWHzl = KWHzl(strSubstring);
        if (java.lang.Character.isHighSurrogate(cKWHzl)) {
            java.lang.String strSubstring2 = str.substring(i2, i + 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            if (!C59449zhJ.startsWith$default(strSubstring2, "\\u", false, 2, null)) {
                throw new java.lang.IllegalStateException(("Expected surrogate pair, found `" + strSubstring2 + '`').toString());
            }
            java.lang.String strSubstring3 = strSubstring2.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            char cKWHzl2 = KWHzl(strSubstring3);
            if (!java.lang.Character.isLowSurrogate(cKWHzl2)) {
                throw new java.lang.IllegalStateException(("Invalid surrogate pair: (" + ((int) cKWHzl) + ", " + ((int) cKWHzl2) + ')').toString());
            }
            C59446zhG.copydefault(sb, java.lang.Character.valueOf(cKWHzl), java.lang.Character.valueOf(cKWHzl2));
            return 10;
        }
        sb.append(cKWHzl);
        return 4;
    }

    public static final char KWHzl(java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G'))) {
                throw new java.lang.IllegalStateException(("Invalid unicode escape: `\\u" + str + '`').toString());
            }
        }
        return (char) java.lang.Integer.parseInt(str, CharsKt__CharJVMKt.checkRadix(16));
    }
}
