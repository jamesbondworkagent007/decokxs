package o;

import androidx.compose.material3.CalendarModelKt;
import com.engagelab.privates.push.constants.MTPushConstants;

/* JADX INFO: renamed from: o.adA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7080adA {
    public static final C7080adA AEQbTJ;
    public static final C7080adA[] AYXKKw;
    public static final long[] AhwBna;
    public static final C7080adA EZpvd;
    public static final C7080adA KWHzl;
    public static final C7080adA OLrzqt;
    public static final C7080adA copydefault;
    public static final C7080adA djBIcL;
    public static final C7080adA gEmmrt;
    public static final C7080adA valueOf;
    public final java.lang.String DbNXlk;
    public final byte isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.DbNXlk;
    }

    public C7080adA(java.lang.String str, int i) {
        this.DbNXlk = str;
        this.isConnected = (byte) i;
    }

    static {
        C7080adA c7080adA = new C7080adA("year", 0);
        valueOf = c7080adA;
        C7080adA c7080adA2 = new C7080adA("month", 1);
        OLrzqt = c7080adA2;
        C7080adA c7080adA3 = new C7080adA("week", 2);
        djBIcL = c7080adA3;
        C7080adA c7080adA4 = new C7080adA(MTPushConstants.NotificationTime.KEY_DAYS, 3);
        copydefault = c7080adA4;
        C7080adA c7080adA5 = new C7080adA("hour", 4);
        EZpvd = c7080adA5;
        C7080adA c7080adA6 = new C7080adA("minute", 5);
        KWHzl = c7080adA6;
        C7080adA c7080adA7 = new C7080adA("second", 6);
        gEmmrt = c7080adA7;
        C7080adA c7080adA8 = new C7080adA("millisecond", 7);
        AEQbTJ = c7080adA8;
        AYXKKw = new C7080adA[]{c7080adA, c7080adA2, c7080adA3, c7080adA4, c7080adA5, c7080adA6, c7080adA7, c7080adA8};
        AhwBna = new long[]{31557600000L, 2630880000L, 604800000, CalendarModelKt.MillisecondsIn24Hours, 3600000, 60000, 1000, 1};
    }
}
