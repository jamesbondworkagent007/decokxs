package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pFS {
    public static final pFS KWHzl = new pFS();
    public static final java.lang.String copydefault = "KlineUtilsManager";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt(int i) {
        if (i != -1) {
            if (i == 0) {
                return "1S";
            }
            if (i != 1) {
                if (i == 3) {
                    return "3";
                }
                if (i != 5) {
                    switch (i) {
                        case 5:
                            break;
                        case 15:
                            return "15";
                        case 30:
                            return "30";
                        case 60:
                            return "60";
                        case 120:
                            return "120";
                        case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                            return "240";
                        case 360:
                            return "360";
                        case 720:
                            return "720";
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
                return "5";
            }
        }
        return "1";
    }

    private pFS() {
    }

    public final boolean KWHzl(androidx.fragment.app.Fragment fragment) {
        if (fragment instanceof ViewOnClickListenerC38981pjg) {
            return false;
        }
        return pEI.EZpvd.AEQbTJ();
    }

    public final boolean AEQbTJ() {
        return !pEI.EZpvd.AEQbTJ() && !Intrinsics.EZpvd(((xND) C43251rlk.copydefault(xND.class)).copydefault(), java.lang.Boolean.TRUE) && Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getChartTag(), (java.lang.Object) "sp_timeinterval_okx_pro") && C36246oUr.copydefault().QKVWgx() == null;
    }

    public final boolean valueOf() {
        java.lang.Boolean boolCopydefault;
        java.lang.Boolean boolOLrzqt;
        xND xnd = (xND) C43251rlk.OLrzqt(xND.class);
        boolean zBooleanValue = (xnd == null || (boolOLrzqt = xnd.OLrzqt()) == null) ? false : boolOLrzqt.booleanValue();
        boolean zBooleanValue2 = (xnd == null || (boolCopydefault = xnd.copydefault()) == null) ? false : boolCopydefault.booleanValue();
        if (pEI.EZpvd.AEQbTJ()) {
            return false;
        }
        return zBooleanValue || zBooleanValue2;
    }

    public final boolean djBIcL() {
        java.lang.Boolean boolCopydefault;
        java.lang.Boolean boolOLrzqt;
        xND xnd = (xND) C43251rlk.OLrzqt(xND.class);
        return ((xnd == null || (boolOLrzqt = xnd.OLrzqt()) == null) ? false : boolOLrzqt.booleanValue()) || ((xnd == null || (boolCopydefault = xnd.copydefault()) == null) ? false : boolCopydefault.booleanValue());
    }

    public final boolean KWHzl() {
        java.lang.Boolean boolCopydefault;
        java.lang.Boolean boolOLrzqt;
        xND xnd = (xND) C43251rlk.OLrzqt(xND.class);
        boolean zBooleanValue = (xnd == null || (boolOLrzqt = xnd.OLrzqt()) == null) ? false : boolOLrzqt.booleanValue();
        boolean zBooleanValue2 = (xnd == null || (boolCopydefault = xnd.copydefault()) == null) ? false : boolCopydefault.booleanValue();
        if (pDN.AEQbTJ.OLrzqt()) {
            return zBooleanValue || zBooleanValue2;
        }
        return false;
    }

    public final boolean gEmmrt() {
        java.lang.Boolean boolCopydefault;
        java.lang.Boolean boolOLrzqt;
        xND xnd = (xND) C43251rlk.OLrzqt(xND.class);
        boolean zBooleanValue = (xnd == null || (boolOLrzqt = xnd.OLrzqt()) == null) ? false : boolOLrzqt.booleanValue();
        boolean zBooleanValue2 = (xnd == null || (boolCopydefault = xnd.copydefault()) == null) ? false : boolCopydefault.booleanValue();
        if (pDN.AEQbTJ.KWHzl()) {
            return zBooleanValue || zBooleanValue2;
        }
        return false;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C36246oUr.copydefault().fJNWhG("pro_mode");
        C36246oUr.copydefault().values("sp_timeinterval_okx_pro");
        new oWH().OLrzqt(str, str2);
    }

    public final boolean KWHzl(@NotNull MarketCoinInfo marketCoinInfo) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null) : null;
        return minSuggestedInstrument$default != null && Intrinsics.EZpvd((java.lang.Object) minSuggestedInstrument$default.getInstType(), (java.lang.Object) "SPOT") && Intrinsics.EZpvd((java.lang.Object) minSuggestedInstrument$default.getBizContinuousStatus(), (java.lang.Object) "1");
    }

    public final boolean OLrzqt(@NotNull MarketCoinInfo marketCoinInfo) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null) : null;
        return minSuggestedInstrument$default != null && Intrinsics.EZpvd((java.lang.Object) minSuggestedInstrument$default.getInstType(), (java.lang.Object) "SPOT") && Intrinsics.EZpvd((java.lang.Object) minSuggestedInstrument$default.getBizPreQuoteStatus(), (java.lang.Object) "ACTIVE");
    }

    public final boolean AEQbTJ(@NotNull MarketCoinInfo marketCoinInfo) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null) : null;
        if (minSuggestedInstrument$default != null && minSuggestedInstrument$default.getCountDownInfo() != null) {
            CountDownInfo countDownInfo = minSuggestedInstrument$default.getCountDownInfo();
            Intrinsics.copydefault(countDownInfo);
            if (Intrinsics.EZpvd((java.lang.Object) countDownInfo.getType(), (java.lang.Object) "0")) {
                CountDownInfo countDownInfo2 = minSuggestedInstrument$default.getCountDownInfo();
                Intrinsics.copydefault(countDownInfo2);
                if (!countDownInfo2.countDownTimeExpire()) {
                }
            }
            return true;
        }
        return false;
    }

    public final float EZpvd(int i) {
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(i), 14)) {
            return 18.0f;
        }
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i), 14) && C33129mqd.valueOf(java.lang.Integer.valueOf(i), 20)) {
            return 16.0f;
        }
        return C33129mqd.valueOf(java.lang.Integer.valueOf(i), 26) & C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i), 20) ? 14.0f : 12.0f;
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().zLjUOn().getDataSources().get("ds0");
        if (dataSource != null) {
            return C33129mqd.gEmmrt(str, dataSource.gEmmrt() >= 1 ? C33129mqd.gEmmrt(java.lang.Double.valueOf(dataSource.AEQbTJ.get(dataSource.DbNXlk() - 1).copydefault())) : "");
        }
        return true;
    }

    public final boolean EZpvd() {
        return (C55608xnE.OLrzqt() || pWO.KWHzl().EZpvd()) ? false : true;
    }

    public final boolean AEQbTJ(java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SPOT") : null;
        xLF xlf = abstractC54531xLwOLrzqt instanceof xLF ? (xLF) abstractC54531xLwOLrzqt : null;
        if (xlf != null) {
            if (str == null) {
                str = "";
            }
            if (xlf.KWHzl(str) && ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames()) {
                return true;
            }
        }
        return false;
    }

    public final boolean copydefault() {
        return C55608xnE.OLrzqt();
    }

    public final boolean OLrzqt() {
        return C55608xnE.OLrzqt();
    }
}
