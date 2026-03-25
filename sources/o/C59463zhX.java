package o;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zhX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59463zhX {
    public static final boolean OLrzqt = false;
    public static final java.lang.ThreadLocal<DecimalFormat>[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean KWHzl() {
        return OLrzqt;
    }

    static {
        java.lang.ThreadLocal<DecimalFormat>[] threadLocalArr = new java.lang.ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new java.lang.ThreadLocal<>();
        }
        copydefault = threadLocalArr;
    }

    public static final DecimalFormat EZpvd(int i) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    public static final java.lang.String OLrzqt(double d, int i) {
        DecimalFormat decimalFormatEZpvd;
        java.lang.ThreadLocal<DecimalFormat>[] threadLocalArr = copydefault;
        if (i < threadLocalArr.length) {
            java.lang.ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i];
            DecimalFormat decimalFormatEZpvd2 = threadLocal.get();
            if (decimalFormatEZpvd2 == null) {
                decimalFormatEZpvd2 = EZpvd(i);
                threadLocal.set(decimalFormatEZpvd2);
            }
            decimalFormatEZpvd = decimalFormatEZpvd2;
        } else {
            decimalFormatEZpvd = EZpvd(i);
        }
        java.lang.String str = decimalFormatEZpvd.format(d);
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
