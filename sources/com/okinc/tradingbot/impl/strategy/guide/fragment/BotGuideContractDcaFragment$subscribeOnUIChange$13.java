package com.okinc.tradingbot.impl.strategy.guide.fragment;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideContractDcaFragment$subscribeOnUIChange$13;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractDcaPresenter;
import com.okinc.unify_trade.biz.LossInsuranceBean;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C52410wKj;
import o.C52659wTp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class BotGuideContractDcaFragment$subscribeOnUIChange$13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C52410wKj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideContractDcaFragment$subscribeOnUIChange$13(C52410wKj c52410wKj, Continuation<? super BotGuideContractDcaFragment$subscribeOnUIChange$13> continuation) {
        super(2, continuation);
        this.this$0 = c52410wKj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotGuideContractDcaFragment$subscribeOnUIChange$13(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotGuideContractDcaFragment$subscribeOnUIChange$13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideContractDcaFragment$subscribeOnUIChange$13$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C52410wKj this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C52410wKj c52410wKj, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c52410wKj;
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

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideContractDcaFragment$subscribeOnUIChange$13$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06741<T> implements FlowCollector {
            public final /* synthetic */ C52410wKj EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C06741(C52410wKj c52410wKj) {
                this.EZpvd = c52410wKj;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return KWHzl((BotGuideContractDcaPresenter.StateListAnimator) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object KWHzl(final BotGuideContractDcaPresenter.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                if (!(stateListAnimator instanceof BotGuideContractDcaPresenter.StateListAnimator.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                C52659wTp c52659wTp = C52659wTp.copydefault;
                Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                BotGuideContractDcaPresenter.StateListAnimator.Application application = (BotGuideContractDcaPresenter.StateListAnimator.Application) stateListAnimator;
                LossInsuranceBean voucherInformation = application.AEQbTJ().getVoucherInformation();
                String voucherValue = voucherInformation != null ? voucherInformation.getVoucherValue() : null;
                if (voucherValue == null) {
                    voucherValue = "";
                }
                LossInsuranceBean voucherInformation2 = application.AEQbTJ().getVoucherInformation();
                String voucherCcy = voucherInformation2 != null ? voucherInformation2.getVoucherCcy() : null;
                String str = voucherCcy != null ? voucherCcy : "";
                final C52410wKj c52410wKj = this.EZpvd;
                Function0 function0 = new Function0() { // from class: o.wKC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return BotGuideContractDcaFragment$subscribeOnUIChange$13.AnonymousClass1.C06741.EZpvd(c52410wKj, stateListAnimator);
                    }
                };
                final C52410wKj c52410wKj2 = this.EZpvd;
                c52659wTp.EZpvd(contextRequireContext, voucherValue, str, (56 & 8) != 0 ? false : false, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null, function0, new Function0() { // from class: o.wKE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return BotGuideContractDcaFragment$subscribeOnUIChange$13.AnonymousClass1.C06741.copydefault(c52410wKj2, stateListAnimator);
                    }
                });
                return Unit.INSTANCE;
            }

            public static final Unit EZpvd(C52410wKj c52410wKj, BotGuideContractDcaPresenter.StateListAnimator stateListAnimator) {
                C52410wKj.copydefault(c52410wKj).AEQbTJ(((BotGuideContractDcaPresenter.StateListAnimator.Application) stateListAnimator).AEQbTJ());
                return Unit.INSTANCE;
            }

            public static final Unit copydefault(C52410wKj c52410wKj, BotGuideContractDcaPresenter.StateListAnimator stateListAnimator) {
                C52410wKj.copydefault(c52410wKj).OLrzqt(((BotGuideContractDcaPresenter.StateListAnimator.Application) stateListAnimator).AEQbTJ());
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<BotGuideContractDcaPresenter.StateListAnimator> sharedFlowWlaJM = C52410wKj.copydefault(this.this$0).wlaJM();
                C06741 c06741 = new C06741(this.this$0);
                this.label = 1;
                if (sharedFlowWlaJM.collect(c06741, this) == objCopydefault) {
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
            C52410wKj c52410wKj = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c52410wKj, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c52410wKj, state, anonymousClass1, this) == objCopydefault) {
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
