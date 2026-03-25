package com.geetest.gtc4;

import android.content.Context;
import android.webkit.URLUtil;
import com.geetest.gtc4.GeeGuard;

/* JADX INFO: loaded from: classes21.dex */
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f528a;
    public String b = "https://riskct.geetest.com/g2/api/v1/client_report";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(final Context context, String str, String str2, final GeeGuard.CallbackHandler callbackHandler) {
        if (str != null && !str.isEmpty()) {
            this.f528a = str;
        }
        if (str2 != null && !str2.isEmpty() && URLUtil.isValidUrl(str2)) {
            this.b = str2;
        }
        t3.a(context.getSharedPreferences("gt_core", 0));
        u3.a(context);
        if (callbackHandler == null) {
            return;
        }
        if (this.b.equals("https://riskct.geetest.com/g2/api/v1/client_report")) {
            new Thread(new Runnable() { // from class: com.geetest.gtc4.w3$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(context, callbackHandler);
                }
            }).start();
        } else {
            new Thread(new Runnable() { // from class: com.geetest.gtc4.w3$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(context, callbackHandler);
                }
            }).start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Context context, GeeGuard.CallbackHandler callbackHandler) {
        v3.f523a.b(context, null, 5000, callbackHandler);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void b(final Context context, final String str, final int i, final GeeGuard.CallbackHandler callbackHandler) {
        new Thread(new Runnable() { // from class: com.geetest.gtc4.w3$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(context, str, i, callbackHandler);
            }
        }).start();
    }

    public final /* synthetic */ void a(Context context, GeeGuard.CallbackHandler callbackHandler) {
        b(context, null, 5000, callbackHandler);
    }

    public final GeeGuardReceipt a(Context context, String str) {
        String str2 = this.f528a;
        if (str2 == null || str2.isEmpty()) {
            return null;
        }
        return r3.a(context, this.f528a, str);
    }

    public final /* synthetic */ void a(Context context, String str, int i, GeeGuard.CallbackHandler callbackHandler) {
        r3.a(context, this.f528a, str, i, this.b, callbackHandler);
    }
}
