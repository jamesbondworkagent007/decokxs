package org.apache.http.client.utils;

import com.amplifyframework.core.model.ModelIdentifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59514ziV;
import o.C59649zky;
import o.C59853zoq;
import o.InterfaceC59582zjk;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: loaded from: classes13.dex */
public class URIBuilder {
    private Charset charset;
    private String encodedAuthority;
    private String encodedFragment;
    private String encodedPath;
    private String encodedQuery;
    private String encodedSchemeSpecificPart;
    private String encodedUserInfo;
    private String fragment;
    private String host;
    private String path;
    private int port;
    private String query;
    private List<InterfaceC59582zjk> queryParams;
    private String scheme;
    private String userInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URIBuilder clearParameters() {
        this.queryParams = null;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Charset getCharset() {
        return this.charset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFragment() {
        return this.fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getHost() {
        return this.host;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getPort() {
        return this.port;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getScheme() {
        return this.scheme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUserInfo() {
        return this.userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAbsolute() {
        return this.scheme != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isOpaque() {
        return this.path == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URIBuilder removeQuery() {
        this.queryParams = null;
        this.query = null;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URIBuilder setCharset(Charset charset) {
        this.charset = charset;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URIBuilder setCustomQuery(String str) {
        this.query = str;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.queryParams = null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URIBuilder setFragment(String str) {
        this.fragment = str;
        this.encodedFragment = null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URIBuilder setHost(String str) {
        this.host = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URIBuilder setPath(String str) {
        this.path = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedPath = null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URIBuilder setPort(int i) {
        if (i < 0) {
            i = -1;
        }
        this.port = i;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URIBuilder setScheme(String str) {
        this.scheme = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URIBuilder setUserInfo(String str) {
        this.userInfo = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        this.encodedUserInfo = null;
        return this;
    }

    public URIBuilder() {
        this.port = -1;
    }

    public URIBuilder(String str) throws URISyntaxException {
        digestURI(new URI(str));
    }

    public URIBuilder(URI uri) {
        digestURI(uri);
    }

    private List<InterfaceC59582zjk> parseQuery(String str, Charset charset) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return URLEncodedUtils.parse(str, charset);
    }

    public URI build() throws URISyntaxException {
        return new URI(buildString());
    }

    private String buildString() {
        StringBuilder sb = new StringBuilder();
        String str = this.scheme;
        if (str != null) {
            sb.append(str);
            sb.append(AbstractJsonLexerKt.COLON);
        }
        String str2 = this.encodedSchemeSpecificPart;
        if (str2 != null) {
            sb.append(str2);
        } else {
            if (this.encodedAuthority != null) {
                sb.append("//");
                sb.append(this.encodedAuthority);
            } else if (this.host != null) {
                sb.append("//");
                String str3 = this.encodedUserInfo;
                if (str3 != null) {
                    sb.append(str3);
                    sb.append("@");
                } else {
                    String str4 = this.userInfo;
                    if (str4 != null) {
                        sb.append(encodeUserInfo(str4));
                        sb.append("@");
                    }
                }
                if (C59649zky.AEQbTJ(this.host)) {
                    sb.append("[");
                    sb.append(this.host);
                    sb.append("]");
                } else {
                    sb.append(this.host);
                }
                if (this.port >= 0) {
                    sb.append(":");
                    sb.append(this.port);
                }
            }
            String str5 = this.encodedPath;
            if (str5 != null) {
                sb.append(normalizePath(str5, sb.length() == 0));
            } else {
                String str6 = this.path;
                if (str6 != null) {
                    sb.append(encodePath(normalizePath(str6, sb.length() == 0)));
                }
            }
            if (this.encodedQuery != null) {
                sb.append("?");
                sb.append(this.encodedQuery);
            } else {
                List<InterfaceC59582zjk> list = this.queryParams;
                if (list != null && !list.isEmpty()) {
                    sb.append("?");
                    sb.append(encodeUrlForm(this.queryParams));
                } else if (this.query != null) {
                    sb.append("?");
                    sb.append(encodeUric(this.query));
                }
            }
        }
        if (this.encodedFragment != null) {
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
            sb.append(this.encodedFragment);
        } else if (this.fragment != null) {
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
            sb.append(encodeUric(this.fragment));
        }
        return sb.toString();
    }

    private static String normalizePath(String str, boolean z) {
        if (C59853zoq.OLrzqt(str)) {
            return "";
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == '/') {
            i++;
        }
        if (i > 1) {
            str = str.substring(i - 1);
        }
        if (z || str.startsWith("/")) {
            return str;
        }
        return "/" + str;
    }

    private void digestURI(URI uri) {
        this.scheme = uri.getScheme();
        this.encodedSchemeSpecificPart = uri.getRawSchemeSpecificPart();
        this.encodedAuthority = uri.getRawAuthority();
        this.host = uri.getHost();
        this.port = uri.getPort();
        this.encodedUserInfo = uri.getRawUserInfo();
        this.userInfo = uri.getUserInfo();
        this.encodedPath = uri.getRawPath();
        this.path = uri.getPath();
        this.encodedQuery = uri.getRawQuery();
        String rawQuery = uri.getRawQuery();
        Charset charset = this.charset;
        if (charset == null) {
            charset = C59514ziV.KWHzl;
        }
        this.queryParams = parseQuery(rawQuery, charset);
        this.encodedFragment = uri.getRawFragment();
        this.fragment = uri.getFragment();
    }

    private String encodeUserInfo(String str) {
        Charset charset = this.charset;
        if (charset == null) {
            charset = C59514ziV.KWHzl;
        }
        return URLEncodedUtils.encUserInfo(str, charset);
    }

    private String encodePath(String str) {
        Charset charset = this.charset;
        if (charset == null) {
            charset = C59514ziV.KWHzl;
        }
        return URLEncodedUtils.encPath(str, charset);
    }

    private String encodeUrlForm(List<InterfaceC59582zjk> list) {
        Charset charset = this.charset;
        if (charset == null) {
            charset = C59514ziV.KWHzl;
        }
        return URLEncodedUtils.format(list, charset);
    }

    private String encodeUric(String str) {
        Charset charset = this.charset;
        if (charset == null) {
            charset = C59514ziV.KWHzl;
        }
        return URLEncodedUtils.encUric(str, charset);
    }

    public URIBuilder setUserInfo(String str, String str2) {
        return setUserInfo(str + AbstractJsonLexerKt.COLON + str2);
    }

    @Deprecated
    public URIBuilder setQuery(String str) {
        Charset charset = this.charset;
        if (charset == null) {
            charset = C59514ziV.KWHzl;
        }
        this.queryParams = parseQuery(str, charset);
        this.query = null;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    public URIBuilder setParameters(List<InterfaceC59582zjk> list) {
        List<InterfaceC59582zjk> list2 = this.queryParams;
        if (list2 == null) {
            this.queryParams = new ArrayList();
        } else {
            list2.clear();
        }
        this.queryParams.addAll(list);
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public URIBuilder addParameters(List<InterfaceC59582zjk> list) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        this.queryParams.addAll(list);
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public URIBuilder setParameters(InterfaceC59582zjk... interfaceC59582zjkArr) {
        List<InterfaceC59582zjk> list = this.queryParams;
        if (list == null) {
            this.queryParams = new ArrayList();
        } else {
            list.clear();
        }
        for (InterfaceC59582zjk interfaceC59582zjk : interfaceC59582zjkArr) {
            this.queryParams.add(interfaceC59582zjk);
        }
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public URIBuilder addParameter(String str, String str2) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        this.queryParams.add(new BasicNameValuePair(str, str2));
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public URIBuilder setParameter(String str, String str2) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        if (!this.queryParams.isEmpty()) {
            Iterator<InterfaceC59582zjk> it = this.queryParams.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equals(str)) {
                    it.remove();
                }
            }
        }
        this.queryParams.add(new BasicNameValuePair(str, str2));
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public List<InterfaceC59582zjk> getQueryParams() {
        if (this.queryParams != null) {
            return new ArrayList(this.queryParams);
        }
        return new ArrayList();
    }

    public String toString() {
        return buildString();
    }
}
