package com.engagelab.privates.common;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.analysis.api.Event;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.DateUtil;
import com.engagelab.privates.common.utils.StringUtil;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class b {
    public static volatile b d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f322a = true;
    public long b = 0;
    public long c = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.c == 0) {
            this.c = i.l(context);
        }
        if (jCurrentTimeMillis - this.c < 30000) {
            return;
        }
        this.b = jCurrentTimeMillis;
        i.b(context, jCurrentTimeMillis);
        a(context, jCurrentTimeMillis, this.f322a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static b a() {
        if (d == null) {
            synchronized (b.class) {
                d = new b();
            }
        }
        return d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void b(Context context) {
        if (0 == this.b) {
            MTCommonLog.w("MTActiveBusiness", "toBackground lastToForegroundTime is 0 ");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        a(context, jCurrentTimeMillis, this.b);
        this.c = jCurrentTimeMillis;
        i.a(context, jCurrentTimeMillis);
    }

    public void a(Context context) {
        try {
            String strC = i.c(context);
            String strD = i.d(context);
            if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strD)) {
                MTCommonLog.d("MTActiveBusiness", "there are no cache active json");
                JSONObject jSONObjectA = l.a(context);
                JSONObject jSONObjectA2 = h.a().a(context, "active", jSONObjectA);
                i.c(context, jSONObjectA2.toString());
                h.a().a(context, jSONObjectA2);
                JSONObject jSONObjectB = d.c().b(context, a(jSONObjectA));
                i.d(context, jSONObjectB.toString());
                h.a().a(context, jSONObjectB);
                return;
            }
            MTCommonLog.d("MTActiveBusiness", "there are cache active json");
            h.a().a(context, new JSONObject(strC));
            h.a().a(context, new JSONObject(strD));
        } catch (Throwable th) {
            MTCommonLog.w("MTActiveBusiness", "init failed " + th.getMessage());
        }
    }

    public final Event a(JSONObject jSONObject) {
        Event event = new Event("active");
        if (jSONObject == null) {
            return event;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "type") && !TextUtils.equals(next, "itime") && !TextUtils.equals(next, "random_id") && !TextUtils.equals(next, "account_id")) {
                event.putExtraAttr(next, l.a(jSONObject.opt(next)));
            }
        }
        return event;
    }

    public static void a(Context context, long j, boolean z) {
        try {
            String strK = i.k(context);
            if (!TextUtils.isEmpty(strK)) {
                JSONObject jSONObject = new JSONObject(strK);
                Event event = new Event(MTAnalysisConstants.TYPE_ACTIVE_TERMINATE);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    event.putExtraAttr(next, jSONObject.opt(next));
                }
                d.c().a(context, event);
            }
            String strA = a(context, j);
            if (TextUtils.isEmpty(strA)) {
                MTCommonLog.d("MTActiveBusiness", "session is null");
                return;
            }
            i.g(context, strA);
            String todayDateTimeForReport = DateUtil.getTodayDateTimeForReport();
            String str = todayDateTimeForReport.split("_")[0];
            String str2 = todayDateTimeForReport.split("_")[1];
            Event event2 = new Event(MTAnalysisConstants.TYPE_ACTIVE_LAUNCH);
            boolean zG = i.g(context);
            event2.putExtraAttr("launch_t", Integer.valueOf(!z ? 1 : 0));
            event2.putExtraAttr("fir_t", Integer.valueOf(zG ? 1 : 0));
            event2.putExtraAttr(OtcExtraKeys.PARAMS_SESSION_ID, strA);
            event2.putExtraAttr("date", str);
            event2.putExtraAttr(CrashHianalyticsData.TIME, str2);
            i.a(context, false);
            d.c().a(context, event2);
        } catch (Throwable th) {
            MTCommonLog.w("MTActiveBusiness", "processForeground failed " + th.getMessage());
        }
    }

    public void a(Context context, long j, long j2) {
        try {
            String strJ = i.j(context);
            if (TextUtils.isEmpty(strJ)) {
                MTCommonLog.d("MTActiveBusiness", "session is null");
                return;
            }
            long j3 = (j - j2) / 1000;
            String todayDateTimeForReport = DateUtil.getTodayDateTimeForReport();
            String str = todayDateTimeForReport.split("_")[0];
            String str2 = todayDateTimeForReport.split("_")[1];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(OtcExtraKeys.PARAMS_SESSION_ID, strJ);
            jSONObject.put("date", str);
            jSONObject.put(CrashHianalyticsData.TIME, str2);
            jSONObject.put("duration", j3);
            i.h(context, jSONObject.toString());
        } catch (Throwable th) {
            MTCommonLog.w("MTActiveBusiness", "processBackground failed " + th.getMessage());
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
