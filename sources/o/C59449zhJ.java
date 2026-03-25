package o;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59449zhJ extends StringsKt__StringNumberConversionsKt {
    public static /* synthetic */ boolean equals$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return gEmmrt(str, str2, z);
    }

    public static boolean gEmmrt(java.lang.String str, java.lang.String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String str, char c, char c2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return OLrzqt(str, c, c2, z);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, char c, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            java.lang.String strReplace = str.replace(c, c2);
            Intrinsics.checkNotNullExpressionValue(strReplace, "");
            return strReplace;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (C59475zhj.OLrzqt(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return copydefault(str, str2, str3, z);
    }

    public static java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int i = 0;
        int iOLrzqt = StringsKt__StringsKt.OLrzqt((java.lang.CharSequence) str, str2, 0, z);
        if (iOLrzqt < 0) {
            return str;
        }
        int length = str2.length();
        int iCopydefault = C56548yJl.copydefault(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        do {
            sb.append((java.lang.CharSequence) str, i, iOLrzqt);
            sb.append(str3);
            i = iOLrzqt + length;
            if (iOLrzqt >= str.length()) {
                break;
            }
            iOLrzqt = StringsKt__StringsKt.OLrzqt((java.lang.CharSequence) str, str2, iOLrzqt + iCopydefault, z);
        } while (iOLrzqt > 0);
        sb.append((java.lang.CharSequence) str, i, str.length());
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String replaceFirst$default(java.lang.String str, char c, char c2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return EZpvd(str, c, c2, z);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, char c, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(str, c, 0, z, 2, (java.lang.Object) null);
        return iIndexOf$default < 0 ? str : StringsKt__StringsKt.AEQbTJ(str, iIndexOf$default, iIndexOf$default + 1, java.lang.String.valueOf(c2)).toString();
    }

    public static /* synthetic */ java.lang.String replaceFirst$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return KWHzl(str, str2, str3, z);
    }

    public static java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(str, str2, 0, z, 2, (java.lang.Object) null);
        return iIndexOf$default < 0 ? str : StringsKt__StringsKt.AEQbTJ(str, iIndexOf$default, str2.length() + iIndexOf$default, str3).toString();
    }

    public static java.lang.String copydefault(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return new java.lang.String(cArr);
    }

    public static /* synthetic */ java.lang.String concatToString$default(char[] cArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return EZpvd(cArr, i, i2);
    }

    public static java.lang.String EZpvd(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        yDG.Companion.AEQbTJ(i, i2, cArr.length);
        return new java.lang.String(cArr, i, i2 - i);
    }

    public static /* synthetic */ char[] toCharArray$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return EZpvd(str, i, i2);
    }

    public static final char[] EZpvd(@NotNull java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        yDG.Companion.AEQbTJ(i, i2, str.length());
        char[] cArr = new char[i2 - i];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    public static java.lang.String copydefault(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new java.lang.String(bArr, Charsets.UTF_8);
    }

    public static /* synthetic */ java.lang.String decodeToString$default(byte[] bArr, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return EZpvd(bArr, i, i2, z);
    }

    public static final java.lang.String EZpvd(@NotNull byte[] bArr, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(bArr, "");
        yDG.Companion.AEQbTJ(i, i2, bArr.length);
        if (!z) {
            return new java.lang.String(bArr, i, i2 - i, Charsets.UTF_8);
        }
        java.nio.charset.CharsetDecoder charsetDecoderNewDecoder = Charsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        java.lang.String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(java.nio.ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static byte[] getNewProxyInstance(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return KWHzl(str, i, i2, z);
    }

    public static final byte[] KWHzl(@NotNull java.lang.String str, int i, int i2, boolean z) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(str, "");
        yDG.Companion.AEQbTJ(i, i2, str.length());
        if (!z) {
            java.lang.String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            java.nio.charset.Charset charset = Charsets.UTF_8;
            Intrinsics.copydefault(strSubstring, "");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return bytes;
        }
        java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        java.nio.ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(java.nio.CharBuffer.wrap(str, i, i2));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            Intrinsics.copydefault(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                Intrinsics.copydefault(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ char[] toCharArray$default(java.lang.String str, char[] cArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence charSequence, Pattern pattern, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return EZpvd(charSequence, pattern, i);
    }

    public static final java.util.List<java.lang.String> EZpvd(@NotNull java.lang.CharSequence charSequence, @NotNull Pattern pattern, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(pattern, "");
        StringsKt__StringsKt.OLrzqt(i);
        if (i == 0) {
            i = -1;
        }
        java.lang.String[] strArrSplit = pattern.split(charSequence, i);
        Intrinsics.checkNotNullExpressionValue(strArrSplit, "");
        return yDT.fIwbmz(strArrSplit);
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return AYXKKw(str, str2, z);
    }

    public static boolean AYXKKw(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        return AEQbTJ(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String str, java.lang.String str2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return OLrzqt(str, str2, i, z);
    }

    public static boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return AEQbTJ(str, i, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return valueOf(str, str2, z);
    }

    public static boolean valueOf(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.endsWith(str2);
        }
        return AEQbTJ(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ int compareTo$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OLrzqt(str, str2, z);
    }

    public static int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    public static boolean AEQbTJ(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if ((charSequence instanceof java.lang.String) && charSequence2 != null) {
            return ((java.lang.String) charSequence).contentEquals(charSequence2);
        }
        return StringsKt__StringsKt.OLrzqt(charSequence, charSequence2);
    }

    public static boolean OLrzqt(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        if (z) {
            return StringsKt__StringsKt.EZpvd(charSequence, charSequence2);
        }
        return AEQbTJ(charSequence, charSequence2);
    }

    public static /* synthetic */ boolean regionMatches$default(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return copydefault(charSequence, i, charSequence2, i2, i3, z);
    }

    public static final boolean copydefault(@NotNull java.lang.CharSequence charSequence, int i, @NotNull java.lang.CharSequence charSequence2, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return AEQbTJ((java.lang.String) charSequence, i, (java.lang.String) charSequence2, i2, i3, z);
        }
        return StringsKt__StringsKt.OLrzqt(charSequence, i, charSequence2, i2, i3, z);
    }

    public static /* synthetic */ boolean regionMatches$default(java.lang.String str, int i, java.lang.String str2, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return AEQbTJ(str, i, str2, i2, i3, z);
    }

    public static boolean AEQbTJ(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static /* synthetic */ byte[] toByteArray$default(java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    public static /* synthetic */ Pattern toPattern$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Pattern patternCompile = Pattern.compile(str, i);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        return patternCompile;
    }

    public static java.lang.String iwGUEr(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        return AEQbTJ(str, locale);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!java.lang.Character.isLowerCase(cCharAt)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char titleCase = java.lang.Character.toTitleCase(cCharAt);
        if (titleCase != java.lang.Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            java.lang.String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Intrinsics.copydefault(strSubstring, "");
            java.lang.String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            sb.append(upperCase);
        }
        java.lang.String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(strSubstring2);
        return sb.toString();
    }

    public static java.lang.String copydefault(@NotNull java.lang.CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new java.lang.String(cArr);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        java.lang.String string = sb.toString();
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public static java.util.Comparator<java.lang.String> copydefault(@NotNull C56529yIt c56529yIt) {
        Intrinsics.checkNotNullParameter(c56529yIt, "");
        java.util.Comparator<java.lang.String> comparator = java.lang.String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(comparator, "");
        return comparator;
    }
}
