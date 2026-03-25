package com.okinc.tradingbot.impl.strategy.fragment.auto_earn;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnProfitPresenter;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C33064mpR;
import o.C33070mpX;
import o.C43316rmw;
import o.C48033uCm;
import o.C49952uyJ;
import o.C49968uyZ;
import o.C54136wyf;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.vNB;

/* JADX INFO: loaded from: classes11.dex */
public final class AutoEarnProfitListFragment$onViewCreated$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C54136wyf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoEarnProfitListFragment$onViewCreated$3(C54136wyf c54136wyf, Continuation<? super AutoEarnProfitListFragment$onViewCreated$3> continuation) {
        super(2, continuation);
        this.this$0 = c54136wyf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoEarnProfitListFragment$onViewCreated$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoEarnProfitListFragment$onViewCreated$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnProfitListFragment$onViewCreated$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C54136wyf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C54136wyf c54136wyf, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c54136wyf;
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

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnProfitListFragment$onViewCreated$3$1$Activity */
        public static final class Activity implements Flow<vNB<? extends AutoEarnProfitPresenter.StateListAnimator>> {
            public final /* synthetic */ C54136wyf EZpvd;
            public final /* synthetic */ Flow KWHzl;
            public final /* synthetic */ String OLrzqt;

            /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnProfitListFragment$onViewCreated$3$1$Activity$4, reason: invalid class name */
            public static final class AnonymousClass4<T> implements FlowCollector {
                public final /* synthetic */ C54136wyf AEQbTJ;
                public final /* synthetic */ String KWHzl;
                public final /* synthetic */ FlowCollector copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass4(FlowCollector flowCollector, C54136wyf c54136wyf, String str) {
                    this.copydefault = flowCollector;
                    this.AEQbTJ = c54136wyf;
                    this.KWHzl = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    AutoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1 autoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1;
                    if (continuation instanceof AutoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1) {
                        autoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1 = (AutoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i = autoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            autoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            autoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1 = new AutoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = autoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = autoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.copydefault;
                        if (Intrinsics.EZpvd((Object) this.AEQbTJ.copydefault().KWHzl(), (Object) this.KWHzl)) {
                            autoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                            if (flowCollector.emit(obj, autoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
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

            public Activity(Flow flow, C54136wyf c54136wyf, String str) {
                this.KWHzl = flow;
                this.EZpvd = c54136wyf;
                this.OLrzqt = str;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super vNB<? extends AutoEarnProfitPresenter.StateListAnimator>> flowCollector, Continuation continuation) {
                Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector, this.EZpvd, this.OLrzqt), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Activity activity = new Activity(this.this$0.copydefault().AYXKKw(), this.this$0, this.this$0.requireArguments().getString("arg_ccy"));
                final C54136wyf c54136wyf = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnProfitListFragment.onViewCreated.3.1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(vNB<AutoEarnProfitPresenter.StateListAnimator> vnb, Continuation<? super Unit> continuation) {
                        if (!c54136wyf.isAdded() || c54136wyf.isDetached()) {
                            return Unit.INSTANCE;
                        }
                        if (!(vnb instanceof vNB.Activity)) {
                            if (vnb instanceof vNB.TaskDescription) {
                                c54136wyf.OLrzqt().KWHzl.valueOf();
                                vNB.TaskDescription taskDescription = (vNB.TaskDescription) vnb;
                                if (((AutoEarnProfitPresenter.StateListAnimator) taskDescription.AEQbTJ()).KWHzl().isEmpty()) {
                                    C43316rmw c43316rmwKWHzl = c54136wyf.KWHzl();
                                    ArrayList arrayList = new ArrayList();
                                    String string = c54136wyf.getString(C55688xof.Application.ActivityResultRegistryOwner);
                                    Intrinsics.checkNotNullExpressionValue(string, "");
                                    C49952uyJ.updateDataOrEmpty$default(c43316rmwKWHzl, arrayList, string, 56, null, null, false, 56, null);
                                } else {
                                    C33064mpR.OLrzqt(c54136wyf.KWHzl(), (List<? extends Object>) ((AutoEarnProfitPresenter.StateListAnimator) taskDescription.AEQbTJ()).KWHzl());
                                }
                                c54136wyf.OLrzqt().KWHzl.OLrzqt(((AutoEarnProfitPresenter.StateListAnimator) taskDescription.AEQbTJ()).OLrzqt());
                                c54136wyf.OLrzqt().KWHzl.AhwBna(((AutoEarnProfitPresenter.StateListAnimator) taskDescription.AEQbTJ()).OLrzqt());
                                rVN.reportFullyDrawn$default((Fragment) c54136wyf, true, (String) null, 2, (Object) null);
                            } else {
                                if (!(vnb instanceof vNB.StateListAnimator)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                try {
                                    c54136wyf.KWHzl().AhwBna(CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, C49968uyZ.OLrzqt(((vNB.StateListAnimator) vnb).AEQbTJ(), C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT)), 0, false, null, null, false, 62, null));
                                } catch (Exception unused) {
                                }
                                rVN.reportFullyDrawn$default((Fragment) c54136wyf, false, (String) null, 2, (Object) null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (activity.collect(flowCollector, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.RESUMED;
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
