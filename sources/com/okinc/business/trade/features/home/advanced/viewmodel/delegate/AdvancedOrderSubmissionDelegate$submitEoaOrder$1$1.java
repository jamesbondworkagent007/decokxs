package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28231kTt;
import o.C56391yDq;
import o.C56442yFn;
import o.gYQ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedOrderSubmissionDelegate$submitEoaOrder$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ C28231kTt.ActionBar $callback;
    final /* synthetic */ boolean $forceManualSign;
    final /* synthetic */ String $permit2SignedData;
    final /* synthetic */ V6BaseQuoteResponse $response;
    final /* synthetic */ DefiPlatformInfo $selectedDefiPlatform;
    final /* synthetic */ C28231kTt.Activity $snapshot;
    int label;
    final /* synthetic */ C28231kTt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedOrderSubmissionDelegate$submitEoaOrder$1$1(DefiPlatformInfo defiPlatformInfo, C28231kTt c28231kTt, FragmentActivity fragmentActivity, V6BaseQuoteResponse v6BaseQuoteResponse, C28231kTt.Activity activity, C28231kTt.ActionBar actionBar, String str, boolean z, Continuation<? super AdvancedOrderSubmissionDelegate$submitEoaOrder$1$1> continuation) {
        super(2, continuation);
        this.$selectedDefiPlatform = defiPlatformInfo;
        this.this$0 = c28231kTt;
        this.$activity = fragmentActivity;
        this.$response = v6BaseQuoteResponse;
        this.$snapshot = activity;
        this.$callback = actionBar;
        this.$permit2SignedData = str;
        this.$forceManualSign = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedOrderSubmissionDelegate$submitEoaOrder$1$1(this.$selectedDefiPlatform, this.this$0, this.$activity, this.$response, this.$snapshot, this.$callback, this.$permit2SignedData, this.$forceManualSign, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedOrderSubmissionDelegate$submitEoaOrder$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DefiPlatformInfo defiPlatformInfo = this.$selectedDefiPlatform;
            if (defiPlatformInfo == null || !gYQ.copydefault(defiPlatformInfo)) {
                C28231kTt c28231kTt = this.this$0;
                FragmentActivity fragmentActivity = this.$activity;
                V6BaseQuoteResponse v6BaseQuoteResponse = this.$response;
                C28231kTt.Activity activity = this.$snapshot;
                C28231kTt.ActionBar actionBar = this.$callback;
                String str = this.$permit2SignedData;
                boolean z = this.$forceManualSign;
                this.label = 2;
                if (c28231kTt.KWHzl(fragmentActivity, v6BaseQuoteResponse, activity, actionBar, str, z, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C28231kTt c28231kTt2 = this.this$0;
                FragmentActivity fragmentActivity2 = this.$activity;
                V6BaseQuoteResponse v6BaseQuoteResponse2 = this.$response;
                C28231kTt.Activity activity2 = this.$snapshot;
                C28231kTt.ActionBar actionBar2 = this.$callback;
                this.label = 1;
                if (c28231kTt2.AEQbTJ(fragmentActivity2, v6BaseQuoteResponse2, activity2, actionBar2, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
