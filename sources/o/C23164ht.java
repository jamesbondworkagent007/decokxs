package o;

import aws.sdk.kotlin.services.rekognition.model.ImageTooLargeException;
import aws.sdk.kotlin.services.rekognition.serde.ImageTooLargeExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23164ht implements BB<ImageTooLargeException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ImageTooLargeException> continuation) throws java.lang.Throwable {
        ImageTooLargeExceptionDeserializer$deserialize$1 imageTooLargeExceptionDeserializer$deserialize$1;
        ImageTooLargeException.Application application;
        if (continuation instanceof ImageTooLargeExceptionDeserializer$deserialize$1) {
            imageTooLargeExceptionDeserializer$deserialize$1 = (ImageTooLargeExceptionDeserializer$deserialize$1) continuation;
            int i = imageTooLargeExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                imageTooLargeExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                imageTooLargeExceptionDeserializer$deserialize$1 = new ImageTooLargeExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = imageTooLargeExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = imageTooLargeExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ImageTooLargeException.Application application2 = new ImageTooLargeException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            imageTooLargeExceptionDeserializer$deserialize$1.L$0 = application2;
            imageTooLargeExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, imageTooLargeExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (ImageTooLargeException.Application) imageTooLargeExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C23482hz.copydefault(application, bArr);
        }
        application.AEQbTJ();
        return application.EZpvd();
    }
}
