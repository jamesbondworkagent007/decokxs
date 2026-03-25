package o;

import com.google.common.net.HttpHeaders;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public class dGL extends android.webkit.WebViewClient {
    public boolean EZpvd;
    public final dEU KWHzl;
    public final java.lang.Object OLrzqt = new java.lang.Object();

    public dGL(dEU deu) {
        this.KWHzl = deu;
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null && webResourceRequest.getMethod().equalsIgnoreCase("GET")) {
            java.lang.String lowerCase = webResourceRequest.getUrl().toString().toLowerCase();
            if (!lowerCase.toLowerCase().startsWith("http")) {
                return null;
            }
            if (!webResourceRequest.isForMainFrame()) {
                java.lang.String str = webResourceRequest.getRequestHeaders() != null ? webResourceRequest.getRequestHeaders().get(HttpHeaders.ACCEPT) : null;
                if (webResourceRequest.getMethod().equalsIgnoreCase("GET") && str != null && !str.contains("text/html")) {
                    super.shouldInterceptRequest(webView, webResourceRequest);
                    return null;
                }
                if (webResourceRequest.getMethod().equalsIgnoreCase("GET") && (lowerCase.contains(".js") || lowerCase.contains(".jpeg") || lowerCase.contains(".avif") || lowerCase.contains(".json") || lowerCase.contains(".jpg") || lowerCase.contains(".gif") || lowerCase.contains(".svg") || lowerCase.contains(".png") || lowerCase.contains(".webp") || lowerCase.contains(".mp4") || lowerCase.contains(".woff") || lowerCase.contains(".ttf") || lowerCase.contains("css"))) {
                    synchronized (this.OLrzqt) {
                        if (!this.EZpvd) {
                            KWHzl(webView);
                            this.EZpvd = true;
                        }
                    }
                    super.shouldInterceptRequest(webView, webResourceRequest);
                    return null;
                }
                java.lang.String host = webResourceRequest.getUrl().getHost();
                if (host == null || (!host.contains("openblock.com") && !host.contains("openocean.finance") && !C48787ucK.AEQbTJ.copydefault("dappConfig.iframeHost", "").contains(host))) {
                    super.shouldInterceptRequest(webView, webResourceRequest);
                    return null;
                }
            }
            HttpUrl httpUrl = HttpUrl.parse(webResourceRequest.getUrl().toString());
            if (httpUrl == null) {
                return null;
            }
            try {
                dEV devCopydefault = this.KWHzl.copydefault(httpUrl.toString(), webResourceRequest.getRequestHeaders());
                if (devCopydefault != null && !devCopydefault.copydefault && devCopydefault.KWHzl != null) {
                    android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse(devCopydefault.gEmmrt, devCopydefault.EZpvd, new java.io.ByteArrayInputStream(devCopydefault.KWHzl.getBytes()));
                    webResourceResponse.setResponseHeaders(devCopydefault.AEQbTJ);
                    try {
                        webResourceResponse.setStatusCodeAndReasonPhrase(devCopydefault.OLrzqt, devCopydefault.AYXKKw);
                    } catch (java.lang.Exception unused) {
                    }
                    synchronized (this.OLrzqt) {
                        this.EZpvd = true;
                    }
                    return webResourceResponse;
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
        return null;
    }

    public final void KWHzl(final android.webkit.WebView webView) {
        final java.lang.String strEncodeToString = android.util.Base64.encodeToString(this.KWHzl.OLrzqt(webView.getContext(), "%1$s%2$s").getBytes(), 2);
        webView.post(new java.lang.Runnable() { // from class: o.dGK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                dGL.KWHzl(webView, strEncodeToString);
            }
        });
    }

    public static /* synthetic */ void KWHzl(android.webkit.WebView webView, java.lang.String str) {
        webView.loadUrl("javascript:(function() {var parent = document.getElementsByTagName('head').item(0);var script = document.createElement('script');script.type = 'text/javascript';script.innerHTML = window.atob('" + str + "');parent.appendChild(script)})()");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        sslErrorHandler.cancel();
    }
}
