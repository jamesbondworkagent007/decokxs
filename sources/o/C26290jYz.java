package o;

import com.google.gson.JsonObject;
import com.okinc.business.data.model.market.HolderRankingResponseData;
import com.okinc.business.data.model.market.TokenHolderResponseData;
import com.okinc.business.market.features.holders.domain.repository.HolderRankingWsUpdate;
import com.okinc.business.market.features.holders.domain.repository.HolderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.holders.domain.repository.HolderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26290jYz implements jYG {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final C27592jyB<HolderRankingResponseData> AEQbTJ;
    public final C27640jyx EZpvd;

    @yCM
    public C26290jYz(@NotNull C27640jyx c27640jyx, @NotNull C27592jyB<HolderRankingResponseData> c27592jyB) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27592jyB, "");
        this.EZpvd = c27640jyx;
        this.AEQbTJ = c27592jyB;
    }

    /* JADX INFO: renamed from: o.jYz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jYz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.jYG
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Flow<TokenHolderResponseData>> continuation) {
        C27640jyx c27640jyx = this.EZpvd;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("chainId", str);
        jsonObject.addProperty("tokenAddress", str2);
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        jsonObject.addProperty("subId", C59449zhJ.replace$default(string, "-", "", false, 4, (java.lang.Object) null));
        jsonObject.addProperty("accountId", str3);
        Unit unit = Unit.INSTANCE;
        c27640jyx.EZpvd("dex-market-holder-v2", yDY.copydefault(new WsArgV5ForWeb3("dex-market-holder-v2", null, null, null, jsonObject, 14, null)));
        return KWHzl(new Activity(this.EZpvd.copydefault(), this), C56443yFo.AEQbTJ(100), continuation);
    }

    /* JADX INFO: renamed from: o.jYz$Activity */
    public static final class Activity implements Flow<HolderRankingWsUpdate> {
        public final /* synthetic */ C26290jYz KWHzl;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.jYz$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C26290jYz AEQbTJ;
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C26290jYz c26290jYz) {
                this.EZpvd = flowCollector;
                this.AEQbTJ = c26290jYz;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HolderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1 holderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof HolderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1) {
                    holderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1 = (HolderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1) continuation;
                    int i = holderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        holderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        holderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1 = new HolderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = holderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = holderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    HolderRankingWsUpdate holderRankingWsUpdateOLrzqt = this.AEQbTJ.OLrzqt((java.lang.String) obj);
                    if (holderRankingWsUpdateOLrzqt != null) {
                        holderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(holderRankingWsUpdateOLrzqt, holderSummaryRepositoryImpl$subscribeHoldersRanking$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow, C26290jYz c26290jYz) {
            this.copydefault = flow;
            this.KWHzl = c26290jYz;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super HolderRankingWsUpdate> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jYz$TaskDescription */
    public static final class TaskDescription implements Flow<TokenHolderResponseData> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C26290jYz copydefault;

        /* JADX INFO: renamed from: o.jYz$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ C26290jYz OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C26290jYz c26290jYz) {
                this.EZpvd = flowCollector;
                this.OLrzqt = c26290jYz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HolderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1 holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1;
                TokenHolderResponseData tokenHolderResponseData;
                FlowCollector flowCollector;
                if (continuation instanceof HolderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1) {
                    holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1 = (HolderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1) continuation;
                    int i = holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1 = new HolderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.EZpvd;
                    HolderRankingWsUpdate holderRankingWsUpdate = (HolderRankingWsUpdate) obj;
                    TokenHolderResponseData tokenHolderResponseData2 = (TokenHolderResponseData) CollectionsKt___CollectionsKt.firstOrNull(holderRankingWsUpdate.KWHzl());
                    C27592jyB c27592jyB = this.OLrzqt.AEQbTJ;
                    java.util.List<HolderRankingResponseData> holderRankingList = tokenHolderResponseData2 != null ? tokenHolderResponseData2.getHolderRankingList() : null;
                    java.lang.Long lEZpvd = holderRankingWsUpdate.EZpvd();
                    java.lang.Integer numAEQbTJ = holderRankingWsUpdate.AEQbTJ();
                    int iIntValue = numAEQbTJ != null ? numAEQbTJ.intValue() : 0;
                    java.lang.Integer numOLrzqt = holderRankingWsUpdate.OLrzqt();
                    holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.L$0 = flowCollector2;
                    holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.L$1 = tokenHolderResponseData2;
                    holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.label = 1;
                    java.lang.Object objKWHzl = c27592jyB.KWHzl(holderRankingList, lEZpvd, iIntValue, numOLrzqt, holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    tokenHolderResponseData = tokenHolderResponseData2;
                    flowCollector = flowCollector2;
                    obj2 = objKWHzl;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    TokenHolderResponseData tokenHolderResponseData3 = (TokenHolderResponseData) holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.L$1;
                    FlowCollector flowCollector3 = (FlowCollector) holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                    tokenHolderResponseData = tokenHolderResponseData3;
                }
                FlowCollector flowCollector4 = flowCollector;
                java.util.List list = (java.util.List) obj2;
                TokenHolderResponseData tokenHolderResponseDataCopy$default = (list == null || tokenHolderResponseData == null) ? null : TokenHolderResponseData.copy$default(tokenHolderResponseData, list, null, null, 6, null);
                if (tokenHolderResponseDataCopy$default != null) {
                    holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.L$0 = null;
                    holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.L$1 = null;
                    holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1.label = 2;
                    if (flowCollector4.emit(tokenHolderResponseDataCopy$default, holderSummaryRepositoryImpl$collectWithWindow$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, C26290jYz c26290jYz) {
            this.AEQbTJ = flow;
            this.copydefault = c26290jYz;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super TokenHolderResponseData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.jYG
    public void OLrzqt() {
        this.AEQbTJ.KWHzl();
        this.EZpvd.AEQbTJ();
    }

    public final HolderRankingWsUpdate OLrzqt(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj = null;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            pUU.copydefault("HolderSummaryRepository", "Received empty data");
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            Json jsonKWHzl = C43284rmQ.KWHzl();
            jsonKWHzl.getSerializersModule();
            objM7377constructorimpl = Result.m7377constructorimpl((HolderRankingWsUpdate) jsonKWHzl.decodeFromString(HolderRankingWsUpdate.Companion.serializer(), str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            obj = objM7377constructorimpl;
        } else {
            pUU.AEQbTJ("HolderSummaryRepository", "Failed to deserialize TokenHolderResponseData", thM7380exceptionOrNullimpl);
        }
        return (HolderRankingWsUpdate) obj;
    }

    public static /* synthetic */ java.lang.Object collectWithWindow$default(C26290jYz c26290jYz, Flow flow, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return c26290jYz.KWHzl(flow, num, continuation);
    }

    public final java.lang.Object KWHzl(Flow<HolderRankingWsUpdate> flow, java.lang.Integer num, Continuation<? super Flow<TokenHolderResponseData>> continuation) {
        return new TaskDescription(flow, this);
    }
}
