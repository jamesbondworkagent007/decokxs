package com.okinc.buysell.ui.buysellconvert.transaction.buysell;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C3679AqW;
import o.C3682AqZ;
import o.C56391yDq;
import o.C56442yFn;
import o.lIN;
import uniffi.buy_sell.BuySellOrderDetailContentStateVariant;

/* JADX INFO: loaded from: classes23.dex */
public final class BuySellOrderDetailFragmentV2$addObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ lIN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellOrderDetailFragmentV2$addObservers$1(lIN lin, Continuation<? super BuySellOrderDetailFragmentV2$addObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = lin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuySellOrderDetailFragmentV2$addObservers$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuySellOrderDetailFragmentV2$addObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailFragmentV2$addObservers$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ lIN this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lIN lin, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = lin;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<C3679AqW> stateFlowEZpvd = this.this$0.OLrzqt().EZpvd();
                final lIN lin = this.this$0;
                FlowCollector<? super C3679AqW> flowCollector = new FlowCollector() { // from class: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailFragmentV2.addObservers.1.1.2

                    /* JADX INFO: renamed from: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailFragmentV2$addObservers$1$1$2$Application */
                    public final /* synthetic */ class Application {
                        public static final /* synthetic */ int[] copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        static {
                            int[] iArr = new int[BuySellOrderDetailContentStateVariant.values().length];
                            try {
                                iArr[BuySellOrderDetailContentStateVariant.IDLE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[BuySellOrderDetailContentStateVariant.LOADING.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[BuySellOrderDetailContentStateVariant.SUCCESS.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[BuySellOrderDetailContentStateVariant.ERROR.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            copydefault = iArr;
                        }
                    }

                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C3679AqW c3679AqW, Continuation<? super Unit> continuation) {
                        int i2 = Application.copydefault[c3679AqW.EZpvd().ordinal()];
                        if (i2 == 1) {
                            lin.AEQbTJ();
                        } else if (i2 == 2) {
                            lin.KWHzl();
                        } else if (i2 == 3) {
                            C3682AqZ c3682AqZOLrzqt = c3679AqW.OLrzqt();
                            if (c3682AqZOLrzqt != null) {
                                lIN lin2 = lin;
                                lin2.EZpvd(c3682AqZOLrzqt);
                                lin2.OLrzqt().copydefault(c3682AqZOLrzqt);
                                lin2.valueOf();
                            }
                        } else if (i2 == 4) {
                            lin.DbNXlk();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
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
