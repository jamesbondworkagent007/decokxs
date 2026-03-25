package o;

import java.net.HttpURLConnection;
import java.util.Map;
import o.C7864arq;

/* JADX INFO: renamed from: o.aje, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7428aje {

    /* JADX INFO: renamed from: o.aje$ActionBar */
    public interface ActionBar {
        void copydefault(java.io.InputStream inputStream, int i) throws java.lang.Exception;
    }

    /* JADX INFO: renamed from: o.aje$StateListAnimator */
    public interface StateListAnimator {
        void OLrzqt(float f, long j);
    }

    public static void EZpvd(java.lang.String str, java.util.Map map, C7430ajg c7430ajg) throws java.lang.Exception {
        copydefault("POST", str, map, c7430ajg, null);
    }

    public static void OLrzqt(java.lang.String str, java.util.Map map, C7430ajg c7430ajg) throws java.lang.Exception {
        copydefault("GET", str, map, c7430ajg, null);
    }

    public static void AEQbTJ(java.lang.String str, final java.lang.String str2, java.util.Map map, final StateListAnimator stateListAnimator, final C7430ajg c7430ajg) throws java.lang.Exception {
        copydefault("GET", str, map, c7430ajg, new ActionBar() { // from class: o.aje.5
            @Override // o.C7428aje.ActionBar
            public void copydefault(java.io.InputStream inputStream, final int i) throws java.lang.Exception {
                C7864arq.EZpvd(inputStream, str2, i, new C7864arq.StateListAnimator() { // from class: o.aje.5.3
                    @Override // o.C7864arq.StateListAnimator
                    public void EZpvd(float f) {
                        stateListAnimator.OLrzqt(f, i);
                    }
                });
                c7430ajg.EZpvd(C7872ary.KWHzl(str2));
            }
        });
    }

    public static void copydefault(java.lang.String str, java.lang.String str2, java.util.Map map, C7430ajg c7430ajg, ActionBar actionBar) throws java.lang.Exception {
        HttpURLConnection httpURLConnection;
        boolean zEquals;
        try {
            zEquals = "POST".equals(str);
            if (!zEquals && "GET".equals(str)) {
                str2 = KWHzl(str2, map);
            }
            httpURLConnection = (HttpURLConnection) new java.net.URL(str2).openConnection();
        } catch (java.lang.Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setConnectTimeout(30000);
            boolean z = true;
            httpURLConnection.setDoInput(true);
            if (zEquals) {
                httpURLConnection.setDoOutput(true);
            }
            httpURLConnection.connect();
            if (zEquals) {
                KWHzl(map, httpURLConnection);
            }
            int responseCode = httpURLConnection.getResponseCode();
            c7430ajg.KWHzl(responseCode);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream()));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    sb.append(line);
                }
            }
            c7430ajg.OLrzqt(sb.toString());
            c7430ajg.KWHzl(sb.toString());
            if (responseCode == 200) {
                z = false;
            }
            c7430ajg.OLrzqt(z);
            if (actionBar != null && responseCode == 200) {
                actionBar.copydefault(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            }
            httpURLConnection.disconnect();
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static void KWHzl(java.util.Map map, HttpURLConnection httpURLConnection) throws java.io.IOException {
        java.lang.String strAEQbTJ = AEQbTJ(map);
        java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(strAEQbTJ.getBytes());
        outputStream.flush();
        outputStream.close();
    }

    public static java.lang.String AEQbTJ(java.util.Map map) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (key != null && value != null) {
                sb.append(key);
                sb.append('=');
                sb.append(value);
                sb.append('&');
            }
        }
        return sb.toString();
    }

    public static java.lang.String KWHzl(java.lang.String str, java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return str;
        }
        return str + "?" + AEQbTJ(map);
    }
}
