package com.okinc.im.imui.messageV2.view.banner.paidgroup;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.web3pay.api.model.Web3PayProjectId;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C34165nTv;
import o.C36774ohM;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31257lqc;

/* JADX INFO: loaded from: classes18.dex */
public final class PaidGroupStatusBannerFragment$initView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C36774ohM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidGroupStatusBannerFragment$initView$3(C36774ohM c36774ohM, Continuation<? super PaidGroupStatusBannerFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c36774ohM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaidGroupStatusBannerFragment$initView$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaidGroupStatusBannerFragment$initView$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.banner.paidgroup.PaidGroupStatusBannerFragment$initView$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C36774ohM this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C36774ohM c36774ohM, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c36774ohM;
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
                SharedFlow<C34165nTv.Activity> sharedFlowCopydefault = this.this$0.EZpvd().copydefault();
                final C36774ohM c36774ohM = this.this$0;
                FlowCollector<? super C34165nTv.Activity> flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.messageV2.view.banner.paidgroup.PaidGroupStatusBannerFragment.initView.3.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C34165nTv.Activity activity, Continuation<? super Unit> continuation) {
                        if (Intrinsics.EZpvd(activity, C34165nTv.Activity.Application.AEQbTJ)) {
                            Context context = c36774ohM.getContext();
                            if (context != null) {
                                ((InterfaceC31257lqc) C43251rlk.copydefault(InterfaceC31257lqc.class)).EZpvd(context, false, true, true, "");
                            }
                        } else if (activity instanceof C34165nTv.Activity.TaskDescription) {
                            InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.copydefault(InterfaceC31257lqc.class);
                            FragmentManager parentFragmentManager = c36774ohM.getParentFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                            interfaceC31257lqc.OLrzqt(parentFragmentManager, Web3PayProjectId.IM_PAY, ((C34165nTv.Activity.TaskDescription) activity).AEQbTJ().getTradeOrderId());
                        } else {
                            if (!(activity instanceof C34165nTv.Activity.C0892Activity)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String message = ((C34165nTv.Activity.C0892Activity) activity).KWHzl().getMessage();
                            if (message != null) {
                                C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
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
            C36774ohM c36774ohM = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c36774ohM, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c36774ohM, state, anonymousClass1, this) == objCopydefault) {
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
