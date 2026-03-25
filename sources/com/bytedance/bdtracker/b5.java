package com.bytedance.bdtracker;

import com.bytedance.applog.log.LoggerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class b5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c5 f141a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public b5(c5 c5Var) {
        this.f141a = c5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.f141a.f147a.size(); i++) {
            try {
                String[] strArr = {"openudid", "clientudid", "serial_number", "sim_serial_number", "udid", "device_id"};
                for (int i2 = 0; i2 < 6; i2++) {
                    String str = strArr[i2];
                    try {
                        c5 c5Var = this.f141a;
                        c5Var.a(c5Var.f147a.get(i), str);
                    } catch (Exception e) {
                        LoggerImpl.global().error("DeprecatedFileCleaner execute failed", e, new Object[0]);
                    }
                }
            } catch (Exception unused) {
                return;
            }
        }
    }
}
