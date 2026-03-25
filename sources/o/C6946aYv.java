package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.biz.statistics.util.ClientTimeIssue;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: renamed from: o.aYv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C6946aYv {
    public static java.lang.String OLrzqt(java.lang.Object obj, java.util.Set<java.lang.String> set) {
        java.lang.String string;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            for (Map.Entry<java.lang.String, JsonElement> entry : C33490mxT.copydefault(obj).getAsJsonObject().entrySet()) {
                if (set == null || !set.contains(entry.getKey())) {
                    JsonElement value = entry.getValue();
                    if (value instanceof JsonPrimitive) {
                        string = value.getAsString();
                    } else {
                        string = value != null ? value.toString() : "";
                    }
                    java.lang.String strEncode = URLEncoder.encode(string, com.google.android.exoplayer2.C.UTF8_NAME);
                    sb.append(entry.getKey());
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(strEncode);
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
        }
        if (sb.length() > 0) {
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public static java.lang.String EZpvd(InterfaceC6912aYN interfaceC6912aYN) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            try {
                java.lang.String strEncode = URLEncoder.encode(interfaceC6912aYN.AEQbTJ(), com.google.android.exoplayer2.C.UTF8_NAME);
                sb.append("_act");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(strEncode);
                InterfaceC6911aYM interfaceC6911aYMEZpvd = interfaceC6912aYN.EZpvd();
                java.lang.String strKWHzl = interfaceC6911aYMEZpvd != null ? KWHzl(interfaceC6911aYMEZpvd) : "";
                if (strKWHzl.length() > 0) {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                    sb.append(strKWHzl);
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("tag", e);
            }
            sb.append("\r\n");
            return sb.toString();
        } catch (java.lang.Throwable th) {
            sb.append("\r\n");
            throw th;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE]}, finally: {[INVOKE, INVOKE, ARITH, INVOKE, IF] complete} */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String KWHzl(InterfaceC6911aYM interfaceC6911aYM) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            try {
                for (Map.Entry<java.lang.String, java.lang.String> entry : interfaceC6911aYM.entrySet()) {
                    java.lang.String strEncode = URLEncoder.encode(entry.getValue() != null ? entry.getValue() : "", com.google.android.exoplayer2.C.UTF8_NAME);
                    if (entry.getKey().equals("client_ts")) {
                        ClientTimeIssue.AEQbTJ.EZpvd("", strEncode, "formatEventParams");
                    }
                    sb.append(entry.getKey());
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(strEncode);
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("tag", e);
                if (sb.length() > 1) {
                }
            }
            if (sb.length() > 1) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (java.lang.Throwable th) {
            if (sb.length() > 1) {
                sb.deleteCharAt(sb.length() - 1);
            }
            throw th;
        }
    }
}
