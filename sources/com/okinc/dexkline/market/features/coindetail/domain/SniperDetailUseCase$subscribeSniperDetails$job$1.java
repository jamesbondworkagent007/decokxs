package com.okinc.dexkline.market.features.coindetail.domain;

import com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyersWs;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C32316mXm;
import o.C56391yDq;
import o.C56442yFn;
import o.mWB;
import o.mWD;
import o.mWI;
import o.mXB;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class SniperDetailUseCase$subscribeSniperDetails$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ mWD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SniperDetailUseCase$subscribeSniperDetails$job$1(mWD mwd, String str, String str2, Continuation<? super SniperDetailUseCase$subscribeSniperDetails$job$1> continuation) {
        super(2, continuation);
        this.this$0 = mwd;
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
            mWI mwi = this.this$0.valueOf;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            obj = mwi.copydefault(str, str2, this);
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
        Application application = new Application((Flow) obj, this.this$0);
        final mWD mwd = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.dexkline.market.features.coindetail.domain.SniperDetailUseCase$subscribeSniperDetails$job$1.1
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public final Object emit(C32316mXm c32316mXm, Continuation<? super Unit> continuation) {
                Object objEmit = mwd.EZpvd.emit(c32316mXm, continuation);
                return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (application.collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements Flow<C32316mXm> {
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ mWD copydefault;

        /* JADX INFO: renamed from: com.okinc.dexkline.market.features.coindetail.domain.SniperDetailUseCase$subscribeSniperDetails$job$1$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ mWD copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, mWD mwd) {
                this.AEQbTJ = flowCollector;
                this.copydefault = mwd;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                SniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1 sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
                List<mXB> listAhwBna;
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
                    mWB mwb = this.copydefault.OLrzqt;
                    C32316mXm c32316mXm = (C32316mXm) this.copydefault.EZpvd.getValue();
                    if (c32316mXm == null || (listAhwBna = c32316mXm.OLrzqt()) == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = flowCollector2;
                    sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                    Object objCopydefault2 = mwb.copydefault(earlyBuyersWs, listAhwBna, sniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1);
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

        public Application(Flow flow, mWD mwd) {
            this.OLrzqt = flow;
            this.copydefault = mwd;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C32316mXm> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
