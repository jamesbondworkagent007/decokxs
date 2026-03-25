package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.OneSignal;
import kotlin.jvm.internal.Intrinsics;
import o.C57692ynH;
import o.C57745yoH;
import o.C57789yoz;
import o.C57839ypw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    public void onMessage(Context context, Intent intent) {
        Bundle extras = intent == null ? null : intent.getExtras();
        C57692ynH.OLrzqt(context, extras, new Activity(extras, context));
    }

    public static final class Activity implements C57692ynH.Application {
        public final /* synthetic */ Bundle KWHzl;
        public final /* synthetic */ Context copydefault;

        public Activity(Bundle bundle, Context context) {
            this.KWHzl = bundle;
            this.copydefault = context;
        }

        @Override // o.C57692ynH.Application
        public void copydefault(C57692ynH.ActionBar actionBar) {
            if (actionBar != null && actionBar.OLrzqt()) {
                return;
            }
            JSONObject jSONObjectKWHzl = C57692ynH.KWHzl(this.KWHzl);
            Intrinsics.checkNotNullExpressionValue(jSONObjectKWHzl, "");
            C57789yoz c57789yoz = new C57789yoz(jSONObjectKWHzl);
            C57745yoH c57745yoH = new C57745yoH(this.copydefault);
            Context context = this.copydefault;
            c57745yoH.AEQbTJ(jSONObjectKWHzl);
            c57745yoH.EZpvd(context);
            c57745yoH.KWHzl(c57789yoz);
            C57692ynH.AEQbTJ(c57745yoH, true);
        }
    }

    public void onRegistered(Context context, String str) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, Intrinsics.KWHzl("ADM registration ID: ", str));
        C57839ypw.KWHzl(str);
    }

    public void onUnregistered(Context context, String str) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, Intrinsics.KWHzl("ADM:onUnregistered: ", str));
    }

    public void onRegistrationError(Context context, String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
        OneSignal.KWHzl(log_level, Intrinsics.KWHzl("ADM:onRegistrationError: ", str));
        if (Intrinsics.EZpvd((Object) "INVALID_SENDER", (Object) str)) {
            OneSignal.KWHzl(log_level, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        C57839ypw.KWHzl(null);
    }
}
