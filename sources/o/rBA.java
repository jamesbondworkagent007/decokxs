package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.OssImageUrlResp;
import com.okinc.ok_kyc_core.domain.usecase.GetOssImageUrlUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rBA {
    public final InterfaceC41969rBm AEQbTJ;

    public rBA(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.AEQbTJ = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        GetOssImageUrlUseCase$invoke$1 getOssImageUrlUseCase$invoke$1;
        if (continuation instanceof GetOssImageUrlUseCase$invoke$1) {
            getOssImageUrlUseCase$invoke$1 = (GetOssImageUrlUseCase$invoke$1) continuation;
            int i = getOssImageUrlUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOssImageUrlUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getOssImageUrlUseCase$invoke$1 = new GetOssImageUrlUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getOssImageUrlUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getOssImageUrlUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC41969rBm interfaceC41969rBm = this.AEQbTJ;
                getOssImageUrlUseCase$invoke$1.label = 1;
                objOLrzqt = interfaceC41969rBm.OLrzqt(j, getOssImageUrlUseCase$invoke$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            return ((OssImageUrlResp) ((AbstractC43728ruk) objOLrzqt).AEQbTJ()).getImagePath();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }
}
