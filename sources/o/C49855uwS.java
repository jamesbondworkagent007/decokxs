package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.okinc.biz.OptionLimitSubtype;
import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.web.WebActivity;
import java.math.RoundingMode;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uwS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49855uwS {
    public static final C49855uwS copydefault = new C49855uwS();
    public static final java.lang.String AEQbTJ = "{v1}{v2}{v3}";

    private C49855uwS() {
    }

    public static /* synthetic */ java.lang.String getConfirmType$default(C49855uwS c49855uwS, java.lang.String str, java.lang.String str2, InterfaceC6806aWN interfaceC6806aWN, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            interfaceC6806aWN = null;
        }
        return c49855uwS.EZpvd(str, str2, interfaceC6806aWN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [164=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String EZpvd(java.lang.String str, @NotNull java.lang.String str2, InterfaceC6806aWN interfaceC6806aWN) {
        java.lang.String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(str2, "");
        switch (str2.hashCode()) {
            case -1081306052:
                return !str2.equals("market") ? "" : AEQbTJ(str, C33070mpX.AYXKKw(C55688xof.Application.createFullyDrawnExecutor));
            case -1059891784:
                return !str2.equals("trigger") ? "" : AEQbTJ(str, C33070mpX.AYXKKw(C55688xof.Application.lambdanew2));
            case 101570:
                if (!str2.equals("fok")) {
                    return "";
                }
                return AEQbTJ(str, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickVisualMediaVisualMediaType));
            case 104445:
                if (!str2.equals("ioc")) {
                    return "";
                }
                return AEQbTJ(str, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickVisualMediaVisualMediaType));
            case 109851:
                if (!str2.equals("oco")) {
                    return "";
                }
                return AEQbTJ(str, C33070mpX.AYXKKw(C55688xof.Application.addContentView));
            case 102976443:
                if (!str2.equals("limit")) {
                    return "";
                }
                if (interfaceC6806aWN == OptionLimitSubtype.TRACKING_IV) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ahrCSq);
                } else if (interfaceC6806aWN == OptionLimitSubtype.TRACKING_USD) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.aSdHwS);
                }
                return AEQbTJ(str, strAYXKKw + C33070mpX.AYXKKw(C55688xof.Application.OTJFaA));
            case 1208131206:
                if (!str2.equals("conditional")) {
                    return "";
                }
                return AEQbTJ(str, C33070mpX.AYXKKw(C55688xof.Application.addContentView));
            case 2002822123:
                if (!str2.equals("post_only")) {
                    return "";
                }
                return AEQbTJ(str, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickVisualMediaVisualMediaType));
            default:
                return "";
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return copydefault(AEQbTJ, C56424yEw.gEmmrt(C56390yDp.OLrzqt("v1", ""), C56390yDp.OLrzqt("v2", ""), C56390yDp.OLrzqt("v3", str2)));
        }
        return copydefault(AEQbTJ, C56424yEw.gEmmrt(C56390yDp.OLrzqt("v1", OLrzqt(str)), C56390yDp.OLrzqt("v2", "-"), C56390yDp.OLrzqt("v3", str2)));
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "cross") ? C33070mpX.AYXKKw(C55688xof.Application.gBtXYZ) : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "isolated") ? C33070mpX.AYXKKw(C55688xof.Application.pauseLocationServices) : "";
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String tradeSymbol;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null) : null;
        int iHashCode = str.hashCode();
        if (iHashCode == -1956807563) {
            return (!str.equals("OPTION") || suggestedInstrument$default == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) ? "" : tradeSymbol;
        }
        if (iHashCode != 2558355) {
            if (iHashCode != 214415088 || !str.equals("FUTURES")) {
                return "";
            }
        } else if (!str.equals("SWAP")) {
            return "";
        }
        if (suggestedInstrument$default != null) {
            return suggestedInstrument$default.getMarginSymbol();
        }
        return null;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TradeType tradeType, @NotNull java.lang.String str3) {
        java.lang.String tradeSymbol;
        java.lang.String quoteSymbol;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null) : null;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT")) {
            if (tradeType == TradeType.BUY_OPEN) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                    return str3;
                }
                if (suggestedInstrument$default != null && (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) != null) {
                    return quoteSymbol;
                }
            } else if (suggestedInstrument$default != null && (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) != null) {
                return tradeSymbol;
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
            return str3;
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uwS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String getFormattedString$default(C49855uwS c49855uwS, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return c49855uwS.copydefault(str, map);
    }

    public final void copydefault(final android.content.Context context) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C49511upt.Activity.accept);
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C49511upt.Activity.valueOf), new View.OnClickListener() { // from class: o.uwW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C49855uwS.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C49511upt.Activity.AYXKKw), new View.OnClickListener() { // from class: o.uwU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C49855uwS.OLrzqt(viewOnClickListenerC54939xaY, context, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.content.Context context, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        copydefault.OLrzqt(context);
    }

    public final void OLrzqt(android.content.Context context) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C49511upt.Activity.DAIeex)));
        if (context != null) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, bundleBundleOf, null, 4, null);
        }
    }

    public static /* synthetic */ java.lang.String getLeverShow$default(C49855uwS c49855uwS, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c49855uwS.AEQbTJ(str, z);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, boolean z) {
        if (C33129mqd.valueOf(C33129mqd.EZpvd(str).setScale(2, RoundingMode.HALF_UP), 0)) {
            return "";
        }
        java.lang.String roundToMax$default = pTB.formatRoundToMax$default(C33129mqd.EZpvd(str), 2, null, 2, null);
        if (!z) {
            return roundToMax$default;
        }
        return roundToMax$default + "x";
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String strReplace$default = str;
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            strReplace$default = C59449zhJ.replace$default(strReplace$default, "{" + ((java.lang.Object) entry.getKey()) + "}", java.lang.String.valueOf(entry.getValue()), false, 4, (java.lang.Object) null);
        }
        return strReplace$default;
    }
}
