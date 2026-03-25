package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.a0;
import com.geetest.captcha.utils.LogUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f386a;
    public final d b;
    public a0.a c;
    public a0 d;
    public e e;
    public GTCaptcha4Client.OnSuccessListener f;
    public GTCaptcha4Client.OnFailureListener g;
    public GTCaptcha4Client.OnWebViewShowListener h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(@NotNull Context context, @NotNull d dVar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        this.f386a = context;
        this.b = dVar;
        this.c = a0.a.NONE;
        this.d = a0.FLOWING;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(@NotNull a0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "");
        this.c = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(@NotNull a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "");
        this.d = a0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        try {
            LogUtils.f375a.d("Request.onWebViewShow");
            if (a()) {
                return;
            }
            if (Intrinsics.EZpvd(Looper.getMainLooper(), Looper.myLooper())) {
                GTCaptcha4Client.OnWebViewShowListener onWebViewShowListener = this.h;
                if (onWebViewShowListener != null) {
                    onWebViewShowListener.onWebViewShow();
                }
            } else {
                ((Activity) this.f386a).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.x$$ExternalSyntheticLambda1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a(this.f$0);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean a() {
        return this.d == a0.CANCEL;
    }

    public static final void a(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "");
        GTCaptcha4Client.OnWebViewShowListener onWebViewShowListener = xVar.h;
        if (onWebViewShowListener != null) {
            onWebViewShowListener.onWebViewShow();
        }
    }

    public final void a(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            LogUtils.f375a.d("Request.onFailure: " + str);
            if (a()) {
                return;
            }
            if (Intrinsics.EZpvd(Looper.getMainLooper(), Looper.myLooper())) {
                GTCaptcha4Client.OnFailureListener onFailureListener = this.g;
                if (onFailureListener != null) {
                    onFailureListener.onFailure(str);
                }
            } else {
                ((Activity) this.f386a).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.x$$ExternalSyntheticLambda2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a(this.f$0, str);
                    }
                });
            }
            this.d = a0.CANCEL;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void a(x xVar, String str) {
        Intrinsics.checkNotNullParameter(xVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        GTCaptcha4Client.OnFailureListener onFailureListener = xVar.g;
        if (onFailureListener != null) {
            onFailureListener.onFailure(str);
        }
    }

    public final void a(final boolean z, @NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (Intrinsics.EZpvd(Looper.getMainLooper(), Looper.myLooper())) {
                GTCaptcha4Client.OnSuccessListener onSuccessListener = this.f;
                if (onSuccessListener != null) {
                    onSuccessListener.onSuccess(z, str);
                }
            } else {
                ((Activity) this.f386a).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.x$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a(this.f$0, z, str);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void a(x xVar, boolean z, String str) {
        Intrinsics.checkNotNullParameter(xVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        GTCaptcha4Client.OnSuccessListener onSuccessListener = xVar.f;
        if (onSuccessListener != null) {
            onSuccessListener.onSuccess(z, str);
        }
    }
}
