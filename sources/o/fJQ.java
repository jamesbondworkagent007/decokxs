package o;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountPreCheckResult;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.usecase.PreCheckAccountUseCase$invoke$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fJQ {
    public final C13934dbu AEQbTJ;

    @yCM
    public fJQ(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.AEQbTJ = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(int i, int i2, @NotNull Continuation<? super Result<? extends AccountPreCheckResult>> continuation) throws java.lang.Throwable {
        PreCheckAccountUseCase$invoke$1 preCheckAccountUseCase$invoke$1;
        java.lang.Object objEZpvd;
        java.lang.Object otherFailure;
        if (continuation instanceof PreCheckAccountUseCase$invoke$1) {
            preCheckAccountUseCase$invoke$1 = (PreCheckAccountUseCase$invoke$1) continuation;
            int i3 = preCheckAccountUseCase$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                preCheckAccountUseCase$invoke$1.label = i3 - Integer.MIN_VALUE;
            } else {
                preCheckAccountUseCase$invoke$1 = new PreCheckAccountUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = preCheckAccountUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = preCheckAccountUseCase$invoke$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu = this.AEQbTJ;
            preCheckAccountUseCase$invoke$1.label = 1;
            objEZpvd = c13934dbu.EZpvd(i, i2, preCheckAccountUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl == null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(AccountPreCheckResult.Success.copydefault);
        }
        if (thM7380exceptionOrNullimpl instanceof OKServerException) {
            int code = ((OKServerException) thM7380exceptionOrNullimpl).getCode();
            if (code == 0) {
                otherFailure = AccountPreCheckResult.Success.copydefault;
            } else {
                switch (code) {
                    case 10061:
                        otherFailure = AccountPreCheckResult.HasPendingBuy.AEQbTJ;
                        break;
                    case 10062:
                        otherFailure = AccountPreCheckResult.HasPendingSell.AEQbTJ;
                        break;
                    case 10063:
                        otherFailure = AccountPreCheckResult.HasPendingLimit.copydefault;
                        break;
                    case 10064:
                        otherFailure = AccountPreCheckResult.NoBalanceScene.AEQbTJ;
                        break;
                    default:
                        otherFailure = new AccountPreCheckResult.OtherFailure(thM7380exceptionOrNullimpl);
                        break;
                }
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(otherFailure);
        }
        Result.Application application3 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
    }
}
