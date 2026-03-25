package com.bytedance.dr.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.bdtracker.c6;
import com.bytedance.bdtracker.j5;
import com.bytedance.dr.OaidApi;
import com.huawei.hms.common.PackageConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements OaidApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f317a;

    public static class a extends OaidApi.a {
        public long c = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.dr.OaidApi
    public String getName() {
        return "Huawei";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.dr.OaidApi
    public OaidApi.a getOaid(@NonNull Context context) {
        Throwable th;
        c6.a aVar;
        String string;
        String string2;
        a aVar2 = new a();
        int i = 0;
        try {
            string = Settings.Global.getString(context.getContentResolver(), "pps_oaid");
            string2 = Settings.Global.getString(context.getContentResolver(), "pps_track_limit");
        } catch (Throwable th2) {
            LoggerImpl.global().error(1, "getOaid failed", th2, new Object[0]);
        }
        if (TextUtils.isEmpty(string)) {
            Pair pair = null;
            objA = null;
            Object objA = null;
            if (!TextUtils.isEmpty(this.f317a)) {
                c6 c6Var = new c6(context, new Intent("com.uodis.opendevice.OPENIDS_SERVICE").setPackage(this.f317a), new com.bytedance.dr.impl.a(this));
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    LoggerImpl.global().warn(1, "Oaid#can't run in ui thread", new Object[0]);
                } else {
                    try {
                        aVar = new c6.a(c6Var, c6Var.f148a, c6Var.c);
                        c6Var.d.bindService(c6Var.b, aVar, 1);
                        c6Var.f148a.await();
                    } catch (Throwable th3) {
                        th = th3;
                        aVar = null;
                    }
                    try {
                        objA = ((com.bytedance.dr.impl.a) c6Var.c).a(aVar.c);
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            LoggerImpl.global().error(1, "Oaid#blockFetchResult failed", th, new Object[0]);
                        } finally {
                            c6Var.a(aVar);
                        }
                    }
                }
                pair = (Pair) objA;
            }
            if (pair != null) {
                aVar2.f315a = (String) pair.first;
                aVar2.b = ((Boolean) pair.second).booleanValue();
                try {
                    PackageInfo packageInfoA = j5.a(context, this.f317a, 0);
                    if (packageInfoA != null) {
                        i = packageInfoA.versionCode;
                    }
                } catch (Throwable th5) {
                    LoggerImpl.global().error(1, "getHwIdVersionCode failed", th5, new Object[0]);
                }
                aVar2.c = i;
            }
        } else {
            aVar2.f315a = string;
            aVar2.b = Boolean.parseBoolean(string2);
            aVar2.c = 202003021704L;
        }
        return aVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.dr.OaidApi
    public boolean support(Context context) {
        if (context == null) {
            return false;
        }
        String str = "com.huawei.hwid";
        if (!j5.a(context, "com.huawei.hwid")) {
            str = "com.huawei.hwid.tv";
            if (!j5.a(context, "com.huawei.hwid.tv")) {
                this.f317a = PackageConstants.SERVICES_PACKAGE_ALL_SCENE;
                return j5.a(context, PackageConstants.SERVICES_PACKAGE_ALL_SCENE);
            }
        }
        this.f317a = str;
        return true;
    }
}
