package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.firebase.messaging.Constants;
import com.onesignal.OneSignal;
import o.C57692ynH;
import o.C57723ynm;
import o.C57725yno;
import o.IntentServiceC57731ynu;
import o.InterfaceC57718ynh;
import o.ServiceC57727ynq;

/* JADX INFO: loaded from: classes24.dex */
public class FCMBroadcastReceiver extends WakefulBroadcastReceiver {
    public static boolean KWHzl(Intent intent) {
        String stringExtra;
        return "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()) && ((stringExtra = intent.getStringExtra("message_type")) == null || Constants.MessageTypes.MESSAGE.equals(stringExtra));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bundle extras = intent.getExtras();
        if (extras == null || "google.com/iid".equals(extras.getString("from"))) {
            return;
        }
        OneSignal.fetchVPNInfo(context);
        AEQbTJ(context, intent, extras, new C57692ynH.Application() { // from class: com.onesignal.FCMBroadcastReceiver.5
            @Override // o.C57692ynH.Application
            public void copydefault(@Nullable C57692ynH.ActionBar actionBar) {
                if (actionBar == null) {
                    FCMBroadcastReceiver.this.EZpvd();
                } else if (actionBar.EZpvd() || actionBar.AEQbTJ()) {
                    FCMBroadcastReceiver.this.OLrzqt();
                } else {
                    FCMBroadcastReceiver.this.EZpvd();
                }
            }
        });
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.INFO, "FCMBroadcastReceiver onReceive cost time" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final void EZpvd() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    public final void OLrzqt() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    public static void AEQbTJ(final Context context, Intent intent, final Bundle bundle, final C57692ynH.Application application) {
        if (!KWHzl(intent)) {
            application.copydefault(null);
        }
        C57692ynH.OLrzqt(context, bundle, new C57692ynH.Application() { // from class: com.onesignal.FCMBroadcastReceiver.4
            @Override // o.C57692ynH.Application
            public void copydefault(@Nullable C57692ynH.ActionBar actionBar) {
                if (actionBar != null && actionBar.OLrzqt()) {
                    application.copydefault(actionBar);
                } else {
                    FCMBroadcastReceiver.copydefault(context, bundle);
                    application.copydefault(actionBar);
                }
            }
        });
    }

    public static void copydefault(Context context, Bundle bundle) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.KWHzl(log_level, "startFCMService from: " + context + " and bundle: " + bundle);
        if (!C57692ynH.AEQbTJ(bundle)) {
            OneSignal.KWHzl(log_level, "startFCMService with no remote resources, no need for services");
            C57692ynH.KWHzl(context, AEQbTJ(bundle, C57723ynm.KWHzl()));
        } else {
            if (Integer.parseInt(bundle.getString("pri", "0")) <= 9 && Build.VERSION.SDK_INT >= 26) {
                KWHzl(context, bundle);
                return;
            }
            try {
                EZpvd(context, bundle);
            } catch (IllegalStateException unused) {
                KWHzl(context, bundle);
            }
        }
    }

    public static void KWHzl(Context context, Bundle bundle) {
        InterfaceC57718ynh interfaceC57718ynhAEQbTJ = AEQbTJ(bundle, C57723ynm.KWHzl());
        Intent intent = new Intent(context, (Class<?>) ServiceC57727ynq.class);
        intent.putExtra("Bundle:Parcelable:Extras", (Parcelable) interfaceC57718ynhAEQbTJ.OLrzqt());
        ServiceC57727ynq.OLrzqt(context, intent);
    }

    public static void EZpvd(Context context, Bundle bundle) {
        WakefulBroadcastReceiver.startWakefulService(context, new Intent().replaceExtras((Bundle) AEQbTJ(bundle, new C57725yno()).OLrzqt()).setComponent(new ComponentName(context.getPackageName(), IntentServiceC57731ynu.class.getName())));
    }

    public static InterfaceC57718ynh AEQbTJ(Bundle bundle, InterfaceC57718ynh interfaceC57718ynh) {
        interfaceC57718ynh.OLrzqt("json_payload", C57692ynH.KWHzl(bundle).toString());
        interfaceC57718ynh.copydefault("timestamp", Long.valueOf(OneSignal.aKErDB().KWHzl() / 1000));
        return interfaceC57718ynh;
    }
}
