package com.okinc.buysell.ui.recurring.legacy;

import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyFrequencyBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AbstractC43419rot;
import o.C31655lzc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class RecurringBuyPlanDetailLegacyViewModel$loadData$1$apiResults$1 extends SuspendLambda implements Function1<Continuation<? super AbstractC43419rot<? extends List<? extends RecurringBuyFrequencyBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $planId;
    int label;
    final /* synthetic */ RecurringBuyPlanDetailLegacyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanDetailLegacyViewModel$loadData$1$apiResults$1(RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModel, String str, Continuation<? super RecurringBuyPlanDetailLegacyViewModel$loadData$1$apiResults$1> continuation) {
        super(1, continuation);
        this.this$0 = recurringBuyPlanDetailLegacyViewModel;
        this.$planId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RecurringBuyPlanDetailLegacyViewModel$loadData$1$apiResults$1(this.this$0, this.$planId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super AbstractC43419rot<? extends List<? extends RecurringBuyFrequencyBean>, ? extends OKServerException>> continuation) {
        return invoke2((Continuation<? super AbstractC43419rot<? extends List<RecurringBuyFrequencyBean>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super AbstractC43419rot<? extends List<RecurringBuyFrequencyBean>, OKServerException>> continuation) {
        return ((RecurringBuyPlanDetailLegacyViewModel$loadData$1$apiResults$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C31655lzc c31655lzc = this.this$0.fIwbmz;
            String str = this.$planId;
            this.label = 1;
            obj = c31655lzc.copydefault(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
