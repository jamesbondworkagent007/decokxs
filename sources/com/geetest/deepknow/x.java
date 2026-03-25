package com.geetest.deepknow;

import android.os.Handler;
import android.os.Looper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class x implements DPListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f409a = new Handler(Looper.getMainLooper());
    private DPListener b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f410a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(JSONObject jSONObject) {
            this.f410a = jSONObject;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            try {
                x.this.b.onSessionResult(this.f410a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f411a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(JSONObject jSONObject) {
            this.f411a = jSONObject;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            try {
                x.this.b.onSessionResult(this.f411a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(DPListener dPListener) {
        this.b = dPListener;
    }

    @Override // com.geetest.deepknow.DPListener
    public void onSessionStatus(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static x a(DPListener dPListener) {
        return new x(dPListener);
    }

    private void a(JSONObject jSONObject) {
        Handler handler = this.f409a;
        if (handler != null) {
            handler.post(new a(jSONObject));
        } else {
            new Handler(Looper.getMainLooper()).post(new b(jSONObject));
        }
    }

    @Override // com.geetest.deepknow.DPListener
    public void onSessionResult(JSONObject jSONObject) {
        if (this.b == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a(jSONObject);
            return;
        }
        try {
            this.b.onSessionResult(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
