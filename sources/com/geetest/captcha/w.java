package com.geetest.captcha;

import android.content.Context;
import com.geetest.captcha.a0;
import com.geetest.captcha.utils.LogUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class w extends q {
    @Override // com.geetest.captcha.p
    public final int a() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.captcha.p
    public final void a(@NotNull x xVar) throws JSONException {
        Intrinsics.checkNotNullParameter(xVar, "");
        if (xVar.a()) {
            return;
        }
        LogUtils.f375a.release("Step: PreLoadHandler.handler");
        xVar.a(a0.a.FLOWING);
        a aVar = new a(xVar, this);
        Context context = xVar.f386a;
        d dVar = xVar.b;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        e eVar = xVar.e;
        if (eVar != null) {
            eVar.a(context, dVar, aVar);
        }
    }

    public static final class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f385a;
        public final q b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(@NotNull x xVar, @NotNull q qVar) {
            Intrinsics.checkNotNullParameter(xVar, "");
            Intrinsics.checkNotNullParameter(qVar, "");
            this.f385a = xVar;
            this.b = qVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.geetest.captcha.d0
        public final void a() {
            q qVar;
            if (this.f385a.a()) {
                return;
            }
            LogUtils.f375a.i("PreLoadHandler", "HandlerObserver.onCallReady");
            this.f385a.a(a0.a.SUCCESS);
            x xVar = this.f385a;
            a0 a0Var = xVar.d;
            if (a0Var == a0.NONE || a0Var != a0.FLOWING || (qVar = this.b.f372a) == null) {
                return;
            }
            qVar.b(xVar);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.geetest.captcha.d0
        public final void b() {
            if (this.f385a.a()) {
                return;
            }
            LogUtils.f375a.i("PreLoadHandler", "PreLoadHandler.HandlerObserver.onClose");
        }

        @Override // com.geetest.captcha.d0
        public final void a(@NotNull String str) {
            q qVar;
            Intrinsics.checkNotNullParameter(str, "");
            if (this.f385a.a()) {
                return;
            }
            LogUtils logUtils = LogUtils.f375a;
            logUtils.i("PreLoadHandler", "PreLoadHandler.HandlerObserver.onWebError: " + str);
            this.f385a.a(a0.a.FAIL);
            logUtils.release(str);
            x xVar = this.f385a;
            a0 a0Var = xVar.d;
            if (a0Var == a0.NONE || a0Var != a0.FLOWING || (qVar = this.b.f372a) == null) {
                return;
            }
            qVar.b(xVar);
        }

        @Override // com.geetest.captcha.d0
        public final void a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            q qVar;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(jSONObject, "");
            if (this.f385a.a()) {
                return;
            }
            this.f385a.a(a0.a.FAIL);
            String type = this.f385a.c.getType();
            Intrinsics.checkNotNullParameter(str, "");
            String str3 = type + str;
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(jSONObject, "");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", str3);
                jSONObject2.put("msg", str2);
                jSONObject2.put("desc", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String string = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            LogUtils.f375a.i("PreLoadHandler", "PreLoadHandler.HandlerObserver.onError: " + string);
            x xVar = this.f385a;
            a0 a0Var = xVar.d;
            if (a0Var == a0.NONE || a0Var != a0.FLOWING || (qVar = this.b.f372a) == null) {
                return;
            }
            qVar.b(xVar);
        }

        @Override // com.geetest.captcha.d0
        public final void a(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.f385a.a()) {
                return;
            }
            LogUtils.f375a.i("PreLoadHandler", "PreLoadHandler.HandlerObserver.onResult: " + str);
            this.f385a.a(a0.a.FAIL);
        }
    }
}
