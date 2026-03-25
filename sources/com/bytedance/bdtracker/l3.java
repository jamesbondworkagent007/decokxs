package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.bytedance.applog.IDataObserver;
import com.bytedance.applog.ISessionObserver;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.random.Random;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.yJA;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class l3 implements j3, IDataObserver, ISessionObserver {
    public static final String k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o3 f211a;
    public final InterfaceC56387yDm b;
    public final InterfaceC56387yDm c;
    public final InterfaceC56387yDm d;
    public final InterfaceC56387yDm e;
    public ScheduledFuture<?> f;
    public final com.bytedance.bdtracker.d g;
    public final String h;
    public final String i;
    public static final /* synthetic */ yJA[] j = {C56524yIo.copydefault(new PropertyReference1Impl(C56524yIo.AEQbTJ(l3.class), "networkTrace", "getNetworkTrace()Lcom/bytedance/applog/monitor/v2/NetworkTrace;")), C56524yIo.copydefault(new PropertyReference1Impl(C56524yIo.AEQbTJ(l3.class), "exceptionTrace", "getExceptionTrace()Lcom/bytedance/applog/monitor/v2/ExceptionTrace;")), C56524yIo.copydefault(new PropertyReference1Impl(C56524yIo.AEQbTJ(l3.class), "threadPool", "getThreadPool()Ljava/util/concurrent/ScheduledExecutorService;")), C56524yIo.copydefault(new PropertyReference1Impl(C56524yIo.AEQbTJ(l3.class), "header", "getHeader()Lorg/json/JSONObject;"))};
    public static final a l = new a(null);

    public static final class a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String a() {
            return l3.k;
        }
    }

    public static final class b extends Lambda implements Function0<i3> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public i3 invoke() {
            return new i3(l3.this.g);
        }
    }

    public static final class c extends Lambda implements Function0<JSONObject> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public c() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public JSONObject invoke() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aid", l3.this.h);
            jSONObject.put("sdk_lib", "Android");
            l3.this.g.getSdkVersion();
            jSONObject.put(HianalyticsBaseData.SDK_VERSION, "6.17.6");
            jSONObject.put("user_unique_id", "sdk_solid_user_" + Random.Default.nextInt(1, 1001));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("runtime_id", l3.l.a());
            jSONObject2.put("client_uuid", l3.this.g.getUserUniqueID());
            jSONObject2.put("client_appid", l3.this.g.m);
            jSONObject.put("custom", jSONObject2);
            return jSONObject;
        }
    }

    public static final class d extends Lambda implements Function0<n3> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public d() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public n3 invoke() {
            return new n3(l3.this.g);
        }
    }

    public static final class e implements Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public e() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            l3.this.a();
        }
    }

    public static final class f extends Lambda implements Function0<ScheduledExecutorService> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f216a = new f();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public f() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public ScheduledExecutorService invoke() {
            return Executors.newScheduledThreadPool(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        String string = UUID.randomUUID().toString();
        Intrinsics.AEQbTJ(string, "");
        k = string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l3(@NotNull com.bytedance.bdtracker.d dVar, @NotNull String str, @NotNull String str2) {
        Intrinsics.EZpvd((Object) dVar, "");
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) str2, "");
        this.g = dVar;
        this.h = str;
        this.i = str2;
        this.b = C56392yDr.copydefault(new d());
        this.c = C56392yDr.copydefault(new b());
        this.d = C56392yDr.copydefault(f.f216a);
        this.e = C56392yDr.copydefault(new c());
        try {
            dVar.addDataObserver(this);
            dVar.addSessionHook(this);
            o3 o3Var = new o3(dVar);
            o3Var.d();
            this.f211a = o3Var;
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.j3
    public void a() {
        com.bytedance.bdtracker.d dVar = this.g;
        try {
            JSONObject[] jSONObjectArr = new JSONObject[2];
            jSONObjectArr[0] = b();
            c().b();
            JSONObject jSONObjectC = c().c();
            i3 i3VarC = c();
            com.bytedance.bdtracker.d dVar2 = i3VarC.d;
            try {
                i3VarC.e.set(0);
                i3VarC.f.clear();
                i3VarC.c = false;
            } catch (Throwable th) {
                dVar2.D.error(7, "Run task failed", th, new Object[0]);
            }
            jSONObjectArr[1] = jSONObjectC;
            a(jSONObjectArr);
            e();
        } catch (Throwable th2) {
            dVar.D.error(7, "Run task failed", th2, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.j3
    public <T> void a(@NotNull String str, T t) {
        Intrinsics.EZpvd((Object) str, "");
        d().a(str, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.j3
    public void a(@NotNull Throwable th, @NotNull String str) {
        Intrinsics.EZpvd((Object) th, "");
        Intrinsics.EZpvd((Object) str, "");
        c().a(th, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JSONObject b() {
        d().b();
        JSONObject jSONObjectC = d().c();
        n3 n3VarD = d();
        com.bytedance.bdtracker.d dVar = n3VarD.d;
        try {
            n3VarD.c = false;
            n3VarD.f232o.addAndGet(n3VarD.j.get());
            n3VarD.n.incrementAndGet();
            n3VarD.e.set(0);
            n3VarD.f.set(0);
            n3VarD.g.set(0);
            n3VarD.h.set(0);
            n3VarD.i.set(0);
            n3VarD.j.set(0);
            n3VarD.n.set(0);
            n3VarD.k.set(0);
            n3VarD.l.set(0);
            n3VarD.m.set(0);
            n3VarD.p.clear();
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
        return jSONObjectC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final i3 c() {
        InterfaceC56387yDm interfaceC56387yDm = this.c;
        yJA yja = j[1];
        return (i3) interfaceC56387yDm.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final n3 d() {
        InterfaceC56387yDm interfaceC56387yDm = this.b;
        yJA yja = j[0];
        return (n3) interfaceC56387yDm.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        com.bytedance.bdtracker.d dVar = this.g;
        try {
            ScheduledFuture<?> scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            d().d();
            c().d();
            InterfaceC56387yDm interfaceC56387yDm = this.d;
            yJA yja = j[2];
            this.f = ((ScheduledExecutorService) interfaceC56387yDm.getValue()).schedule(new e(), 2L, TimeUnit.MINUTES);
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IDataObserver
    public void onAbVidsChange(@NotNull String str, @NotNull String str2) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) str2, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IDataObserver
    public void onIdLoaded(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) str2, "");
        Intrinsics.EZpvd((Object) str3, "");
        com.bytedance.bdtracker.d dVar = this.g;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
                a(a(""));
                i1 i1Var = this.g.y;
                if (i1Var != null) {
                    i1Var.b(this);
                }
            }
            e();
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IDataObserver
    public void onRemoteAbConfigGet(boolean z, @NotNull JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) jSONObject, "");
    }

    @Override // com.bytedance.applog.IDataObserver
    public void onRemoteConfigGet(boolean z, JSONObject jSONObject) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IDataObserver
    public void onRemoteIdGet(boolean z, String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.EZpvd((Object) str2, "");
        Intrinsics.EZpvd((Object) str3, "");
        Intrinsics.EZpvd((Object) str4, "");
        Intrinsics.EZpvd((Object) str5, "");
        Intrinsics.EZpvd((Object) str6, "");
        com.bytedance.bdtracker.d dVar = this.g;
        try {
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str6)) {
                a(a("device register failed, did: " + str2 + ", ssid: " + str6));
            } else {
                a(a(""));
            }
            i1 i1Var = this.g.y;
            if (i1Var != null) {
                i1Var.b(this);
            }
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.ISessionObserver
    public void onSessionBatchEvent(long j2, @NotNull String str, JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.ISessionObserver
    public void onSessionStart(long j2, @NotNull String str) {
        Intrinsics.EZpvd((Object) str, "");
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.ISessionObserver
    public void onSessionTerminate(long j2, @NotNull String str, JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) str, "");
    }

    public final JSONObject a(String str) {
        i1 i1Var = this.g.y;
        if (i1Var != null) {
            i1Var.b(this);
        }
        o3 o3Var = this.f211a;
        if (o3Var != null) {
            o3Var.b();
        }
        o3 o3Var2 = this.f211a;
        if (o3Var2 != null) {
            Intrinsics.EZpvd((Object) str, "");
            o3Var2.e = str;
        }
        o3 o3Var3 = this.f211a;
        JSONObject jSONObjectC = o3Var3 != null ? o3Var3.c() : null;
        this.f211a = null;
        return jSONObjectC != null ? jSONObjectC : new JSONObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(JSONObject... jSONObjectArr) {
        if (TextUtils.isEmpty(this.i)) {
            return;
        }
        com.bytedance.bdtracker.d dVar = this.g;
        try {
            JSONArray jSONArray = new JSONArray();
            for (JSONObject jSONObject : jSONObjectArr) {
                if (jSONObject.length() == 0) {
                    break;
                }
                jSONArray.put(jSONObject);
            }
            if (jSONArray.length() == 0) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("magic_tag", "ss_app_log");
            InterfaceC56387yDm interfaceC56387yDm = this.e;
            yJA yja = j[3];
            jSONObject2.put("header", (JSONObject) interfaceC56387yDm.getValue());
            jSONObject2.put("time_sync", a4.d);
            jSONObject2.put("event_v3", jSONArray);
            this.g.k.c(this.i, jSONObject2);
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }
}
