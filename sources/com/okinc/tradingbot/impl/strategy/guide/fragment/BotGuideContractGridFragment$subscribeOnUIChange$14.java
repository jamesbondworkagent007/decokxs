package com.okinc.tradingbot.impl.strategy.guide.fragment;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractGridPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C54589xNz;
import o.C56059xvf;
import o.C56131xwy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.InterfaceC55701xos;
import o.wKF;

/* JADX INFO: loaded from: classes19.dex */
public final class BotGuideContractGridFragment$subscribeOnUIChange$14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ wKF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideContractGridFragment$subscribeOnUIChange$14(wKF wkf, Continuation<? super BotGuideContractGridFragment$subscribeOnUIChange$14> continuation) {
        super(2, continuation);
        this.this$0 = wkf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotGuideContractGridFragment$subscribeOnUIChange$14(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotGuideContractGridFragment$subscribeOnUIChange$14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideContractGridFragment$subscribeOnUIChange$14$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ wKF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wKF wkf, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = wkf;
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
                SharedFlow<BotGuideContractGridPresenter.TaskDescription> sharedFlowZuBGHE = wKF.KWHzl(this.this$0).zuBGHE();
                final wKF wkf = this.this$0;
                FlowCollector<? super BotGuideContractGridPresenter.TaskDescription> flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideContractGridFragment.subscribeOnUIChange.14.1.5
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(final BotGuideContractGridPresenter.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                        C56131xwy c56131xwyFetchVPNInfo;
                        if (wkf.AuCTel()) {
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                            if (interfaceC54581xNrOLrzqt != null && (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt.fetchVPNInfo()) != null) {
                                BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
                                String instId = bizInstrumentIsConnected != null ? bizInstrumentIsConnected.getInstId() : null;
                                if (instId == null) {
                                    instId = "";
                                }
                                final wKF wkf2 = wkf;
                                c56131xwyFetchVPNInfo.AEQbTJ(instId, new InterfaceC55701xos<TickersData>() { // from class: com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideContractGridFragment.subscribeOnUIChange.14.1.5.5
                                    /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
                                    @Override // o.InterfaceC55701xos
                                    public void EZpvd(boolean z, TickersData tickersData, Exception exc) {
                                        wkf2.OLrzqt(taskDescription, tickersData != null ? tickersData.getLast() : null);
                                    }
                                });
                            }
                        } else {
                            wKF.showConfirmationDialog$default(wkf, taskDescription, null, 2, null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowZuBGHE.collect(flowCollector, this) == objCopydefault) {
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
            wKF wkf = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(wkf, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(wkf, state, anonymousClass1, this) == objCopydefault) {
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
