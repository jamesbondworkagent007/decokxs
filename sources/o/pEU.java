package o;

import com.okinc.kline.data.KLineTechPic;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pEU {
    public static final pEU copydefault = new pEU();

    private pEU() {
    }

    public final java.lang.String EZpvd(int i) {
        switch (i) {
            case 0:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.AuCTel);
            case 1:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.fARcdN);
            case 2:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.ejfBZ);
            case 3:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.getFieldNames);
            case 4:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.iwGUEr);
            case 5:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.getNewProxyInstance);
            case 6:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.AubY);
            case 7:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.wlaJM);
            default:
                return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl(int i) {
        switch (i) {
            case 1:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.fJNWhG);
            case 2:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.fIwbmz);
            case 3:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.uzCIH);
            case 4:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.hDKMBd);
            case 5:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.zLjUOn);
            case 6:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.zsXlph);
            case 7:
                return C33070mpX.AYXKKw(C35964oKf.Fragment.AuCTelauCTel);
            default:
                return "";
        }
    }

    public final java.lang.String OLrzqt(@NotNull KLineTechPic kLineTechPic, int i) {
        java.lang.String zoom;
        Intrinsics.checkNotNullParameter(kLineTechPic, "");
        switch (i) {
            case 1:
                zoom = kLineTechPic.getZoom();
                if (zoom == null) {
                    return "";
                }
                break;
            case 2:
                zoom = kLineTechPic.getOrder();
                if (zoom == null) {
                    return "";
                }
                break;
            case 3:
                zoom = kLineTechPic.getCost();
                if (zoom == null) {
                    return "";
                }
                break;
            case 4:
                zoom = kLineTechPic.getBuysell();
                if (zoom == null) {
                    return "";
                }
                break;
            case 5:
                zoom = kLineTechPic.getCountdown();
                if (zoom == null) {
                    return "";
                }
                break;
            case 6:
                zoom = kLineTechPic.getTV();
                if (zoom == null) {
                    return "";
                }
                break;
            default:
                return "";
        }
        return zoom;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int copydefault(@NotNull java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2027980370:
                str2 = "MARGIN";
                str.equals(str2);
            case -1956807563:
                return !str.equals("OPTION") ? 1 : 5;
            case 2552066:
                str2 = "SPOT";
                str.equals(str2);
            case 2558355:
                if (str.equals("SWAP")) {
                    return 3;
                }
                break;
            case 214415088:
                if (str.equals("FUTURES")) {
                    return 2;
                }
                break;
        }
    }
}
