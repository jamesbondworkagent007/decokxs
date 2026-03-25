package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56927yXm {
    public static final byte[] copydefault(@NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        int length = 0;
        for (java.lang.String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i = 0;
        for (java.lang.String str2 : strArr) {
            int length2 = str2.length();
            int i2 = 0;
            while (i2 < length2) {
                bArr[i] = (byte) str2.charAt(i2);
                i2++;
                i++;
            }
        }
        return bArr;
    }
}
