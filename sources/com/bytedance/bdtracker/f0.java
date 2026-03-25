package com.bytedance.bdtracker;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.applog.IHeaderCustomTimelyCallback;
import com.bytedance.applog.IPullAbTestConfigCallback;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.UriConfig;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.bytedance.applog.collector.Collector;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.log.LogUtils;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.applog.network.RangersHttpTimeoutException;
import com.bytedance.applog.store.kv.IKVStore;
import com.bytedance.applog.util.UriConstants;
import com.bytedance.bdtracker.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f0 implements Handler.Callback, Comparator<f4> {
    public final v3 A;
    public final j B;
    public final o1 C;
    public long D;
    public final s3 G;
    public c0 b;
    public boolean c;
    public final com.bytedance.bdtracker.d d;
    public final v1 e;
    public e0 f;
    public volatile l4 h;
    public final x1 i;
    public volatile Handler j;
    public i0 k;
    public j0 l;
    public volatile b0 m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public UriConfig f168o;
    public final Handler p;
    public m2 q;
    public volatile boolean r;
    public d0 s;
    public volatile h0 t;
    public volatile boolean v;
    public volatile long w;
    public volatile f1 y;
    public volatile InitConfig.IpcDataChecker z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f167a = WorkRequest.MIN_BACKOFF_MILLIS;
    public final ArrayList<f4> g = new ArrayList<>(32);
    public final CopyOnWriteArrayList<d0> u = new CopyOnWriteArrayList<>();
    public final List<d> x = new ArrayList();
    public volatile boolean E = false;
    public final k0 n = new k0(this);
    public final g0 F = new g0(this);

    public class a implements EventBus.DataFetcher {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appId", f0.this.d.m);
                jSONObject.put("isMainProcess", f0.this.e.j());
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    public class b implements g {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void a(Map<String, String> map) {
            if (f0.this.i.f() == null || f0.this.i.f().opt("oaid") != null || map == null) {
                return;
            }
            f0.this.j.obtainMessage(17, map).sendToTarget();
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f171a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public c(List list) {
            this.f171a = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            j0 j0Var = f0.this.l;
            List list = this.f171a;
            if (list == null || list.size() <= 0) {
                return;
            }
            o4 o4Var = new o4();
            f0 f0Var = f0.this;
            j0 j0Var2 = f0Var.l;
            JSONObject jSONObjectB = r.b(f0Var.i.f());
            IHeaderCustomTimelyCallback headerCustomCallback = j0Var2.f.getHeaderCustomCallback();
            if (headerCustomCallback != null) {
                headerCustomCallback.updateHeader(jSONObjectB);
            }
            o4Var.y = jSONObjectB;
            o4Var.m = f0.this.d.m;
            ArrayList arrayList = new ArrayList();
            for (f4 f4Var : this.f171a) {
                if (f4Var instanceof m4) {
                    arrayList.add((m4) f4Var);
                }
            }
            o4Var.s = arrayList;
            o4Var.m();
            o4Var.n();
            o4Var.z = o4Var.o();
            if (j0Var == null || !j0Var.a(o4Var)) {
                f0.this.D = System.currentTimeMillis();
                f0.this.p.obtainMessage(8, this.f171a).sendToTarget();
            } else {
                f0 f0Var2 = f0.this;
                f0Var2.D = 0L;
                l4 l4VarC = f0Var2.c();
                l4VarC.c.a(this.f171a);
            }
        }
    }

    public static abstract class d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f172a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public d(T t) {
            this.f172a = t;
        }
    }

    public class e extends d<String> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public e(String str) {
            super(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f0(com.bytedance.bdtracker.d dVar, v1 v1Var, x1 x1Var, o1 o1Var) {
        this.d = dVar;
        this.e = v1Var;
        this.i = x1Var;
        this.C = o1Var;
        StringBuilder sbA = com.bytedance.bdtracker.a.a("bd_tracker_w:");
        sbA.append(dVar.m);
        HandlerThread handlerThread = new HandlerThread(sbA.toString());
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.p = handler;
        j jVar = new j(this);
        this.B = jVar;
        if (v1Var.c.isDeferredALinkEnabled()) {
            dVar.addDataObserver(jVar);
        }
        x1Var.h.b.a(handler);
        if (x1Var.c.c.isMigrateEnabled()) {
            Context context = x1Var.b;
            try {
                try {
                    if (l2.a(context).c) {
                        v1 v1Var2 = x1Var.c;
                        if (v1Var2 != null) {
                            v1Var2.f.remove("google_aid");
                        }
                        IKVStore iKVStore = x1Var.g;
                        String strB = x1Var.h.b();
                        if (iKVStore != null) {
                            iKVStore.putString("old_did", strB);
                            iKVStore.putBoolean("is_migrate", true);
                        }
                        x1Var.h.a("openudid");
                        x1Var.h.a("clientudid");
                        x1Var.h.a("serial_number");
                        x1Var.h.a("sim_serial_number");
                        x1Var.h.a("udid");
                        x1Var.h.a("udid_list");
                        x1Var.h.a("device_id");
                        x1Var.b("clearMigrationInfo");
                    }
                } catch (Exception e2) {
                    LoggerImpl.global().debug("detect migrate is error, ", e2);
                }
            } finally {
                try {
                    l2.a(context).a();
                } catch (Throwable unused) {
                }
            }
        }
        this.A = new v3(this);
        if (this.e.c.isClearDidAndIid()) {
            this.i.b(this.e.c.getClearKey());
        }
        if (this.e.c.getIpcDataChecker() != null && !this.e.j()) {
            this.z = this.e.c.getIpcDataChecker();
        }
        if (this.e.k()) {
            this.q = new r2(this);
        }
        this.p.sendEmptyMessage(10);
        if (this.e.c.autoStart()) {
            i();
        }
        this.G = new s3(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a() {
        w5.a(new b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(Long l) {
        long jLongValue = 0;
        if (l != null && l.longValue() > 0) {
            jLongValue = l.longValue();
        }
        this.f167a = jLongValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean a(boolean z) {
        if ((!this.c || z) && this.j != null) {
            this.c = true;
            this.j.removeMessages(11);
            this.j.sendEmptyMessage(11);
        }
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        this.A.a(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        this.A.b(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public int compare(f4 f4Var, f4 f4Var2) {
        long j = f4Var.c - f4Var2.c;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String d() {
        k0 k0Var = this.n;
        if (k0Var != null) {
            return k0Var.e;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void d(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        this.A.c(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void e(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        this.A.d(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void f(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        this.A.e(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean f() {
        return this.e.h() && !TextUtils.isEmpty(e().getAbUri());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void h() {
        this.p.sendEmptyMessage(10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:9:0x001f, B:15:0x003b, B:17:0x0041, B:12:0x0030), top: B:22:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(JSONObject jSONObject) {
        JSONObject jSONObjectB;
        String strOptString;
        if (jSONObject == null) {
            return false;
        }
        if (r.d(jSONObject.optString("ssid", ""))) {
            return true;
        }
        this.d.D.debug("Register to get ssid by temp header...", new Object[0]);
        try {
            JSONObject jSONObject2 = new JSONObject();
            r.a(jSONObject2, jSONObject);
            jSONObjectB = this.k.b(jSONObject2);
        } catch (Throwable th) {
            this.d.D.error("JSON handle failed", th, new Object[0]);
        }
        if (jSONObjectB != null) {
            strOptString = jSONObjectB.optString("ssid", "");
            if (!r.a(strOptString)) {
            }
            if (r.d(strOptString)) {
                this.d.D.debug("Register to get ssid by header success.", new Object[0]);
                jSONObject.put("ssid", strOptString);
                return true;
            }
            return false;
        }
        strOptString = null;
        if (r.d(strOptString)) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Context b() {
        return this.d.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public l4 c() {
        if (this.h == null) {
            synchronized (this) {
                l4 l4Var = this.h;
                if (l4Var == null) {
                    l4Var = new l4(this, this.e.c.getDbName());
                }
                this.h = l4Var;
            }
        }
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public UriConfig e() {
        if (this.f168o == null) {
            UriConfig uriConfig = this.e.c.getUriConfig();
            this.f168o = uriConfig;
            if (uriConfig == null) {
                this.f168o = UriConstants.createUriConfig(1);
            }
        }
        return this.f168o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean g() {
        v1 v1Var = this.e;
        return v1Var.s == 1 && v1Var.c.isAutoTrackEnabled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void i() {
        this.r = true;
        x1 x1Var = this.i;
        if (x1Var.c.l()) {
            w5.b(x1Var.b);
        }
        this.p.sendEmptyMessage(1);
    }

    public void b(f4 f4Var) {
        if (this.t == null) {
            return;
        }
        if (!(f4Var instanceof n4) && !(f4Var instanceof s4) && !(f4Var instanceof q4)) {
            f4.a(f4Var, this.i.o());
        }
        if ((f4Var instanceof m4) || (((f4Var instanceof p4) && g()) || (f4Var instanceof i4) || (f4Var instanceof q4))) {
            JSONObject jSONObjectH = f4Var.h();
            if (f4Var instanceof p4) {
                if (!((p4) f4Var).k()) {
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject(MetricsSQLiteCacheKt.METRICS_PARAMS);
                if (jSONObjectOptJSONObject != null) {
                    try {
                        jSONObjectOptJSONObject.remove("duration");
                        jSONObjectH.put(MetricsSQLiteCacheKt.METRICS_PARAMS, jSONObjectOptJSONObject);
                    } catch (Throwable unused) {
                    }
                }
            }
            if ((f4Var instanceof i4) && !jSONObjectH.has("event")) {
                try {
                    jSONObjectH.put("event", jSONObjectH.optString("log_type", ((i4) f4Var).s));
                } catch (Throwable unused2) {
                }
            }
            this.d.k.a(jSONObjectH, this.t.g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String[] strArr, boolean z) {
        ArrayList<f4> arrayList;
        Handler handler;
        List<f4> listA;
        InitConfig initConfig = this.e.c;
        boolean z2 = (initConfig == null || initConfig.isTrackEventEnabled()) ? false : true;
        if (this.d.x || z2) {
            return;
        }
        synchronized (this.g) {
            arrayList = (ArrayList) this.g.clone();
            this.g.clear();
        }
        if (strArr != null) {
            arrayList.ensureCapacity(arrayList.size() + strArr.length);
            for (String str : strArr) {
                f4 f4VarA = f4.a(str);
                this.n.a(this.d, f4VarA);
                arrayList.add(f4VarA);
            }
        }
        if (!arrayList.isEmpty()) {
            boolean zIsEventFilterEnable = this.e.c.isEventFilterEnable();
            f1 f1Var = this.y;
            f1 f1Var2 = this.d.w;
            if ((zIsEventFilterEnable && f1Var != null) || f1Var2 != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f4 f4Var = (f4) it.next();
                    if (f4Var instanceof m4) {
                        m4 m4Var = (m4) f4Var;
                        String str2 = m4Var.u;
                        String strE = m4Var.e();
                        if ((f1Var2 != null && !f1Var2.a(str2, strE)) || (f1Var != null && !f1Var.a(str2, strE))) {
                            it.remove();
                        }
                    }
                }
            }
        }
        this.e.t.a(arrayList, this);
        if (arrayList.size() > 0) {
            if (this.e.j()) {
                Collections.sort(arrayList, this);
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                boolean zA = false;
                boolean z3 = false;
                for (f4 f4Var2 : arrayList) {
                    this.n.a(f4Var2, arrayList2, this.d);
                    if (f4Var2 instanceof p4) {
                        zA = k0.a(f4Var2);
                        z3 = true;
                    }
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        b(f4Var2);
                    } else if (this.j != null) {
                        this.j.obtainMessage(16, f4Var2).sendToTarget();
                    }
                    LogUtils.sendObject("event_process", f4Var2);
                }
                if (this.E) {
                    if (this.i.p() && System.currentTimeMillis() - this.D >= 60000 && (listA = this.e.a(arrayList2)) != null && listA.size() > 0) {
                        if (listA.size() <= 200) {
                            a(listA);
                        } else {
                            int size = listA.size() / 200;
                            int i = listA.size() % 200 == 0 ? 0 : 1;
                            for (int i2 = 0; i2 < size + i; i2++) {
                                int i3 = i2 * 200;
                                a(listA.subList(i3, Math.min(i3 + 200, listA.size())));
                            }
                        }
                    }
                } else {
                    this.d.D.warn("can't not use realtime event", new Object[0]);
                }
                c().c(arrayList2);
                if (z3 && (handler = this.p) != null) {
                    if (zA) {
                        handler.removeMessages(7);
                    } else {
                        handler.sendEmptyMessageDelayed(7, this.e.d());
                    }
                }
                k0 k0Var = this.n;
                boolean z4 = k0Var.p;
                k0Var.p = false;
                if (!z4) {
                    int i4 = this.e.f.getInt("batch_event_size", -1);
                    if (this.e.a(i4)) {
                        l4 l4VarC = c();
                        if (l4VarC.a(l4VarC.f217a.getWritableDatabase(), "eventv3", "_app_id= ? ", new String[]{this.d.m}) >= i4) {
                            a(this.l);
                        }
                    }
                    if (!this.c && this.n.j && this.j != null && this.e.c.isAutoActive()) {
                        a(false);
                    }
                }
            } else {
                Intent intent = new Intent(this.d.n, (Class<?>) Collector.class);
                int size2 = arrayList.size();
                String[] strArr2 = new String[size2];
                int length = 0;
                for (int i5 = 0; i5 < size2; i5++) {
                    String string = ((f4) arrayList.get(i5)).g().toString();
                    strArr2[i5] = string;
                    length += string.length();
                }
                if (length >= 307200 && this.z != null) {
                    try {
                        if (this.z.checkIpcData(strArr2)) {
                        }
                    } catch (Throwable th) {
                        this.d.D.warn("check ipc data", th);
                    }
                } else {
                    intent.putExtra("K_DATA", strArr2);
                    this.d.n.sendBroadcast(intent);
                }
            }
        }
        if (z && this.e.j()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - this.w) > WorkRequest.MIN_BACKOFF_MILLIS) {
                this.w = jCurrentTimeMillis;
                a(this.l);
            }
        }
    }

    public final void b(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(this.i.l());
        this.i.i(str);
        this.i.j(str2);
        this.i.h("");
        this.i.d("$tr_web_ssid");
        if (this.e.c.isClearABCacheOnUserChange() && !zIsEmpty) {
            this.i.f(null);
            this.i.l.clear();
        }
        this.v = true;
        if (this.j != null) {
            this.j.sendMessage(this.j.obtainMessage(12, str));
            return;
        }
        synchronized (this.x) {
            this.x.add(new e(str));
        }
    }

    public void a(f4 f4Var) {
        int size;
        if (f4Var.c == 0) {
            this.d.D.warn("Data ts is 0", new Object[0]);
        }
        synchronized (this.g) {
            size = this.g.size();
            this.g.add(f4Var);
            this.n.a(this.d, f4Var, this.g);
        }
        boolean z = f4Var instanceof p4;
        if (size % 10 == 0 || z) {
            this.p.removeMessages(4);
            if (z || size != 0) {
                this.p.sendEmptyMessage(4);
            } else {
                this.p.sendEmptyMessageDelayed(4, 200L);
            }
        }
    }

    public final void a(String str) {
        JSONObject jSONObject = new JSONObject();
        r.a(jSONObject, this.i.f());
        try {
            i0 i0Var = this.k;
            if (i0Var == null || !i0Var.a(jSONObject)) {
                return;
            }
            if (r.d(str)) {
                this.e.f.putInt("is_first_time_launch", 1);
            }
            a(true);
        } catch (Throwable th) {
            this.d.D.error("Register new uuid:{} failed", th, str);
        }
    }

    public final void a(List<f4> list) {
        y.f301a.execute(new c(list));
    }

    public void a(String str, String str2) {
        String strL = this.i.l();
        String strM = this.i.m();
        boolean z = false;
        if (r.a(str, strL) && r.a(str2, strM)) {
            this.d.D.debug("setUserUniqueId not change", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        p4 p4VarA = t.a();
        boolean zD = r.d(this.n.e);
        if (zD && p4VarA != null) {
            p4VarA = (p4) p4VarA.m6119clone();
            p4VarA.m = this.d.m;
            long j = jCurrentTimeMillis - p4VarA.c;
            p4VarA.a(jCurrentTimeMillis);
            if (j < 0) {
                j = 0;
            }
            p4VarA.s = j;
            p4VarA.B = this.n.n;
            this.n.a(this.d, p4VarA);
            arrayList.add(p4VarA);
        }
        b(str, str2);
        if (p4VarA == null) {
            p4VarA = t.j;
        } else {
            z = true;
        }
        if (zD && p4VarA != null) {
            p4 p4Var = (p4) p4VarA.m6119clone();
            p4Var.a(jCurrentTimeMillis + 1);
            p4Var.s = -1L;
            this.n.a(this.d, p4Var, arrayList, true).v = this.n.n;
            if (z) {
                this.n.a(this.d, p4Var);
                arrayList.add(p4Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a((f4) it.next());
        }
        this.p.sendEmptyMessage(14);
    }

    public final void a(d0 d0Var) {
        if (this.j == null || d0Var == null || this.d.x) {
            return;
        }
        d0Var.b = true;
        if (Looper.myLooper() == this.j.getLooper()) {
            d0Var.a();
        } else {
            this.j.removeMessages(6);
            this.j.sendEmptyMessage(6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:219:0x0403 */
    /* JADX DEBUG: Type inference failed for r1v12. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.bytedance.bdtracker.k0$a] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.bytedance.bdtracker.f1] */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Map<String, ?> all;
        Set set;
        Set set2;
        ?? h1Var = 0;
        String[] strArr = null;
        h1Var = 0;
        h1Var = 0;
        switch (message.what) {
            case 1:
                this.d.D.info("AppLog is starting...", new Object[0]);
                v1 v1Var = this.e;
                v1Var.s = v1Var.f.getBoolean("bav_log_collect", v1Var.c.isAutoTrackEnabled()) ? 1 : 0;
                if (this.i.r()) {
                    if (this.e.j()) {
                        StringBuilder sbA = com.bytedance.bdtracker.a.a("bd_tracker_n:");
                        sbA.append(this.d.m);
                        HandlerThread handlerThread = new HandlerThread(sbA.toString());
                        handlerThread.start();
                        this.j = new Handler(handlerThread.getLooper(), this);
                        this.j.sendEmptyMessage(2);
                        if (this.g.size() > 0) {
                            this.p.removeMessages(4);
                            this.p.sendEmptyMessageDelayed(4, 1000L);
                        }
                        l5.a(this.d.n);
                        this.d.D.info("AppLog started on main process.", new Object[0]);
                    } else {
                        this.d.D.info("AppLog started on secondary process.", new Object[0]);
                    }
                    c().a();
                    if (!LogUtils.isDisabled()) {
                        LogUtils.sendJsonFetcher("start_end", new a());
                    }
                } else {
                    this.d.D.info("AppLog is not ready, will try start again after 1 second...", new Object[0]);
                    this.p.removeMessages(1);
                    this.p.sendEmptyMessageDelayed(1, 1000L);
                }
                return true;
            case 2:
                i0 i0Var = new i0(this);
                this.k = i0Var;
                this.u.add(i0Var);
                InitConfig initConfig = this.e.c;
                if (initConfig == null || initConfig.isTrackEventEnabled()) {
                    j0 j0Var = new j0(this);
                    this.l = j0Var;
                    this.u.add(j0Var);
                    this.E = true;
                }
                UriConfig uriConfigE = e();
                if (!TextUtils.isEmpty(uriConfigE.getSettingUri())) {
                    e0 e0Var = new e0(this);
                    this.f = e0Var;
                    this.u.add(e0Var);
                }
                if (!TextUtils.isEmpty(uriConfigE.getProfileUri())) {
                    Handler handler = this.A.b;
                    handler.sendMessage(handler.obtainMessage(106));
                }
                this.j.removeMessages(13);
                this.j.sendEmptyMessage(13);
                String strA = com.bytedance.bdtracker.b.a(this.d, "sp_filter_name");
                if (this.i.g.getInt("version_code", 0) != this.i.n() || !TextUtils.equals(this.e.f.getString(AppsFlyerProperties.CHANNEL, ""), this.e.b())) {
                    i0 i0Var2 = this.k;
                    if (i0Var2 != null) {
                        i0Var2.b = true;
                    }
                    e0 e0Var2 = this.f;
                    if (e0Var2 != null) {
                        e0Var2.b = true;
                    }
                    if (this.e.c.isEventFilterEnable()) {
                        this.y = f1.a(this.d.n, strA, null);
                    }
                } else if (this.e.c.isEventFilterEnable()) {
                    try {
                        IKVStore iKVStoreA = x4.a(this.d.n, strA);
                        HashSet hashSet = new HashSet();
                        HashMap map = new HashMap();
                        try {
                            all = iKVStoreA.getAll();
                        } catch (Throwable unused) {
                            all = null;
                        }
                        if (all != null && all.size() > 0) {
                            int i = 0;
                            for (Map.Entry<String, ?> entry : all.entrySet()) {
                                if (entry != null) {
                                    String key = entry.getKey();
                                    if ("is_block".equals(key)) {
                                        i = iKVStoreA.getInt("is_block", 0);
                                    } else if ("events".equals(key)) {
                                        try {
                                            set2 = (Set) entry.getValue();
                                        } catch (Throwable unused2) {
                                            set2 = null;
                                        }
                                        if (set2 != null && set2.size() > 0) {
                                            hashSet.addAll(set2);
                                        }
                                        break;
                                    } else if (!TextUtils.isEmpty(key)) {
                                        HashSet hashSet2 = new HashSet();
                                        try {
                                            set = (Set) entry.getValue();
                                        } catch (Throwable unused3) {
                                            set = null;
                                        }
                                        if (set != null && set.size() > 0) {
                                            hashSet2.addAll(set);
                                        }
                                        if (hashSet2.size() > 0) {
                                            map.put(key, hashSet2);
                                        }
                                        break;
                                    }
                                }
                            }
                            h1Var = i > 0 ? new h1(hashSet, map) : new g1(hashSet, map);
                        }
                        break;
                    } catch (Throwable unused4) {
                    }
                    this.y = h1Var;
                }
                this.j.removeMessages(6);
                this.j.sendEmptyMessage(6);
                m2 m2Var = this.q;
                if (m2Var != null) {
                    r2 r2Var = (r2) m2Var;
                    v1 v1Var2 = r2Var.c.e;
                    Intrinsics.AEQbTJ(v1Var2, "");
                    if (v1Var2.k()) {
                        r2Var.b.a(new q2(r2Var));
                    }
                }
                return true;
            case 3:
            case 5:
            default:
                this.d.D.error("Unknown handler message type", new Object[0]);
                return true;
            case 4:
                a((String[]) message.obj, false);
                return true;
            case 6:
                this.j.removeMessages(6);
                long j = 5000;
                if (!this.d.x && (!this.e.c.isSilenceInBackground() || this.n.a())) {
                    long j2 = Long.MAX_VALUE;
                    for (d0 d0Var : this.u) {
                        if (!d0Var.d) {
                            long jA = d0Var.a();
                            if (jA < j2) {
                                j2 = jA;
                            }
                        }
                    }
                    long jCurrentTimeMillis = j2 - System.currentTimeMillis();
                    if (jCurrentTimeMillis <= 5000) {
                        j = jCurrentTimeMillis;
                    }
                }
                this.j.sendEmptyMessageDelayed(6, j);
                if (this.x.size() > 0) {
                    synchronized (this.x) {
                        for (d dVar : this.x) {
                            if (dVar != null) {
                                e eVar = (e) dVar;
                                f0.this.a((String) eVar.f172a);
                            }
                        }
                        this.x.clear();
                        break;
                    }
                }
                return true;
            case 7:
                synchronized (this.g) {
                    ArrayList<f4> arrayList = this.g;
                    if (k0.q == null) {
                        k0.q = new k0.b(h1Var);
                    }
                    k0.q.a(0L);
                    arrayList.add(k0.q);
                    break;
                }
                a((String[]) null, false);
                return true;
            case 8:
                c().c((ArrayList) message.obj);
                return true;
            case 9:
                d0 d0Var2 = this.s;
                if (!d0Var2.d) {
                    long jA2 = d0Var2.a();
                    if (!d0Var2.d) {
                        this.j.sendEmptyMessageDelayed(9, jA2 - System.currentTimeMillis());
                    }
                }
                return true;
            case 10:
                synchronized (this.g) {
                    int iA = this.C.a(this.g, this.d, this.n);
                    this.d.D.debug("[event_process][receive] dumpData size: " + iA, new Object[0]);
                    break;
                }
                o1 o1Var = this.C;
                int size = o1Var.b.size();
                if (size > 0) {
                    strArr = new String[size];
                    o1Var.b.toArray(strArr);
                    o1Var.b.clear();
                }
                a(strArr, false);
                return true;
            case 11:
                c0 c0Var = this.b;
                if (c0Var == null) {
                    c0 c0Var2 = new c0(this);
                    this.b = c0Var2;
                    this.u.add(c0Var2);
                } else {
                    c0Var.d = false;
                }
                a(this.b);
                return true;
            case 12:
                Object obj = message.obj;
                a(obj != null ? obj.toString() : null);
                return true;
            case 13:
                if (f()) {
                    if (this.m == null) {
                        this.m = new b0(this);
                    }
                    if (!this.u.contains(this.m)) {
                        this.u.add(this.m);
                    }
                    a(this.m);
                } else {
                    if (this.m != null) {
                        this.m.d = true;
                        this.u.remove(this.m);
                        this.m = null;
                    }
                    this.i.a();
                }
                return true;
            case 14:
                a((String[]) null, true);
                return true;
            case 15:
                Object[] objArr = (Object[]) message.obj;
                boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                String str = (String) objArr[1];
                if (this.t != null) {
                    this.t.d = true;
                    this.u.remove(this.t);
                    this.t = null;
                }
                if (zBooleanValue) {
                    this.t = new h0(this, str);
                    this.u.add(this.t);
                    this.j.removeMessages(6);
                    this.j.sendEmptyMessage(6);
                }
                return true;
            case 16:
                b((f4) message.obj);
                return true;
            case 17:
                Map map2 = (Map) message.obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("oaid", new JSONObject(map2));
                    String strD = this.i.d();
                    String strG = this.i.g();
                    jSONObject.put("bd_did", strD);
                    jSONObject.put("install_id", strG);
                    jSONObject.put("os", n5.c.b(new Object[0]).booleanValue() ? "Harmony" : "Android");
                    jSONObject.put("aid", this.i.c());
                    this.d.D.debug("Report oaid success: {}", this.k.c(jSONObject));
                    break;
                } catch (Throwable th) {
                    this.d.D.error("Report oaid failed", th, new Object[0]);
                }
                return true;
            case 18:
                Object obj2 = message.obj;
                if (obj2 instanceof IPullAbTestConfigCallback) {
                    int i2 = message.arg1;
                    IPullAbTestConfigCallback iPullAbTestConfigCallback = (IPullAbTestConfigCallback) obj2;
                    if (f()) {
                        if (this.m == null) {
                            this.m = new b0(this);
                        }
                        try {
                            JSONObject jSONObjectA = this.m.a(i2);
                            if (iPullAbTestConfigCallback != null) {
                                iPullAbTestConfigCallback.onRemoteConfig(jSONObjectA);
                            }
                        } catch (RangersHttpTimeoutException e2) {
                            if (iPullAbTestConfigCallback != null) {
                                iPullAbTestConfigCallback.onTimeoutError();
                            }
                            this.d.b().a(e2, "doFetchAbConfig timeout");
                        } catch (Throwable th2) {
                            this.d.b().a(th2, "doFetchAbConfig");
                        }
                    } else {
                        this.d.D.warn("ABTest is not enabled", new Object[0]);
                    }
                    break;
                } else {
                    a(this.m);
                }
                return true;
        }
    }
}
