package com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC25769jFr;
import o.C23274hvD;
import o.C33070mpX;
import o.C52761wXj;
import o.C55328xhq;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.jFP;
import o.pTD;

/* JADX INFO: loaded from: classes18.dex */
public final class TrackerManageAddressGroupActivity$setupObservers$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jFP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerManageAddressGroupActivity$setupObservers$7(jFP jfp, Continuation<? super TrackerManageAddressGroupActivity$setupObservers$7> continuation) {
        super(2, continuation);
        this.this$0 = jfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerManageAddressGroupActivity$setupObservers$7(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerManageAddressGroupActivity$setupObservers$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupObservers$7$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ jFP this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jFP jfp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = jfp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                int i = this.I$0;
                if (i >= 0) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, pTD.EZpvd(this.this$0, C23274hvD.FragmentManager.AuCTel, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C56443yFo.AEQbTJ(i)))), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (Integer) null, 0, 0, 60, (Object) null);
                } else {
                    C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq), C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
                }
                AbstractC25769jFr.loadAddresses$default(this.this$0.AhwBna(), false, 1, null);
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
            SharedFlow<Integer> sharedFlowAkhnZx = this.this$0.AhwBna().AkhnZx();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowAkhnZx, anonymousClass1, this) == objCopydefault) {
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
