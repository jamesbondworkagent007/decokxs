package com.bytedance.bdtracker;

import android.os.Process;
import androidx.annotation.NonNull;
import com.bytedance.applog.exception.AppCrashType;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.bdtracker.b;
import java.lang.Thread;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements Thread.UncaughtExceptionHandler {
    public static volatile n0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f226a = Thread.getDefaultUncaughtExceptionHandler();

    public class a implements b.e {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(n0 n0Var) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.bdtracker.b.e
        public boolean a(d dVar) {
            return dVar.getInitConfig() != null && AppCrashType.hasJavaCrashType(dVar.getInitConfig().getTrackCrashType());
        }
    }

    public class b implements b.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f227a;
        public final /* synthetic */ b.e b;
        public final /* synthetic */ m4 c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b(n0 n0Var, Throwable th, b.e eVar, m4 m4Var) {
            this.f227a = th;
            this.b = eVar;
            this.c = m4Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.bdtracker.b.d
        public void a(d dVar) {
            if (dVar.getInitConfig() != null && dVar.getInitConfig().isMonitorEnabled()) {
                p2.b(dVar.getMonitor(), this.f227a);
            }
            if (this.b.a(dVar)) {
                dVar.receive(this.c);
                dVar.flush();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public n0() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a() {
        synchronized (n0.class) {
            if (b == null) {
                b = new n0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVar = new a(this);
        if (!com.bytedance.bdtracker.b.a(aVar)) {
            com.bytedance.bdtracker.b.a(new o0(this, th));
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f226a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            }
            try {
                Process.killProcess(Process.myPid());
                System.exit(10);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$is_backstage", !t.b);
            jSONObject.put("$event_time", jCurrentTimeMillis);
            jSONObject.put("$crash_thread", thread.getName());
            jSONObject.put("$crash_process", r.b());
            StringBuilder sb = new StringBuilder();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                sb.append(cause.toString());
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    sb.append("\n\tat ");
                    sb.append(stackTraceElement);
                }
            }
            jSONObject.put("$detailed_stack", sb.length() > 2000 ? sb.substring(0, 2000) : sb.toString());
        } catch (Throwable th2) {
            LoggerImpl.global().error(Collections.singletonList("ExceptionHandler"), "Collect crash params failed", th2, new Object[0]);
        }
        com.bytedance.bdtracker.b.a(new b(this, th, aVar, new m4("$crash", jSONObject)));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f226a;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }
}
