package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.group.paidgroup.UpdatePaymentRequiredStatusUseCase$invoke$1;
import com.okinc.okimcore.feature.group.paidgroup.UpdatePaymentRequiredStatusUseCase$invoke$2$response$1$1;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.remote.UpdatePaymentRequiredStatusRequest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44269sJo {
    public final CoroutineDispatcher EZpvd;
    public final InHouseIMGroupService copydefault;

    @yCM
    public C44269sJo(@NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = inHouseIMGroupService;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, long j2, @NotNull PaymentRequiredStatus paymentRequiredStatus, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        UpdatePaymentRequiredStatusUseCase$invoke$1 updatePaymentRequiredStatusUseCase$invoke$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof UpdatePaymentRequiredStatusUseCase$invoke$1) {
            updatePaymentRequiredStatusUseCase$invoke$1 = (UpdatePaymentRequiredStatusUseCase$invoke$1) continuation;
            int i = updatePaymentRequiredStatusUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updatePaymentRequiredStatusUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                updatePaymentRequiredStatusUseCase$invoke$1 = new UpdatePaymentRequiredStatusUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = updatePaymentRequiredStatusUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updatePaymentRequiredStatusUseCase$invoke$1.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objWithContext);
                    UpdatePaymentRequiredStatusRequest updatePaymentRequiredStatusRequest = new UpdatePaymentRequiredStatusRequest(j, j2, paymentRequiredStatus.getRawValue());
                    Result.Application application = Result.Companion;
                    CoroutineDispatcher coroutineDispatcher = this.EZpvd;
                    UpdatePaymentRequiredStatusUseCase$invoke$2$response$1$1 updatePaymentRequiredStatusUseCase$invoke$2$response$1$1 = new UpdatePaymentRequiredStatusUseCase$invoke$2$response$1$1(this, updatePaymentRequiredStatusRequest, null);
                    updatePaymentRequiredStatusUseCase$invoke$1.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, updatePaymentRequiredStatusUseCase$invoke$2$response$1$1, updatePaymentRequiredStatusUseCase$invoke$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objWithContext);
                }
                ResponseData responseData = (ResponseData) objWithContext;
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                return Result.m7377constructorimpl(Unit.INSTANCE);
            }
            if (actionBar instanceof AbstractC43419rot.ActionBar) {
                throw ((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
            }
            throw new NoWhenBranchMatchedException();
        } catch (java.lang.Throwable th2) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
    }
}
