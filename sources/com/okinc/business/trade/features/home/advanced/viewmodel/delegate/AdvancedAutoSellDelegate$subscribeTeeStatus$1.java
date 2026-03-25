package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC30503lcQ;
import o.C28227kTp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28149kQs;
import o.InterfaceC30595leC;
import o.dTH;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellDelegate$subscribeTeeStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<InterfaceC30595leC> $getPlaceOrderError;
    final /* synthetic */ Function1<AbstractC30503lcQ, Unit> $onAutoSellChanged;
    final /* synthetic */ Function1<InterfaceC30595leC, Unit> $onHandleInputFields;
    int label;
    final /* synthetic */ C28227kTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.leC, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends o.leC> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.lcQ, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedAutoSellDelegate$subscribeTeeStatus$1(C28227kTp c28227kTp, Function1<? super InterfaceC30595leC, Unit> function1, Function0<? extends InterfaceC30595leC> function0, Function1<? super AbstractC30503lcQ, Unit> function12, Continuation<? super AdvancedAutoSellDelegate$subscribeTeeStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = c28227kTp;
        this.$onHandleInputFields = function1;
        this.$getPlaceOrderError = function0;
        this.$onAutoSellChanged = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedAutoSellDelegate$subscribeTeeStatus$1(this.this$0, this.$onHandleInputFields, this.$getPlaceOrderError, this.$onAutoSellChanged, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedAutoSellDelegate$subscribeTeeStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$subscribeTeeStatus$1$3, reason: invalid class name */
    public static final class AnonymousClass3<T> implements FlowCollector {
        public final /* synthetic */ Function1<InterfaceC30595leC, Unit> AEQbTJ;
        public final /* synthetic */ C28227kTp EZpvd;
        public final /* synthetic */ Function0<InterfaceC30595leC> KWHzl;
        public final /* synthetic */ Function1<AbstractC30503lcQ, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.leC, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends o.leC> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.lcQ, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C28227kTp c28227kTp, Function1<? super InterfaceC30595leC, Unit> function1, Function0<? extends InterfaceC30595leC> function0, Function1<? super AbstractC30503lcQ, Unit> function12) {
            this.EZpvd = c28227kTp;
            this.AEQbTJ = function1;
            this.KWHzl = function0;
            this.copydefault = function12;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(dTH dth, Continuation<? super Unit> continuation) throws Throwable {
            AdvancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1 advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1;
            AbstractC30503lcQ abstractC30503lcQ;
            AnonymousClass3<T> anonymousClass3;
            AbstractC30503lcQ stateListAnimator;
            if (continuation instanceof AdvancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1) {
                advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1 = (AdvancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1) continuation;
                int i = advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1 = new AdvancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1(this, continuation);
                }
            }
            Object objOLrzqt = advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                pUU.KWHzl("AutoSellDelegate", "Tee status: " + dth);
                AbstractC30503lcQ abstractC30503lcQ2 = (AbstractC30503lcQ) this.EZpvd.copydefault.getValue();
                abstractC30503lcQ = AbstractC30503lcQ.Activity.AEQbTJ;
                if (!Intrinsics.EZpvd(abstractC30503lcQ2, abstractC30503lcQ)) {
                    if (this.EZpvd.AkhnZx.AYXKKw()) {
                        InterfaceC28149kQs interfaceC28149kQs = this.EZpvd.gEmmrt;
                        advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1.L$0 = this;
                        advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1.label = 1;
                        objOLrzqt = interfaceC28149kQs.OLrzqt(advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        anonymousClass3 = this;
                        stateListAnimator = new AbstractC30503lcQ.StateListAnimator((List) objOLrzqt);
                    } else {
                        InterfaceC28149kQs interfaceC28149kQs2 = this.EZpvd.gEmmrt;
                        advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1.L$0 = this;
                        advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1.label = 2;
                        objOLrzqt = interfaceC28149kQs2.OLrzqt(advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        anonymousClass3 = this;
                        stateListAnimator = new AbstractC30503lcQ.Application((List) objOLrzqt);
                    }
                } else {
                    anonymousClass3 = this;
                    anonymousClass3.AEQbTJ.invoke(anonymousClass3.KWHzl.invoke());
                    if (!Intrinsics.EZpvd(abstractC30503lcQ, anonymousClass3.EZpvd.copydefault.getValue())) {
                        anonymousClass3.copydefault.invoke(abstractC30503lcQ);
                    }
                    return Unit.INSTANCE;
                }
            } else if (i2 == 1) {
                anonymousClass3 = (AnonymousClass3) advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                stateListAnimator = new AbstractC30503lcQ.StateListAnimator((List) objOLrzqt);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                anonymousClass3 = (AnonymousClass3) advancedAutoSellDelegate$subscribeTeeStatus$1$1$emit$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                stateListAnimator = new AbstractC30503lcQ.Application((List) objOLrzqt);
            }
            abstractC30503lcQ = stateListAnimator;
            anonymousClass3.AEQbTJ.invoke(anonymousClass3.KWHzl.invoke());
            if (!Intrinsics.EZpvd(abstractC30503lcQ, anonymousClass3.EZpvd.copydefault.getValue())) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<dTH> stateFlowAEQbTJ = this.this$0.AkhnZx.AEQbTJ();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$onHandleInputFields, this.$getPlaceOrderError, this.$onAutoSellChanged);
            this.label = 1;
            if (stateFlowAEQbTJ.collect(anonymousClass3, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
