package com.bytedance.bdtracker;

import android.net.Uri;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.network.INetworkClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f243a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public q(@NotNull d dVar) {
        Intrinsics.EZpvd((Object) dVar, "");
        this.f243a = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m<k> a(@NotNull String str, @NotNull l lVar) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) lVar, "");
        try {
            INetworkClient netClient = this.f243a.getNetClient();
            a4 a4Var = this.f243a.k;
            Intrinsics.AEQbTJ(a4Var, "");
            byte[] bArrExecute = netClient.execute((byte) 0, a4Var.c.a(a(str, lVar.a())), null, a(), (byte) 0, true, 60000);
            Intrinsics.AEQbTJ(bArrExecute, "");
            return m.c.a(new String(bArrExecute, Charsets.UTF_8), k.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String a(String str, JSONObject jSONObject) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null && strOptString.length() != 0) {
                builderBuildUpon.appendQueryParameter(next, jSONObject.optString(next));
            }
        }
        return builderBuildUpon.build().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> a() {
        HashMap map = new HashMap(2);
        InitConfig initConfig = this.f243a.getInitConfig();
        if (initConfig != null) {
            Map<String, String> httpHeaders = initConfig.getHttpHeaderCallback() != null ? initConfig.getHttpHeaderCallback().get() : initConfig.getHttpHeaders();
            if (httpHeaders != null && (!httpHeaders.isEmpty())) {
                map.putAll(httpHeaders);
            }
        }
        return f5.a((HashMap<String, String>) map, this.f243a);
    }

    public final m<n> a(@NotNull String str, @NotNull o oVar, @NotNull l lVar) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) oVar, "");
        Intrinsics.EZpvd((Object) lVar, "");
        JSONObject jSONObjectA = oVar.a();
        JSONObject jSONObjectA2 = lVar.a();
        Intrinsics.EZpvd((Object) this, "");
        Intrinsics.EZpvd((Object) jSONObjectA, "");
        Intrinsics.EZpvd((Object) jSONObjectA2, "");
        try {
            this.f243a.D.debug("Notify DeferDeepLink trigger.", new Object[0]);
            EventBus eventBus = EventBus.global.get(new Object[0]);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request", jSONObjectA);
            jSONObject.put("queryParam", jSONObjectA2);
            eventBus.emit("ALink_DeferDeepLink_App_Log", jSONObject);
        } catch (Exception e) {
            this.f243a.D.error("Notify DeferDeepLink trigger failed.", e, new Object[0]);
        }
        try {
            INetworkClient netClient = this.f243a.getNetClient();
            a4 a4Var = this.f243a.k;
            Intrinsics.AEQbTJ(a4Var, "");
            byte[] bArrExecute = netClient.execute((byte) 1, a4Var.c.a(a(str, jSONObjectA2)), jSONObjectA, a(), (byte) 0, true, 60000);
            Intrinsics.AEQbTJ(bArrExecute, "");
            return m.c.a(new String(bArrExecute, Charsets.UTF_8), n.class);
        } catch (Throwable th) {
            return m.c.a(th);
        }
    }
}
