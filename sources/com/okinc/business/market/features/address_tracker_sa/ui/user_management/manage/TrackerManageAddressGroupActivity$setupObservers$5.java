package com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage;

import android.app.Activity;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC25781jGc;
import o.C56391yDq;
import o.C56442yFn;
import o.jFL;
import o.jFP;
import o.kMM;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class TrackerManageAddressGroupActivity$setupObservers$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jFP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerManageAddressGroupActivity$setupObservers$5(jFP jfp, Continuation<? super TrackerManageAddressGroupActivity$setupObservers$5> continuation) {
        super(2, continuation);
        this.this$0 = jfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerManageAddressGroupActivity$setupObservers$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerManageAddressGroupActivity$setupObservers$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupObservers$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC25781jGc, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
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
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractC25781jGc abstractC25781jGc, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC25781jGc, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC25781jGc abstractC25781jGc = (AbstractC25781jGc) this.L$0;
                if (!(abstractC25781jGc instanceof AbstractC25781jGc.ActionBar)) {
                    if (abstractC25781jGc instanceof AbstractC25781jGc.Activity) {
                        List<jFL> value = this.this$0.AhwBna().djBIcL().getValue();
                        if (value.isEmpty()) {
                            this.this$0.AkhnZx();
                        } else {
                            this.this$0.isConnected();
                            kMM.setData$default(this.this$0.fetchVPNInfo(), value, null, 2, null);
                        }
                        rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    } else {
                        if (!(abstractC25781jGc instanceof AbstractC25781jGc.TaskDescription)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
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
            StateFlow<AbstractC25781jGc> stateFlowFetchVPNInfo = this.this$0.AhwBna().fetchVPNInfo();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowFetchVPNInfo, anonymousClass1, this) == objCopydefault) {
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
