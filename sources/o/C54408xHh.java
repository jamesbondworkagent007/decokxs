package o;

/* JADX INFO: renamed from: o.xHh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54408xHh {
    public static final C54408xHh copydefault = new C54408xHh();

    private C54408xHh() {
    }

    public final java.lang.String EZpvd() {
        java.lang.StringBuilder sb;
        java.lang.String str;
        if (C55697xoo.OLrzqt.AkhnZx()) {
            java.lang.String strZuBGHE = C43292rmY.OLrzqt.zuBGHE();
            sb = new java.lang.StringBuilder();
            sb.append(strZuBGHE);
            str = "/ws/v5/ipublic?brokerId=9999";
        } else {
            java.lang.String strZuBGHE2 = C43292rmY.OLrzqt.zuBGHE();
            sb = new java.lang.StringBuilder();
            sb.append(strZuBGHE2);
            str = "/ws/v5/ipublic";
        }
        sb.append(str);
        return sb.toString();
    }

    public final java.lang.String KWHzl() {
        java.lang.StringBuilder sb;
        java.lang.String str;
        if (C55697xoo.OLrzqt.AkhnZx()) {
            java.lang.String strZuBGHE = C43292rmY.OLrzqt.zuBGHE();
            sb = new java.lang.StringBuilder();
            sb.append(strZuBGHE);
            str = "/ws/v5/iprivate?brokerId=9999";
        } else {
            java.lang.String strZuBGHE2 = C43292rmY.OLrzqt.zuBGHE();
            sb = new java.lang.StringBuilder();
            sb.append(strZuBGHE2);
            str = "/ws/v5/iprivate";
        }
        sb.append(str);
        return sb.toString();
    }
}
