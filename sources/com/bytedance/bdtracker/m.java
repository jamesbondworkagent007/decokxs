package com.bytedance.bdtracker;

import com.bytedance.applog.network.RangersHttpTimeoutException;
import com.bytedance.bdtracker.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class m<T extends p> {
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f220a;
    public T b;

    public static final class a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final <T extends p> m<T> a(@NotNull Throwable th) {
            String str;
            Intrinsics.EZpvd((Object) th, "");
            m<T> mVar = new m<>();
            if (th instanceof RangersHttpTimeoutException) {
                str = "DDL request timeout";
            } else {
                str = th + " message:" + th.getMessage();
            }
            mVar.f220a = str;
            return mVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final <T extends p> m<T> a(String str, @NotNull Class<T> cls) {
            Intrinsics.EZpvd((Object) cls, "");
            JSONObject jSONObject = new JSONObject(str);
            m<T> mVar = new m<>();
            jSONObject.optInt("code");
            mVar.f220a = jSONObject.optString("message");
            mVar.b = (T) p.f239a.a(jSONObject.optJSONObject("data"), cls);
            return mVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T a() {
        return this.b;
    }
}
