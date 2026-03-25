package com.okinc.business.dexui.main.swap.trade.single.advanced;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
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
public final class SwapSingleTradeContentFragment$addDataListener$39 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SwapSingleTradeContentFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwapSingleTradeContentFragment$addDataListener$39(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Continuation<? super SwapSingleTradeContentFragment$addDataListener$39> continuation) {
        super(2, continuation);
        this.this$0 = swapSingleTradeContentFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwapSingleTradeContentFragment$addDataListener$39(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwapSingleTradeContentFragment$addDataListener$39) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$addDataListener$39$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SwapSingleTradeContentFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = swapSingleTradeContentFragment;
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

        /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$addDataListener$39$1$TaskDescription */
        public static final class TaskDescription implements Flow<String> {
            public final /* synthetic */ Flow AEQbTJ;
            public final /* synthetic */ SwapSingleTradeContentFragment OLrzqt;

            /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$addDataListener$39$1$TaskDescription$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ SwapSingleTradeContentFragment AEQbTJ;
                public final /* synthetic */ FlowCollector EZpvd;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector, SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
                    this.EZpvd = flowCollector;
                    this.AEQbTJ = swapSingleTradeContentFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    SwapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1 swapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1;
                    if (continuation instanceof SwapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1) {
                        swapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1 = (SwapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i = swapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            swapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            swapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1 = new SwapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = swapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = swapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.EZpvd;
                        Result<DexPresetResultVO> resultOLrzqt = this.AEQbTJ.values().OLrzqt((String) obj);
                        if (!(resultOLrzqt != null && Result.m7384isSuccessimpl(resultOLrzqt.m7386unboximpl()))) {
                            swapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                            if (flowCollector.emit(obj, swapSingleTradeContentFragment$addDataListener$39$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
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

            public TaskDescription(Flow flow, SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
                this.AEQbTJ = flow;
                this.OLrzqt = swapSingleTradeContentFragment;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector, this.OLrzqt), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                TaskDescription taskDescription = new TaskDescription(FlowKt.filterNotNull(this.this$0.values().fHqPtx()), this.this$0);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0);
                this.label = 1;
                if (taskDescription.collect(anonymousClass3, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$addDataListener$39$1$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ SwapSingleTradeContentFragment copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
                this.copydefault = swapSingleTradeContentFragment;
            }

            /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment.AuCTelauCTel(com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment):o.hsv */
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(String str, Continuation<? super Unit> continuation) throws Throwable {
                SwapSingleTradeContentFragment$addDataListener$39$1$2$emit$1 swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1;
                AnonymousClass3<T> anonymousClass3;
                if (continuation instanceof SwapSingleTradeContentFragment$addDataListener$39$1$2$emit$1) {
                    swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1 = (SwapSingleTradeContentFragment$addDataListener$39$1$2$emit$1) continuation;
                    int i = swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1 = new SwapSingleTradeContentFragment$addDataListener$39$1$2$emit$1(this, continuation);
                    }
                }
                Object obj = swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    pUU.KWHzl(this.copydefault.getTAG(), "chainId=" + str);
                    MutableLiveData<TradeStep> currentStep = this.copydefault.values().dHguZz().getCurrentStep();
                    Flow flowDrop = FlowKt.drop(FlowLiveDataConversions.asFlow(currentStep), Intrinsics.EZpvd(currentStep.getValue(), new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true)) ? 1 : 0);
                    SwapSingleTradeContentFragment$addDataListener$39$1$2$1 swapSingleTradeContentFragment$addDataListener$39$1$2$1 = new SwapSingleTradeContentFragment$addDataListener$39$1$2$1(null);
                    swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1.L$0 = this;
                    swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1.L$1 = str;
                    swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1.label = 1;
                    if (FlowKt.first(flowDrop, swapSingleTradeContentFragment$addDataListener$39$1$2$1, swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    anonymousClass3 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1.L$1;
                    anonymousClass3 = (AnonymousClass3) swapSingleTradeContentFragment$addDataListener$39$1$2$emit$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                }
                pUU.KWHzl(anonymousClass3.copydefault.getTAG(), "after currentStep");
                anonymousClass3.copydefault.values().AEQbTJ(str);
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
