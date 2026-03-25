package o;

import com.onesignal.OSTrigger;
import com.onesignal.OneSignal;
import java.util.Date;
import java.util.TimerTask;

/* JADX INFO: renamed from: o.ynZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57710ynZ {
    public static Date AEQbTJ = new Date();
    public final java.util.ArrayList<java.lang.String> KWHzl = new java.util.ArrayList<>();
    public final ActionBar OLrzqt;

    /* JADX INFO: renamed from: o.ynZ$ActionBar */
    public interface ActionBar {
        void copydefault();

        void copydefault(java.lang.String str);
    }

    public C57710ynZ(ActionBar actionBar) {
        this.OLrzqt = actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: all -> 0x009d, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000f, B:11:0x0011, B:26:0x005b, B:28:0x0076, B:29:0x007b, B:31:0x007d, B:33:0x0082, B:35:0x0084, B:37:0x008c, B:39:0x008e, B:40:0x009b, B:16:0x0025, B:18:0x002f, B:20:0x0031, B:23:0x003d, B:25:0x005a, B:24:0x004b), top: B:45:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x009d, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000f, B:11:0x0011, B:26:0x005b, B:28:0x0076, B:29:0x007b, B:31:0x007d, B:33:0x0082, B:35:0x0084, B:37:0x008c, B:39:0x008e, B:40:0x009b, B:16:0x0025, B:18:0x002f, B:20:0x0031, B:23:0x003d, B:25:0x005a, B:24:0x004b), top: B:45:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean copydefault(OSTrigger oSTrigger) {
        long time;
        long time2;
        long j;
        long jDoubleValue;
        if (oSTrigger.copydefault == null) {
            return false;
        }
        synchronized (this.KWHzl) {
            if (!(oSTrigger.copydefault instanceof java.lang.Number)) {
                return false;
            }
            int i = AnonymousClass5.OLrzqt[oSTrigger.AEQbTJ.ordinal()];
            if (i == 1) {
                time = new Date().getTime();
                time2 = AEQbTJ.getTime();
            } else {
                if (i != 2) {
                    j = 0;
                } else {
                    if (OneSignal.sSMYrx().valueOf()) {
                        return false;
                    }
                    Date date = OneSignal.sSMYrx().isConnected;
                    if (date == null) {
                        j = 999999;
                    } else {
                        time = new Date().getTime();
                        time2 = date.getTime();
                    }
                }
                final java.lang.String str = oSTrigger.KWHzl;
                jDoubleValue = (long) (((java.lang.Number) oSTrigger.copydefault).doubleValue() * 1000.0d);
                if (!KWHzl(jDoubleValue, j, oSTrigger.OLrzqt)) {
                    this.OLrzqt.copydefault(str);
                    return true;
                }
                long j2 = jDoubleValue - j;
                if (j2 <= 0) {
                    return false;
                }
                if (this.KWHzl.contains(str)) {
                    return false;
                }
                C57765yob.OLrzqt(new TimerTask() { // from class: o.ynZ.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        C57710ynZ.this.KWHzl.remove(str);
                        C57710ynZ.this.OLrzqt.copydefault();
                    }
                }, str, j2);
                this.KWHzl.add(str);
                return false;
            }
            j = time - time2;
            final java.lang.String str2 = oSTrigger.KWHzl;
            jDoubleValue = (long) (((java.lang.Number) oSTrigger.copydefault).doubleValue() * 1000.0d);
            if (!KWHzl(jDoubleValue, j, oSTrigger.OLrzqt)) {
            }
        }
    }

    public static void KWHzl() {
        AEQbTJ = new Date();
    }

    /* JADX INFO: renamed from: o.ynZ$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[OSTrigger.OSTriggerOperator.values().length];
            copydefault = iArr;
            try {
                iArr[OSTrigger.OSTriggerOperator.LESS_THAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                copydefault[OSTrigger.OSTriggerOperator.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                copydefault[OSTrigger.OSTriggerOperator.GREATER_THAN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                copydefault[OSTrigger.OSTriggerOperator.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                copydefault[OSTrigger.OSTriggerOperator.EQUAL_TO.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                copydefault[OSTrigger.OSTriggerOperator.NOT_EQUAL_TO.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[OSTrigger.OSTriggerKind.values().length];
            OLrzqt = iArr2;
            try {
                iArr2[OSTrigger.OSTriggerKind.SESSION_TIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                OLrzqt[OSTrigger.OSTriggerKind.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean KWHzl(double d, double d2, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        switch (AnonymousClass5.copydefault[oSTriggerOperator.ordinal()]) {
            case 1:
                return d2 < d;
            case 2:
                return d2 <= d || KWHzl(d, d2);
            case 3:
                return d2 >= d;
            case 4:
                return d2 >= d || KWHzl(d, d2);
            case 5:
                return KWHzl(d, d2);
            case 6:
                return !KWHzl(d, d2);
            default:
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.ERROR, "Attempted to apply an invalid operator on a time-based in-app-message trigger: " + oSTriggerOperator.toString());
                return false;
        }
    }

    public static boolean KWHzl(double d, double d2) {
        return java.lang.Math.abs(d - d2) < 0.3d;
    }
}
