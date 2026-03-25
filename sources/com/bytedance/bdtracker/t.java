package com.bytedance.bdtracker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.bdtracker.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f259a = new l0(null, "@APPLOG_APP_USE");
    public static boolean b = false;
    public static int c;
    public static p4 d;
    public static p4 e;
    public static long f;
    public static String g;
    public static final Map<Integer, List<p4>> h;
    public static final Map<Integer, b> i;
    public static p4 j;
    public static final HashSet<Integer> k;
    public static volatile t l;

    public static final class a implements b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p4 f260a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(p4 p4Var) {
            this.f260a = p4Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.bdtracker.b.e
        public boolean a(d dVar) {
            if (com.bytedance.bdtracker.b.b.a(dVar)) {
                return !this.f260a.D;
            }
            return false;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p4 f261a;
        public WeakReference<Object> b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        Arrays.asList("android.arch.lifecycle.ReportFragment", "androidx.lifecycle.ReportFragment");
        Collections.singletonList("com.bumptech.glide.manager.SupportRequestManagerFragment");
        c = 0;
        h = new HashMap();
        i = new ConcurrentHashMap();
        k = new HashSet<>(8);
        l = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static p4 a() {
        p4 p4Var = d;
        p4 p4Var2 = e;
        if (p4Var2 != null) {
            return p4Var2;
        }
        if (p4Var != null) {
            return p4Var;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static p4 a(Class<?> cls, boolean z, String str, String str2, String str3, String str4, long j2, JSONObject jSONObject) {
        p4 p4Var = new p4();
        p4Var.E = cls;
        if (TextUtils.isEmpty(str2)) {
            p4Var.u = str;
        } else {
            p4Var.u = str + ":" + str2;
        }
        p4Var.a(j2);
        p4Var.z = j2;
        p4Var.s = -1L;
        p4 p4Var2 = j;
        p4Var.t = p4Var2 != null ? p4Var2.u : "";
        if (str3 == null) {
            str3 = "";
        }
        p4Var.v = str3;
        p4Var.w = p4Var2 != null ? p4Var2.v : "";
        if (str4 == null) {
            str4 = "";
        }
        p4Var.x = str4;
        p4Var.y = p4Var2 != null ? p4Var2.x : "";
        p4Var.f175o = jSONObject;
        p4Var.D = z;
        a(p4Var, true);
        j = p4Var;
        LoggerImpl.global().debug("[Navigator] resumePage page.name：{}", p4Var.u);
        return p4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static p4 a(boolean z, p4 p4Var, long j2) {
        p4 p4Var2 = (p4) p4Var.m6119clone();
        p4Var2.a(j2);
        long j3 = j2 - p4Var.c;
        if (j3 <= 0) {
            j3 = 1000;
        }
        p4Var2.s = j3;
        p4Var2.D = z;
        a(p4Var2, false);
        LoggerImpl.global().debug("[Navigator] pausePage page.name：{}, duration：{}", p4Var2.u, Long.valueOf(p4Var2.s));
        return p4Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static t a(Application application) {
        t tVar;
        synchronized (t.class) {
            if (l == null) {
                l = new t();
                application.registerActivityLifecycleCallbacks(l);
            }
            tVar = l;
        }
        return tVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(p4 p4Var, boolean z) {
        com.bytedance.bdtracker.b.a(p4Var, new a(p4Var));
        if (z) {
            com.bytedance.bdtracker.b.a(new u(p4Var), new v(p4Var));
        } else {
            com.bytedance.bdtracker.b.a(new w(p4Var), new x(p4Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(Activity activity, int i2) {
        p4 p4VarA = a(activity.getClass(), false, activity.getClass().getName(), "", k5.c(activity), k5.b(activity), System.currentTimeMillis(), k5.d(activity));
        d = p4VarA;
        p4VarA.A = !k.remove(Integer.valueOf(i2)) ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        k.add(Integer.valueOf(activity.hashCode()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        k.remove(Integer.valueOf(activity.hashCode()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f259a.a(jCurrentTimeMillis);
        b = false;
        IAppLogLogger iAppLogLoggerGlobal = LoggerImpl.global();
        Object[] objArr = new Object[1];
        objArr[0] = activity != null ? activity.getClass().getName() : "";
        iAppLogLoggerGlobal.debug("[Navigator] onActivityPaused:{}", objArr);
        for (b bVar : i.values()) {
            if (bVar != null) {
                Object obj = bVar.b.get();
                LoggerImpl.global().debug("[Navigator] onFragPause:frag：{}", obj);
                if (obj != null) {
                    Map<Integer, b> map = i;
                    if (!map.isEmpty() && map.containsKey(Integer.valueOf(obj.hashCode()))) {
                        b bVar2 = map.get(Integer.valueOf(obj.hashCode()));
                        if (bVar2.b.get() == null) {
                            map.remove(Integer.valueOf(obj.hashCode()));
                            LoggerImpl.global().debug("[Navigator] inFragmentCache frag already recycle：{}", obj);
                        }
                        if (bVar2.b.get() == obj) {
                            p4 p4Var = map.get(Integer.valueOf(obj.hashCode())).f261a;
                            map.remove(Integer.valueOf(obj.hashCode()));
                            LoggerImpl.global().debug("[Navigator] onFragPause:page：{}", p4Var);
                            if (p4Var != null) {
                                a(true, p4Var, System.currentTimeMillis());
                            }
                            e = null;
                        }
                    }
                }
                LoggerImpl.global().debug("[Navigator] onFragPause not in cache：{}", obj);
            }
        }
        i.clear();
        p4 p4Var2 = d;
        if (p4Var2 != null) {
            g = p4Var2.u;
            f = jCurrentTimeMillis;
            a(false, p4Var2, jCurrentTimeMillis);
            d = null;
            if (activity != null) {
                activity.isChild();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f259a.c(jCurrentTimeMillis);
        b = true;
        String strC = k5.c(activity);
        LoggerImpl.global().debug("[Navigator] onActivityResumed:{} {}", strC, activity.getClass().getName());
        p4 p4VarA = a(activity.getClass(), false, activity.getClass().getName(), "", strC, k5.b(activity), jCurrentTimeMillis, k5.d(activity));
        d = p4VarA;
        p4VarA.A = !k.remove(Integer.valueOf(activity.hashCode())) ? 1 : 0;
        activity.isChild();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        c++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (g != null) {
            int i2 = c - 1;
            c = i2;
            if (i2 <= 0) {
                g = null;
                f = 0L;
                com.bytedance.bdtracker.b.a(new c());
            }
        }
    }
}
