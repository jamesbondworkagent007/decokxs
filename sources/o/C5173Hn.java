package o;

import aws.smithy.kotlin.runtime.time.TimestampFormat;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5173Hn implements java.lang.Comparable<C5173Hn> {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public static final C56350yCc AYXKKw = C5170Hk.AEQbTJ();
    public static final C56350yCc EZpvd;
    public static final C56350yCc KWHzl;
    public static final C5173Hn OLrzqt;
    public static final C5173Hn copydefault;
    public static final ZoneId gEmmrt;
    public final Instant AhwBna;

    /* JADX INFO: renamed from: o.Hn$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TimestampFormat.values().length];
            try {
                iArr[TimestampFormat.ISO_8601.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TimestampFormat.ISO_8601_CONDENSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TimestampFormat.ISO_8601_CONDENSED_DATE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TimestampFormat.RFC_5322.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[TimestampFormat.EPOCH_SECONDS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Instant copydefault() {
        return this.AhwBna;
    }

    public C5173Hn(@NotNull Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "");
        this.AhwBna = instant;
    }

    public final long KWHzl() {
        return this.AhwBna.getEpochSecond();
    }

    public final int EZpvd() {
        return this.AhwBna.getNano();
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull C5173Hn c5173Hn) {
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        return this.AhwBna.compareTo(c5173Hn.AhwBna);
    }

    public int hashCode() {
        return this.AhwBna.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        return this == obj || ((obj instanceof C5173Hn) && Intrinsics.EZpvd(this.AhwBna, ((C5173Hn) obj).AhwBna));
    }

    public java.lang.String toString() {
        return OLrzqt(TimestampFormat.ISO_8601);
    }

    public final C5173Hn KWHzl(long j) {
        return copydefault(C59462zhW.wlaJM(j));
    }

    public final java.lang.String OLrzqt(@NotNull TimestampFormat timestampFormat) {
        Intrinsics.checkNotNullParameter(timestampFormat, "");
        int i = Activity.EZpvd[timestampFormat.ordinal()];
        if (i == 1) {
            java.lang.String strOLrzqt = C56350yCc.AEQbTJ.OLrzqt(this.AhwBna.truncatedTo(ChronoUnit.MICROS));
            Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
            return strOLrzqt;
        }
        if (i == 2) {
            java.lang.String strOLrzqt2 = EZpvd.OLrzqt(this.AhwBna);
            Intrinsics.checkNotNullExpressionValue(strOLrzqt2, "");
            return strOLrzqt2;
        }
        if (i == 3) {
            java.lang.String strOLrzqt3 = KWHzl.OLrzqt(this.AhwBna);
            Intrinsics.checkNotNullExpressionValue(strOLrzqt3, "");
            return strOLrzqt3;
        }
        if (i == 4) {
            java.lang.String strOLrzqt4 = AYXKKw.OLrzqt(ZonedDateTime.ofInstant(this.AhwBna, ZoneOffset.UTC));
            Intrinsics.checkNotNullExpressionValue(strOLrzqt4, "");
            return strOLrzqt4;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(java.lang.String.valueOf(KWHzl()));
        if (EZpvd() > 0) {
            stringBuffer.append(JwtUtilsKt.JWT_DELIMITER);
            java.lang.String strValueOf = java.lang.String.valueOf(EZpvd());
            stringBuffer.append(C59449zhJ.copydefault("0", 9 - strValueOf.length()));
            stringBuffer.append(strValueOf);
            return StringsKt__StringsKt.OLrzqt(stringBuffer, '0').toString();
        }
        java.lang.String string = stringBuffer.toString();
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    /* JADX INFO: renamed from: o.Hn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Hn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C5173Hn copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C5170Hk.OLrzqt(C5181Hv.OLrzqt(str));
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.Hk.copydefault(o.Hq):o.Hn */
        public final C5173Hn OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C5170Hk.OLrzqt(C5181Hv.EZpvd(str));
        }

        public static /* synthetic */ C5173Hn fromEpochSeconds$default(ActionBar actionBar, long j, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return actionBar.copydefault(j, i);
        }

        public final C5173Hn copydefault(long j, int i) {
            Instant instantOfEpochSecond = Instant.ofEpochSecond(j, i);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "");
            return new C5173Hn(instantOfEpochSecond);
        }

        public final C5173Hn EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C5181Hv.KWHzl(str);
        }

        public final C5173Hn KWHzl() {
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "");
            return new C5173Hn(instantNow);
        }

        public final C5173Hn OLrzqt() {
            return C5173Hn.copydefault;
        }
    }

    static {
        ZoneId zoneIdOf = ZoneId.of("Z");
        gEmmrt = zoneIdOf;
        C56350yCc c56350yCcAEQbTJ = C56350yCc.AEQbTJ("yyyyMMdd'T'HHmmss'Z'").AEQbTJ(zoneIdOf);
        Intrinsics.checkNotNullExpressionValue(c56350yCcAEQbTJ, "");
        EZpvd = c56350yCcAEQbTJ;
        C56350yCc c56350yCcAEQbTJ2 = C56350yCc.AEQbTJ("yyyyMMdd").AEQbTJ(zoneIdOf);
        Intrinsics.checkNotNullExpressionValue(c56350yCcAEQbTJ2, "");
        KWHzl = c56350yCcAEQbTJ2;
        Instant instant = Instant.MIN;
        Intrinsics.checkNotNullExpressionValue(instant, "");
        OLrzqt = new C5173Hn(instant);
        Instant instant2 = Instant.MAX;
        Intrinsics.checkNotNullExpressionValue(instant2, "");
        copydefault = new C5173Hn(instant2);
    }

    public final C5173Hn copydefault(long j) {
        return AEQbTJ.copydefault(KWHzl() + C59462zhW.DbNXlk(j), EZpvd() + C59462zhW.values(j));
    }
}
