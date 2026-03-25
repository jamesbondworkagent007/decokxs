package o;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.auz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8030auz {
    public static /* synthetic */ BigDecimal toBigDecimalUsingSignificandAndExponent$default(long j, long j2, C7984auD c7984auD, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return OLrzqt(j, j2, c7984auD);
    }

    public static final BigDecimal OLrzqt(long j, long j2, C7984auD c7984auD) {
        return BigDecimal.Companion.EZpvd(j, j2, c7984auD);
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(long j, java.lang.Long l, C7984auD c7984auD, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return EZpvd(j, l, c7984auD);
    }

    public static final BigDecimal EZpvd(long j, java.lang.Long l, C7984auD c7984auD) {
        return BigDecimal.Companion.AEQbTJ(j, c7984auD).EZpvd(l == null ? 0L : l.longValue());
    }

    public static /* synthetic */ BigDecimal toBigDecimalUsingSignificandAndExponent$default(int i, long j, C7984auD c7984auD, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c7984auD = null;
        }
        return copydefault(i, j, c7984auD);
    }

    public static final BigDecimal copydefault(int i, long j, C7984auD c7984auD) {
        return BigDecimal.Companion.OLrzqt(i, j, c7984auD);
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(int i, java.lang.Long l, C7984auD c7984auD, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            l = null;
        }
        if ((i2 & 2) != 0) {
            c7984auD = null;
        }
        return EZpvd(i, l, c7984auD);
    }

    public static final BigDecimal EZpvd(int i, java.lang.Long l, C7984auD c7984auD) {
        return BigDecimal.Companion.AEQbTJ(i, c7984auD).EZpvd(l == null ? 0L : l.longValue());
    }

    public static /* synthetic */ BigDecimal toBigDecimalUsingSignificandAndExponent$default(short s, long j, C7984auD c7984auD, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return copydefault(s, j, c7984auD);
    }

    public static final BigDecimal copydefault(short s, long j, C7984auD c7984auD) {
        return BigDecimal.Companion.AEQbTJ(s, j, c7984auD);
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(short s, java.lang.Long l, C7984auD c7984auD, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return KWHzl(s, l, c7984auD);
    }

    public static final BigDecimal KWHzl(short s, java.lang.Long l, C7984auD c7984auD) {
        return BigDecimal.Companion.AEQbTJ(s, c7984auD).EZpvd(l == null ? 0L : l.longValue());
    }

    public static /* synthetic */ BigDecimal toBigDecimalUsingSignificandAndExponent$default(byte b, long j, C7984auD c7984auD, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return OLrzqt(b, j, c7984auD);
    }

    public static final BigDecimal OLrzqt(byte b, long j, C7984auD c7984auD) {
        return BigDecimal.Companion.copydefault(b, j, c7984auD);
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(byte b, java.lang.Long l, C7984auD c7984auD, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return copydefault(b, l, c7984auD);
    }

    public static final BigDecimal copydefault(byte b, java.lang.Long l, C7984auD c7984auD) {
        return BigDecimal.Companion.AEQbTJ(b, c7984auD).EZpvd(l == null ? 0L : l.longValue());
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(java.lang.String str, java.lang.Long l, C7984auD c7984auD, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return AEQbTJ(str, l, c7984auD);
    }

    public static final BigDecimal AEQbTJ(@NotNull java.lang.String str, java.lang.Long l, C7984auD c7984auD) {
        Intrinsics.checkNotNullParameter(str, "");
        return BigDecimal.Companion.EZpvd(str, c7984auD).EZpvd(l == null ? 0L : l.longValue());
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(float f, java.lang.Long l, C7984auD c7984auD, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return KWHzl(f, l, c7984auD);
    }

    public static final BigDecimal KWHzl(float f, java.lang.Long l, C7984auD c7984auD) {
        return BigDecimal.Companion.AEQbTJ(f, c7984auD).EZpvd(l == null ? 0L : l.longValue());
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(double d, java.lang.Long l, C7984auD c7984auD, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return EZpvd(d, l, c7984auD);
    }

    public static final BigDecimal EZpvd(double d, java.lang.Long l, C7984auD c7984auD) {
        return BigDecimal.Companion.EZpvd(d, c7984auD).EZpvd(l == null ? 0L : l.longValue());
    }
}
