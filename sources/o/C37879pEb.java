package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.pEb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37879pEb {
    public static final TimeZone AEQbTJ;
    public static final TimeZone EZpvd;
    public static final C37879pEb KWHzl = new C37879pEb();
    public static final int OLrzqt;

    private C37879pEb() {
    }

    static {
        TimeZone timeZoneOLrzqt = yCN.OLrzqt("GMT+8");
        Intrinsics.checkNotNullExpressionValue(timeZoneOLrzqt, "");
        EZpvd = timeZoneOLrzqt;
        TimeZone timeZoneOLrzqt2 = yCN.OLrzqt("UTC");
        Intrinsics.checkNotNullExpressionValue(timeZoneOLrzqt2, "");
        AEQbTJ = timeZoneOLrzqt2;
        OLrzqt = 8;
    }

    public final long AEQbTJ(int i, long j) {
        long jKWHzl = (KWHzl(i, j) - java.lang.System.currentTimeMillis()) / ((long) 1000);
        if (jKWHzl < 0) {
            return 0L;
        }
        return jKWHzl;
    }

    public final long KWHzl(int i, long j) {
        int iEZpvd = EZpvd(i);
        if (iEZpvd <= 0) {
            return j + (((long) (i * 60)) * 1000);
        }
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = C36246oUr.copydefault().zLjUOn();
        Calendar calendar = Calendar.getInstance((chartViewOutSideConfigZLjUOn == null || chartViewOutSideConfigZLjUOn.isUtc8()) ? EZpvd : AEQbTJ);
        calendar.setTimeInMillis(j);
        calendar.add(2, iEZpvd);
        return calendar.getTimeInMillis();
    }

    public final int EZpvd(int i) {
        if (i > 0 && i % 44640 == 0) {
            return i / 44640;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[PHI: r1 r17
  0x009c: PHI (r1v9 long) = (r1v6 long), (r1v7 long), (r1v37 long), (r1v37 long) binds: [B:37:0x0083, B:45:0x009b, B:11:0x0038, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r17v5 long) = (r17v2 long), (r17v3 long), (r17v7 long), (r17v7 long) binds: [B:37:0x0083, B:45:0x009b, B:11:0x0038, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        long j6 = RemoteMessageConst.DEFAULT_TTL;
        long j7 = IMarketApiService.SIXTY_MINUTES;
        long j8 = j % j7;
        if (j >= 86400) {
            j2 = j / j6;
            if (j % j6 > 0) {
                long j9 = 60;
                long j10 = j - (((((long) 24) * j2) * j9) * j9);
                if (j10 < 3600 || j10 >= 86400) {
                    if (j10 < 3600) {
                        j3 = j10 / j9;
                        j8 = j10 % j9;
                        if (j8 > 0) {
                            j4 = 0;
                        } else {
                            j4 = 0;
                            j8 = 0;
                        }
                    }
                    j4 = 0;
                    j3 = 0;
                    j8 = 0;
                } else {
                    j4 = j10 / j7;
                    if (j8 <= 0) {
                        j3 = 0;
                        j8 = 0;
                    } else if (j8 >= 60) {
                        j3 = j8 / j9;
                        j8 %= j9;
                        if (j8 <= 0) {
                            j8 = 0;
                        }
                    } else if (j8 < 60) {
                        j3 = 0;
                    }
                }
                j5 = j2;
            } else {
                j4 = 0;
                j3 = 0;
                j8 = 0;
                j5 = j2;
            }
        } else if (j >= 3600 && j < 86400) {
            j4 = j / j7;
            if (j8 > 0) {
                if (j8 >= 60) {
                    long j11 = 60;
                    long j12 = j8 / j11;
                    j8 %= j11;
                    if (j8 > 0) {
                        j3 = j12;
                        j5 = 0;
                    } else {
                        j3 = j12;
                        j8 = 0;
                        j5 = 0;
                    }
                } else if (j8 < 60) {
                    j3 = 0;
                    j5 = 0;
                }
            }
            j2 = 0;
            j3 = 0;
            j8 = 0;
            j5 = j2;
        } else if (j < 3600) {
            long j13 = 60;
            j3 = j / j13;
            j8 = j % j13;
            if (j8 > 0) {
                j4 = 0;
                j5 = 0;
            } else {
                j2 = 0;
                j4 = 0;
                j8 = 0;
                j5 = j2;
            }
        } else {
            j2 = 0;
            j4 = 0;
            j3 = 0;
            j8 = 0;
            j5 = j2;
        }
        if (j5 > 0) {
            sb.append(j5);
            sb.append("d ");
            sb.append(j4);
            sb.append("h");
        } else if (j4 > 0) {
            if (j4 > 9) {
                sb.append(j4);
                sb.append(":");
            } else {
                sb.append("0" + j4 + ":");
            }
            if (j3 > 9) {
                sb.append(j3);
                sb.append(":");
            } else {
                sb.append("0" + j3 + ":");
            }
            if (j8 > 9) {
                sb.append(j8);
            } else {
                sb.append("0" + j8);
            }
        } else {
            if (j3 > 9) {
                sb.append(j3);
                sb.append(":");
            } else {
                sb.append("0" + j3 + ":");
            }
            if (j8 > 9) {
                sb.append(j8);
            } else {
                sb.append("0" + j8);
            }
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
