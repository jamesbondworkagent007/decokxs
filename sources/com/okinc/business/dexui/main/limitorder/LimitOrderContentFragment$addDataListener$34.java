package com.okinc.business.dexui.main.limitorder;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderContentFragment$addDataListener$34 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LimitOrderContentFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderContentFragment$addDataListener$34(LimitOrderContentFragment limitOrderContentFragment, Continuation<? super LimitOrderContentFragment$addDataListener$34> continuation) {
        super(2, continuation);
        this.this$0 = limitOrderContentFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LimitOrderContentFragment$addDataListener$34(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LimitOrderContentFragment$addDataListener$34) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$addDataListener$34$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ LimitOrderContentFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LimitOrderContentFragment limitOrderContentFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = limitOrderContentFragment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$addDataListener$34$1$ActionBar */
        public static final class ActionBar implements Flow<String> {
            public final /* synthetic */ Flow EZpvd;
            public final /* synthetic */ LimitOrderContentFragment OLrzqt;

            /* JADX INFO: renamed from: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$addDataListener$34$1$ActionBar$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ LimitOrderContentFragment AEQbTJ;
                public final /* synthetic */ FlowCollector KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector, LimitOrderContentFragment limitOrderContentFragment) {
                    this.KWHzl = flowCollector;
                    this.AEQbTJ = limitOrderContentFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    LimitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1 limitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1;
                    if (continuation instanceof LimitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1) {
                        limitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1 = (LimitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i = limitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            limitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            limitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1 = new LimitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = limitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = limitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.KWHzl;
                        Result<DexPresetResultVO> resultOLrzqt = this.AEQbTJ.fARcdN().OLrzqt((String) obj);
                        if (!(resultOLrzqt != null && Result.m7384isSuccessimpl(resultOLrzqt.m7386unboximpl()))) {
                            limitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                            if (flowCollector.emit(obj, limitOrderContentFragment$addDataListener$34$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
                                return objCopydefault;
                            }
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

            public ActionBar(Flow flow, LimitOrderContentFragment limitOrderContentFragment) {
                this.EZpvd = flow;
                this.OLrzqt = limitOrderContentFragment;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector, this.OLrzqt), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ActionBar actionBar = new ActionBar(FlowKt.filterNotNull(this.this$0.fARcdN().AuCTel()), this.this$0);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
                this.label = 1;
                if (actionBar.collect(anonymousClass4, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$addDataListener$34$1$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ LimitOrderContentFragment copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(LimitOrderContentFragment limitOrderContentFragment) {
                this.copydefault = limitOrderContentFragment;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(String str, Continuation<? super Unit> continuation) throws Throwable {
                LimitOrderContentFragment$addDataListener$34$1$2$emit$1 limitOrderContentFragment$addDataListener$34$1$2$emit$1;
                AnonymousClass4<T> anonymousClass4;
                if (continuation instanceof LimitOrderContentFragment$addDataListener$34$1$2$emit$1) {
                    limitOrderContentFragment$addDataListener$34$1$2$emit$1 = (LimitOrderContentFragment$addDataListener$34$1$2$emit$1) continuation;
                    int i = limitOrderContentFragment$addDataListener$34$1$2$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        limitOrderContentFragment$addDataListener$34$1$2$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        limitOrderContentFragment$addDataListener$34$1$2$emit$1 = new LimitOrderContentFragment$addDataListener$34$1$2$emit$1(this, continuation);
                    }
                }
                Object obj = limitOrderContentFragment$addDataListener$34$1$2$emit$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = limitOrderContentFragment$addDataListener$34$1$2$emit$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    pUU.KWHzl(this.copydefault.getTAG(), "chainId=" + str);
                    MutableLiveData<TradeStep> currentStep = this.copydefault.fARcdN().zuWLRA().getCurrentStep();
                    Flow flowDrop = FlowKt.drop(FlowLiveDataConversions.asFlow(currentStep), Intrinsics.EZpvd(currentStep.getValue(), new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true)) ? 1 : 0);
                    LimitOrderContentFragment$addDataListener$34$1$2$1 limitOrderContentFragment$addDataListener$34$1$2$1 = new LimitOrderContentFragment$addDataListener$34$1$2$1(null);
                    limitOrderContentFragment$addDataListener$34$1$2$emit$1.L$0 = this;
                    limitOrderContentFragment$addDataListener$34$1$2$emit$1.L$1 = str;
                    limitOrderContentFragment$addDataListener$34$1$2$emit$1.label = 1;
                    if (FlowKt.first(flowDrop, limitOrderContentFragment$addDataListener$34$1$2$1, limitOrderContentFragment$addDataListener$34$1$2$emit$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    anonymousClass4 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) limitOrderContentFragment$addDataListener$34$1$2$emit$1.L$1;
                    anonymousClass4 = (AnonymousClass4) limitOrderContentFragment$addDataListener$34$1$2$emit$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                }
                pUU.KWHzl(anonymousClass4.copydefault.getTAG(), "after currentStep");
                anonymousClass4.copydefault.fARcdN().copydefault(str);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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
