package com.okinc.kline.features.kline.bottom.marketevents.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$subscribeOnUiChange$1;
import com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC36244oUp;
import o.C33546myW;
import o.C36142oQv;
import o.C36157oRj;
import o.C36237oUi;
import o.C55237xgE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.oMN;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventsFragment$subscribeOnUiChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C36142oQv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketEventsFragment$subscribeOnUiChange$1(C36142oQv c36142oQv, Continuation<? super MarketEventsFragment$subscribeOnUiChange$1> continuation) {
        super(2, continuation);
        this.this$0 = c36142oQv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketEventsFragment$subscribeOnUiChange$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketEventsFragment$subscribeOnUiChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$subscribeOnUiChange$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends MarketEventsVo>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C36142oQv this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C36142oQv c36142oQv, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c36142oQv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49371unL<? extends List<? extends MarketEventsVo>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C55237xgE c55237xgE;
            C55237xgE c55237xgE2;
            C55237xgE c55237xgE3;
            C55237xgE c55237xgE4;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator) {
                    C33546myW c33546myW = this.this$0.values;
                    if (c33546myW != null) {
                        c33546myW.valueOf();
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    oMN omn = this.this$0.AYXKKw;
                    if (omn != null && (c55237xgE4 = omn.KWHzl) != null) {
                        C36237oUi.copydefault(c55237xgE4);
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    AbstractC36244oUp.submitList$default(this.this$0.OLrzqt(), (List) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault(), null, 2, null);
                    C33546myW c33546myW2 = this.this$0.values;
                    if (c33546myW2 != null) {
                        c33546myW2.valueOf();
                    }
                    oMN omn2 = this.this$0.AYXKKw;
                    if (omn2 != null && (c55237xgE3 = omn2.KWHzl) != null) {
                        C36237oUi.AEQbTJ(c55237xgE3);
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    C33546myW c33546myW3 = this.this$0.values;
                    if (c33546myW3 != null) {
                        c33546myW3.valueOf();
                    }
                    oMN omn3 = this.this$0.AYXKKw;
                    if (omn3 != null && (c55237xgE2 = omn3.KWHzl) != null) {
                        final C36142oQv c36142oQv = this.this$0;
                        C36237oUi.showError$default(c55237xgE2, null, null, null, 0, 0, new View.OnClickListener() { // from class: o.oQF
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                MarketEventsFragment$subscribeOnUiChange$1.AnonymousClass2.invokeSuspend$lambda$0(c36142oQv, view);
                            }
                        }, 31, null);
                    }
                    this.this$0.djBIcL().gEmmrt();
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                } else {
                    oMN omn4 = this.this$0.AYXKKw;
                    if (omn4 != null && (c55237xgE = omn4.KWHzl) != null) {
                        C36237oUi.showEmpty$default(c55237xgE, null, null, 0, 0, 15, null);
                    }
                }
                boolean z = interfaceC49371unL instanceof InterfaceC49371unL.Activity;
                C36142oQv c36142oQv2 = this.this$0;
                C33546myW c33546myW4 = c36142oQv2.values;
                if (c33546myW4 != null) {
                    c33546myW4.AhwBna(z);
                }
                C33546myW c33546myW5 = c36142oQv2.values;
                if (c33546myW5 != null) {
                    c33546myW5.setNoMoreDataEffective(z);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(C36142oQv c36142oQv, View view) {
            MarketEventsViewModel.queryMarketEventList$default(c36142oQv.djBIcL(), true, null, 2, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C36142oQv c36142oQv = this.this$0;
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(c36142oQv, c36142oQv.djBIcL(), new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$subscribeOnUiChange$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C36157oRj) obj2).copydefault();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C36157oRj) obj2).OLrzqt((InterfaceC49371unL) obj3);
                }
            }, null, new AnonymousClass2(this.this$0, null), 2, null);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass3, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$subscribeOnUiChange$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C36142oQv this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C36142oQv c36142oQv, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c36142oQv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$subscribeOnUiChange$1$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ C36142oQv this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C36142oQv c36142oQv, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c36142oQv;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (this.Z$0) {
                        this.this$0.djBIcL().OLrzqt(this.this$0.OLrzqt().EZpvd());
                        pUU.KWHzl(this.this$0.getTAG(), "receive ws market events");
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Boolean> sharedFlowAYXKKw = this.this$0.djBIcL().AYXKKw();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowAYXKKw, anonymousClass1, this) == objCopydefault) {
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
}
