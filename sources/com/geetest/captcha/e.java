package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.b0;
import com.geetest.captcha.t;
import com.geetest.captcha.utils.LogUtils;
import com.geetest.captcha.views.GTC4WebView;
import com.geetest.captcha.views.a;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.just.agentweb.DefaultWebClient;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.okapm.okqpl.util.QPLConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f364a;
    public GTC4WebView b;
    public com.geetest.captcha.views.a c;
    public final GTCaptcha4Client.OnDialogShowListener d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(GTCaptcha4Client.OnDialogShowListener onDialogShowListener) {
        this.d = onDialogShowListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(@NotNull Context context, @NotNull d dVar, @NotNull d0 d0Var) throws JSONException {
        JSONObject jSONObject;
        String str;
        c0 c0Var;
        JSONObject jSONObject2;
        CharSequence charSequenceLoadLabel;
        JSONObject jSONObject3;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        Intrinsics.checkNotNullParameter(d0Var, "");
        c0 c0Var2 = new c0();
        c0Var2.a(d0Var);
        t tVarA = t.a.a(dVar.b);
        if (tVarA == null) {
            String str2 = i.PARAM.getType() + "75";
            String str3 = j.e;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("description", "Address configuration error");
            Unit unit = Unit.INSTANCE;
            d0Var.a(str2, str3, jSONObject4);
            return;
        }
        String string = tVarA.f374a;
        Map<String, String> map = tVarA.b;
        Intrinsics.checkNotNullParameter(string, "");
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("displayArea", f.CENTER.getValue());
        jSONObject5.put(MTCoreConstants.Protocol.KEY_PROTOCOL, DefaultWebClient.HTTPS_SCHEME);
        jSONObject5.put("loading", "./gt4-loading.gif");
        Map<String, ? extends Object> map2 = dVar.g;
        LogUtils.f375a.d("Config Params: " + map2);
        if (map2 == null || map2.isEmpty()) {
            jSONObject = null;
        } else {
            Iterator<Map.Entry<String, ? extends Object>> it = map2.entrySet().iterator();
            jSONObject = null;
            while (it.hasNext()) {
                Map.Entry<String, ? extends Object> next = it.next();
                String key = next.getKey();
                Object value = next.getValue();
                Iterator<Map.Entry<String, ? extends Object>> it2 = it;
                if (Intrinsics.EZpvd((Object) "xid", (Object) key)) {
                    HashMap map3 = new HashMap();
                    jSONObject3 = jSONObject;
                    if (value != null && (value instanceof JSONObject)) {
                        map3.put("xid", value);
                    }
                    c.f361a = map3;
                } else {
                    jSONObject3 = jSONObject;
                    if (!Intrinsics.EZpvd((Object) "_gee_info", (Object) key)) {
                        jSONObject5.put(key, value);
                    } else if (value != null && (value instanceof JSONObject)) {
                        jSONObject = (JSONObject) value;
                        String[] strArr = {"geeid", "packageName", AppLocaleInfo.KEY_DISPLAY_NAME, "appVer", "build", "clientVersion"};
                        for (int i = 0; i < 6; i++) {
                            String str4 = strArr[i];
                            if (jSONObject.has(str4)) {
                                jSONObject.remove(str4);
                            }
                        }
                        it = it2;
                    }
                }
                it = it2;
                jSONObject = jSONObject3;
            }
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject5.put(entry.getKey(), entry.getValue());
            }
            map.clear();
        }
        String str5 = dVar.f363a;
        if (str5 != null) {
            str = str5;
        } else {
            Intrinsics.gEmmrt("");
            str = null;
        }
        jSONObject5.put("captchaId", str);
        jSONObject5.put(ClientData.KEY_CHALLENGE, UUID.randomUUID().toString());
        jSONObject5.put(QPLConstants.ENV_DEBUG, dVar.c);
        String str6 = dVar.d;
        if (str6 == null || StringsKt__StringsKt.fARcdN((CharSequence) str6)) {
            Locale locale = context.getApplicationContext().getResources().getConfiguration().getLocales().get(0);
            Intrinsics.checkNotNullExpressionValue(locale, "");
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            sb.append('-');
            String country = locale.getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "");
            Locale locale2 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase = country.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            sb.append(lowerCase);
            jSONObject5.put("language", sb.toString());
        } else {
            jSONObject5.put("language", dVar.d);
        }
        String[] strArr2 = dVar.e;
        if (strArr2 != null && strArr2.length != 0) {
            JSONArray jSONArray = new JSONArray();
            String[] strArr3 = dVar.e;
            Intrinsics.copydefault(strArr3);
            int i2 = 0;
            for (int length = strArr3.length; i2 < length; length = length) {
                jSONArray.put(strArr3[i2]);
                i2++;
            }
            jSONObject5.put("apiServers", jSONArray);
        }
        String[] strArr4 = dVar.f;
        if (strArr4 != null && strArr4.length != 0) {
            JSONArray jSONArray2 = new JSONArray();
            String[] strArr5 = dVar.f;
            Intrinsics.copydefault(strArr5);
            int i3 = 0;
            for (int length2 = strArr5.length; i3 < length2; length2 = length2) {
                jSONArray2.put(strArr5[i3]);
                i3++;
            }
            jSONObject5.put("staticServers", jSONArray2);
        }
        jSONObject5.put("timeout", dVar.j);
        jSONObject5.put("clientVersion", "1.8.9");
        jSONObject5.put("clientType", "android");
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("outside", dVar.h);
        jSONObject5.put("mask", jSONObject6);
        try {
            jSONObject2 = new JSONObject();
            jSONObject2.put("geeid", new JSONObject(n.a(context)));
            jSONObject2.put("packageName", context.getPackageName());
            charSequenceLoadLabel = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).loadLabel(context.getPackageManager());
            Intrinsics.checkNotNullExpressionValue(charSequenceLoadLabel, "");
            c0Var = c0Var2;
        } catch (Exception e) {
            e = e;
            c0Var = c0Var2;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            jSONObject2.put(AppLocaleInfo.KEY_DISPLAY_NAME, Uri.encode(charSequenceLoadLabel.toString()));
            jSONObject2.put("appVer", packageInfo.versionName);
            jSONObject2.put("build", String.valueOf(packageInfo.versionCode));
            jSONObject2.put("clientVersion", "1.8.9");
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "");
                while (itKeys.hasNext()) {
                    String next2 = itKeys.next();
                    jSONObject2.put(next2, jSONObject.opt(next2));
                }
            }
            jSONObject5.put("mi", jSONObject2);
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
        }
        try {
            if (!jSONObject5.has("displayMode") || ((jSONObject5.get("displayMode") instanceof Integer) && Intrinsics.EZpvd(jSONObject5.get("displayMode"), Integer.valueOf(g.AUTO.getValue())))) {
                Intrinsics.checkNotNullParameter(context, "");
                jSONObject5.put("displayMode", ((context.getResources().getConfiguration().uiMode & 48) == 32 ? g.DARK : g.NORMAL).getValue());
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        LogUtils logUtils = LogUtils.f375a;
        logUtils.d("BaseURL: " + dVar.b + ", Parameter: " + jSONObject5);
        JSONObject jSONObject7 = new JSONObject(jSONObject5.toString());
        if (jSONObject7.has("mi")) {
            jSONObject7.remove("mi");
        }
        logUtils.release("BaseURL: " + dVar.b + ", Parameter: " + jSONObject7);
        String strEncode = Uri.encode(jSONObject5.toString());
        Intrinsics.checkNotNullParameter("data", "");
        if (map != null) {
            map.put("data", strEncode);
        }
        try {
            a.C0191a c0191a = new a.C0191a();
            if (map != null && !map.isEmpty()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(string);
                stringBuffer.append('?');
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    String key2 = entry2.getKey();
                    String value2 = entry2.getValue();
                    stringBuffer.append(key2);
                    stringBuffer.append('=');
                    stringBuffer.append(value2);
                    stringBuffer.append('&');
                }
                string = stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            Intrinsics.checkNotNullParameter(string, "");
            Intrinsics.checkNotNullParameter(string, "");
            c0191a.f383a = string;
            com.geetest.captcha.views.a aVarA = new com.geetest.captcha.views.a(c0191a.a(context, c0Var, dVar)).a();
            try {
                this.c = aVarA;
                this.b = aVarA.c;
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                if (e.getMessage() != null) {
                    String str7 = i.WEB_VIEW_NEW.getType() + "99";
                    String str8 = j.g;
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("description", "Device not supported");
                    jSONObject8.put("exception", e.getMessage());
                    Unit unit2 = Unit.INSTANCE;
                    d0Var.a(str7, str8, jSONObject8);
                }
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void b() {
        GTC4WebView gTC4WebView = this.b;
        if (gTC4WebView != null) {
            gTC4WebView.evaluateJavascript("javascript:jsBridge.callback('showBox')", new ValueCallback() { // from class: com.geetest.captcha.e$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    e.a((String) obj);
                }
            });
        }
    }

    public final void a(@NotNull final Context context, @NotNull final d dVar, @NotNull final b0.a aVar) {
        l lVar;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        try {
            c0 c0Var = new c0();
            c0Var.a(aVar);
            GTC4WebView gTC4WebView = this.b;
            if (gTC4WebView != null) {
                gTC4WebView.setWebViewObservable(c0Var);
            }
            com.geetest.captcha.views.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.a(c0Var);
            }
            if (dVar.i) {
                return;
            }
            if (!Intrinsics.EZpvd(Looper.getMainLooper(), Looper.myLooper())) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.e$$ExternalSyntheticLambda3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a(this.f$0, context, dVar, aVar);
                    }
                });
                return;
            }
            if (TextUtils.isEmpty(dVar.l)) {
                lVar = new l(context);
            } else {
                String str = dVar.l;
                lVar = str != null ? new l(context, str) : null;
            }
            this.f364a = lVar;
            if (lVar != null) {
                lVar.b = this.d;
            }
            if (lVar != null) {
                lVar.f369a = this.b;
            }
            a(lVar, aVar);
            l lVar2 = this.f364a;
            if (lVar2 != null) {
                lVar2.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void a(e eVar, Context context, d dVar, d0 d0Var) {
        l lVar;
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        Intrinsics.checkNotNullParameter(d0Var, "");
        try {
            eVar.getClass();
            if (TextUtils.isEmpty(dVar.l)) {
                lVar = new l(context);
            } else {
                String str = dVar.l;
                lVar = str != null ? new l(context, str) : null;
            }
            eVar.f364a = lVar;
            if (lVar != null) {
                lVar.b = eVar.d;
            }
            if (lVar != null) {
                lVar.f369a = eVar.b;
            }
            a(lVar, d0Var);
            l lVar2 = eVar.f364a;
            if (lVar2 != null) {
                lVar2.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(l lVar, final d0 d0Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (lVar != null) {
            lVar.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.geetest.captcha.e$$ExternalSyntheticLambda5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return e.a(d0Var, dialogInterface, i, keyEvent);
                }
            });
        }
        if (Build.VERSION.SDK_INT < 33 || lVar == null || (onBackInvokedDispatcher = lVar.getOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, new OnBackInvokedCallback() { // from class: com.geetest.captcha.e$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                e.a(d0Var);
            }
        });
    }

    public static final boolean a(d0 d0Var, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(d0Var, "");
        if (i != 4 || keyEvent == null || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1) {
            return false;
        }
        d0Var.b();
        return false;
    }

    public static final void a(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "");
        d0Var.b();
    }

    public static final void a(String str) {
        LogUtils.f375a.release("DialogController javascript:jsBridge.callback('showBox') return: " + str);
    }

    public final void a() {
        try {
            final l lVar = this.f364a;
            if (lVar == null || !lVar.isShowing()) {
                return;
            }
            GTC4WebView gTC4WebView = this.b;
            Context context = gTC4WebView != null ? gTC4WebView.getContext() : null;
            if (context != null) {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                if (!Intrinsics.EZpvd(Looper.getMainLooper(), Looper.myLooper())) {
                    activity.runOnUiThread(new Runnable() { // from class: com.geetest.captcha.e$$ExternalSyntheticLambda2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.a(this.f$0, lVar);
                        }
                    });
                    return;
                }
                GTC4WebView gTC4WebView2 = this.b;
                if (gTC4WebView2 != null) {
                    gTC4WebView2.destroy();
                }
                lVar.dismiss();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void a(e eVar, l lVar) {
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNullParameter(lVar, "");
        GTC4WebView gTC4WebView = eVar.b;
        if (gTC4WebView != null) {
            gTC4WebView.destroy();
        }
        lVar.dismiss();
    }
}
