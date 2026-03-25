package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import java.util.Date;
import o.C35964oKf;

/* JADX INFO: renamed from: o.pHv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37980pHv {
    public static final C37980pHv OLrzqt = new C37980pHv();

    private C37980pHv() {
    }

    public final java.lang.String AEQbTJ(int i) {
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        boolean z = interfaceC46557tYt != null && interfaceC46557tYt.EZpvd() == 2;
        switch (i) {
            case 5:
                return "5m";
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
                return z ? "6H" : "6Hutc";
            case 720:
                return z ? "12H" : "12Hutc";
            case 1440:
                return z ? "1D" : "1Dutc";
            case 2880:
                return z ? "2D" : "2Dutc";
            case 4320:
                return z ? "3D" : "3Dutc";
            case 7200:
                return z ? "5D" : "5Dutc";
            case 10080:
                return z ? "1W" : "1Wutc";
            case 44640:
                return z ? "1M" : "1Mutc";
            case 133920:
                return z ? "3M" : "3Mutc";
            default:
                return "";
        }
    }

    public final java.lang.String KWHzl(java.lang.Long l) {
        if (l == null) {
            return "";
        }
        long j = 1000;
        long jCurrentTimeMillis = (java.lang.System.currentTimeMillis() / j) - (l.longValue() / j);
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        if (jCurrentTimeMillis < 60) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.zSsVtY), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(jCurrentTimeMillis))));
        }
        if (jCurrentTimeMillis < 3600) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.DGUQLIdZmdUa), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(jCurrentTimeMillis / ((long) 60)))));
        }
        if (jCurrentTimeMillis < 86400) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.fBE), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(jCurrentTimeMillis / ((long) IMarketApiService.SIXTY_MINUTES)))));
        }
        if (jCurrentTimeMillis < 604800) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.DTg), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(jCurrentTimeMillis / ((long) RemoteMessageConst.DEFAULT_TTL)))));
        }
        return pTA.formatSimpleDateTime$default(new Date(l.longValue()), null, 1, null);
    }
}
