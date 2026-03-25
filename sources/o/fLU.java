package o;

import com.okinc.business.defi.wallet.passkey.cedefi.recovery.domain.usecase.GetRecoveryInfoUseCase$invoke$1;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletRecoverInfoRes;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fLU {
    public final C13934dbu OLrzqt;

    @yCM
    public fLU(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.OLrzqt = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(int i, @NotNull Continuation<? super Result<PasskeyWalletRecoverInfoRes>> continuation) throws java.lang.Throwable {
        GetRecoveryInfoUseCase$invoke$1 getRecoveryInfoUseCase$invoke$1;
        if (continuation instanceof GetRecoveryInfoUseCase$invoke$1) {
            getRecoveryInfoUseCase$invoke$1 = (GetRecoveryInfoUseCase$invoke$1) continuation;
            int i2 = getRecoveryInfoUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getRecoveryInfoUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getRecoveryInfoUseCase$invoke$1 = new GetRecoveryInfoUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = getRecoveryInfoUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getRecoveryInfoUseCase$invoke$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.OLrzqt;
        getRecoveryInfoUseCase$invoke$1.label = 1;
        java.lang.Object objEZpvd = c13934dbu.EZpvd(i, getRecoveryInfoUseCase$invoke$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }
}
