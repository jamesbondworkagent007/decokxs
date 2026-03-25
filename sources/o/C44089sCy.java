package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.uploadlog.bean.TicketSubmitRequest;
import com.okinc.okex.uploadlog.bean.TicketSubmitResponse;
import com.okinc.okex.uploadlog.usecase.SubmitTicketUseCase$invoke$1;
import com.okinc.okex.uploadlog.usecase.SubmitTicketUseCase$invoke$2$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sCy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44089sCy {
    public final InterfaceC45301snH AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C44089sCy(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC45301snH interfaceC45301snH) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC45301snH, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = interfaceC45301snH;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull TicketSubmitRequest ticketSubmitRequest, @NotNull Continuation<? super TicketSubmitResponse> continuation) throws java.lang.Throwable {
        SubmitTicketUseCase$invoke$1 submitTicketUseCase$invoke$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof SubmitTicketUseCase$invoke$1) {
            submitTicketUseCase$invoke$1 = (SubmitTicketUseCase$invoke$1) continuation;
            int i = submitTicketUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                submitTicketUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                submitTicketUseCase$invoke$1 = new SubmitTicketUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = submitTicketUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = submitTicketUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                SubmitTicketUseCase$invoke$2$1 submitTicketUseCase$invoke$2$1 = new SubmitTicketUseCase$invoke$2$1(this, ticketSubmitRequest, null);
                submitTicketUseCase$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, submitTicketUseCase$invoke$2$1, submitTicketUseCase$invoke$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return stateListAnimator.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return stateListAnimator.AEQbTJ();
    }
}
