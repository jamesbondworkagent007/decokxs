package o;

import com.okinc.ok_kyc_core.domain.usecase.GetKycExperimentValueUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C41980rBx {
    public final InterfaceC41967rBk copydefault;

    public C41980rBx(@NotNull InterfaceC41967rBk interfaceC41967rBk) {
        Intrinsics.checkNotNullParameter(interfaceC41967rBk, "");
        this.copydefault = interfaceC41967rBk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        GetKycExperimentValueUseCase$invoke$1 getKycExperimentValueUseCase$invoke$1;
        if (continuation instanceof GetKycExperimentValueUseCase$invoke$1) {
            getKycExperimentValueUseCase$invoke$1 = (GetKycExperimentValueUseCase$invoke$1) continuation;
            int i = getKycExperimentValueUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getKycExperimentValueUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getKycExperimentValueUseCase$invoke$1 = new GetKycExperimentValueUseCase$invoke$1(this, continuation);
            }
        }
        GetKycExperimentValueUseCase$invoke$1 getKycExperimentValueUseCase$invoke$12 = getKycExperimentValueUseCase$invoke$1;
        java.lang.Object objCopydefault = getKycExperimentValueUseCase$invoke$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getKycExperimentValueUseCase$invoke$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC41967rBk interfaceC41967rBk = this.copydefault;
                getKycExperimentValueUseCase$invoke$12.L$0 = str2;
                getKycExperimentValueUseCase$invoke$12.label = 1;
                objCopydefault = interfaceC41967rBk.copydefault(str, str2, str3, z, getKycExperimentValueUseCase$invoke$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (java.lang.String) getKycExperimentValueUseCase$invoke$12.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return (java.lang.String) objCopydefault;
        } catch (java.lang.Throwable unused) {
            return str2;
        }
    }
}
