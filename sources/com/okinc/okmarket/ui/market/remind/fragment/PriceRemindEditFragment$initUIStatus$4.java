package com.okinc.okmarket.ui.market.remind.fragment;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C33070mpX;
import o.C42933rfk;
import o.C46693tbw;
import o.C46825teV;
import o.C46901tfs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.qZH;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceRemindEditFragment$initUIStatus$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C46825teV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRemindEditFragment$initUIStatus$4(C46825teV c46825teV, Continuation<? super PriceRemindEditFragment$initUIStatus$4> continuation) {
        super(2, continuation);
        this.this$0 = c46825teV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriceRemindEditFragment$initUIStatus$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriceRemindEditFragment$initUIStatus$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Application implements Flow<Integer> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$4$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PriceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1 priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof PriceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1) {
                    priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1 = (PriceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1 = new PriceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(((C46901tfs) obj).AEQbTJ().getPercentageTime());
                    priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Flow<String> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$4$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PriceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1 priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1;
                String strAYXKKw;
                if (continuation instanceof PriceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1) {
                    priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1 = (PriceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1) continuation;
                    int i = priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1 = new PriceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue == 0) {
                        strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.OGitdB);
                    } else if (iIntValue == 1) {
                        strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.zdxASf);
                    } else if (iIntValue == 2) {
                        strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.zzJhsT);
                    } else {
                        strAYXKKw = iIntValue != 3 ? "" : C33070mpX.AYXKKw(qZH.PendingIntent.geLlBI);
                    }
                    priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(strAYXKKw, priceRemindEditFragment$initUIStatus$4$invokeSuspend$$inlined$map$2$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateListAnimator stateListAnimator = new StateListAnimator(FlowKt.distinctUntilChanged(new Application(this.this$0.isConnected().copydefault())));
            final C46825teV c46825teV = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$4.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    C46693tbw c46693tbw;
                    C42933rfk c42933rfkAYXKKw = c46825teV.AYXKKw();
                    if (c42933rfkAYXKKw != null && (c46693tbw = c42933rfkAYXKKw.fetchVPNInfo) != null) {
                        c46693tbw.OLrzqt(str);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateListAnimator.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
