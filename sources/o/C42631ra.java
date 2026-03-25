package o;

import aws.sdk.kotlin.services.textract.model.InternalServerError;
import aws.sdk.kotlin.services.textract.serde.InternalServerErrorDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C42631ra implements BB<InternalServerError> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InternalServerError> continuation) throws java.lang.Throwable {
        InternalServerErrorDeserializer$deserialize$1 internalServerErrorDeserializer$deserialize$1;
        InternalServerError.Application application;
        if (continuation instanceof InternalServerErrorDeserializer$deserialize$1) {
            internalServerErrorDeserializer$deserialize$1 = (InternalServerErrorDeserializer$deserialize$1) continuation;
            int i = internalServerErrorDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                internalServerErrorDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                internalServerErrorDeserializer$deserialize$1 = new InternalServerErrorDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = internalServerErrorDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = internalServerErrorDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InternalServerError.Application application2 = new InternalServerError.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            internalServerErrorDeserializer$deserialize$1.L$0 = application2;
            internalServerErrorDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, internalServerErrorDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (InternalServerError.Application) internalServerErrorDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C40523qZ.EZpvd(application, bArr);
        }
        application.AEQbTJ();
        return application.OLrzqt();
    }
}
