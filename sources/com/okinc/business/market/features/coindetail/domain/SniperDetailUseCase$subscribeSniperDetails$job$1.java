package com.okinc.business.market.features.coindetail.domain;

import com.okinc.business.market.features.coindetail.domain.models.EarlyBuyersWs;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C26029jPh;
import o.C26041jPt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25998jOd;
import o.jNP;
import o.jNS;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class SniperDetailUseCase$subscribeSniperDetails$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ jNS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SniperDetailUseCase$subscribeSniperDetails$job$1(jNS jns, String str, String str2, Continuation<? super SniperDetailUseCase$subscribeSniperDetails$job$1> continuation) {
        super(2, continuation);
        this.this$0 = jns;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SniperDetailUseCase$subscribeSniperDetails$job$1(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SniperDetailUseCase$subscribeSniperDetails$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25998jOd interfaceC25998jOd = this.this$0.gEmmrt;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            obj = interfaceC25998jOd.KWHzl(str, str2, this);
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
        final jNS jns = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.coindetail.domain.SniperDetailUseCase$subscribeSniperDetails$job$1.2
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final Object emit(C26029jPh c26029jPh, Continuation<? super Unit> continuation) {
                Object objEmit = jns.AEQbTJ.emit(c26029jPh, continuation);
                return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (stateListAnimator.collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements Flow<C26029jPh> {
        public final /* synthetic */ jNS KWHzl;
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.market.features.coindetail.domain.SniperDetailUseCase$subscribeSniperDetails$job$1$StateListAnimator$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ jNS OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, jNS jns) {
                this.AEQbTJ = flowCollector;
                this.OLrzqt = jns;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                SniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1 sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
                List<C26041jPt> listAhwBna;
                Object objM7386unboximpl;
                FlowCollector flowCollector;
                if (continuation instanceof SniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                    sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (SniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                    int i = sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new SniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                Object obj2 = sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.AEQbTJ;
                    EarlyBuyersWs earlyBuyersWs = (EarlyBuyersWs) obj;
                    jNP jnp = this.OLrzqt.OLrzqt;
                    C26029jPh c26029jPh = (C26029jPh) this.OLrzqt.AEQbTJ.getValue();
                    if (c26029jPh == null || (listAhwBna = c26029jPh.AEQbTJ()) == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = flowCollector2;
                    sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                    Object objCopydefault2 = jnp.copydefault(earlyBuyersWs, listAhwBna, sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7386unboximpl = objCopydefault2;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                    flowCollector = flowCollector3;
                }
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                if (objM7386unboximpl != null) {
                    sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                    sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 2;
                    if (flowCollector.emit(objM7386unboximpl, sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, jNS jns) {
            this.OLrzqt = flow;
            this.KWHzl = jns;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C26029jPh> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
