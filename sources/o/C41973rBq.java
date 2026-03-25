package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddresses;
import com.okinc.ok_kyc_core.domain.usecase.GetAutoCompleteAddressesUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41973rBq {
    public final InterfaceC41969rBm EZpvd;

    public C41973rBq(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.EZpvd = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AutoCompleteAddresses> continuation) throws java.lang.Throwable {
        GetAutoCompleteAddressesUseCase$invoke$1 getAutoCompleteAddressesUseCase$invoke$1;
        java.lang.String str2;
        if (continuation instanceof GetAutoCompleteAddressesUseCase$invoke$1) {
            getAutoCompleteAddressesUseCase$invoke$1 = (GetAutoCompleteAddressesUseCase$invoke$1) continuation;
            int i = getAutoCompleteAddressesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAutoCompleteAddressesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAutoCompleteAddressesUseCase$invoke$1 = new GetAutoCompleteAddressesUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getAutoCompleteAddressesUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAutoCompleteAddressesUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC41969rBm interfaceC41969rBm = this.EZpvd;
                getAutoCompleteAddressesUseCase$invoke$1.label = 1;
                objKWHzl = interfaceC41969rBm.KWHzl(str, map, getAutoCompleteAddressesUseCase$invoke$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return (AutoCompleteAddresses) ((AbstractC43728ruk) objKWHzl).copydefault();
        } catch (java.lang.Throwable th) {
            if (th instanceof ResponseFailedException) {
                java.lang.String message = th.getMessage();
                ResponseFailedException responseFailedException = th;
                str2 = "message:" + message + " detailMsg:" + responseFailedException.getDetailMsg() + " code:" + responseFailedException.getCode();
            } else {
                str2 = "{" + C56379yDe.AEQbTJ(th);
            }
            pUU.copydefault("getValues", str2);
            return new AutoCompleteAddresses(yDY.AhwBna());
        }
    }
}
