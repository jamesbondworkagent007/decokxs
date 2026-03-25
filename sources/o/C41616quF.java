package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.ranking.core.engine.domain.GetFuturesRankingPosUseCase$onExecute$1;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.market.ranking.core.model.po.RankingFuturesType;
import com.okinc.market.time.filter.PeriodEnum;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41616quF extends AbstractC49400uno<C41615quE, java.util.List<? extends FuturesRankItemPo>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final ConcurrentHashMap<C41615quE, SoftReference<java.util.List<FuturesRankItemPo>>> AEQbTJ;
    public final InterfaceC54577xNn EZpvd;
    public final C41662quz KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41615quE) obj, (Continuation<? super java.util.List<FuturesRankItemPo>>) continuation);
    }

    @yCM
    public C41616quF(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = interfaceC54577xNn;
        this.KWHzl = c41662quz;
        this.AEQbTJ = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.quF$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.quF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41615quE c41615quE, @NotNull Continuation<? super java.util.List<FuturesRankItemPo>> continuation) throws java.lang.Throwable {
        GetFuturesRankingPosUseCase$onExecute$1 getFuturesRankingPosUseCase$onExecute$1;
        java.lang.String strAEQbTJ;
        C41616quF c41616quF;
        java.util.List list;
        java.util.Map map;
        if (continuation instanceof GetFuturesRankingPosUseCase$onExecute$1) {
            getFuturesRankingPosUseCase$onExecute$1 = (GetFuturesRankingPosUseCase$onExecute$1) continuation;
            int i = getFuturesRankingPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getFuturesRankingPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getFuturesRankingPosUseCase$onExecute$1 = new GetFuturesRankingPosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getFuturesRankingPosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getFuturesRankingPosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            RankingFuturesType rankingFuturesTypeKWHzl = c41615quE.KWHzl();
            PeriodEnum periodEnumOLrzqt = c41615quE.OLrzqt();
            java.lang.Integer numCopydefault = c41615quE.copydefault();
            java.lang.Integer numEZpvd = c41615quE.EZpvd();
            java.lang.String strAEQbTJ2 = c41615quE.AEQbTJ();
            strAEQbTJ = C41786qxQ.AEQbTJ("24h", "utc0", "utc8");
            InterfaceC54577xNn interfaceC54577xNn = this.EZpvd;
            if (interfaceC54577xNn != null && interfaceC54577xNn.EZpvd()) {
                strAEQbTJ2 = "USDT";
            } else if (strAEQbTJ2 == null) {
                strAEQbTJ2 = "ALL";
            } else {
                if (strAEQbTJ2.length() <= 0) {
                    strAEQbTJ2 = null;
                }
                if (strAEQbTJ2 == null) {
                }
            }
            kotlin.Pair[] pairArr = new kotlin.Pair[7];
            pairArr[0] = C56390yDp.OLrzqt("rankType", rankingFuturesTypeKWHzl.getTypeValue$OKMarket_market_impl());
            pairArr[1] = C56390yDp.OLrzqt(TypedValues.CycleType.S_WAVE_PERIOD, periodEnumOLrzqt.getInputPara());
            pairArr[2] = C56390yDp.OLrzqt("zone", strAEQbTJ);
            pairArr[3] = C56390yDp.OLrzqt("type", strAEQbTJ2);
            pairArr[4] = C56390yDp.OLrzqt("pageSize", java.lang.String.valueOf(numCopydefault != null ? numCopydefault.intValue() : 350));
            pairArr[5] = C56390yDp.OLrzqt("rank", "0");
            pairArr[6] = C56390yDp.OLrzqt("allBizType", java.lang.String.valueOf(numEZpvd != null ? numEZpvd.intValue() : 1));
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(pairArr);
            if (Intrinsics.EZpvd((java.lang.Object) rankingFuturesTypeKWHzl.getTypeValue$OKMarket_market_impl(), (java.lang.Object) "gainers")) {
                C41662quz c41662quz = this.KWHzl;
                getFuturesRankingPosUseCase$onExecute$1.L$0 = this;
                getFuturesRankingPosUseCase$onExecute$1.L$1 = c41615quE;
                getFuturesRankingPosUseCase$onExecute$1.L$2 = strAEQbTJ;
                getFuturesRankingPosUseCase$onExecute$1.label = 1;
                objCopydefault = c41662quz.KWHzl(mapGEmmrt, getFuturesRankingPosUseCase$onExecute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c41616quF = this;
                java.util.List list2 = (java.util.List) objCopydefault;
                if (list2 != null) {
                }
            } else {
                C41662quz c41662quz2 = this.KWHzl;
                getFuturesRankingPosUseCase$onExecute$1.L$0 = this;
                getFuturesRankingPosUseCase$onExecute$1.L$1 = c41615quE;
                getFuturesRankingPosUseCase$onExecute$1.label = 2;
                objCopydefault = c41662quz2.copydefault(mapGEmmrt, getFuturesRankingPosUseCase$onExecute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c41616quF = this;
                list = (java.util.List) objCopydefault;
            }
        } else if (i2 == 1) {
            java.lang.String str = (java.lang.String) getFuturesRankingPosUseCase$onExecute$1.L$2;
            C41615quE c41615quE2 = (C41615quE) getFuturesRankingPosUseCase$onExecute$1.L$1;
            c41616quF = (C41616quF) getFuturesRankingPosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            strAEQbTJ = str;
            c41615quE = c41615quE2;
            java.util.List list22 = (java.util.List) objCopydefault;
            list = (list22 != null || (map = (java.util.Map) CollectionsKt___CollectionsKt.firstOrNull(list22)) == null) ? null : (java.util.List) map.get(c41616quF.OLrzqt(strAEQbTJ));
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41615quE = (C41615quE) getFuturesRankingPosUseCase$onExecute$1.L$1;
            c41616quF = (C41616quF) getFuturesRankingPosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            list = (java.util.List) objCopydefault;
        }
        if (list == null) {
            SoftReference<java.util.List<FuturesRankItemPo>> softReference = c41616quF.AEQbTJ.get(c41615quE);
            if (softReference != null) {
                return softReference.get();
            }
            return null;
        }
        c41616quF.AEQbTJ.put(c41615quE, new SoftReference<>(list));
        return list;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc0")) {
            return "utc0";
        }
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? "utc8" : "utc24";
    }
}
