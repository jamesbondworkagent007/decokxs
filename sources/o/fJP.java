package o;

import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.usecase.GetPasskeyWalletInfoUseCase$invoke$1;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountInfoRes;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fJP {
    public final C13934dbu copydefault;

    @yCM
    public fJP(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.copydefault = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, @NotNull Continuation<? super Result<PasskeyWalletAccountInfoRes>> continuation) throws java.lang.Throwable {
        GetPasskeyWalletInfoUseCase$invoke$1 getPasskeyWalletInfoUseCase$invoke$1;
        if (continuation instanceof GetPasskeyWalletInfoUseCase$invoke$1) {
            getPasskeyWalletInfoUseCase$invoke$1 = (GetPasskeyWalletInfoUseCase$invoke$1) continuation;
            int i2 = getPasskeyWalletInfoUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPasskeyWalletInfoUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getPasskeyWalletInfoUseCase$invoke$1 = new GetPasskeyWalletInfoUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = getPasskeyWalletInfoUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getPasskeyWalletInfoUseCase$invoke$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.copydefault;
        getPasskeyWalletInfoUseCase$invoke$1.label = 1;
        java.lang.Object objAEQbTJ = c13934dbu.AEQbTJ(i, getPasskeyWalletInfoUseCase$invoke$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }
}
