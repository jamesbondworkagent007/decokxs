package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceTokenResp;
import com.okinc.ok_kyc_core.domain.usecase.GetAlifaceAccountTokenUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41971rBo {
    public final InterfaceC41969rBm AEQbTJ;

    public C41971rBo(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.AEQbTJ = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super kotlin.Pair<AlifaceTokenResp, java.lang.String>> continuation) throws java.lang.Throwable {
        GetAlifaceAccountTokenUseCase$invoke$1 getAlifaceAccountTokenUseCase$invoke$1;
        if (continuation instanceof GetAlifaceAccountTokenUseCase$invoke$1) {
            getAlifaceAccountTokenUseCase$invoke$1 = (GetAlifaceAccountTokenUseCase$invoke$1) continuation;
            int i = getAlifaceAccountTokenUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAlifaceAccountTokenUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAlifaceAccountTokenUseCase$invoke$1 = new GetAlifaceAccountTokenUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getAlifaceAccountTokenUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getAlifaceAccountTokenUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC41969rBm interfaceC41969rBm = this.AEQbTJ;
                getAlifaceAccountTokenUseCase$invoke$1.label = 1;
                objCopydefault = interfaceC41969rBm.copydefault(str, str2, getAlifaceAccountTokenUseCase$invoke$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return new kotlin.Pair(((AbstractC43728ruk) objCopydefault).AEQbTJ(), "");
        } catch (java.lang.Throwable th) {
            java.lang.String message = th.getMessage();
            return new kotlin.Pair(null, message != null ? message : "");
        }
    }
}
