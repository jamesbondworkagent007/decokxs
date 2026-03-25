package o;

import com.huawei.hms.push.RemoteMessage;
import com.onesignal.OneSignal;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57831ypo {
    public static final AtomicBoolean copydefault = new AtomicBoolean(true);

    public static void KWHzl(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable android.os.Bundle bundle) {
        if (copydefault.compareAndSet(true, false)) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "OneSignalHmsEventBridge onNewToken - HMS token: " + str + " Bundle: " + bundle);
            C57793ypC.AEQbTJ(str);
            return;
        }
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + str + " Bundle: " + bundle);
    }

    public static void copydefault(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull RemoteMessage remoteMessage) {
        java.lang.String data = remoteMessage.getData();
        try {
            JSONObject jSONObject = new JSONObject(remoteMessage.getData());
            if (remoteMessage.getTtl() == 0) {
                jSONObject.put("hms.ttl", 259200);
            } else {
                jSONObject.put("hms.ttl", remoteMessage.getTtl());
            }
            if (remoteMessage.getSentTime() == 0) {
                jSONObject.put("hms.sent_time", OneSignal.aKErDB().KWHzl());
            } else {
                jSONObject.put("hms.sent_time", remoteMessage.getSentTime());
            }
            data = jSONObject.toString();
        } catch (JSONException unused) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON");
        }
        C57706ynV.EZpvd(context, data);
    }
}
