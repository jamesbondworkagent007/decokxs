package o;

import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.trade.features.home.domain.usecase.bridgeapprovedata.NativeBridgeApproveDataUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.reactive.AwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kUG {
    public final C23237huT EZpvd;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super ApproveUnsignedData> continuation) throws java.lang.Throwable {
        NativeBridgeApproveDataUseCase$invoke$1 nativeBridgeApproveDataUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof NativeBridgeApproveDataUseCase$invoke$1) {
            nativeBridgeApproveDataUseCase$invoke$1 = (NativeBridgeApproveDataUseCase$invoke$1) continuation;
            int i = nativeBridgeApproveDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nativeBridgeApproveDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                nativeBridgeApproveDataUseCase$invoke$1 = new NativeBridgeApproveDataUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAwaitFirst = nativeBridgeApproveDataUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = nativeBridgeApproveDataUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwaitFirst);
                Result.Application application = Result.Companion;
                AbstractC58185ywX<ApproveUnsignedData> abstractC58185ywXEZpvd = this.EZpvd.EZpvd(str, str2, str3, str4, str5);
                nativeBridgeApproveDataUseCase$invoke$1.label = 1;
                objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXEZpvd, nativeBridgeApproveDataUseCase$invoke$1);
                if (objAwaitFirst == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwaitFirst);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((ApproveUnsignedData) objAwaitFirst);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
