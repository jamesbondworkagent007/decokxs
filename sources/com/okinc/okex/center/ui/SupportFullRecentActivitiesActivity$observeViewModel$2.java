package com.okinc.okex.center.ui;

import android.app.Activity;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC45154skT;
import o.ActivityC44878sfI;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportFullRecentActivitiesActivity$observeViewModel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC44878sfI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportFullRecentActivitiesActivity$observeViewModel$2(ActivityC44878sfI activityC44878sfI, Continuation<? super SupportFullRecentActivitiesActivity$observeViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC44878sfI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportFullRecentActivitiesActivity$observeViewModel$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportFullRecentActivitiesActivity$observeViewModel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.SupportFullRecentActivitiesActivity$observeViewModel$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC45154skT, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC44878sfI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC44878sfI activityC44878sfI, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC44878sfI;
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
        public final Object invoke(AbstractC45154skT abstractC45154skT, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC45154skT, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC45154skT abstractC45154skT = (AbstractC45154skT) this.L$0;
                if (abstractC45154skT instanceof AbstractC45154skT.Activity) {
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.ERROR);
                    rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                } else if (abstractC45154skT instanceof AbstractC45154skT.ActionBar) {
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.LOADING);
                } else if (abstractC45154skT instanceof AbstractC45154skT.StateListAnimator) {
                    ActivityC44878sfI activityC44878sfI = this.this$0;
                    Map<TransactionType, SelfServiceTools> mapCopydefault = ((AbstractC45154skT.StateListAnimator) abstractC45154skT).copydefault();
                    ArrayList arrayList = new ArrayList(mapCopydefault.size());
                    Iterator<Map.Entry<TransactionType, SelfServiceTools>> it = mapCopydefault.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getKey());
                    }
                    activityC44878sfI.AEQbTJ((List<? extends TransactionType>) arrayList);
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.CONTENT);
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                } else if (abstractC45154skT instanceof AbstractC45154skT.TaskDescription) {
                    this.this$0.EZpvd(OKSupportBaseActivity.PageState.CONTENT);
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
            StateFlow<AbstractC45154skT> stateFlowAEQbTJ = this.this$0.KWHzl().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
