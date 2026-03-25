package o;

import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo;
import com.okinc.market.discover.features.markets.sub.overview.domain.GetMarketDiscoverFlowUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qeU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40783qeU extends AbstractC49400uno<Unit, C41089qkI> {
    public final CoroutineDispatcher KWHzl;
    public final C40786qeX copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C40783qeU(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40786qeX c40786qeX) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40786qeX, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = c40786qeX;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super C41089qkI> continuation) throws java.lang.Throwable {
        GetMarketDiscoverFlowUseCase$onExecute$1 getMarketDiscoverFlowUseCase$onExecute$1;
        if (continuation instanceof GetMarketDiscoverFlowUseCase$onExecute$1) {
            getMarketDiscoverFlowUseCase$onExecute$1 = (GetMarketDiscoverFlowUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverFlowUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverFlowUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverFlowUseCase$onExecute$1 = new GetMarketDiscoverFlowUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getMarketDiscoverFlowUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverFlowUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.HashMap map = new java.util.HashMap();
            map.put("zone", copydefault());
            map.put("type", qTC.copydefault.AEQbTJ());
            C40786qeX c40786qeX = this.copydefault;
            getMarketDiscoverFlowUseCase$onExecute$1.label = 1;
            objEZpvd = c40786qeX.EZpvd(map, getMarketDiscoverFlowUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        MarketDiscoverFlowPo marketDiscoverFlowPo = (MarketDiscoverFlowPo) objEZpvd;
        return new C41089qkI(marketDiscoverFlowPo != null ? marketDiscoverFlowPo.getMinimized() : null, marketDiscoverFlowPo != null ? marketDiscoverFlowPo.getExpanded() : null);
    }

    public final java.lang.String copydefault() {
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.Integer numValueOf = interfaceC46557tYt != null ? java.lang.Integer.valueOf(interfaceC46557tYt.EZpvd()) : null;
        return (numValueOf != null && numValueOf.intValue() == 1) ? "utc0" : (numValueOf != null && numValueOf.intValue() == 2) ? "utc8" : "24h";
    }
}
