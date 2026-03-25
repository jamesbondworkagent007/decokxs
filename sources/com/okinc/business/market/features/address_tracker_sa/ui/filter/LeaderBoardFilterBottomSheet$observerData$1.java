package com.okinc.business.market.features.address_tracker_sa.ui.filter;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC25705jDh;
import o.C23274hvD;
import o.C25688jCr;
import o.C33070mpX;
import o.C52761wXj;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardFilterBottomSheet$observerData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C25688jCr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardFilterBottomSheet$observerData$1(C25688jCr c25688jCr, Continuation<? super LeaderBoardFilterBottomSheet$observerData$1> continuation) {
        super(2, continuation);
        this.this$0 = c25688jCr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardFilterBottomSheet$observerData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardFilterBottomSheet$observerData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker_sa.ui.filter.LeaderBoardFilterBottomSheet$observerData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C25688jCr this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C25688jCr c25688jCr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c25688jCr;
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker_sa.ui.filter.LeaderBoardFilterBottomSheet$observerData$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03421 extends SuspendLambda implements Function2<AbstractC25705jDh, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C25688jCr this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03421(C25688jCr c25688jCr, Continuation<? super C03421> continuation) {
                super(2, continuation);
                this.this$0 = c25688jCr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03421 c03421 = new C03421(this.this$0, continuation);
                c03421.L$0 = obj;
                return c03421;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AbstractC25705jDh abstractC25705jDh, Continuation<? super Unit> continuation) {
                return ((C03421) create(abstractC25705jDh, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AbstractC25705jDh abstractC25705jDh = (AbstractC25705jDh) this.L$0;
                    if (!Intrinsics.EZpvd(abstractC25705jDh, AbstractC25705jDh.Activity.copydefault) && !(abstractC25705jDh instanceof AbstractC25705jDh.ActionBar)) {
                        if (abstractC25705jDh instanceof AbstractC25705jDh.StateListAnimator) {
                            this.this$0.AkhnZx();
                            this.this$0.AkhnZx = "";
                            this.this$0.OLrzqt(false);
                        } else if (abstractC25705jDh instanceof AbstractC25705jDh.Fragment) {
                            this.this$0.AkhnZx();
                            this.this$0.OLrzqt(true);
                            this.this$0.AEQbTJ((List<LeaderBoardFilterModel>) ((AbstractC25705jDh.Fragment) abstractC25705jDh).KWHzl());
                        } else if (abstractC25705jDh instanceof AbstractC25705jDh.Application) {
                            this.this$0.AkhnZx();
                            this.this$0.EZpvd(((AbstractC25705jDh.Application) abstractC25705jDh).copydefault());
                        } else {
                            if (!Intrinsics.EZpvd(abstractC25705jDh, AbstractC25705jDh.TaskDescription.EZpvd)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.aUsmxb), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (Integer) null, 0, 0, 30, (Object) null);
                            this.this$0.AhwBna().copydefault();
                        }
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
                Flow<AbstractC25705jDh> flowEZpvd = this.this$0.AhwBna().EZpvd();
                C03421 c03421 = new C03421(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowEZpvd, c03421, this) == objCopydefault) {
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
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objCopydefault) {
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
