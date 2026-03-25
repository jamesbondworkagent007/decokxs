package com.okinc.tradingbot.impl.strategy.guide.fragment;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideSpotGridFragment$subscribeOnUIChange$11;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideSpotGridPresenter;
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
import o.C52435wLh;
import o.C52659wTp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class BotGuideSpotGridFragment$subscribeOnUIChange$11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C52435wLh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideSpotGridFragment$subscribeOnUIChange$11(C52435wLh c52435wLh, Continuation<? super BotGuideSpotGridFragment$subscribeOnUIChange$11> continuation) {
        super(2, continuation);
        this.this$0 = c52435wLh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotGuideSpotGridFragment$subscribeOnUIChange$11(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotGuideSpotGridFragment$subscribeOnUIChange$11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideSpotGridFragment$subscribeOnUIChange$11$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C52435wLh this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C52435wLh c52435wLh, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c52435wLh;
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

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideSpotGridFragment$subscribeOnUIChange$11$1$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C52435wLh EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(C52435wLh c52435wLh) {
                this.EZpvd = c52435wLh;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return AEQbTJ((BotGuideSpotGridPresenter.Activity) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object AEQbTJ(final BotGuideSpotGridPresenter.Activity activity, Continuation<? super Unit> continuation) {
                String voucherCcy;
                if (activity instanceof BotGuideSpotGridPresenter.Activity.TaskDescription) {
                    C52659wTp c52659wTp = C52659wTp.copydefault;
                    Context contextRequireContext = this.EZpvd.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    BotGuideSpotGridPresenter.Activity.TaskDescription taskDescription = (BotGuideSpotGridPresenter.Activity.TaskDescription) activity;
                    LossInsuranceBean voucherInformation = taskDescription.KWHzl().getVoucherInformation();
                    String voucherValue = voucherInformation != null ? voucherInformation.getVoucherValue() : null;
                    if (voucherValue == null) {
                        voucherValue = "";
                    }
                    LossInsuranceBean voucherInformation2 = taskDescription.KWHzl().getVoucherInformation();
                    voucherCcy = voucherInformation2 != null ? voucherInformation2.getVoucherCcy() : null;
                    String str = voucherCcy == null ? "" : voucherCcy;
                    final C52435wLh c52435wLh = this.EZpvd;
                    Function0 function0 = new Function0() { // from class: o.wLD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return BotGuideSpotGridFragment$subscribeOnUIChange$11.AnonymousClass1.AnonymousClass5.copydefault(c52435wLh, activity);
                        }
                    };
                    final C52435wLh c52435wLh2 = this.EZpvd;
                    c52659wTp.EZpvd(contextRequireContext, voucherValue, str, (56 & 8) != 0 ? false : false, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null, function0, new Function0() { // from class: o.wLE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return BotGuideSpotGridFragment$subscribeOnUIChange$11.AnonymousClass1.AnonymousClass5.AYXKKw(c52435wLh2, activity);
                        }
                    });
                } else {
                    if (!(activity instanceof BotGuideSpotGridPresenter.Activity.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C52659wTp c52659wTp2 = C52659wTp.copydefault;
                    Context contextRequireContext2 = this.EZpvd.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    BotGuideSpotGridPresenter.Activity.ActionBar actionBar = (BotGuideSpotGridPresenter.Activity.ActionBar) activity;
                    LossInsuranceBean voucherInformation3 = actionBar.AEQbTJ().getVoucherInformation();
                    String voucherValue2 = voucherInformation3 != null ? voucherInformation3.getVoucherValue() : null;
                    if (voucherValue2 == null) {
                        voucherValue2 = "";
                    }
                    LossInsuranceBean voucherInformation4 = actionBar.AEQbTJ().getVoucherInformation();
                    voucherCcy = voucherInformation4 != null ? voucherInformation4.getVoucherCcy() : null;
                    String str2 = voucherCcy == null ? "" : voucherCcy;
                    final C52435wLh c52435wLh3 = this.EZpvd;
                    Function0 function02 = new Function0() { // from class: o.wLC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return BotGuideSpotGridFragment$subscribeOnUIChange$11.AnonymousClass1.AnonymousClass5.AhwBna(c52435wLh3, activity);
                        }
                    };
                    final C52435wLh c52435wLh4 = this.EZpvd;
                    c52659wTp2.AEQbTJ(contextRequireContext2, voucherValue2, str2, (56 & 8) != 0 ? false : false, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null, function02, new Function0() { // from class: o.wLA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return BotGuideSpotGridFragment$subscribeOnUIChange$11.AnonymousClass1.AnonymousClass5.valueOf(c52435wLh4, activity);
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            public static final Unit copydefault(C52435wLh c52435wLh, BotGuideSpotGridPresenter.Activity activity) {
                C52435wLh.KWHzl(c52435wLh).EZpvd(((BotGuideSpotGridPresenter.Activity.TaskDescription) activity).KWHzl());
                return Unit.INSTANCE;
            }

            public static final Unit AYXKKw(C52435wLh c52435wLh, BotGuideSpotGridPresenter.Activity activity) {
                C52435wLh.KWHzl(c52435wLh).AEQbTJ(((BotGuideSpotGridPresenter.Activity.TaskDescription) activity).KWHzl());
                return Unit.INSTANCE;
            }

            public static final Unit AhwBna(C52435wLh c52435wLh, BotGuideSpotGridPresenter.Activity activity) {
                C52435wLh.KWHzl(c52435wLh).EZpvd(((BotGuideSpotGridPresenter.Activity.ActionBar) activity).AEQbTJ());
                return Unit.INSTANCE;
            }

            public static final Unit valueOf(C52435wLh c52435wLh, BotGuideSpotGridPresenter.Activity activity) {
                C52435wLh.KWHzl(c52435wLh).AEQbTJ(((BotGuideSpotGridPresenter.Activity.ActionBar) activity).AEQbTJ());
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<BotGuideSpotGridPresenter.Activity> sharedFlowZsXlph = C52435wLh.KWHzl(this.this$0).zsXlph();
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0);
                this.label = 1;
                if (sharedFlowZsXlph.collect(anonymousClass5, this) == objCopydefault) {
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
            C52435wLh c52435wLh = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c52435wLh, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c52435wLh, state, anonymousClass1, this) == objCopydefault) {
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
