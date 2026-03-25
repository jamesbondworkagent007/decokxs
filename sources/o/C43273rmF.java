package o;

import com.okinc.okuser.data.User;
import okhttp3.Request;
import okio.ByteString;

/* JADX INFO: renamed from: o.rmF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43273rmF {
    public static java.lang.String AEQbTJ(Request request) {
        User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
        java.lang.String uid = userOLrzqt != null ? userOLrzqt.getUid() : null;
        java.lang.String strHeader = request.header("User-Agent");
        java.lang.String strHeader2 = request.header("Cache-Token-Valid");
        java.lang.String strEncodedQuery = request.url().encodedQuery();
        java.lang.String strEncodedPath = request.url().encodedPath();
        if (!android.text.TextUtils.isEmpty(strEncodedQuery)) {
            strEncodedPath = strEncodedPath + "?" + strEncodedQuery;
        }
        if (!android.text.TextUtils.isEmpty(uid) && !"0".equals(strHeader2)) {
            strEncodedPath = strEncodedPath + uid;
        }
        if (!android.text.TextUtils.isEmpty(strHeader)) {
            strEncodedPath = strEncodedPath + strHeader;
        }
        return ByteString.encodeUtf8(strEncodedPath).md5().hex();
    }
}
