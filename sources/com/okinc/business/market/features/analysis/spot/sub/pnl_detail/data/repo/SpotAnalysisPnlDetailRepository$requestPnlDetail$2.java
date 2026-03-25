package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.data.repo;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.data.model.PnlDetailPo;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25954jMn;
import o.C25959jMs;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class SpotAnalysisPnlDetailRepository$requestPnlDetail$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends PnlDetailPo>>>, Object> {
    final /* synthetic */ String $costPriceType;
    final /* synthetic */ Boolean $hideLowValueCcy;
    final /* synthetic */ Integer $type;
    final /* synthetic */ String $uid;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ C25959jMs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailRepository$requestPnlDetail$2(C25959jMs c25959jMs, Integer num, String str, String str2, Boolean bool, String str3, Continuation<? super SpotAnalysisPnlDetailRepository$requestPnlDetail$2> continuation) {
        super(2, continuation);
        this.this$0 = c25959jMs;
        this.$type = num;
        this.$valuationUnit = str;
        this.$costPriceType = str2;
        this.$hideLowValueCcy = bool;
        this.$uid = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisPnlDetailRepository$requestPnlDetail$2(this.this$0, this.$type, this.$valuationUnit, this.$costPriceType, this.$hideLowValueCcy, this.$uid, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends PnlDetailPo>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<PnlDetailPo>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<PnlDetailPo>>> continuation) {
        return ((SpotAnalysisPnlDetailRepository$requestPnlDetail$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25954jMn c25954jMn = this.this$0.AEQbTJ;
            Integer num = this.$type;
            String str = this.$valuationUnit;
            String str2 = this.$costPriceType;
            Boolean bool = this.$hideLowValueCcy;
            String str3 = this.$uid;
            this.label = 1;
            obj = c25954jMn.copydefault(num, str, str2, bool, null, str3, this);
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
