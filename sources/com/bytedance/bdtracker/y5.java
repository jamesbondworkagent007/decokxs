package com.bytedance.bdtracker;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bytedance.applog.IOaidObserver;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.bdtracker.f0;
import com.bytedance.dr.OaidApi;
import com.bytedance.dr.OaidFactory;
import com.bytedance.dr.impl.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class y5 {
    public static final String h;
    public static final String i;
    public static final List<IOaidObserver> j;
    public static g k;
    public static String l;
    public static Map<String, String> m;
    public final OaidApi b;
    public final boolean c;
    public final a6 d;
    public final Context e;
    public Long g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f308a = new ReentrantLock();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public class a implements Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public void run() {
            LoggerImpl.global().debug(1, "Oaid#init switch thread", new Object[0]);
            y5.this.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        String str = y5.class.getSimpleName() + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER;
        h = str;
        i = str;
        j = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public y5(Context context) {
        this.e = context.getApplicationContext();
        OaidApi oaidApiCreateOaidImpl = OaidFactory.createOaidImpl(context);
        this.b = oaidApiCreateOaidImpl;
        if (oaidApiCreateOaidImpl != null) {
            this.c = oaidApiCreateOaidImpl.support(context);
        } else {
            this.c = false;
        }
        this.d = new a6(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(@Nullable IOaidObserver.Oaid oaid, Object[] objArr) {
        if (oaid == null || objArr == null) {
            return;
        }
        for (Object obj : objArr) {
            ((IOaidObserver) obj).onOaidLoaded(oaid);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(@Nullable IOaidObserver iOaidObserver) {
        g gVar;
        List<IOaidObserver> list = j;
        synchronized (list) {
            list.add(iOaidObserver);
        }
        String str = l;
        if (str != null) {
            a(new IOaidObserver.Oaid(str), new Object[]{iOaidObserver});
        }
        Map<String, String> map = m;
        if (map == null || (gVar = k) == null) {
            return;
        }
        ((f0.b) gVar).a(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <K, V> void a(Map<K, V> map, K k2, V v) {
        if (k2 == null || v == null) {
            return;
        }
        map.put(k2, v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(JSONObject jSONObject, String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (Throwable th) {
            LoggerImpl.global().error(1, "Oaid#JSON put failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void b(IOaidObserver iOaidObserver) {
        List<IOaidObserver> list = j;
        synchronized (list) {
            list.remove(iOaidObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Object[] c() {
        Object[] array;
        List<IOaidObserver> list = j;
        synchronized (list) {
            array = list.size() > 0 ? list.toArray() : null;
        }
        return array;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        LoggerImpl.global().debug(1, "Oaid#init", new Object[0]);
        if (this.f.compareAndSet(false, true)) {
            a aVar = new a();
            String str = i + "-query";
            if (TextUtils.isEmpty(str)) {
                str = "TrackerDr";
            }
            new Thread(new x5(aVar, str), str).start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void b() {
        String str;
        Boolean boolValueOf;
        int iIntValue;
        OaidApi.a oaid;
        LoggerImpl.global().debug(1, "Oaid#initOaid", new Object[0]);
        try {
            this.f308a.lock();
            LoggerImpl.global().debug(1, "Oaid#initOaid exec", new Object[0]);
            z5 z5VarA = this.d.a();
            LoggerImpl.global().debug(1, "Oaid#initOaid fetch={}", z5VarA);
            if (z5VarA != null) {
                l = z5VarA.f314a;
                m = z5VarA.a();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.e;
            OaidApi oaidApi = this.b;
            z5 z5Var = null;
            String string = null;
            if (oaidApi == null || (oaid = oaidApi.getOaid(context)) == null) {
                str = null;
                boolValueOf = null;
            } else {
                str = oaid.f315a;
                boolValueOf = Boolean.valueOf(oaid.b);
                if (oaid instanceof b.a) {
                    this.g = Long.valueOf(((b.a) oaid).c);
                }
            }
            Pair pair = new Pair(str, boolValueOf);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (pair.first != null) {
                if (z5VarA != null) {
                    string = z5VarA.b;
                    iIntValue = z5VarA.f.intValue() + 1;
                } else {
                    iIntValue = -1;
                }
                if (TextUtils.isEmpty(string)) {
                    string = UUID.randomUUID().toString();
                }
                if (iIntValue <= 0) {
                    iIntValue = 1;
                }
                z5 z5Var2 = new z5((String) pair.first, string, (Boolean) pair.second, Long.valueOf(jElapsedRealtime2 - jElapsedRealtime), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(iIntValue), this.g);
                this.d.a(z5Var2);
                z5Var = z5Var2;
            }
            if (z5Var != null) {
                l = z5Var.f314a;
                m = z5Var.a();
            }
            LoggerImpl.global().debug(1, "Oaid#initOaid oaidModel={}", z5Var);
        } finally {
            this.f308a.unlock();
            a(new IOaidObserver.Oaid(l), c());
            g gVar = k;
            if (gVar != null) {
                ((f0.b) gVar).a(m);
            }
        }
    }
}
