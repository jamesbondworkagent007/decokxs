package com.bytedance.bdtracker;

import com.bytedance.applog.log.LoggerImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface u2 extends t2 {

    public static final class a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static JSONObject a(u2 u2Var) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("metrics_category", u2Var.e());
                jSONObject.put("metrics_name", u2Var.b());
                jSONObject.put("metrics_value", u2Var.g());
                u2Var.a(jSONObject);
            } catch (Throwable th) {
                LoggerImpl.global().error("JSON handle failed", th, new Object[0]);
            }
            return jSONObject;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void a(@NotNull JSONObject jSONObject) {
            Intrinsics.EZpvd((Object) jSONObject, "");
        }
    }

    void a(@NotNull JSONObject jSONObject);

    String b();

    JSONObject d();

    String e();

    Object g();
}
