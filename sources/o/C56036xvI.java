package o;

import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.ArbitrageInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56036xvI {
    public static final C56036xvI KWHzl = new C56036xvI();

    private C56036xvI() {
    }

    public final ArbitrageInfo copydefault() {
        ArbitrageInfo arbitrageInfo = (ArbitrageInfo) SPUtils.getObject(OLrzqt(), ArbitrageInfo.class);
        if (arbitrageInfo != null) {
            return arbitrageInfo;
        }
        ArbitrageInfo arbitrageInfo2 = new ArbitrageInfo("SPOT", "BTC-USDT", null, null, "sell", "net", "cash");
        copydefault(arbitrageInfo2);
        return arbitrageInfo2;
    }

    public final ArbitrageInfo AEQbTJ() {
        C56084xwD fieldNames;
        ArbitrageInfo arbitrageInfo = (ArbitrageInfo) SPUtils.getObject(AhwBna(), ArbitrageInfo.class);
        if (arbitrageInfo != null) {
            return arbitrageInfo;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        ArbitrageInfo arbitrageInfo2 = new ArbitrageInfo("SWAP", "BTC-USDT-SWAP", null, null, "buy", Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null) ? null : fieldNames.AYXKKw()), (java.lang.Object) "long_short_mode") ? "long" : "net", "cross");
        KWHzl(arbitrageInfo2);
        return arbitrageInfo2;
    }

    public final void copydefault(@NotNull ArbitrageInfo arbitrageInfo) {
        Intrinsics.checkNotNullParameter(arbitrageInfo, "");
        SPUtils.put(OLrzqt(), arbitrageInfo);
    }

    public final void KWHzl(@NotNull ArbitrageInfo arbitrageInfo) {
        Intrinsics.checkNotNullParameter(arbitrageInfo, "");
        SPUtils.put(AhwBna(), arbitrageInfo);
    }

    public final void EZpvd(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        ArbitrageInfo arbitrageInfo = (ArbitrageInfo) SPUtils.getObject(OLrzqt(), ArbitrageInfo.class);
        if (arbitrageInfo == null) {
            boolean z = bizInstrument instanceof FutureInstrument;
            copydefault(new ArbitrageInfo(bizInstrument.getInstType(), !Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES") ? bizInstrument.getInstId() : null, Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES") ? bizInstrument.getInstFamily() : null, z ? ((FutureInstrument) bizInstrument).getAlias() : null, "buy", (z || (bizInstrument instanceof SwapInstrument)) ? "long" : "net", "cross"));
            return;
        }
        arbitrageInfo.setInstType(bizInstrument.getInstType());
        arbitrageInfo.setInstId(!Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES") ? bizInstrument.getInstId() : null);
        arbitrageInfo.setUly(Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES") ? bizInstrument.getInstFamily() : null);
        arbitrageInfo.setAlias(bizInstrument instanceof FutureInstrument ? ((FutureInstrument) bizInstrument).getAlias() : null);
        KWHzl(bizInstrument, arbitrageInfo);
        arbitrageInfo.setMgnMode(AEQbTJ(bizInstrument, arbitrageInfo));
        copydefault(arbitrageInfo);
    }

    public final void OLrzqt(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        ArbitrageInfo arbitrageInfo = (ArbitrageInfo) SPUtils.getObject(AhwBna(), ArbitrageInfo.class);
        if (arbitrageInfo == null) {
            boolean z = bizInstrument instanceof FutureInstrument;
            KWHzl(new ArbitrageInfo(bizInstrument.getInstType(), !Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES") ? bizInstrument.getInstId() : null, Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES") ? bizInstrument.getInstFamily() : null, z ? ((FutureInstrument) bizInstrument).getAlias() : null, "buy", (z || (bizInstrument instanceof SwapInstrument)) ? "long" : "net", "cross"));
            return;
        }
        arbitrageInfo.setInstType(bizInstrument.getInstType());
        arbitrageInfo.setInstId(!Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES") ? bizInstrument.getInstId() : null);
        arbitrageInfo.setUly(Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES") ? bizInstrument.getInstFamily() : null);
        arbitrageInfo.setAlias(bizInstrument instanceof FutureInstrument ? ((FutureInstrument) bizInstrument).getAlias() : null);
        KWHzl(bizInstrument, arbitrageInfo);
        arbitrageInfo.setMgnMode(AEQbTJ(bizInstrument, arbitrageInfo));
        KWHzl(arbitrageInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [121=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r6.getMgnMode(), (java.lang.Object) "cash") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return r6.getMgnMode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return "cross";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r5.equals("FUTURES") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r5.equals("SWAP") == false) goto L60;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(@NotNull BizInstrument bizInstrument, @NotNull ArbitrageInfo arbitrageInfo) {
        xOW newProxyInstance;
        xOV xovEZpvd;
        xOW newProxyInstance2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance3;
        xOV xovEZpvd2;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(arbitrageInfo, "");
        java.lang.String instType = bizInstrument.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                if (instType.equals("MARGIN")) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
                    return (interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.OLrzqt()) ? !Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getMgnMode(), (java.lang.Object) "cash") ? arbitrageInfo.getMgnMode() : "cross" : "isolated";
                }
                return "cash";
            case -1956807563:
                if (instType.equals("OPTION")) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = C54589xNz.EZpvd.OLrzqt();
                    return Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt3 == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt3.getNewProxyInstance()) == null) ? null : newProxyInstance2.wlaJM()), (java.lang.Object) "1") ? "cash" : "cross";
                }
                return "cash";
            case 2552066:
                return (!instType.equals("SPOT") || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance3 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (xovEZpvd2 = newProxyInstance3.EZpvd()) == null || !xovEZpvd2.OLrzqt()) ? "cash" : "cross";
            case 2558355:
                break;
            case 214415088:
                break;
            default:
                return "cash";
        }
    }

    public final void KWHzl(@NotNull BizInstrument bizInstrument, @NotNull ArbitrageInfo arbitrageInfo) {
        C56084xwD fieldNames;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(arbitrageInfo, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strAYXKKw = (interfaceC54581xNrOLrzqt == null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null) ? null : fieldNames.AYXKKw();
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES")) {
            if ("long_short_mode".equals(strAYXKKw)) {
                if (Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getPosSide(), (java.lang.Object) "long") || Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getPosSide(), (java.lang.Object) "short")) {
                    return;
                }
                arbitrageInfo.setPosSide("long");
                return;
            }
            arbitrageInfo.setPosSide("net");
            return;
        }
        arbitrageInfo.setPosSide("net");
    }

    public final void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        ArbitrageInfo arbitrageInfoCopydefault = copydefault();
        if (arbitrageInfoCopydefault != null) {
            arbitrageInfoCopydefault.setSide(str);
        }
        if (arbitrageInfoCopydefault != null) {
            arbitrageInfoCopydefault.setPosSide(str2);
        }
        copydefault(arbitrageInfoCopydefault);
    }

    public final void OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        ArbitrageInfo arbitrageInfoAEQbTJ = AEQbTJ();
        if (arbitrageInfoAEQbTJ != null) {
            arbitrageInfoAEQbTJ.setSide(str);
        }
        if (arbitrageInfoAEQbTJ != null) {
            arbitrageInfoAEQbTJ.setPosSide(str2);
        }
        KWHzl(arbitrageInfoAEQbTJ);
    }

    public final void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        ArbitrageInfo arbitrageInfoCopydefault = copydefault();
        arbitrageInfoCopydefault.setInstType(str);
        arbitrageInfoCopydefault.setInstId(str2);
        copydefault(arbitrageInfoCopydefault);
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        ArbitrageInfo arbitrageInfoAEQbTJ = AEQbTJ();
        arbitrageInfoAEQbTJ.setInstType(str);
        arbitrageInfoAEQbTJ.setInstId(str2);
        KWHzl(arbitrageInfoAEQbTJ);
    }

    public final void EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        C56084xwD fieldNames;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ArbitrageInfo arbitrageInfoCopydefault = copydefault();
        arbitrageInfoCopydefault.setInstType(str);
        java.lang.String strAYXKKw = null;
        if (Intrinsics.EZpvd((java.lang.Object) arbitrageInfoCopydefault.getInstType(), (java.lang.Object) "FUTURES")) {
            str2 = null;
        }
        arbitrageInfoCopydefault.setInstId(str2);
        arbitrageInfoCopydefault.setUly(str3);
        arbitrageInfoCopydefault.setAlias(str4);
        arbitrageInfoCopydefault.setSide("sell");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) != null) {
            strAYXKKw = fieldNames.AYXKKw();
        }
        arbitrageInfoCopydefault.setPosSide(Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "long_short_mode") ? "short" : "net");
        copydefault(arbitrageInfoCopydefault);
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        C56084xwD fieldNames;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ArbitrageInfo arbitrageInfoAEQbTJ = AEQbTJ();
        arbitrageInfoAEQbTJ.setInstType(str);
        java.lang.String strAYXKKw = null;
        if (Intrinsics.EZpvd((java.lang.Object) arbitrageInfoAEQbTJ.getInstType(), (java.lang.Object) "FUTURES")) {
            str2 = null;
        }
        arbitrageInfoAEQbTJ.setInstId(str2);
        arbitrageInfoAEQbTJ.setUly(str3);
        arbitrageInfoAEQbTJ.setAlias(str4);
        arbitrageInfoAEQbTJ.setSide("buy");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) != null) {
            strAYXKKw = fieldNames.AYXKKw();
        }
        arbitrageInfoAEQbTJ.setPosSide(Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "long_short_mode") ? "long" : "net");
        KWHzl(arbitrageInfoAEQbTJ);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ArbitrageInfo arbitrageInfoCopydefault = copydefault();
        arbitrageInfoCopydefault.setMgnMode(str);
        copydefault(arbitrageInfoCopydefault);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ArbitrageInfo arbitrageInfoAEQbTJ = AEQbTJ();
        arbitrageInfoAEQbTJ.setMgnMode(str);
        KWHzl(arbitrageInfoAEQbTJ);
    }

    public final boolean KWHzl() {
        java.lang.String string = SPUtils.getString("arbitrage_init", null);
        return string == null || string.length() == 0;
    }

    public final void EZpvd() {
        SPUtils.put("arbitrage_init", "init");
    }

    public final java.lang.String OLrzqt() {
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        if (!c55697xoo.isConnected()) {
            return "un_login_arbitrage_left";
        }
        return c55697xoo.gEmmrt() + "_left";
    }

    public final java.lang.String AhwBna() {
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        if (!c55697xoo.isConnected()) {
            return "un_login_arbitrage_right";
        }
        return c55697xoo.gEmmrt() + "_right";
    }
}
