package o;

import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.trade.model.WatchMarketData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xUj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54762xUj {
    public static final C54762xUj EZpvd = new C54762xUj();

    private C54762xUj() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r4.equals("FUTURES") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r4.equals("SWAP") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r4.equals("SPOT") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r4.equals("OPTION") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        r2 = r2.getInstFamily();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r1 = o.AbstractC54531xLw.createTradeConverterWithIndex$default(r1, r2, null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        r2 = r7.getTickerPrice();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r2 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        r1 = r1.AhwBna(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        if (r1 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        r2 = r7.getContractVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0096, code lost:
    
        r2 = r1.djBIcL(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009c, code lost:
    
        if (r1 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
    
        r7 = r7.getContractVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a2, code lost:
    
        if (r7 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a4, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        r7 = r1.copydefault(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a9, code lost:
    
        if (r7 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ac, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ad, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00af, code lost:
    
        r7 = r2.OLrzqt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b4, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b5, code lost:
    
        if (r2 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b7, code lost:
    
        r3 = r2.gEmmrt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cf, code lost:
    
        return r7 + " " + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        if (r4.equals("MARGIN") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d9, code lost:
    
        r7 = r7.getContractVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
    
        if (r7 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e0, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e9, code lost:
    
        return o.C33129mqd.gEmmrt(o.pTB.OLrzqt((java.lang.Object) r0));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(@NotNull MarketDataSource marketDataSource) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        boolean z = marketDataSource instanceof WatchMarketData;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = z ? c54589xNz.copydefault() : c54589xNz.OLrzqt();
        java.lang.String strGEmmrt = null;
        if (z) {
            abstractC54531xLwOLrzqt = xUD.KWHzl(marketDataSource.getInstType());
        } else {
            abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.OLrzqt(marketDataSource.getInstType()) : null;
        }
        if (abstractC54531xLwOLrzqt != null) {
            java.lang.String instId = marketDataSource.getInstId();
            if (instId == null) {
                instId = "";
            }
            bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instId);
        } else {
            bizInstrumentValueOf = null;
        }
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
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(@NotNull MarketDataSource marketDataSource) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        java.lang.String strEZpvd;
        java.lang.String strMulS$default;
        C54536xML c54536xMLAYXKKw2;
        java.lang.String futureContractVal;
        java.lang.String strMulS$default2;
        C54536xML c54536xMLAYXKKw3;
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        boolean z = marketDataSource instanceof WatchMarketData;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = z ? c54589xNz.copydefault() : c54589xNz.OLrzqt();
        if (z) {
            abstractC54531xLwOLrzqt = xUD.KWHzl(marketDataSource.getInstType());
        } else {
            abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.OLrzqt(marketDataSource.getInstType()) : null;
        }
        if (abstractC54531xLwOLrzqt != null) {
            java.lang.String instId = marketDataSource.getInstId();
            if (instId == null) {
                instId = "";
            }
            bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instId);
        } else {
            bizInstrumentValueOf = null;
        }
        java.lang.String instType = marketDataSource.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                if (!instType.equals("MARGIN")) {
                    return "";
                }
                break;
            case -1956807563:
                if (!instType.equals("OPTION") || bizInstrumentValueOf == null || !(bizInstrumentValueOf instanceof OptionInstrument)) {
                    return "";
                }
                OptionInstrument optionInstrument = (OptionInstrument) bizInstrumentValueOf;
                java.lang.String strMulS$default3 = C33129mqd.mulS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(marketDataSource.getContractVolume(), optionInstrument.getCtVal(), null, null, null, 14, null), optionInstrument.getCtMult(), null, null, null, 14, null), marketDataSource.getCupTickerPrice(), null, null, null, 14, null);
                xmwKWHzl = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.KWHzl() : null;
                if (xmwKWHzl == null || (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(strMulS$default3)) == null || (strEZpvd = c54536xMLAYXKKw.EZpvd()) == null) {
                    return "";
                }
                return strEZpvd;
            case 2552066:
                if (!instType.equals("SPOT")) {
                    return "";
                }
                break;
            case 2558355:
                if (!instType.equals("SWAP")) {
                    return "";
                }
                futureContractVal = bizInstrumentValueOf == null ? bizInstrumentValueOf.getFutureContractVal() : null;
                if (bizInstrumentValueOf == null && bizInstrumentValueOf.isPositiveContract()) {
                    strMulS$default2 = C33129mqd.mulS$default(C33129mqd.mulS$default(marketDataSource.getContractVolume(), futureContractVal, null, null, null, 14, null), marketDataSource.getCupTickerPrice(), null, null, null, 14, null);
                } else {
                    strMulS$default2 = C33129mqd.mulS$default(marketDataSource.getContractVolume(), futureContractVal, null, null, null, 14, null);
                }
                xmwKWHzl = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.KWHzl() : null;
                if (xmwKWHzl != null || (c54536xMLAYXKKw3 = xmwKWHzl.AYXKKw(strMulS$default2)) == null || (strEZpvd = c54536xMLAYXKKw3.EZpvd()) == null) {
                    return "";
                }
                return strEZpvd;
            case 214415088:
                if (!instType.equals("FUTURES")) {
                    return "";
                }
                if (bizInstrumentValueOf == null) {
                }
                if (bizInstrumentValueOf == null) {
                    strMulS$default2 = C33129mqd.mulS$default(marketDataSource.getContractVolume(), futureContractVal, null, null, null, 14, null);
                    if (interfaceC54581xNrCopydefault != null) {
                    }
                    return xmwKWHzl != null ? "" : "";
                }
                return strEZpvd;
            default:
                return "";
        }
        java.lang.String volume = marketDataSource.getVolume();
        if (volume == null || (strMulS$default = C33129mqd.mulS$default(volume, marketDataSource.getQuoteCcyUSDPrice(), null, null, null, 14, null)) == null) {
            strMulS$default = "";
        }
        xmwKWHzl = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.KWHzl() : null;
        if (xmwKWHzl == null || (c54536xMLAYXKKw2 = xmwKWHzl.AYXKKw(strMulS$default)) == null || (strEZpvd = c54536xMLAYXKKw2.EZpvd()) == null) {
            return "";
        }
        return strEZpvd;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0177, code lost:
    
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017a, code lost:
    
        r17 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0198, code lost:
    
        return java.lang.Double.valueOf(o.C33129mqd.AEQbTJ(o.C54536xML.toSafeString$default(o.C54536xML.setNumber$default(r14, r15, "0", r17, null, 8, null).AuCTel(), false, 1, null)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return null;
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
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r7.equals("FUTURES") == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r7.equals("SWAP") == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r7.equals("SPOT") == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r7.equals("OPTION") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        r2 = r3.getNewProxyInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        r2 = r2.iwGUEr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r6 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r6.isPositiveContract() != true) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r2, (java.lang.Object) "2") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r22.getInstType(), (java.lang.Object) "SWAP") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r22.getInstType(), (java.lang.Object) "FUTURES") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        r0 = r22.getVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
    
        r0 = o.C33129mqd.mulS$default(r22.getVolume(), r22.getTickerPrice(), null, null, null, 14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        r2 = new o.C54536xML();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r0 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        return java.lang.Double.valueOf(o.C33129mqd.AEQbTJ(o.C54536xML.toSafeString$default(r2.OLrzqt(r0, "0", r6.getTradeSymbol(), "").AuCTel(), false, 1, null)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
    
        if (r5 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r6 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        r2 = r6.getInstFamily();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
    
        if (r2 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
    
        r2 = o.AbstractC54531xLw.createTradeConverterWithIndex$default(r5, r2, null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f3, code lost:
    
        if (r2 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r3 = r22.getTickerPrice();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f9, code lost:
    
        if (r3 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fc, code lost:
    
        r2 = r2.AhwBna(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0101, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
    
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0104, code lost:
    
        r0 = r22.getContractVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0108, code lost:
    
        if (r0 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010b, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010c, code lost:
    
        r0 = r2.djBIcL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0112, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0114, code lost:
    
        r0 = r0.EZpvd("0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0118, code lost:
    
        if (r0 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011a, code lost:
    
        r0 = r0.AuCTel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011e, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0120, code lost:
    
        r0 = o.C54536xML.toSafeString$default(r0, false, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0124, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012e, code lost:
    
        return java.lang.Double.valueOf(o.C33129mqd.AEQbTJ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0135, code lost:
    
        if (r7.equals("MARGIN") == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0138, code lost:
    
        if (r2 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013a, code lost:
    
        r2 = o.C54589xNz.EZpvd.copydefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0141, code lost:
    
        r2 = o.C54589xNz.EZpvd.OLrzqt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0147, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
    
        if (r14 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014a, code lost:
    
        r2 = o.InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(r14, r22.getInstType(), r22.getInstId(), null, null, 12, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015f, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0160, code lost:
    
        r14 = new o.C54536xML();
        r0 = r22.getContractVolume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0169, code lost:
    
        if (r0 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016b, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016d, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016e, code lost:
    
        if (r2 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0170, code lost:
    
        r0 = r2.getTradeSymbol();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0174, code lost:
    
        if (r0 != null) goto L100;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Double KWHzl(@NotNull MarketDataSource marketDataSource) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        boolean z = marketDataSource instanceof WatchMarketData;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = z ? c54589xNz.copydefault() : c54589xNz.OLrzqt();
        if (z) {
            abstractC54531xLwOLrzqt = xUD.KWHzl(marketDataSource.getInstType());
        } else {
            abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.OLrzqt(marketDataSource.getInstType()) : null;
        }
        if (abstractC54531xLwOLrzqt != null) {
            java.lang.String instId = marketDataSource.getInstId();
            if (instId == null) {
                instId = "";
            }
            bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instId);
        } else {
            bizInstrumentValueOf = null;
        }
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r2.equals("FUTURES") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r2.equals("SWAP") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r4 = r1.getFutureContractVal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r1 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r1.isPositiveContract() != true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        r0 = o.C33129mqd.mulS$default(o.C33129mqd.mulS$default(r20.getContractVolume(), r6, null, null, null, 14, null), r20.getCupTickerPrice(), null, null, null, 14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        r0 = o.C33129mqd.mulS$default(r20.getContractVolume(), r6, null, null, null, 14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (r2.equals("SPOT") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
    
        if (r2.equals("MARGIN") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return o.C33129mqd.AEQbTJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return o.C33129mqd.AEQbTJ(o.C33129mqd.mulS$default(r20.getContractVolume(), r20.getCupTickerPrice(), null, null, null, 14, null));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double EZpvd(@NotNull MarketDataSource marketDataSource) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        boolean z = marketDataSource instanceof WatchMarketData;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = z ? c54589xNz.copydefault() : c54589xNz.OLrzqt();
        java.lang.String futureContractVal = null;
        if (z) {
            abstractC54531xLwOLrzqt = xUD.KWHzl(marketDataSource.getInstType());
        } else {
            abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.OLrzqt(marketDataSource.getInstType()) : null;
        }
        if (abstractC54531xLwOLrzqt != null) {
            java.lang.String instId = marketDataSource.getInstId();
            bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instId != null ? instId : "");
        } else {
            bizInstrumentValueOf = null;
        }
        java.lang.String instType = marketDataSource.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                if (instType.equals("OPTION")) {
                    if (bizInstrumentValueOf != null && (bizInstrumentValueOf instanceof OptionInstrument)) {
                        OptionInstrument optionInstrument = (OptionInstrument) bizInstrumentValueOf;
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
}
