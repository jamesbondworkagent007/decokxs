package com.bytedance.bdtracker;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.IAppLogInstance;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.log.LogUtils;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k0 {
    public static b q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f201a;
    public final f0 b;
    public p4 c;
    public p4 d;
    public volatile String e;
    public volatile long g;
    public int h;
    public volatile boolean j;
    public long k;
    public int l;
    public String m;
    public volatile String n;
    public final AtomicLong f = new AtomicLong(1000);
    public long i = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f202o = false;
    public volatile boolean p = false;

    public class a implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f203a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ long c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(d dVar, boolean z, long j) {
            this.f203a = dVar;
            this.b = z;
            this.c = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appId", this.f203a.m);
                jSONObject.put(OtcExtraKeys.SESSIONID, k0.this.e);
                boolean z = true;
                jSONObject.put("isBackground", !this.b);
                if (this.c == -1) {
                    z = false;
                }
                jSONObject.put("newLaunch", z);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    public static class b extends s4 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(a aVar) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public k0(f0 f0Var) {
        this.b = f0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean a(f4 f4Var) {
        if (f4Var instanceof p4) {
            return ((p4) f4Var).k();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(f4 f4Var, List<f4> list, d dVar) {
        if (!(f4Var instanceof p4)) {
            if (f4Var instanceof b) {
                return;
            }
            list.add(f4Var);
            return;
        }
        p4 p4Var = (p4) f4Var;
        if (p4Var.k()) {
            this.k = 0L;
            list.add(f4Var);
            if (TextUtils.isEmpty(p4Var.t)) {
                p4 p4Var2 = this.d;
                if ((p4Var2 == null || (p4Var.c - p4Var2.c) - p4Var2.s >= 500) && ((p4Var2 = this.c) == null || (p4Var.c - p4Var2.c) - p4Var2.s >= 500)) {
                    return;
                }
                p4Var.t = p4Var2.u;
                return;
            }
            return;
        }
        Bundle bundleA = a(f4Var.c, 0L);
        if (dVar != null && bundleA != null) {
            dVar.onEventV3("play_session", bundleA, 1);
        }
        this.k = p4Var.c;
        list.add(f4Var);
        if (!p4Var.D) {
            this.c = p4Var;
        } else {
            this.d = p4Var;
            this.c = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean a() {
        return this.j && this.k == 0;
    }

    public void a(IAppLogInstance iAppLogInstance, f4 f4Var) {
        JSONObject jSONObject;
        if (f4Var != null) {
            x1 x1Var = this.b.i;
            f4Var.m = iAppLogInstance.getAppId();
            f4Var.f = this.f201a;
            f4Var.g = x1Var.l();
            f4Var.h = x1Var.m();
            f4Var.i = x1Var.j();
            f4Var.e = this.e;
            f4Var.d = this.f.incrementAndGet();
            String strA = f4Var.j;
            String strB = x1Var.b();
            if (TextUtils.isEmpty(strA)) {
                strA = strB;
            } else if (!TextUtils.isEmpty(strB)) {
                Set<String> setC = x1Var.c(strB);
                setC.addAll(x1Var.c(strA));
                strA = x1Var.a(setC);
            }
            f4Var.j = strA;
            f4Var.k = i5.b(this.b.b(), true).f193a;
            if ((f4Var instanceof m4) && this.i > 0 && r.a(((m4) f4Var).u, "$crash") && (jSONObject = f4Var.f175o) != null) {
                try {
                    jSONObject.put("$session_duration", System.currentTimeMillis() - this.i);
                } catch (Throwable unused) {
                }
            }
            this.b.d.D.debug("[event_process][fill] fillSessionParams data: {}", f4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bundle a(long j, long j2) {
        Bundle bundle;
        synchronized (this) {
            long j3 = this.g;
            if (this.b.e.c.isPlayEnable() && a() && j3 > 0) {
                long j4 = j - j3;
                if (j4 > j2) {
                    bundle = new Bundle();
                    bundle.putInt("session_no", this.l);
                    int i = this.h + 1;
                    this.h = i;
                    bundle.putInt("send_times", i);
                    bundle.putLong("current_duration", j4 / 1000);
                    bundle.putString("session_start_time", f4.b(this.i));
                    this.g = j;
                }
            } else {
                bundle = null;
            }
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r11.i > (r13.c + 7200000)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(d dVar, f4 f4Var, List<f4> list) {
        if (this.b.e.j()) {
            boolean z = false;
            boolean zK = f4Var instanceof p4 ? ((p4) f4Var).k() : false;
            if (this.i == -1) {
                a(dVar, f4Var, list, zK);
                z = true;
            } else if (this.j || !zK) {
                long j = this.k;
                if (j != 0 && f4Var.c > this.b.e.f.getLong("session_interval", 30000L) + j) {
                    this.f202o = true;
                }
                a(dVar, f4Var, list, zK);
                z = true;
            } else {
                a(dVar, f4Var, list, true);
                z = true;
            }
            a(dVar, f4Var);
            this.p = z;
        }
    }

    public n4 a(d dVar, f4 f4Var, List<f4> list, boolean z) {
        n4 n4Var;
        synchronized (this) {
            long j = f4Var instanceof b ? -1L : f4Var.c;
            this.e = UUID.randomUUID().toString();
            if (!LogUtils.isDisabled()) {
                LogUtils.sendJsonFetcher("session_start", new a(dVar, z, j));
            }
            if (z && !this.b.v && TextUtils.isEmpty(this.n)) {
                this.n = this.e;
            }
            this.f.set(1000L);
            this.i = j;
            this.j = z;
            this.k = 0L;
            this.g = 0L;
            if (z) {
                Calendar calendar = Calendar.getInstance();
                StringBuilder sbA = com.bytedance.bdtracker.a.a("");
                sbA.append(calendar.get(1));
                sbA.append(calendar.get(2));
                sbA.append(calendar.get(5));
                String string = sbA.toString();
                v1 v1Var = this.b.e;
                if (TextUtils.isEmpty(this.m)) {
                    this.m = v1Var.e.getString("session_last_day", "");
                    this.l = v1Var.e.getInt("session_order", 0);
                }
                if (string.equals(this.m)) {
                    this.l++;
                } else {
                    this.m = string;
                    this.l = 1;
                }
                v1Var.e.putString("session_last_day", string).putInt("session_order", this.l);
                this.h = 0;
                this.g = f4Var.c;
            }
            if (j != -1) {
                n4Var = new n4();
                n4Var.m = f4Var.m;
                n4Var.e = this.e;
                n4Var.u = !this.j;
                n4Var.d = this.f.incrementAndGet();
                n4Var.a(this.i);
                n4Var.t = this.b.i.o();
                n4Var.s = this.b.i.n();
                n4Var.f = this.f201a;
                n4Var.g = this.b.i.l();
                n4Var.h = this.b.i.m();
                n4Var.i = dVar.getSsid();
                n4Var.j = dVar.getAbSdkVersion();
                int i = z ? this.b.e.f.getInt("is_first_time_launch", 1) : 0;
                n4Var.w = i;
                if (z && i == 1) {
                    this.b.e.f.putInt("is_first_time_launch", 0);
                }
                p4 p4VarA = t.a();
                if (p4VarA != null) {
                    n4Var.y = p4VarA.u;
                    n4Var.x = p4VarA.v;
                }
                if ((f4Var instanceof p4) && p4VarA == null) {
                    p4 p4Var = (p4) f4Var;
                    n4Var.y = p4Var.u;
                    n4Var.x = p4Var.v;
                }
                if (this.j && this.f202o) {
                    n4Var.z = this.f202o;
                    this.f202o = false;
                }
                this.b.d.D.debug("[event_process][fill] fillSessionParams launch: {}", n4Var);
                list.add(n4Var);
            } else {
                n4Var = null;
            }
            d dVar2 = this.b.d;
            if (dVar2.l <= 0) {
                dVar2.l = 6;
            }
            dVar.D.debug("Start new session:{} with background:{}", this.e, Boolean.valueOf(!this.j));
        }
        return n4Var;
    }
}
