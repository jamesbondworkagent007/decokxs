package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54801xVv {
    public static final C54801xVv OLrzqt = new C54801xVv();

    private C54801xVv() {
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        BizInstrument suggestedInstrument$default;
        java.lang.String lotSize;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str3, str2, null, null, 12, null)) == null || (lotSize = suggestedInstrument$default.getLotSize()) == null) {
            return null;
        }
        return xVK.EZpvd.gEmmrt(str, lotSize, str2, str3);
    }

    public final java.lang.String[] OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str3)) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str2)) == null) {
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) abstractC54531xLwOLrzqt.copydefault(bizInstrumentValueOf), (java.lang.Object) "linear") && !Intrinsics.EZpvd((java.lang.Object) abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf), (java.lang.Object) "2")) {
            C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, "1", false, null, 24, null);
            if (c54571xNhCreateAmtConvertor$default != null && (c54536xMLDjBIcL = c54571xNhCreateAmtConvertor$default.djBIcL(bizInstrumentValueOf.getLotSize())) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                str4 = safeString$default;
            }
            pairCopydefault = xVK.EZpvd.copydefault(str, str4, str2, str3);
        } else {
            pairCopydefault = (Intrinsics.EZpvd((java.lang.Object) abstractC54531xLwOLrzqt.copydefault(bizInstrumentValueOf), (java.lang.Object) "inverse") && Intrinsics.EZpvd((java.lang.Object) abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf), (java.lang.Object) "1")) ? xVK.EZpvd.copydefault(str, bizInstrumentValueOf.getLotSize(), str2, str3) : null;
        }
        if (pairCopydefault == null) {
            return null;
        }
        return xVK.EZpvd.EZpvd(pairCopydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: o.xLw */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        C54571xNh c54571xNhAhwBna;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        C54571xNh c54571xNhAhwBna2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLDjBIcL3;
        C54571xNh c54571xNhAhwBna3;
        C54536xML c54536xMLFetchVPNInfo3;
        C54536xML c54536xMLDjBIcL4;
        C54571xNh c54571xNhAhwBna4;
        C54571xNh c54571xNhKWHzl;
        C54571xNh c54571xNhAhwBna5;
        C54536xML c54536xMLDjBIcL5;
        C54536xML c54536xMLFetchVPNInfo4;
        C54536xML c54536xMLDjBIcL6;
        C54571xNh c54571xNhAhwBna6;
        C54536xML c54536xMLFetchVPNInfo5;
        C54536xML c54536xMLDjBIcL7;
        C54571xNh c54571xNhAhwBna7;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return "";
        }
        if (str4 == null) {
            str4 = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str4);
        if (abstractC54531xLwOLrzqt == 0) {
            return "";
        }
        if (str3 == null) {
            str3 = "";
        }
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str3);
        if (bizInstrumentValueOf == null) {
            return "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) abstractC54531xLwOLrzqt.copydefault(bizInstrumentValueOf), (java.lang.Object) "linear")) {
            java.lang.String strGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf);
            switch (strGEmmrt.hashCode()) {
                case 48:
                    if (!strGEmmrt.equals("0")) {
                        return "";
                    }
                    InterfaceC54532xLx interfaceC54532xLx = (InterfaceC54532xLx) abstractC54531xLwOLrzqt;
                    C54571xNh c54571xNhOLrzqt = interfaceC54532xLx.OLrzqt(bizInstrumentValueOf.getInstFamily());
                    java.lang.String strEZpvd = (c54571xNhOLrzqt == null || (c54571xNhAhwBna4 = c54571xNhOLrzqt.AhwBna(str)) == null) ? null : c54571xNhAhwBna4.EZpvd(str2);
                    C54571xNh c54571xNhKWHzl2 = interfaceC54532xLx.KWHzl(bizInstrumentValueOf.getInstFamily());
                    if (c54571xNhKWHzl2 == null || (c54571xNhAhwBna3 = c54571xNhKWHzl2.AhwBna(str)) == null) {
                        return "";
                    }
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                    C54536xML c54536xMLDjBIcL8 = c54571xNhAhwBna3.djBIcL(strEZpvd);
                    if (c54536xMLDjBIcL8 == null || (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL8.fetchVPNInfo()) == null || (c54536xMLDjBIcL4 = c54536xMLFetchVPNInfo3.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL4, false, 1, null)) == null) {
                        return "";
                    }
                    break;
                case 49:
                    if (!strGEmmrt.equals("1") || (c54571xNhKWHzl = ((InterfaceC54532xLx) abstractC54531xLwOLrzqt).KWHzl(bizInstrumentValueOf.getInstFamily())) == null || (c54571xNhAhwBna5 = c54571xNhKWHzl.AhwBna(str)) == null || (c54536xMLDjBIcL5 = c54571xNhAhwBna5.djBIcL(str2)) == null || (c54536xMLFetchVPNInfo4 = c54536xMLDjBIcL5.fetchVPNInfo()) == null || (c54536xMLDjBIcL6 = c54536xMLFetchVPNInfo4.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL6, false, 1, null)) == null) {
                        return "";
                    }
                    break;
                case 50:
                    if (!strGEmmrt.equals("2")) {
                        return "";
                    }
                    InterfaceC54532xLx interfaceC54532xLx2 = (InterfaceC54532xLx) abstractC54531xLwOLrzqt;
                    C54571xNh c54571xNhKWHzl3 = interfaceC54532xLx2.KWHzl(bizInstrumentValueOf.getInstFamily());
                    java.lang.String strEZpvd2 = (c54571xNhKWHzl3 == null || (c54571xNhAhwBna7 = c54571xNhKWHzl3.AhwBna(str)) == null) ? null : c54571xNhAhwBna7.EZpvd(str2);
                    C54571xNh c54571xNhOLrzqt2 = interfaceC54532xLx2.OLrzqt(bizInstrumentValueOf.getInstFamily());
                    if (c54571xNhOLrzqt2 == null || (c54571xNhAhwBna6 = c54571xNhOLrzqt2.AhwBna(str)) == null) {
                        return "";
                    }
                    if (strEZpvd2 == null) {
                        strEZpvd2 = "";
                    }
                    C54536xML c54536xMLDjBIcL9 = c54571xNhAhwBna6.djBIcL(strEZpvd2);
                    if (c54536xMLDjBIcL9 == null || (c54536xMLFetchVPNInfo5 = c54536xMLDjBIcL9.fetchVPNInfo()) == null || (c54536xMLDjBIcL7 = c54536xMLFetchVPNInfo5.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL7, false, 1, null)) == null) {
                        return "";
                    }
                    break;
                default:
                    return "";
            }
        } else {
            java.lang.String strEZpvd3 = abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf.getInstFamily()).EZpvd(str);
            java.lang.String strGEmmrt2 = abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf);
            if (Intrinsics.EZpvd((java.lang.Object) strGEmmrt2, (java.lang.Object) "1")) {
                C54571xNh c54571xNhOLrzqt3 = ((InterfaceC54532xLx) abstractC54531xLwOLrzqt).OLrzqt(bizInstrumentValueOf.getInstFamily());
                if (c54571xNhOLrzqt3 == null || (c54571xNhAhwBna2 = c54571xNhOLrzqt3.AhwBna(strEZpvd3)) == null || (c54536xMLDjBIcL2 = c54571xNhAhwBna2.djBIcL(str2)) == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (c54536xMLDjBIcL3 = c54536xMLFetchVPNInfo2.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL3, false, 1, null)) == null) {
                    return "";
                }
            } else {
                if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt2, (java.lang.Object) "2")) {
                    return "";
                }
                InterfaceC54532xLx interfaceC54532xLx3 = (InterfaceC54532xLx) abstractC54531xLwOLrzqt;
                java.lang.String strEZpvd4 = interfaceC54532xLx3.EZpvd(bizInstrumentValueOf.getInstFamily()).EZpvd(str2);
                C54571xNh c54571xNhOLrzqt4 = interfaceC54532xLx3.OLrzqt(bizInstrumentValueOf.getInstFamily());
                if (c54571xNhOLrzqt4 == null || (c54571xNhAhwBna = c54571xNhOLrzqt4.AhwBna(strEZpvd3)) == null) {
                    return "";
                }
                if (strEZpvd4 == null) {
                    strEZpvd4 = "";
                }
                C54536xML c54536xMLDjBIcL10 = c54571xNhAhwBna.djBIcL(strEZpvd4);
                if (c54536xMLDjBIcL10 == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL10.fetchVPNInfo()) == null || (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
                    return "";
                }
            }
        }
        return safeString$default;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: o.xLw */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        C54571xNh c54571xNhAhwBna;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL3;
        C54571xNh c54571xNhOLrzqt;
        C54571xNh c54571xNhAhwBna2;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLDjBIcL4;
        C54571xNh c54571xNhOLrzqt2;
        C54571xNh c54571xNhAhwBna3;
        C54536xML c54536xMLDjBIcL5;
        C54536xML c54536xMLFetchVPNInfo3;
        C54536xML c54536xMLDjBIcL6;
        C54571xNh c54571xNhAhwBna4;
        C54536xML c54536xMLFetchVPNInfo4;
        C54536xML c54536xMLDjBIcL7;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return "";
        }
        if (str4 == null) {
            str4 = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str4);
        if (abstractC54531xLwOLrzqt == 0) {
            return "";
        }
        if (str3 == null) {
            str3 = "";
        }
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str3);
        if (bizInstrumentValueOf == null) {
            return "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) abstractC54531xLwOLrzqt.copydefault(bizInstrumentValueOf), (java.lang.Object) "linear")) {
            java.lang.String strGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf);
            switch (strGEmmrt.hashCode()) {
                case 48:
                    if (!strGEmmrt.equals("0") || (c54571xNhOLrzqt = ((InterfaceC54532xLx) abstractC54531xLwOLrzqt).OLrzqt(bizInstrumentValueOf.getInstFamily())) == null || (c54571xNhAhwBna2 = c54571xNhOLrzqt.AhwBna(str)) == null || (c54536xMLOLrzqt = c54571xNhAhwBna2.OLrzqt(str2)) == null || (c54536xMLFetchVPNInfo2 = c54536xMLOLrzqt.fetchVPNInfo()) == null || (c54536xMLDjBIcL4 = c54536xMLFetchVPNInfo2.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL4, false, 1, null)) == null) {
                        return "";
                    }
                    break;
                case 49:
                    if (!strGEmmrt.equals("1") || (c54571xNhOLrzqt2 = ((InterfaceC54532xLx) abstractC54531xLwOLrzqt).OLrzqt(bizInstrumentValueOf.getInstFamily())) == null || (c54571xNhAhwBna3 = c54571xNhOLrzqt2.AhwBna(str)) == null || (c54536xMLDjBIcL5 = c54571xNhAhwBna3.djBIcL(str2)) == null || (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL5.fetchVPNInfo()) == null || (c54536xMLDjBIcL6 = c54536xMLFetchVPNInfo3.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL6, false, 1, null)) == null) {
                        return "";
                    }
                    break;
                case 50:
                    if (!strGEmmrt.equals("2")) {
                        return "";
                    }
                    java.lang.String strKWHzl = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, bizInstrumentValueOf.getInstFamily(), null, 2, null).AhwBna(str).KWHzl(str2);
                    C54571xNh c54571xNhOLrzqt3 = ((InterfaceC54532xLx) abstractC54531xLwOLrzqt).OLrzqt(bizInstrumentValueOf.getInstFamily());
                    if (c54571xNhOLrzqt3 == null || (c54571xNhAhwBna4 = c54571xNhOLrzqt3.AhwBna(str)) == null) {
                        return "";
                    }
                    if (strKWHzl == null) {
                        strKWHzl = "";
                    }
                    C54536xML c54536xMLDjBIcL8 = c54571xNhAhwBna4.djBIcL(strKWHzl);
                    if (c54536xMLDjBIcL8 == null || (c54536xMLFetchVPNInfo4 = c54536xMLDjBIcL8.fetchVPNInfo()) == null || (c54536xMLDjBIcL7 = c54536xMLFetchVPNInfo4.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL7, false, 1, null)) == null) {
                        return "";
                    }
                    break;
                default:
                    return "";
            }
        } else {
            java.lang.String strEZpvd = abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf.getInstFamily()).EZpvd(str);
            if (Intrinsics.EZpvd((java.lang.Object) abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf), (java.lang.Object) "1")) {
                C54571xNh c54571xNhOLrzqt4 = ((InterfaceC54532xLx) abstractC54531xLwOLrzqt).OLrzqt(bizInstrumentValueOf.getInstFamily());
                if (c54571xNhOLrzqt4 == null || (c54571xNhAhwBna = c54571xNhOLrzqt4.AhwBna(strEZpvd)) == null || (c54536xMLDjBIcL2 = c54571xNhAhwBna.djBIcL(str2)) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (c54536xMLDjBIcL3 = c54536xMLFetchVPNInfo.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL3, false, 1, null)) == null) {
                    return "";
                }
            } else {
                C54536xML c54536xMLFetchVPNInfo5 = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, bizInstrumentValueOf.getInstFamily(), null, 2, null).AhwBna(strEZpvd).OLrzqt(str2).fetchVPNInfo();
                if (c54536xMLFetchVPNInfo5 == null || (c54536xMLDjBIcL = c54536xMLFetchVPNInfo5.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
                    return "";
                }
            }
        }
        return safeString$default;
    }
}
