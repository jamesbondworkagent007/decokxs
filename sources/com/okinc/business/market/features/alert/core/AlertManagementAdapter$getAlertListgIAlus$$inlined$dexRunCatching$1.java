package com.okinc.business.market.features.alert.core;

import com.okinc.business.market.data.model.alert.AlertListRequest;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C2185ACa;
import o.C25802jGx;
import o.C27604jyN;
import o.C33077mpe;
import o.C4183Azz;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.alert.core.AlertManagementAdapter$getAlertList-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes18.dex */
public final class AlertManagementAdapter$getAlertListgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends AlertUiItem>>>, Object> {
    final /* synthetic */ AlertListRequest $alertListRequest$inlined;
    int label;
    final /* synthetic */ C25802jGx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertManagementAdapter$getAlertListgIAlus$$inlined$dexRunCatching$1(Continuation continuation, C25802jGx c25802jGx, AlertListRequest alertListRequest) {
        super(2, continuation);
        this.this$0 = c25802jGx;
        this.$alertListRequest$inlined = alertListRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlertManagementAdapter$getAlertListgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$alertListRequest$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends AlertUiItem>>> continuation) {
        return ((AlertManagementAdapter$getAlertListgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objM7377constructorimpl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                pUU.KWHzl("AlertManagementAdapter", "getAlertList");
                C2185ACa c2185ACaKWHzl = this.this$0.EZpvd.KWHzl(this.$alertListRequest$inlined.KWHzl(), this.$alertListRequest$inlined.copydefault(), this.$alertListRequest$inlined.OLrzqt());
                C33077mpe c33077mpe = new C33077mpe(new AlertManagementAdapter$getAlertList$2$1(c2185ACaKWHzl), new AlertManagementAdapter$getAlertList$2$2(c2185ACaKWHzl), new AlertManagementAdapter$getAlertList$2$3(c2185ACaKWHzl), new AlertManagementAdapter$getAlertList$2$4(c2185ACaKWHzl), this.this$0.OLrzqt);
                this.label = 1;
                objAEQbTJ = c33077mpe.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                Result.Application application2 = Result.Companion;
                List list = (List) objAEQbTJ;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.this$0.AEQbTJ((C4183Azz) it.next()));
                }
                objM7377constructorimpl2 = Result.m7377constructorimpl(arrayList);
            } else {
                objM7377constructorimpl2 = Result.m7377constructorimpl(objAEQbTJ);
            }
            if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                pUU.KWHzl("AlertManagementAdapter", "getAlertList success size=" + ((List) objM7377constructorimpl2).size());
            }
            C56391yDq.AEQbTJ(objM7377constructorimpl2);
            objM7377constructorimpl = Result.m7377constructorimpl(C27604jyN.EZpvd((List) objM7377constructorimpl2));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
