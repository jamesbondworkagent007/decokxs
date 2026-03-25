package com.okinc.im.imui.messageinfo;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.im.imui.messageinfo.MessageInfoViewModel;
import com.okinc.im.message.MessageClusterType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C35254nrp;
import o.C37005olf;
import o.C37116onk;
import o.C55298xhM;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class MessagePreviewFragment$initView$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C37116onk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagePreviewFragment$initView$5(C37116onk c37116onk, Continuation<? super MessagePreviewFragment$initView$5> continuation) {
        super(2, continuation);
        this.this$0 = c37116onk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessagePreviewFragment$initView$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessagePreviewFragment$initView$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageinfo.MessagePreviewFragment$initView$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C37116onk this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C37116onk c37116onk, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c37116onk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messageinfo.MessagePreviewFragment$initView$5$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C37116onk this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04621(C37116onk c37116onk, Continuation<? super C04621> continuation) {
                super(2, continuation);
                this.this$0 = c37116onk;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04621 c04621 = new C04621(this.this$0, continuation);
                c04621.L$0 = obj;
                return c04621;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.im.imui.messageinfo.MessagePreviewFragment$initView$5$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C04631 extends SuspendLambda implements Function2<MessageInfoViewModel.Application, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$launch;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ C37116onk this$0;

                /* JADX INFO: renamed from: com.okinc.im.imui.messageinfo.MessagePreviewFragment$initView$5$1$1$1$Application */
                public final /* synthetic */ class Application {
                    public static final /* synthetic */ int[] AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    static {
                        int[] iArr = new int[MessageClusterType.values().length];
                        try {
                            iArr[MessageClusterType.Middle.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        AEQbTJ = iArr;
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04631(CoroutineScope coroutineScope, C37116onk c37116onk, Continuation<? super C04631> continuation) {
                    super(2, continuation);
                    this.$$this$launch = coroutineScope;
                    this.this$0 = c37116onk;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C04631 c04631 = new C04631(this.$$this$launch, this.this$0, continuation);
                    c04631.L$0 = obj;
                    return c04631;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MessageInfoViewModel.Application application, Continuation<? super Unit> continuation) {
                    return ((C04631) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        C35254nrp c35254nrpAEQbTJ = ((MessageInfoViewModel.Application) this.L$0).AEQbTJ();
                        if (c35254nrpAEQbTJ == null) {
                            C37116onk c37116onk = this.this$0;
                            C37005olf c37005olf = c37116onk.gEmmrt;
                            if (c37005olf == null) {
                                Intrinsics.gEmmrt("");
                                c37005olf = null;
                            }
                            c37005olf.submitList(yDY.AhwBna());
                            rVN.reportFullyDrawn$default((Fragment) c37116onk, true, (String) null, 2, (Object) null);
                            return Unit.INSTANCE;
                        }
                        MessageClusterType messageClusterTypeCopydefault = c35254nrpAEQbTJ.copydefault();
                        int iDp2px$default = (messageClusterTypeCopydefault != null && Application.AEQbTJ[messageClusterTypeCopydefault.ordinal()] == 1) ? C55298xhM.dp2px$default(16.0f, null, 1, null) : 0;
                        Integer num = this.this$0.djBIcL;
                        this.this$0.gEmmrt().EZpvd.setPadding(this.this$0.gEmmrt().EZpvd.getPaddingLeft(), (num != null ? num.intValue() : this.this$0.gEmmrt().EZpvd.getPaddingTop()) + iDp2px$default, this.this$0.gEmmrt().EZpvd.getPaddingRight(), this.this$0.gEmmrt().EZpvd.getPaddingBottom());
                        C37005olf c37005olf2 = this.this$0.gEmmrt;
                        if (c37005olf2 == null) {
                            Intrinsics.gEmmrt("");
                            c37005olf2 = null;
                        }
                        c37005olf2.submitList(C56402yEa.EZpvd(c35254nrpAEQbTJ));
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
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
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    StateFlow<MessageInfoViewModel.Application> stateFlowAEQbTJ = this.this$0.AYXKKw().AEQbTJ();
                    C04631 c04631 = new C04631(coroutineScope, this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowAEQbTJ, c04631, this) == objCopydefault) {
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
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C04621(this.this$0, null), 3, null);
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
