package com.okinc.business.market.features.analysis.futures.sub.calendar.ui.share;

import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25876jJq;
import o.C41431qqg;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.qYH;
import o.qYM;

/* JADX INFO: loaded from: classes18.dex */
public final class FuturesAnalysisVipSharingCalendarFragment$setListener$1$1$dayItemExtras$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends qYM>>, Object> {
    final /* synthetic */ C25876jJq $vo;
    int label;
    final /* synthetic */ FuturesAnalysisVipSharingCalendarFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisVipSharingCalendarFragment$setListener$1$1$dayItemExtras$1(C25876jJq c25876jJq, FuturesAnalysisVipSharingCalendarFragment futuresAnalysisVipSharingCalendarFragment, Continuation<? super FuturesAnalysisVipSharingCalendarFragment$setListener$1$1$dayItemExtras$1> continuation) {
        super(2, continuation);
        this.$vo = c25876jJq;
        this.this$0 = futuresAnalysisVipSharingCalendarFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisVipSharingCalendarFragment$setListener$1$1$dayItemExtras$1(this.$vo, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends qYM>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<qYM>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<qYM>> continuation) {
        return ((FuturesAnalysisVipSharingCalendarFragment$setListener$1$1$dayItemExtras$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<C25876jJq.Application> listKWHzl = this.$vo.KWHzl();
            FuturesAnalysisVipSharingCalendarFragment futuresAnalysisVipSharingCalendarFragment = this.this$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            for (C25876jJq.Application application : listKWHzl) {
                Date dateAEQbTJ = application.AEQbTJ();
                String strKWHzl = application.KWHzl();
                qYH qyh = FuturesAnalysisVipSharingCalendarFragment.access$getContentBinding(futuresAnalysisVipSharingCalendarFragment).KWHzl;
                Intrinsics.checkNotNullExpressionValue(qyh, "");
                int modernColor$default = C41431qqg.getModernColor$default(qyh, application.EZpvd(), false, 2, null);
                qYH qyh2 = FuturesAnalysisVipSharingCalendarFragment.access$getContentBinding(futuresAnalysisVipSharingCalendarFragment).KWHzl;
                Intrinsics.checkNotNullExpressionValue(qyh2, "");
                int iCopydefault = C41431qqg.copydefault((View) qyh2, application.EZpvd(), true);
                qYH qyh3 = FuturesAnalysisVipSharingCalendarFragment.access$getContentBinding(futuresAnalysisVipSharingCalendarFragment).KWHzl;
                Intrinsics.checkNotNullExpressionValue(qyh3, "");
                arrayList.add(new qYM(application, dateAEQbTJ, strKWHzl, modernColor$default, iCopydefault, C41431qqg.getModernColor$default(qyh3, application.EZpvd(), false, 2, null)));
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
