package o;

import com.immomo.mls.utils.ERROR;
import com.immomo.mls.utils.ScriptLoadException;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: o.ahU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7312ahU implements InterfaceC7296ahE {
    @Override // o.InterfaceC7296ahE
    public void KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.Nullable java.lang.String str3, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> map, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> map2, @androidx.annotation.Nullable java.lang.String str4, long j) throws ScriptLoadException {
        try {
            java.io.InputStream inputStreamKWHzl = KWHzl(str, j);
            if (C7864arq.AEQbTJ(str, ".zip")) {
                C7864arq.KWHzl(str2, inputStreamKWHzl);
            } else {
                copydefault(str2, str3, inputStreamKWHzl);
            }
        } catch (java.lang.Exception e) {
            if (e instanceof ScriptLoadException) {
                throw ((ScriptLoadException) e);
            }
            throw new ScriptLoadException(ERROR.UNKNOWN_ERROR, e);
        }
    }

    public static java.io.InputStream KWHzl(java.lang.String str, long j) throws java.lang.Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new java.net.URL(str).openConnection();
        if (j != 0) {
            int i = (int) j;
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
        }
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            return httpURLConnection.getInputStream();
        }
        throw new ScriptLoadException(responseCode, "resopnse code is not 200", new java.lang.IllegalStateException());
    }

    public static void copydefault(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable java.lang.String str2, java.io.InputStream inputStream) throws java.lang.Exception {
        java.io.File file;
        if (android.text.TextUtils.isEmpty(str2)) {
            file = new java.io.File(str);
        } else {
            file = new java.io.File(str, str2);
        }
        java.io.File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            C7864arq.EZpvd(file, inputStream);
        } finally {
            C7866ars.AEQbTJ((java.io.Closeable) inputStream);
        }
    }
}
