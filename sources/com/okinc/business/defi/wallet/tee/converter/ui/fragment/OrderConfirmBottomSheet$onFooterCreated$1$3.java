package com.okinc.business.defi.wallet.tee.converter.ui.fragment;

import androidx.fragment.app.FragmentActivity;
import com.okinc.network.okg.response.OKServerException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC43419rot;
import o.ActivityC17855fUu;
import o.C13754dXa;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.fTZ;
import o.fUF;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class OrderConfirmBottomSheet$onFooterCreated$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C52794wYp $this_apply;
    int label;
    final /* synthetic */ fUF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmBottomSheet$onFooterCreated$1$3(fUF fuf, C52794wYp c52794wYp, Continuation<? super OrderConfirmBottomSheet$onFooterCreated$1$3> continuation) {
        super(2, continuation);
        this.this$0 = fuf;
        this.$this_apply = c52794wYp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderConfirmBottomSheet$onFooterCreated$1$3(this.this$0, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderConfirmBottomSheet$onFooterCreated$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$onFooterCreated$1$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC43419rot<? extends Unit, ? extends OKServerException>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C52794wYp $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fUF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fUF fuf, C52794wYp c52794wYp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fuf;
            this.$this_apply = c52794wYp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AbstractC43419rot<? extends Unit, ? extends OKServerException> abstractC43419rot, Continuation<? super Unit> continuation) {
            return invoke2((AbstractC43419rot<Unit, OKServerException>) abstractC43419rot, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AbstractC43419rot<Unit, OKServerException> abstractC43419rot, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC43419rot, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC43419rot abstractC43419rot = (AbstractC43419rot) this.L$0;
                fUF fuf = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    fuf.AEQbTJ = true;
                    ActivityC17855fUu.Application application = ActivityC17855fUu.Companion;
                    FragmentActivity activity = fuf.getActivity();
                    if (activity == null) {
                        return Unit.INSTANCE;
                    }
                    List<fTZ.Application> listKWHzl = fuf.gEmmrt().isConnected().getValue().KWHzl();
                    if ((listKWHzl instanceof Collection) && listKWHzl.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator<T> it = listKWHzl.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((fTZ.Application) it.next()).copydefault() && (i = i + 1) < 0) {
                                yDY.djBIcL();
                            }
                        }
                    }
                    application.KWHzl(activity, i, fuf.gEmmrt().gEmmrt());
                }
                C52794wYp c52794wYp = this.$this_apply;
                fUF fuf2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    c52794wYp.fIwbmz();
                    fuf2.gEmmrt().iwGUEr();
                    C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.Dfm, 0, 1, (Object) null);
                    pUU.AEQbTJ("OrderConfirmBottomSheet", oKServerException);
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
            SharedFlow<AbstractC43419rot<Unit, OKServerException>> sharedFlowFJNWhG = this.this$0.gEmmrt().fJNWhG();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowFJNWhG, anonymousClass1, this) == objCopydefault) {
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
