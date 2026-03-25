package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.api.MTProtocol;
import com.engagelab.privates.core.api.Outputer;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile m f339a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(Context context) {
        int iG = w.g(context);
        long jO = w.o(context);
        String strH = w.h(context);
        String strE = w.e(context);
        Bundle bundle = new Bundle();
        bundle.putInt("code", iG);
        bundle.putLong(MTCoreConstants.Register.KEY_USER_ID, jO);
        bundle.putString(MTCoreConstants.Register.KEY_REGISTRATION_ID, strH);
        bundle.putString(MTCoreConstants.Register.KEY_PASSWORD, strE);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_REGISTER_INTO, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(Context context, Bundle bundle) {
        int i = bundle.getInt("code");
        long j = bundle.getLong(MTCoreConstants.Register.KEY_USER_ID);
        String string = bundle.getString(MTCoreConstants.Register.KEY_REGISTRATION_ID);
        String string2 = bundle.getString(MTCoreConstants.Register.KEY_PASSWORD);
        MTCoreGlobal.setRegisterCode(i);
        MTCoreGlobal.setUserId(j);
        MTCoreGlobal.setRegistrationId(string);
        MTCoreGlobal.setPassword(string2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static m a() {
        if (f339a == null) {
            synchronized (m.class) {
                f339a = new m();
            }
        }
        return f339a;
    }

    public void a(Context context) {
        int iD = w.d(context);
        int i = w.i(context);
        long j = w.j(context);
        Bundle bundle = new Bundle();
        bundle.putInt("code", iD);
        bundle.putInt(MTCoreConstants.Login.KEY_SEED_ID, i);
        bundle.putLong(MTCoreConstants.Login.KEY_SERVER_TIME, j);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_LOGIN_INTO, bundle);
    }

    public void b(Context context, Bundle bundle) {
        int i = bundle.getInt("code");
        int i2 = bundle.getInt(MTCoreConstants.Login.KEY_SEED_ID);
        long j = bundle.getLong(MTCoreConstants.Login.KEY_SERVER_TIME);
        MTCoreGlobal.setLoginCode(i);
        MTCoreGlobal.setSeedId(i2);
        MTCoreGlobal.setServerTime(j);
    }

    public void a(Context context, Bundle bundle) {
        try {
            MTProtocol mTProtocol = (MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL);
            mTProtocol.getRid();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(mTProtocol.getBody());
            long j = byteBufferWrap.getLong();
            byte[] bArr = new byte[byteBufferWrap.getShort()];
            byteBufferWrap.get(bArr);
            String str = new String(bArr, MTCommonConstants.UTF_8);
            Outputer outputer = new Outputer();
            outputer.writeU16(0);
            outputer.writeU64(j);
            outputer.writeByteArrayIncludeLength("".getBytes());
            MTProtocol body = new MTProtocol().setRid(j).setCommand(25).setVersion(1).setBody(outputer.toByteArray());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, body);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.UPLOAD, bundle2);
            JSONObject jSONObject = new JSONObject(str);
            MTCommonLog.d("MTCoreBusiness", "onCtrl " + MTCommonLog.toLogString(jSONObject));
            int iOptInt = jSONObject.optInt("cmd");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("content");
            Bundle bundle3 = new Bundle();
            bundle3.putString(MTCoreConstants.Protocol.KEY_PROTOCOL, jSONObjectOptJSONObject.toString());
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, iOptInt, bundle3);
        } catch (Throwable th) {
            MTCommonLog.w("MTCoreBusiness", "onCtrl failed " + th.getMessage());
        }
    }
}
