package o;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.HttpException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Map;
import o.NU;

/* JADX INFO: loaded from: classes2.dex */
public class NW implements NU<java.io.InputStream> {
    public static final Application copydefault = new Activity();
    public java.io.InputStream AEQbTJ;
    public HttpURLConnection AYXKKw;
    public final C5378Pk EZpvd;
    public volatile boolean KWHzl;
    public final Application OLrzqt;
    public final int djBIcL;

    public interface Application {
        HttpURLConnection AEQbTJ(java.net.URL url) throws java.io.IOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.NU
    public java.lang.Class<java.io.InputStream> KWHzl() {
        return java.io.InputStream.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.NU
    public void copydefault() {
        this.KWHzl = true;
    }

    public NW(C5378Pk c5378Pk, int i) {
        this(c5378Pk, i, copydefault);
    }

    public NW(C5378Pk c5378Pk, int i, Application application) {
        this.EZpvd = c5378Pk;
        this.djBIcL = i;
        this.OLrzqt = application;
    }

    @Override // o.NU
    public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super java.io.InputStream> taskDescription) {
        java.lang.StringBuilder sb;
        long jCopydefault = SF.copydefault();
        try {
            try {
                taskDescription.KWHzl(OLrzqt(this.EZpvd.valueOf(), 0, null, this.EZpvd.copydefault()));
            } catch (java.io.IOException e) {
                taskDescription.copydefault(e);
                if (!android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new java.lang.StringBuilder();
                }
            }
            if (android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new java.lang.StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(SF.OLrzqt(jCopydefault));
            }
        } catch (java.lang.Throwable th) {
            if (android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                SF.OLrzqt(jCopydefault);
            }
            throw th;
        }
    }

    public final java.io.InputStream OLrzqt(java.net.URL url, int i, java.net.URL url2, java.util.Map<java.lang.String, java.lang.String> map) throws HttpException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionEZpvd = EZpvd(url, map);
        this.AYXKKw = httpURLConnectionEZpvd;
        try {
            httpURLConnectionEZpvd.connect();
            this.AEQbTJ = this.AYXKKw.getInputStream();
            if (this.KWHzl) {
                return null;
            }
            int iEZpvd = EZpvd(this.AYXKKw);
            if (AEQbTJ(iEZpvd)) {
                return KWHzl(this.AYXKKw);
            }
            if (!KWHzl(iEZpvd)) {
                if (iEZpvd == -1) {
                    throw new HttpException(iEZpvd);
                }
                try {
                    throw new HttpException(this.AYXKKw.getResponseMessage(), iEZpvd);
                } catch (java.io.IOException e) {
                    throw new HttpException("Failed to get a response message", iEZpvd, e);
                }
            }
            java.lang.String headerField = this.AYXKKw.getHeaderField("Location");
            if (android.text.TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iEZpvd);
            }
            try {
                java.net.URL url3 = new java.net.URL(url, headerField);
                AEQbTJ();
                return OLrzqt(url3, i + 1, url, map);
            } catch (MalformedURLException e2) {
                throw new HttpException("Bad redirect url: " + headerField, iEZpvd, e2);
            }
        } catch (java.io.IOException e3) {
            throw new HttpException("Failed to connect or obtain data", EZpvd(this.AYXKKw), e3);
        }
    }

    public static int EZpvd(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    public final HttpURLConnection EZpvd(java.net.URL url, java.util.Map<java.lang.String, java.lang.String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionAEQbTJ = this.OLrzqt.AEQbTJ(url);
            for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                httpURLConnectionAEQbTJ.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionAEQbTJ.setConnectTimeout(this.djBIcL);
            httpURLConnectionAEQbTJ.setReadTimeout(this.djBIcL);
            httpURLConnectionAEQbTJ.setUseCaches(false);
            httpURLConnectionAEQbTJ.setDoInput(true);
            httpURLConnectionAEQbTJ.setInstanceFollowRedirects(false);
            return httpURLConnectionAEQbTJ;
        } catch (java.io.IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    public static boolean AEQbTJ(int i) {
        return i / 100 == 2;
    }

    public static boolean KWHzl(int i) {
        return i / 100 == 3;
    }

    public final java.io.InputStream KWHzl(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (android.text.TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.AEQbTJ = SA.OLrzqt(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (android.util.Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.AEQbTJ = httpURLConnection.getInputStream();
            }
            return this.AEQbTJ;
        } catch (java.io.IOException e) {
            throw new HttpException("Failed to obtain InputStream", EZpvd(httpURLConnection), e);
        }
    }

    @Override // o.NU
    public void AEQbTJ() {
        java.io.InputStream inputStream = this.AEQbTJ;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.AYXKKw;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.AYXKKw = null;
    }

    @Override // o.NU
    public com.bumptech.glide.load.DataSource OLrzqt() {
        return com.bumptech.glide.load.DataSource.REMOTE;
    }

    public static class Activity implements Application {
        @Override // o.NW.Application
        public HttpURLConnection AEQbTJ(java.net.URL url) throws java.io.IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }
}
