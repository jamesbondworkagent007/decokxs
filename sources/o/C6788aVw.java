package o;

import androidx.work.WorkRequest;
import com.okinc.base.thread.TPM;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.aVw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6788aVw {
    public static final C6788aVw AEQbTJ = new C6788aVw();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.aVz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C6788aVw.valueOf());
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.aVD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C6788aVw.AYXKKw());
        }
    });
    public static final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aVC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C6788aVw.AhwBna());
        }
    });
    public static final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.aVF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C6788aVw.djBIcL());
        }
    });
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.aVE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6788aVw.gEmmrt();
        }
    });
    public static final int EZpvd = 8;

    private C6788aVw() {
    }

    public static final int valueOf() {
        return java.lang.Runtime.getRuntime().availableProcessors();
    }

    public final int DbNXlk() {
        return ((java.lang.Number) KWHzl.getValue()).intValue();
    }

    public static final int AYXKKw() {
        return java.lang.Math.min(12, AEQbTJ.DbNXlk() + 1);
    }

    public final int values() {
        return ((java.lang.Number) copydefault.getValue()).intValue();
    }

    public static final int AhwBna() {
        return java.lang.Math.min(8, java.lang.Math.max(4, AEQbTJ.DbNXlk()));
    }

    public final int AkhnZx() {
        return ((java.lang.Number) gEmmrt.getValue()).intValue();
    }

    public static final int djBIcL() {
        return java.lang.Math.min(16, java.lang.Math.max(8, AEQbTJ.DbNXlk() * 2));
    }

    public final int isConnected() {
        return ((java.lang.Number) AhwBna.getValue()).intValue();
    }

    public final TPM.TaskDescription fetchVPNInfo() {
        return (TPM.TaskDescription) OLrzqt.getValue();
    }

    public static final TPM.TaskDescription gEmmrt() {
        C6788aVw c6788aVw = AEQbTJ;
        return new TPM.TaskDescription(0, 0, c6788aVw.values(), 0L, java.lang.Math.max(1, c6788aVw.values() / 2), c6788aVw.values(), 0L, java.lang.Math.max(1, c6788aVw.values() / 3), c6788aVw.values(), 0L, c6788aVw.AkhnZx(), c6788aVw.isConnected(), 0L, c6788aVw.AkhnZx(), c6788aVw.isConnected(), 0L, java.lang.Math.max(1, c6788aVw.AkhnZx() / 2), c6788aVw.isConnected(), 0L, java.lang.Math.max(1, 1), 0L, java.lang.Math.max(1, 0), 0L, 0, 0L, 0L, 0L, false, null, 534024779, null);
    }

    public final TPM.TaskDescription OLrzqt(@NotNull java.lang.String str) {
        TPM.TaskDescription taskDescriptionOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String string = SPUtils.getString(str, "");
            Intrinsics.copydefault((java.lang.Object) string);
            if (string.length() == 0) {
                taskDescriptionOLrzqt = fetchVPNInfo();
            } else {
                taskDescriptionOLrzqt = OLrzqt(new JSONObject(string));
            }
            return taskDescriptionOLrzqt;
        } catch (java.lang.Exception e) {
            pUU.copydefault("Monitor.TPM", "Failed: " + e.getMessage() + ", using default");
            return fetchVPNInfo();
        }
    }

    public final TPM.TaskDescription OLrzqt(@NotNull JSONObject jSONObject) {
        JSONObject jSONObject2;
        int i;
        TPM.Activity activity;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        try {
            int iOptInt = jSONObject.optInt("maxQueueSize", 200);
            boolean zOptBoolean = jSONObject.optBoolean("enableThreadMonitor", false);
            long jOptLong = jSONObject.optLong("taskTimeoutMillis", WorkRequest.MIN_BACKOFF_MILLIS);
            long jOptLong2 = jSONObject.optLong("submitThrottleMillis", WorkRequest.MIN_BACKOFF_MILLIS);
            JSONObject jSONObject3 = jSONObject.getJSONObject("cpu");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("high");
            JSONObject jSONObject5 = jSONObject3.getJSONObject("normal");
            JSONObject jSONObject6 = jSONObject3.getJSONObject("low");
            JSONObject jSONObject7 = jSONObject.getJSONObject("io");
            JSONObject jSONObject8 = jSONObject7.getJSONObject("high");
            JSONObject jSONObject9 = jSONObject7.getJSONObject("normal");
            JSONObject jSONObject10 = jSONObject7.getJSONObject("low");
            JSONObject jSONObject11 = jSONObject.getJSONObject("schedule");
            JSONObject jSONObject12 = jSONObject11.getJSONObject("high");
            JSONObject jSONObject13 = jSONObject11.getJSONObject("normal");
            JSONObject jSONObject14 = jSONObject11.getJSONObject("low");
            if (jSONObject.has("lowEndDevice")) {
                JSONObject jSONObject15 = jSONObject.getJSONObject("lowEndDevice");
                i = iOptInt;
                jSONObject2 = jSONObject14;
                activity = new TPM.Activity(jSONObject15.optInt("keepAliveTime", 10), jSONObject15.optInt("threadPoolSize", 8), jSONObject15.optInt("maxThreadPoolSize", 16));
            } else {
                jSONObject2 = jSONObject14;
                i = iOptInt;
                activity = null;
            }
            int i2 = jSONObject4.getInt("coreSize");
            int i3 = jSONObject4.getInt("maxSize");
            long j = jSONObject4.getLong("keepAliveTime");
            int i4 = jSONObject5.getInt("coreSize");
            int i5 = jSONObject5.getInt("maxSize");
            long j2 = jSONObject5.getLong("keepAliveTime");
            int i6 = jSONObject6.getInt("coreSize");
            int i7 = jSONObject6.getInt("maxSize");
            long j3 = jSONObject6.getLong("keepAliveTime");
            int i8 = jSONObject8.getInt("coreSize");
            int i9 = jSONObject8.getInt("maxSize");
            long j4 = jSONObject8.getLong("keepAliveTime");
            int i10 = jSONObject9.getInt("coreSize");
            int i11 = jSONObject9.getInt("maxSize");
            long j5 = jSONObject9.getLong("keepAliveTime");
            int i12 = jSONObject10.getInt("coreSize");
            int i13 = jSONObject10.getInt("maxSize");
            long j6 = jSONObject10.getLong("keepAliveTime");
            int i14 = jSONObject12.getInt("coreSize");
            long j7 = jSONObject12.getLong("keepAliveTime");
            int i15 = jSONObject13.getInt("coreSize");
            long j8 = jSONObject13.getLong("keepAliveTime");
            JSONObject jSONObject16 = jSONObject2;
            return new TPM.TaskDescription(i, i2, i3, j, i4, i5, j2, i6, i7, j3, i8, i9, j4, i10, i11, j5, i12, i13, j6, i14, j7, i15, j8, jSONObject16.getInt("coreSize"), jSONObject16.getLong("keepAliveTime"), jOptLong, jOptLong2, zOptBoolean, activity);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("Monitor.TPM", "Failed to parse TPM config", e);
            return fetchVPNInfo();
        }
    }
}
