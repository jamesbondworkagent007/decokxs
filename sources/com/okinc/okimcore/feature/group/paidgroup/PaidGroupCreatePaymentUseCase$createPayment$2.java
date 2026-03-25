package com.okinc.okimcore.feature.group.paidgroup;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.CreatePaidGroupPaymentRequest;
import com.okinc.okimcore.model.remote.CreatePaidGroupPaymentResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C44262sJh;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class PaidGroupCreatePaymentUseCase$createPayment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends CreatePaidGroupPaymentResponse, ? extends OKServerException>>, Object> {
    final /* synthetic */ CreatePaidGroupPaymentRequest $req;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44262sJh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidGroupCreatePaymentUseCase$createPayment$2(C44262sJh c44262sJh, CreatePaidGroupPaymentRequest createPaidGroupPaymentRequest, Continuation<? super PaidGroupCreatePaymentUseCase$createPayment$2> continuation) {
        super(2, continuation);
        this.this$0 = c44262sJh;
        this.$req = createPaidGroupPaymentRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaidGroupCreatePaymentUseCase$createPayment$2 paidGroupCreatePaymentUseCase$createPayment$2 = new PaidGroupCreatePaymentUseCase$createPayment$2(this.this$0, this.$req, continuation);
        paidGroupCreatePaymentUseCase$createPayment$2.L$0 = obj;
        return paidGroupCreatePaymentUseCase$createPayment$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends CreatePaidGroupPaymentResponse, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<CreatePaidGroupPaymentResponse, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<CreatePaidGroupPaymentResponse, OKServerException>> continuation) {
        return ((PaidGroupCreatePaymentUseCase$createPayment$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C44262sJh c44262sJh = this.this$0;
                CreatePaidGroupPaymentRequest createPaidGroupPaymentRequest = this.$req;
                InHouseIMGroupService inHouseIMGroupService = c44262sJh.EZpvd;
                this.label = 1;
                obj = inHouseIMGroupService.createPaidGroupPayment(createPaidGroupPaymentRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }
}
