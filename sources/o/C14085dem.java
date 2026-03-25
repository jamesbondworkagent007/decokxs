package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dem, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14085dem {
    public static final C14085dem copydefault = new C14085dem();

    private C14085dem() {
    }

    public final int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0 || str2.length() == 0) {
            return -1;
        }
        java.lang.String[] strArr = (java.lang.String[]) new Regex("\\.").split(str, 0).toArray(new java.lang.String[0]);
        java.lang.String[] strArr2 = (java.lang.String[]) new Regex("\\.").split(str2, 0).toArray(new java.lang.String[0]);
        int i = 0;
        while (true) {
            if (i >= strArr.length && i >= strArr2.length) {
                return 0;
            }
            java.lang.String str3 = i < strArr.length ? strArr[i] : "0";
            java.lang.String str4 = i < strArr2.length ? strArr2[i] : "0";
            long jCharAt = 0;
            long jCharAt2 = 0;
            for (int i2 = 0; i2 < str3.length(); i2++) {
                jCharAt2 = (jCharAt2 * ((long) 10)) + ((long) (str3.charAt(i2) - '0'));
            }
            for (int i3 = 0; i3 < str4.length(); i3++) {
                jCharAt = (jCharAt * ((long) 10)) + ((long) (str4.charAt(i3) - '0'));
            }
            if (jCharAt2 > jCharAt) {
                return 1;
            }
            if (jCharAt2 < jCharAt) {
                return -1;
            }
            i++;
        }
    }
}
