package org.apache.http;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59851zoo;
import o.C59852zop;

/* JADX INFO: loaded from: classes13.dex */
public final class HttpHost implements Cloneable, Serializable {
    public static final String DEFAULT_SCHEME_NAME = "http";
    private static final long serialVersionUID = -7529410654042457626L;
    protected final InetAddress address;
    protected final String hostname;
    protected final String lcHostname;
    protected final int port;
    protected final String schemeName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InetAddress getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getHostName() {
        return this.hostname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getPort() {
        return this.port;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSchemeName() {
        return this.schemeName;
    }

    public HttpHost(String str, int i, String str2) {
        this.hostname = (String) C59851zoo.KWHzl(str, "Host name");
        Locale locale = Locale.ROOT;
        this.lcHostname = str.toLowerCase(locale);
        this.schemeName = str2 != null ? str2.toLowerCase(locale) : "http";
        this.port = i;
        this.address = null;
    }

    public HttpHost(String str, int i) {
        this(str, i, (String) null);
    }

    public static HttpHost create(String str) {
        String strSubstring;
        int i;
        C59851zoo.KWHzl(str, "HTTP Host");
        int iIndexOf = str.indexOf("://");
        if (iIndexOf > 0) {
            strSubstring = str.substring(0, iIndexOf);
            str = str.substring(iIndexOf + 3);
        } else {
            strSubstring = null;
        }
        int iLastIndexOf = str.lastIndexOf(":");
        if (iLastIndexOf > 0) {
            try {
                i = Integer.parseInt(str.substring(iLastIndexOf + 1));
                str = str.substring(0, iLastIndexOf);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("Invalid HTTP host: " + str);
            }
        } else {
            i = -1;
        }
        return new HttpHost(str, i, strSubstring);
    }

    public HttpHost(String str) {
        this(str, -1, (String) null);
    }

    public HttpHost(InetAddress inetAddress, int i, String str) {
        this((InetAddress) C59851zoo.AEQbTJ(inetAddress, "Inet address"), inetAddress.getHostName(), i, str);
    }

    public HttpHost(InetAddress inetAddress, String str, int i, String str2) {
        this.address = (InetAddress) C59851zoo.AEQbTJ(inetAddress, "Inet address");
        String str3 = (String) C59851zoo.AEQbTJ(str, "Hostname");
        this.hostname = str3;
        Locale locale = Locale.ROOT;
        this.lcHostname = str3.toLowerCase(locale);
        this.schemeName = str2 != null ? str2.toLowerCase(locale) : "http";
        this.port = i;
    }

    public HttpHost(InetAddress inetAddress, int i) {
        this(inetAddress, i, (String) null);
    }

    public HttpHost(InetAddress inetAddress) {
        this(inetAddress, -1, (String) null);
    }

    public HttpHost(HttpHost httpHost) {
        C59851zoo.AEQbTJ(httpHost, "HTTP host");
        this.hostname = httpHost.hostname;
        this.lcHostname = httpHost.lcHostname;
        this.schemeName = httpHost.schemeName;
        this.port = httpHost.port;
        this.address = httpHost.address;
    }

    public String toURI() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.schemeName);
        sb.append("://");
        sb.append(this.hostname);
        if (this.port != -1) {
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(Integer.toString(this.port));
        }
        return sb.toString();
    }

    public String toHostString() {
        if (this.port == -1) {
            return this.hostname;
        }
        StringBuilder sb = new StringBuilder(this.hostname.length() + 6);
        sb.append(this.hostname);
        sb.append(":");
        sb.append(Integer.toString(this.port));
        return sb.toString();
    }

    public String toString() {
        return toURI();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpHost)) {
            return false;
        }
        HttpHost httpHost = (HttpHost) obj;
        if (this.lcHostname.equals(httpHost.lcHostname) && this.port == httpHost.port && this.schemeName.equals(httpHost.schemeName)) {
            InetAddress inetAddress = this.address;
            InetAddress inetAddress2 = httpHost.address;
            if (inetAddress == null) {
                if (inetAddress2 == null) {
                    return true;
                }
            } else if (inetAddress.equals(inetAddress2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iEZpvd = C59852zop.EZpvd(C59852zop.EZpvd(C59852zop.EZpvd(17, this.lcHostname), this.port), this.schemeName);
        InetAddress inetAddress = this.address;
        return inetAddress != null ? C59852zop.EZpvd(iEZpvd, inetAddress) : iEZpvd;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
