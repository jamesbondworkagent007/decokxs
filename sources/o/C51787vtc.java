package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.vtc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51787vtc {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.vtc$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vtc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [21=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> AEQbTJ() {
        xOR xorCopydefault;
        xOU xouWlaJM;
        java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map = new java.util.HashMap<>();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        java.lang.String strOLrzqt = (interfaceC54581xNrCopydefault == null || (xouWlaJM = interfaceC54581xNrCopydefault.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
        if (strOLrzqt != null) {
            switch (strOLrzqt.hashCode()) {
                case -1831183611:
                    if (!strOLrzqt.equals("spot_dca")) {
                        pUU.EZpvd("BotTradeHeaderPresenter", "this type do not need to config !!");
                    } else {
                        map.put("bizType", yDY.gEmmrt("Watchlist", "SPOT"));
                    }
                    break;
                case -1402017003:
                    if (strOLrzqt.equals("contract_dca")) {
                        map.put("bizType", yDY.gEmmrt("Watchlist", "SWAP"));
                        map.put("quoteSymbol", yDY.gEmmrt("USDT", "USDC", "linear"));
                        InterfaceC49508upq.Companion.OLrzqt(map);
                        break;
                    }
                    break;
                case -1216369070:
                    if (strOLrzqt.equals("smart_portfolio")) {
                        map.put("bizType", yDY.gEmmrt("Watchlist", "SPOT"));
                        map.put("quoteSymbol", yDY.gEmmrt("USDT", "USDC"));
                        break;
                    }
                    break;
                case -1148661171:
                    if (strOLrzqt.equals("smart_iceberg")) {
                        map.put("bizType", yDY.gEmmrt("Watchlist", "SPOT", "SWAP", "FUTURES", "pre_market"));
                        break;
                    }
                    break;
                case -591806012:
                    if (!strOLrzqt.equals("moon_grid")) {
                    }
                    break;
                case -512749997:
                    if (strOLrzqt.equals("contract_grid")) {
                        map.put("bizType", yDY.gEmmrt("Watchlist", "SWAP", "FUTURES"));
                        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                        if (interfaceC54581xNrOLrzqt == null || (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) == null || !xorCopydefault.gEmmrt()) {
                            map.put("quoteSymbol", yDY.gEmmrt("USDT", "USDC", "USD", "linear"));
                            map.put("usdBizFilter", C56402yEa.EZpvd("SWAP"));
                        } else {
                            map.put("quoteSymbol", yDY.gEmmrt("USDT", "USDC", "linear"));
                        }
                        break;
                    }
                    break;
                case 3181382:
                    if (!strOLrzqt.equals("grid")) {
                    }
                    break;
                case 3573234:
                    if (!strOLrzqt.equals("twap")) {
                    }
                    break;
                case 1165749981:
                    if (strOLrzqt.equals("recurring")) {
                        map.put("bizType", yDY.gEmmrt("Watchlist", "SPOT"));
                        map.put("quoteSymbol", yDY.gEmmrt("USDT", "USDC"));
                        break;
                    }
                    break;
                case 1485620813:
                    if (strOLrzqt.equals("dcd_bot")) {
                        map.put("bizType", yDY.gEmmrt("Watchlist", "SPOT"));
                        map.put("quoteSymbol", C56402yEa.EZpvd("USDT"));
                        map.put("coinWhiteList", copydefault());
                        break;
                    }
                    break;
                case 1629187779:
                    if (!strOLrzqt.equals("iceberg")) {
                    }
                    break;
            }
        }
        return map;
    }

    public final java.util.List<java.lang.String> copydefault() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.util.ArrayList<java.lang.String> arrayListValues = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.values() : null;
        return (arrayListValues == null || arrayListValues.isEmpty()) ? yDY.gEmmrt("BTC-USDT", "ETH-USDT") : arrayListValues;
    }
}
