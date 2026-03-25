package o;

import java.util.Collections;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;

/* JADX INFO: renamed from: o.zjY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59570zjY implements org.apache.http.conn.routing.RouteInfo, java.lang.Cloneable {
    public final java.util.List<HttpHost> AEQbTJ;
    public final boolean EZpvd;
    public final java.net.InetAddress KWHzl;
    public final HttpHost OLrzqt;
    public final RouteInfo.LayerType copydefault;
    public final RouteInfo.TunnelType gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.conn.routing.RouteInfo
    public final java.net.InetAddress OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost copydefault() {
        return this.OLrzqt;
    }

    public C59570zjY(HttpHost httpHost, java.net.InetAddress inetAddress, java.util.List<HttpHost> list, boolean z, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        C59851zoo.AEQbTJ(httpHost, "Target host");
        this.OLrzqt = EZpvd(httpHost);
        this.KWHzl = inetAddress;
        this.AEQbTJ = (list == null || list.isEmpty()) ? null : new java.util.ArrayList(list);
        if (tunnelType == RouteInfo.TunnelType.TUNNELLED) {
            C59851zoo.copydefault(this.AEQbTJ != null, "Proxy required if tunnelled");
        }
        this.EZpvd = z;
        this.gEmmrt = tunnelType == null ? RouteInfo.TunnelType.PLAIN : tunnelType;
        this.copydefault = layerType == null ? RouteInfo.LayerType.PLAIN : layerType;
    }

    public static int copydefault(java.lang.String str) {
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        return "https".equalsIgnoreCase(str) ? 443 : -1;
    }

    public static HttpHost EZpvd(HttpHost httpHost) {
        if (httpHost.getPort() >= 0) {
            return httpHost;
        }
        java.net.InetAddress address = httpHost.getAddress();
        java.lang.String schemeName = httpHost.getSchemeName();
        if (address != null) {
            return new HttpHost(address, copydefault(schemeName), schemeName);
        }
        return new HttpHost(httpHost.getHostName(), copydefault(schemeName), schemeName);
    }

    public C59570zjY(HttpHost httpHost, java.net.InetAddress inetAddress, HttpHost[] httpHostArr, boolean z, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        this(httpHost, inetAddress, (java.util.List<HttpHost>) (httpHostArr != null ? java.util.Arrays.asList(httpHostArr) : null), z, tunnelType, layerType);
    }

    public C59570zjY(HttpHost httpHost, java.net.InetAddress inetAddress, boolean z) {
        this(httpHost, inetAddress, (java.util.List<HttpHost>) Collections.emptyList(), z, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public C59570zjY(HttpHost httpHost) {
        this(httpHost, (java.net.InetAddress) null, (java.util.List<HttpHost>) Collections.emptyList(), false, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public C59570zjY(HttpHost httpHost, java.net.InetAddress inetAddress, HttpHost httpHost2, boolean z) {
        this(httpHost, inetAddress, (java.util.List<HttpHost>) Collections.singletonList(C59851zoo.AEQbTJ(httpHost2, "Proxy host")), z, z ? RouteInfo.TunnelType.TUNNELLED : RouteInfo.TunnelType.PLAIN, z ? RouteInfo.LayerType.LAYERED : RouteInfo.LayerType.PLAIN);
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final int AEQbTJ() {
        java.util.List<HttpHost> list = this.AEQbTJ;
        if (list != null) {
            return 1 + list.size();
        }
        return 1;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost AEQbTJ(int i) {
        C59851zoo.KWHzl(i, "Hop index");
        int iAEQbTJ = AEQbTJ();
        C59851zoo.copydefault(i < iAEQbTJ, "Hop index exceeds tracked route length");
        return i < iAEQbTJ - 1 ? this.AEQbTJ.get(i) : this.OLrzqt;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost EZpvd() {
        java.util.List<HttpHost> list = this.AEQbTJ;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.AEQbTJ.get(0);
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean gEmmrt() {
        return this.gEmmrt == RouteInfo.TunnelType.TUNNELLED;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean KWHzl() {
        return this.copydefault == RouteInfo.LayerType.LAYERED;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59570zjY)) {
            return false;
        }
        C59570zjY c59570zjY = (C59570zjY) obj;
        return this.EZpvd == c59570zjY.EZpvd && this.gEmmrt == c59570zjY.gEmmrt && this.copydefault == c59570zjY.copydefault && C59852zop.OLrzqt(this.OLrzqt, c59570zjY.OLrzqt) && C59852zop.OLrzqt(this.KWHzl, c59570zjY.KWHzl) && C59852zop.OLrzqt(this.AEQbTJ, c59570zjY.AEQbTJ);
    }

    public final int hashCode() {
        int iEZpvd = C59852zop.EZpvd(C59852zop.EZpvd(17, this.OLrzqt), this.KWHzl);
        java.util.List<HttpHost> list = this.AEQbTJ;
        if (list != null) {
            java.util.Iterator<HttpHost> it = list.iterator();
            while (it.hasNext()) {
                iEZpvd = C59852zop.EZpvd(iEZpvd, it.next());
            }
        }
        return C59852zop.EZpvd(C59852zop.EZpvd(C59852zop.KWHzl(iEZpvd, this.EZpvd), this.gEmmrt), this.copydefault);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((AEQbTJ() * 30) + 50);
        java.net.InetAddress inetAddress = this.KWHzl;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this.gEmmrt == RouteInfo.TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.copydefault == RouteInfo.LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.EZpvd) {
            sb.append('s');
        }
        sb.append("}->");
        java.util.List<HttpHost> list = this.AEQbTJ;
        if (list != null) {
            java.util.Iterator<HttpHost> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("->");
            }
        }
        sb.append(this.OLrzqt);
        return sb.toString();
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
}
