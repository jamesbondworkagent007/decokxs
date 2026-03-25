package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oMb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36014oMb {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [26=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.String EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String orderType = bizTradeStrategyInfo.getOrderType();
        switch (orderType.hashCode()) {
            case -1727670399:
                if (orderType.equals("move_order_stop")) {
                    return valueOf(bizTradeStrategyInfo) ? OLrzqt(bizTradeStrategyInfo) : C33129mqd.OLrzqt((java.lang.CharSequence) bizTradeStrategyInfo.getOrderActivePx()) ? bizTradeStrategyInfo.getOrderActivePx() : bizTradeStrategyInfo.getOrderLast();
                }
                break;
            case -1059891784:
                if (orderType.equals("trigger")) {
                    return C33129mqd.OLrzqt((java.lang.Object) bizTradeStrategyInfo.getOrderOrdPx(), (java.lang.Object) (-1)) ? bizTradeStrategyInfo.getOrderTriggerPx() : bizTradeStrategyInfo.getOrderOrdPx();
                }
                break;
            case 109851:
                if (orderType.equals("oco")) {
                    return valueOf(bizTradeStrategyInfo) ? OLrzqt(bizTradeStrategyInfo) : bizTradeStrategyInfo.getOrderLast();
                }
                break;
            case 1208131206:
                if (orderType.equals("conditional")) {
                    return C33129mqd.AEQbTJ(bizTradeStrategyInfo.getOrderTpTriggerPx(), 0) ? C33129mqd.OLrzqt((java.lang.Object) bizTradeStrategyInfo.getOrderTpOrderPx(), (java.lang.Object) (-1)) ? bizTradeStrategyInfo.getOrderTpTriggerPx() : bizTradeStrategyInfo.getOrderTpOrderPx() : C33129mqd.OLrzqt((java.lang.Object) bizTradeStrategyInfo.getOrderSlOrderPx(), (java.lang.Object) (-1)) ? bizTradeStrategyInfo.getOrderSlTriggerPx() : bizTradeStrategyInfo.getOrderSlOrderPx();
                }
                break;
        }
        return bizTradeStrategyInfo.getOrderLast();
    }

    public static final boolean valueOf(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        return Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderInstType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderInstType(), (java.lang.Object) "FUTURES");
    }

    public static final java.lang.String OLrzqt(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        java.lang.String orderTriggerLast = bizTradeStrategyInfo.getOrderTriggerLast();
        return (djBIcL(bizTradeStrategyInfo) && C33129mqd.OLrzqt((java.lang.CharSequence) orderTriggerLast)) ? orderTriggerLast : bizTradeStrategyInfo.getOrderLast();
    }

    public static final boolean djBIcL(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        return (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderType(), (java.lang.Object) "move_order_stop") || Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderType(), (java.lang.Object) "oco")) && Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderState(), (java.lang.Object) "effective");
    }

    public static final boolean gEmmrt(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        boolean zContains = yDY.gEmmrt("SPOT", "MARGIN").contains(bizTradeStrategyInfo.getOrderInstType());
        boolean zAhwBna = AhwBna(bizTradeStrategyInfo);
        java.lang.String orderTgtCcy = bizTradeStrategyInfo.getOrderTgtCcy();
        return ((orderTgtCcy == null || orderTgtCcy.length() == 0) ? C59449zhJ.gEmmrt(bizTradeStrategyInfo.getOrderSide(), "buy", true) : Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderTgtCcy(), (java.lang.Object) "quote_ccy")) & zContains & zAhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [70=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean AhwBna(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        java.lang.String orderType = bizTradeStrategyInfo.getOrderType();
        switch (orderType.hashCode()) {
            case -1727670399:
                return orderType.equals("move_order_stop");
            case -1059891784:
                if (orderType.equals("trigger")) {
                    return C33129mqd.OLrzqt((java.lang.Object) bizTradeStrategyInfo.getOrderOrdPx(), (java.lang.Object) (-1));
                }
                return false;
            case 109851:
                if (orderType.equals("oco")) {
                    return C33129mqd.OLrzqt((java.lang.Object) bizTradeStrategyInfo.getOrderTpOrderPx(), (java.lang.Object) (-1)) & C33129mqd.OLrzqt((java.lang.Object) bizTradeStrategyInfo.getOrderSlOrderPx(), (java.lang.Object) (-1));
                }
                return false;
            case 1208131206:
                if (!orderType.equals("conditional")) {
                    return false;
                }
                if (C33129mqd.AEQbTJ(bizTradeStrategyInfo.getOrderTpTriggerPx(), 0) && C33129mqd.valueOf(bizTradeStrategyInfo.getOrderSlTriggerPx(), 0)) {
                    return C33129mqd.OLrzqt((java.lang.Object) bizTradeStrategyInfo.getOrderTpOrderPx(), (java.lang.Object) (-1));
                }
                if (C33129mqd.valueOf(bizTradeStrategyInfo.getOrderTpTriggerPx(), 0) && C33129mqd.AEQbTJ(bizTradeStrategyInfo.getOrderSlTriggerPx(), 0)) {
                    return C33129mqd.OLrzqt((java.lang.Object) bizTradeStrategyInfo.getOrderSlOrderPx(), (java.lang.Object) (-1));
                }
                return false;
            default:
                return false;
        }
    }

    public static /* synthetic */ java.lang.String getEntrustAmount$default(BizTradeStrategyInfo bizTradeStrategyInfo, java.lang.Boolean bool, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return KWHzl(bizTradeStrategyInfo, bool, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String KWHzl(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo, java.lang.Boolean bool, boolean z) {
        java.lang.String str;
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default;
        java.lang.String orderSz;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLAEQbTJ2;
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLIsConnected2;
        C54536xML c54536xMLAEQbTJ3;
        C54536xML c54536xMLDjBIcL4;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLAEQbTJ4;
        C54536xML c54536xMLDjBIcL5;
        C54536xML c54536xMLAEQbTJ5;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLAEQbTJ6;
        java.lang.String upperCase;
        C54536xML c54536xMLDjBIcL6;
        C54536xML c54536xMLIsConnected3;
        java.lang.String quoteSymbol;
        C54536xML c54536xMLDjBIcL7;
        C54536xML c54536xMLAEQbTJ7;
        C54536xML c54536xMLFetchVPNInfo3;
        C54536xML c54536xMLAEQbTJ8;
        java.lang.String upperCase2;
        C54536xML c54536xMLDjBIcL8;
        C54536xML c54536xMLIsConnected4;
        java.lang.String quoteSymbol2;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        str = "";
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        AbstractC54531xLw abstractC54531xLwOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null) ? null : interfaceC54581xNrOLrzqt2.OLrzqt(bizTradeStrategyInfo.getOrderInstType());
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        BizInstrument suggestedInstrument$default = (interfaceC49425uoM2 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), null, null, 12, null);
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        java.lang.String orderUly = (instFamily == null || instFamily.length() == 0) ? bizTradeStrategyInfo.getOrderUly() : suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (gEmmrt(bizTradeStrategyInfo)) {
            java.lang.String orderInstType = bizTradeStrategyInfo.getOrderInstType();
            if (Intrinsics.EZpvd((java.lang.Object) orderInstType, (java.lang.Object) "SPOT")) {
                xLL xll = abstractC54531xLwOLrzqt instanceof xLL ? (xLL) abstractC54531xLwOLrzqt : null;
                if (xll == null) {
                    c54536xMLDjBIcL7 = null;
                    if (z) {
                        if (c54536xMLDjBIcL7 != null && (c54536xMLAEQbTJ7 = c54536xMLDjBIcL7.AEQbTJ()) != null) {
                            safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ7, false, 1, null);
                            str = safeString$default;
                        }
                        str = null;
                    } else {
                        if (c54536xMLDjBIcL7 != null && (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL7.fetchVPNInfo()) != null && (c54536xMLAEQbTJ8 = c54536xMLFetchVPNInfo3.AEQbTJ()) != null) {
                            safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ8, false, 1, null);
                            str = safeString$default;
                        }
                        str = null;
                    }
                } else {
                    if (orderUly == null) {
                        orderUly = "";
                    }
                    if (suggestedInstrument$default == null || (quoteSymbol2 = suggestedInstrument$default.getQuoteSymbol()) == null) {
                        upperCase2 = null;
                    } else {
                        java.util.Locale locale = java.util.Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        upperCase2 = quoteSymbol2.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    }
                    C54571xNh c54571xNhAhwBna = xll.AhwBna(orderUly, upperCase2);
                    if (c54571xNhAhwBna != null && (c54536xMLDjBIcL8 = c54571xNhAhwBna.djBIcL(bizTradeStrategyInfo.getOrderSz())) != null && (c54536xMLIsConnected4 = c54536xMLDjBIcL8.isConnected()) != null) {
                        c54536xMLDjBIcL7 = c54536xMLIsConnected4.djBIcL();
                    }
                    if (z) {
                    }
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) orderInstType, (java.lang.Object) "MARGIN")) {
                xLD xld = abstractC54531xLwOLrzqt instanceof xLD ? (xLD) abstractC54531xLwOLrzqt : null;
                if (xld == null) {
                    c54536xMLDjBIcL5 = null;
                    if (z) {
                        if (c54536xMLDjBIcL5 != null && (c54536xMLAEQbTJ5 = c54536xMLDjBIcL5.AEQbTJ()) != null) {
                            safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ5, false, 1, null);
                            str = safeString$default;
                        }
                        str = null;
                    } else {
                        if (c54536xMLDjBIcL5 != null && (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL5.fetchVPNInfo()) != null && (c54536xMLAEQbTJ6 = c54536xMLFetchVPNInfo2.AEQbTJ()) != null) {
                            safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ6, false, 1, null);
                            str = safeString$default;
                        }
                        str = null;
                    }
                } else {
                    if (orderUly == null) {
                        orderUly = "";
                    }
                    if (suggestedInstrument$default == null || (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) == null) {
                        upperCase = null;
                    } else {
                        java.util.Locale locale2 = java.util.Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale2, "");
                        upperCase = quoteSymbol.toUpperCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    }
                    C54571xNh c54571xNhAhwBna2 = xld.AhwBna(orderUly, upperCase);
                    if (c54571xNhAhwBna2 != null && (c54536xMLDjBIcL6 = c54571xNhAhwBna2.djBIcL(bizTradeStrategyInfo.getOrderSz())) != null && (c54536xMLIsConnected3 = c54536xMLDjBIcL6.isConnected()) != null) {
                        c54536xMLDjBIcL5 = c54536xMLIsConnected3.djBIcL();
                    }
                    if (z) {
                    }
                }
            }
        } else {
            if (abstractC54531xLwOLrzqt != null) {
                c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, orderUly != null ? orderUly : "", null, 2, null);
            } else {
                c54571xNhCreateTradeConverterWithIndex$default = null;
            }
            if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                c54571xNhCreateTradeConverterWithIndex$default.AhwBna(EZpvd(bizTradeStrategyInfo));
            }
            if (bizTradeStrategyInfo.isHistoryOrder() && ((Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderInstType(), (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderInstType(), (java.lang.Object) "SWAP")) && C33129mqd.OLrzqt((java.lang.CharSequence) bizTradeStrategyInfo.getOrderCtVal()) && c54571xNhCreateTradeConverterWithIndex$default != null)) {
                java.lang.String orderCtVal = bizTradeStrategyInfo.getOrderCtVal();
                Intrinsics.copydefault((java.lang.Object) orderCtVal);
                c54571xNhCreateTradeConverterWithIndex$default.valueOf(orderCtVal);
            }
            if (bool != null && bool.booleanValue()) {
                if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderState(), (java.lang.Object) "canceled")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.sVaiLC);
                }
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) bizTradeStrategyInfo.getOrderCloseFraction()) && ((orderSz = bizTradeStrategyInfo.getOrderSz()) == null || orderSz.length() == 0)) {
                return C33070mpX.AYXKKw(C35964oKf.Fragment.sVaiLC);
            }
            if (z) {
                if (c54571xNhCreateTradeConverterWithIndex$default != null && (c54536xMLDjBIcL3 = c54571xNhCreateTradeConverterWithIndex$default.djBIcL(bizTradeStrategyInfo.getOrderSz())) != null && (c54536xMLIsConnected2 = c54536xMLDjBIcL3.isConnected()) != null && (c54536xMLAEQbTJ3 = c54536xMLIsConnected2.AEQbTJ(false)) != null && (c54536xMLDjBIcL4 = c54536xMLAEQbTJ3.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL4.fetchVPNInfo()) != null && (c54536xMLAEQbTJ4 = c54536xMLFetchVPNInfo.AEQbTJ()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ4, false, 1, null);
                    str = safeString$default;
                }
                str = null;
            } else {
                if (c54571xNhCreateTradeConverterWithIndex$default != null && (c54536xMLDjBIcL = c54571xNhCreateTradeConverterWithIndex$default.djBIcL(bizTradeStrategyInfo.getOrderSz())) != null && (c54536xMLIsConnected = c54536xMLDjBIcL.isConnected()) != null && (c54536xMLAEQbTJ = c54536xMLIsConnected.AEQbTJ(false)) != null && (c54536xMLDjBIcL2 = c54536xMLAEQbTJ.djBIcL()) != null && (c54536xMLAEQbTJ2 = c54536xMLDjBIcL2.AEQbTJ()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ2, false, 1, null);
                    str = safeString$default;
                }
                str = null;
            }
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        Intrinsics.copydefault((java.lang.Object) str);
        return str;
    }

    public static final java.lang.String KWHzl(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLEZpvd;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        xMW xmwKWHzl2;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLEZpvd2;
        C54536xML c54536xMLCopydefault2;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.lang.String safeNoSignString$default = null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        ValuationCurrencyBean valuationCurrencyBeanZLjUOn = ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).zLjUOn();
        java.lang.String symbol = valuationCurrencyBeanZLjUOn != null ? valuationCurrencyBeanZLjUOn.getSymbol() : null;
        double dAEQbTJ = C33129mqd.AEQbTJ((interfaceC54581xNrOLrzqt == null || (xmwKWHzl2 = interfaceC54581xNrOLrzqt.KWHzl()) == null || (c54536xMLAYXKKw2 = xmwKWHzl2.AYXKKw(bizTradeStrategyInfo.getOrderNotionalUsd())) == null || (c54536xMLEZpvd2 = c54536xMLAYXKKw2.EZpvd("2")) == null || (c54536xMLCopydefault2 = c54536xMLEZpvd2.copydefault()) == null) ? null : C54536xML.toSafeNoSignString$default(c54536xMLCopydefault2, false, 1, null));
        if (interfaceC54581xNrOLrzqt != null && (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) != null && (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(bizTradeStrategyInfo.getOrderNotionalUsd())) != null && (c54536xMLEZpvd = c54536xMLAYXKKw.EZpvd("2")) != null && (c54536xMLCopydefault = c54536xMLEZpvd.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null) {
            safeNoSignString$default = C54536xML.toSafeNoSignString$default(c54536xMLDjBIcL, false, 1, null);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Double.valueOf(dAEQbTJ), (java.lang.Object) 0)) {
            return "--";
        }
        return symbol + safeNoSignString$default;
    }

    public static final java.lang.String AYXKKw(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        return bizTradeStrategyInfo.getOrderTriggerPx();
    }

    public static final java.lang.String AEQbTJ(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        if (bizTradeStrategyInfo.getOrderCallbackRatio().length() > 0) {
            return pTB.formatICUPercent$default(new BigDecimal(bizTradeStrategyInfo.getOrderCallbackRatio()), RoundingMode.UP, C38307pTy.Companion.EZpvd(0), DisplaySign.AUTO, java.lang.Double.valueOf(100.0d), null, 16, null);
        }
        return bizTradeStrategyInfo.getOrderCallbackSpread().length() > 0 ? copydefault(bizTradeStrategyInfo) : "--";
    }

    public static final java.lang.String copydefault(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String strAkhnZx;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        if (bizTradeStrategyInfo.getOrderCallbackSpread().length() == 0) {
            return "--";
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        xMS xmsGEmmrt = null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        java.lang.String orderUly = (instFamily == null || instFamily.length() == 0) ? bizTradeStrategyInfo.getOrderUly() : suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizTradeStrategyInfo.getOrderInstType())) != null) {
            if (orderUly == null) {
                orderUly = "";
            }
            xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(orderUly);
        }
        if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderInstType(), (java.lang.Object) "MARGIN")) {
            if (xmsGEmmrt == null || (strAkhnZx = xmsGEmmrt.AkhnZx(bizTradeStrategyInfo.getOrderCallbackSpread())) == null) {
                return "";
            }
        } else if (xmsGEmmrt == null || (strAkhnZx = xmsGEmmrt.values(bizTradeStrategyInfo.getOrderCallbackSpread())) == null) {
            return "";
        }
        return strAkhnZx;
    }
}
