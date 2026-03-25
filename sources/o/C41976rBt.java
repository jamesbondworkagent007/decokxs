package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ChinaAddressBean;
import com.okinc.ok_kyc_core.domain.usecase.GetChinaAddressesUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41976rBt {
    public final InterfaceC41969rBm KWHzl;

    public C41976rBt(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.KWHzl = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super java.util.ArrayList<ChinaAddressBean>> continuation) throws java.lang.Throwable {
        GetChinaAddressesUseCase$invoke$1 getChinaAddressesUseCase$invoke$1;
        java.lang.String str3;
        if (continuation instanceof GetChinaAddressesUseCase$invoke$1) {
            getChinaAddressesUseCase$invoke$1 = (GetChinaAddressesUseCase$invoke$1) continuation;
            int i = getChinaAddressesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getChinaAddressesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getChinaAddressesUseCase$invoke$1 = new GetChinaAddressesUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getChinaAddressesUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getChinaAddressesUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC41969rBm interfaceC41969rBm = this.KWHzl;
                getChinaAddressesUseCase$invoke$1.label = 1;
                objKWHzl = interfaceC41969rBm.KWHzl(str, str2, getChinaAddressesUseCase$invoke$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return (java.util.ArrayList) ((AbstractC43728ruk) objKWHzl).copydefault();
        } catch (java.lang.Throwable th) {
            if (th instanceof ResponseFailedException) {
                java.lang.String message = th.getMessage();
                ResponseFailedException responseFailedException = th;
                str3 = "message:" + message + " detailMsg:" + responseFailedException.getDetailMsg() + " code:" + responseFailedException.getCode();
            } else {
                str3 = "{" + C56379yDe.AEQbTJ(th);
            }
            pUU.copydefault("getValues", str3);
            return new java.util.ArrayList();
        }
    }
}
