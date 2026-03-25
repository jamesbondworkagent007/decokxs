package o;

import com.okinc.business.market.data.model.CoinRankingWsData;
import com.okinc.business.market.data.model.UpdateSignalAlertsRequest;
import com.okinc.business.market.data.model.smart_money.AddressResponse;
import com.okinc.business.market.data.model.smart_money.SignalActivityResponse;
import com.okinc.business.market.data.model.smart_money.SignalAlertHistoryData;
import com.okinc.business.market.data.model.smart_money.SignalAlertResponse;
import com.okinc.business.market.data.model.smart_money.SignalGemType;
import com.okinc.business.market.data.model.smart_money.SignalGemsData;
import com.okinc.business.market.data.model.smart_money.SignalGemsSortType;
import com.okinc.business.market.data.model.smart_money.SignalOverviewAddressResponse;
import com.okinc.business.market.data.model.smart_money.SignalOverviewOrActivityListRequest;
import com.okinc.business.market.data.model.smart_money.SignalOverviewResponse;
import com.okinc.business.market.data.model.smart_money.SignalStatusUpdate;
import com.okinc.business.market.data.model.smart_money.SignalUpdate;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SignalConfigData;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getLatestSignalActivities$2;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getLatestSignalOverviews$2;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getSignalAlertHistory$2;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getSignalAlerts$2;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getSignalGemsList$2;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getSignalOverviewAddresses$2;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getSignalOverviewPriceChart$2;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getSingleSignalOverview$2;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getSmartMoneyAddresses$2;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getSmartMoneySignalConfig$2;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$subscribeMultipleTokenUpdates$1;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$updateSignalAlerts$2;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29467kuG implements InterfaceC29466kuF {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final C27640jyx AEQbTJ;
    public final Json EZpvd;
    public final InterfaceC27595jyE OLrzqt;
    public final C29474kuN copydefault;

    /* JADX INFO: renamed from: o.kuG$ActionBar */
    public static final class ActionBar implements Flow<java.util.List<? extends SignalUpdate>> {
        public final /* synthetic */ C29467kuG KWHzl;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kuG$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ C29467kuG AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C29467kuG c29467kuG) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = c29467kuG;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SignalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1 signalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof SignalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1) {
                    signalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1 = (SignalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1) continuation;
                    int i = signalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        signalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        signalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1 = new SignalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = signalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = signalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.List<SignalUpdate> listEZpvd = this.AEQbTJ.copydefault.EZpvd((java.lang.String) obj);
                    if (listEZpvd != null) {
                        signalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listEZpvd, signalRepositoryImpl$subscribeNewSignalActivities$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C29467kuG c29467kuG) {
            this.copydefault = flow;
            this.KWHzl = c29467kuG;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends SignalUpdate>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kuG$Activity */
    public static final class Activity implements Flow<CoinRankingWsData> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ C29467kuG copydefault;

        /* JADX INFO: renamed from: o.kuG$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ C29467kuG KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C29467kuG c29467kuG) {
                this.EZpvd = flowCollector;
                this.KWHzl = c29467kuG;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SignalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1 signalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1;
                CoinRankingWsData coinRankingWsData;
                if (continuation instanceof SignalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1) {
                    signalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1 = (SignalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1) continuation;
                    int i = signalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        signalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        signalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1 = new SignalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = signalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = signalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Json json = this.KWHzl.EZpvd;
                        json.getSerializersModule();
                        coinRankingWsData = (CoinRankingWsData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) json.decodeFromString(new ArrayListSerializer(CoinRankingWsData.Companion.serializer()), str));
                    } catch (java.lang.Throwable unused) {
                        coinRankingWsData = null;
                    }
                    if (coinRankingWsData != null) {
                        signalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(coinRankingWsData, signalRepositoryImpl$subscribeMultipleTokenUpdates$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow, C29467kuG c29467kuG) {
            this.KWHzl = flow;
            this.copydefault = c29467kuG;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super CoinRankingWsData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kuG$Fragment */
    public static final class Fragment implements Flow<CoinRankingWsData> {
        public final /* synthetic */ C29467kuG EZpvd;
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.kuG$Fragment$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ C29467kuG OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C29467kuG c29467kuG) {
                this.copydefault = flowCollector;
                this.OLrzqt = c29467kuG;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SignalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1 signalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1;
                CoinRankingWsData coinRankingWsData;
                if (continuation instanceof SignalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1) {
                    signalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1 = (SignalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1) continuation;
                    int i = signalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        signalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        signalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1 = new SignalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = signalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = signalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Json json = this.OLrzqt.EZpvd;
                        json.getSerializersModule();
                        coinRankingWsData = (CoinRankingWsData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) json.decodeFromString(new ArrayListSerializer(CoinRankingWsData.Companion.serializer()), str));
                    } catch (java.lang.Throwable unused) {
                        coinRankingWsData = null;
                    }
                    if (coinRankingWsData != null) {
                        signalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(coinRankingWsData, signalRepositoryImpl$subscribeTokenUpdates$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public Fragment(Flow flow, C29467kuG c29467kuG) {
            this.OLrzqt = flow;
            this.EZpvd = c29467kuG;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super CoinRankingWsData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kuG$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.List<? extends SignalStatusUpdate>> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C29467kuG copydefault;

        /* JADX INFO: renamed from: o.kuG$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;
            public final /* synthetic */ C29467kuG copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C29467kuG c29467kuG) {
                this.OLrzqt = flowCollector;
                this.copydefault = c29467kuG;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SignalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1 signalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof SignalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1) {
                    signalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1 = (SignalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1) continuation;
                    int i = signalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        signalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        signalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1 = new SignalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = signalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = signalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.List<SignalStatusUpdate> listCopydefault = this.copydefault.copydefault.copydefault((java.lang.String) obj);
                    if (listCopydefault != null) {
                        signalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listCopydefault, signalRepositoryImpl$subscribeSignalStatusUpdates$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, C29467kuG c29467kuG) {
            this.EZpvd = flow;
            this.copydefault = c29467kuG;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends SignalStatusUpdate>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kuG$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends SignalUpdate>> {
        public final /* synthetic */ C29467kuG EZpvd;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kuG$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ C29467kuG copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C29467kuG c29467kuG) {
                this.KWHzl = flowCollector;
                this.copydefault = c29467kuG;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SignalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1 signalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof SignalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1) {
                    signalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1 = (SignalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1) continuation;
                    int i = signalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        signalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        signalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1 = new SignalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = signalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = signalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List<SignalUpdate> listEZpvd = this.copydefault.copydefault.EZpvd((java.lang.String) obj);
                    if (listEZpvd != null) {
                        signalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listEZpvd, signalRepositoryImpl$subscribeSignalOverviewUpdates$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow, C29467kuG c29467kuG) {
            this.copydefault = flow;
            this.EZpvd = c29467kuG;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends SignalUpdate>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C29467kuG(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C27640jyx c27640jyx, @NotNull C29474kuN c29474kuN, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c29474kuN, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.OLrzqt = interfaceC27595jyE;
        this.AEQbTJ = c27640jyx;
        this.copydefault = c29474kuN;
        this.EZpvd = json;
    }

    /* JADX INFO: renamed from: o.kuG$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kuG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<SignalConfigData, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$getSmartMoneySignalConfig$2(this, null), continuation);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object KWHzl(@NotNull SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest, @NotNull Continuation<? super AbstractC43419rot<SignalActivityResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$getLatestSignalActivities$2(this, signalOverviewOrActivityListRequest, null), continuation);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object copydefault(@NotNull SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest, @NotNull Continuation<? super AbstractC43419rot<SignalOverviewResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$getLatestSignalOverviews$2(this, signalOverviewOrActivityListRequest, null), continuation);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<SignalOverviewResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$getSingleSignalOverview$2(this, str, str2, null), continuation);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object OLrzqt(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<? extends java.util.List<java.lang.String>>, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$getSignalOverviewPriceChart$2(this, map, null), continuation);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<SignalOverviewAddressResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$getSignalOverviewAddresses$2(str, str2, str3, str4, str5, this, null), continuation);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<SignalAlertResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$getSignalAlerts$2(str, this, null), continuation);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull UpdateSignalAlertsRequest updateSignalAlertsRequest, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$updateSignalAlerts$2(this, str2, str, j, updateSignalAlertsRequest, null), continuation);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull SignalGemsSortType signalGemsSortType, boolean z, @NotNull SignalGemType signalGemType, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super AbstractC43419rot<SignalGemsData, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$getSignalGemsList$2(str, signalGemsSortType, z, signalGemType, list, this, null), continuation);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43419rot<AddressResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$getSmartMoneyAddresses$2(this, map, null), continuation);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<SignalUpdate>>> continuation) {
        java.util.ArrayList<? extends WsSubscribeArgV5> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new WsArgV5ForWeb3("dex-market-sm-signal-status", null, (java.lang.String) it.next(), null, null, 26, null));
        }
        arrayList.addAll(arrayList2);
        return new ActionBar(this.AEQbTJ.KWHzl("dex-market-sm-signal-status", arrayList), this);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<SignalStatusUpdate>>> continuation) {
        java.util.ArrayList<? extends WsSubscribeArgV5> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new WsArgV5ForWeb3("dex-market-sm-signal-status", null, (java.lang.String) it.next(), null, null, 26, null));
        }
        arrayList.addAll(arrayList2);
        return new StateListAnimator(this.AEQbTJ.KWHzl("dex-market-sm-signal-status", arrayList), this);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<SignalUpdate>>> continuation) {
        java.util.ArrayList<? extends WsSubscribeArgV5> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new WsArgV5ForWeb3("dex-market-sm-signal-status", null, (java.lang.String) it.next(), null, null, 26, null));
        }
        arrayList.addAll(arrayList2);
        return new TaskDescription(this.AEQbTJ.KWHzl("dex-market-sm-signal-status", arrayList), this);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<CoinRankingWsData>> continuation) {
        return new Fragment(this.AEQbTJ.KWHzl("dex-market-v3", yDY.copydefault(new WsArgV5ForWeb3("dex-market-v3", null, str, str2, null, 18, null))), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC29466kuF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, @NotNull Continuation<? super Flow<CoinRankingWsData>> continuation) throws java.lang.Throwable {
        SignalRepositoryImpl$subscribeMultipleTokenUpdates$1 signalRepositoryImpl$subscribeMultipleTokenUpdates$1;
        C29467kuG c29467kuG;
        if (continuation instanceof SignalRepositoryImpl$subscribeMultipleTokenUpdates$1) {
            signalRepositoryImpl$subscribeMultipleTokenUpdates$1 = (SignalRepositoryImpl$subscribeMultipleTokenUpdates$1) continuation;
            int i = signalRepositoryImpl$subscribeMultipleTokenUpdates$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalRepositoryImpl$subscribeMultipleTokenUpdates$1.label = i - Integer.MIN_VALUE;
            } else {
                signalRepositoryImpl$subscribeMultipleTokenUpdates$1 = new SignalRepositoryImpl$subscribeMultipleTokenUpdates$1(this, continuation);
            }
        }
        java.lang.Object obj = signalRepositoryImpl$subscribeMultipleTokenUpdates$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalRepositoryImpl$subscribeMultipleTokenUpdates$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            signalRepositoryImpl$subscribeMultipleTokenUpdates$1.L$0 = this;
            signalRepositoryImpl$subscribeMultipleTokenUpdates$1.L$1 = list;
            signalRepositoryImpl$subscribeMultipleTokenUpdates$1.label = 1;
            if (copydefault(signalRepositoryImpl$subscribeMultipleTokenUpdates$1) == objCopydefault) {
                return objCopydefault;
            }
            c29467kuG = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) signalRepositoryImpl$subscribeMultipleTokenUpdates$1.L$1;
            c29467kuG = (C29467kuG) signalRepositoryImpl$subscribeMultipleTokenUpdates$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (list.isEmpty()) {
            return FlowKt.emptyFlow();
        }
        java.util.ArrayList<? extends WsSubscribeArgV5> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            arrayList2.add(new WsArgV5ForWeb3("dex-market-v3", null, (java.lang.String) pair.component1(), (java.lang.String) pair.component2(), null, 18, null));
        }
        arrayList.addAll(arrayList2);
        c29467kuG.AEQbTJ.copydefault("dex-market-v3", arrayList);
        return new Activity(c29467kuG.AEQbTJ.OLrzqt(), c29467kuG);
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        this.AEQbTJ.AEQbTJ("dex-market-v3");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        this.AEQbTJ.AEQbTJ("dex-market-sm-signal-status");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC29466kuF
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super AbstractC43419rot<SignalAlertHistoryData, OKServerException>> continuation) {
        return kAB.EZpvd(new SignalRepositoryImpl$getSignalAlertHistory$2(str, str2, list, this, null), continuation);
    }
}
