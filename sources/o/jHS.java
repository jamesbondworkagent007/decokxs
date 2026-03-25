package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jHS {
    public static final jHS EZpvd = new jHS();

    private jHS() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, '.', 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            return str;
        }
        int length = str.length() - 1;
        while (length > iIndexOf$default && str.charAt(length) == '0') {
            length--;
        }
        if (length == iIndexOf$default) {
            length--;
        }
        if (length >= str.length() - 1) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, length + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final int OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.copydefault(str, "1")) {
            return 3;
        }
        if (C33129mqd.copydefault(str, "0.1")) {
            return 5;
        }
        if (C33129mqd.copydefault(str, "0.01")) {
            return 6;
        }
        if (C33129mqd.copydefault(str, "0.001")) {
            return 7;
        }
        if (C33129mqd.copydefault(str, "0.0001")) {
            return 8;
        }
        if (C33129mqd.copydefault(str, "0.00001")) {
            return 9;
        }
        if (C33129mqd.copydefault(str, "0.000001")) {
            return 10;
        }
        if (C33129mqd.copydefault(str, "0.0000001")) {
            return 11;
        }
        if (C33129mqd.copydefault(str, "0.00000001")) {
            return 12;
        }
        if (C33129mqd.copydefault(str, "0.000000001")) {
            return 13;
        }
        if (C33129mqd.copydefault(str, "0.0000000001")) {
            return 14;
        }
        return C33129mqd.copydefault(str, "0.00000000001") ? 15 : 16;
    }
}
