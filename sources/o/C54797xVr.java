package o;

import com.okinc.unify_trade.biz.BizInstrument;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54797xVr {
    public static final C54797xVr copydefault = new C54797xVr();

    private C54797xVr() {
    }

    public final java.lang.String AEQbTJ(boolean z, boolean z2, @NotNull java.lang.String str, int i, @NotNull RoundingMode roundingMode, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (!z || !z2) {
            if (z) {
                return C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(!z3), roundingMode);
            }
            return z2 ? xMR.copydefault.copydefault(str) : str;
        }
        if (roundingMode == RoundingMode.UP) {
            xMR xmr = xMR.copydefault;
            return z3 ? xmr.AYXKKw(str, i) : xmr.AhwBna(str, i);
        }
        if (roundingMode == RoundingMode.DOWN) {
            xMR xmr2 = xMR.copydefault;
            return z3 ? xmr2.OLrzqt(str, i) : xmr2.copydefault(str, i);
        }
        xMR xmr3 = xMR.copydefault;
        return z3 ? xmr3.OLrzqt(str, i) : xmr3.copydefault(str, i);
    }

    public static /* synthetic */ java.lang.String getCorrectShowLeverage$default(C54797xVr c54797xVr, java.lang.String str, boolean z, java.lang.String str2, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return c54797xVr.KWHzl(str, z, str2, z2);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str.length() == 0 ? str2 : AEQbTJ(true, z, str, 2, RoundingMode.UP, z2);
    }

    public static /* synthetic */ java.lang.String getCorrectShowLeverageWithSymbol$default(C54797xVr c54797xVr, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, boolean z2, int i, java.lang.Object obj) {
        boolean z3 = (i & 2) != 0 ? true : z;
        if ((i & 4) != 0) {
            str2 = " ";
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = "--";
        }
        return c54797xVr.copydefault(str, z3, str4, str3, (i & 16) != 0 ? true : z2);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str.length() == 0) {
            return str3;
        }
        return KWHzl(str, z, str3, z2) + "x";
    }

    public final xMS AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String instFamily;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str2) : null;
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.valueOf(str) : null;
        if (abstractC54531xLwOLrzqt == null) {
            return null;
        }
        if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
            str3 = instFamily;
        }
        return abstractC54531xLwOLrzqt.gEmmrt(str3);
    }

    public static /* synthetic */ C54571xNh createAmtConvertor$default(C54797xVr c54797xVr, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, int i, java.lang.Object obj) {
        java.lang.String str5 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            z = false;
        }
        return c54797xVr.KWHzl(str, str2, str5, z, (i & 16) != 0 ? null : str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C54571xNh KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4) {
        java.lang.String instFamily;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str2) : null;
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.valueOf(str) : null;
        boolean zContains = yDY.gEmmrt("SWAP", "FUTURES").contains(str2);
        if (abstractC54531xLwOLrzqt == null) {
            return null;
        }
        if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
            str5 = instFamily;
        }
        if (!z || zContains) {
            str4 = null;
        } else if (!C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            if (bizInstrumentValueOf != null) {
                str4 = bizInstrumentValueOf.getQuoteSymbol();
            }
        }
        C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(str5, str4);
        if (c54571xNhAhwBna == null) {
            return null;
        }
        if (str3 != null && str3.length() != 0) {
            c54571xNhAhwBna.AhwBna(str3);
        }
        return c54571xNhAhwBna;
    }

    public static /* synthetic */ C54571xNh createAmtConvertorForSegment$default(C54797xVr c54797xVr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = "0";
        }
        return c54797xVr.EZpvd(str, str2, str3, str4);
    }

    public final C54571xNh EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4) {
        C54571xNh c54571xNhDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str2) : null;
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.valueOf(str) : null;
        if (bizInstrumentValueOf != null && bizInstrumentValueOf.isPositiveContract()) {
            c54571xNhDjBIcL = abstractC54531xLwOLrzqt.djBIcL(bizInstrumentValueOf.getInstFamily(), str4);
        } else {
            c54571xNhDjBIcL = (bizInstrumentValueOf == null || !Intrinsics.EZpvd(bizInstrumentValueOf.isNegativeContract(), java.lang.Boolean.TRUE)) ? null : abstractC54531xLwOLrzqt.djBIcL(bizInstrumentValueOf.getInstFamily(), "1");
        }
        if (c54571xNhDjBIcL == null) {
            return null;
        }
        if (str3 != null && str3.length() != 0) {
            c54571xNhDjBIcL.AhwBna(str3);
        }
        return c54571xNhDjBIcL;
    }
}
