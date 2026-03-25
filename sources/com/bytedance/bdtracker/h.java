package com.bytedance.bdtracker;

import android.content.Context;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.store.kv.IKVStore;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.yJA;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static final /* synthetic */ yJA[] b = {C56524yIo.copydefault(new PropertyReference1Impl(C56524yIo.AEQbTJ(h.class), "aLinkKVStore", "getALinkKVStore()Lcom/bytedance/applog/store/kv/IKVStore;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC56387yDm f185a;

    public static final class a extends Lambda implements Function0<IKVStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InitConfig f186a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InitConfig initConfig, Context context, String str) {
            super(0);
            this.f186a = initConfig;
            this.b = context;
            this.c = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public IKVStore invoke() {
            return x4.a(this.f186a, this.b, this.c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public h(@NotNull InitConfig initConfig, @NotNull Context context, @NotNull String str) {
        Intrinsics.EZpvd((Object) initConfig, "");
        Intrinsics.EZpvd((Object) context, "");
        Intrinsics.EZpvd((Object) str, "");
        this.f185a = C56392yDr.copydefault(new a(initConfig, context, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IKVStore a() {
        InterfaceC56387yDm interfaceC56387yDm = this.f185a;
        yJA yja = b[0];
        return (IKVStore) interfaceC56387yDm.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final <T extends p> T a(@NotNull String str, @NotNull Class<T> cls) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) cls, "");
        try {
            String string = a().getString(str, null);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            long jOptLong = jSONObject.optLong("expire_ts");
            if (jOptLong != -1 && (jOptLong <= 0 || System.currentTimeMillis() >= jOptLong)) {
                a().remove(str);
                return null;
            }
            return (T) p.f239a.a(jSONObject, cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String a(@NotNull String str) {
        Intrinsics.EZpvd((Object) str, "");
        try {
            String string = a().getString(str, null);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            long jOptLong = jSONObject.optLong("expire_ts");
            if (jOptLong != -1 && (jOptLong <= 0 || System.currentTimeMillis() >= jOptLong)) {
                a().remove(str);
                return null;
            }
            return jSONObject.optString("data");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(@NotNull String str, @NotNull p pVar, long j) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) pVar, "");
        JSONObject jSONObjectA = pVar.a();
        jSONObjectA.put("expire_ts", j != -1 ? System.currentTimeMillis() + j : -1L);
        a().putString(str, jSONObjectA.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(@NotNull String str, String str2, long j) {
        Intrinsics.EZpvd((Object) str, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", str2);
        jSONObject.put("expire_ts", j != -1 ? System.currentTimeMillis() + j : -1L);
        a().putString(str, jSONObject.toString());
    }
}
