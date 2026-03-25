package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.WCResultResp;
import com.okinc.ok_kyc_core.domain.usecase.GetWCResultUseCase$invoke$1;
import com.okinc.ok_kyc_core.domain.usecase.GetWCResultUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import o.AbstractC43728ruk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rBH {
    public final InterfaceC41969rBm AEQbTJ;

    public rBH(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.AEQbTJ = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, long j, @NotNull Continuation<? super AbstractC43728ruk<WCResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        GetWCResultUseCase$invoke$1 getWCResultUseCase$invoke$1;
        if (continuation instanceof GetWCResultUseCase$invoke$1) {
            getWCResultUseCase$invoke$1 = (GetWCResultUseCase$invoke$1) continuation;
            int i = getWCResultUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getWCResultUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getWCResultUseCase$invoke$1 = new GetWCResultUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithTimeout = getWCResultUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getWCResultUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithTimeout);
                GetWCResultUseCase$invoke$2 getWCResultUseCase$invoke$2 = new GetWCResultUseCase$invoke$2(this, str, map, null);
                getWCResultUseCase$invoke$1.label = 1;
                objWithTimeout = TimeoutKt.withTimeout(j, getWCResultUseCase$invoke$2, getWCResultUseCase$invoke$1);
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
            return new AbstractC43728ruk.ActionBar(new WCResultResp(C56443yFo.AEQbTJ(-1)));
        } catch (java.lang.Throwable th) {
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, java.lang.String.valueOf(th.getMessage()), null, null, 13, null));
        }
    }
}
