package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.core.api.MTProtocol;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.MTPush;
import com.engagelab.privates.push.business.message.platform.JDataUtils;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile b0 f323a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static b0 a() {
        if (f323a == null) {
            synchronized (b0.class) {
                f323a = new b0();
            }
        }
        return f323a;
    }

    public void a(Context context, Bundle bundle) {
        JSONObject jSONObjectOptJSONObject;
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(((MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL)).getBody());
            byte b = byteBufferWrap.get();
            long j = byteBufferWrap.getLong();
            LineNumberReader lineNumberReader = new LineNumberReader(new StringReader(StringUtil.getTlv2(byteBufferWrap)));
            String line = lineNumberReader.readLine();
            String line2 = lineNumberReader.readLine();
            String line3 = lineNumberReader.readLine();
            if (!TextUtils.equals(line, context.getPackageName())) {
                MTCommonLog.w("MTMessageBusiness", "the message applicationId is [" + line + "]");
                return;
            }
            if (!TextUtils.equals(line2, MTGlobal.getAppKey(context))) {
                MTCommonLog.w("MTMessageBusiness", "the message applicationKey is [" + line2 + "]");
                return;
            }
            if (TextUtils.isEmpty(line3)) {
                MTCommonLog.w("MTMessageBusiness", "the message is empty");
                return;
            }
            JSONObject jSONObject = new JSONObject(line3);
            int iOptInt = jSONObject.optInt("n_only");
            int iOptInt2 = jSONObject.optInt("show_type");
            String jDataFromMessageJson = JDataUtils.getJDataFromMessageJson(jSONObject);
            JDataUtils.addJDataMessageID(String.valueOf(j), jDataFromMessageJson);
            a(context, b, j, jDataFromMessageJson);
            if (g0.a(context, e0.a(jSONObject))) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("message", jSONObject.toString());
            MTCommonLog.d("MTMessageBusiness", "onMessage:" + MTCommonLog.toLogString(jSONObject));
            if (jSONObject.has("geofence") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("geofence")) != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("geofenceid"))) {
                MTCommonLog.d("MTMessageBusiness", "is geofence notification");
                MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTPushConstants.RemoteWhat.ADD_GEOFENCE, bundle2);
                return;
            }
            MTCommonLog.w("MTMessageBusiness", "onMessage type=" + iOptInt2 + " flag=" + iOptInt);
            if (iOptInt2 == 4) {
                d0.b().a(context, bundle2);
                c0.b().a(context, bundle2);
            } else if (iOptInt == 1) {
                d0.b().a(context, bundle2);
            } else if (iOptInt == 0) {
                c0.b().a(context, bundle2);
            }
        } catch (Throwable th) {
            MTCommonLog.w("MTMessageBusiness", "onMessage failed " + th.getMessage());
        }
    }

    public final void a(Context context, int i, long j, String str) {
        MTProtocol threadName = new MTProtocol().setCommand(4).setVersion(2).setBody(n0.a(i, j, str)).setThreadName(MTPush.f352a);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, threadName);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.UPLOAD, bundle);
    }
}
