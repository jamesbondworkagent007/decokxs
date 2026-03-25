package com.geetest.deepknow;

import android.content.Context;
import androidx.work.PeriodicWorkRequest;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f400a;
    private boolean b = false;

    public class a implements Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            s.this.f400a.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(j jVar) {
        this.f400a = jVar;
    }

    public void a(Context context) {
        if (this.b) {
            return;
        }
        a();
        this.b = true;
    }

    private void a() {
        c.a().a(new a(), PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, TimeUnit.MILLISECONDS);
    }
}
