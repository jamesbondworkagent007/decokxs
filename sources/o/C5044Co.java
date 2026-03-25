package o;

import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5044Co {
    public static /* synthetic */ kotlin.Pair readNextQuoted$default(java.lang.String str, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = AbstractJsonLexerKt.COMMA;
        }
        return copydefault(str, i, c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        return new kotlin.Pair<>(java.lang.Integer.valueOf(r14), o.C59449zhJ.replace$default(o.C59449zhJ.replace$default(r1, "\\\"", com.amplifyframework.core.model.ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 4, (java.lang.Object) null), "\\\\", "\\", false, 4, (java.lang.Object) null));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair<java.lang.Integer, java.lang.String> copydefault(java.lang.String str, int i, char c) {
        int i2 = i + 1;
        if (i2 >= str.length()) {
            throw new java.lang.IllegalStateException("unbalanced quoted header value".toString());
        }
        int i3 = i2;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\\') {
                if (cCharAt == '\"') {
                    break;
                }
            } else {
                i3++;
            }
            i3++;
        }
        java.lang.String strSubstring = str.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        if (i3 >= str.length() || str.charAt(i3) != '\"') {
            throw new java.lang.IllegalStateException(("missing end quote around quoted header value: `" + strSubstring + '`').toString());
        }
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= str.length()) {
                break;
            }
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 == ' ' || cCharAt2 == '\t') {
                i3 = i4;
            } else {
                if (cCharAt2 != c) {
                    throw new java.lang.IllegalStateException(("Unexpected char `" + str.charAt(i4) + "` between header values. Previous header: `" + strSubstring + '`').toString());
                }
                i4 = i3 + 2;
            }
        }
    }

    public static /* synthetic */ kotlin.Pair readNextUnquoted$default(java.lang.String str, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = AbstractJsonLexerKt.COMMA;
        }
        return KWHzl(str, i, c);
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.String> KWHzl(java.lang.String str, int i, char c) {
        if (i >= str.length()) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int i2 = i;
        while (i2 < str.length() && str.charAt(i2) != c) {
            i2++;
        }
        java.lang.String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        if (i2 < str.length() && str.charAt(i2) == c) {
            i2++;
        }
        return new kotlin.Pair<>(java.lang.Integer.valueOf(i2), StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strSubstring).toString());
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString().length() == str.length()) {
            for (int i = 0; i < "\",()".length(); i++) {
                if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, "\",()".charAt(i), false, 2, (java.lang.Object) null)) {
                }
            }
            return str;
        }
        return '\"' + C59449zhJ.replace$default(C59449zhJ.replace$default(str, "\\", "\\\\", false, 4, (java.lang.Object) null), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "\\\"", false, 4, (java.lang.Object) null) + '\"';
    }
}
