package com.geetest.captcha.views;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.geetest.captcha.c0;
import com.geetest.captcha.d;
import com.geetest.captcha.d0;
import com.geetest.captcha.i;
import com.geetest.captcha.j;
import com.geetest.captcha.t;
import com.geetest.captcha.utils.LogUtils;
import com.geetest.captcha.views.a;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.biz.net.bean.EVM5792Capability;
import com.okinc.liveness.lca.EopTrackEvent;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import o.C56433yFe;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f382a;
    public c0 b;
    public final GTC4WebView c;
    public b d;

    /* JADX INFO: renamed from: com.geetest.captcha.views.a$a, reason: collision with other inner class name */
    public static final class C0191a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f383a;
        public c0 b;
        public GTC4WebView c;

        /* JADX INFO: renamed from: com.geetest.captcha.views.a$a$a, reason: collision with other inner class name */
        public static final class C0192a extends Lambda implements Function0<Unit> {
            final /* synthetic */ Context $context;
            final /* synthetic */ d $dataBean;
            final /* synthetic */ c0 $observable;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0192a(Context context, c0 c0Var, d dVar) {
                super(0);
                this.$context = context;
                this.$observable = c0Var;
                this.$dataBean = dVar;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C0191a c0191a = C0191a.this;
                GTC4WebView gTC4WebView = new GTC4WebView(this.$context);
                c0191a.getClass();
                Intrinsics.checkNotNullParameter(gTC4WebView, "");
                c0191a.c = gTC4WebView;
                C0191a.this.c().a(this.$observable, this.$dataBean, C0191a.this.b());
                C0191a c0191a2 = C0191a.this;
                c0 c0Var = this.$observable;
                c0191a2.getClass();
                Intrinsics.checkNotNullParameter(c0Var, "");
                c0191a2.b = c0Var;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final c0 a() {
            c0 c0Var = this.b;
            if (c0Var != null) {
                return c0Var;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String b() {
            String str = this.f383a;
            if (str != null) {
                return str;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final GTC4WebView c() {
            GTC4WebView gTC4WebView = this.c;
            if (gTC4WebView != null) {
                return gTC4WebView;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final C0191a a(@NotNull Context context, @NotNull c0 c0Var, @NotNull d dVar) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(c0Var, "");
            Intrinsics.checkNotNullParameter(dVar, "");
            final C0192a c0192a = new C0192a(context, c0Var, dVar);
            if (Intrinsics.EZpvd(Looper.myLooper(), Looper.getMainLooper())) {
                c0192a.invoke();
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.geetest.captcha.views.a$a$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0191a.a(c0192a);
                    }
                });
            }
            return this;
        }

        public static final void a(Function0 function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            function0.invoke();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f384a;
        public GTC4WebView b;
        public c0 c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(@NotNull String str, @NotNull GTC4WebView gTC4WebView, @NotNull c0 c0Var) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(gTC4WebView, "");
            Intrinsics.checkNotNullParameter(c0Var, "");
            this.f384a = str;
            this.b = gTC4WebView;
            this.c = c0Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void gt4Notify(String str) throws JSONException {
            LogUtils.f375a.release("JSInterface.gt4Notify: " + str + ", main: " + Intrinsics.EZpvd(Looper.getMainLooper(), Looper.myLooper()));
            if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                c0 c0Var = this.c;
                String str2 = i.WEB_CALLBACK_ERROR.getType() + "80";
                String str3 = j.f368a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", "The Web callback data is empty");
                Unit unit = Unit.INSTANCE;
                c0Var.a(str2, str3, jSONObject);
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -934426595:
                            if (string.equals("result")) {
                                String string2 = jSONObject2.getJSONObject("data").toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "");
                                c0 c0Var2 = this.c;
                                c0Var2.getClass();
                                Intrinsics.checkNotNullParameter(string2, "");
                                Iterator<d0> it = c0Var2.f362a.iterator();
                                while (it.hasNext()) {
                                    it.next().a(true, string2);
                                }
                            }
                            break;
                        case 102230:
                            if (string.equals("get")) {
                                try {
                                    if (Build.VERSION.SDK_INT >= 28 && !Intrinsics.EZpvd(Looper.getMainLooper(), Looper.myLooper()) && (this.b.getContext() instanceof Activity)) {
                                        C56433yFe.thread$default(false, false, null, null, 0, new C0193a(), 31, null);
                                        break;
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                            }
                            break;
                        case 3135262:
                            if (string.equals("fail")) {
                                String string3 = jSONObject2.getJSONObject("data").toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "");
                                c0 c0Var3 = this.c;
                                c0Var3.getClass();
                                Intrinsics.checkNotNullParameter(string3, "");
                                Iterator<d0> it2 = c0Var3.f362a.iterator();
                                while (it2.hasNext()) {
                                    it2.next().a(false, string3);
                                }
                            }
                            break;
                        case 94756344:
                            if (string.equals(EopTrackEvent.CLOSE)) {
                                Iterator<d0> it3 = this.c.f362a.iterator();
                                while (it3.hasNext()) {
                                    it3.next().b();
                                }
                            }
                            break;
                        case 96784904:
                            if (string.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                                String string4 = jSONObject2.getJSONObject("data").toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "");
                                c0 c0Var4 = this.c;
                                c0Var4.getClass();
                                Intrinsics.checkNotNullParameter(string4, "");
                                Iterator<d0> it4 = c0Var4.f362a.iterator();
                                while (it4.hasNext()) {
                                    it4.next().a(string4);
                                }
                            }
                            break;
                        case 108386723:
                            if (string.equals(EVM5792Capability.EVM5792Atomic.STATUS_READY)) {
                                Iterator<d0> it5 = this.c.f362a.iterator();
                                while (it5.hasNext()) {
                                    it5.next().a();
                                }
                            }
                            break;
                    }
                    return;
                }
                c0 c0Var5 = this.c;
                String str4 = i.WEB_CALLBACK_ERROR.getType() + "82";
                String str5 = j.f368a;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("description", jSONObject2);
                Unit unit2 = Unit.INSTANCE;
                c0Var5.a(str4, str5, jSONObject3);
            } catch (Exception e2) {
                e2.printStackTrace();
                c0 c0Var6 = this.c;
                String str6 = i.WEB_CALLBACK_ERROR.getType() + "81";
                String str7 = j.f368a;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("exception", e2.getMessage());
                jSONObject4.put("description", str);
                Unit unit3 = Unit.INSTANCE;
                c0Var6.a(str6, str7, jSONObject4);
            }
        }

        /* JADX INFO: renamed from: com.geetest.captcha.views.a$b$a, reason: collision with other inner class name */
        public static final class C0193a extends Lambda implements Function0<Unit> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0193a() {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public static final void a(b bVar, String str) {
                Intrinsics.checkNotNullParameter(bVar, "");
                bVar.b.evaluateJavascript("javascript:jsBridge.callback('postNativeMessage', '" + str + "')", new ValueCallback() { // from class: com.geetest.captcha.views.a$b$a$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        a.b.C0193a.a((String) obj);
                    }
                });
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            public static final void a(String str) {
                LogUtils.f375a.d("WebViewBuilder javascript:jsBridge.callback('postNativeMessage') return: " + str);
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke2() {
                Context context = b.this.b.getContext();
                String str = b.this.f384a;
                Intrinsics.checkNotNullParameter(str, "");
                final String strA = null;
                if (context != null) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        t tVarA = t.a.a(str);
                        if (tVarA != null) {
                            String str2 = tVarA.f374a;
                            Map<String, String> map = tVarA.b;
                            Intrinsics.checkNotNullParameter(str2, "");
                            String str3 = map != null ? map.get("data") : null;
                            JSONObject jSONObject = new JSONObject(URLDecoder.decode(str3, "utf-8"));
                            String string = jSONObject.getString(ClientData.KEY_CHALLENGE);
                            sb.append(jSONObject.getString("captchaId"));
                            sb.append(string);
                            sb.append(context.getPackageName());
                            sb.append("1.8.9");
                            LogUtils.f375a.d("Sign content: " + ((Object) sb));
                            strA = com.geetest.captcha.c.a(context, sb.toString());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (strA == null || StringsKt__StringsKt.fARcdN((CharSequence) strA)) {
                    return;
                }
                Context context2 = b.this.b.getContext();
                if (context2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
                final b bVar = b.this;
                ((Activity) context2).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.views.a$b$a$$ExternalSyntheticLambda1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.b.C0193a.a(bVar, strA);
                    }
                });
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(C0191a c0191a) {
        this.f382a = c0191a.b();
        this.b = c0191a.a();
        this.c = c0191a.c();
    }

    public static final class c extends Lambda implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public c() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a aVar = a.this;
            aVar.d = new b(aVar.f382a, aVar.c, aVar.b);
            a aVar2 = a.this;
            GTC4WebView gTC4WebView = aVar2.c;
            b bVar = aVar2.d;
            if (bVar == null) {
                Intrinsics.gEmmrt("");
                bVar = null;
            }
            gTC4WebView.addJavascriptInterface(bVar, "JSInterface");
            a.this.c.buildLayer();
            a aVar3 = a.this;
            aVar3.c.loadUrl(aVar3.f382a);
            a.this.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void a(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "");
        this.b = c0Var;
        b bVar = this.d;
        if (bVar == null) {
            Intrinsics.gEmmrt("");
            bVar = null;
        }
        String str = this.f382a;
        GTC4WebView gTC4WebView = this.c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(gTC4WebView, "");
        Intrinsics.checkNotNullParameter(c0Var, "");
        bVar.c = c0Var;
        bVar.b = gTC4WebView;
        bVar.f384a = str;
    }

    public final a a() {
        final c cVar = new c();
        if (Intrinsics.EZpvd(Looper.myLooper(), Looper.getMainLooper())) {
            cVar.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.geetest.captcha.views.a$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(cVar);
                }
            });
        }
        return this;
    }

    public static final void a(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
    }
}
