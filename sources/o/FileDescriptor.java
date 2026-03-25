package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.RegionDisabledException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.RegionDisabledExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class FileDescriptor implements BB<RegionDisabledException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super RegionDisabledException> continuation) throws java.lang.Throwable {
        RegionDisabledExceptionDeserializer$deserialize$1 regionDisabledExceptionDeserializer$deserialize$1;
        RegionDisabledException.Application application;
        if (continuation instanceof RegionDisabledExceptionDeserializer$deserialize$1) {
            regionDisabledExceptionDeserializer$deserialize$1 = (RegionDisabledExceptionDeserializer$deserialize$1) continuation;
            int i = regionDisabledExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regionDisabledExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                regionDisabledExceptionDeserializer$deserialize$1 = new RegionDisabledExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = regionDisabledExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = regionDisabledExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            RegionDisabledException.Application application2 = new RegionDisabledException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            regionDisabledExceptionDeserializer$deserialize$1.L$0 = application2;
            regionDisabledExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, regionDisabledExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (RegionDisabledException.Application) regionDisabledExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            FileNotFoundException.AEQbTJ(application, bArr);
        }
        application.EZpvd();
        return application.KWHzl();
    }
}
