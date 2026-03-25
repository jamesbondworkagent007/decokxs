package o;

import com.okinc.unify_trade.biz.BotUserSummaryReq;
import com.okinc.unify_trade.biz.StrategyUserSummaryData;
import com.okinc.unify_trade.core.ws.BotUserSummaryTask$queryMultiCupTickers$2;
import com.okinc.unify_trade.core.ws.BotUserSummaryTask$queryUserSummary$1;
import com.okinc.unify_trade.core.ws.BotUserSummaryTask$sendWsResult$1;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xEg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54326xEg extends xGQ<java.util.List<? extends StrategyUserSummaryData>> {
    public final java.lang.String AEQbTJ;
    public xAF AYXKKw;
    public AbstractC57556yke AhwBna;
    public CoroutineDispatcher EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public java.lang.String djBIcL;
    public final C56200xyN gEmmrt;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public java.lang.String bJ_() {
        return "algo-user-summary";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher valueOf() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* bridge */ /* synthetic */ void AEQbTJ(java.util.List<? extends StrategyUserSummaryData> list) {
        AEQbTJ2((java.util.List<StrategyUserSummaryData>) list);
    }

    public C54326xEg(@NotNull java.lang.String str, xAF xaf) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.AYXKKw = xaf;
        this.gEmmrt = new C56200xyN();
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54326xEg.AYXKKw(this.KWHzl);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xEh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54326xEg.AEQbTJ();
            }
        });
        this.EZpvd = Dispatchers.getIO();
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54326xEg.djBIcL(this.AEQbTJ);
            }
        });
        values();
    }

    public final C55942xtU djBIcL() {
        return (C55942xtU) this.copydefault.getValue();
    }

    public static final C55942xtU AYXKKw(C54326xEg c54326xEg) {
        java.lang.Boolean boolCopydefault;
        BotUserSummaryReq botUserSummaryReqEZpvd;
        xAF xaf = c54326xEg.AYXKKw;
        java.lang.String preferUnit = (xaf == null || (botUserSummaryReqEZpvd = xaf.EZpvd()) == null) ? null : botUserSummaryReqEZpvd.getPreferUnit();
        xAF xaf2 = c54326xEg.AYXKKw;
        return new C55942xtU(preferUnit, java.lang.Boolean.valueOf((xaf2 == null || (boolCopydefault = xaf2.copydefault()) == null) ? false : boolCopydefault.booleanValue()));
    }

    public static final C54289xCx AEQbTJ() {
        return new C54289xCx();
    }

    public final C54289xCx copydefault() {
        return (C54289xCx) this.OLrzqt.getValue();
    }

    public static final CoroutineScope djBIcL(C54326xEg c54326xEg) {
        return CoroutineScopeKt.CoroutineScope(c54326xEg.EZpvd);
    }

    public final CoroutineScope KWHzl() {
        return (CoroutineScope) this.KWHzl.getValue();
    }

    public final void values() {
        BuildersKt__Builders_commonKt.launch$default(KWHzl(), this.EZpvd, null, new BotUserSummaryTask$queryUserSummary$1(this, null), 2, null);
    }

    public final java.lang.Object KWHzl(java.util.List<StrategyUserSummaryData> list, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new BotUserSummaryTask$queryMultiCupTickers$2(this, list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public AbstractC57556yke gEmmrt() {
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, bJ_(), new WsArgV5(bJ_(), null, null, "ANY", null, null, null, null, 246, null), (Function1) null, 4, (java.lang.Object) null);
        this.AhwBna = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
        return this.AhwBna;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] */
    public java.util.List<StrategyUserSummaryData> bD_() {
        StrategyUserSummaryData.Companion companion = StrategyUserSummaryData.Companion;
        java.lang.String str = this.djBIcL;
        if (str == null) {
            str = "";
        }
        java.util.List<StrategyUserSummaryData> listCopydefault = companion.copydefault(str);
        return listCopydefault == null ? yDY.AhwBna() : listCopydefault;
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public void AEQbTJ2(@NotNull java.util.List<StrategyUserSummaryData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(KWHzl(), this.EZpvd, null, new BotUserSummaryTask$sendWsResult$1(this, list, null), 2, null);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.djBIcL = str;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof xAF) {
            java.lang.String strKWHzl = ((xAF) obj).KWHzl();
            xAF xaf = this.AYXKKw;
            if (!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) (xaf != null ? xaf.KWHzl() : null))) {
                return false;
            }
        }
        isConnected();
        return true;
    }

    public final void isConnected() {
        C54407xHg.Companion.EZpvd(bJ_(), this.AhwBna);
        AbstractC57556yke abstractC57556yke = this.AhwBna;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.AhwBna = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.gEmmrt.AYXKKw();
        copydefault().AYXKKw();
    }
}
