package com.okinc.okex.search.ui;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.okex.search.viewmodel.SupportSearchViewModel;
import com.okinc.uilab.edit.OKEditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC44038sBa;
import o.C45853szS;
import o.C45857szW;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.sAK;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportSearchActivity$initViewModel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SupportSearchViewModel $this_apply;
    int label;
    final /* synthetic */ ActivityC44038sBa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportSearchActivity$initViewModel$1$1(ActivityC44038sBa activityC44038sBa, SupportSearchViewModel supportSearchViewModel, Continuation<? super SupportSearchActivity$initViewModel$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC44038sBa;
        this.$this_apply = supportSearchViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportSearchActivity$initViewModel$1$1(this.this$0, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportSearchActivity$initViewModel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.search.ui.SupportSearchActivity$initViewModel$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SupportSearchViewModel $this_apply;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC44038sBa this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SupportSearchViewModel supportSearchViewModel, ActivityC44038sBa activityC44038sBa, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_apply = supportSearchViewModel;
            this.this$0 = activityC44038sBa;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_apply, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.okex.search.ui.SupportSearchActivity$initViewModel$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SupportSearchViewModel $this_apply;
            int label;
            final /* synthetic */ ActivityC44038sBa this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05641(SupportSearchViewModel supportSearchViewModel, ActivityC44038sBa activityC44038sBa, Continuation<? super C05641> continuation) {
                super(2, continuation);
                this.$this_apply = supportSearchViewModel;
                this.this$0 = activityC44038sBa;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05641(this.$this_apply, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.okex.search.ui.SupportSearchActivity$initViewModel$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C05651 extends SuspendLambda implements Function2<SupportSearchViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ActivityC44038sBa this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05651(ActivityC44038sBa activityC44038sBa, Continuation<? super C05651> continuation) {
                    super(2, continuation);
                    this.this$0 = activityC44038sBa;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05651 c05651 = new C05651(this.this$0, continuation);
                    c05651.L$0 = obj;
                    return c05651;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SupportSearchViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                    return ((C05651) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        SupportSearchViewModel.StateListAnimator stateListAnimator = (SupportSearchViewModel.StateListAnimator) this.L$0;
                        if (stateListAnimator instanceof SupportSearchViewModel.StateListAnimator.Activity) {
                            OKEditText oKEditTextKWHzl = this.this$0.AEQbTJ().OLrzqt.KWHzl();
                            oKEditTextKWHzl.setText(((SupportSearchViewModel.StateListAnimator.Activity) stateListAnimator).copydefault());
                            oKEditTextKWHzl.clearFocus();
                        } else if (stateListAnimator instanceof SupportSearchViewModel.StateListAnimator.C0569StateListAnimator) {
                            this.this$0.copydefault(C45853szS.Companion.EZpvd());
                            rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                        } else if (stateListAnimator instanceof SupportSearchViewModel.StateListAnimator.Application) {
                            this.this$0.copydefault(sAK.Companion.EZpvd());
                        } else if (stateListAnimator instanceof SupportSearchViewModel.StateListAnimator.ActionBar) {
                            this.this$0.valueOf();
                            this.this$0.copydefault(C45857szW.Companion.OLrzqt());
                        } else {
                            throw new NoWhenBranchMatchedException();
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
                    StateFlow<SupportSearchViewModel.StateListAnimator> stateFlowValueOf = this.$this_apply.valueOf();
                    C05651 c05651 = new C05651(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowValueOf, c05651, this) == objCopydefault) {
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
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C05641(this.$this_apply, this.this$0, null), 3, null);
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
            ActivityC44038sBa activityC44038sBa = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_apply, activityC44038sBa, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC44038sBa, state, anonymousClass1, this) == objCopydefault) {
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
