package o;

import com.okinc.business.web3pay.lib.features.order.PurchaseRepositoryImpl$getPaymentPageRender$1;
import com.okinc.business.web3pay.lib.features.order.model.PaymentPageRequest;
import com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderDetailResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@yCR
public final class C31282lrA {
    public final InterfaceC31331lrx OLrzqt;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<PurchaseOrderDetailResponse>> continuation) {
        PurchaseRepositoryImpl$getPaymentPageRender$1 purchaseRepositoryImpl$getPaymentPageRender$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PurchaseRepositoryImpl$getPaymentPageRender$1) {
            purchaseRepositoryImpl$getPaymentPageRender$1 = (PurchaseRepositoryImpl$getPaymentPageRender$1) continuation;
            int i = purchaseRepositoryImpl$getPaymentPageRender$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryImpl$getPaymentPageRender$1.label = i - Integer.MIN_VALUE;
            } else {
                purchaseRepositoryImpl$getPaymentPageRender$1 = new PurchaseRepositoryImpl$getPaymentPageRender$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = purchaseRepositoryImpl$getPaymentPageRender$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = purchaseRepositoryImpl$getPaymentPageRender$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC31331lrx interfaceC31331lrx = this.OLrzqt;
                PaymentPageRequest paymentPageRequest = new PaymentPageRequest(str);
                purchaseRepositoryImpl$getPaymentPageRender$1.label = 1;
                objAEQbTJ = interfaceC31331lrx.AEQbTJ(paymentPageRequest, purchaseRepositoryImpl$getPaymentPageRender$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }
}
