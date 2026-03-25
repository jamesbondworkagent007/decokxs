package com.okinc.okmarket.ui.market.remind.fragment;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C42933rfk;
import o.C46825teV;
import o.C46901tfs;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceRemindEditFragment$initUIStatus$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C46825teV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRemindEditFragment$initUIStatus$3(C46825teV c46825teV, Continuation<? super PriceRemindEditFragment$initUIStatus$3> continuation) {
        super(2, continuation);
        this.this$0 = c46825teV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriceRemindEditFragment$initUIStatus$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriceRemindEditFragment$initUIStatus$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements Flow<String> {
        public final /* synthetic */ C46825teV EZpvd;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$3$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ C46825teV AEQbTJ;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C46825teV c46825teV) {
                this.KWHzl = flowCollector;
                this.AEQbTJ = c46825teV;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PriceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1 priceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1;
                String strAEQbTJ;
                if (continuation instanceof PriceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1) {
                    priceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1 = (PriceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = priceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        priceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        priceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1 = new PriceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = priceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = priceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    C46901tfs c46901tfs = (C46901tfs) obj;
                    if (this.AEQbTJ.iwGUEr != 4) {
                        strAEQbTJ = this.AEQbTJ.isConnected().OLrzqt(c46901tfs.AEQbTJ());
                    } else {
                        strAEQbTJ = this.AEQbTJ.isConnected().AEQbTJ(c46901tfs.AEQbTJ());
                    }
                    priceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(strAEQbTJ, priceRemindEditFragment$initUIStatus$3$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C46825teV c46825teV) {
            this.copydefault = flow;
            this.EZpvd = c46825teV;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActionBar actionBar = new ActionBar(this.this$0.isConnected().copydefault(), this.this$0);
            final C46825teV c46825teV = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$3.1
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    C52794wYp c52794wYp;
                    C42933rfk c42933rfkAYXKKw = c46825teV.AYXKKw();
                    if (c42933rfkAYXKKw != null && (c52794wYp = c42933rfkAYXKKw.AEQbTJ) != null) {
                        c52794wYp.setEnabled(str == null);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (actionBar.collect(flowCollector, this) == objCopydefault) {
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
