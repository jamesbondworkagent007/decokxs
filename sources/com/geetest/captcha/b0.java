package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.geetest.captcha.a0;
import com.geetest.captcha.b0;
import com.geetest.captcha.utils.LogUtils;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class b0 extends q {
    @Override // com.geetest.captcha.p
    public final int a() {
        return 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.captcha.p
    public final void a(@NotNull x xVar) throws JSONException {
        Intrinsics.checkNotNullParameter(xVar, "");
        if (xVar.a()) {
            return;
        }
        LogUtils logUtils = LogUtils.f375a;
        logUtils.release("Step: WebViewHandler.handler");
        a aVar = new a(xVar, this);
        xVar.a(a0.FLOWING);
        logUtils.d("Request", "currentStatus preLoadStatus: " + xVar.c.name() + ", status: " + xVar.d.name());
        a0.a aVar2 = xVar.c;
        if (aVar2 == a0.a.FLOWING) {
            Context context = xVar.f386a;
            d dVar = xVar.b;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(dVar, "");
            Intrinsics.checkNotNullParameter(aVar, "");
            e eVar = xVar.e;
            if (eVar != null) {
                eVar.a(context, dVar, aVar);
                return;
            }
            return;
        }
        if (aVar2 == a0.a.SUCCESS) {
            e eVar2 = xVar.e;
            if (eVar2 != null) {
                eVar2.b();
            }
            xVar.b();
            Context context2 = xVar.f386a;
            d dVar2 = xVar.b;
            Intrinsics.checkNotNullParameter(context2, "");
            Intrinsics.checkNotNullParameter(dVar2, "");
            Intrinsics.checkNotNullParameter(aVar, "");
            e eVar3 = xVar.e;
            if (eVar3 != null) {
                eVar3.a(context2, dVar2, aVar);
                return;
            }
            return;
        }
        if (aVar2 == a0.a.FAIL) {
            Context context3 = xVar.f386a;
            d dVar3 = xVar.b;
            Intrinsics.checkNotNullParameter(context3, "");
            Intrinsics.checkNotNullParameter(dVar3, "");
            Intrinsics.checkNotNullParameter(aVar, "");
            e eVar4 = xVar.e;
            if (eVar4 != null) {
                eVar4.a(context3, dVar3, (d0) aVar);
            }
            if (xVar.d != a0.FAIL) {
                Context context4 = xVar.f386a;
                d dVar4 = xVar.b;
                Intrinsics.checkNotNullParameter(context4, "");
                Intrinsics.checkNotNullParameter(dVar4, "");
                Intrinsics.checkNotNullParameter(aVar, "");
                e eVar5 = xVar.e;
                if (eVar5 != null) {
                    eVar5.a(context4, dVar4, aVar);
                    return;
                }
                return;
            }
            return;
        }
        if (aVar2 == a0.a.NONE) {
            Context context5 = xVar.f386a;
            d dVar5 = xVar.b;
            Intrinsics.checkNotNullParameter(context5, "");
            Intrinsics.checkNotNullParameter(dVar5, "");
            Intrinsics.checkNotNullParameter(aVar, "");
            e eVar6 = xVar.e;
            if (eVar6 != null) {
                eVar6.a(context5, dVar5, (d0) aVar);
            }
            if (xVar.d != a0.FAIL) {
                Context context6 = xVar.f386a;
                d dVar6 = xVar.b;
                Intrinsics.checkNotNullParameter(context6, "");
                Intrinsics.checkNotNullParameter(dVar6, "");
                Intrinsics.checkNotNullParameter(aVar, "");
                e eVar7 = xVar.e;
                if (eVar7 != null) {
                    eVar7.a(context6, dVar6, aVar);
                }
            }
        }
    }

    public static final class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f360a;
        public final q b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(@NotNull x xVar, @NotNull q qVar) {
            Intrinsics.checkNotNullParameter(xVar, "");
            Intrinsics.checkNotNullParameter(qVar, "");
            this.f360a = xVar;
            this.b = qVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.geetest.captcha.d0
        public final void a() {
            if (this.f360a.a()) {
                return;
            }
            LogUtils.f375a.d("WebViewHandler", "WebViewHandler.HandlerObserver.onCallReady");
            this.f360a.a(a0.SUCCESS);
            if (!Intrinsics.EZpvd(Looper.myLooper(), Looper.getMainLooper())) {
                ((Activity) this.f360a.f386a).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.b0$a$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.a(this.f$0);
                    }
                });
                return;
            }
            x xVar = this.f360a;
            e eVar = xVar.e;
            if (eVar != null) {
                eVar.b();
            }
            xVar.b();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.geetest.captcha.d0
        public final void b() throws JSONException {
            if (this.f360a.a()) {
                return;
            }
            LogUtils logUtils = LogUtils.f375a;
            logUtils.d("WebViewHandler", "WebViewHandler.HandlerObserver.onClose");
            this.f360a.a(a0.FAIL);
            String type = a0.CANCEL.getType();
            String str = i.USER_ERROR.getType() + "60";
            Intrinsics.checkNotNullParameter(str, "");
            String str2 = type + str;
            String str3 = j.f;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("description", "User cancelled 'Captcha'");
            Unit unit = Unit.INSTANCE;
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(jSONObject, "");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", str2);
                jSONObject2.put("msg", str3);
                jSONObject2.put("desc", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String string = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            logUtils.release("WebViewHandler: " + string);
            x xVar = this.f360a;
            e eVar = xVar.e;
            if (eVar != null) {
                eVar.a();
            }
            xVar.e = null;
            this.f360a.a(string);
        }

        public static final void a(a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "");
            x xVar = aVar.f360a;
            e eVar = xVar.e;
            if (eVar != null) {
                eVar.b();
            }
            xVar.b();
        }

        @Override // com.geetest.captcha.d0
        public final void a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.f360a.a()) {
                return;
            }
            LogUtils logUtils = LogUtils.f375a;
            logUtils.i("WebViewHandler", "WebViewHandler.HandlerObserver.onWebError: " + str);
            x xVar = this.f360a;
            a0 a0Var = a0.FAIL;
            xVar.a(a0Var);
            q qVar = this.b;
            x xVar2 = this.f360a;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(xVar2, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (xVar2.a()) {
                return;
            }
            logUtils.release("HandlerImpl.onFailure: " + str);
            if (xVar2.d == a0Var) {
                e eVar = xVar2.e;
                if (eVar != null) {
                    eVar.a();
                }
                xVar2.e = null;
                xVar2.a(str);
            }
        }

        @Override // com.geetest.captcha.d0
        public final void a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(jSONObject, "");
            if (this.f360a.a()) {
                return;
            }
            x xVar = this.f360a;
            a0 a0Var = a0.FAIL;
            xVar.a(a0Var);
            String type = this.f360a.d.getType();
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
            LogUtils logUtils = LogUtils.f375a;
            logUtils.i("WebViewHandler", "WebViewHandler.HandlerObserver.onError: " + string);
            q qVar = this.b;
            x xVar2 = this.f360a;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(xVar2, "");
            Intrinsics.checkNotNullParameter(string, "");
            if (xVar2.a()) {
                return;
            }
            logUtils.release("HandlerImpl.onFailure: " + string);
            if (xVar2.d == a0Var) {
                e eVar = xVar2.e;
                if (eVar != null) {
                    eVar.a();
                }
                xVar2.e = null;
                xVar2.a(string);
            }
        }

        @Override // com.geetest.captcha.d0
        public final void a(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.f360a.a()) {
                return;
            }
            LogUtils.f375a.i("WebViewHandler", "HandlerObserver.onResult: " + str);
            if (z) {
                this.f360a.a(a0.END);
                q qVar = this.b;
                x xVar = this.f360a;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(xVar, "");
                Intrinsics.checkNotNullParameter(str, "");
                if (xVar.a()) {
                    return;
                }
                e eVar = xVar.e;
                if (eVar != null) {
                    eVar.a();
                }
                xVar.e = null;
                xVar.a(true, str);
                return;
            }
            this.f360a.a(a0.FLOWING);
            q qVar2 = this.b;
            x xVar2 = this.f360a;
            qVar2.getClass();
            Intrinsics.checkNotNullParameter(xVar2, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (xVar2.a()) {
                return;
            }
            xVar2.a(false, str);
        }
    }
}
