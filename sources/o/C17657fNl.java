package o;

import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopReq;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopRes;
import com.okinc.business.defi.wallet.passkey.common.usecase.SendUopUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17657fNl {
    public final C13934dbu copydefault;

    public C17657fNl(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.copydefault = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull PasskeyWalletSendUopReq passkeyWalletSendUopReq, @NotNull Continuation<? super Result<PasskeyWalletSendUopRes>> continuation) {
        SendUopUseCase$invoke$1 sendUopUseCase$invoke$1;
        if (continuation instanceof SendUopUseCase$invoke$1) {
            sendUopUseCase$invoke$1 = (SendUopUseCase$invoke$1) continuation;
            int i = sendUopUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sendUopUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                sendUopUseCase$invoke$1 = new SendUopUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = sendUopUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sendUopUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.copydefault;
        sendUopUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = c13934dbu.copydefault(str, passkeyWalletSendUopReq, sendUopUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
