package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.onesignal.OneSignal;
import o.C57692ynH;
import o.C57745yoH;
import o.C57789yoz;
import o.C57839ypw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        final Context applicationContext = getApplicationContext();
        final Bundle extras = intent.getExtras();
        C57692ynH.OLrzqt(applicationContext, extras, new C57692ynH.Application() { // from class: com.onesignal.ADMMessageHandler.4
            @Override // o.C57692ynH.Application
            public void copydefault(@Nullable C57692ynH.ActionBar actionBar) {
                if (actionBar.OLrzqt()) {
                    return;
                }
                JSONObject jSONObjectKWHzl = C57692ynH.KWHzl(extras);
                C57789yoz c57789yoz = new C57789yoz(jSONObjectKWHzl);
                C57745yoH c57745yoH = new C57745yoH(applicationContext);
                c57745yoH.AEQbTJ(jSONObjectKWHzl);
                c57745yoH.EZpvd(applicationContext);
                c57745yoH.KWHzl(c57789yoz);
                C57692ynH.AEQbTJ(c57745yoH, true);
            }
        });
    }

    public void onRegistered(String str) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "ADM registration ID: " + str);
        C57839ypw.KWHzl(str);
    }

    public void onRegistrationError(String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
        OneSignal.KWHzl(log_level, "ADM:onRegistrationError: " + str);
        if ("INVALID_SENDER".equals(str)) {
            OneSignal.KWHzl(log_level, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        C57839ypw.KWHzl(null);
    }

    public void onUnregistered(String str) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "ADM:onUnregistered: " + str);
    }
}
