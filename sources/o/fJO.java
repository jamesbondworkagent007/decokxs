package o;

import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.usecase.BatchSendEscapeUopUseCase$invoke$1;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopReq;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopRes;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fJO {
    public final C13934dbu EZpvd;

    @yCM
    public fJO(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.EZpvd = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull EscapeBatchSendUopReq escapeBatchSendUopReq, @NotNull Continuation<? super Result<EscapeBatchSendUopRes>> continuation) {
        BatchSendEscapeUopUseCase$invoke$1 batchSendEscapeUopUseCase$invoke$1;
        if (continuation instanceof BatchSendEscapeUopUseCase$invoke$1) {
            batchSendEscapeUopUseCase$invoke$1 = (BatchSendEscapeUopUseCase$invoke$1) continuation;
            int i = batchSendEscapeUopUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                batchSendEscapeUopUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                batchSendEscapeUopUseCase$invoke$1 = new BatchSendEscapeUopUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = batchSendEscapeUopUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = batchSendEscapeUopUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.EZpvd;
        batchSendEscapeUopUseCase$invoke$1.label = 1;
        java.lang.Object objAEQbTJ = c13934dbu.AEQbTJ(escapeBatchSendUopReq, batchSendEscapeUopUseCase$invoke$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }
}
