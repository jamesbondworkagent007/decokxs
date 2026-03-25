package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.onesignal.OneSignal;
import o.C57837ypu;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57754yoQ {
    public void KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.Nullable java.lang.Integer num, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.NonNull C57837ypu.TaskDescription taskDescription) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(HiAnalyticsConstant.BI_KEY_APP_ID, str).put("player_id", str2);
            if (num != null) {
                jSONObjectPut.put("device_type", num);
            }
            C57837ypu.OLrzqt("notifications/" + str3 + "/report_received", jSONObjectPut, taskDescription);
        } catch (JSONException e) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Generating direct receive receipt:JSON Failed.", e);
        }
    }
}
