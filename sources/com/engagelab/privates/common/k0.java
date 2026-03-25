package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.core.api.MTProtocol;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.MTPush;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.engagelab.privates.push.api.TagMessage;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k0 extends h0 {
    public static volatile k0 c;
    public final ConcurrentHashMap<Integer, String[]> b = new ConcurrentHashMap<>();

    public final int a(int i) {
        switch (i) {
            case MTPushConstants.RemoteWhat.TAG_QUERY_ALL /* 3984 */:
                return MTPushConstants.MainWhat.TAG_QUERY_ALL;
            case MTPushConstants.RemoteWhat.TAG_DELETE_ALL /* 3985 */:
                return MTPushConstants.MainWhat.TAG_DELETE_ALL;
            case MTPushConstants.RemoteWhat.TAG_QUERY /* 3986 */:
                return MTPushConstants.MainWhat.TAG_QUERY;
            case MTPushConstants.RemoteWhat.TAG_UPDATE /* 3987 */:
                return MTPushConstants.MainWhat.TAG_UPDATE;
            case MTPushConstants.RemoteWhat.TAG_DELETE /* 3988 */:
                return MTPushConstants.MainWhat.TAG_DELETE;
            case MTPushConstants.RemoteWhat.TAG_ADD /* 3989 */:
                return MTPushConstants.MainWhat.TAG_ADD;
            default:
                return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(Context context, int i, Bundle bundle) {
        TagMessage tagMessage;
        MTCommonReceiver commonReceiver;
        try {
            bundle.setClassLoader(TagMessage.class.getClassLoader());
            tagMessage = (TagMessage) bundle.getParcelable("tag");
        } catch (Throwable th) {
            MTCommonLog.w("MTTagBusiness", "processMainMessage failed " + th.getMessage());
        }
        if (tagMessage == null || (commonReceiver = MTGlobal.getCommonReceiver(context)) == null) {
            return;
        }
        switch (i) {
            case MTPushConstants.MainWhat.TAG_ADD /* 3011 */:
            case MTPushConstants.MainWhat.TAG_DELETE /* 3012 */:
            case MTPushConstants.MainWhat.TAG_UPDATE /* 3013 */:
            case MTPushConstants.MainWhat.TAG_QUERY /* 3014 */:
            case MTPushConstants.MainWhat.TAG_DELETE_ALL /* 3015 */:
            case MTPushConstants.MainWhat.TAG_QUERY_ALL /* 3016 */:
                commonReceiver.onTagMessage(context, tagMessage);
                return;
            default:
                return;
        }
        MTCommonLog.w("MTTagBusiness", "processMainMessage failed " + th.getMessage());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String b(int i) {
        switch (i) {
            case MTPushConstants.RemoteWhat.TAG_QUERY_ALL /* 3984 */:
                return "get";
            case MTPushConstants.RemoteWhat.TAG_DELETE_ALL /* 3985 */:
                return "clean";
            case MTPushConstants.RemoteWhat.TAG_QUERY /* 3986 */:
                return "valid";
            case MTPushConstants.RemoteWhat.TAG_UPDATE /* 3987 */:
                return "set";
            case MTPushConstants.RemoteWhat.TAG_DELETE /* 3988 */:
                return "del";
            case MTPushConstants.RemoteWhat.TAG_ADD /* 3989 */:
                return "add";
            default:
                return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static k0 b() {
        if (c == null) {
            synchronized (k0.class) {
                c = new k0();
            }
        }
        return c;
    }

    public void b(Context context, int i, Bundle bundle) {
        try {
            int i2 = bundle.getInt(MTPushConstants.Operation.KEY_SEQUENCE);
            String strB = b(i);
            int iA = a(i);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, IEncryptorType.DEFAULT_ENCRYPTOR);
            jSONObject.put("op", strB);
            switch (i) {
                case MTPushConstants.RemoteWhat.TAG_QUERY_ALL /* 3984 */:
                    jSONObject.put("curr", 1);
                    break;
                case MTPushConstants.RemoteWhat.TAG_QUERY /* 3986 */:
                    String string = bundle.getString("tag");
                    int iA2 = a(string);
                    if (iA2 != 0) {
                        TagMessage queryTag = new TagMessage().setSequence(i2).setCode(iA2).setQueryTag(string);
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("tag", queryTag);
                        MTCommonPrivatesApi.sendMessageToMainProcess(context, iA, bundle2);
                        return;
                    }
                    this.b.put(Integer.valueOf(i2), new String[]{string});
                    jSONObject.put("tags", string);
                    break;
                    break;
                case MTPushConstants.RemoteWhat.TAG_UPDATE /* 3987 */:
                case MTPushConstants.RemoteWhat.TAG_DELETE /* 3988 */:
                case MTPushConstants.RemoteWhat.TAG_ADD /* 3989 */:
                    String[] stringArray = bundle.getStringArray("tag");
                    int iA3 = a(stringArray);
                    if (iA3 != 0) {
                        TagMessage tags = new TagMessage().setSequence(i2).setCode(iA3).setTags(stringArray);
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("tag", tags);
                        MTCommonPrivatesApi.sendMessageToMainProcess(context, iA, bundle3);
                        return;
                    }
                    this.b.put(Integer.valueOf(i2), stringArray);
                    jSONObject.put("tags", b(stringArray));
                    break;
                    break;
            }
            MTCommonLog.d("MTTagBusiness", "sendAliasOperation sequence:" + i2 + ", content:" + MTCommonLog.toLogString(jSONObject));
            byte[] bArrB = n0.b(jSONObject.toString());
            if (bArrB == null) {
                return;
            }
            MTProtocol threadName = new MTProtocol().setRid(i2).setCommand(28).setVersion(1).setBody(bArrB).setThreadName(MTPush.f352a);
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, threadName);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.UPLOAD, bundle4);
        } catch (Throwable th) {
            MTCommonLog.w("MTTagBusiness", "sendTagOperation failed " + th.getMessage());
        }
    }

    public void a(Context context, Bundle bundle) {
        try {
            MTProtocol mTProtocol = (MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL);
            if (mTProtocol == null) {
                return;
            }
            int rid = (int) mTProtocol.getRid();
            String[] strArr = this.b.get(Integer.valueOf(rid));
            this.b.remove(Integer.valueOf(rid));
            TagMessage tags = new TagMessage().setSequence(rid).setCode(MTPushPrivatesApi.Code.TIMEOUT).setTags(strArr);
            MTCommonLog.d("MTTagBusiness", "onAliasOperationFailed sequence:" + rid + ", tagMessage:" + tags.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("tag", tags);
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.TAG_ADD, bundle2);
        } catch (Throwable th) {
            MTCommonLog.w("MTTagBusiness", "onAliasOperationFailed failed " + th.getMessage());
        }
    }

    public final int a(String[] strArr) {
        int iA = a();
        if (iA != 0) {
            return iA;
        }
        if (strArr.length > 1000) {
            return MTPushPrivatesApi.Code.TOO_MANY_TAGS;
        }
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            if (TextUtils.isEmpty(str)) {
                return MTPushPrivatesApi.Code.INVALID_TAGS;
            }
            if (!Pattern.compile("^[一-龥0-9a-zA-Z_!@#$&*+=.|]+$").matcher(str).matches()) {
                return MTPushPrivatesApi.Code.INVALID_TAGS;
            }
            try {
                int length2 = str.getBytes(MTCommonConstants.UTF_8).length;
                if (length2 > 40) {
                    return MTPushPrivatesApi.Code.TOO_LONG_TAG;
                }
                i += length2;
            } catch (Throwable th) {
                MTCommonLog.w("MTTagBusiness", "getBytes failed " + th.getMessage());
            }
        }
        if (i > 5000) {
            return MTPushPrivatesApi.Code.TOO_LONG_TAGS;
        }
        return 0;
    }

    public final int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return MTPushPrivatesApi.Code.INVALID_TAGS;
        }
        if (!Pattern.compile("^[一-龥0-9a-zA-Z_!@#$&*+=.|]+$").matcher(str).matches()) {
            return MTPushPrivatesApi.Code.INVALID_TAGS;
        }
        try {
            if (str.getBytes(MTCommonConstants.UTF_8).length > 40) {
                return MTPushPrivatesApi.Code.TOO_LONG_TAG;
            }
            return 0;
        } catch (Throwable th) {
            MTCommonLog.w("MTTagBusiness", "getBytes failed " + th.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Context context, Bundle bundle) {
        byte b;
        try {
            MTProtocol mTProtocol = (MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL);
            if (mTProtocol == null) {
                return;
            }
            int rid = (int) mTProtocol.getRid();
            JSONObject jSONObject = new JSONObject(StringUtil.getTlv2(ByteBuffer.wrap(mTProtocol.getBody())));
            MTCommonLog.d("MTTagBusiness", "onTagOperationSuccess sequence:" + rid + ", content:" + MTCommonLog.toLogString(jSONObject));
            int iOptInt = jSONObject.optInt("code");
            TagMessage code = new TagMessage().setSequence(rid).setCode(iOptInt);
            String strOptString = jSONObject.optString("op");
            int iB = b(strOptString);
            switch (strOptString.hashCode()) {
                case 96417:
                    b = !strOptString.equals("add") ? (byte) -1 : (byte) 0;
                    break;
                case 99339:
                    if (strOptString.equals("del")) {
                        b = 1;
                        break;
                    }
                    break;
                case 102230:
                    if (strOptString.equals("get")) {
                        b = 5;
                        break;
                    }
                    break;
                case 113762:
                    if (strOptString.equals("set")) {
                        b = 2;
                        break;
                    }
                    break;
                case 94746185:
                    if (strOptString.equals("clean")) {
                        b = 4;
                        break;
                    }
                    break;
                case 111972348:
                    if (strOptString.equals("valid")) {
                        b = 3;
                        break;
                    }
                    break;
                default:
                    break;
            }
            if (b == 0 || b == 1 || b == 2) {
                String[] strArr = this.b.get(Integer.valueOf(rid));
                this.b.remove(Integer.valueOf(rid));
                code.setTags(strArr);
            } else if (b == 3) {
                String str = this.b.get(Integer.valueOf(rid))[0];
                this.b.remove(Integer.valueOf(rid));
                code.setQueryTag(str).setQueryTagValid(jSONObject.optBoolean("validated"));
            } else if (b == 5) {
                code = a(context, iOptInt, rid, jSONObject.optInt("curr"), jSONObject.optInt("total"), a(jSONObject.optJSONArray("tags")));
            }
            if (code == null) {
                return;
            }
            MTCommonLog.d("MTTagBusiness", "onTagOperationSuccess tagMessage:" + code.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("tag", code);
            MTCommonPrivatesApi.sendMessageToMainProcess(context, iB, bundle2);
        } catch (Throwable th) {
            MTCommonLog.w("MTTagBusiness", "onTagOperationSuccess failed " + th.getMessage());
        }
    }

    public final String[] a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    public final TagMessage a(Context context, int i, int i2, int i3, int i4, String[] strArr) {
        if (i4 != 0 && i3 != 0) {
            try {
                if (this.b.containsKey(Integer.valueOf(i2))) {
                    String[] strArr2 = this.b.get(Integer.valueOf(i2));
                    String[] strArr3 = (String[]) Arrays.copyOf(strArr, strArr.length + strArr2.length);
                    System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
                    strArr = strArr3;
                }
                if (i3 < i4) {
                    this.b.put(Integer.valueOf(i2), strArr);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, IEncryptorType.DEFAULT_ENCRYPTOR);
                    jSONObject.put("op", "get");
                    jSONObject.put("curr", i3 + 1);
                    String string = jSONObject.toString();
                    MTCommonLog.d("MTTagBusiness", "sendTagOperation sequence:" + i2 + ", content:" + MTCommonLog.toLogString(jSONObject));
                    MTProtocol threadName = new MTProtocol().setRid((long) i2).setCommand(28).setVersion(1).setBody(n0.b(string)).setThreadName(MTPush.f352a);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, threadName);
                    MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.UPLOAD, bundle);
                    return null;
                }
                this.b.remove(Integer.valueOf(i2));
                return new TagMessage().setSequence(i2).setCode(i).setTags(strArr);
            } catch (Throwable th) {
                MTCommonLog.w("MTTagBusiness", "onTagQueryAll failed " + th.getMessage());
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(String str) {
        byte b;
        str.hashCode();
        switch (str.hashCode()) {
            case 96417:
                b = !str.equals("add") ? (byte) -1 : (byte) 0;
                break;
            case 99339:
                if (str.equals("del")) {
                    b = 1;
                    break;
                }
                break;
            case 102230:
                if (str.equals("get")) {
                    b = 2;
                    break;
                }
                break;
            case 113762:
                if (str.equals("set")) {
                    b = 3;
                    break;
                }
                break;
            case 94746185:
                if (str.equals("clean")) {
                    b = 4;
                    break;
                }
                break;
            case 111972348:
                if (str.equals("valid")) {
                    b = 5;
                    break;
                }
                break;
        }
        if (b == 0) {
            return MTPushConstants.MainWhat.TAG_ADD;
        }
        if (b == 1) {
            return MTPushConstants.MainWhat.TAG_DELETE;
        }
        if (b == 2) {
            return MTPushConstants.MainWhat.TAG_QUERY_ALL;
        }
        if (b == 3) {
            return MTPushConstants.MainWhat.TAG_UPDATE;
        }
        if (b == 4) {
            return MTPushConstants.MainWhat.TAG_DELETE_ALL;
        }
        if (b != 5) {
            return 0;
        }
        return MTPushConstants.MainWhat.TAG_QUERY;
    }

    public final JSONArray b(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }
}
