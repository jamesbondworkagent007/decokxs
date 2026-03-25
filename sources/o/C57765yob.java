package o;

import com.onesignal.OneSignal;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: o.yob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57765yob {
    public static void OLrzqt(TimerTask timerTask, java.lang.String str, long j) {
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "scheduleTrigger: " + str + " delay: " + j);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("trigger_timer:");
        sb.append(str);
        new Timer(sb.toString()).schedule(timerTask, j);
    }
}
