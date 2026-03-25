package o;

import com.google.common.net.HttpHeaders;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5266Lc implements InterfaceC5265Lb {
    public final C5244Kg copydefault;

    public C5266Lc(@NotNull C5244Kg c5244Kg) {
        Intrinsics.checkNotNullParameter(c5244Kg, "");
        this.copydefault = c5244Kg;
    }

    public final HttpURLConnection EZpvd(java.lang.String str) throws java.io.IOException {
        try {
            URLConnection uRLConnectionOpenConnection = new java.net.URL(str).openConnection();
            Intrinsics.copydefault(uRLConnectionOpenConnection, "");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", EIP1271Verifier.mediaTypeString);
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(201000);
            return httpURLConnection;
        } catch (MalformedURLException e) {
            throw new java.io.IOException("Attempted to use malformed url: " + str, e);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    @Override // o.InterfaceC5265Lb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC5268Le upload(@NotNull java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.io.InputStream inputStreamOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        HttpURLConnection httpURLConnectionEZpvd = EZpvd(this.copydefault.zuBGHE());
        java.lang.String strAEQbTJ = new KZ(OLrzqt(), str, this.copydefault.fIwbmz(), str2, 0L, 16, null).AEQbTJ();
        java.nio.charset.Charset charset = Charsets.UTF_8;
        byte[] bytes = strAEQbTJ.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        httpURLConnectionEZpvd.getOutputStream().write(bytes, 0, bytes.length);
        httpURLConnectionEZpvd.getOutputStream().close();
        int responseCode = httpURLConnectionEZpvd.getResponseCode();
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStreamOLrzqt = OLrzqt(httpURLConnectionEZpvd);
            } catch (java.io.IOException unused) {
                inputStreamOLrzqt = null;
            } catch (java.lang.Throwable th) {
                th = th;
                if (inputStream != null) {
                }
                httpURLConnectionEZpvd.disconnect();
                throw th;
            }
            try {
                java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStreamOLrzqt, charset);
                java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
                try {
                    java.lang.String strAEQbTJ2 = yFK.AEQbTJ(bufferedReader);
                    yFA.copydefault(bufferedReader, null);
                    InterfaceC5268Le interfaceC5268LeKWHzl = InterfaceC5268Le.Companion.KWHzl(responseCode, strAEQbTJ2);
                    if (inputStreamOLrzqt != null) {
                        inputStreamOLrzqt.close();
                    }
                    httpURLConnectionEZpvd.disconnect();
                    return interfaceC5268LeKWHzl;
                } finally {
                }
            } catch (java.io.IOException unused2) {
                InterfaceC5268Le interfaceC5268LeKWHzl2 = InterfaceC5268Le.Companion.KWHzl(408, null);
                if (inputStreamOLrzqt != null) {
                    inputStreamOLrzqt.close();
                }
                httpURLConnectionEZpvd.disconnect();
                return interfaceC5268LeKWHzl2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStream = null;
            if (inputStream != null) {
                inputStream.close();
            }
            httpURLConnectionEZpvd.disconnect();
            throw th;
        }
    }

    public final java.lang.String OLrzqt() {
        return this.copydefault.ORxRYg();
    }

    public final java.io.InputStream OLrzqt(HttpURLConnection httpURLConnection) {
        try {
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "");
            return inputStream;
        } catch (java.io.IOException unused) {
            java.io.InputStream errorStream = httpURLConnection.getErrorStream();
            Intrinsics.checkNotNullExpressionValue(errorStream, "");
            return errorStream;
        }
    }
}
