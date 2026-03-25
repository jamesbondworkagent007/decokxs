package com.okinc.business.dex.trade.component.orderandposition.position.viewmodel;

import com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.PositionComponentVewModel;
import com.okinc.business.market.data.model.position_pnl.HoldingTransactionData;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28434kah;
import o.C28438kal;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C59467zhb;
import o.pUU;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes5.dex */
public final class PositionComponentVewModel$subscribeToPnlUpdates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PositionComponentVewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionComponentVewModel$subscribeToPnlUpdates$1(PositionComponentVewModel positionComponentVewModel, Continuation<? super PositionComponentVewModel$subscribeToPnlUpdates$1> continuation) {
        super(2, continuation);
        this.this$0 = positionComponentVewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionComponentVewModel$subscribeToPnlUpdates$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionComponentVewModel$subscribeToPnlUpdates$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class StateListAnimator implements Flow<Map<C28438kal, ? extends PositionComponentVewModel.TaskDescription>> {
        public final /* synthetic */ PositionComponentVewModel AEQbTJ;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.PositionComponentVewModel$subscribeToPnlUpdates$1$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ PositionComponentVewModel KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, PositionComponentVewModel positionComponentVewModel) {
                this.AEQbTJ = flowCollector;
                this.KWHzl = positionComponentVewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PositionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1 positionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1;
                Map mapKWHzl;
                if (continuation instanceof PositionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1) {
                    positionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1 = (PositionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = positionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        positionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        positionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1 = new PositionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = positionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = positionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    List list = (List) obj;
                    pUU.EZpvd("PositionComponentVM", "PNL Push: " + list + ", Visible Tokens: " + this.KWHzl.AYXKKw().getValue());
                    Set<C28438kal> value = this.KWHzl.AYXKKw().getValue();
                    if (value.isEmpty()) {
                        mapKWHzl = C56424yEw.KWHzl();
                    } else {
                        Sequence<HoldingTransactionData> sequenceDbNXlk = C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(list), new Application(value));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (HoldingTransactionData holdingTransactionData : sequenceDbNXlk) {
                            linkedHashMap.put(new C28438kal(holdingTransactionData.getChainId(), holdingTransactionData.getTokenContractAddress()), PositionComponentVewModel.calculatePnlMetrics$default(this.KWHzl, holdingTransactionData.getChainId(), holdingTransactionData.getTokenContractAddress(), PositionComponentVewModel.PnLFor.PnLPush, null, null, holdingTransactionData.getBoughtAvgPrice(), holdingTransactionData.getSpotBalance(), null, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, null));
                        }
                        mapKWHzl = linkedHashMap;
                    }
                    positionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(mapKWHzl, positionComponentVewModel$subscribeToPnlUpdates$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, PositionComponentVewModel positionComponentVewModel) {
            this.copydefault = flow;
            this.AEQbTJ = positionComponentVewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Map<C28438kal, ? extends PositionComponentVewModel.TaskDescription>> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28434kah c28434kah = this.this$0.valueOf;
            this.label = 1;
            obj = c28434kah.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        StateListAnimator stateListAnimator = new StateListAnimator((Flow) obj, this.this$0);
        final PositionComponentVewModel positionComponentVewModel = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.PositionComponentVewModel$subscribeToPnlUpdates$1.3
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final Object emit(Map<C28438kal, PositionComponentVewModel.TaskDescription> map, Continuation<? super Unit> continuation) {
                Object value;
                MutableStateFlow mutableStateFlow = positionComponentVewModel.KWHzl;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, map));
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (stateListAnimator.collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements Function1<HoldingTransactionData, Boolean> {
        public final /* synthetic */ Set<C28438kal> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Set<C28438kal> set) {
            this.EZpvd = set;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(HoldingTransactionData holdingTransactionData) {
            boolean z;
            Intrinsics.checkNotNullParameter(holdingTransactionData, "");
            Set<C28438kal> set = this.EZpvd;
            if ((set instanceof Collection) && set.isEmpty()) {
                z = false;
            } else {
                for (C28438kal c28438kal : set) {
                    if (Intrinsics.EZpvd((Object) c28438kal.copydefault(), (Object) holdingTransactionData.getChainId()) && Intrinsics.EZpvd((Object) c28438kal.OLrzqt(), (Object) holdingTransactionData.getTokenContractAddress())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
