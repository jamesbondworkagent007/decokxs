package org.apache.http.client.utils;

import com.amplifyframework.core.model.ModelIdentifier;
import com.fasterxml.jackson.core.JsonPointer;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59851zoo;
import o.C59853zoq;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;

/* JADX INFO: loaded from: classes13.dex */
public class URIUtils {
    @Deprecated
    public static URI createURI(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append(JsonPointer.SEPARATOR);
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }

    public static URI rewriteURI(URI uri, HttpHost httpHost, boolean z) throws URISyntaxException {
        C59851zoo.AEQbTJ(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        URIBuilder uRIBuilder = new URIBuilder(uri);
        if (httpHost != null) {
            uRIBuilder.setScheme(httpHost.getSchemeName());
            uRIBuilder.setHost(httpHost.getHostName());
            uRIBuilder.setPort(httpHost.getPort());
        } else {
            uRIBuilder.setScheme(null);
            uRIBuilder.setHost(null);
            uRIBuilder.setPort(-1);
        }
        if (z) {
            uRIBuilder.setFragment(null);
        }
        if (C59853zoq.EZpvd(uRIBuilder.getPath())) {
            uRIBuilder.setPath("/");
        }
        return uRIBuilder.build();
    }

    public static URI rewriteURI(URI uri, HttpHost httpHost) throws URISyntaxException {
        return rewriteURI(uri, httpHost, false);
    }

    public static URI rewriteURI(URI uri) throws URISyntaxException {
        C59851zoo.AEQbTJ(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        URIBuilder uRIBuilder = new URIBuilder(uri);
        if (uRIBuilder.getUserInfo() != null) {
            uRIBuilder.setUserInfo(null);
        }
        if (C59853zoq.EZpvd(uRIBuilder.getPath())) {
            uRIBuilder.setPath("/");
        }
        if (uRIBuilder.getHost() != null) {
            uRIBuilder.setHost(uRIBuilder.getHost().toLowerCase(Locale.ROOT));
        }
        uRIBuilder.setFragment(null);
        return uRIBuilder.build();
    }

    public static URI rewriteURIForRoute(URI uri, RouteInfo routeInfo) throws URISyntaxException {
        if (uri == null) {
            return null;
        }
        if (routeInfo.EZpvd() != null && !routeInfo.gEmmrt()) {
            if (!uri.isAbsolute()) {
                return rewriteURI(uri, routeInfo.copydefault(), true);
            }
            return rewriteURI(uri);
        }
        if (uri.isAbsolute()) {
            return rewriteURI(uri, null, true);
        }
        return rewriteURI(uri);
    }

    public static URI resolve(URI uri, String str) {
        return resolve(uri, URI.create(str));
    }

    public static URI resolve(URI uri, URI uri2) {
        URI uriResolve;
        C59851zoo.AEQbTJ(uri, "Base URI");
        C59851zoo.AEQbTJ(uri2, "Reference URI");
        String aSCIIString = uri2.toASCIIString();
        if (aSCIIString.startsWith("?")) {
            String aSCIIString2 = uri.toASCIIString();
            int iIndexOf = aSCIIString2.indexOf(63);
            if (iIndexOf > -1) {
                aSCIIString2 = aSCIIString2.substring(0, iIndexOf);
            }
            return URI.create(aSCIIString2 + aSCIIString);
        }
        if (aSCIIString.isEmpty()) {
            String aSCIIString3 = uri.resolve(URI.create(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)).toASCIIString();
            uriResolve = URI.create(aSCIIString3.substring(0, aSCIIString3.indexOf(35)));
        } else {
            uriResolve = uri.resolve(uri2);
        }
        try {
            return normalizeSyntax(uriResolve);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static URI normalizeSyntax(URI uri) throws URISyntaxException {
        if (uri.isOpaque() || uri.getAuthority() == null) {
            return uri;
        }
        C59851zoo.copydefault(uri.isAbsolute(), "Base URI must be absolute");
        URIBuilder uRIBuilder = new URIBuilder(uri);
        String path = uRIBuilder.getPath();
        if (path != null && !path.equals("/")) {
            String[] strArrSplit = path.split("/");
            Stack<String> stack = new Stack();
            for (String str : strArrSplit) {
                if (!str.isEmpty() && !JwtUtilsKt.JWT_DELIMITER.equals(str)) {
                    if ("..".equals(str)) {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                    } else {
                        stack.push(str);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : stack) {
                sb.append(JsonPointer.SEPARATOR);
                sb.append(str2);
            }
            if (path.lastIndexOf(47) == path.length() - 1) {
                sb.append(JsonPointer.SEPARATOR);
            }
            uRIBuilder.setPath(sb.toString());
        }
        if (uRIBuilder.getScheme() != null) {
            uRIBuilder.setScheme(uRIBuilder.getScheme().toLowerCase(Locale.ROOT));
        }
        if (uRIBuilder.getHost() != null) {
            uRIBuilder.setHost(uRIBuilder.getHost().toLowerCase(Locale.ROOT));
        }
        return uRIBuilder.build();
    }

    public static HttpHost extractHost(URI uri) {
        int iIndexOf;
        if (uri == null || !uri.isAbsolute()) {
            return null;
        }
        int port = uri.getPort();
        String host = uri.getHost();
        if (host == null && (host = uri.getAuthority()) != null) {
            int iIndexOf2 = host.indexOf(64);
            if (iIndexOf2 >= 0) {
                int i = iIndexOf2 + 1;
                host = host.length() > i ? host.substring(i) : null;
            }
            if (host != null && (iIndexOf = host.indexOf(58)) >= 0) {
                int i2 = iIndexOf + 1;
                int i3 = 0;
                for (int i4 = i2; i4 < host.length() && Character.isDigit(host.charAt(i4)); i4++) {
                    i3++;
                }
                if (i3 > 0) {
                    try {
                        port = Integer.parseInt(host.substring(i2, i3 + i2));
                    } catch (NumberFormatException unused) {
                    }
                }
                host = host.substring(0, iIndexOf);
            }
        }
        String scheme = uri.getScheme();
        if (C59853zoq.OLrzqt(host)) {
            return null;
        }
        try {
            return new HttpHost(host, port, scheme);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    public static URI resolve(URI uri, HttpHost httpHost, List<URI> list) throws URISyntaxException {
        URIBuilder uRIBuilder;
        C59851zoo.AEQbTJ(uri, "Request URI");
        if (list == null || list.isEmpty()) {
            uRIBuilder = new URIBuilder(uri);
        } else {
            uRIBuilder = new URIBuilder(list.get(list.size() - 1));
            String fragment = uRIBuilder.getFragment();
            for (int size = list.size() - 1; fragment == null && size >= 0; size--) {
                fragment = list.get(size).getFragment();
            }
            uRIBuilder.setFragment(fragment);
        }
        if (uRIBuilder.getFragment() == null) {
            uRIBuilder.setFragment(uri.getFragment());
        }
        if (httpHost != null && !uRIBuilder.isAbsolute()) {
            uRIBuilder.setScheme(httpHost.getSchemeName());
            uRIBuilder.setHost(httpHost.getHostName());
            uRIBuilder.setPort(httpHost.getPort());
        }
        return uRIBuilder.build();
    }

    private URIUtils() {
    }
}
