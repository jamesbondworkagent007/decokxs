package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.huawei.hms.framework.common.ContainerUtils;
import com.immomo.mls.InitData;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.arO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7836arO {
    public static java.lang.String copydefault(@androidx.annotation.NonNull java.lang.String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf >= 0) {
            str = str.substring(iLastIndexOf + 1);
        }
        int iIndexOf = str.indexOf(63);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        java.lang.String host = uri.getHost();
        java.lang.String path = uri.getPath();
        int iLastIndexOf = path.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            path = path.substring(0, iLastIndexOf);
        }
        if (host == null) {
            return !path.startsWith("/") ? path : path.substring(1);
        }
        if (!path.startsWith("/")) {
            return host + "/" + path;
        }
        return host + path;
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        int iLastIndexOf = str.lastIndexOf(java.io.File.separatorChar);
        if (iLastIndexOf < 0) {
            return null;
        }
        if (iLastIndexOf == 0) {
            return java.io.File.separator;
        }
        return str.substring(0, iLastIndexOf);
    }

    public static java.lang.String KWHzl(InitData initData) {
        java.util.HashMap map = initData.KWHzl;
        if (map == null || map.isEmpty()) {
            java.lang.String str = initData.EZpvd;
            return str == null ? "" : str;
        }
        java.lang.String str2 = (java.lang.String) initData.KWHzl.get("appid");
        java.lang.String str3 = (java.lang.String) initData.KWHzl.get("pageurl");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str4 = str3 != null ? str3 : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str2);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(str4);
        java.lang.String str5 = (java.lang.String) initData.KWHzl.get("to");
        if (str5 != null && !str5.isEmpty()) {
            sb.append(JsonPointer.SEPARATOR);
            sb.append(str5);
        }
        java.util.HashMap map2 = initData.KWHzl;
        if (map2 == null || map2.isEmpty()) {
            return sb.toString();
        }
        boolean z = true;
        for (Map.Entry entry : map2.entrySet()) {
            if (z) {
                sb.append('?');
                z = false;
            } else {
                sb.append('&');
            }
            sb.append(entry.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(entry.getValue());
        }
        return sb.toString();
    }
}
