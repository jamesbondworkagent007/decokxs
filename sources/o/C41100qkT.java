package o;

import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesMkpPosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41100qkT extends AbstractC49400uno<kotlin.Pair<? extends FuturesTypeEnum, ? extends FuturesUnitVo>, java.util.List<? extends FuturesRankItemPo>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final ConcurrentHashMap<kotlin.Pair<FuturesTypeEnum, FuturesUnitVo>, SoftReference<java.util.List<FuturesRankItemPo>>> EZpvd;
    public final C41662quz KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C41100qkT(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = c41662quz;
        this.EZpvd = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.qkT$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qkT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends FuturesTypeEnum, FuturesUnitVo> pair, @NotNull Continuation<? super java.util.List<FuturesRankItemPo>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverFuturesMkpPosUseCase$onExecute$1 getMarketDiscoverFuturesMkpPosUseCase$onExecute$1;
        java.util.List<FuturesRankItemPo> list;
        java.lang.Object objCopydefault;
        C41100qkT c41100qkT;
        if (continuation instanceof GetMarketDiscoverFuturesMkpPosUseCase$onExecute$1) {
            getMarketDiscoverFuturesMkpPosUseCase$onExecute$1 = (GetMarketDiscoverFuturesMkpPosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverFuturesMkpPosUseCase$onExecute$1 = new GetMarketDiscoverFuturesMkpPosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            SoftReference<java.util.List<FuturesRankItemPo>> softReference = this.EZpvd.get(pair);
            list = softReference != null ? softReference.get() : null;
            java.lang.String strAEQbTJ = C41786qxQ.AEQbTJ("24h", "utc0", "utc8");
            kotlin.Pair[] pairArr = new kotlin.Pair[5];
            pairArr[0] = C56390yDp.OLrzqt("rankType", "marketCap");
            pairArr[1] = C56390yDp.OLrzqt("num", "350");
            pairArr[2] = C56390yDp.OLrzqt("rank", "0");
            java.lang.String strEZpvd = pair.getSecond().EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            pairArr[3] = C56390yDp.OLrzqt("type", strEZpvd);
            pairArr[4] = C56390yDp.OLrzqt("zone", strAEQbTJ);
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(pairArr);
            C41662quz c41662quz = this.KWHzl;
            getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.L$1 = pair;
            getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.L$2 = list;
            getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.label = 1;
            objCopydefault = c41662quz.copydefault(mapGEmmrt, getMarketDiscoverFuturesMkpPosUseCase$onExecute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c41100qkT = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.List<FuturesRankItemPo> list2 = (java.util.List) getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.L$2;
            kotlin.Pair<? extends FuturesTypeEnum, FuturesUnitVo> pair2 = (kotlin.Pair) getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.L$1;
            C41100qkT c41100qkT2 = (C41100qkT) getMarketDiscoverFuturesMkpPosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            list = list2;
            pair = pair2;
            c41100qkT = c41100qkT2;
            objCopydefault = obj;
        }
        java.util.List list3 = (java.util.List) objCopydefault;
        if (list3 == null) {
            return list;
        }
        c41100qkT.EZpvd.put((kotlin.Pair<FuturesTypeEnum, FuturesUnitVo>) pair, new SoftReference<>(list3));
        return list3;
    }
}
