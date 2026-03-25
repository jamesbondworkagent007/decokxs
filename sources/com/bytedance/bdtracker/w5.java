package com.bytedance.bdtracker;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.IOaidObserver;
import com.bytedance.applog.OaidHelper;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.applog.store.kv.IKVStore;
import com.bytedance.bdtracker.f0;
import com.bytedance.dr.OaidApi;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u5<y5> f291a = new a();

    public static final class a extends u5<y5> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.u5
        public y5 a(Object[] objArr) {
            return new y5((Context) objArr[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optString("id", null);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(@Nullable IOaidObserver iOaidObserver) {
        y5.a(iOaidObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(@Nullable g gVar) {
        g gVar2;
        y5.k = gVar;
        Map<String, String> map = y5.m;
        if (map == null || (gVar2 = y5.k) == null) {
            return;
        }
        ((f0.b) gVar2).a(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void b(@NonNull Context context) {
        LoggerImpl.global().debug(1, "Oaid#initOaidEarly", new Object[0]);
        f291a.b(context).a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void b(IOaidObserver iOaidObserver) {
        y5.b(iOaidObserver);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static String a(IKVStore iKVStore) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strB = v5.f279a.b(iKVStore);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        LoggerImpl.global().debug(1, "getCdid takes " + (jElapsedRealtime2 - jElapsedRealtime) + " ms", new Object[0]);
        return strB;
    }

    /* JADX DEBUG: Incorrect args count in method signature: (Landroid/content/Context;Lcom/bytedance/applog/store/kv/IKVStore;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>; */
    public static Map a(@NonNull Context context) {
        Map<String, String> map;
        Throwable th;
        boolean zTryLock;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        y5 y5VarB = f291a.b(context);
        long j = OaidHelper.oadiTimeout;
        if (y5VarB.c) {
            y5VarB.a();
            LoggerImpl.global().debug(1, "Oaid#getOaid timeoutMills=" + j, new Object[0]);
            if (y5.m == null) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                try {
                    OaidApi oaidApi = y5VarB.b;
                    if (oaidApi != null && "HONOR".equalsIgnoreCase(oaidApi.getName())) {
                        j += 100;
                    }
                    zTryLock = y5VarB.f308a.tryLock(j, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    th = th2;
                    zTryLock = false;
                }
                try {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    LoggerImpl.global().debug(1, "Oaid#getOaid locked=" + zTryLock + ", took " + (jElapsedRealtime3 - jElapsedRealtime2) + " ms", new Object[0]);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        LoggerImpl.global().error(1, "Oaid#Get oaid failed", th, new Object[0]);
                        LoggerImpl.global().debug(1, "Oaid#getOaid return apiMap={}", y5.m);
                        map = y5.m;
                        long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                        LoggerImpl.global().debug(1, "Oaid#getOaid takes " + (jElapsedRealtime4 - jElapsedRealtime) + " ms", new Object[0]);
                        return map;
                    } finally {
                        if (zTryLock) {
                            y5VarB.f308a.unlock();
                        }
                    }
                }
                if (zTryLock) {
                }
            }
            LoggerImpl.global().debug(1, "Oaid#getOaid return apiMap={}", y5.m);
            map = y5.m;
        } else {
            map = null;
        }
        long jElapsedRealtime42 = SystemClock.elapsedRealtime();
        LoggerImpl.global().debug(1, "Oaid#getOaid takes " + (jElapsedRealtime42 - jElapsedRealtime) + " ms", new Object[0]);
        return map;
    }
}
