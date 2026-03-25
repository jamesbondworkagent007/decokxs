package com.just.agentweb;

/* JADX INFO: loaded from: classes3.dex */
public class MiddlewareWebClientBase extends WebViewClientDelegate {
    private static String TAG = "MiddlewareWebClientBase";
    private MiddlewareWebClientBase mMiddleWrareWebClientBase;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiddlewareWebClientBase next() {
        return this.mMiddleWrareWebClientBase;
    }

    public MiddlewareWebClientBase(MiddlewareWebClientBase middlewareWebClientBase) {
        super(middlewareWebClientBase);
        this.mMiddleWrareWebClientBase = middlewareWebClientBase;
    }

    public MiddlewareWebClientBase(android.webkit.WebViewClient webViewClient) {
        super(webViewClient);
    }

    public MiddlewareWebClientBase() {
        super(null);
    }

    @Override // com.just.agentweb.WebViewClientDelegate
    public final void setDelegate(android.webkit.WebViewClient webViewClient) {
        super.setDelegate(webViewClient);
    }

    public final MiddlewareWebClientBase enq(MiddlewareWebClientBase middlewareWebClientBase) {
        setDelegate(middlewareWebClientBase);
        this.mMiddleWrareWebClientBase = middlewareWebClientBase;
        return middlewareWebClientBase;
    }
}
