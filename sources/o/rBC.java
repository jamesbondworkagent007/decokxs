package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UrlVendorResultResp;
import com.okinc.ok_kyc_core.domain.usecase.GetUrlVendorUseCase$getUrlVendorResult$1;
import com.okinc.ok_kyc_core.domain.usecase.GetUrlVendorUseCase$getUrlVendorResult$2$1;
import com.okinc.ok_kyc_core.domain.usecase.GetUrlVendorUseCase$invoke$1;
import com.okinc.ok_kyc_core.domain.usecase.GetUrlVendorUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import o.AbstractC43728ruk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rBC {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, long j, @NotNull Continuation<? super AbstractC43728ruk<UrlVendorResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        GetUrlVendorUseCase$invoke$1 getUrlVendorUseCase$invoke$1;
        if (continuation instanceof GetUrlVendorUseCase$invoke$1) {
            getUrlVendorUseCase$invoke$1 = (GetUrlVendorUseCase$invoke$1) continuation;
            int i = getUrlVendorUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getUrlVendorUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getUrlVendorUseCase$invoke$1 = new GetUrlVendorUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithTimeout = getUrlVendorUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getUrlVendorUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithTimeout);
                GetUrlVendorUseCase$invoke$2 getUrlVendorUseCase$invoke$2 = new GetUrlVendorUseCase$invoke$2(this, str, map, null);
                getUrlVendorUseCase$invoke$1.label = 1;
                objWithTimeout = TimeoutKt.withTimeout(j, getUrlVendorUseCase$invoke$2, getUrlVendorUseCase$invoke$1);
                if (objWithTimeout == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithTimeout);
            }
            return objWithTimeout;
        } catch (TimeoutCancellationException unused) {
            return new AbstractC43728ruk.ActionBar(new UrlVendorResultResp(C56443yFo.AEQbTJ(-1)));
        } catch (java.lang.Throwable th) {
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, java.lang.String.valueOf(th.getMessage()), null, null, 13, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, Continuation<? super AbstractC43728ruk<UrlVendorResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        GetUrlVendorUseCase$getUrlVendorResult$1 getUrlVendorUseCase$getUrlVendorResult$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof GetUrlVendorUseCase$getUrlVendorResult$1) {
            getUrlVendorUseCase$getUrlVendorResult$1 = (GetUrlVendorUseCase$getUrlVendorResult$1) continuation;
            int i = getUrlVendorUseCase$getUrlVendorResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getUrlVendorUseCase$getUrlVendorResult$1.label = i - Integer.MIN_VALUE;
            } else {
                getUrlVendorUseCase$getUrlVendorResult$1 = new GetUrlVendorUseCase$getUrlVendorResult$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getUrlVendorUseCase$getUrlVendorResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getUrlVendorUseCase$getUrlVendorResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = new rAP().AEQbTJ();
                GetUrlVendorUseCase$getUrlVendorResult$2$1 getUrlVendorUseCase$getUrlVendorResult$2$1 = new GetUrlVendorUseCase$getUrlVendorResult$2$1(str, map, null);
                getUrlVendorUseCase$getUrlVendorResult$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, getUrlVendorUseCase$getUrlVendorResult$2$1, getUrlVendorUseCase$getUrlVendorResult$1);
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
            if (th instanceof OKServerException) {
                pUU.KWHzl("FileUpload", "response = OKServerException");
                int code = th.getCode();
                java.lang.String message = th.getMessage();
                java.lang.String str2 = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str2, message2 == null ? "" : message2, null, 8, null));
            } else {
                pUU.KWHzl("FileUpload", "response = else");
                java.lang.String strValueOf = java.lang.String.valueOf(th.getCause());
                java.lang.String message3 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, message3 == null ? "" : message3, strValueOf, null, 9, null));
            }
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43728ruk.ActionBar(data);
        }
        pUU.KWHzl("qjf", "response = " + responseData);
        taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, 8, null));
        return taskDescription;
    }
}
