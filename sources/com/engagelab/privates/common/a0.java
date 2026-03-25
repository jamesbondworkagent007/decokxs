package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.DateUtil;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.core.api.MTReporter;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.p2p.api.OtcExtraKeys;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class a0 {
    public static volatile a0 c = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f321a = 0;
    public long b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static a0 a() {
        return c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(Context context) {
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.b == 0) {
                this.b = l0.c(context);
            }
            if (0 == this.f321a) {
                this.f321a = l0.d(context);
            }
            if (jCurrentTimeMillis - this.b < 30000) {
                return;
            }
            this.f321a = jCurrentTimeMillis;
            l0.b(context, jCurrentTimeMillis);
            b(context, jCurrentTimeMillis);
        }
    }

    public void a(Context context) {
        synchronized (this) {
            if (0 == this.f321a) {
                MTCommonLog.w("MTActiveBusiness", "toBackground lastToForegroundTime is 0 ");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            a(context, jCurrentTimeMillis, this.f321a);
            this.b = jCurrentTimeMillis;
            l0.a(context, jCurrentTimeMillis);
        }
    }

    public static void a(Context context, long j, long j2) {
        String strA;
        synchronized (a0.class) {
            try {
                strA = l0.a(context);
            } catch (Throwable th) {
                MTCommonLog.w("MTActiveBusiness", "processBackground failed " + th.getMessage());
            }
            if (TextUtils.isEmpty(strA)) {
                MTCommonLog.d("MTActiveBusiness", "session is null");
                return;
            }
            long j3 = (j - j2) / 1000;
            if (j3 < 0) {
                j3 = 0;
            }
            String todayDateTimeForReport = DateUtil.getTodayDateTimeForReport();
            String str = todayDateTimeForReport.split("_")[0];
            String str2 = todayDateTimeForReport.split("_")[1];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(OtcExtraKeys.PARAMS_SESSION_ID, strA);
            jSONObject.put("date", str);
            jSONObject.put(CrashHianalyticsData.TIME, str2);
            jSONObject.put("duration", j3);
            l0.b(context, jSONObject.toString());
        }
    }

    public static void b(Context context, long j) {
        String strA;
        synchronized (a0.class) {
            try {
                String strB = l0.b(context);
                if (!TextUtils.isEmpty(strB)) {
                    MTReporter content = new MTReporter().setType(MTAnalysisConstants.TYPE_ACTIVE_TERMINATE).setContent(new JSONObject(strB).toString());
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, content);
                    MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, bundle);
                }
                strA = a(context, j);
            } catch (Throwable th) {
                MTCommonLog.w("MTActiveBusiness", "processForeground failed " + th.getMessage());
            }
            if (TextUtils.isEmpty(strA)) {
                MTCommonLog.d("MTActiveBusiness", "session is null");
                return;
            }
            l0.a(context, strA);
            String todayDateTimeForReport = DateUtil.getTodayDateTimeForReport();
            String str = todayDateTimeForReport.split("_")[0];
            String str2 = todayDateTimeForReport.split("_")[1];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(OtcExtraKeys.PARAMS_SESSION_ID, strA);
            jSONObject.put("date", str);
            jSONObject.put(CrashHianalyticsData.TIME, str2);
            MTReporter content2 = new MTReporter().setType(MTAnalysisConstants.TYPE_ACTIVE_LAUNCH).setContent(jSONObject.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, content2);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, bundle2);
        }
    }

    public static String a(Context context, long j) {
        StringBuilder sb = new StringBuilder();
        String appKey = MTGlobal.getAppKey(context);
        if (!TextUtils.isEmpty(appKey)) {
            sb.append(appKey);
        }
        String deviceId = MTGlobal.getDeviceId(context);
        if (!TextUtils.isEmpty(deviceId)) {
            sb.append(deviceId);
        }
        sb.append(j);
        return StringUtil.get32MD5String(sb.toString());
    }
}
