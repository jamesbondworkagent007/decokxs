package com.geetest.captcha;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Pair;
import com.geetest.captcha.a0;
import com.geetest.captcha.m;
import com.geetest.captcha.utils.LogUtils;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GTCaptcha4Client implements NoProguard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f354a;

    public interface OnDialogShowListener extends NoProguard {
        void actionAfterDialogShow(Dialog dialog);

        void actionBeforeDialogShow(Dialog dialog);

        void onDialogFocusChanged(Dialog dialog, boolean z);
    }

    public interface OnFailureListener extends NoProguard {
        void onFailure(String str);
    }

    public interface OnSuccessListener extends NoProguard {
        void onSuccess(boolean z, String str);
    }

    public interface OnWebViewShowListener extends NoProguard {
        void onWebViewShow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private GTCaptcha4Client(Context context) {
        this.f354a = new m(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GTCaptcha4Client getClient(Context context) {
        return new GTCaptcha4Client(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getVersion() {
        return "1.8.9";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Pair<Boolean, String> isSupportWebView(Context context) {
        return m.b.a(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GTCaptcha4Client addOnFailureListener(OnFailureListener onFailureListener) {
        m mVar = this.f354a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(onFailureListener, "");
        mVar.c = onFailureListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GTCaptcha4Client addOnSuccessListener(OnSuccessListener onSuccessListener) {
        m mVar = this.f354a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(onSuccessListener, "");
        mVar.b = onSuccessListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GTCaptcha4Client addOnWebViewShowListener(OnWebViewShowListener onWebViewShowListener) {
        m mVar = this.f354a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(onWebViewShowListener, "");
        mVar.d = onWebViewShowListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void cancel() throws JSONException {
        m mVar = this.f354a;
        mVar.getClass();
        if (System.currentTimeMillis() - m.e < 1000) {
            LogUtils.f375a.release("The interval between the two cancel is at least 1 second.");
            return;
        }
        b bVar = mVar.f370a;
        x xVar = bVar.g;
        x xVar2 = null;
        if (xVar == null) {
            Intrinsics.gEmmrt("");
            xVar = null;
        }
        if (xVar.a()) {
            return;
        }
        x xVar3 = bVar.g;
        if (xVar3 == null) {
            Intrinsics.gEmmrt("");
            xVar3 = null;
        }
        xVar3.a(a0.FAIL);
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
        LogUtils.f375a.release("Controller: " + string);
        x xVar4 = bVar.g;
        if (xVar4 == null) {
            Intrinsics.gEmmrt("");
            xVar4 = null;
        }
        e eVar = xVar4.e;
        if (eVar != null) {
            eVar.a();
        }
        xVar4.e = null;
        x xVar5 = bVar.g;
        if (xVar5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            xVar2 = xVar5;
        }
        xVar2.a(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void configurationChanged(Configuration configuration) {
        l lVar;
        m mVar = this.f354a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(configuration, "");
        b bVar = mVar.f370a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(configuration, "");
        try {
            x xVar = bVar.g;
            if (xVar == null) {
                Intrinsics.gEmmrt("");
                xVar = null;
            }
            e eVar = xVar.e;
            if (eVar == null || (lVar = eVar.f364a) == null) {
                return;
            }
            lVar.a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void destroy() {
        this.f354a.getClass();
        LogUtils.f375a.destroy();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GTCaptcha4Client init(String str) {
        this.f354a.a(str, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogEnable(boolean z) {
        this.f354a.getClass();
        LogUtils.f375a.setReleaseLog(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GTCaptcha4Client verifyWithCaptcha() throws JSONException {
        m mVar = this.f354a;
        mVar.getClass();
        if (System.currentTimeMillis() - m.e < 1000) {
            LogUtils.f375a.release("The interval between the two captcha is at least 1 second.");
        } else {
            m.e = System.currentTimeMillis();
            b bVar = mVar.f370a;
            OnSuccessListener onSuccessListener = mVar.b;
            bVar.c = onSuccessListener;
            OnFailureListener onFailureListener = mVar.c;
            bVar.d = onFailureListener;
            bVar.e = mVar.d;
            Context context = bVar.f359a;
            if (onFailureListener == null) {
                throw new IllegalArgumentException("The OnFailureListener object cannot be null.".toString());
            }
            if (onSuccessListener == null) {
                String str = a0.FLOWING.getType() + i.PARAM.getType() + "70";
                String str2 = j.e;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", "The GTC4SessionResponse object cannot be null");
                Unit unit = Unit.INSTANCE;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(jSONObject, "");
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("code", str);
                    jSONObject2.put("msg", str2);
                    jSONObject2.put("desc", jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                String string = jSONObject2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                LogUtils.f375a.release(string);
                OnFailureListener onFailureListener2 = bVar.d;
                if (onFailureListener2 != null) {
                    onFailureListener2.onFailure(string);
                }
            } else if (context == null) {
                String str3 = a0.FLOWING.getType() + i.PARAM.getType() + "71";
                String str4 = j.e;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("description", "The context parameter should not be null");
                Unit unit2 = Unit.INSTANCE;
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(jSONObject3, "");
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("code", str3);
                    jSONObject4.put("msg", str4);
                    jSONObject4.put("desc", jSONObject3);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                String string2 = jSONObject4.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                LogUtils.f375a.release(string2);
                OnFailureListener onFailureListener3 = bVar.d;
                if (onFailureListener3 != null) {
                    onFailureListener3.onFailure(string2);
                }
            } else if (context instanceof Activity) {
                String str5 = bVar.b;
                x xVar = null;
                if (str5 == null) {
                    Intrinsics.gEmmrt("");
                    str5 = null;
                }
                if (TextUtils.isEmpty(str5)) {
                    String str6 = a0.FLOWING.getType() + i.PARAM.getType() + "74";
                    String str7 = j.e;
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("description", "The 'AppId' parameter should not be null");
                    Unit unit3 = Unit.INSTANCE;
                    Intrinsics.checkNotNullParameter(str6, "");
                    Intrinsics.checkNotNullParameter(str7, "");
                    Intrinsics.checkNotNullParameter(jSONObject5, "");
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("code", str6);
                        jSONObject6.put("msg", str7);
                        jSONObject6.put("desc", jSONObject5);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                    String string3 = jSONObject6.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    LogUtils.f375a.release(string3);
                    OnFailureListener onFailureListener4 = bVar.d;
                    if (onFailureListener4 != null) {
                        onFailureListener4.onFailure(string3);
                    }
                } else {
                    x xVar2 = bVar.g;
                    if (xVar2 == null) {
                        Intrinsics.gEmmrt("");
                        xVar2 = null;
                    }
                    a0.a aVar = xVar2.c;
                    a0.a aVar2 = a0.a.NONE;
                    if (aVar == aVar2) {
                        bVar.i = new b0();
                        Context context2 = bVar.f359a;
                        String str8 = bVar.b;
                        if (str8 == null) {
                            Intrinsics.gEmmrt("");
                            str8 = null;
                        }
                        GTCaptcha4Config gTCaptcha4Config = bVar.f;
                        Intrinsics.checkNotNullParameter(str8, "");
                        d dVar = new d();
                        dVar.f363a = str8;
                        if (gTCaptcha4Config != null) {
                            dVar.c = gTCaptcha4Config.isDebug();
                            String html = gTCaptcha4Config.getHtml();
                            Intrinsics.checkNotNullExpressionValue(html, "");
                            dVar.b = html;
                            dVar.d = gTCaptcha4Config.getLanguage();
                            dVar.e = gTCaptcha4Config.getApiServers();
                            dVar.f = gTCaptcha4Config.getStaticServers();
                            dVar.h = gTCaptcha4Config.isCanceledOnTouchOutside();
                            dVar.i = gTCaptcha4Config.isGTC4ViewHidden();
                            dVar.g = gTCaptcha4Config.getParams();
                            dVar.j = gTCaptcha4Config.getTimeOut();
                            dVar.k = gTCaptcha4Config.getBackgroundColor();
                            dVar.l = gTCaptcha4Config.getDialogStyle();
                        }
                        if (StringsKt__StringsKt.fARcdN((CharSequence) dVar.b)) {
                            dVar.b = "file:///android_asset/gt4-index.html";
                        }
                        x xVar3 = new x(context2, dVar);
                        bVar.g = xVar3;
                        xVar3.a(aVar2);
                        x xVar4 = bVar.g;
                        if (xVar4 == null) {
                            Intrinsics.gEmmrt("");
                            xVar4 = null;
                        }
                        xVar4.a(a0.FLOWING);
                        x xVar5 = bVar.g;
                        if (xVar5 == null) {
                            Intrinsics.gEmmrt("");
                            xVar5 = null;
                        }
                        GTCaptcha4Config gTCaptcha4Config2 = bVar.f;
                        xVar5.e = new e(gTCaptcha4Config2 != null ? gTCaptcha4Config2.getDialogShowListener() : null);
                        x xVar6 = bVar.g;
                        if (xVar6 == null) {
                            Intrinsics.gEmmrt("");
                            xVar6 = null;
                        }
                        xVar6.f = bVar.c;
                        x xVar7 = bVar.g;
                        if (xVar7 == null) {
                            Intrinsics.gEmmrt("");
                            xVar7 = null;
                        }
                        xVar7.g = bVar.d;
                        x xVar8 = bVar.g;
                        if (xVar8 == null) {
                            Intrinsics.gEmmrt("");
                            xVar8 = null;
                        }
                        xVar8.h = bVar.e;
                        b0 b0Var = bVar.i;
                        if (b0Var == null) {
                            Intrinsics.gEmmrt("");
                            b0Var = null;
                        }
                        x xVar9 = bVar.g;
                        if (xVar9 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            xVar = xVar9;
                        }
                        b0Var.b(xVar);
                    } else {
                        x xVar10 = bVar.g;
                        if (xVar10 == null) {
                            Intrinsics.gEmmrt("");
                            xVar10 = null;
                        }
                        if (xVar10.d == a0.NONE) {
                            x xVar11 = bVar.g;
                            if (xVar11 == null) {
                                Intrinsics.gEmmrt("");
                                xVar11 = null;
                            }
                            xVar11.a(a0.FLOWING);
                            x xVar12 = bVar.g;
                            if (xVar12 == null) {
                                Intrinsics.gEmmrt("");
                                xVar12 = null;
                            }
                            xVar12.f = bVar.c;
                            x xVar13 = bVar.g;
                            if (xVar13 == null) {
                                Intrinsics.gEmmrt("");
                                xVar13 = null;
                            }
                            xVar13.g = bVar.d;
                            x xVar14 = bVar.g;
                            if (xVar14 == null) {
                                Intrinsics.gEmmrt("");
                                xVar14 = null;
                            }
                            xVar14.h = bVar.e;
                            b0 b0Var2 = bVar.i;
                            if (b0Var2 == null) {
                                Intrinsics.gEmmrt("");
                                b0Var2 = null;
                            }
                            x xVar15 = bVar.g;
                            if (xVar15 == null) {
                                Intrinsics.gEmmrt("");
                            } else {
                                xVar = xVar15;
                            }
                            b0Var2.b(xVar);
                        }
                    }
                }
            } else {
                String str9 = a0.FLOWING.getType() + i.PARAM.getType() + "72";
                String str10 = j.e;
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("description", "The context must be an 'Activity' object");
                Unit unit4 = Unit.INSTANCE;
                Intrinsics.checkNotNullParameter(str9, "");
                Intrinsics.checkNotNullParameter(str10, "");
                Intrinsics.checkNotNullParameter(jSONObject7, "");
                JSONObject jSONObject8 = new JSONObject();
                try {
                    jSONObject8.put("code", str9);
                    jSONObject8.put("msg", str10);
                    jSONObject8.put("desc", jSONObject7);
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
                String string4 = jSONObject8.toString();
                Intrinsics.checkNotNullExpressionValue(string4, "");
                LogUtils.f375a.release(string4);
                OnFailureListener onFailureListener5 = bVar.d;
                if (onFailureListener5 != null) {
                    onFailureListener5.onFailure(string4);
                }
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public GTCaptcha4Client init(String str, GTCaptcha4Config gTCaptcha4Config) {
        this.f354a.a(str, gTCaptcha4Config);
        return this;
    }
}
