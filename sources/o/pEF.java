package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes9.dex */
public final class pEF {
    public static final pEF OLrzqt = new pEF();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault(int i) {
        if (i != -1) {
            if (i == 0) {
                return "1s";
            }
            if (i != 1) {
                if (i == 3) {
                    return "3m";
                }
                if (i != 5) {
                    switch (i) {
                        case 5:
                            break;
                        case 15:
                            return "15m";
                        case 30:
                            return "30m";
                        case 60:
                            return "1H";
                        case 120:
                            return "2H";
                        case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                            return "4H";
                        case 360:
                            return "6H";
                        case 720:
                            return "12H";
                        case 1440:
                            return "1D";
                        case 2880:
                            return "2D";
                        case 4320:
                            return "3D";
                        case 7200:
                            return "5D";
                        case 10080:
                            return "1W";
                        case 44640:
                            return "1M";
                        case 133920:
                            return "3M";
                        case 267840:
                            return "6M";
                        default:
                            return "1Y";
                    }
                }
                return "5m";
            }
        }
        return "1m";
    }

    private pEF() {
    }

    public final java.lang.String KWHzl() {
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        if (interfaceC46557tYt != null) {
            interfaceC46557tYt.EZpvd();
        }
        InterfaceC46557tYt interfaceC46557tYt2 = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.Integer numValueOf = interfaceC46557tYt2 != null ? java.lang.Integer.valueOf(interfaceC46557tYt2.EZpvd()) : null;
        return ((numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 1)) ? "utc" : "bj";
    }

    public final java.lang.String OLrzqt(int i) {
        java.lang.String strCopydefault = copydefault(i);
        if (i < 360) {
            return strCopydefault;
        }
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        if (interfaceC46557tYt != null && interfaceC46557tYt.EZpvd() == 2) {
            return strCopydefault;
        }
        return strCopydefault + "utc";
    }
}
