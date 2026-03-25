package o;

import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.trade.model.IndexSourceData;
import com.okinc.unify_trade.trade.model.WatchMarketData;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xUW {
    public static final xUW KWHzl = new xUW();

    private xUW() {
    }

    public final java.lang.String copydefault(@NotNull IndexSourceData indexSourceData) {
        java.lang.String strValueOf;
        Intrinsics.checkNotNullParameter(indexSourceData, "");
        java.lang.String strCopydefault = TaskDescription.AEQbTJ(indexSourceData.getInstId()).copydefault();
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (strValueOf = interfaceC54581xNrOLrzqt.valueOf(upperCase)) == null) ? "" : strValueOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r3.equals("FUTURES") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r3.equals("SWAP") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r3.equals("SPOT") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r3.equals("OPTION") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r2 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        r2 = r2.getInstFamily();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r2 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r1 = o.AbstractC54531xLw.createTradeConverterWithIndex$default(r1, r2, null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r2 = r11.getTickerPrice();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r2 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        r1 = r1.AhwBna(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        r2 = r11.getContractVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r2 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r2 = r1.djBIcL(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
    
        r11 = r11.getContractVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        if (r11 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r11 = r1.copydefault(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        if (r11 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ad, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ae, code lost:
    
        if (r2 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
    
        r11 = r2.OLrzqt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b5, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        if (r2 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b8, code lost:
    
        r9 = r2.gEmmrt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
    
        return r11 + " " + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d7, code lost:
    
        if (r3.equals("MARGIN") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00da, code lost:
    
        r11 = r11.getContractVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
    
        if (r11 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e1, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        return o.C33129mqd.gEmmrt(o.pTB.OLrzqt((java.lang.Object) r0).setScale(0, java.math.RoundingMode.UP));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(@NotNull MarketDataSource marketDataSource) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strGEmmrt = null;
        if (marketDataSource instanceof WatchMarketData) {
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.djBIcL(marketDataSource.getInstType()) : null;
        } else if (interfaceC54581xNrOLrzqt != null) {
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketDataSource.getInstType());
        }
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrOLrzqt, marketDataSource.getInstType(), marketDataSource.getInstId(), null, null, 12, null) : null;
        java.lang.String instType = marketDataSource.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                break;
            case 2552066:
                break;
            case 2558355:
                break;
            case 214415088:
                break;
            default:
                return "";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(@NotNull MarketDataSource marketDataSource) {
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        java.lang.String strEZpvd;
        java.lang.String volume;
        java.lang.String strMulS$default;
        C54536xML c54536xMLAYXKKw2;
        java.lang.String futureContractVal;
        java.lang.String strMulS$default2;
        C54536xML c54536xMLAYXKKw3;
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrOLrzqt, marketDataSource.getInstType(), marketDataSource.getInstId(), null, null, 12, null) : null;
        java.lang.String instType = marketDataSource.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                if (!instType.equals("MARGIN")) {
                    return "";
                }
                volume = marketDataSource.getVolume();
                if (volume != null || (strMulS$default = C33129mqd.mulS$default(volume, marketDataSource.getQuoteCcyUSDPrice(), null, null, null, 14, null)) == null) {
                    strMulS$default = "";
                }
                xmwKWHzl = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.KWHzl() : null;
                if (xmwKWHzl != null || (c54536xMLAYXKKw2 = xmwKWHzl.AYXKKw(strMulS$default)) == null || (strEZpvd = c54536xMLAYXKKw2.EZpvd()) == null) {
                    return "";
                }
                return strEZpvd;
            case -1956807563:
                if (!instType.equals("OPTION") || minSuggestedInstrument$default == null || !(minSuggestedInstrument$default instanceof OptionInstrument)) {
                    return "";
                }
                OptionInstrument optionInstrument = (OptionInstrument) minSuggestedInstrument$default;
                java.lang.String strMulS$default3 = C33129mqd.mulS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(marketDataSource.getContractVolume(), optionInstrument.getCtVal(), null, null, null, 14, null), optionInstrument.getCtMult(), null, null, null, 14, null), marketDataSource.getCupTickerPrice(), null, null, null, 14, null);
                xmwKWHzl = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.KWHzl() : null;
                if (xmwKWHzl == null || (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(strMulS$default3)) == null || (strEZpvd = c54536xMLAYXKKw.EZpvd()) == null) {
                    return "";
                }
                return strEZpvd;
            case 2552066:
                if (!instType.equals("SPOT")) {
                    return "";
                }
                volume = marketDataSource.getVolume();
                if (volume != null) {
                    strMulS$default = "";
                    if (interfaceC54581xNrOLrzqt != null) {
                    }
                    return xmwKWHzl != null ? "" : "";
                }
                return strEZpvd;
            case 2558355:
                if (!instType.equals("SWAP")) {
                    return "";
                }
                futureContractVal = minSuggestedInstrument$default == null ? minSuggestedInstrument$default.getFutureContractVal() : null;
                if (minSuggestedInstrument$default == null && minSuggestedInstrument$default.isPositiveContract()) {
                    strMulS$default2 = C33129mqd.mulS$default(C33129mqd.mulS$default(marketDataSource.getContractVolume(), futureContractVal, null, null, null, 14, null), marketDataSource.getCupTickerPrice(), null, null, null, 14, null);
                } else {
                    strMulS$default2 = C33129mqd.mulS$default(marketDataSource.getContractVolume(), futureContractVal, null, null, null, 14, null);
                }
                xmwKWHzl = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.KWHzl() : null;
                if (xmwKWHzl != null || (c54536xMLAYXKKw3 = xmwKWHzl.AYXKKw(strMulS$default2)) == null || (strEZpvd = c54536xMLAYXKKw3.EZpvd()) == null) {
                    return "";
                }
                return strEZpvd;
            case 214415088:
                if (!instType.equals("FUTURES")) {
                    return "";
                }
                if (minSuggestedInstrument$default == null) {
                }
                if (minSuggestedInstrument$default == null) {
                    strMulS$default2 = C33129mqd.mulS$default(marketDataSource.getContractVolume(), futureContractVal, null, null, null, 14, null);
                    if (interfaceC54581xNrOLrzqt != null) {
                    }
                    return xmwKWHzl != null ? "" : "";
                }
                return strEZpvd;
            default:
                return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0185, code lost:
    
        r17 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0187, code lost:
    
        r0 = o.C54536xML.toSafeString$default(o.C54536xML.setNumber$default(r14, r15, "0", r17, null, 8, null).AuCTel(), false, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019b, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a5, code lost:
    
        return java.lang.Double.valueOf(o.C33129mqd.AEQbTJ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r5.equals("FUTURES") == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r5.equals("SWAP") == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r5.equals("SPOT") == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r5.equals("OPTION") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        r2 = r3.getNewProxyInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        r2 = r2.iwGUEr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r4 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r4.isPositiveContract() != true) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r2, (java.lang.Object) "2") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r22.getInstType(), (java.lang.Object) "SWAP") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r22.getInstType(), (java.lang.Object) "FUTURES") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        r0 = r22.getVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
    
        r0 = o.C33129mqd.mulS$default(r22.getVolume(), r22.getTickerPrice(), null, null, null, 14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        r2 = new o.C54536xML();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        return java.lang.Double.valueOf(o.C33129mqd.AEQbTJ(o.C54536xML.toSafeString$default(r2.OLrzqt(r0, "0", r4.getTradeSymbol(), "").AuCTel(), false, 1, null)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ef, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        r2 = r4.getInstFamily();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        if (r2 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f7, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
    
        r2 = o.AbstractC54531xLw.createTradeConverterWithIndex$default(r12, r2, null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        if (r2 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        r3 = r22.getTickerPrice();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0103, code lost:
    
        if (r3 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0105, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
    
        r2 = r2.AhwBna(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010b, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010c, code lost:
    
        if (r2 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010e, code lost:
    
        r0 = r22.getContractVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
    
        if (r0 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        r0 = r2.djBIcL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011c, code lost:
    
        if (r0 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011e, code lost:
    
        r0 = r0.EZpvd("0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0122, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0124, code lost:
    
        r0 = r0.AuCTel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0128, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012a, code lost:
    
        r0 = o.C54536xML.toSafeString$default(r0, false, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012e, code lost:
    
        if (r0 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0138, code lost:
    
        return java.lang.Double.valueOf(o.C33129mqd.AEQbTJ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013f, code lost:
    
        if (r5.equals("MARGIN") == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0143, code lost:
    
        if (r2 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0145, code lost:
    
        r2 = o.C54589xNz.EZpvd.copydefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014c, code lost:
    
        r2 = o.C54589xNz.EZpvd.OLrzqt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0152, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0153, code lost:
    
        if (r14 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        r2 = o.InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(r14, r22.getInstType(), r22.getInstId(), null, null, 12, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016a, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016b, code lost:
    
        r14 = new o.C54536xML();
        r0 = r22.getContractVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0174, code lost:
    
        if (r0 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0176, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0178, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0179, code lost:
    
        if (r2 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017b, code lost:
    
        r0 = r2.getTradeSymbol();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017f, code lost:
    
        if (r0 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0182, code lost:
    
        r17 = r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Double OLrzqt(@NotNull MarketDataSource marketDataSource) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        AbstractC54531xLw abstractC54531xLw;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        boolean z = marketDataSource instanceof WatchMarketData;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = z ? c54589xNz.copydefault() : c54589xNz.OLrzqt();
        if (z) {
            if (interfaceC54581xNrCopydefault != null) {
                abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.djBIcL(marketDataSource.getInstType());
                abstractC54531xLw = abstractC54531xLwOLrzqt;
            }
            abstractC54531xLw = null;
        } else {
            if (interfaceC54581xNrCopydefault != null) {
                abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(marketDataSource.getInstType());
                abstractC54531xLw = abstractC54531xLwOLrzqt;
            }
            abstractC54531xLw = null;
        }
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketDataSource.getInstType(), marketDataSource.getInstId(), null, null, 12, null) : null;
        java.lang.String instType = marketDataSource.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                break;
            case 2552066:
                break;
            case 2558355:
                break;
            case 214415088:
                break;
            default:
                return java.lang.Double.valueOf(C33129mqd.AEQbTJ("0"));
        }
    }

    public final java.lang.Double copydefault(@NotNull MarketDataSource marketDataSource) {
        java.lang.String tradeSymbol;
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        if (Intrinsics.EZpvd((java.lang.Object) marketDataSource.getInstType(), (java.lang.Object) "SPOT")) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = marketDataSource instanceof WatchMarketData ? C54589xNz.EZpvd.copydefault() : C54589xNz.EZpvd.OLrzqt();
            BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketDataSource.getInstType(), marketDataSource.getInstId(), null, null, 12, null) : null;
            C54536xML c54536xML = new C54536xML();
            java.lang.String volume = marketDataSource.getVolume();
            java.lang.String safeString$default = C54536xML.toSafeString$default(C54536xML.setNumber$default(c54536xML, volume == null ? "" : volume, "0", (minSuggestedInstrument$default == null || (tradeSymbol = minSuggestedInstrument$default.getTradeSymbol()) == null) ? "" : tradeSymbol, null, 8, null).AuCTel(), false, 1, null);
            if (safeString$default != null) {
                return java.lang.Double.valueOf(C33129mqd.AEQbTJ(safeString$default));
            }
            return null;
        }
        return java.lang.Double.valueOf(C33129mqd.AEQbTJ("0"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r3.equals("FUTURES") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r3.equals("SWAP") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r1 = r2.getFutureContractVal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r2.isPositiveContract() != true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r0 = o.C33129mqd.mulS$default(o.C33129mqd.mulS$default(r20.getContractVolume(), r4, null, null, null, 14, null), r20.getCupTickerPrice(), null, null, null, 14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        r0 = o.C33129mqd.mulS$default(r20.getContractVolume(), r4, null, null, null, 14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (r3.equals("SPOT") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        if (r3.equals("MARGIN") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return o.C33129mqd.AEQbTJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return o.C33129mqd.AEQbTJ(o.C33129mqd.mulS$default(r20.getContractVolume(), r20.getCupTickerPrice(), null, null, null, 14, null));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double KWHzl(@NotNull MarketDataSource marketDataSource) {
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = marketDataSource instanceof WatchMarketData ? C54589xNz.EZpvd.copydefault() : C54589xNz.EZpvd.OLrzqt();
        java.lang.String futureContractVal = null;
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketDataSource.getInstType(), marketDataSource.getInstId(), null, null, 12, null) : null;
        java.lang.String instType = marketDataSource.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                if (instType.equals("OPTION")) {
                    if (minSuggestedInstrument$default != null && (minSuggestedInstrument$default instanceof OptionInstrument)) {
                        OptionInstrument optionInstrument = (OptionInstrument) minSuggestedInstrument$default;
                        return C33129mqd.AEQbTJ(C33129mqd.mulS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(marketDataSource.getContractVolume(), optionInstrument.getCtVal(), null, null, null, 14, null), optionInstrument.getCtMult(), null, null, null, 14, null), marketDataSource.getCupTickerPrice(), null, null, null, 14, null));
                    }
                    return C33129mqd.AEQbTJ("0");
                }
                return C33129mqd.AEQbTJ("0");
            case 2552066:
                break;
            case 2558355:
                break;
            case 214415088:
                break;
            default:
                return C33129mqd.AEQbTJ("0");
        }
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ActionBar actionBarAEQbTJ = TaskDescription.AEQbTJ(str);
        java.lang.String strCopydefault = actionBarAEQbTJ.copydefault();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String upperCase2 = actionBarAEQbTJ.AEQbTJ().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return upperCase + "-" + upperCase2;
    }
}
