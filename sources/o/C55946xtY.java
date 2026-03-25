package o;

import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.bot.data.BizSimpleInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55946xtY {
    public static final C55946xtY OLrzqt = new C55946xtY();

    private C55946xtY() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [20=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (str2.hashCode()) {
            case -2027980370:
                if (str2.equals("MARGIN")) {
                    return AhwBna(str);
                }
                return false;
            case 2552066:
                if (str2.equals("SPOT")) {
                    return valueOf(str);
                }
                return false;
            case 2558355:
                if (str2.equals("SWAP")) {
                    return djBIcL(str);
                }
                return false;
            case 214415088:
                if (str2.equals("FUTURES")) {
                    return EZpvd(str);
                }
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1402017003:
                return !str.equals("contract_dca") ? "SPOT" : "SWAP";
            case -1086683216:
                if (!str.equals("signal_bot")) {
                }
                break;
            case -557961837:
                if (str.equals("smart_arbitrage")) {
                }
                break;
            case -512749997:
                if (!str.equals("contract_grid")) {
                }
                break;
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        xOU xouWlaJM;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strOLrzqt = (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
        if (KWHzl(strOLrzqt == null ? "" : strOLrzqt).contains(str != null ? str : "")) {
            return strOLrzqt;
        }
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 2552066) {
            if (str.equals("SPOT")) {
                return "grid";
            }
            return null;
        }
        if (iHashCode != 2558355) {
            if (iHashCode != 214415088 || !str.equals("FUTURES")) {
                return null;
            }
        } else if (!str.equals("SWAP")) {
            return null;
        }
        return "contract_grid";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "BotCategoryGrid")) {
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -2027980370:
                        if (str2.equals("MARGIN")) {
                            return "grid";
                        }
                        break;
                    case 2552066:
                        if (!str2.equals("SPOT")) {
                        }
                        break;
                    case 2558355:
                        if (str2.equals("SWAP")) {
                            return "contract_grid";
                        }
                        break;
                    case 214415088:
                        if (!str2.equals("FUTURES")) {
                        }
                        break;
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "BotCategoryDCA")) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT")) {
                return "spot_dca";
            }
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP")) {
                return "contract_dca";
            }
        }
        return "";
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentDbNXlk;
        java.lang.String instId;
        java.lang.String instId2;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.lang.String instId3;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument bizInstrumentCopydefault = null;
        BizInstrument bizInstrumentCopydefault2 = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.copydefault(str3, str2) : null;
        if (bizInstrumentCopydefault2 == null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            bizInstrumentCopydefault2 = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.copydefault(str3, null) : null;
        }
        if (!EZpvd(str, bizInstrumentCopydefault2)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt3 != null && (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt3.OLrzqt(str3)) != null) {
                bizInstrumentCopydefault = abstractC54531xLwOLrzqt2.copydefault();
            }
            if (!EZpvd(str, bizInstrumentCopydefault)) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt4 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt4.OLrzqt(str3)) != null && (bizInstrumentDbNXlk = abstractC54531xLwOLrzqt.DbNXlk("BTC-USDT")) != null && (instId = bizInstrumentDbNXlk.getInstId()) != null) {
                    return instId;
                }
            } else if (bizInstrumentCopydefault != null && (instId2 = bizInstrumentCopydefault.getInstId()) != null) {
                return instId2;
            }
        } else if (bizInstrumentCopydefault2 != null && (instId3 = bizInstrumentCopydefault2.getInstId()) != null) {
            return instId3;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull java.lang.String str, BizSimpleInfo bizSimpleInfo, AbstractC54531xLw abstractC54531xLw, ParamBuilder paramBuilder) {
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String instFamily;
        BizInstrument bizInstrumentDbNXlk;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        xOU xouWlaJM;
        CountDownInfo countDownInfo;
        Intrinsics.checkNotNullParameter(str, "");
        if (bizSimpleInfo == null || (instId = bizSimpleInfo.getInstId()) == null) {
            instId = "";
        }
        if (bizSimpleInfo == null || (instType = bizSimpleInfo.getInstType()) == null) {
            instType = "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument bizInstrumentCopydefault = null;
        if (copydefault(str, instType)) {
            bizInstrumentDbNXlk = abstractC54531xLw != null ? abstractC54531xLw.valueOf(instId) : null;
        } else {
            if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType)) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instId)) == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null) {
                instFamily = "";
            }
            if (abstractC54531xLw != null) {
                bizInstrumentDbNXlk = abstractC54531xLw.DbNXlk(instFamily);
            }
        }
        if (bizInstrumentDbNXlk == null || !EZpvd(str, bizInstrumentDbNXlk)) {
            java.lang.String strCopydefault = TaskDescription.AEQbTJ(instId).copydefault();
            java.util.Locale locale = java.util.Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = strCopydefault.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            bizInstrumentDbNXlk = abstractC54531xLw != null ? abstractC54531xLw.valueOf(OLrzqt(str, upperCase, abstractC54531xLw.AYXKKw())) : null;
        }
        if (bizInstrumentDbNXlk == null || (countDownInfo = bizInstrumentDbNXlk.getCountDownInfo()) == null || !countDownInfo.isInvalidForBot()) {
            bizInstrumentCopydefault = bizInstrumentDbNXlk;
        } else {
            if (paramBuilder != null) {
                paramBuilder.setCountDown(java.lang.Boolean.TRUE);
            }
            if (abstractC54531xLw != null) {
                bizInstrumentCopydefault = abstractC54531xLw.copydefault();
            }
        }
        if (bizInstrumentCopydefault != null && interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.KWHzl(bizInstrumentCopydefault);
        }
        if (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) {
            return;
        }
        xouWlaJM.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [124=7] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(java.lang.String str, BizInstrument bizInstrument) {
        if (bizInstrument != null && bizInstrument.isPreMarketPair()) {
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smart_iceberg") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "twap") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_dca");
        }
        switch (str.hashCode()) {
            case -1402017003:
                if (str.equals("contract_dca")) {
                    if (bizInstrument != null && bizInstrument.isPositiveContract() && !bizInstrument.isUSDUMContract()) {
                    }
                    break;
                }
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getQuoteSymbol() : null), (java.lang.Object) "USDT")) {
                        if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getQuoteSymbol() : null), (java.lang.Object) "USDC")) {
                            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getQuoteSymbol() : null), (java.lang.Object) "USD")) {
                            }
                        }
                    }
                    break;
                }
                break;
            case -1086683216:
                if (!str.equals("signal_bot")) {
                }
                if (bizInstrument != null && !bizInstrument.isUSDUMContract()) {
                }
                break;
            case -512749997:
                if (str.equals("contract_grid")) {
                    if (bizInstrument == null || !bizInstrument.isPositiveContract() || bizInstrument.isUSDUMContract()) {
                        if (bizInstrument != null && Intrinsics.EZpvd(bizInstrument.isNegativeContract(), java.lang.Boolean.TRUE) && !Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES")) {
                        }
                    }
                    break;
                }
                break;
            case -392358507:
                if (!str.equals("lvf_sell")) {
                }
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument == null ? bizInstrument.getInstFamily() : null), (java.lang.Object) "BTC-USDT")) {
                    if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstFamily() : null), (java.lang.Object) "ETH-USDT")) {
                    }
                }
                break;
            case 541516771:
                if (!str.equals("lvf_buy")) {
                }
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument == null ? bizInstrument.getInstFamily() : null), (java.lang.Object) "BTC-USDT")) {
                }
                break;
            case 1165749981:
                if (str.equals("recurring")) {
                    break;
                }
                break;
            case 1485620813:
                if (str.equals("dcd_bot")) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    java.util.ArrayList<java.lang.String> arrayListValues = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.values() : null;
                    if (arrayListValues != null && !arrayListValues.isEmpty()) {
                        break;
                    } else if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstFamily() : null), (java.lang.Object) "BTC-USDT")) {
                        if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstFamily() : null), (java.lang.Object) "ETH-USDT")) {
                            break;
                        }
                    }
                }
                break;
            case 1780188297:
                if (!str.equals("arbitrage")) {
                }
                if (bizInstrument != null) {
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean valueOf(java.lang.String str) {
        switch (str.hashCode()) {
            case -1831183611:
                return str.equals("spot_dca");
            case -1574173039:
                if (!str.equals("infinite_grid")) {
                }
                break;
            case -1216369070:
                if (!str.equals("smart_portfolio")) {
                }
                break;
            case -1148661171:
                if (!str.equals("smart_iceberg")) {
                }
                break;
            case -591806012:
                if (!str.equals("moon_grid")) {
                }
                break;
            case -392358507:
                if (!str.equals("lvf_sell")) {
                }
                break;
            case 3181382:
                if (!str.equals("grid")) {
                }
                break;
            case 3573234:
                if (!str.equals("twap")) {
                }
                break;
            case 541516771:
                if (!str.equals("lvf_buy")) {
                }
                break;
            case 1165749981:
                if (!str.equals("recurring")) {
                }
                break;
            case 1485620813:
                if (!str.equals("dcd_bot")) {
                }
                break;
            case 1629187779:
                if (!str.equals("iceberg")) {
                }
                break;
            case 1780188297:
                if (!str.equals("arbitrage")) {
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean djBIcL(java.lang.String str) {
        switch (str.hashCode()) {
            case -1402017003:
                return str.equals("contract_dca");
            case -1148661171:
                if (!str.equals("smart_iceberg")) {
                }
                break;
            case -1086683216:
                if (!str.equals("signal_bot")) {
                }
                break;
            case -512749997:
                if (!str.equals("contract_grid")) {
                }
                break;
            case 3573234:
                if (!str.equals("twap")) {
                }
                break;
            case 1629187779:
                if (!str.equals("iceberg")) {
                }
                break;
            case 1780188297:
                if (!str.equals("arbitrage")) {
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(java.lang.String str) {
        switch (str.hashCode()) {
            case -1148661171:
                return str.equals("smart_iceberg");
            case -512749997:
                if (!str.equals("contract_grid")) {
                }
                break;
            case 3573234:
                if (!str.equals("twap")) {
                }
                break;
            case 1629187779:
                if (str.equals("iceberg")) {
                }
                break;
            case 1780188297:
                if (!str.equals("arbitrage")) {
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AhwBna(java.lang.String str) {
        switch (str.hashCode()) {
            case -1148661171:
                return str.equals("smart_iceberg");
            case 3573234:
                if (!str.equals("twap")) {
                }
                break;
            case 1629187779:
                if (str.equals("iceberg")) {
                }
                break;
            case 1780188297:
                if (!str.equals("arbitrage")) {
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [196=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r6.equals("recurring") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r6.equals("lvf_buy") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.equals("twap") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r6.equals("grid") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r6.equals("lvf_sell") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r6.equals("moon_grid") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r6.equals("signal_bot") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        if (r6.equals("smart_iceberg") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        if (r6.equals("smart_portfolio") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b7, code lost:
    
        if (r6.equals("contract_dca") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
    
        if (r6.equals("infinite_grid") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        if (r6.equals("spot_dca") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return o.yDY.gEmmrt("SPOT", "SWAP", "FUTURES", "MARGIN");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return o.C56402yEa.EZpvd("SWAP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return o.C56402yEa.EZpvd("SPOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r6.equals("iceberg") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r6.equals("dcd_bot") == false) goto L61;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1831183611:
                break;
            case -1574173039:
                break;
            case -1418042064:
                if (str.equals("ai_bot")) {
                    return yDY.gEmmrt("SPOT", "SWAP");
                }
                return yDY.gEmmrt("SPOT", "SWAP", "FUTURES", "MARGIN", "OPTION");
            case -1402017003:
                break;
            case -1216369070:
                break;
            case -1148661171:
                break;
            case -1086683216:
                break;
            case -591806012:
                break;
            case -557961837:
                if (str.equals("smart_arbitrage")) {
                    return yDY.gEmmrt("SPOT", "SWAP", "MARGIN");
                }
                return yDY.gEmmrt("SPOT", "SWAP", "FUTURES", "MARGIN", "OPTION");
            case -512749997:
                if (str.equals("contract_grid")) {
                    return yDY.gEmmrt("SWAP", "FUTURES");
                }
                return yDY.gEmmrt("SPOT", "SWAP", "FUTURES", "MARGIN", "OPTION");
            case -392358507:
                break;
            case 3181382:
                break;
            case 3573234:
                break;
            case 541516771:
                break;
            case 1165749981:
                break;
            case 1485620813:
                break;
            case 1629187779:
                break;
            default:
                return yDY.gEmmrt("SPOT", "SWAP", "FUTURES", "MARGIN", "OPTION");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1831183611:
                return str.equals("spot_dca");
            case -1402017003:
                if (!str.equals("contract_dca")) {
                }
                break;
            case -512749997:
                if (!str.equals("contract_grid")) {
                }
                break;
            case 3181382:
                if (!str.equals("grid")) {
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1216369070:
                return str.equals("smart_portfolio");
            case -557961837:
                if (str.equals("smart_arbitrage")) {
                }
                break;
            case -392358507:
                if (!str.equals("lvf_sell")) {
                }
                break;
            case 541516771:
                if (!str.equals("lvf_buy")) {
                }
                break;
            case 1165749981:
                if (!str.equals("recurring")) {
                }
                break;
            case 1485620813:
                if (!str.equals("dcd_bot")) {
                }
                break;
            case 1780188297:
                if (!str.equals("arbitrage")) {
                }
                break;
        }
    }

    public final java.util.List<java.lang.String> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smart_arbitrage") ? C56402yEa.EZpvd("SPOT") : yDY.AhwBna();
    }
}
