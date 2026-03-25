package com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel;

import com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class FundingFeeViewModel$setAccountUid$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountUid;
    int label;
    final /* synthetic */ FundingFeeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundingFeeViewModel$setAccountUid$1(FundingFeeViewModel fundingFeeViewModel, String str, Continuation<? super FundingFeeViewModel$setAccountUid$1> continuation) {
        super(2, continuation);
        this.this$0 = fundingFeeViewModel;
        this.$accountUid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FundingFeeViewModel$setAccountUid$1(this.this$0, this.$accountUid, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FundingFeeViewModel$setAccountUid$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FundingFeeViewModel fundingFeeViewModel = this.this$0;
            this.label = 1;
            obj = fundingFeeViewModel.OLrzqt(fundingFeeViewModel, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                FundingFeeViewModel.loadData$default(this.this$0, null, null, 3, null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!Intrinsics.EZpvd((Object) ((FundingFeeViewModel.Activity) obj).AEQbTJ(), (Object) this.$accountUid)) {
            FundingFeeViewModel fundingFeeViewModel2 = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel$setAccountUid$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((FundingFeeViewModel.Activity) obj2).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((FundingFeeViewModel.Activity) obj2).AEQbTJ((String) obj3);
                }
            };
            String str = this.$accountUid;
            this.label = 2;
            if (fundingFeeViewModel2.KWHzl(anonymousClass1, str, this) == objCopydefault) {
                return objCopydefault;
            }
            FundingFeeViewModel.loadData$default(this.this$0, null, null, 3, null);
        }
        return Unit.INSTANCE;
    }
}
