package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;

/* JADX INFO: renamed from: o.rny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43371rny {
    public static final C43371rny OLrzqt = new C43371rny();

    private C43371rny() {
    }

    public final boolean KWHzl() {
        return C43292rmY.OLrzqt.AuCTel();
    }

    public final boolean AEQbTJ() {
        java.lang.String property = java.lang.System.getProperty("http.proxyHost");
        if (property == null) {
            property = "";
        }
        java.lang.String property2 = java.lang.System.getProperty("http.proxyPort");
        if (property2 == null) {
            property2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        return property.length() > 0 && java.lang.Integer.parseInt(property2) != -1;
    }
}
