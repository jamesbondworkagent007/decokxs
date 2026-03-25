package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;

/* JADX INFO: renamed from: o.zkg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59631zkg implements org.apache.http.conn.routing.RouteInfo, java.lang.Cloneable {
    public boolean AEQbTJ;
    public RouteInfo.TunnelType AhwBna;
    public RouteInfo.LayerType EZpvd;
    public final java.net.InetAddress KWHzl;
    public boolean OLrzqt;
    public HttpHost[] copydefault;
    public final HttpHost valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.conn.routing.RouteInfo
    public final java.net.InetAddress OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost copydefault() {
        return this.valueOf;
    }

    public C59631zkg(HttpHost httpHost, java.net.InetAddress inetAddress) {
        C59851zoo.AEQbTJ(httpHost, "Target host");
        this.valueOf = httpHost;
        this.KWHzl = inetAddress;
        this.AhwBna = RouteInfo.TunnelType.PLAIN;
        this.EZpvd = RouteInfo.LayerType.PLAIN;
    }

    public void valueOf() {
        this.AEQbTJ = false;
        this.copydefault = null;
        this.AhwBna = RouteInfo.TunnelType.PLAIN;
        this.EZpvd = RouteInfo.LayerType.PLAIN;
        this.OLrzqt = false;
    }

    public C59631zkg(C59570zjY c59570zjY) {
        this(c59570zjY.copydefault(), c59570zjY.OLrzqt());
    }

    public final void copydefault(boolean z) {
        C59849zom.EZpvd(!this.AEQbTJ, "Already connected");
        this.AEQbTJ = true;
        this.OLrzqt = z;
    }

    public final void EZpvd(HttpHost httpHost, boolean z) {
        C59851zoo.AEQbTJ(httpHost, "Proxy host");
        C59849zom.EZpvd(!this.AEQbTJ, "Already connected");
        this.AEQbTJ = true;
        this.copydefault = new HttpHost[]{httpHost};
        this.OLrzqt = z;
    }

    public final void KWHzl(boolean z) {
        C59849zom.EZpvd(this.AEQbTJ, "No tunnel unless connected");
        C59849zom.AEQbTJ(this.copydefault, "No tunnel without proxy");
        this.AhwBna = RouteInfo.TunnelType.TUNNELLED;
        this.OLrzqt = z;
    }

    public final void OLrzqt(HttpHost httpHost, boolean z) {
        C59851zoo.AEQbTJ(httpHost, "Proxy host");
        C59849zom.EZpvd(this.AEQbTJ, "No tunnel unless connected");
        C59849zom.AEQbTJ(this.copydefault, "No tunnel without proxy");
        HttpHost[] httpHostArr = this.copydefault;
        int length = httpHostArr.length;
        HttpHost[] httpHostArr2 = new HttpHost[length + 1];
        java.lang.System.arraycopy(httpHostArr, 0, httpHostArr2, 0, httpHostArr.length);
        httpHostArr2[length] = httpHost;
        this.copydefault = httpHostArr2;
        this.OLrzqt = z;
    }

    public final void EZpvd(boolean z) {
        C59849zom.EZpvd(this.AEQbTJ, "No layered protocol unless connected");
        this.EZpvd = RouteInfo.LayerType.LAYERED;
        this.OLrzqt = z;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final int AEQbTJ() {
        if (!this.AEQbTJ) {
            return 0;
        }
        HttpHost[] httpHostArr = this.copydefault;
        if (httpHostArr == null) {
            return 1;
        }
        return 1 + httpHostArr.length;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost AEQbTJ(int i) {
        C59851zoo.KWHzl(i, "Hop index");
        int iAEQbTJ = AEQbTJ();
        C59851zoo.copydefault(i < iAEQbTJ, "Hop index exceeds tracked route length");
        return i < iAEQbTJ - 1 ? this.copydefault[i] : this.valueOf;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost EZpvd() {
        HttpHost[] httpHostArr = this.copydefault;
        if (httpHostArr == null) {
            return null;
        }
        return httpHostArr[0];
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean gEmmrt() {
        return this.AhwBna == RouteInfo.TunnelType.TUNNELLED;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean KWHzl() {
        return this.EZpvd == RouteInfo.LayerType.LAYERED;
    }

    public final C59570zjY djBIcL() {
        if (this.AEQbTJ) {
            return new C59570zjY(this.valueOf, this.KWHzl, this.copydefault, this.OLrzqt, this.AhwBna, this.EZpvd);
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C59631zkg)) {
            return false;
        }
        C59631zkg c59631zkg = (C59631zkg) obj;
        return this.AEQbTJ == c59631zkg.AEQbTJ && this.OLrzqt == c59631zkg.OLrzqt && this.AhwBna == c59631zkg.AhwBna && this.EZpvd == c59631zkg.EZpvd && C59852zop.OLrzqt(this.valueOf, c59631zkg.valueOf) && C59852zop.OLrzqt(this.KWHzl, c59631zkg.KWHzl) && C59852zop.AEQbTJ(this.copydefault, c59631zkg.copydefault);
    }

    public final int hashCode() {
        int iEZpvd = C59852zop.EZpvd(C59852zop.EZpvd(17, this.valueOf), this.KWHzl);
        HttpHost[] httpHostArr = this.copydefault;
        if (httpHostArr != null) {
            for (HttpHost httpHost : httpHostArr) {
                iEZpvd = C59852zop.EZpvd(iEZpvd, httpHost);
            }
        }
        return C59852zop.EZpvd(C59852zop.EZpvd(C59852zop.KWHzl(C59852zop.KWHzl(iEZpvd, this.AEQbTJ), this.OLrzqt), this.AhwBna), this.EZpvd);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((AEQbTJ() * 30) + 50);
        sb.append("RouteTracker[");
        java.net.InetAddress inetAddress = this.KWHzl;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this.AEQbTJ) {
            sb.append('c');
        }
        if (this.AhwBna == RouteInfo.TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.EZpvd == RouteInfo.LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.OLrzqt) {
            sb.append('s');
        }
        sb.append("}->");
        HttpHost[] httpHostArr = this.copydefault;
        if (httpHostArr != null) {
            for (HttpHost httpHost : httpHostArr) {
                sb.append(httpHost);
                sb.append("->");
            }
        }
        sb.append(this.valueOf);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
}
