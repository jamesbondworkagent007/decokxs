package o;

import com.okinc.unify_trade.biz.BizInstrument;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56066xvm {
    public static final C56066xvm EZpvd = new C56066xvm();

    private C56066xvm() {
    }

    public final InterfaceC54581xNr AEQbTJ() {
        return C54589xNz.EZpvd.copydefault();
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BizInstrument bizInstrumentOLrzqt = OLrzqt(str, str2);
        java.lang.String instFamily = bizInstrumentOLrzqt != null ? bizInstrumentOLrzqt.getInstFamily() : null;
        java.lang.String str3 = instFamily != null ? instFamily : "";
        return str3.length() == 0 ? xUW.KWHzl.AEQbTJ(str) : str3;
    }

    public final int AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrAEQbTJ = AEQbTJ();
        if (interfaceC54581xNrAEQbTJ == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrAEQbTJ.OLrzqt(str2)) == null) {
            return 4;
        }
        java.lang.String strCopydefault = AbstractC54531xLw.createProfitConverterWithIndex$default(abstractC54531xLwOLrzqt, KWHzl(str, str2), null, 2, null).copydefault();
        if (strCopydefault == null || strCopydefault.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            strCopydefault = "4";
        }
        return C33129mqd.AhwBna(strCopydefault);
    }

    public static /* synthetic */ java.lang.String getPnlUnit$default(C56066xvm c56066xvm, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c56066xvm.KWHzl(str, str2, str3);
    }

    public final java.lang.String KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, java.lang.String str3) {
        java.lang.String profitSymbol;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str3 != null && str3.length() != 0) {
            return str3;
        }
        Function0 function0 = new Function0() { // from class: o.xvn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56066xvm.EZpvd(str, str2);
            }
        };
        InterfaceC54581xNr interfaceC54581xNrAEQbTJ = AEQbTJ();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrAEQbTJ != null ? interfaceC54581xNrAEQbTJ.OLrzqt(str2) : null;
        BizInstrument bizInstrumentOLrzqt = OLrzqt(str, str2);
        if (abstractC54531xLwOLrzqt == null || bizInstrumentOLrzqt == null) {
            return (java.lang.String) function0.invoke();
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "FUTURES")) {
            profitSymbol = bizInstrumentOLrzqt.getProfitSymbol();
        } else {
            profitSymbol = bizInstrumentOLrzqt.getQuoteSymbol();
        }
        if (profitSymbol.length() != 0) {
            return profitSymbol;
        }
        java.lang.String strEZpvd = AbstractC54531xLw.createProfitConverterWithIndex$default(abstractC54531xLwOLrzqt, EZpvd.KWHzl(str, str2), null, 2, null).EZpvd();
        int length = strEZpvd.length();
        java.lang.Object objInvoke = strEZpvd;
        if (length == 0) {
            objInvoke = function0.invoke();
        }
        return (java.lang.String) objInvoke;
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String strCopydefault = C56078xvy.copydefault(str, str2);
        if (strCopydefault.length() != 0) {
            return strCopydefault;
        }
        java.lang.String upperCase = TaskDescription.AEQbTJ(str).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static /* synthetic */ java.lang.String getMarginUnit$default(C56066xvm c56066xvm, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c56066xvm.OLrzqt(str, str2, str3);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl(str, str2, str3);
    }

    public final BizInstrument OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrAEQbTJ = AEQbTJ();
        if (interfaceC54581xNrAEQbTJ != null) {
            return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrAEQbTJ, str2, str, null, null, 12, null);
        }
        return null;
    }

    public static /* synthetic */ java.lang.String getPriceUnit$default(C56066xvm c56066xvm, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c56066xvm.AEQbTJ(str, str2, str3);
    }

    public final java.lang.String AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.String str3) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Function0 function0 = new Function0() { // from class: o.xvl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56066xvm.copydefault(str2, str3, str);
            }
        };
        InterfaceC54581xNr interfaceC54581xNrAEQbTJ = AEQbTJ();
        if (interfaceC54581xNrAEQbTJ == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrAEQbTJ.OLrzqt(str2)) == null) {
            return (java.lang.String) function0.invoke();
        }
        java.lang.String strGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(KWHzl(str, str2)).AYXKKw("0").gEmmrt();
        return strGEmmrt.length() == 0 ? (java.lang.String) function0.invoke() : strGEmmrt;
    }

    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || str2 == null) {
            java.lang.String upperCase = TaskDescription.AEQbTJ(str3).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return upperCase;
        }
        java.lang.String upperCase2 = TaskDescription.AEQbTJ(str2).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return upperCase2;
    }

    public static final Unit EZpvd(C54536xML c54536xML) {
        Intrinsics.checkNotNullParameter(c54536xML, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.xvm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String formatCoinSize$default(C56066xvm c56066xvm, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        java.lang.String str5 = str4;
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: o.xvj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C56066xvm.EZpvd((C54536xML) obj2);
                }
            };
        }
        return c56066xvm.EZpvd(str, str2, str3, str5, function1);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull Function1<? super C54536xML, Unit> function1) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str3.length() == 0) {
            return "--";
        }
        InterfaceC54581xNr interfaceC54581xNrAEQbTJ = AEQbTJ();
        java.lang.String safeString$default = null;
        xMV xmvAYXKKw = (interfaceC54581xNrAEQbTJ == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrAEQbTJ.OLrzqt(str2)) == null) ? null : abstractC54531xLwOLrzqt.AYXKKw(KWHzl(str, str2), str4);
        if (xmvAYXKKw == null) {
            return pTB.formatICUNumber$default(C33129mqd.EZpvd(str3), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(4), null, null, 12, null);
        }
        C54536xML c54536xMLCopydefault = xmvAYXKKw.copydefault(C33129mqd.gEmmrt(str3));
        if (c54536xMLCopydefault != null) {
            function1.invoke(c54536xMLCopydefault);
            safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null);
        }
        return xVG.KWHzl(safeString$default);
    }
}
