package o;

import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.usecase.GetCopyTradeDetailUseCase$invoke$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gXj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20005gXj {
    public final InterfaceC20053gZd KWHzl;
    public final kYC OLrzqt;

    @yCM
    public C20005gXj(@NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.KWHzl = interfaceC20053gZd;
        this.OLrzqt = kyc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<CopyTradeDetail>> continuation) {
        GetCopyTradeDetailUseCase$invoke$1 getCopyTradeDetailUseCase$invoke$1;
        if (continuation instanceof GetCopyTradeDetailUseCase$invoke$1) {
            getCopyTradeDetailUseCase$invoke$1 = (GetCopyTradeDetailUseCase$invoke$1) continuation;
            int i = getCopyTradeDetailUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCopyTradeDetailUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getCopyTradeDetailUseCase$invoke$1 = new GetCopyTradeDetailUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getCopyTradeDetailUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getCopyTradeDetailUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                InterfaceC20053gZd interfaceC20053gZd = this.KWHzl;
                java.lang.String strKWHzl = this.OLrzqt.KWHzl();
                getCopyTradeDetailUseCase$invoke$1.label = 1;
                objCopydefault = interfaceC20053gZd.copydefault(strKWHzl, str, getCopyTradeDetailUseCase$invoke$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return Result.m7377constructorimpl((CopyTradeDetail) ((AbstractC43419rot) objCopydefault).AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
