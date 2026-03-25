package com.bytedance.bdtracker;

import android.app.Application;
import android.content.res.Resources;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.exception.AppCrashType;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o3 extends g3 {
    public String e;
    public String f;
    public long g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(@NotNull d dVar) {
        super(dVar);
        Intrinsics.EZpvd((Object) dVar, "");
        this.e = "";
        this.f = "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.g3
    public String a() {
        return "init";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.g3
    public void a(@NotNull JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) jSONObject, "");
        Intrinsics.EZpvd((Object) jSONObject, "");
        d dVar = this.d;
        try {
            dVar.getSdkVersion();
            jSONObject.put(HianalyticsBaseData.SDK_VERSION, "6.17.6");
            jSONObject.put("sdk_lib", "Android");
            InitConfig initConfig = this.d.getInitConfig();
            jSONObject.put("sdk_channel", initConfig != null ? initConfig.getChannel() : null);
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
        Intrinsics.EZpvd((Object) jSONObject, "");
        d dVar2 = this.d;
        try {
            InitConfig initConfig2 = dVar2.getInitConfig();
            if (initConfig2 != null) {
                Intrinsics.AEQbTJ(initConfig2, "");
                jSONObject.put("config_app_id", initConfig2.getAid());
                jSONObject.put("config_channel", initConfig2.getChannel());
                jSONObject.put("config_sp_name", initConfig2.getSpName());
                jSONObject.put("config_db_name", initConfig2.getDbName());
                jSONObject.put("config_request_encrypt", dVar2.E);
                if (dVar2.E) {
                    jSONObject.put("config_response_encrypt", initConfig2.isResponseEncryptEnabled());
                    jSONObject.put("config_custom_encrypt", initConfig2.getEncryptor() == null);
                }
                jSONObject.put("config_log_enable", initConfig2.isLogEnable());
                jSONObject.put("config_ab_enable", initConfig2.isAbEnable());
                jSONObject.put("config_auto_start", initConfig2.autoStart());
                jSONObject.put("config_h5_bridge_enable", initConfig2.isH5BridgeEnable());
                jSONObject.put("config_h5_collect_enable", initConfig2.isH5CollectEnable());
                jSONObject.put("config_bridge_update_user_enable", initConfig2.isUseBridgeUpdateUUIDEnabled());
                jSONObject.put("config_auto_track_enable", initConfig2.isAutoTrackEnabled());
                jSONObject.put("config_exposure_enable", initConfig2.isExposureEnabled());
                jSONObject.put("config_oaid_enable", initConfig2.isOaidEnabled());
                jSONObject.put("config_mac_enable", initConfig2.isMacEnable());
                jSONObject.put("config_androidid_enable", initConfig2.isAndroidIdEnabled());
                jSONObject.put("config_operator_enable", initConfig2.isOperatorInfoEnabled());
                jSONObject.put("config_serialnumber_enable", initConfig2.isSerialNumberEnable());
                jSONObject.put("config_track_fragment_enable", initConfig2.isAutoTrackFragmentEnabled());
                jSONObject.put("config_exposure_enable", initConfig2.isOperatorInfoEnabled());
                jSONObject.put("config_crash_enable", AppCrashType.hasCrashType(initConfig2.getTrackCrashType(), 1));
                jSONObject.put("config_tracer_enable", initConfig2.isDeferredALinkEnabled());
                jSONObject.put("config_gaid_enable", initConfig2.isGaidEnabled());
                jSONObject.put("config_display_enable", initConfig2.isDisplayDensityAndDpiEnabled());
                jSONObject.put("config_cpu_encrypt", initConfig2.isCPUAbiEnabled());
                jSONObject.put("config_repeat_exposure_encrypt", initConfig2.isAbTestExposureEventRepeatEnabled());
            }
        } catch (Throwable th2) {
            dVar2.D.error(7, "Run task failed", th2, new Object[0]);
        }
        Intrinsics.EZpvd((Object) jSONObject, "");
        d dVar3 = this.d;
        try {
            jSONObject.put("run_start", this.f178a);
            jSONObject.put("run_duration", this.g);
            jSONObject.put("run_status", this.f);
            if (this.e.length() > 0) {
                jSONObject.put("run_fail", this.e);
            }
        } catch (Throwable th3) {
            dVar3.D.error(7, "Run task failed", th3, new Object[0]);
        }
        Intrinsics.EZpvd((Object) jSONObject, "");
        d dVar4 = this.d;
        try {
            jSONObject.put("device_platform", "Android");
            d dVar5 = this.d;
            Application application = dVar5.n;
            Intrinsics.AEQbTJ(application, "");
            Resources resources = application.getResources();
            Intrinsics.AEQbTJ(resources, "");
            Locale locale = resources.getConfiguration().locale;
            Intrinsics.AEQbTJ(locale, "");
            jSONObject.put("device_language", locale.getLanguage());
            jSONObject.put("device_network", i5.a(dVar5.n));
        } catch (Throwable th4) {
            dVar4.D.error(7, "Run task failed", th4, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.g3
    public void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.b = jCurrentTimeMillis;
        this.g = jCurrentTimeMillis - this.f178a;
        this.f = a.a(this.f, "|1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.g3
    public void d() {
        this.f178a = System.currentTimeMillis();
        this.f = "0";
        this.c = true;
    }
}
