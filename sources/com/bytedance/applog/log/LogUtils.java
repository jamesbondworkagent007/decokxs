package com.bytedance.applog.log;

import com.bytedance.applog.log.EventBus;
import com.bytedance.bdtracker.f4;
import com.bytedance.bdtracker.i4;
import com.bytedance.bdtracker.m4;
import com.bytedance.bdtracker.n4;
import com.bytedance.bdtracker.p4;
import com.bytedance.bdtracker.q4;
import com.bytedance.bdtracker.r;
import com.bytedance.bdtracker.s4;
import com.bytedance.bdtracker.t4;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LogUtils {
    public static final String EVENT_TYPE_EVENT_V3 = "EVENT_V3";
    public static final String EVENT_TYPE_LAUNCH = "LAUNCH";
    public static final String EVENT_TYPE_PROFILE = "PROFILE";
    public static final String EVENT_TYPE_TERMINATE = "TERMINATE";
    public static final String EVENT_TYPE_TRACE = "TRACE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f120a = false;

    public static final class a implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f121a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(Object obj) {
            this.f121a = obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            f4 f4Var;
            String upperCase;
            JSONObject jSONObjectH = ((f4) this.f121a).h();
            JSONObject jSONObject = new JSONObject();
            r.c(jSONObjectH, jSONObject);
            try {
                jSONObject.put("$$APP_ID", ((f4) this.f121a).m);
                f4Var = (f4) this.f121a;
            } catch (JSONException unused) {
            }
            if (f4Var != null) {
                if ((f4Var instanceof m4) || (f4Var instanceof p4)) {
                    upperCase = LogUtils.EVENT_TYPE_EVENT_V3;
                } else if (f4Var instanceof i4) {
                    upperCase = ((i4) f4Var).s.toUpperCase(Locale.ROOT);
                } else if (f4Var instanceof n4) {
                    upperCase = LogUtils.EVENT_TYPE_LAUNCH;
                } else if (f4Var instanceof s4) {
                    upperCase = LogUtils.EVENT_TYPE_TERMINATE;
                } else if (f4Var instanceof q4) {
                    upperCase = LogUtils.EVENT_TYPE_PROFILE;
                } else if (f4Var instanceof t4) {
                    upperCase = "TRACE";
                }
                jSONObject.put("$$EVENT_TYPE", upperCase);
                jSONObject.put("$$EVENT_LOCAL_ID", ((f4) this.f121a).p);
                return jSONObject;
            }
            upperCase = "";
            jSONObject.put("$$EVENT_TYPE", upperCase);
            jSONObject.put("$$EVENT_LOCAL_ID", ((f4) this.f121a).p);
            return jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(String str) {
        return com.bytedance.bdtracker.a.a("applog_", str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isDisabled() {
        return !f120a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void sendJson(String str, JSONObject jSONObject) {
        if (isDisabled() || r.c(str)) {
            return;
        }
        EventBus.global.get(new Object[0]).emit(a(str), jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void sendJsonFetcher(String str, EventBus.DataFetcher dataFetcher) {
        if (isDisabled() || r.c(str)) {
            return;
        }
        EventBus.global.get(new Object[0]).emit(a(str), dataFetcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void sendObject(String str, Object obj) {
        if (isDisabled() || r.c(str)) {
            return;
        }
        if (obj instanceof f4) {
            EventBus.global.get(new Object[0]).emit(a(str), (EventBus.DataFetcher) new a(obj));
        } else {
            EventBus.global.get(new Object[0]).emit(a(str), obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void sendString(String str, String str2) {
        if (isDisabled() || r.c(str)) {
            return;
        }
        EventBus.global.get(new Object[0]).emit(a(str), str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setEnable(boolean z) {
        f120a = z;
    }
}
