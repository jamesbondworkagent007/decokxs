package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59445zhF extends C59444zhE {
    public static java.lang.StringBuilder EZpvd(@NotNull java.lang.StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.setLength(0);
        return sb;
    }

    public static /* synthetic */ void toCharArray$default(java.lang.StringBuilder sb, char[] cArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        sb.getChars(i2, i3, cArr, i);
    }
}
