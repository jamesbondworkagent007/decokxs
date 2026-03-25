package o;

import com.okinc.find_ui.ranking.hot.domain.SubscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.market.ranking.core.model.po.RankingFuturesType;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.data.RankListRequestGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nnl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35038nnl extends AbstractC49400uno<kotlin.Pair<? extends RankListRequest, ? extends RankingFuturesType>, Flow<? extends java.util.List<? extends RankingHotCryptoVo>>> {
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C35038nnl(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<RankListRequest, ? extends RankingFuturesType> pair, @NotNull Continuation<? super Flow<? extends java.util.List<RankingHotCryptoVo>>> continuation) {
        AbstractC58185ywX<SourceResp<java.util.ArrayList<FuturesRankItemPo>>> abstractC58185ywXEZpvd;
        RankListRequest rankListRequestComponent1 = pair.component1();
        RankingFuturesType rankingFuturesTypeComponent2 = pair.component2();
        RankListRequestGroup rankListRequestGroup = new RankListRequestGroup(true, false, rankListRequestComponent1);
        if (rankingFuturesTypeComponent2 == RankingFuturesType.HOT) {
            abstractC58185ywXEZpvd = C55488xkr.KWHzl.copydefault(rankListRequestGroup);
        } else {
            abstractC58185ywXEZpvd = C55488xkr.KWHzl.EZpvd(rankListRequestGroup);
        }
        return new Application(ReactiveFlowKt.asFlow(abstractC58185ywXEZpvd), this, rankListRequestGroup);
    }

    /* JADX INFO: renamed from: o.nnl$Application */
    public static final class Application implements Flow<java.util.List<? extends RankingHotCryptoVo>> {
        public final /* synthetic */ RankListRequestGroup KWHzl;
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ C35038nnl copydefault;

        /* JADX INFO: renamed from: o.nnl$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ RankListRequestGroup KWHzl;
            public final /* synthetic */ C35038nnl OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C35038nnl c35038nnl, RankListRequestGroup rankListRequestGroup) {
                this.EZpvd = flowCollector;
                this.OLrzqt = c35038nnl;
                this.KWHzl = rankListRequestGroup;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1 subscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1;
                java.util.List listAhwBna;
                if (continuation instanceof SubscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    SourceResp sourceResp = (SourceResp) obj;
                    if (Intrinsics.EZpvd(sourceResp.isSuccess(), C56443yFo.KWHzl(true))) {
                        java.util.ArrayList arrayList = (java.util.ArrayList) sourceResp.getData();
                        if (arrayList == null || (listAhwBna = this.OLrzqt.AEQbTJ(arrayList, this.KWHzl.getRequest().getZone(), PeriodEnum.RANKING_PERIOD_1D)) == null) {
                            listAhwBna = yDY.AhwBna();
                        }
                        subscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(listAhwBna, subscribeFuturesHotRankingUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        java.lang.Exception exp = sourceResp.getExp();
                        throw new java.lang.RuntimeException("Failed to subscribe hot futures ranking: " + (exp != null ? exp.getMessage() : null));
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, C35038nnl c35038nnl, RankListRequestGroup rankListRequestGroup) {
            this.OLrzqt = flow;
            this.copydefault = c35038nnl;
            this.KWHzl = rankListRequestGroup;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends RankingHotCryptoVo>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass2(flowCollector, this.copydefault, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final java.util.List<RankingHotCryptoVo> AEQbTJ(java.util.List<FuturesRankItemPo> list, java.lang.String str, PeriodEnum periodEnum) {
        java.lang.String changeUtc0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            FuturesRankItemPo futuresRankItemPo = (FuturesRankItemPo) obj;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "24h")) {
                changeUtc0 = futuresRankItemPo.getChange24h();
            } else {
                changeUtc0 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc0") ? futuresRankItemPo.getChangeUtc0() : futuresRankItemPo.getChangeUtc8();
            }
            java.lang.String turnOver = futuresRankItemPo.getTurnOver();
            java.lang.String volume = futuresRankItemPo.getVolume();
            arrayList.add(new RankingHotCryptoVo(i2, futuresRankItemPo.getInstId(), futuresRankItemPo.getInstType(), futuresRankItemPo.getIcon(), C41786qxQ.EZpvd(futuresRankItemPo.getInstId()), turnOver, futuresRankItemPo.getLastPrice(), false, null, false, pTF.KWHzl.AEQbTJ(pTB.formatICUPercent$default(C33129mqd.EZpvd(changeUtc0), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null)), C41786qxQ.OLrzqt(C33129mqd.EZpvd(changeUtc0)), false, false, false, false, null, null, false, C41786qxQ.KWHzl(futuresRankItemPo.getInstId()), false, null, true, null, null, null, false, 0L, null, periodEnum, null, null, volume, null, null, -541592704, 6, null));
            i = i2;
        }
        return arrayList;
    }
}
