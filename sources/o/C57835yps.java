package o;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.onesignal.OneSignal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C57837ypu;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57835yps {
    public static int OLrzqt;

    /* JADX INFO: renamed from: o.yps$Activity */
    public interface Activity {
        void OLrzqt(Application application);
    }

    /* JADX INFO: renamed from: o.yps$Application */
    public static class Application {
        public JSONArray AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.Boolean AkhnZx;
        public boolean DbNXlk;
        public java.lang.Boolean EZpvd;
        public StateListAnimator KWHzl;
        public boolean OLrzqt;
        public boolean copydefault;
        public TaskDescription djBIcL;
        public boolean ejfBZ;
        public boolean fetchVPNInfo;
        public boolean gEmmrt;
        public boolean isConnected;
        public java.lang.Boolean valueOf;
        public java.lang.Boolean values;
    }

    /* JADX INFO: renamed from: o.yps$StateListAnimator */
    public static class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.lang.String KWHzl;
        public java.lang.String copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ int EZpvd() {
        int i = OLrzqt;
        OLrzqt = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: o.yps$TaskDescription */
    public static class TaskDescription {
        public int EZpvd = 1440;
        public int gEmmrt = 10;
        public int copydefault = 1440;
        public int AEQbTJ = 10;
        public boolean OLrzqt = false;
        public boolean KWHzl = false;
        public boolean AYXKKw = false;
        public boolean AhwBna = false;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean valueOf() {
            return this.KWHzl;
        }

        public java.lang.String toString() {
            return "InfluenceParams{indirectNotificationAttributionWindow=" + this.EZpvd + ", notificationLimit=" + this.gEmmrt + ", indirectIAMAttributionWindow=" + this.copydefault + ", iamLimit=" + this.AEQbTJ + ", directEnabled=" + this.OLrzqt + ", indirectEnabled=" + this.KWHzl + ", unattributedEnabled=" + this.AYXKKw + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static void OLrzqt(final java.lang.String str, final java.lang.String str2, @androidx.annotation.NonNull final Activity activity) {
        C57837ypu.TaskDescription taskDescription = new C57837ypu.TaskDescription() { // from class: o.yps.2
            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(int i, java.lang.String str3, java.lang.Throwable th) {
                if (i == 403) {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.FATAL, "403 error getting OneSignal params, omitting further retries!");
                } else {
                    new java.lang.Thread(new java.lang.Runnable() { // from class: o.yps.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            int i2 = (C57835yps.OLrzqt * 10000) + 30000;
                            if (i2 > 90000) {
                                i2 = 90000;
                            }
                            OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "Failed to get Android parameters, trying again in " + (i2 / 1000) + " seconds.");
                            try {
                                java.lang.Thread.sleep(i2);
                                C57835yps.EZpvd();
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                C57835yps.OLrzqt(str, str2, activity);
                            } catch (java.lang.InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }, "OS_PARAMS_REQUEST").start();
                }
            }

            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(java.lang.String str3) {
                C57835yps.KWHzl(str3, activity);
            }
        };
        java.lang.String str3 = "apps/" + str + "/android_params.js";
        if (str2 != null) {
            str3 = str3 + "?player_id=" + str2;
        }
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Starting request to get Android parameters.");
        C57837ypu.AEQbTJ(str3, taskDescription, "CACHE_KEY_REMOTE_PARAMS");
    }

    public static void KWHzl(java.lang.String str, @androidx.annotation.NonNull Activity activity) {
        try {
            activity.OLrzqt(new Application(new JSONObject(str)) { // from class: o.yps.4
                public final /* synthetic */ JSONObject AEQbTJ;

                {
                    this.AEQbTJ = jSONObject;
                    this.OLrzqt = jSONObject.optBoolean("enterp", false);
                    this.isConnected = jSONObject.optBoolean("require_email_auth", false);
                    this.ejfBZ = jSONObject.optBoolean("require_user_id_auth", false);
                    this.AYXKKw = jSONObject.optJSONArray("chnl_lst");
                    this.gEmmrt = jSONObject.optBoolean("fba", false);
                    this.DbNXlk = jSONObject.optBoolean("restore_ttl_filter", true);
                    this.AhwBna = jSONObject.optString("android_sender_id", null);
                    this.copydefault = jSONObject.optBoolean("clear_group_on_summary_click", true);
                    this.fetchVPNInfo = jSONObject.optBoolean("receive_receipts_enable", false);
                    this.EZpvd = !jSONObject.has("disable_gms_missing_prompt") ? null : java.lang.Boolean.valueOf(jSONObject.optBoolean("disable_gms_missing_prompt", false));
                    this.values = !jSONObject.has("unsubscribe_on_notifications_disabled") ? null : java.lang.Boolean.valueOf(jSONObject.optBoolean("unsubscribe_on_notifications_disabled", true));
                    this.valueOf = !jSONObject.has("location_shared") ? null : java.lang.Boolean.valueOf(jSONObject.optBoolean("location_shared", true));
                    this.AkhnZx = !jSONObject.has("requires_user_privacy_consent") ? null : java.lang.Boolean.valueOf(jSONObject.optBoolean("requires_user_privacy_consent", false));
                    this.djBIcL = new TaskDescription();
                    if (jSONObject.has("outcomes")) {
                        C57835yps.AEQbTJ(jSONObject.optJSONObject("outcomes"), this.djBIcL);
                    }
                    this.KWHzl = new StateListAnimator();
                    if (jSONObject.has("fcm")) {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("fcm");
                        this.KWHzl.copydefault = jSONObjectOptJSONObject.optString("api_key", null);
                        this.KWHzl.AEQbTJ = jSONObjectOptJSONObject.optString(HiAnalyticsConstant.BI_KEY_APP_ID, null);
                        this.KWHzl.KWHzl = jSONObjectOptJSONObject.optString("project_id", null);
                    }
                }
            });
        } catch (java.lang.NullPointerException | JSONException e) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.FATAL;
            OneSignal.OLrzqt(log_level, "Error parsing android_params!: ", e);
            OneSignal.KWHzl(log_level, "Response that errored from android_params!: " + str);
        }
    }

    public static void AEQbTJ(JSONObject jSONObject, TaskDescription taskDescription) {
        if (jSONObject.has("v2_enabled")) {
            taskDescription.AhwBna = jSONObject.optBoolean("v2_enabled");
        }
        if (jSONObject.has(DevicePublicKeyStringDef.DIRECT)) {
            taskDescription.OLrzqt = jSONObject.optJSONObject(DevicePublicKeyStringDef.DIRECT).optBoolean("enabled");
        }
        if (jSONObject.has(DevicePublicKeyStringDef.INDIRECT)) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(DevicePublicKeyStringDef.INDIRECT);
            taskDescription.KWHzl = jSONObjectOptJSONObject.optBoolean("enabled");
            if (jSONObjectOptJSONObject.has("notification_attribution")) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("notification_attribution");
                taskDescription.EZpvd = jSONObjectOptJSONObject2.optInt("minutes_since_displayed", 1440);
                taskDescription.gEmmrt = jSONObjectOptJSONObject2.optInt("limit", 10);
            }
            if (jSONObjectOptJSONObject.has("in_app_message_attribution")) {
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("in_app_message_attribution");
                taskDescription.copydefault = jSONObjectOptJSONObject3.optInt("minutes_since_displayed", 1440);
                taskDescription.AEQbTJ = jSONObjectOptJSONObject3.optInt("limit", 10);
            }
        }
        if (jSONObject.has("unattributed")) {
            taskDescription.AYXKKw = jSONObject.optJSONObject("unattributed").optBoolean("enabled");
        }
    }
}
