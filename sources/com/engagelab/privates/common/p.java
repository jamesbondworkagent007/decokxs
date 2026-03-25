package com.engagelab.privates.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.AESUtil;
import com.engagelab.privates.common.utils.SM4Util;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.core.global.MTCoreGlobal;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class p {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Context context) {
        try {
            List<String> httpAddress = MTCoreGlobal.getHttpAddress(context);
            if (httpAddress.isEmpty()) {
                MTCommonLog.w("CrtClient", "there are no report url");
                return null;
            }
            String md5AesKey = AESUtil.getMd5AesKey(AESUtil.generateSeed());
            String iv = AESUtil.getIv(new String(new byte[]{Ascii.VT, Ascii.CR, Ascii.DC2, 80, 82, 81, 82, 86, 82, 87, 82, 84, 3, 50, 9, 67}, Charset.forName(C.UTF8_NAME)), 'b');
            String appKey = MTGlobal.getAppKey(context);
            String str = appKey + ":" + md5AesKey;
            MTCommonLog.d("CrtClient", "atn:" + str);
            String str2 = "Basic " + Base64.encodeToString(SM4Util.encryptBytes(StringUtil.stringToUtf8Bytes(str), StringUtil.get32MD5String(appKey), iv), 10);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 3; i++) {
                arrayList.addAll(httpAddress);
            }
            String str3 = "/get_cert?ver=-1&k=" + appKey;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = y.a(context, ((String) it.next()) + str3, str2);
                if (bArrA != null) {
                    JSONObject jSONObject = new JSONObject(new String(bArrA, MTCommonConstants.UTF_8));
                    if (jSONObject.has("cert")) {
                        jSONObject.put("cert", new String(SM4Util.decryptBytes(Base64.decode(jSONObject.optString("cert"), 10), md5AesKey, iv), MTCommonConstants.UTF_8));
                    }
                    return jSONObject.toString();
                }
            }
            MTCommonLog.w("CrtClient", "get crt failed");
            return null;
        } catch (Exception e) {
            MTCommonLog.w("CrtClient", "get crt failed un :" + e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(Context context) {
        JSONObject jSONObject;
        String strA = a(context);
        if (TextUtils.isEmpty(strA)) {
            MTCommonLog.w("CrtClient", "get crt failed");
            return false;
        }
        try {
            MTCommonLog.d("CrtClient", "get crt body : " + strA);
            jSONObject = new JSONObject(strA);
        } catch (Exception e) {
            MTCommonLog.e("CrtClient", "get crt failed : " + e);
        }
        if (jSONObject.optInt("code", -1) == 0) {
            w.a(context, jSONObject.getString("cert"));
            MTCommonLog.d("CrtClient", "get crt Success");
            return true;
        }
        MTCommonLog.e("CrtClient", "get crt failed jsonObject : " + jSONObject);
        return false;
    }
}
