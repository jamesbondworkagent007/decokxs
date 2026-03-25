package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.engagelab.privates.analysis.api.Account;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.log.MTCommonLog;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile a f320a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static a a() {
        if (f320a == null) {
            synchronized (a.class) {
                f320a = new a();
            }
        }
        return f320a;
    }

    public void a(Context context) {
        try {
            String strA = i.a(context);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            h.a().a(context, new JSONObject(strA));
        } catch (Throwable th) {
            MTCommonLog.w("MTAccountBusiness", "init failed " + th.getMessage());
        }
    }

    public void a(Context context, Bundle bundle) {
        a(context, (Account) bundle.getParcelable(MTAnalysisConstants.Account.KEY_ACCOUNT));
    }

    public void a(Context context, Account account) {
        List<String> idList = account.getIdList();
        if (idList != null && !idList.isEmpty()) {
            String strA = a(context, idList);
            MTCommonLog.d("MTAccountBusiness", "onAccount accountId:" + strA);
            i.b(context, strA);
            JSONObject jSONObjectA = a(account);
            if (jSONObjectA == null) {
                return;
            }
            JSONObject jSONObjectA2 = h.a().a(context, MTAnalysisConstants.TYPE_ACCOUNT, jSONObjectA);
            h.a().a(context, jSONObjectA2);
            i.a(context, jSONObjectA2.toString());
            return;
        }
        MTCommonLog.d("MTAccountBusiness", "onAccount failed, idList is empty");
    }

    public final String a(Context context, List<String> list) {
        MTCommonLog.d("MTAccountBusiness", "user set account is:" + list.toString());
        String strE = i.e(context);
        if (TextUtils.isEmpty(strE)) {
            return a(context, list, "firstAccount");
        }
        String strA = a(context, strE, list, "firstAccount");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strH = i.h(context);
        if (TextUtils.isEmpty(strH)) {
            return a(context, list, "followAccount");
        }
        return a(context, strH, list, "followAccount");
    }

    public final String a(Context context, List<String> list, String str) {
        String string = list.toString();
        String strSubstring = string.substring(1, string.length() - 1);
        MTCommonLog.d("MTAccountBusiness", str + " new user account and save [" + strSubstring + "] to local");
        boolean zIsEmpty = TextUtils.isEmpty(list.get(0));
        str.hashCode();
        if (str.equals("firstAccount")) {
            i.e(context, strSubstring);
            i.a(context, zIsEmpty ? 1 : 0);
        } else if (str.equals("followAccount")) {
            i.f(context, strSubstring);
            i.b(context, zIsEmpty ? 1 : 0);
        }
        return a(list, !TextUtils.equals(str, "firstAccount") ? 1 : 0, zIsEmpty ? 1 : 0);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0046 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x00ba */
    public final String a(Context context, String str, List<String> list, String str2) {
        int iF;
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(", ")));
        MTCommonLog.d("MTAccountBusiness", "local " + str2 + " is:" + arrayList.toString());
        int i = 0;
        boolean z = false;
        while (i < list.size()) {
            if (arrayList.contains(list.get(i))) {
                z = true;
            }
            i++;
            z = z;
        }
        if (!z) {
            return str2.equals("firstAccount") ? "" : a(context, list, str2);
        }
        for (int i2 = 1; i2 < list.size(); i2++) {
            if (!arrayList.contains(list.get(i2)) && arrayList.size() <= 3) {
                arrayList.add(list.get(i2));
                MTCommonLog.d("MTAccountBusiness", "over list add:" + list.get(i2) + "," + arrayList.toString());
            }
        }
        int i3 = 1;
        boolean z2 = true;
        while (i3 < arrayList.size()) {
            if (!TextUtils.isEmpty(list.get(0)) && list.get(0).equals(arrayList.get(i3))) {
                z2 = false;
            }
            i3++;
            z2 = z2;
        }
        if (z2 && TextUtils.isEmpty(arrayList.get(0)) && !TextUtils.isEmpty(list.get(0))) {
            arrayList.set(0, list.get(0));
        }
        String string = arrayList.toString();
        String strSubstring = string.substring(1, string.length() - 1);
        str2.hashCode();
        if (str2.equals("firstAccount")) {
            i.e(context, strSubstring);
            iF = i.f(context);
        } else if (str2.equals("followAccount")) {
            i.f(context, strSubstring);
            iF = i.i(context);
        } else {
            iF = 0;
        }
        int i4 = iF != -1 ? iF : 0;
        MTCommonLog.d("MTAccountBusiness", "is same with " + str2 + " and save [" + strSubstring + "] to local");
        return a(arrayList, !TextUtils.equals(str2, "firstAccount") ? 1 : 0, i4);
    }

    public final String a(List<String> list, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a0", list.get(0));
            if (list.size() > 1 && !TextUtils.isEmpty(list.get(1))) {
                jSONObject.put("a1", list.get(1));
            }
            if (list.size() > 2 && !TextUtils.isEmpty(list.get(2))) {
                jSONObject.put("a2", list.get(2));
            }
            if (list.size() > 3 && !TextUtils.isEmpty(list.get(3))) {
                jSONObject.put("a3", list.get(3));
            }
            jSONObject.put(OtcExtraKeys.FLAG, i);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, i2);
            return jSONObject.toString();
        } catch (Exception e) {
            MTCommonLog.w("MTAccountBusiness", "packageAccount e:" + e.getMessage());
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject a(Account account) {
        byte b;
        try {
            JSONObject jSONObject = new JSONObject();
            Map<String, Object> internalAttrMap = account.getInternalAttrMap();
            JSONObject jSONObject2 = new JSONObject();
            if (internalAttrMap != null && internalAttrMap.size() > 0) {
                Iterator<Map.Entry<String, Object>> it = internalAttrMap.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    switch (key.hashCode()) {
                        case 1186242:
                            b = key.equals(MTAnalysisConstants.ACCOUNT_INTERNAL_SEX) ? (byte) 2 : (byte) -1;
                            break;
                        case 36620463:
                            if (key.equals(MTAnalysisConstants.ACCOUNT_INTERNAL_NAME)) {
                                b = 1;
                                break;
                            }
                            break;
                        case 912091785:
                            if (key.equals(MTAnalysisConstants.ACCOUNT_INTERNAL_TIME)) {
                                b = 0;
                                break;
                            }
                            break;
                        case 1127268856:
                            if (key.equals(MTAnalysisConstants.ACCOUNT_INTERNAL_MAIL)) {
                                b = 4;
                                break;
                            }
                            break;
                        case 1137292234:
                            if (key.equals(MTAnalysisConstants.ACCOUNT_INTERNAL_PHONE)) {
                                b = 3;
                                break;
                            }
                            break;
                    }
                    if (b == 0) {
                        jSONObject2.put(MTAnalysisConstants.ACCOUNT_INTERNAL_TIME, account.getTime());
                    } else if (b == 1) {
                        jSONObject2.put(MTAnalysisConstants.ACCOUNT_INTERNAL_NAME, account.getName());
                    } else if (b == 2) {
                        jSONObject2.put(MTAnalysisConstants.ACCOUNT_INTERNAL_SEX, account.getSex());
                    } else if (b == 3) {
                        jSONObject2.put(MTAnalysisConstants.ACCOUNT_INTERNAL_PHONE, account.getPhone());
                    } else if (b == 4) {
                        jSONObject2.put(MTAnalysisConstants.ACCOUNT_INTERNAL_MAIL, account.getEmail());
                    }
                }
            }
            Map<String, Object> extraAttrMap = account.getExtraAttrMap();
            if (extraAttrMap != null && extraAttrMap.size() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Object> entry : extraAttrMap.entrySet()) {
                    jSONObject3.put(entry.getKey(), entry.getValue());
                }
                if (jSONObject3.length() > 0) {
                    jSONObject2.put(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, jSONObject3);
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put(MTAnalysisConstants.ACCOUNT_SET_ATTR, jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            MTCommonLog.d("MTAccountBusiness", "packageJson e:" + e.getMessage());
            return null;
        }
    }
}
