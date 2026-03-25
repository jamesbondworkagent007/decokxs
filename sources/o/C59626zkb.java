package o;

/* JADX INFO: renamed from: o.zkb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59626zkb implements InterfaceC59571zjZ {
    @Override // o.InterfaceC59571zjZ
    public int EZpvd(org.apache.http.conn.routing.RouteInfo routeInfo, org.apache.http.conn.routing.RouteInfo routeInfo2) {
        C59851zoo.AEQbTJ(routeInfo, "Planned route");
        if (routeInfo2 == null || routeInfo2.AEQbTJ() < 1) {
            return KWHzl(routeInfo);
        }
        if (routeInfo.AEQbTJ() > 1) {
            return KWHzl(routeInfo, routeInfo2);
        }
        return AEQbTJ(routeInfo, routeInfo2);
    }

    public int KWHzl(org.apache.http.conn.routing.RouteInfo routeInfo) {
        return routeInfo.AEQbTJ() > 1 ? 2 : 1;
    }

    public int AEQbTJ(org.apache.http.conn.routing.RouteInfo routeInfo, org.apache.http.conn.routing.RouteInfo routeInfo2) {
        if (routeInfo2.AEQbTJ() <= 1 && routeInfo.copydefault().equals(routeInfo2.copydefault()) && routeInfo.AYXKKw() == routeInfo2.AYXKKw()) {
            return (routeInfo.OLrzqt() == null || routeInfo.OLrzqt().equals(routeInfo2.OLrzqt())) ? 0 : -1;
        }
        return -1;
    }

    public int KWHzl(org.apache.http.conn.routing.RouteInfo routeInfo, org.apache.http.conn.routing.RouteInfo routeInfo2) {
        int iAEQbTJ;
        int iAEQbTJ2;
        if (routeInfo2.AEQbTJ() <= 1 || !routeInfo.copydefault().equals(routeInfo2.copydefault()) || (iAEQbTJ = routeInfo.AEQbTJ()) < (iAEQbTJ2 = routeInfo2.AEQbTJ())) {
            return -1;
        }
        for (int i = 0; i < iAEQbTJ2 - 1; i++) {
            if (!routeInfo.AEQbTJ(i).equals(routeInfo2.AEQbTJ(i))) {
                return -1;
            }
        }
        if (iAEQbTJ > iAEQbTJ2) {
            return 4;
        }
        if ((routeInfo2.gEmmrt() && !routeInfo.gEmmrt()) || (routeInfo2.KWHzl() && !routeInfo.KWHzl())) {
            return -1;
        }
        if (routeInfo.gEmmrt() && !routeInfo2.gEmmrt()) {
            return 3;
        }
        if (!routeInfo.KWHzl() || routeInfo2.KWHzl()) {
            return routeInfo.AYXKKw() != routeInfo2.AYXKKw() ? -1 : 0;
        }
        return 5;
    }
}
