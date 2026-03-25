package o;

import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xoe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55687xoe {
    public static final C55687xoe AEQbTJ = new C55687xoe();

    private C55687xoe() {
    }

    public final boolean AEQbTJ() {
        java.lang.Boolean boolFetchVPNInfo;
        xND xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43248rlh.KWHzl.AEQbTJ(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ();
        if (xndAEQbTJ == null || (boolFetchVPNInfo = xndAEQbTJ.fetchVPNInfo()) == null) {
            return true;
        }
        return boolFetchVPNInfo.booleanValue();
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        java.lang.String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(str) : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strValueOf)) {
            return java.lang.String.valueOf(strValueOf);
        }
        return KWHzl(str);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        java.lang.String strEZpvd = C43386roM.EZpvd.EZpvd();
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return strEZpvd + "/cdn/oksupport/asset/currency/icon/" + lowerCase + ".png";
    }
}
