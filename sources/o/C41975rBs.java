package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormatCompleteAddresses;
import com.okinc.ok_kyc_core.domain.usecase.GetFormatCompleteAddressesUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41975rBs {
    public final InterfaceC41969rBm OLrzqt;

    public C41975rBs(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.OLrzqt = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<FormatCompleteAddresses>> continuation) throws java.lang.Throwable {
        GetFormatCompleteAddressesUseCase$invoke$1 getFormatCompleteAddressesUseCase$invoke$1;
        java.lang.String str2;
        if (continuation instanceof GetFormatCompleteAddressesUseCase$invoke$1) {
            getFormatCompleteAddressesUseCase$invoke$1 = (GetFormatCompleteAddressesUseCase$invoke$1) continuation;
            int i = getFormatCompleteAddressesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getFormatCompleteAddressesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getFormatCompleteAddressesUseCase$invoke$1 = new GetFormatCompleteAddressesUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getFormatCompleteAddressesUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getFormatCompleteAddressesUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC41969rBm interfaceC41969rBm = this.OLrzqt;
                getFormatCompleteAddressesUseCase$invoke$1.label = 1;
                objAEQbTJ = interfaceC41969rBm.AEQbTJ(str, map, getFormatCompleteAddressesUseCase$invoke$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return (java.util.List) ((AbstractC43728ruk) objAEQbTJ).copydefault();
        } catch (java.lang.Throwable th) {
            if (th instanceof ResponseFailedException) {
                java.lang.String message = th.getMessage();
                ResponseFailedException responseFailedException = th;
                str2 = "message:" + message + " detailMsg:" + responseFailedException.getDetailMsg() + " code:" + responseFailedException.getCode();
            } else {
                str2 = "{" + C56379yDe.AEQbTJ(th);
            }
            pUU.copydefault("getValues", str2);
            return yDY.AhwBna();
        }
    }
}
