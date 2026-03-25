package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.core.api.MTProtocol;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.MTPush;
import com.engagelab.privates.push.api.AliasMessage;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i0 extends h0 {
    public static volatile i0 c;
    public ConcurrentHashMap<Integer, String> b = new ConcurrentHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(Context context, int i, Bundle bundle) {
        AliasMessage aliasMessage;
        MTCommonReceiver commonReceiver;
        try {
            bundle.setClassLoader(AliasMessage.class.getClassLoader());
            aliasMessage = (AliasMessage) bundle.getParcelable(MTPushConstants.Operation.KEY_ALIAS);
        } catch (Throwable th) {
            MTCommonLog.w("MTAliasBusiness", "processMainMessage failed " + th.getMessage());
        }
        if (aliasMessage == null || (commonReceiver = MTGlobal.getCommonReceiver(context)) == null) {
            return;
        }
        switch (i) {
            case MTPushConstants.MainWhat.ALIAS_SET /* 3017 */:
            case MTPushConstants.MainWhat.ALIAS_GET /* 3018 */:
            case MTPushConstants.MainWhat.ALIAS_CLEAR /* 3019 */:
                commonReceiver.onAliasMessage(context, aliasMessage);
                return;
            default:
                return;
        }
        MTCommonLog.w("MTAliasBusiness", "processMainMessage failed " + th.getMessage());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static i0 b() {
        if (c == null) {
            synchronized (i0.class) {
                c = new i0();
            }
        }
        return c;
    }

    public void b(Context context, int i, Bundle bundle) {
        String str;
        try {
            int i2 = bundle.getInt(MTPushConstants.Operation.KEY_SEQUENCE);
            String string = bundle.getString(MTPushConstants.Operation.KEY_ALIAS);
            switch (i) {
                case MTPushConstants.RemoteWhat.ALIAS_CLEAR /* 3981 */:
                    str = "del";
                    break;
                case MTPushConstants.RemoteWhat.ALIAS_GET /* 3982 */:
                    str = "get";
                    break;
                case MTPushConstants.RemoteWhat.ALIAS_SET /* 3983 */:
                    int iA = a(string);
                    if (iA != 0) {
                        AliasMessage alias = new AliasMessage().setSequence(i2).setCode(iA).setAlias(string);
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable(MTPushConstants.Operation.KEY_ALIAS, alias);
                        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.ALIAS_SET, bundle2);
                        return;
                    }
                    str = "set";
                    break;
                default:
                    str = "";
                    break;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, IEncryptorType.DEFAULT_ENCRYPTOR);
            jSONObject.put("op", str);
            if (!TextUtils.isEmpty(string)) {
                this.b.put(Integer.valueOf(i2), string);
                jSONObject.put(MTPushConstants.Operation.KEY_ALIAS, string);
            }
            MTCommonLog.d("MTAliasBusiness", "sendAliasOperation sequence:" + i2 + ", content:" + MTCommonLog.toLogString(jSONObject));
            byte[] bArrB = n0.b(jSONObject.toString());
            if (bArrB == null) {
                return;
            }
            MTProtocol threadName = new MTProtocol().setRid(i2).setCommand(29).setVersion(1).setBody(bArrB).setThreadName(MTPush.f352a);
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, threadName);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.UPLOAD, bundle3);
        } catch (Throwable th) {
            MTCommonLog.w("MTAliasBusiness", "sendAliasOperation failed " + th.getMessage());
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
            AliasMessage alias = new AliasMessage().setSequence(rid).setCode(MTPushPrivatesApi.Code.TIMEOUT).setAlias(str);
            MTCommonLog.d("MTAliasBusiness", "onAliasOperationFailed sequence:" + rid + ", aliasMessage:" + alias.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MTPushConstants.Operation.KEY_ALIAS, alias);
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.ALIAS_SET, bundle2);
        } catch (Throwable th) {
            MTCommonLog.w("MTAliasBusiness", "onAliasOperationFailed failed " + th.getMessage());
        }
    }

    public final int a(String str) {
        int iA = a();
        if (iA != 0) {
            return iA;
        }
        if (TextUtils.isEmpty(str)) {
            return MTPushPrivatesApi.Code.INVALID_ALIAS;
        }
        if (str.getBytes().length > 40) {
            return MTPushPrivatesApi.Code.TOO_LONG_ALIAS;
        }
        if (Pattern.compile("^[一-龥0-9a-zA-Z_!@#$&*+=.|]+$").matcher(str).matches()) {
            return 0;
        }
        return MTPushPrivatesApi.Code.INVALID_ALIAS;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Context context, Bundle bundle) {
        byte b;
        String strOptString;
        try {
            MTProtocol mTProtocol = (MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL);
            if (mTProtocol == null) {
                return;
            }
            int rid = (int) mTProtocol.getRid();
            JSONObject jSONObject = new JSONObject(StringUtil.getTlv2(ByteBuffer.wrap(mTProtocol.getBody())));
            MTCommonLog.d("MTAliasBusiness", "onAliasOperationSuccess sequence:" + rid + ", content:" + MTCommonLog.toLogString(jSONObject));
            int iOptInt = jSONObject.optInt("code");
            String strOptString2 = jSONObject.optString("op");
            int iHashCode = strOptString2.hashCode();
            if (iHashCode != 99339) {
                if (iHashCode != 102230) {
                    b = (iHashCode == 113762 && strOptString2.equals("set")) ? (byte) 0 : (byte) -1;
                } else if (strOptString2.equals("get")) {
                    b = 1;
                }
            } else if (strOptString2.equals("del")) {
                b = 2;
            }
            int i = MTPushConstants.MainWhat.ALIAS_SET;
            if (b == 0) {
                strOptString = this.b.get(Integer.valueOf(rid));
                this.b.remove(Integer.valueOf(rid));
            } else if (b != 1) {
                strOptString = "";
                if (b == 2) {
                    i = MTPushConstants.MainWhat.ALIAS_CLEAR;
                }
            } else {
                strOptString = jSONObject.optString(MTPushConstants.Operation.KEY_ALIAS);
                i = MTPushConstants.MainWhat.ALIAS_GET;
            }
            AliasMessage alias = new AliasMessage().setSequence(rid).setCode(iOptInt).setAlias(strOptString);
            MTCommonLog.d("MTAliasBusiness", "onAliasOperationSuccess aliasMessage:" + alias.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MTPushConstants.Operation.KEY_ALIAS, alias);
            MTCommonPrivatesApi.sendMessageToMainProcess(context, i, bundle2);
        } catch (Throwable th) {
            MTCommonLog.w("MTAliasBusiness", "onAliasOperationSuccess failed " + th.getMessage());
        }
    }
}
