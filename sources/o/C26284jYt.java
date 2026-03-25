package o;

import com.okinc.business.data.model.market.HolderDetailResponseData;
import com.okinc.business.data.model.market.TokenHolderResponseData;
import com.okinc.business.dexlogic.bean.TradingHistoryStatisticsResult;
import com.okinc.business.market.features.history.domain.model.StatisticsExtraParams;
import com.okinc.business.market.features.holders.data.HolderRepositoryImpl$getSingleDetailInfo$1;
import com.okinc.business.market.features.holders.data.HolderRepositoryImpl$getSingleDetailInfoBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.holders.data.HolderRepositoryImpl$getTokenHolders$1;
import com.okinc.business.market.features.holders.data.HolderRepositoryImpl$getTokenHolders$responseData$1;
import com.okinc.business.market.features.holders.data.HolderRepositoryImpl$getTradingHistoryStatistics$2;
import com.okinc.business.market.features.holders.data.HolderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.holders.domain.model.HistoryStatistics;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26284jYt implements jYA {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C27640jyx AEQbTJ;
    public final C26285jYu EZpvd;
    public final InterfaceC23229huL KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C26284jYt(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull C26285jYu c26285jYu, @NotNull C27640jyx c27640jyx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c26285jYu, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC23229huL;
        this.EZpvd = c26285jYu;
        this.AEQbTJ = c27640jyx;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.jYt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jYt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.jYA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C26289jYy c26289jYy, @NotNull Continuation<? super AbstractC43419rot<TokenHolderResponseData, OKServerException>> continuation) throws java.lang.Throwable {
        HolderRepositoryImpl$getTokenHolders$1 holderRepositoryImpl$getTokenHolders$1;
        if (continuation instanceof HolderRepositoryImpl$getTokenHolders$1) {
            holderRepositoryImpl$getTokenHolders$1 = (HolderRepositoryImpl$getTokenHolders$1) continuation;
            int i = holderRepositoryImpl$getTokenHolders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holderRepositoryImpl$getTokenHolders$1.label = i - Integer.MIN_VALUE;
            } else {
                holderRepositoryImpl$getTokenHolders$1 = new HolderRepositoryImpl$getTokenHolders$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = holderRepositoryImpl$getTokenHolders$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holderRepositoryImpl$getTokenHolders$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.HashMap map = new java.util.HashMap();
            map.put("chainId", c26289jYy.KWHzl());
            map.put("tokenAddress", c26289jYy.AEQbTJ());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c26289jYy.EZpvd())) {
                map.put("walletAddress", c26289jYy.EZpvd());
            }
            if (c26289jYy.OLrzqt().length() > 0) {
                map.put("addressLabel", c26289jYy.OLrzqt());
            }
            if (c26289jYy.copydefault().length() > 0) {
                map.put("currentUserWalletAddress", c26289jYy.copydefault());
            }
            HolderRepositoryImpl$getTokenHolders$responseData$1 holderRepositoryImpl$getTokenHolders$responseData$1 = new HolderRepositoryImpl$getTokenHolders$responseData$1(this, map, null);
            holderRepositoryImpl$getTokenHolders$1.label = 1;
            objEZpvd = kAB.EZpvd(holderRepositoryImpl$getTokenHolders$responseData$1, holderRepositoryImpl$getTokenHolders$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objEZpvd;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            if (oKServerException.getOrigin() != null) {
                pUU.AEQbTJ("HolderRepositoryImpl", "Request failed", oKServerException.getOrigin());
            } else {
                pUU.AEQbTJ("HolderRepositoryImpl", "Request error", oKServerException);
            }
        }
        return abstractC43419rot;
    }

    /* JADX INFO: renamed from: o.jYt$Application */
    public static final class Application implements Flow<HistoryStatistics> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C26284jYt copydefault;

        /* JADX INFO: renamed from: o.jYt$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C26284jYt EZpvd;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C26284jYt c26284jYt) {
                this.OLrzqt = flowCollector;
                this.EZpvd = c26284jYt;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HolderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1 holderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof HolderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1) {
                    holderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1 = (HolderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1) continuation;
                    int i = holderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        holderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        holderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1 = new HolderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = holderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = holderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    HistoryStatistics historyStatisticsOLrzqt = this.EZpvd.EZpvd.OLrzqt((java.lang.String) obj);
                    if (historyStatisticsOLrzqt != null) {
                        holderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(historyStatisticsOLrzqt, holderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
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

        public Application(Flow flow, C26284jYt c26284jYt) {
            this.EZpvd = flow;
            this.copydefault = c26284jYt;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super HistoryStatistics> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.jYA
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<TradingHistoryStatisticsResult, OKServerException>> continuation) {
        return kAB.EZpvd(new HolderRepositoryImpl$getTradingHistoryStatistics$2(str, str2, str3, this, null), continuation);
    }

    @Override // o.jYA
    public java.lang.Object OLrzqt(@NotNull StatisticsExtraParams statisticsExtraParams, @NotNull Continuation<? super Flow<HistoryStatistics>> continuation) {
        return new Application(this.AEQbTJ.KWHzl("dex-market-trade-history-statistics", yDY.copydefault(new WsArgV5ForWeb3("dex-market-trade-history-statistics", null, null, null, this.EZpvd.EZpvd(statisticsExtraParams), 14, null))), this);
    }

    @Override // o.jYA
    public void EZpvd() {
        this.AEQbTJ.AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.jYA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<HolderDetailResponseData>> continuation) {
        HolderRepositoryImpl$getSingleDetailInfo$1 holderRepositoryImpl$getSingleDetailInfo$1;
        if (continuation instanceof HolderRepositoryImpl$getSingleDetailInfo$1) {
            holderRepositoryImpl$getSingleDetailInfo$1 = (HolderRepositoryImpl$getSingleDetailInfo$1) continuation;
            int i = holderRepositoryImpl$getSingleDetailInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holderRepositoryImpl$getSingleDetailInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                holderRepositoryImpl$getSingleDetailInfo$1 = new HolderRepositoryImpl$getSingleDetailInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = holderRepositoryImpl$getSingleDetailInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holderRepositoryImpl$getSingleDetailInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            HolderRepositoryImpl$getSingleDetailInfoBWLJW6A$$inlined$dexRunCatching$1 holderRepositoryImpl$getSingleDetailInfoBWLJW6A$$inlined$dexRunCatching$1 = new HolderRepositoryImpl$getSingleDetailInfoBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, str3);
            holderRepositoryImpl$getSingleDetailInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, holderRepositoryImpl$getSingleDetailInfoBWLJW6A$$inlined$dexRunCatching$1, holderRepositoryImpl$getSingleDetailInfo$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
