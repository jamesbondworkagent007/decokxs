package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.trade.setting.setting_data.SettingData;
import com.okinc.unify_trade.trade.setting.setting_data.SettingType;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C38307pTy;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xPo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54632xPo {
    public static final java.util.Map<java.lang.String, java.lang.String> AYXKKw;
    public static final java.util.Map<java.lang.String, java.lang.Integer> EZpvd = C56424yEw.gEmmrt(C56390yDp.OLrzqt("0", java.lang.Integer.valueOf(C55688xof.Application.RAaltf)), C56390yDp.OLrzqt("2", java.lang.Integer.valueOf(C55688xof.Application.onActivityResult)), C56390yDp.OLrzqt("1", java.lang.Integer.valueOf(C55688xof.Application.RgaQzq)));
    public static final java.util.Map<java.lang.String, java.lang.Integer> AhwBna = C56424yEw.gEmmrt(C56390yDp.OLrzqt("0", java.lang.Integer.valueOf(C55688xof.Application.RAaltf)), C56390yDp.OLrzqt("2", java.lang.Integer.valueOf(C55688xof.Application.onActivityResult)), C56390yDp.OLrzqt("1", java.lang.Integer.valueOf(C55688xof.Application.RgaQzq)));
    public static final java.util.Map<java.lang.String, java.lang.Integer> gEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("0", java.lang.Integer.valueOf(C55688xof.Application.RAaltf)), C56390yDp.OLrzqt("1", java.lang.Integer.valueOf(C55688xof.Application.RgaQzq)));
    public static final java.util.Map<java.lang.String, java.lang.Integer> AEQbTJ = C56424yEw.gEmmrt(C56390yDp.OLrzqt("0", java.lang.Integer.valueOf(C55688xof.Application.fACtfg)), C56390yDp.OLrzqt(MultiTransferSignData.DEFAULT_INTERVAL, java.lang.Integer.valueOf(C55688xof.Application.flag)));
    public static final java.util.Map<java.lang.String, java.lang.Integer> KWHzl = C56424yEw.gEmmrt(C56390yDp.OLrzqt("long_short_mode", java.lang.Integer.valueOf(C55688xof.Application.NonUiContext)), C56390yDp.OLrzqt("net_mode", java.lang.Integer.valueOf(C55688xof.Application.NonNull)));
    public static final java.util.Map<java.lang.String, java.lang.Integer> OLrzqt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("0", java.lang.Integer.valueOf(C55688xof.Application.setDrawerArrowDrawable)), C56390yDp.OLrzqt("1", java.lang.Integer.valueOf(C55688xof.Application.IntDef)));
    public static final java.util.Map<java.lang.String, java.lang.Integer> copydefault = C56424yEw.gEmmrt(C56390yDp.OLrzqt("autonomy", java.lang.Integer.valueOf(C55688xof.Application.getFlagsMask)), C56390yDp.OLrzqt("automatic", java.lang.Integer.valueOf(C55688xof.Application.InspectablePropertyValueType)));

    /* JADX INFO: renamed from: o.xPo$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SettingType.values().length];
            try {
                iArr[SettingType.TRADING_UNIT_FUTURES_SWAP_USDT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SettingType.TRADING_UNIT_FUTURES_SWAP_COIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SettingType.TRADING_UNIT_OPTIONS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SettingType.POSITION_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SettingType.CURRENCY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[SettingType.GREEKSUNIT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[SettingType.TRADING_LEGAL_UNIT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[SettingType.TRADE_ISO_TYPE_FUTURE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[SettingType.LIGUIDATION_GEAR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            KWHzl = iArr;
        }
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (!C33129mqd.OLrzqt((java.lang.CharSequence) str) || str.equals(MultiTransferSignData.DEFAULT_INTERVAL)) ? "3" : str;
    }

    static {
        xMR xmr = xMR.copydefault;
        BigDecimal bigDecimalCopydefault = C33129mqd.copydefault("300");
        C38307pTy.Application application = C38307pTy.Companion;
        AYXKKw = C56424yEw.gEmmrt(C56390yDp.OLrzqt("3", xMR.formatICUPercent$default(xmr, bigDecimalCopydefault, null, application.copydefault(0), null, null, null, 58, null)), C56390yDp.OLrzqt("2", xMR.formatICUPercent$default(xmr, C33129mqd.copydefault("200"), null, application.copydefault(0), null, null, null, 58, null)), C56390yDp.OLrzqt("1.5", xMR.formatICUPercent$default(xmr, C33129mqd.copydefault("150"), null, application.copydefault(0), null, null, null, 58, null)));
    }

    public static final java.util.ArrayList<SettingData> OLrzqt(@NotNull SettingType settingType) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(settingType, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            return new java.util.ArrayList<>();
        }
        switch (Application.KWHzl[settingType.ordinal()]) {
            case 1:
                java.util.Map<java.lang.String, java.lang.Integer> map = AhwBna;
                java.lang.String strIwGUEr = newProxyInstance.iwGUEr();
                return copydefault(map, strIwGUEr != null ? strIwGUEr : "");
            case 2:
                java.util.Map<java.lang.String, java.lang.Integer> map2 = EZpvd;
                java.lang.String strOLrzqt = newProxyInstance.OLrzqt();
                return copydefault(map2, strOLrzqt != null ? strOLrzqt : "");
            case 3:
                return copydefault(gEmmrt, newProxyInstance.getFieldNames());
            case 4:
                java.util.Map<java.lang.String, java.lang.Integer> map3 = KWHzl;
                java.lang.String strAuCTelauCTel = newProxyInstance.AuCTelauCTel();
                return copydefault(map3, strAuCTelauCTel != null ? strAuCTelauCTel : "");
            case 5:
                java.util.Map<java.lang.String, java.lang.Integer> map4 = AEQbTJ;
                java.lang.String value = newProxyInstance.KWHzl().getValue();
                return copydefault(map4, value != null ? value : "");
            case 6:
                return copydefault(OLrzqt, newProxyInstance.AEQbTJ());
            case 7:
                return AEQbTJ();
            case 8:
                return copydefault(copydefault, newProxyInstance.QOLQEE());
            case 9:
                java.util.Map<java.lang.String, java.lang.String> map5 = AYXKKw;
                java.lang.String strORxRYg = newProxyInstance.ORxRYg();
                if (strORxRYg == null) {
                    strORxRYg = "3";
                }
                return KWHzl(map5, OLrzqt(strORxRYg));
            default:
                return new java.util.ArrayList<>();
        }
    }

    public static final java.util.ArrayList<SettingData> copydefault(java.util.Map<java.lang.String, java.lang.Integer> map, java.lang.String str) {
        java.util.ArrayList<SettingData> arrayList = new java.util.ArrayList<>();
        for (Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            arrayList.add(new SettingData(C33070mpX.AYXKKw(entry.getValue().intValue()), key, Intrinsics.EZpvd((java.lang.Object) key, (java.lang.Object) str)));
        }
        return arrayList;
    }

    public static final java.util.ArrayList<SettingData> KWHzl(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        java.util.ArrayList<SettingData> arrayList = new java.util.ArrayList<>();
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            arrayList.add(new SettingData(entry.getValue(), key, Intrinsics.EZpvd((java.lang.Object) key, (java.lang.Object) str)));
        }
        return arrayList;
    }

    public static final java.util.ArrayList<SettingData> AEQbTJ() {
        xOW newProxyInstance;
        java.lang.String currencyId;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            return new java.util.ArrayList<>();
        }
        ValuationCurrencyData value = newProxyInstance.bG_().getValue();
        if (value == null || (currencyId = value.getCurrencyId()) == null) {
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList<SettingData> arrayList = new java.util.ArrayList<>();
        for (ValuationCurrencyData valuationCurrencyData : newProxyInstance.bF_()) {
            arrayList.add(new SettingData(valuationCurrencyData.getDisplayName(), valuationCurrencyData.getCurrencyId(), C33129mqd.OLrzqt(valuationCurrencyData.getCurrencyId(), currencyId)));
        }
        return arrayList;
    }
}
