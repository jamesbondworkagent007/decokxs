package com.bytedance.bdtracker;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.applog.migrate.MigrateDetectorActivity;
import com.bytedance.applog.store.kv.IKVStore;

/* JADX INFO: loaded from: classes2.dex */
public final class l2 {
    public static volatile l2 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f210a;
    public final ComponentName b;
    public final boolean c;
    public final IKVStore d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l2(Context context) {
        int componentEnabledSetting;
        int i;
        Context applicationContext = context.getApplicationContext();
        IKVStore iKVStoreA = x4.a(applicationContext, "bdtracker_dr_migrate_detector");
        this.d = iKVStoreA;
        PackageManager packageManager = applicationContext.getPackageManager();
        this.f210a = packageManager;
        ComponentName componentName = new ComponentName(context, (Class<?>) MigrateDetectorActivity.class);
        this.b = componentName;
        try {
            componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            i = iKVStoreA.getInt("component_state", 0);
            IAppLogLogger iAppLogLoggerGlobal = LoggerImpl.global();
            StringBuilder sbA = a.a("MigrateDetector#isMigrateInternal cs=");
            sbA.append(a(componentEnabledSetting));
            sbA.append(" ss=");
            sbA.append(a(i));
            iAppLogLoggerGlobal.debug(sbA.toString(), new Object[0]);
        } catch (Exception unused) {
        }
        boolean z = componentEnabledSetting == 0 && i == 2;
        this.c = z;
        IAppLogLogger iAppLogLoggerGlobal2 = LoggerImpl.global();
        StringBuilder sbA2 = a.a("MigrateDetector#constructor migrate=");
        sbA2.append(z);
        iAppLogLoggerGlobal2.debug(sbA2.toString(), new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static l2 a(Context context) {
        if (e == null) {
            synchronized (l2.class) {
                if (e == null) {
                    e = new l2(context);
                }
            }
        }
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "STATE_DISABLED" : "STATE_ENABLED" : "STATE_DEFAULT";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a() {
        LoggerImpl.global().debug("MigrateDetector#disableComponent", new Object[0]);
        this.f210a.setComponentEnabledSetting(this.b, 2, 1);
        this.d.putInt("component_state", 2);
    }
}
