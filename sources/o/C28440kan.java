package o;

import com.okinc.business.market.common.websocket.DexWsParam;
import com.okinc.business.market.data.model.holdings.HoldingListResponseData;
import com.okinc.business.market.data.model.position_pnl.HoldingTokenData;
import com.okinc.business.market.data.model.position_pnl.HoldingTransactionData;
import com.okinc.business.market.data.model.position_pnl.NewTransactionData;
import com.okinc.business.market.features.holdings.repo.HoldingsRepositoryImpl$getWalletHoldings$2;
import com.okinc.business.market.features.holdings.repo.HoldingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.holdings.repo.HoldingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kan, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28440kan implements InterfaceC28437kak {
    public final C27640jyx AEQbTJ;
    public final C27640jyx EZpvd;
    public final Json KWHzl;
    public final java.lang.String OLrzqt;
    public final InterfaceC23229huL copydefault;

    @yCM
    public C28440kan(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull C27640jyx c27640jyx, @NotNull C27640jyx c27640jyx2, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.copydefault = interfaceC23229huL;
        this.EZpvd = c27640jyx;
        this.AEQbTJ = c27640jyx2;
        this.KWHzl = json;
        this.OLrzqt = "dex-market-pnl-latest-pub";
    }

    /* JADX INFO: renamed from: o.kan$ActionBar */
    public static final class ActionBar implements Flow<java.util.List<? extends HoldingTokenData>> {
        public final /* synthetic */ C28440kan OLrzqt;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kan$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ C28440kan AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C28440kan c28440kan) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = c28440kan;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HoldingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1 holdingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1;
                java.util.List list;
                if (continuation instanceof HoldingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1) {
                    holdingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1 = (HoldingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1) continuation;
                    int i = holdingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        holdingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        holdingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1 = new HoldingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = holdingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = holdingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Json json = this.AEQbTJ.KWHzl;
                        json.getSerializersModule();
                        list = (java.util.List) json.decodeFromString(new ArrayListSerializer(HoldingTokenData.Companion.serializer()), str);
                    } catch (java.lang.Exception unused) {
                        list = null;
                    }
                    if (list != null) {
                        holdingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(list, holdingsRepositoryImpl$subTokenPrice$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C28440kan c28440kan) {
            this.copydefault = flow;
            this.OLrzqt = c28440kan;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends HoldingTokenData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kan$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.List<? extends HoldingTransactionData>> {
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ C28440kan copydefault;

        /* JADX INFO: renamed from: o.kan$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C28440kan OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C28440kan c28440kan) {
                this.copydefault = flowCollector;
                this.OLrzqt = c28440kan;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HoldingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1 holdingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1;
                NewTransactionData newTransactionData;
                if (continuation instanceof HoldingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1) {
                    holdingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1 = (HoldingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1) continuation;
                    int i = holdingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        holdingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        holdingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1 = new HoldingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = holdingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = holdingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Json json = this.OLrzqt.KWHzl;
                        json.getSerializersModule();
                        newTransactionData = (NewTransactionData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) json.decodeFromString(new ArrayListSerializer(NewTransactionData.Companion.serializer()), str));
                    } catch (java.lang.Exception unused) {
                    }
                    java.util.List<HoldingTransactionData> holdingList = newTransactionData != null ? newTransactionData.getHoldingList() : null;
                    if (holdingList != null) {
                        holdingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(holdingList, holdingsRepositoryImpl$subHoldingsTokens$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, C28440kan c28440kan) {
            this.OLrzqt = flow;
            this.copydefault = c28440kan;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends HoldingTransactionData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC28437kak
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull C28443kaq c28443kaq, @NotNull Continuation<? super AbstractC43419rot<HoldingListResponseData, OKServerException>> continuation) {
        return kAB.EZpvd(new HoldingsRepositoryImpl$getWalletHoldings$2(this, str, str2, str3, z, c28443kaq, null), continuation);
    }

    @Override // o.InterfaceC28437kak
    public java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<HoldingTransactionData>>> continuation) {
        java.util.ArrayList<? extends WsSubscribeArgV5> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new DexWsParam(this.OLrzqt, null, null, null, (java.lang.String) it.next(), null, 46, null));
        }
        arrayList.addAll(arrayList2);
        return new StateListAnimator(this.EZpvd.KWHzl(this.OLrzqt, arrayList), this);
    }

    @Override // o.InterfaceC28437kak
    public void OLrzqt() {
        this.EZpvd.AEQbTJ();
    }

    @Override // o.InterfaceC28437kak
    public java.lang.Object EZpvd(@NotNull java.util.List<C28438kal> list, @NotNull Continuation<? super Flow<? extends java.util.List<HoldingTokenData>>> continuation) {
        java.util.ArrayList<? extends WsSubscribeArgV5> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C28438kal c28438kal : list) {
            arrayList2.add(new WsArgV5ForWeb3("dex-market-v3", null, c28438kal.copydefault(), c28438kal.OLrzqt(), null, 18, null));
        }
        arrayList.addAll(arrayList2);
        return new ActionBar(this.AEQbTJ.KWHzl("dex-market-v3", arrayList), this);
    }

    @Override // o.InterfaceC28437kak
    public void EZpvd() {
        this.AEQbTJ.AEQbTJ();
    }
}
