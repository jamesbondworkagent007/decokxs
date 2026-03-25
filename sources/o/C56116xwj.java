package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.calculator.tpslprofit.SpTips;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56116xwj {
    public final java.lang.String AEQbTJ = "1";

    public final SpTips copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, java.lang.String str9, boolean z2) {
        java.lang.String str10 = str9;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        pUU.KWHzl("calculateByProfit", "instType: " + str + " instId:" + str2 + " orderType:" + str3 + " type:" + str4 + " profit:" + str5 + " amount:" + str6 + " spPrice:" + str7 + " orderPrice:" + str8 + " isContract:" + z + " lever:" + str10 + " isStopProfit:" + z2 + " isStopProfit:" + z2);
        if (str10 == null || str9.length() == 0) {
            str10 = this.AEQbTJ;
        }
        return AEQbTJ(str3, str4, str5, str7, str8, str6, str2, str, z, str10, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpTips AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z, java.lang.String str9, boolean z2) {
        java.lang.String strCopydefault;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLAYXKKw;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(str8)) == null) {
            strCopydefault = null;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            strCopydefault = abstractC54531xLwOLrzqt2.copydefault(interfaceC54581xNrOLrzqt2 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str8, str7, null, null, 12, null) : null);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt3 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt3.OLrzqt(str8)) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str7)) == null) {
            return null;
        }
        java.lang.String futureContractVal = bizInstrumentValueOf.getFutureContractVal();
        if (z) {
            C54571xNh c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, bizInstrumentValueOf.getInstFamily(), null, 2, null);
            if (c54571xNhCreateTradeConverterWithIndex$default != null && (c54536xMLAYXKKw = c54571xNhCreateTradeConverterWithIndex$default.AYXKKw(str6)) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) != null) {
                java.lang.String str10 = safeString$default;
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market")) {
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "inverse")) {
                        return EZpvd(str4, str5, str3, futureContractVal, str10, abstractC54531xLwOLrzqt, bizInstrumentValueOf, str9, z2);
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "inverse")) {
                        return OLrzqt(str4, str5, str3, futureContractVal, str10, abstractC54531xLwOLrzqt, bizInstrumentValueOf, str9, z2);
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
                        return KWHzl(str4, str5, str3, futureContractVal, str10, abstractC54531xLwOLrzqt, bizInstrumentValueOf, str9, z2);
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
                        return copydefault(str4, str5, str3, futureContractVal, str10, abstractC54531xLwOLrzqt, bizInstrumentValueOf, str9, z2);
                    }
                    return null;
                }
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "inverse")) {
                    return EZpvd(str4, str5, str3, futureContractVal, str10, abstractC54531xLwOLrzqt, bizInstrumentValueOf, str9, z2);
                }
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "inverse")) {
                    return OLrzqt(str4, str5, str3, futureContractVal, str10, abstractC54531xLwOLrzqt, bizInstrumentValueOf, str9, z2);
                }
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
                    return KWHzl(str4, str5, str3, futureContractVal, str10, abstractC54531xLwOLrzqt, bizInstrumentValueOf, str9, z2);
                }
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
                    return copydefault(str4, str5, str3, futureContractVal, str10, abstractC54531xLwOLrzqt, bizInstrumentValueOf, str9, z2);
                }
                return null;
            }
        } else {
            C54571xNh c54571xNhCreateTradeConverterWithIndex$default2 = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, bizInstrumentValueOf.getInstFamily(), null, 2, null);
            if (c54571xNhCreateTradeConverterWithIndex$default2 != null) {
                C54571xNh c54571xNhAhwBna = c54571xNhCreateTradeConverterWithIndex$default2.AhwBna(str5);
                if (c54571xNhAhwBna == null || (c54536xMLOLrzqt = c54571xNhAhwBna.OLrzqt(str6)) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLOLrzqt, false, 1, null)) == null) {
                }
                java.lang.String str102 = safeString$default;
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market")) {
                }
            }
        }
        java.lang.String safeString$default = "";
        java.lang.String str1022 = safeString$default;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market")) {
        }
    }

    public final SpTips OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, AbstractC54531xLw abstractC54531xLw, BizInstrument bizInstrument, java.lang.String str6, boolean z) {
        xMV xmvCreateProfitConverterWithIndex$default;
        java.lang.String strEZpvd;
        java.lang.String instFamily;
        java.lang.String strMulS$default = z ? C33129mqd.mulS$default(str6, C33129mqd.subS$default(1, C33129mqd.divS$default(str2, str, null, null, null, 14, null), null, null, null, 14, null), null, null, null, 14, null) : C33129mqd.mulS$default(str6, C33129mqd.subS$default(1, C33129mqd.divS$default(str2, str, null, null, null, 14, null), null, null, null, 14, null), null, null, null, 14, null);
        if (abstractC54531xLw != null) {
            if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
                instFamily = "";
            }
            xmvCreateProfitConverterWithIndex$default = AbstractC54531xLw.createProfitConverterWithIndex$default(abstractC54531xLw, instFamily, null, 2, null);
        } else {
            xmvCreateProfitConverterWithIndex$default = null;
        }
        if (xmvCreateProfitConverterWithIndex$default != null) {
            xmvCreateProfitConverterWithIndex$default.EZpvd();
        }
        return new SpTips(strMulS$default, (xmvCreateProfitConverterWithIndex$default == null || (strEZpvd = xmvCreateProfitConverterWithIndex$default.EZpvd()) == null) ? "" : strEZpvd, str, xmvCreateProfitConverterWithIndex$default, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final SpTips EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, AbstractC54531xLw abstractC54531xLw, BizInstrument bizInstrument, java.lang.String str6, boolean z) {
        xMV xmvCreateProfitConverterWithIndex$default;
        java.lang.String strEZpvd;
        java.lang.String instFamily;
        java.lang.String strMulS$default = z ? C33129mqd.mulS$default(str6, C33129mqd.subS$default(C33129mqd.divS$default(str2, str, null, null, null, 14, null), 1, null, null, null, 14, null), null, null, null, 14, null) : C33129mqd.mulS$default(str6, C33129mqd.subS$default(C33129mqd.divS$default(str2, str, null, null, null, 14, null), 1, null, null, null, 14, null), null, null, null, 14, null);
        if (abstractC54531xLw != null) {
            if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
                instFamily = "";
            }
            xmvCreateProfitConverterWithIndex$default = AbstractC54531xLw.createProfitConverterWithIndex$default(abstractC54531xLw, instFamily, null, 2, null);
        } else {
            xmvCreateProfitConverterWithIndex$default = null;
        }
        if (xmvCreateProfitConverterWithIndex$default != null) {
            xmvCreateProfitConverterWithIndex$default.EZpvd();
        }
        return new SpTips(strMulS$default, (xmvCreateProfitConverterWithIndex$default == null || (strEZpvd = xmvCreateProfitConverterWithIndex$default.EZpvd()) == null) ? "" : strEZpvd, str, xmvCreateProfitConverterWithIndex$default, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final SpTips copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, AbstractC54531xLw abstractC54531xLw, BizInstrument bizInstrument, java.lang.String str6, boolean z) {
        xMV xmvCreateProfitConverterWithIndex$default;
        java.lang.String strEZpvd;
        java.lang.String instFamily;
        java.lang.String strMulS$default = z ? C33129mqd.mulS$default(str6, C33129mqd.subS$default(C33129mqd.divS$default(str, str2, null, null, null, 14, null), 1, null, null, null, 14, null), null, null, null, 14, null) : C33129mqd.mulS$default(str6, C33129mqd.subS$default(C33129mqd.divS$default(str, str2, null, null, null, 14, null), 1, null, null, null, 14, null), null, null, null, 14, null);
        if (abstractC54531xLw != null) {
            if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
                instFamily = "";
            }
            xmvCreateProfitConverterWithIndex$default = AbstractC54531xLw.createProfitConverterWithIndex$default(abstractC54531xLw, instFamily, null, 2, null);
        } else {
            xmvCreateProfitConverterWithIndex$default = null;
        }
        if (xmvCreateProfitConverterWithIndex$default != null) {
            xmvCreateProfitConverterWithIndex$default.EZpvd();
        }
        return new SpTips(strMulS$default, (xmvCreateProfitConverterWithIndex$default == null || (strEZpvd = xmvCreateProfitConverterWithIndex$default.EZpvd()) == null) ? "" : strEZpvd, str, xmvCreateProfitConverterWithIndex$default, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final SpTips KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, AbstractC54531xLw abstractC54531xLw, BizInstrument bizInstrument, java.lang.String str6, boolean z) {
        xMV xmvCreateProfitConverterWithIndex$default;
        java.lang.String strEZpvd;
        java.lang.String instFamily;
        java.lang.String strMulS$default = z ? C33129mqd.mulS$default(str6, C33129mqd.subS$default(1, C33129mqd.divS$default(str, str2, null, null, null, 14, null), null, null, null, 14, null), null, null, null, 14, null) : C33129mqd.mulS$default(str6, C33129mqd.subS$default(1, C33129mqd.divS$default(str, str2, null, null, null, 14, null), null, null, null, 14, null), null, null, null, 14, null);
        if (abstractC54531xLw != null) {
            if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
                instFamily = "";
            }
            xmvCreateProfitConverterWithIndex$default = AbstractC54531xLw.createProfitConverterWithIndex$default(abstractC54531xLw, instFamily, null, 2, null);
        } else {
            xmvCreateProfitConverterWithIndex$default = null;
        }
        if (xmvCreateProfitConverterWithIndex$default != null) {
            xmvCreateProfitConverterWithIndex$default.EZpvd();
        }
        return new SpTips(strMulS$default, (xmvCreateProfitConverterWithIndex$default == null || (strEZpvd = xmvCreateProfitConverterWithIndex$default.EZpvd()) == null) ? "" : strEZpvd, str, xmvCreateProfitConverterWithIndex$default, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }
}
