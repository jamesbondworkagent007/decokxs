package o;

import android.app.Application;
import android.os.Handler;
import com.tencent.matrix.trace.constants.Constants;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.util.DeviceUtil;
import java.util.LinkedList;
import o.C58007ytE;
import o.C58045ytq;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ytD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58006ytD extends AbstractC58010ytH implements InterfaceC58048ytt, C58045ytq.TaskDescription, Application.ActivityLifecycleCallbacks {
    public long AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public java.util.Set<java.lang.String> AkhnZx;
    public int EZpvd;
    public final C58043yto KWHzl;
    public long fetchVPNInfo;
    public boolean valueOf;
    public boolean values;
    public long djBIcL = 0;
    public long copydefault = 0;
    public long isConnected = 0;
    public java.util.HashMap<java.lang.String, java.lang.Long> OLrzqt = new java.util.HashMap<>();
    public boolean gEmmrt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault == 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }

    public C58006ytD(C58043yto c58043yto) {
        this.KWHzl = c58043yto;
        this.AYXKKw = c58043yto.fARcdN();
        this.AkhnZx = c58043yto.valueOf();
        this.AEQbTJ = c58043yto.KWHzl();
        this.fetchVPNInfo = c58043yto.AYXKKw();
        this.AhwBna = c58043yto.fJNWhG();
        C58045ytq.KWHzl(this);
    }

    @Override // o.AbstractC58010ytH
    public void EZpvd() {
        super.EZpvd();
        C58013ytK.EZpvd("Matrix.StartupTracer", "[onAlive] isStartupEnable:%s", java.lang.Boolean.valueOf(this.AYXKKw));
        if (this.AYXKKw) {
            AppMethodBeat.getInstance().addListener(this);
            C57911yrO.EZpvd().KWHzl().registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // o.C58045ytq.TaskDescription
    public void bM_() {
        if (this.AhwBna) {
            return;
        }
        long jCopydefault = C58045ytq.copydefault();
        C58013ytK.EZpvd("Matrix.StartupTracer", "onApplicationCreateEnd, applicationCost:%d", java.lang.Long.valueOf(jCopydefault));
        EZpvd(jCopydefault, 0L, jCopydefault, false);
    }

    @Override // o.InterfaceC58048ytt
    public void copydefault(android.app.Activity activity) {
        long jCopydefault;
        if (C58045ytq.KWHzl == Integer.MIN_VALUE) {
            return;
        }
        java.lang.String name = activity.getClass().getName();
        if (OLrzqt()) {
            boolean zKWHzl = C58045ytq.KWHzl();
            java.util.Set<java.lang.String> set = this.AkhnZx;
            C58013ytK.EZpvd("Matrix.StartupTracer", "#ColdStartup# activity:%s, splashActivities:%s, empty:%b, isCreatedByLaunchActivity:%b, hasShowSplashActivity:%b, firstScreenCost:%d, now:%d, application_create_begin_time:%d, app_cost:%d", name, set, java.lang.Boolean.valueOf(set.isEmpty()), java.lang.Boolean.valueOf(zKWHzl), java.lang.Boolean.valueOf(this.valueOf), java.lang.Long.valueOf(this.djBIcL), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()), java.lang.Long.valueOf(C58045ytq.OLrzqt()), java.lang.Long.valueOf(C58045ytq.copydefault()));
            java.lang.String str = name + "@" + activity.hashCode();
            java.lang.Long l = this.OLrzqt.get(str);
            if (l == null) {
                l = 0L;
            }
            this.OLrzqt.put(str, java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - l.longValue()));
            if (this.djBIcL == 0) {
                this.djBIcL = android.os.SystemClock.uptimeMillis() - C58045ytq.OLrzqt();
            }
            if (this.valueOf) {
                this.copydefault = android.os.SystemClock.uptimeMillis() - C58045ytq.OLrzqt();
            } else if (this.AkhnZx.contains(name)) {
                this.valueOf = true;
            } else if (this.AkhnZx.isEmpty()) {
                if (zKWHzl) {
                    this.copydefault = this.djBIcL;
                } else {
                    this.djBIcL = 0L;
                    jCopydefault = C58045ytq.copydefault();
                    this.copydefault = jCopydefault;
                }
            } else if (zKWHzl) {
                jCopydefault = this.djBIcL;
                this.copydefault = jCopydefault;
            } else {
                this.djBIcL = 0L;
                this.copydefault = C58045ytq.copydefault();
            }
            if (this.copydefault > 0) {
                java.lang.Long l2 = this.OLrzqt.get(str);
                if (l2 != null && l2.longValue() >= 30000) {
                    C58013ytK.OLrzqt("Matrix.StartupTracer", "%s cost too much time[%s] between activity create and onActivityFocused, just throw it.(createTime:%s) ", str, java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - l.longValue()), l);
                    return;
                } else {
                    EZpvd(C58045ytq.copydefault(), this.djBIcL, this.copydefault, false);
                    return;
                }
            }
            return;
        }
        if (AEQbTJ()) {
            this.values = false;
            long jUptimeMillis = android.os.SystemClock.uptimeMillis() - this.isConnected;
            C58013ytK.EZpvd("Matrix.StartupTracer", "#WarmStartup# activity:%s, warmCost:%d, now:%d, lastCreateActivity:%d", name, java.lang.Long.valueOf(jUptimeMillis), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()), java.lang.Long.valueOf(this.isConnected));
            if (jUptimeMillis > 0) {
                EZpvd(0L, 0L, jUptimeMillis, true);
            }
        }
    }

    public final void EZpvd(long j, long j2, long j3, boolean z) {
        C58013ytK.EZpvd("Matrix.StartupTracer", "[report] applicationCost:%s firstScreenCost:%s allCost:%s isWarmStartUp:%s, createScene:%d", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3), java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(C58045ytq.KWHzl));
        long[] jArrCopyData = new long[0];
        if (!z && j3 >= this.AEQbTJ) {
            jArrCopyData = AppMethodBeat.getInstance().copyData(C58045ytq.copydefault);
            C58045ytq.copydefault.OLrzqt();
        } else if (z && j3 >= this.fetchVPNInfo) {
            jArrCopyData = AppMethodBeat.getInstance().copyData(C58045ytq.djBIcL);
            C58045ytq.djBIcL.OLrzqt();
        }
        C58011ytI.AEQbTJ().post(new Application(jArrCopyData, j, j2, j3, z, C58045ytq.KWHzl));
    }

    /* JADX INFO: renamed from: o.ytD$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public class Application implements java.lang.Runnable {
        public boolean AEQbTJ;
        public long EZpvd;
        public long KWHzl;
        public long[] OLrzqt;
        public long copydefault;
        public int gEmmrt;

        public Application(long[] jArr, long j, long j2, long j3, boolean z, int i) {
            this.OLrzqt = jArr;
            this.gEmmrt = i;
            this.KWHzl = j;
            this.EZpvd = j2;
            this.copydefault = j3;
            this.AEQbTJ = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinkedList linkedList = new LinkedList();
            long[] jArr = this.OLrzqt;
            if (jArr.length > 0) {
                C58007ytE.AEQbTJ(jArr, linkedList, false, -1L);
                C58007ytE.KWHzl(linkedList, 30, new C58007ytE.Application() { // from class: o.ytD.Application.4
                    @Override // o.C58007ytE.Application
                    public int EZpvd() {
                        return 60;
                    }

                    @Override // o.C58007ytE.Application
                    public boolean KWHzl(long j, int i) {
                        return j < ((long) (i * 5));
                    }

                    @Override // o.C58007ytE.Application
                    public void EZpvd(java.util.List<C58047yts> list, int i) {
                        C58013ytK.AEQbTJ("Matrix.StartupTracer", "[fallback] size:%s targetSize:%s stack:%s", java.lang.Integer.valueOf(i), 30, list);
                        java.util.ListIterator<C58047yts> listIterator = list.listIterator(java.lang.Math.min(i, 30));
                        while (listIterator.hasNext()) {
                            listIterator.next();
                            listIterator.remove();
                        }
                    }
                });
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            long jMax = java.lang.Math.max(this.copydefault, C58007ytE.AEQbTJ(linkedList, sb, sb2));
            java.lang.String strCopydefault = C58007ytE.copydefault(linkedList, jMax);
            if ((this.copydefault > C58006ytD.this.AEQbTJ && !this.AEQbTJ) || (this.copydefault > C58006ytD.this.fetchVPNInfo && this.AEQbTJ)) {
                C58013ytK.AEQbTJ("Matrix.StartupTracer", "stackKey:%s \n%s", strCopydefault, sb2.toString());
            }
            EZpvd(this.KWHzl, this.EZpvd, sb, strCopydefault, jMax, this.AEQbTJ, this.gEmmrt);
        }

        public final void EZpvd(long j, long j2, java.lang.StringBuilder sb, java.lang.String str, long j3, boolean z, int i) {
            C58041ytm c58041ytm = (C58041ytm) C57911yrO.EZpvd().copydefault(C58041ytm.class);
            if (c58041ytm == null) {
                return;
            }
            try {
                JSONObject jSONObjectAEQbTJ = DeviceUtil.AEQbTJ(new JSONObject(), C57911yrO.EZpvd().KWHzl());
                jSONObjectAEQbTJ.put("application_create", j);
                jSONObjectAEQbTJ.put("application_create_scene", i);
                jSONObjectAEQbTJ.put("first_activity_create", j2);
                jSONObjectAEQbTJ.put("startup_duration", j3);
                jSONObjectAEQbTJ.put("is_warm_start_up", z);
                C58038ytj c58038ytj = new C58038ytj();
                c58038ytj.AEQbTJ("Trace_StartUp");
                c58038ytj.KWHzl(jSONObjectAEQbTJ);
                c58041ytm.OLrzqt(c58038ytj);
            } catch (JSONException e) {
                C58013ytK.OLrzqt("Matrix.StartupTracer", "[JSONException for StartUpReportTask error: %s", e);
            }
            if ((j3 <= C58006ytD.this.AEQbTJ || z) && (j3 <= C58006ytD.this.fetchVPNInfo || !z)) {
                return;
            }
            try {
                JSONObject jSONObjectAEQbTJ2 = DeviceUtil.AEQbTJ(new JSONObject(), C57911yrO.EZpvd().KWHzl());
                jSONObjectAEQbTJ2.put("detail", Constants.Type.STARTUP);
                jSONObjectAEQbTJ2.put("cost", j3);
                jSONObjectAEQbTJ2.put("stack", sb.toString());
                jSONObjectAEQbTJ2.put("stackKey", str);
                jSONObjectAEQbTJ2.put("subType", z ? 2 : 1);
                C58038ytj c58038ytj2 = new C58038ytj();
                c58038ytj2.AEQbTJ("Trace_EvilMethod");
                c58038ytj2.KWHzl(jSONObjectAEQbTJ2);
                c58041ytm.OLrzqt(c58038ytj2);
            } catch (JSONException e2) {
                C58013ytK.OLrzqt("Matrix.StartupTracer", "[JSONException error: %s", e2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        C58013ytK.EZpvd("Matrix.StartupTracer", "activeActivityCount:%d, coldCost:%d", java.lang.Integer.valueOf(this.EZpvd), java.lang.Long.valueOf(this.copydefault));
        if (this.EZpvd == 0 && this.copydefault > 0) {
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            this.isConnected = jUptimeMillis;
            C58013ytK.EZpvd("Matrix.StartupTracer", "lastCreateActivity:%d, activity:%s", java.lang.Long.valueOf(jUptimeMillis), activity.getClass().getName());
            this.values = true;
        }
        this.EZpvd++;
        if (this.gEmmrt) {
            this.OLrzqt.put(activity.getClass().getName() + "@" + activity.hashCode(), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        C58013ytK.EZpvd("Matrix.StartupTracer", "activeActivityCount:%d", java.lang.Integer.valueOf(this.EZpvd));
        this.EZpvd--;
    }

    @Override // o.AbstractC58010ytH, o.InterfaceC58036yth
    public void copydefault(boolean z) {
        super.copydefault(z);
        if (z) {
            return;
        }
        copydefault();
    }

    public static void copydefault() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(cls);
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mH");
            declaredField2.setAccessible(true);
            java.lang.Object obj2 = declaredField2.get(obj);
            java.lang.reflect.Field declaredField3 = obj2.getClass().getSuperclass().getDeclaredField("mCallback");
            declaredField3.setAccessible(true);
            C58013ytK.EZpvd("Matrix.StartupTracer", "callback %s", (Handler.Callback) declaredField3.get(obj2));
        } catch (java.lang.Exception unused) {
        }
    }
}
