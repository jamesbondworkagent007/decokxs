package com.bytedance.bdtracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.applog.store.kv.IKVStore;
import com.bytedance.applog.util.HardwareUtils;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class r4 extends g4 {
    public static r4 f;
    public final IKVStore c;
    public IKVStore d;
    public boolean e;

    /* JADX INFO: loaded from: classes14.dex */
    public interface a {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public r4(Context context, String str, boolean z) {
        this.e = false;
        this.c = x4.a(context, str);
        this.e = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public r4(InitConfig initConfig, Context context, String str, String str2) {
        this.e = false;
        this.c = x4.a(initConfig, context, str);
        this.d = x4.a(initConfig, context, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SharedPreferences a(Context context, String str, int i) {
        Context contextCreateDeviceProtectedStorageContext;
        Throwable th;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            } catch (Throwable th2) {
                contextCreateDeviceProtectedStorageContext = context;
                th = th2;
            }
            try {
                if (!contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
                    LoggerImpl.global().warn(Collections.singletonList("SharedPreferenceCacheHelper"), "Failed to migrate shared preferences.", new Object[0]);
                }
            } catch (Throwable th3) {
                th = th3;
                LoggerImpl.global().error(Collections.singletonList("SharedPreferenceCacheHelper"), "Create protected storage context failed", th, new Object[0]);
            }
            context = contextCreateDeviceProtectedStorageContext;
        }
        return context.getSharedPreferences(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static r4 a(Context context) {
        r4 r4Var;
        synchronized (r4.class) {
            if (f == null) {
                f = new r4(context, "_global_cache", true);
            }
            r4Var = f;
        }
        return r4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.g4
    public void a(String str) {
        IKVStore iKVStoreC = c(str);
        if (iKVStoreC != null && iKVStoreC.contains(str)) {
            iKVStoreC.remove(str);
        }
        super.a(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.g4
    public void a(String str, String str2) {
        if (this.e || !TextUtils.isEmpty(str2)) {
            IKVStore iKVStoreC = c(str);
            if (this.e && str2 == null) {
                str2 = "";
            }
            iKVStoreC.putString(str, str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.g4
    public String b(String str) {
        return c(str).getString(str, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IKVStore c(String str) {
        IKVStore iKVStore;
        return (!"device_id".equals(str) || (iKVStore = this.d) == null) ? this.c : iKVStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String a(String str, a aVar) {
        synchronized (this) {
            if (c(str).contains(str)) {
                return c(str).getString(str, null);
            }
            String strA = aVar != null ? ((HardwareUtils.a) aVar).a() : null;
            a(str, strA);
            return strA;
        }
    }
}
