package o;

import android.provider.Settings;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.okinc.okrisk.collection.OKRiskDataFetcher;
import java.util.UUID;
import org.json.JSONObject;
import pub.devrel.easypermissions.BuildConfig;

/* JADX INFO: renamed from: o.tia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C47042tia {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String KWHzl() {
        return BuildConfig.VERSION_NAME;
    }

    public static java.lang.String OLrzqt(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "unknown";
        }
    }

    public static java.lang.String AEQbTJ(android.content.Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static java.lang.String OLrzqt() {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(android.os.Build.BOARD);
            sb.append(android.os.Build.BRAND);
            sb.append(android.os.Build.DEVICE);
            sb.append(android.os.Build.HARDWARE);
            sb.append(android.os.Build.ID);
            sb.append(android.os.Build.MODEL);
            sb.append(android.os.Build.PRODUCT);
            sb.append(android.os.Build.SERIAL);
            return new UUID(sb.toString().hashCode(), r1.hashCode()).toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static long EZpvd() {
        return java.lang.System.currentTimeMillis();
    }

    public static java.lang.String AEQbTJ() {
        return java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    public static void OLrzqt(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            jSONObject.put("msg", str2);
            jSONObject.put("version", OLrzqt(context));
            jSONObject.put("device_id", AEQbTJ(context));
            jSONObject.put("device_uuid", OLrzqt());
            jSONObject.put(CrashHianalyticsData.TIME, EZpvd());
            jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, "Android");
            jSONObject.put(HianalyticsBaseData.SDK_VERSION, KWHzl());
            java.lang.String strAEQbTJ = AEQbTJ();
            java.lang.String strExpEn = OKRiskDataFetcher.expEn(jSONObject.toString(), strAEQbTJ);
            java.util.HashMap map = new java.util.HashMap();
            map.put("data", strExpEn);
            map.put("timestamp", strAEQbTJ);
            map.put(MTPushConstants.PlatformNode.KEY_PLATFORM, "Android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("arch", android.os.Build.SUPPORTED_ABIS[0] + ContainerUtils.FIELD_DELIMITER + java.lang.System.getProperty("os.arch"));
            map.put("ext", jSONObject2.toString());
            C47065tix.copydefault("https://www.okx.com/priapi/v3/tlog/log", map, null, null);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }
}
