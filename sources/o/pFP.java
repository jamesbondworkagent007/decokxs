package o;

import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.manager.MarginModeManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pFP {
    public static final pFP OLrzqt = new pFP();

    private pFP() {
    }

    public static /* synthetic */ boolean isLogin$default(pFP pfp, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        }
        return pfp.copydefault(context);
    }

    public final boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC47230tmC) C58113yvE.copydefault(context.getApplicationContext(), InterfaceC47230tmC.class)).fmB().values();
    }

    public static /* synthetic */ java.lang.Object switchTradingMode$default(pFP pfp, boolean z, java.lang.String str, android.content.Context context, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "main/trade";
        }
        if ((i & 4) != 0) {
            context = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        }
        return pfp.OLrzqt(z, str, context, continuation);
    }

    public final java.lang.Object OLrzqt(boolean z, @NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = ((InterfaceC8108awX) C43251rlk.copydefault(InterfaceC8108awX.class)).KWHzl(z, str, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public static /* synthetic */ boolean isUserInDemoTrading$default(pFP pfp, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        }
        return pfp.EZpvd(context);
    }

    public final boolean EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC47230tmC) C58113yvE.copydefault(context.getApplicationContext(), InterfaceC47230tmC.class)).fmB().fJNWhG();
    }

    public final boolean OLrzqt() {
        InterfaceC49497upf interfaceC49497upf;
        xND xndAEQbTJ;
        java.lang.Boolean boolValueOf;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC49497upf = (InterfaceC49497upf) interfaceC49425uoM.KWHzl(TradeKey.TRADE_UI)) == null || (xndAEQbTJ = interfaceC49497upf.AEQbTJ()) == null || (boolValueOf = xndAEQbTJ.valueOf()) == null) {
            return false;
        }
        return boolValueOf.booleanValue();
    }

    public final boolean KWHzl() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.fetchVPNInfo()) ? false : true;
    }

    public final boolean copydefault() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.isConnected()) ? false : true;
    }

    public final boolean EZpvd() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.AYXKKw()) ? false : true;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.unify_trade.manager.MarginModeManager.getCurrentMarginMode$default(com.okinc.unify_trade.manager.MarginModeManager, boolean, com.okinc.unify_trade.biz.BizInstrument, int, java.lang.Object):java.lang.String */
    public final boolean KWHzl(BizInstrument bizInstrument) {
        MarginModeManager marginModeManagerIsConnected;
        xOW newProxyInstance;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        java.lang.String currentMarginMode$default = null;
        java.lang.Boolean boolValueOf = (interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : java.lang.Boolean.valueOf(newProxyInstance.valueOf());
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) != null) {
            currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, bizInstrument, 1, null);
        }
        return Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE) && Intrinsics.EZpvd((java.lang.Object) currentMarginMode$default, (java.lang.Object) "isolated");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (copydefault() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (EZpvd() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (KWHzl(r6) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r6.isPreMarketPair() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (OLrzqt() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (isLogin$default(r5, null, 1, null) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0.equals("FUTURES") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r0.equals("SWAP") == false) goto L48;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        java.lang.String instType = bizInstrument.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                if (instType.equals("MARGIN")) {
                    if (!OLrzqt() || !isLogin$default(this, null, 1, null) || !KWHzl()) {
                    }
                }
                break;
            case 2552066:
                if (instType.equals("SPOT")) {
                    if (!OLrzqt() || !isLogin$default(this, null, 1, null)) {
                    }
                }
                break;
            case 2558355:
                break;
            case 214415088:
                break;
        }
        return false;
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN") && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.gEmmrt();
    }

    public final boolean AEQbTJ() {
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        return interfaceC46557tYt == null || interfaceC46557tYt.EZpvd() == 2;
    }
}
