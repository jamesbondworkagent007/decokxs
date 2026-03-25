package com.bytedance.bdtracker;

import android.accounts.Account;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.IActiveCustomParamsCallback;
import com.bytedance.applog.IAppLogInstance;
import com.bytedance.applog.IDataObserver;
import com.bytedance.applog.IEventJsonObserver;
import com.bytedance.applog.IEventObserver;
import com.bytedance.applog.IExtraParams;
import com.bytedance.applog.IHeaderCustomTimelyCallback;
import com.bytedance.applog.IOaidObserver;
import com.bytedance.applog.IPresetEventObserver;
import com.bytedance.applog.IPullAbTestConfigCallback;
import com.bytedance.applog.ISessionObserver;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.Level;
import com.bytedance.applog.R;
import com.bytedance.applog.UriConfig;
import com.bytedance.applog.alink.IALinkListener;
import com.bytedance.applog.alink.util.LinkUtils;
import com.bytedance.applog.collector.Collector;
import com.bytedance.applog.event.EventBuilder;
import com.bytedance.applog.event.IEventHandler;
import com.bytedance.applog.exception.AppCrashType;
import com.bytedance.applog.exposure.ViewExposureManager;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.ILogProcessor;
import com.bytedance.applog.log.LogProcessorHolder;
import com.bytedance.applog.log.LogUtils;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.applog.network.INetworkClient;
import com.bytedance.applog.oneid.IDBindCallback;
import com.bytedance.applog.profile.UserProfileCallback;
import com.bytedance.applog.simulate.SimulateLaunchActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements IAppLogInstance {
    public static final List<d> L = new CopyOnWriteArrayList();
    public static final AtomicInteger M = new AtomicInteger(0);
    public IActiveCustomParamsCallback A;
    public volatile s B;
    public IEventHandler C;
    public final IAppLogLogger D;
    public j3 K;
    public final c4 j;
    public final a4 k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile v1 f151o;
    public volatile x1 p;
    public volatile f0 q;
    public volatile t r;
    public volatile ViewExposureManager s;
    public volatile INetworkClient t;
    public volatile IHeaderCustomTimelyCallback v;
    public volatile f1 w;
    public i1 y;
    public IALinkListener z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, JSONObject> f150a = new ConcurrentHashMap<>();
    public final k1 b = new k1();
    public final j1 c = new j1();
    public final z1 d = new z1();
    public final o1 e = new o1();
    public final Set<Integer> f = new HashSet();
    public final Set<String> g = new HashSet();
    public final Set<Class<?>> h = new HashSet();
    public final Map<String, l0> i = new ConcurrentHashMap();
    public int l = 0;
    public String m = "";
    public volatile Application n = null;
    public volatile boolean u = false;
    public volatile boolean x = false;
    public volatile boolean E = true;
    public long F = 0;
    public volatile boolean G = false;
    public final h5<String> H = new h5<>();
    public final h5<String> I = new h5<>();
    public final Object J = new Object();

    public class a implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f152a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(boolean z) {
            this.f152a = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("appId", d.this.m);
                jSONObject2.put("接口加密开关", this.f152a);
                jSONObject.put("config", jSONObject2);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    public class b implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f153a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b(boolean z) {
            this.f153a = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("appId", d.this.m);
                jSONObject2.put("剪切板开关", this.f153a);
                jSONObject.put("config", jSONObject2);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    public class c implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f154a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public c(boolean z) {
            this.f154a = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("appId", d.this.m);
                jSONObject2.put("隐私模式开关", this.f154a);
                jSONObject.put("config", jSONObject2);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public d() {
        M.incrementAndGet();
        this.D = new LoggerImpl();
        this.j = new c4(this);
        this.k = new a4(this);
        L.add(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public z1 a() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean a(String str) {
        return r.a((Object) this.p, "Call " + str + " before please initialize first");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void activateALink(Uri uri) {
        if (b("activateALink")) {
            return;
        }
        j jVar = this.q.B;
        jVar.c();
        if (uri != null) {
            jVar.h = uri.toString();
        }
        jVar.b().debug(3, "Activate deep link with url: {}...", jVar.h);
        Handler handlerA = jVar.a();
        l lVar = (l) p.f239a.a(LinkUtils.INSTANCE.getParamFromLink(uri), l.class);
        String strC = lVar != null ? lVar.c() : null;
        if (strC == null || strC.length() == 0) {
            return;
        }
        jVar.e = 0;
        handlerA.sendMessage(handlerA.obtainMessage(1, lVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void addDataObserver(IDataObserver iDataObserver) {
        synchronized (this) {
            if (this.y == null) {
                this.y = new i1();
            }
            this.y.a(iDataObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void addEventJsonObserver(IEventJsonObserver iEventJsonObserver) {
        this.c.a(iEventJsonObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void addEventObserver(IEventObserver iEventObserver) {
        this.c.a(iEventObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void addEventObserver(IEventObserver iEventObserver, IPresetEventObserver iPresetEventObserver) {
        this.c.a(iEventObserver);
        this.c.a(iPresetEventObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public String addNetCommonParams(Context context, String str, boolean z, Level level) {
        return this.j.a(this.p != null ? this.p.f() : null, str, z, level);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void addSessionHook(ISessionObserver iSessionObserver) {
        this.b.a(iSessionObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public j3 b() {
        j3 j3Var = this.K;
        return j3Var != null ? j3Var : k3.f205a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean b(String str) {
        return r.a((Object) this.q, "Call " + str + " before please initialize first");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void bind(Map<String, String> map, IDBindCallback iDBindCallback) {
        if (b("bind")) {
            return;
        }
        f0 f0Var = this.q;
        if (map == null) {
            f0Var.d.D.warn("BindID identities is null", new Object[0]);
        } else {
            f0Var.G.a(map, iDBindCallback);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean c() {
        return this.G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void clearAbTestConfigsCache() {
        if (this.p != null) {
            this.p.a();
        } else {
            new m0().initCause(new AssertionError("Please initialize first")).printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        h5<String> h5Var = this.H;
        if (h5Var.b && !r.a(h5Var.f188a, this.f151o.f())) {
            this.p.i(this.H.f188a);
            IAppLogLogger iAppLogLogger = this.D;
            StringBuilder sbA = com.bytedance.bdtracker.a.a("postSetUuidAfterDm uuid -> ");
            sbA.append(this.H.f188a);
            iAppLogLogger.debug(sbA.toString(), new Object[0]);
            this.p.h("");
        }
        h5<String> h5Var2 = this.I;
        if (!h5Var2.b || r.a(h5Var2.f188a, this.f151o.g())) {
            return;
        }
        this.p.j(this.I.f188a);
        IAppLogLogger iAppLogLogger2 = this.D;
        StringBuilder sbA2 = com.bytedance.bdtracker.a.a("postSetUuidAfterDm uuid -> ");
        sbA2.append(this.I.f188a);
        iAppLogLogger2.debug(sbA2.toString(), new Object[0]);
        this.p.h("");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void flush() {
        if (b("flush")) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.q.a((String[]) null, true);
        p2.a(getMonitor(), "api_usage", "flush", jElapsedRealtime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public IALinkListener getALinkListener() {
        return this.z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public <T> T getAbConfig(String str, T t) {
        if (a("getAbConfig")) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        x1 x1Var = this.p;
        JSONObject jSONObjectOptJSONObject = x1Var.c.a().optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString("vid");
            Object objOpt = jSONObjectOptJSONObject.opt("val");
            x1Var.a(strOptString);
            InitConfig initConfig = x1Var.i.getInitConfig();
            if (initConfig != null) {
                if (initConfig.isAbTestExposureEventRepeatEnabled()) {
                    x1Var.e(strOptString);
                } else if (!x1Var.l.contains(strOptString)) {
                    x1Var.l.add(strOptString);
                    x1Var.e(strOptString);
                }
            }
            Object obj = objOpt != null ? objOpt : null;
            if (obj != null) {
                t = (T) obj;
            }
        }
        p2.a(getMonitor(), "api_usage", "getAbConfig", jElapsedRealtime);
        return t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getAbSdkVersion() {
        return a("getAbSdkVersion") ? "" : this.p.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public IActiveCustomParamsCallback getActiveCustomParams() {
        return this.A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public String getAid() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public JSONObject getAllAbTestConfigs() {
        return this.q == null ? new JSONObject() : this.q.e.a();
    }

    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public f getAppContext() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getAppId() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getClientUdid() {
        return a("getClientUdid") ? "" : this.p.d.optString("clientudid", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public Context getContext() {
        return this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getDeepLinkUrl() {
        if (this.q != null) {
            return this.q.B.h;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getDid() {
        if (a("getDid")) {
            return "";
        }
        String strD = this.p.d();
        return !TextUtils.isEmpty(strD) ? strD : this.p.d.optString("device_id", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean getEncryptAndCompress() {
        return this.E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public f1 getEventFilterByClient() {
        return this.w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public IEventHandler getEventHandler() {
        return this.C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getExternalAbVersion() {
        if (a("setExternalAbVersion")) {
            return null;
        }
        return this.f151o.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public JSONObject getHeader() {
        if (a("getHeader")) {
            return null;
        }
        return this.p.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public IHeaderCustomTimelyCallback getHeaderCustomCallback() {
        return this.v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public <T> T getHeaderValue(String str, T t, Class<T> cls) {
        if (a("getHeaderValue")) {
            return null;
        }
        return (T) this.p.a(str, t, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getIid() {
        return a("getIid") ? "" : this.p.g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public InitConfig getInitConfig() {
        if (this.f151o != null) {
            return this.f151o.c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public int getLaunchFrom() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public m2 getMonitor() {
        if (b("getMonitor")) {
            return null;
        }
        return this.q.q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public INetworkClient getNetClient() {
        if (this.t != null) {
            return this.t;
        }
        if (getInitConfig() != null && getInitConfig().getNetworkClient() != null) {
            return getInitConfig().getNetworkClient();
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new q3(this.k);
            }
        }
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getOpenUdid() {
        return a("getOpenUdid") ? "" : this.p.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public Map<String, String> getRequestHeader() {
        if (this.f151o == null) {
            return Collections.emptyMap();
        }
        String string = this.f151o.f.getString(RemoteMessageConst.DEVICE_TOKEN, "");
        HashMap map = new HashMap();
        map.put("x-tt-dt", string != null ? string : "");
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getSdkVersion() {
        return "6.17.6";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getSessionId() {
        return this.q != null ? this.q.d() : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getSsid() {
        return a("getSsid") ? "" : this.p.j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void getSsidGroup(Map<String, String> map) {
        String did = getDid();
        if (!TextUtils.isEmpty(did)) {
            map.put("device_id", did);
        }
        String iid = getIid();
        if (!TextUtils.isEmpty(iid)) {
            map.put("install_id", iid);
        }
        String openUdid = getOpenUdid();
        if (!TextUtils.isEmpty(openUdid)) {
            map.put("openudid", openUdid);
        }
        String clientUdid = getClientUdid();
        if (TextUtils.isEmpty(clientUdid)) {
            return;
        }
        map.put("clientudid", clientUdid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public String getUdid() {
        return a("getUdid") ? "" : this.p.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public UriConfig getUriRuntime() {
        if (b("getUriRuntime")) {
            return null;
        }
        return this.q.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getUserID() {
        if (b("getUserID")) {
            return null;
        }
        return String.valueOf(this.q.n.f201a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public String getUserUniqueID() {
        return a("getUserUniqueID") ? "" : this.p.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public ViewExposureManager getViewExposureManager() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public JSONObject getViewProperties(View view) {
        if (view != null) {
            return this.f150a.get(r.b(view));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean hasStarted() {
        return this.u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void ignoreAutoTrackClick(View view) {
        if (view == null) {
            return;
        }
        this.g.add(r.b(view));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void ignoreAutoTrackClickByViewType(Class<?>... clsArr) {
        if (clsArr == null) {
            return;
        }
        this.h.addAll(Arrays.asList(clsArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void ignoreAutoTrackPage(Class<?>... clsArr) {
        if (clsArr == null) {
            return;
        }
        for (Class<?> cls : clsArr) {
            if (cls != null) {
                Iterator<Class<?>> it = k5.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().isAssignableFrom(cls)) {
                            break;
                        }
                    } else {
                        Iterator<Class<?>> it2 = k5.d.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().isAssignableFrom(cls)) {
                            }
                        }
                        this.D.warn("{} is not a page class", cls);
                    }
                }
                String canonicalName = cls.getCanonicalName();
                if (!TextUtils.isEmpty(canonicalName)) {
                    this.f.add(Integer.valueOf(canonicalName.hashCode()));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void init(@NonNull Context context, @NonNull InitConfig initConfig, Activity activity) {
        init(context, initConfig);
        if (this.r == null || activity == null) {
            return;
        }
        this.r.onActivityCreated(activity, null);
        this.r.onActivityStarted(activity);
        this.r.onActivityResumed(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean isAutoTrackClickIgnored(View view) {
        if (view == null) {
            return false;
        }
        if (this.g.contains(r.b(view))) {
            return true;
        }
        Iterator<Class<?>> it = this.h.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean isAutoTrackPageIgnored(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        String canonicalName = cls.getCanonicalName();
        if (TextUtils.isEmpty(canonicalName)) {
            return false;
        }
        return this.f.contains(Integer.valueOf(canonicalName.hashCode()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean isBavEnabled() {
        return this.q != null && this.q.g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean isH5BridgeEnable() {
        return getInitConfig() != null && getInitConfig().isH5BridgeEnable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean isH5CollectEnable() {
        return getInitConfig() != null && getInitConfig().isH5CollectEnable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean isNewUser() {
        if (a("isNewUser")) {
            return false;
        }
        return this.p.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean isPrivacyMode() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean manualActivate() {
        if (b("manualActivate")) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = this.q.a(false);
        p2.a(getMonitor(), "api_usage", "manualActivate", jElapsedRealtime);
        return zA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public EventBuilder newEvent(@NonNull String str) {
        return new EventBuilder(this).setEvent(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void onActivityPause() {
        if (this.r != null) {
            this.r.onActivityPaused(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void onActivityResumed(@NonNull Activity activity, int i) {
        if (this.r != null) {
            this.r.a(activity, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void onEventV3(@NonNull String str) {
        onEventV3(str, (JSONObject) null, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void onEventV3(@NonNull String str, @Nullable Bundle bundle) {
        onEventV3(str, bundle, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void onEventV3(@NonNull String str, @Nullable JSONObject jSONObject) {
        onEventV3(str, jSONObject, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void onPause(@NonNull Context context) {
        if (context instanceof Activity) {
            onActivityPause();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void onResume(@NonNull Context context) {
        if (context instanceof Activity) {
            onActivityResumed((Activity) context, context.hashCode());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void pauseDurationEvent(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (r.a(TextUtils.isEmpty(str), "Event name must not empty!")) {
            return;
        }
        l0 l0Var = this.i.get(str);
        if (r.a((Object) l0Var, "No duration event with name: " + str)) {
            return;
        }
        l0Var.a(jElapsedRealtime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void pullAbTestConfigs() {
        pullAbTestConfigs(-1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void pullAbTestConfigs(int i, IPullAbTestConfigCallback iPullAbTestConfigCallback) {
        if (this.q == null) {
            new m0().initCause(new AssertionError("Please initialize first")).printStackTrace();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jAbs = this.q.f167a - Math.abs(jCurrentTimeMillis - this.F);
        if (jAbs < 0) {
            this.F = jCurrentTimeMillis;
            Handler handler = this.q.p;
            handler.sendMessage(handler.obtainMessage(18, i, -1, iPullAbTestConfigCallback));
        } else if (iPullAbTestConfigCallback != null) {
            iPullAbTestConfigCallback.onThrottle(jAbs);
        } else {
            this.D.warn("Pull ABTest config too frequently", new Object[0]);
        }
        p2.a(getMonitor(), "api_usage", "pullAbTestConfigs", jElapsedRealtime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public void putCommonParams(Context context, Map<String, String> map, boolean z, Level level) {
        this.j.a(this.p != null ? this.p.f() : null, z, map, level);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public void registerHeaderCustomCallback(IHeaderCustomTimelyCallback iHeaderCustomTimelyCallback) {
        this.v = iHeaderCustomTimelyCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void removeAllDataObserver() {
        i1 i1Var = this.y;
        if (i1Var != null) {
            i1Var.f191a.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void removeDataObserver(IDataObserver iDataObserver) {
        i1 i1Var = this.y;
        if (i1Var != null) {
            i1Var.b(iDataObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void removeEventObserver(IEventObserver iEventObserver, IPresetEventObserver iPresetEventObserver) {
        this.c.b(iEventObserver);
        this.c.b(iPresetEventObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void removeJsonEventObserver(IEventJsonObserver iEventJsonObserver) {
        this.c.b(iEventJsonObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void removeJsonEventObserver(IEventObserver iEventObserver) {
        this.c.b(iEventObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void removeOaidObserver(@Nullable IOaidObserver iOaidObserver) {
        w5.b(iOaidObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void removeSessionHook(ISessionObserver iSessionObserver) {
        this.b.b(iSessionObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void resumeDurationEvent(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (r.a(TextUtils.isEmpty(str), "Event name must not empty!")) {
            return;
        }
        l0 l0Var = this.i.get(str);
        if (r.a((Object) l0Var, "No duration event with name: " + str)) {
            return;
        }
        l0Var.b(jElapsedRealtime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setALinkListener(IALinkListener iALinkListener) {
        this.z = iALinkListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public void setAccount(Account account) {
        if (a("setAccount")) {
            return;
        }
        z1 z1VarA = this.p.i.a();
        if (!(z1VarA.f311a instanceof d5)) {
            z1VarA.b = account;
            return;
        }
        e4 e4Var = z1VarA.f311a.c;
        if (e4Var != null) {
            e4Var.a(account);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setActiveCustomParams(IActiveCustomParamsCallback iActiveCustomParamsCallback) {
        this.A = iActiveCustomParamsCallback;
    }

    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public void setAppContext(@NonNull f fVar) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setAppLanguageAndRegion(@NonNull String str, @NonNull String str2) {
        boolean z;
        if (b("setAppLanguageAndRegion")) {
            return;
        }
        f0 f0Var = this.q;
        x1 x1Var = f0Var.i;
        boolean z2 = true;
        if (x1Var.a("app_language", (Object) str)) {
            x1Var.c.f.putString("app_language", str);
            z = true;
        } else {
            z = false;
        }
        x1 x1Var2 = f0Var.i;
        if (x1Var2.a("app_region", (Object) str2)) {
            x1Var2.c.f.putString("app_region", str2);
        } else {
            z2 = false;
        }
        if (z || z2) {
            f0Var.a(f0Var.k);
            f0Var.a(f0Var.f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setAppTrack(JSONObject jSONObject) {
        if (jSONObject == null || a("setAppTrack")) {
            return;
        }
        x1 x1Var = this.p;
        if (x1Var.a("app_track", jSONObject)) {
            v1 v1Var = x1Var.c;
            v1Var.d.putString("app_track", jSONObject.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setClipboardEnabled(boolean z) {
        if (b("setClipboardEnabled")) {
            return;
        }
        this.q.B.f194a = z;
        if (LogUtils.isDisabled()) {
            return;
        }
        LogUtils.sendJsonFetcher("update_config", new b(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setEncryptAndCompress(boolean z) {
        this.E = z;
        if (!r.d(this.m) || LogUtils.isDisabled()) {
            return;
        }
        LogUtils.sendJsonFetcher("update_config", new a(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setEventFilterByClient(List<String> list, boolean z) {
        f1 h1Var = null;
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                h1Var = z ? new h1(hashSet, null) : new g1(hashSet, null);
            }
        }
        this.w = h1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setEventHandler(IEventHandler iEventHandler) {
        this.C = iEventHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setExternalAbVersion(@NonNull String str) {
        if (a("setExternalAbVersion")) {
            return;
        }
        this.p.g(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public void setExtraParams(IExtraParams iExtraParams) {
        this.j.f145a = iExtraParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setGoogleAid(@NonNull String str) {
        if (a("setGoogleAid")) {
            return;
        }
        x1 x1Var = this.p;
        if (x1Var.a("google_aid", (Object) str)) {
            x1Var.c.f.putString("google_aid", str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setLaunchFrom(int i) {
        this.l = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setOaidObserver(@Nullable IOaidObserver iOaidObserver) {
        w5.a(iOaidObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setPrivacyMode(boolean z) {
        this.x = z;
        if (!r.d(this.m) || LogUtils.isDisabled()) {
            return;
        }
        LogUtils.sendJsonFetcher("update_config", new c(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setPullAbTestConfigsThrottleMills(Long l) {
        if (this.q != null) {
            this.q.a(l);
        } else {
            new m0().initCause(new AssertionError("Please initialize first")).printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setRangersEventVerifyEnable(boolean z, String str) {
        if (b("setRangersEventVerifyEnable")) {
            return;
        }
        f0 f0Var = this.q;
        f0Var.j.removeMessages(15);
        f0Var.j.obtainMessage(15, new Object[]{Boolean.valueOf(z), str}).sendToTarget();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setTouchPoint(@NonNull String str) {
        setHeaderInfo("touch_point", str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setTracerData(JSONObject jSONObject) {
        if (a("setTracerData")) {
            return;
        }
        this.p.a("tracer_data", jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setUriRuntime(UriConfig uriConfig) {
        if (b("setUriRuntime")) {
            return;
        }
        f0 f0Var = this.q;
        f0Var.f168o = uriConfig;
        f0Var.a(f0Var.k);
        if (f0Var.e.c.isAutoActive()) {
            f0Var.a(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setUserAgent(@NonNull String str) {
        if (a("setUserAgent")) {
            return;
        }
        x1 x1Var = this.p;
        if (x1Var.a("user_agent", (Object) str)) {
            x1Var.c.f.putString("user_agent", str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setUserID(long j) {
        if (b("setUserID")) {
            return;
        }
        this.q.n.f201a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setUserUniqueID(@Nullable String str) {
        if (this.p != null) {
            setUserUniqueID(str, this.p.m());
            return;
        }
        h5<String> h5Var = this.H;
        h5Var.f188a = str;
        h5Var.b = true;
        this.D.debug(com.bytedance.bdtracker.a.a("cache uuid before init id -> ", str), new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setViewId(Dialog dialog, String str) {
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        dialog.getWindow().getDecorView().setTag(R.id.applog_tag_view_id, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setViewId(View view, String str) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.applog_tag_view_id, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setViewProperties(View view, JSONObject jSONObject) {
        if (view == null || jSONObject == null) {
            return;
        }
        this.f150a.put(r.b(view), jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void start() {
        if (b(TtmlNode.START) || this.u) {
            return;
        }
        this.u = true;
        f0 f0Var = this.q;
        if (f0Var.r) {
            return;
        }
        f0Var.i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void startDurationEvent(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (r.a(TextUtils.isEmpty(str), "Event name must not empty!")) {
            return;
        }
        l0 l0Var = this.i.get(str);
        if (l0Var == null) {
            l0 l0Var2 = new l0(this.D, str);
            this.i.put(str, l0Var2);
            l0Var = l0Var2;
        }
        l0Var.c(jElapsedRealtime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void startSimulator(@NonNull String str) {
        if (b("startSimulator")) {
            return;
        }
        f0 f0Var = this.q;
        d0 d0Var = f0Var.s;
        if (d0Var != null) {
            d0Var.d = true;
        }
        Class<?> clsB = r.b("com.bytedance.applog.picker.DomSender");
        if (clsB != null) {
            try {
                f0Var.s = (d0) clsB.getConstructor(f0.class, String.class).newInstance(f0Var, str);
                f0Var.j.sendMessage(f0Var.j.obtainMessage(9, f0Var.s));
            } catch (Throwable th) {
                f0Var.d.D.error("Start simulator failed.", th, new Object[0]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void stopDurationEvent(String str, JSONObject jSONObject) {
        stopDurationEvent(str, jSONObject, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void stopDurationEvent(String str, JSONObject jSONObject, String str2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (r.a(TextUtils.isEmpty(str), "Event name must not empty!")) {
            return;
        }
        l0 l0Var = this.i.get(str);
        if (r.a((Object) l0Var, "No duration event with name: " + str)) {
            return;
        }
        long j = 0;
        if (jElapsedRealtime <= 0) {
            IAppLogLogger iAppLogLogger = l0Var.f209a;
            if (iAppLogLogger != null) {
                iAppLogLogger.warn(4, "End at illegal time: " + jElapsedRealtime, new Object[0]);
            }
        } else {
            l0Var.a(jElapsedRealtime);
            IAppLogLogger iAppLogLogger2 = l0Var.f209a;
            if (iAppLogLogger2 != null) {
                iAppLogLogger2.debug(4, "[DurationEvent:{}] End[ at:{} and duration is {}ms", l0Var.b, Long.valueOf(jElapsedRealtime), Long.valueOf(l0Var.d));
            }
            j = l0Var.d;
        }
        JSONObject jSONObject2 = new JSONObject();
        r.c(jSONObject, jSONObject2);
        try {
            jSONObject2.put("$event_duration", j);
        } catch (Throwable th) {
            this.D.error("JSON handle failed", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str2)) {
            this.D.info(com.bytedance.bdtracker.a.a("CustomEventName is empty, use eventName, finalEventName: {}", str), new Object[0]);
            str2 = str;
        }
        receive(new m4(str2, jSONObject2));
        this.i.remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        StringBuilder sbA = com.bytedance.bdtracker.a.a("AppLogInstance{id:");
        sbA.append(M.get());
        sbA.append(";appId:");
        sbA.append(this.m);
        sbA.append("}@");
        sbA.append(hashCode());
        return sbA.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void trackClick(View view) {
        trackClick(view, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void trackClick(View view, JSONObject jSONObject) {
        JSONObject jSONObjectD;
        h4 h4VarA = r.a(view, false);
        if (h4VarA != null && jSONObject != null) {
            h4VarA.f175o = jSONObject;
            InitConfig initConfig = getInitConfig();
            if (initConfig != null && initConfig.isClickFillPagePropertiesEnable() && (jSONObjectD = k5.d(view.getContext())) != null) {
                h4VarA.f175o = r.c(h4VarA.f175o, jSONObjectD);
            }
        }
        receive(h4VarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void trackPage(Activity activity) {
        trackPage(activity, (JSONObject) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void trackPage(Activity activity, JSONObject jSONObject) {
        a(activity, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void trackPage(Object obj) {
        trackPage(obj, (JSONObject) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void trackPage(Object obj, JSONObject jSONObject) {
        a(obj, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public void userProfileSetOnce(JSONObject jSONObject, UserProfileCallback userProfileCallback) {
        if (b("userProfileSetOnce")) {
            return;
        }
        f0 f0Var = this.q;
        if (f0Var.j != null) {
            w3.a(f0Var, 0, jSONObject, userProfileCallback, f0Var.j, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public void userProfileSync(JSONObject jSONObject, UserProfileCallback userProfileCallback) {
        if (b("userProfileSync")) {
            return;
        }
        f0 f0Var = this.q;
        if (f0Var.j != null) {
            w3.a(f0Var, 1, jSONObject, userProfileCallback, f0Var.j, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void a(String str, Object obj) {
        InitConfig initConfig = getInitConfig();
        if (initConfig == null || initConfig.getProcess() != 2) {
            this.D.warn("call setHeaderInfo process unknown.", new Object[0]);
            return;
        }
        if (!(obj instanceof String)) {
            this.D.warn("call setHeaderInfo in other process, not support value type, key: {}, value: {}.", str, obj);
            return;
        }
        Intent intent = new Intent(this.n, (Class<?>) Collector.class);
        intent.putExtra("K_APP_ID", this.m);
        intent.putExtra("K_CUSTOM_HEADER_KEY", str);
        intent.putExtra("K_CUSTOM_HEADER_VALUE", (String) obj);
        intent.putExtra("K_ADD_CUSTOM_HEADER", true);
        this.n.sendBroadcast(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void c(String str) {
        InitConfig initConfig = getInitConfig();
        if (initConfig == null || initConfig.getProcess() != 2) {
            this.D.warn("call removeHeaderInfo process unknown.", new Object[0]);
            return;
        }
        Intent intent = new Intent(this.n, (Class<?>) Collector.class);
        intent.putExtra("K_APP_ID", this.m);
        intent.putExtra("K_CUSTOM_HEADER_KEY", str);
        intent.putExtra("K_REMOVE_CUSTOM_HEADER", true);
        this.n.sendBroadcast(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public boolean clearDb() {
        if (this.q == null) {
            new m0().initCause(new AssertionError("clearDb before init")).printStackTrace();
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.D.debug("[event_process][delete] Start to clear db data...", new Object[0]);
        boolean zB = this.q.c().b();
        this.D.debug("[event_process][delete] All db data cleared", new Object[0]);
        p2.a(getMonitor(), "api_usage", "clearDb", jElapsedRealtime);
        return zB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void init(@NonNull Context context, @NonNull InitConfig initConfig) {
        String str;
        ILogProcessor l1Var;
        synchronized (d.class) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String aid = initConfig.getAid();
            if (r.c(aid)) {
                return;
            }
            if (r.c(initConfig.getChannel())) {
                return;
            }
            if (com.bytedance.bdtracker.b.b(aid)) {
                return;
            }
            this.D.setAppId(aid);
            this.m = aid;
            this.n = (Application) context.getApplicationContext();
            if (initConfig.isLogEnable()) {
                if (initConfig.getLogger() != null) {
                    str = this.m;
                    l1Var = new m1(initConfig.getLogger());
                } else {
                    str = this.m;
                    l1Var = new l1(this);
                }
                LogProcessorHolder.setProcessor(str, l1Var);
            }
            this.D.info("AppLog init begin...", new Object[0]);
            if (!initConfig.isMonitorEnabled() && !o2.a(initConfig)) {
                initConfig.getUriConfig();
            }
            initMetaSec(context);
            if (TextUtils.isEmpty(initConfig.getSpName())) {
                initConfig.setSpName(com.bytedance.bdtracker.b.a(this, "applog_stats"));
            }
            synchronized (this.J) {
                this.f151o = new v1(this, this.n, initConfig);
                this.p = new x1(this, this.n, this.f151o);
                d();
                this.q = new f0(this, this.f151o, this.p, this.e);
                String string = this.f151o.f.getString("observe_appid", "");
                UriConfig uriConfigE = this.q.e();
                if (TextUtils.isEmpty(string)) {
                    this.K = k3.f205a;
                } else {
                    String strSubstring = "";
                    if (uriConfigE != null) {
                        try {
                            strSubstring = uriConfigE.getSendUris()[0];
                            if (strSubstring.endsWith("/")) {
                                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.K = new l3(this, string, strSubstring);
                }
            }
            if (!LogUtils.isDisabled()) {
                LogUtils.sendJsonFetcher("init_begin", new e(this, initConfig));
            }
            this.r = t.a(this.n);
            this.s = new ViewExposureManager(this);
            if (AppCrashType.hasJavaCrashType(initConfig.getTrackCrashType()) || initConfig.isMonitorEnabled()) {
                n0.a();
            }
            this.l = 1;
            this.u = initConfig.autoStart();
            LogUtils.sendString("init_end", this.m);
            this.D.info("AppLog init end", new Object[0]);
            if (r.a(SimulateLaunchActivity.entryAppId, this.m)) {
                d4.a(this);
            }
            this.f151o.n();
            m2 monitor = getMonitor();
            Intrinsics.EZpvd((Object) "sdk_init", "");
            p2.a(monitor, "sdk_init", (String) null, jElapsedRealtime);
            this.q.h();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void initH5Bridge(@NonNull View view, @NonNull String str) {
        Class<?> clsB = r.b("com.bytedance.applog.tracker.WebViewUtil");
        if (clsB == null) {
            this.D.warn("No WebViewUtil class, and will not initialize h5 bridge", new Object[0]);
            return;
        }
        try {
            Method declaredMethod = clsB.getDeclaredMethod("injectWebViewBridges", View.class, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, view, str);
        } catch (Throwable th) {
            this.D.error("Initialize h5 bridge failed", th, new Object[0]);
            b().a(th, "initH5Bridge");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void initMetaSec(@NonNull Context context) {
        if (getInitConfig() == null || getInitConfig().isMetaSecEnabled()) {
            Class<?> clsB = r.b("com.bytedance.applog.metasec.AppLogSecHelper");
            if (clsB == null) {
                this.D.debug("No AppLogSecHelper class, and will not init", new Object[0]);
                return;
            }
            try {
                Method declaredMethod = clsB.getDeclaredMethod("init", IAppLogInstance.class, Context.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, this, context);
            } catch (Throwable th) {
                this.D.error("Initialize AppLogSecHelper failed", th, new Object[0]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void initWebViewBridge(@NonNull View view, @NonNull String str) {
        Class<?> clsB = r.b("com.bytedance.applog.tracker.WebViewUtil");
        if (clsB != null) {
            try {
                clsB.getMethod("injectWebViewBridges", View.class, String.class).invoke(null, view, str);
            } catch (Throwable th) {
                this.D.error("Init webview bridge failed", th, new Object[0]);
                b().a(th, "initWebViewBridge");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    @Deprecated
    public void onMiscEvent(@NonNull String str, @Nullable JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null || jSONObject.length() <= 0) {
            this.D.warn("call onMiscEvent with invalid params", new Object[0]);
            return;
        }
        this.D.debug(Arrays.asList("customEvent", "miscEvent"), "logType:{} params:{} ", str, jSONObject.toString());
        try {
            jSONObject.put("log_type", str);
            receive(new i4("log_data", jSONObject));
        } catch (Throwable th) {
            this.D.error("call onMiscEvent error", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void profileAppend(JSONObject jSONObject) {
        if (b("profileAppend") || jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectA = r.a(jSONObject);
        try {
            if (!r.a(jSONObjectA, (Class<?>[]) new Class[]{String.class, Integer.class}, (Class<?>[]) new Class[]{String.class})) {
                this.D.warn("only support String、Int、String Array！", new Object[0]);
                return;
            }
        } catch (Throwable th) {
            this.D.error("JSON handle failed", th, new Object[0]);
        }
        r5.a(this.D, jSONObjectA);
        this.q.b(jSONObjectA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void profileIncrement(JSONObject jSONObject) {
        if (b("profileIncrement") || jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectA = r.a(jSONObject);
        try {
            if (!r.a(jSONObjectA, (Class<?>[]) new Class[]{Integer.class}, (Class<?>[]) null)) {
                this.D.warn("only support Int param", new Object[0]);
                return;
            }
        } catch (Throwable th) {
            this.D.error("JSON handle failed", th, new Object[0]);
        }
        r5.a(this.D, jSONObjectA);
        this.q.c(jSONObjectA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void profileSet(JSONObject jSONObject) {
        if (b("profileSet") || jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectA = r.a(jSONObject);
        r5.a(this.D, jSONObjectA);
        this.q.d(jSONObjectA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void profileSetOnce(JSONObject jSONObject) {
        if (b("profileSetOnce") || jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectA = r.a(jSONObject);
        r5.a(this.D, jSONObjectA);
        this.q.e(jSONObjectA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void profileUnset(String str) {
        if (b("profileUnset")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, "");
        } catch (Throwable th) {
            this.D.error("JSON handle failed", th, new Object[0]);
        }
        r5.a(this.D, jSONObject);
        this.q.f(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void receive(f4 f4Var) {
        if (f4Var == null) {
            return;
        }
        f4Var.m = this.m;
        if (this.q == null) {
            this.e.a(f4Var);
        } else {
            this.q.a(f4Var);
        }
        LogUtils.sendObject("event_receive", f4Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void removeHeaderInfo(String str) {
        if (a("removeHeaderInfo")) {
            return;
        }
        this.D.debug("call removeHeaderInfo isMainProcess: {}, key: {}", Boolean.valueOf(this.f151o.j()), str);
        if (this.f151o.j()) {
            this.p.d(str);
            return;
        }
        try {
            c(str);
        } catch (Throwable th) {
            this.D.debug("call removeHeaderInfo Post Main Process failed.", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setGPSLocation(float f, float f2, String str) {
        if (this.p == null) {
            this.D.warn("Please initialize first", new Object[0]);
        } else {
            this.B = new s(f, f2, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setHeaderInfo(String str, Object obj) {
        if (a("setHeaderInfo")) {
            return;
        }
        this.D.debug("call setHeaderInfo isMainProcess: {}, key: {}, value: {}", Boolean.valueOf(this.f151o.j()), str, obj);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f151o.j()) {
            HashMap<String, Object> map = new HashMap<>();
            map.put(str, obj);
            r5.a(this.D, map);
            this.p.a(map);
            return;
        }
        try {
            a(str, obj);
        } catch (Throwable th) {
            this.D.debug("call setHeaderInfo Post Main Process failed.", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setViewId(Object obj, String str) {
        if (obj == null) {
            return;
        }
        if (!r.a(obj, "android.support.v7.app.AlertDialog", "androidx.appcompat.app.AlertDialog")) {
            this.D.warn("Only support AlertDialog view", new Object[0]);
            return;
        }
        try {
            Window window = (Window) obj.getClass().getMethod("getWindow", new Class[0]).invoke(obj, new Object[0]);
            if (window != null) {
                window.getDecorView().setTag(R.id.applog_tag_view_id, str);
            }
        } catch (NoSuchMethodException e) {
            this.D.error("Not found getWindow method in alertDialog", e, new Object[0]);
        } catch (Throwable th) {
            this.D.error("Cannot set viewId for alertDialog", th, new Object[0]);
        }
    }

    @Override // com.bytedance.applog.IAppLogInstance
    public void onEventV3(@NonNull String str, @Nullable Bundle bundle, int i) {
        JSONObject jSONObject = null;
        if (bundle != null) {
            try {
                if (!bundle.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        for (String str2 : bundle.keySet()) {
                            jSONObject2.put(str2, bundle.get(str2));
                        }
                        jSONObject = jSONObject2;
                    } catch (Throwable th) {
                        th = th;
                        jSONObject = jSONObject2;
                        this.D.error("Parse event params failed", th, new Object[0]);
                        b().a(th, "onEventV3");
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        onEventV3(str, jSONObject, i);
    }

    @Override // com.bytedance.applog.IAppLogInstance
    public void receive(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (String str : strArr) {
        }
        if (this.q == null) {
            this.e.a(strArr);
            return;
        }
        f0 f0Var = this.q;
        f0Var.p.removeMessages(4);
        f0Var.p.obtainMessage(4, strArr).sendToTarget();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.applog.IAppLogInstance
    public void setUserUniqueID(@Nullable String str, @Nullable String str2) {
        synchronized (this.J) {
            if (this.p != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.q.a(str, str2);
                p2.a(getMonitor(), "api_usage", "setUserUniqueID", jElapsedRealtime);
                return;
            }
            h5<String> h5Var = this.H;
            h5Var.f188a = str;
            h5Var.b = true;
            this.D.debug("cache uuid before init id -> " + str, new Object[0]);
            h5<String> h5Var2 = this.I;
            h5Var2.f188a = str2;
            h5Var2.b = true;
            this.D.debug("cache uuid before init type -> " + str2, new Object[0]);
        }
    }

    @Override // com.bytedance.applog.IAppLogInstance
    public void onEventV3(@NonNull String str, @Nullable JSONObject jSONObject, int i) {
        if (TextUtils.isEmpty(str)) {
            this.D.error("event name is empty", new Object[0]);
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        JSONObject jSONObjectA = r.a(jSONObject);
        IAppLogLogger iAppLogLogger = this.D;
        List<String> listAsList = Arrays.asList("customEvent", "eventV3");
        Object[] objArr = new Object[3];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = jSONObjectA != null ? jSONObjectA.toString() : null;
        iAppLogLogger.debug(listAsList, "[event_process][receive] event:{} type:{} params:{} ", objArr);
        InitConfig initConfig = getInitConfig();
        if (initConfig != null && initConfig.isLogEnable()) {
            r5.a(this.D, str, jSONObjectA);
        }
        receive(new m4(this.m, str, false, jSONObjectA != null ? jSONObjectA.toString() : null, i));
        m2 monitor = getMonitor();
        String sessionId = getSessionId();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        a3 a3Var = new a3();
        a3Var.f132a = "onEventV3";
        a3Var.b = jElapsedRealtime2 - jElapsedRealtime;
        if (monitor != null) {
            ((r2) monitor).a(a3Var);
        }
        if (monitor != null) {
            if (sessionId == null) {
                sessionId = "";
            }
            ((r2) monitor).a(new y2(0L, sessionId, 1L));
        }
    }

    @Override // com.bytedance.applog.IAppLogInstance
    public void setHeaderInfo(HashMap<String, Object> map) {
        if (a("setHeaderInfo")) {
            return;
        }
        r5.a(this.D, map);
        this.p.a(map);
    }

    public final void a(Object obj, JSONObject jSONObject) {
        boolean z;
        Activity activity;
        if (this.r == null || obj == null) {
            return;
        }
        m4 m4Var = new m4("bav2b_page", true);
        JSONObject jSONObject2 = new JSONObject();
        String name = obj.getClass().getName();
        Iterator<Class<?>> it = k5.d.iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                if (it.next().isInstance(obj)) {
                    try {
                        activity = (Activity) obj.getClass().getMethod("getActivity", new Class[0]).invoke(obj, new Object[0]);
                    } catch (Throwable unused) {
                        activity = null;
                    }
                    if (activity != null) {
                        name = activity.getClass().getName() + ":" + name;
                    }
                    z = true;
                }
            }
        }
        try {
            jSONObject2.put("page_key", name);
            jSONObject2.put("is_fragment", z);
            jSONObject2.put("duration", 1000L);
            jSONObject2.put("page_title", k5.c(obj));
            jSONObject2.put("page_path", k5.b(obj));
            jSONObject2.put("is_custom", true);
            r.c(jSONObject, jSONObject2);
        } catch (Throwable unused2) {
        }
        m4Var.f175o = jSONObject2;
        receive(m4Var);
    }
}
