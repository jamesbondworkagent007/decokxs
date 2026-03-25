package com.bytedance.bdtracker;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.log.LoggerImpl;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f183a;

    public static final class a implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f184a;
        public final /* synthetic */ v1 b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(Context context, v1 v1Var) {
            this.f184a = context;
            this.b = v1Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        public String call() {
            AdvertisingIdClient.Info advertisingIdInfo;
            if (TextUtils.isEmpty(g5.f183a)) {
                synchronized (g5.class) {
                    if (!TextUtils.isEmpty(g5.f183a)) {
                        return g5.f183a;
                    }
                    try {
                        advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f184a);
                    } catch (Throwable th) {
                        if (!(th instanceof ClassNotFoundException) && !(th instanceof NoClassDefFoundError)) {
                            LoggerImpl.global().error("Query Gaid failed", th, new Object[0]);
                        }
                    }
                    String id = advertisingIdInfo != null ? advertisingIdInfo.getId() : null;
                    if (TextUtils.isEmpty(id)) {
                        id = this.b.f.getString("google_aid", null);
                    } else if (!TextUtils.equals(this.b.f.getString("google_aid", null), id)) {
                        v1 v1Var = this.b;
                        if (!TextUtils.isEmpty(id) && v1Var != null) {
                            v1Var.f.putString("google_aid", id);
                        }
                    }
                    g5.f183a = id;
                }
            }
            return g5.f183a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Context context, v1 v1Var) {
        return (String) y.f301a.submit(new a(context, v1Var)).get(v1Var.c.getGaidTimeOutMilliSeconds(), TimeUnit.MILLISECONDS);
    }
}
