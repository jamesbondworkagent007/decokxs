package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.api.MTProtocol;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.engagelab.privates.push.api.MobileNumberMessage;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class j0 extends h0 {
    public static volatile j0 c;
    public ConcurrentHashMap<Integer, String> b = new ConcurrentHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(Context context, int i, Bundle bundle) {
        MTCommonReceiver commonReceiver;
        try {
            bundle.setClassLoader(MobileNumberMessage.class.getClassLoader());
            MobileNumberMessage mobileNumberMessage = (MobileNumberMessage) bundle.getParcelable("message");
            if (mobileNumberMessage == null || (commonReceiver = MTGlobal.getCommonReceiver(context)) == null) {
                return;
            }
            commonReceiver.onMobileNumber(context, mobileNumberMessage);
        } catch (Throwable th) {
            MTCommonLog.w("MTMobileNumberBusiness", "processMainMessage failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static j0 b() {
        if (c == null) {
            synchronized (j0.class) {
                c = new j0();
            }
        }
        return c;
    }

    public void b(Context context, int i, Bundle bundle) {
        try {
            int i2 = bundle.getInt(MTPushConstants.Operation.KEY_SEQUENCE);
            String string = bundle.getString(MTPushConstants.Operation.KEY_MOBILE_NUMBER);
            int iA = a(string);
            if (iA != 0) {
                MTCommonLog.d("MTMobileNumberBusiness", "sendMobileNumberOperation failed code:" + iA + ", sequence:" + i2 + ", mobileNumber:" + string);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("message", new MobileNumberMessage().setSequence(i2).setCode(iA).setMobileNumber(string));
                MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.ON_MOBILE_NUMBER, bundle2);
                return;
            }
            this.b.put(Integer.valueOf(i2), string);
            MTCommonLog.d("MTMobileNumberBusiness", "sendMobileNumberOperation sequence:" + i2 + ", mobileNumber:" + string);
            MTProtocol body = new MTProtocol().setRid((long) i2).setCommand(26).setVersion(1).setBody(n0.a(string));
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, body);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.UPLOAD, bundle3);
        } catch (Throwable th) {
            MTCommonLog.w("MTMobileNumberBusiness", "processRemoteMessage failed " + th.getMessage());
        }
    }

    public void a(Context context, Bundle bundle) {
        try {
            MTProtocol mTProtocol = (MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL);
            if (mTProtocol == null) {
                return;
            }
            int rid = (int) mTProtocol.getRid();
            String str = this.b.get(Integer.valueOf(rid));
            this.b.remove(Integer.valueOf(rid));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            MobileNumberMessage mobileNumber = new MobileNumberMessage().setSequence(rid).setCode(MTPushPrivatesApi.Code.TIMEOUT).setMobileNumber(str);
            MTCommonLog.d("MTMobileNumberBusiness", "onMobileNumberFailed mobileNumberMessage:" + mobileNumber.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("message", mobileNumber);
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.ON_MOBILE_NUMBER, bundle2);
        } catch (Throwable th) {
            MTCommonLog.w("MTMobileNumberBusiness", "onMobileNumberFailed failed " + th.getMessage());
        }
    }

    public final int a(String str) {
        if (!Pattern.compile("^[+0-9][-0-9]{1,}$").matcher(str).matches()) {
            MTCommonLog.w("MTMobileNumberBusiness", "[" + str + "] is not mobileNumber");
            return MTPushPrivatesApi.Code.INVALID_MOBILE_NUMBER;
        }
        if (a() != 0) {
            return MTPushPrivatesApi.Code.INVOKE_TOO_SOON;
        }
        return 0;
    }

    public void b(Context context, Bundle bundle) {
        try {
            MTProtocol mTProtocol = (MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL);
            int rid = (int) mTProtocol.getRid();
            if (!this.b.containsKey(Integer.valueOf(rid))) {
                MTCommonLog.d("MTMobileNumberBusiness", "failed ");
                return;
            }
            String str = this.b.get(Integer.valueOf(rid));
            this.b.remove(Integer.valueOf(rid));
            MobileNumberMessage mobileNumber = new MobileNumberMessage().setSequence(rid).setCode(ByteBuffer.wrap(mTProtocol.getBody()).getShort()).setMobileNumber(str);
            MTCommonLog.d("MTMobileNumberBusiness", "onMobileNumberSuccess mobileNumberMessage:" + mobileNumber.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("message", mobileNumber);
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.ON_MOBILE_NUMBER, bundle2);
        } catch (Throwable th) {
            MTCommonLog.w("MTMobileNumberBusiness", "onMobileNumberSuccess failed " + th.getMessage());
        }
    }
}
