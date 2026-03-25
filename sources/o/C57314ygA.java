package o;

/* JADX INFO: renamed from: o.ygA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57314ygA implements android.webkit.WebResourceRequest {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final android.webkit.WebResourceRequest KWHzl;
    public final android.net.Uri copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.webkit.WebResourceRequest
    public android.net.Uri getUrl() {
        return this.copydefault;
    }

    public C57314ygA(android.webkit.WebResourceRequest webResourceRequest, java.lang.String str, android.net.Uri uri, java.lang.String str2) {
        this.KWHzl = webResourceRequest;
        this.AEQbTJ = str;
        this.EZpvd = str2;
        if (uri != null) {
            this.copydefault = uri;
        } else {
            this.copydefault = webResourceRequest.getUrl();
        }
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isForMainFrame() {
        return this.KWHzl.isForMainFrame();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isRedirect() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean hasGesture() {
        return this.KWHzl.hasGesture();
    }

    @Override // android.webkit.WebResourceRequest
    public java.lang.String getMethod() {
        return this.KWHzl.getMethod();
    }

    @Override // android.webkit.WebResourceRequest
    public java.util.Map<java.lang.String, java.lang.String> getRequestHeaders() {
        return this.KWHzl.getRequestHeaders();
    }
}
