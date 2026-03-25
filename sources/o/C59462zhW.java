package o;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.primitives.Longs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59462zhW implements java.lang.Comparable<C59462zhW> {
    public final long EZpvd;
    public static final Activity OLrzqt = new Activity(null);
    public static final long KWHzl = copydefault(0);
    public static final long AEQbTJ = C59519zia.AYXKKw(4611686018427387903L);
    public static final long copydefault = C59519zia.AYXKKw(-4611686018427387903L);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean AEQbTJ(long j, java.lang.Object obj) {
        return (obj instanceof C59462zhW) && j == ((C59462zhW) obj).copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int AuCTel(long j) {
        return java.lang.Long.hashCode(j);
    }

    public static final boolean EZpvd(long j, long j2) {
        return j == j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 long) A[MD:(long):void (m)] call: o.zhW.<init>(long):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C59462zhW KWHzl(long j) {
        return new C59462zhW(j);
    }

    public static final boolean fARcdN(long j) {
        return (((int) j) & 1) == 1;
    }

    public static final long fIwbmz(long j) {
        return j >> 1;
    }

    public static final boolean fJNWhG(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean getNewProxyInstance(long j) {
        return j > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean hDKMBd(long j) {
        return j == AEQbTJ || j == copydefault;
    }

    public static final boolean uzCIH(long j) {
        return j < 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ long copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return AEQbTJ(this.EZpvd, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return AuCTel(this.EZpvd);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(C59462zhW c59462zhW) {
        return AuCTelauCTel(c59462zhW.copydefault());
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.zhW.KWHzl(long):o.zhW] */
    public /* synthetic */ C59462zhW(long j) {
        this.EZpvd = j;
    }

    public static final DurationUnit isConnected(long j) {
        return fJNWhG(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long copydefault(long j) {
        if (C59463zhX.KWHzl()) {
            if (fJNWhG(j)) {
                long jFIwbmz = fIwbmz(j);
                if (-4611686018426999999L > jFIwbmz || jFIwbmz >= 4611686018427000000L) {
                    throw new java.lang.AssertionError(fIwbmz(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jFIwbmz2 = fIwbmz(j);
                if (-4611686018427387903L > jFIwbmz2 || jFIwbmz2 >= Longs.MAX_POWER_OF_TWO) {
                    throw new java.lang.AssertionError(fIwbmz(j) + " ms is out of milliseconds range");
                }
                long jFIwbmz3 = fIwbmz(j);
                if (-4611686018426L <= jFIwbmz3 && jFIwbmz3 < 4611686018427L) {
                    throw new java.lang.AssertionError(fIwbmz(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: o.zhW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zhW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final long KWHzl() {
            return C59462zhW.KWHzl;
        }

        public final long EZpvd() {
            return C59462zhW.AEQbTJ;
        }

        public final long copydefault() {
            return C59462zhW.copydefault;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.zia.OLrzqt(java.lang.String, boolean):long */
        public final long KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return C59519zia.KWHzl(str, true);
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e);
            }
        }
    }

    public static final long wlaJM(long j) {
        return C59519zia.AEQbTJ(-fIwbmz(j), ((int) j) & 1);
    }

    public static final long copydefault(long j, long j2) {
        if (hDKMBd(j)) {
            if (ejfBZ(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new java.lang.IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (hDKMBd(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long jFIwbmz = fIwbmz(j) + fIwbmz(j2);
            return fJNWhG(j) ? C59519zia.djBIcL(jFIwbmz) : C59519zia.valueOf(jFIwbmz);
        }
        if (fARcdN(j)) {
            return EZpvd(j, fIwbmz(j), fIwbmz(j2));
        }
        return EZpvd(j, fIwbmz(j2), fIwbmz(j));
    }

    public static final long EZpvd(long j, long j2, long j3) {
        long jIsConnected = C59519zia.isConnected(j3);
        long j4 = j2 + jIsConnected;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return C59519zia.AYXKKw(C56548yJl.copydefault(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return C59519zia.AhwBna(C59519zia.DbNXlk(j4) + (j3 - C59519zia.DbNXlk(jIsConnected)));
    }

    public static final long OLrzqt(long j, long j2) {
        return copydefault(j, wlaJM(j2));
    }

    public static final long EZpvd(long j, int i) {
        if (hDKMBd(j)) {
            if (i != 0) {
                return i > 0 ? j : wlaJM(j);
            }
            throw new java.lang.IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return KWHzl;
        }
        long jFIwbmz = fIwbmz(j);
        long j2 = i;
        long j3 = jFIwbmz * j2;
        if (!fJNWhG(j)) {
            if (j3 / j2 == jFIwbmz) {
                return C59519zia.AYXKKw(C56548yJl.AEQbTJ(j3, (InterfaceC56538yJb<java.lang.Long>) new C56540yJd(-4611686018427387903L, 4611686018427387903L)));
            }
            return yII.AEQbTJ(jFIwbmz) * yII.AEQbTJ(i) > 0 ? AEQbTJ : copydefault;
        }
        if (-2147483647L <= jFIwbmz && jFIwbmz < 2147483648L) {
            return C59519zia.AhwBna(j3);
        }
        if (j3 / j2 == jFIwbmz) {
            return C59519zia.djBIcL(j3);
        }
        long jIsConnected = C59519zia.isConnected(jFIwbmz);
        long j4 = jIsConnected * j2;
        long jIsConnected2 = C59519zia.isConnected((jFIwbmz - C59519zia.DbNXlk(jIsConnected)) * j2) + j4;
        if (j4 / j2 != jIsConnected || (jIsConnected2 ^ j4) < 0) {
            return yII.AEQbTJ(jFIwbmz) * yII.AEQbTJ(i) > 0 ? AEQbTJ : copydefault;
        }
        return C59519zia.AYXKKw(C56548yJl.AEQbTJ(jIsConnected2, (InterfaceC56538yJb<java.lang.Long>) new C56540yJd(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final long OLrzqt(long j, double d) {
        int iEZpvd = yII.EZpvd(d);
        if (iEZpvd == d) {
            return EZpvd(j, iEZpvd);
        }
        DurationUnit durationUnitIsConnected = isConnected(j);
        return C59519zia.OLrzqt(EZpvd(j, durationUnitIsConnected) * d, durationUnitIsConnected);
    }

    public static final long OLrzqt(long j, int i) {
        if (i == 0) {
            if (getNewProxyInstance(j)) {
                return AEQbTJ;
            }
            if (uzCIH(j)) {
                return copydefault;
            }
            throw new java.lang.IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (fJNWhG(j)) {
            return C59519zia.AhwBna(fIwbmz(j) / ((long) i));
        }
        if (hDKMBd(j)) {
            return EZpvd(j, yII.AEQbTJ(i));
        }
        long j2 = i;
        long jFIwbmz = fIwbmz(j) / j2;
        if (-4611686018426L > jFIwbmz || jFIwbmz >= 4611686018427L) {
            return C59519zia.AYXKKw(jFIwbmz);
        }
        return C59519zia.AhwBna(C59519zia.DbNXlk(jFIwbmz) + (C59519zia.DbNXlk(fIwbmz(j) - (jFIwbmz * j2)) / j2));
    }

    public static final double AEQbTJ(long j, long j2) {
        DurationUnit durationUnit = (DurationUnit) yEY.OLrzqt(isConnected(j), isConnected(j2));
        return EZpvd(j, durationUnit) / EZpvd(j2, durationUnit);
    }

    public static final long copydefault(long j, @NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        DurationUnit durationUnitIsConnected = isConnected(j);
        if (durationUnit.compareTo(durationUnitIsConnected) <= 0 || hDKMBd(j)) {
            return j;
        }
        return C59519zia.AEQbTJ(fIwbmz(j) - (fIwbmz(j) % C59465zhZ.AEQbTJ(1L, durationUnit, durationUnitIsConnected)), durationUnitIsConnected);
    }

    public static final boolean ejfBZ(long j) {
        return !hDKMBd(j);
    }

    public static final long OLrzqt(long j) {
        return uzCIH(j) ? wlaJM(j) : j;
    }

    public int AuCTelauCTel(long j) {
        return KWHzl(this.EZpvd, j);
    }

    public static int KWHzl(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.copydefault(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return uzCIH(j) ? -i : i;
    }

    public static final int EZpvd(long j) {
        if (hDKMBd(j)) {
            return 0;
        }
        return (int) (AYXKKw(j) % ((long) 24));
    }

    public static final int fetchVPNInfo(long j) {
        if (hDKMBd(j)) {
            return 0;
        }
        return (int) (AhwBna(j) % ((long) 60));
    }

    public static final int AkhnZx(long j) {
        if (hDKMBd(j)) {
            return 0;
        }
        return (int) (DbNXlk(j) % ((long) 60));
    }

    public static final int values(long j) {
        long jFIwbmz;
        if (hDKMBd(j)) {
            return 0;
        }
        if (fARcdN(j)) {
            jFIwbmz = C59519zia.DbNXlk(fIwbmz(j) % ((long) 1000));
        } else {
            jFIwbmz = fIwbmz(j) % ((long) 1000000000);
        }
        return (int) jFIwbmz;
    }

    public static final double EZpvd(long j, @NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if (j == AEQbTJ) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == copydefault) {
            return Double.NEGATIVE_INFINITY;
        }
        return C59465zhZ.AEQbTJ(fIwbmz(j), isConnected(j), durationUnit);
    }

    public static final long KWHzl(long j, @NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if (j == AEQbTJ) {
            return Long.MAX_VALUE;
        }
        if (j == copydefault) {
            return Long.MIN_VALUE;
        }
        return C59465zhZ.AEQbTJ(fIwbmz(j), isConnected(j), durationUnit);
    }

    public static final long AEQbTJ(long j) {
        return KWHzl(j, DurationUnit.DAYS);
    }

    public static final long AYXKKw(long j) {
        return KWHzl(j, DurationUnit.HOURS);
    }

    public static final long AhwBna(long j) {
        return KWHzl(j, DurationUnit.MINUTES);
    }

    public static final long DbNXlk(long j) {
        return KWHzl(j, DurationUnit.SECONDS);
    }

    public static final long gEmmrt(long j) {
        return (fARcdN(j) && ejfBZ(j)) ? fIwbmz(j) : KWHzl(j, DurationUnit.MILLISECONDS);
    }

    public static final long valueOf(long j) {
        return KWHzl(j, DurationUnit.MICROSECONDS);
    }

    public static final long djBIcL(long j) {
        long jFIwbmz = fIwbmz(j);
        if (fJNWhG(j)) {
            return jFIwbmz;
        }
        if (jFIwbmz > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jFIwbmz < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return C59519zia.DbNXlk(jFIwbmz);
    }

    public java.lang.String toString() {
        return getFieldNames(this.EZpvd);
    }

    public static java.lang.String getFieldNames(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == AEQbTJ) {
            return "Infinity";
        }
        if (j == copydefault) {
            return "-Infinity";
        }
        boolean zUzCIH = uzCIH(j);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (zUzCIH) {
            sb.append('-');
        }
        long jOLrzqt = OLrzqt(j);
        long jAEQbTJ = AEQbTJ(jOLrzqt);
        int iEZpvd = EZpvd(jOLrzqt);
        int iFetchVPNInfo = fetchVPNInfo(jOLrzqt);
        int iAkhnZx = AkhnZx(jOLrzqt);
        int iValues = values(jOLrzqt);
        int i = 0;
        boolean z = jAEQbTJ != 0;
        boolean z2 = iEZpvd != 0;
        boolean z3 = iFetchVPNInfo != 0;
        boolean z4 = (iAkhnZx == 0 && iValues == 0) ? false : true;
        if (z) {
            sb.append(jAEQbTJ);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iEZpvd);
            sb.append('h');
            i++;
        }
        if (z3 || (z4 && (z2 || z))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iFetchVPNInfo);
            sb.append('m');
            i++;
        }
        if (z4) {
            if (i > 0) {
                sb.append(' ');
            }
            if (iAkhnZx != 0 || z || z2 || z3) {
                EZpvd(j, sb, iAkhnZx, iValues, 9, com.ibm.icu.text.DateFormat.SECOND, false);
            } else if (iValues >= 1000000) {
                EZpvd(j, sb, iValues / 1000000, iValues % 1000000, 6, com.ibm.icu.text.DateFormat.MINUTE_SECOND, false);
            } else if (iValues >= 1000) {
                EZpvd(j, sb, iValues / 1000, iValues % 1000, 3, "us", false);
            } else {
                sb.append(iValues);
                sb.append("ns");
            }
            i++;
        }
        if (zUzCIH && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(long j, java.lang.StringBuilder sb, int i, int i2, int i3, java.lang.String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            java.lang.String strCopydefault = StringsKt__StringsKt.copydefault(java.lang.String.valueOf(i2), i3, '0');
            int length = strCopydefault.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i4 = length - 1;
                    if (strCopydefault.charAt(length) != '0') {
                        break;
                    } else if (i4 < 0) {
                        break;
                    } else {
                        length = i4;
                    }
                }
                length = -1;
                int i5 = length + 1;
                if (z && i5 < 3) {
                    sb.append((java.lang.CharSequence) strCopydefault, 0, i5);
                    Intrinsics.checkNotNullExpressionValue(sb, "");
                } else {
                    sb.append((java.lang.CharSequence) strCopydefault, 0, ((length + 3) / 3) * 3);
                    Intrinsics.checkNotNullExpressionValue(sb, "");
                }
            } else {
                length = -1;
                int i52 = length + 1;
                if (z) {
                    sb.append((java.lang.CharSequence) strCopydefault, 0, ((length + 3) / 3) * 3);
                    Intrinsics.checkNotNullExpressionValue(sb, "");
                }
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m9309toStringimpl$default(long j, DurationUnit durationUnit, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return copydefault(j, durationUnit, i);
    }

    public static final java.lang.String copydefault(long j, @NotNull DurationUnit durationUnit, int i) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
        }
        double dEZpvd = EZpvd(j, durationUnit);
        if (java.lang.Double.isInfinite(dEZpvd)) {
            return java.lang.String.valueOf(dEZpvd);
        }
        return C59463zhX.OLrzqt(dEZpvd, C56548yJl.valueOf(i, 12)) + C59464zhY.copydefault(durationUnit);
    }

    public static final java.lang.String iwGUEr(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (uzCIH(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jOLrzqt = OLrzqt(j);
        long jAYXKKw = AYXKKw(jOLrzqt);
        int iFetchVPNInfo = fetchVPNInfo(jOLrzqt);
        int iAkhnZx = AkhnZx(jOLrzqt);
        int iValues = values(jOLrzqt);
        if (hDKMBd(j)) {
            jAYXKKw = 9999999999999L;
        }
        boolean z = true;
        boolean z2 = jAYXKKw != 0;
        boolean z3 = (iAkhnZx == 0 && iValues == 0) ? false : true;
        if (iFetchVPNInfo == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(jAYXKKw);
            sb.append('H');
        }
        if (z) {
            sb.append(iFetchVPNInfo);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            EZpvd(j, sb, iAkhnZx, iValues, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }
}
