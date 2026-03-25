package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56117xwk {
    public static final C56117xwk copydefault = new C56117xwk();

    private C56117xwk() {
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, boolean z2, @NotNull java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, @NotNull java.lang.String str13) {
        java.lang.String safeString$default;
        xMV second;
        java.lang.String strEZpvd;
        xMV second2;
        C54536xML c54536xMLOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String strGEmmrt;
        java.lang.String safeString$default2;
        xOW newProxyInstance;
        xOV xovEZpvd;
        java.lang.String str14 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str13, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES")) {
            kotlin.Pair<java.lang.String, xMV> pairEZpvd = EZpvd(str3, str4, str5, str7, str6, str2, str, z2);
            if (pairEZpvd == null || (second2 = pairEZpvd.getSecond()) == null || (c54536xMLOLrzqt = second2.OLrzqt(pairEZpvd.getFirst())) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLOLrzqt, false, 1, null)) == null) {
                safeString$default = "";
            }
            if (pairEZpvd != null && (second = pairEZpvd.getSecond()) != null && (strEZpvd = second.EZpvd()) != null) {
                str14 = strEZpvd;
            }
            return new kotlin.Pair<>(safeString$default, str14);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") && ((interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.OLrzqt() || !Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated"))) {
            C54536xML c54536xMLEZpvd = EZpvd(str3, str4, str5, str7, str6, str2, str);
            if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "buy") && C33129mqd.OLrzqt((java.lang.CharSequence) str13)) {
                strGEmmrt = str13;
            } else if (c54536xMLEZpvd == null || (strGEmmrt = c54536xMLEZpvd.gEmmrt()) == null) {
                strGEmmrt = "";
            }
            if (c54536xMLEZpvd != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLEZpvd, false, 1, null)) != null) {
                str14 = safeString$default2;
            }
            return new kotlin.Pair<>(str14, strGEmmrt);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
            return AEQbTJ(str3, str4, str5, str7, str6, str2, str, str8, z, str9, str10, str11, str12);
        }
        return new kotlin.Pair<>("", "");
    }

    public final kotlin.Pair<java.lang.String, xMV> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z) {
        java.lang.String strCopydefault;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str7)) == null) {
            strCopydefault = null;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            strCopydefault = abstractC54531xLwOLrzqt.copydefault(interfaceC54581xNrOLrzqt2 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str7, str6, null, null, 12, null) : null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market")) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "inverse")) {
                return xOB.OLrzqt.OLrzqt(str3, str4, str5, str6, str7, str4, z);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "inverse")) {
                return xOB.OLrzqt.OLrzqt(str4, str3, str5, str6, str7, str4, z);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
                return xOB.OLrzqt.copydefault(str4, str3, str5, str6, str7, str4, z);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
                return xOB.OLrzqt.copydefault(str3, str4, str5, str6, str7, str4, z);
            }
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "inverse")) {
            return xOB.OLrzqt.OLrzqt(str3, str4, str5, str6, str7, str4, z);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "inverse")) {
            return xOB.OLrzqt.OLrzqt(str4, str3, str5, str6, str7, str4, z);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
            return xOB.OLrzqt.copydefault(str4, str3, str5, str6, str7, str4, z);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
            return xOB.OLrzqt.copydefault(str3, str4, str5, str6, str7, str4, z);
        }
        return null;
    }

    public final C54536xML EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market")) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy")) {
                return xOB.OLrzqt.EZpvd(str3, str4, str5, str6, str7);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell")) {
                return xOB.OLrzqt.KWHzl(str4, str3, str5, str6, str7);
            }
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy")) {
                return xOB.OLrzqt.EZpvd(str3, str4, str5, str6, str7);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell")) {
                return xOB.OLrzqt.KWHzl(str4, str3, str5, str6, str7);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12) {
        java.lang.Object obj;
        java.lang.Object obj2;
        C54571xNh c54571xNhCreateAmtConvertor$default;
        java.lang.String strSubS$default;
        java.lang.String strSubS$default2;
        java.lang.String safeString$default;
        java.lang.String strOLrzqt;
        C54536xML c54536xMLAYXKKw;
        java.lang.String str13 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str7, str6, null, null, 12, null) : null;
        if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && !z && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market") && !AEQbTJ()) {
            java.lang.String strSubS$default3 = C33129mqd.subS$default(str5, C33129mqd.divS$default(C33129mqd.mulS$default(str5, str4, null, null, null, 14, null), str3, null, null, null, 14, null), null, null, null, 14, null);
            c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
            strSubS$default = strSubS$default3;
            obj2 = null;
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && !z && !AEQbTJ()) {
                obj = null;
                strSubS$default2 = C33129mqd.subS$default(C33129mqd.divS$default(str5, str4, null, null, null, 14, null), C33129mqd.divS$default(str5, str3, null, null, null, 14, null), null, null, null, 14, null);
                c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
            } else {
                obj = null;
                if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && !z && !AEQbTJ()) {
                    obj2 = null;
                    strSubS$default = C33129mqd.subS$default(C33129mqd.mulS$default(str5, str4, null, null, null, 14, null), C33129mqd.mulS$default(str5, str3, null, null, null, 14, null), null, null, null, 14, null);
                    c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && z && !AEQbTJ()) {
                    strSubS$default2 = C33129mqd.subS$default(C33129mqd.subS$default(str12, str10, null, null, null, 14, null), C33129mqd.divS$default(str11, str3, null, null, null, 14, null), null, null, null, 14, null);
                    c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && z && !AEQbTJ()) {
                    strSubS$default2 = C33129mqd.subS$default(C33129mqd.subS$default(str12, str10, null, null, null, 14, null), C33129mqd.mulS$default(str11, str3, null, null, null, 14, null), null, null, null, 14, null);
                    c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated")) {
                    if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && !z && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market") && AEQbTJ()) {
                        obj2 = null;
                        strSubS$default = C33129mqd.subS$default(str5, C33129mqd.divS$default(C33129mqd.mulS$default(str5, str4, null, null, null, 14, null), str3, null, null, null, 14, null), null, null, null, 14, null);
                        c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated")) {
                    if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && !z && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market") && AEQbTJ()) {
                        obj = null;
                        strSubS$default2 = C33129mqd.subS$default(C33129mqd.divS$default(str5, str4, null, null, null, 14, null), C33129mqd.divS$default(str5, str3, null, null, null, 14, null), null, null, null, 14, null);
                        c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                    }
                } else {
                    obj = null;
                    if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated")) {
                        if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && !z && AEQbTJ()) {
                            obj2 = null;
                            strSubS$default = C33129mqd.subS$default(C33129mqd.divS$default(C33129mqd.mulS$default(str5, str4, null, null, null, 14, null), str3, null, null, null, 14, null), str5, null, null, null, 14, null);
                            c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy")) {
                        if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) && z && AEQbTJ()) {
                            strSubS$default2 = C33129mqd.subS$default(str12, C33129mqd.divS$default(str11, str3, null, null, null, 14, null), null, null, null, 14, null);
                            c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell")) {
                        if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) && z && AEQbTJ()) {
                            strSubS$default2 = C33129mqd.subS$default(C33129mqd.divS$default(str12, str3, null, null, null, 14, null), str11, null, null, null, 14, null);
                            c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated")) {
                        if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && !z && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market") && AEQbTJ()) {
                            strSubS$default2 = C33129mqd.subS$default(C33129mqd.mulS$default(str5, str3, null, null, null, 14, null), C33129mqd.mulS$default(str5, str4, null, null, null, 14, null), null, null, null, 14, null);
                            c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated")) {
                        if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && !z && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market") && AEQbTJ()) {
                            obj2 = null;
                            strSubS$default = C33129mqd.subS$default(C33129mqd.mulS$default(C33129mqd.divS$default(str5, str4, null, null, null, 14, null), str3, null, null, null, 14, null), str5, null, null, null, 14, null);
                            c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated")) {
                        if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && !z && AEQbTJ()) {
                            obj = null;
                            strSubS$default2 = C33129mqd.subS$default(C33129mqd.mulS$default(str5, str4, null, null, null, 14, null), C33129mqd.mulS$default(str5, str3, null, null, null, 14, null), null, null, null, 14, null);
                            c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                        }
                    } else {
                        obj = null;
                        if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy")) {
                            if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)) && z && AEQbTJ()) {
                                strSubS$default2 = C33129mqd.subS$default(C33129mqd.mulS$default(str12, str3, null, null, null, 14, null), str11, null, null, null, 14, null);
                                c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                            }
                        } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell")) {
                            if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)) && z && AEQbTJ()) {
                                strSubS$default2 = C33129mqd.subS$default(str12, C33129mqd.mulS$default(str11, str3, null, null, null, 14, null), null, null, null, 14, null);
                                c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                            }
                        } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "cross")) {
                            if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && !z && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market")) {
                                obj2 = null;
                                strSubS$default = C33129mqd.subS$default(str5, C33129mqd.divS$default(C33129mqd.mulS$default(str5, str4, null, null, null, 14, null), str3, null, null, null, 14, null), null, null, null, 14, null);
                                c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                            }
                        } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "cross")) {
                            if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && !z && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market")) {
                                obj2 = null;
                                strSubS$default = C33129mqd.subS$default(C33129mqd.divS$default(str5, str4, null, null, null, 14, null), C33129mqd.divS$default(str5, str3, null, null, null, 14, null), null, null, null, 14, null);
                                c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                            }
                        } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "cross")) {
                            if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && !z) {
                                obj2 = null;
                                strSubS$default = C33129mqd.subS$default(C33129mqd.divS$default(C33129mqd.mulS$default(str5, str4, null, null, null, 14, null), str3, null, null, null, 14, null), str5, null, null, null, 14, null);
                                c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                            }
                        } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "cross")) {
                            if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && z) {
                                strSubS$default2 = C33129mqd.subS$default(str12, C33129mqd.divS$default(str11, str3, null, null, null, 14, null), null, null, null, 14, null);
                                c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                            }
                        } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "cross")) {
                            if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && z) {
                                strSubS$default2 = C33129mqd.subS$default(C33129mqd.divS$default(str12, str3, null, null, null, 14, null), str11, null, null, null, 14, null);
                                c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, false, null, 28, null);
                            }
                        } else {
                            if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "cross")) {
                                if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && !z && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market")) {
                                    strSubS$default2 = C33129mqd.subS$default(C33129mqd.mulS$default(str5, str3, null, null, null, 14, null), C33129mqd.mulS$default(str5, str4, null, null, null, 14, null), null, null, null, 14, null);
                                    c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                                }
                            }
                            if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "cross")) {
                                if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && !z && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market")) {
                                    obj2 = null;
                                    strSubS$default = C33129mqd.subS$default(C33129mqd.mulS$default(C33129mqd.divS$default(str5, str4, null, null, null, 14, null), str3, null, null, null, 14, null), str5, null, null, null, 14, null);
                                    c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                                }
                            } else {
                                obj2 = null;
                                if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "cross")) {
                                    if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && !z) {
                                        strSubS$default = C33129mqd.subS$default(C33129mqd.mulS$default(str5, str4, null, null, null, 14, null), C33129mqd.mulS$default(str5, str3, null, null, null, 14, null), null, null, null, 14, null);
                                        c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                                    }
                                } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "cross")) {
                                    if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && z) {
                                        strSubS$default = C33129mqd.subS$default(C33129mqd.mulS$default(str12, str3, null, null, null, 14, null), str11, null, null, null, 14, null);
                                        c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                                    }
                                } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "cross")) {
                                    if (Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && z) {
                                        strSubS$default = C33129mqd.subS$default(str12, C33129mqd.mulS$default(str11, str3, null, null, null, 14, null), null, null, null, 14, null);
                                        c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str6, str7, null, true, null, 20, null);
                                    }
                                } else {
                                    c54571xNhCreateAmtConvertor$default = null;
                                    strSubS$default = "";
                                }
                            }
                        }
                    }
                }
            }
            strSubS$default = strSubS$default2;
            obj2 = obj;
        }
        if (c54571xNhCreateAmtConvertor$default == null || (c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default.AYXKKw(strSubS$default)) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, obj2)) == null) {
            safeString$default = "";
        }
        if (c54571xNhCreateAmtConvertor$default != null && (strOLrzqt = c54571xNhCreateAmtConvertor$default.OLrzqt()) != null) {
            str13 = strOLrzqt;
        }
        return new kotlin.Pair<>(safeString$default, str13);
    }

    public final boolean AEQbTJ() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.DbNXlk()) ? false : true;
    }
}
