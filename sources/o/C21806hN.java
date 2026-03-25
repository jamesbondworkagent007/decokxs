package o;

import aws.sdk.kotlin.services.rekognition.model.InvalidS3ObjectException;
import aws.sdk.kotlin.services.rekognition.serde.InvalidS3ObjectExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C21806hN implements BB<InvalidS3ObjectException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidS3ObjectException> continuation) throws java.lang.Throwable {
        InvalidS3ObjectExceptionDeserializer$deserialize$1 invalidS3ObjectExceptionDeserializer$deserialize$1;
        InvalidS3ObjectException.ActionBar actionBar;
        if (continuation instanceof InvalidS3ObjectExceptionDeserializer$deserialize$1) {
            invalidS3ObjectExceptionDeserializer$deserialize$1 = (InvalidS3ObjectExceptionDeserializer$deserialize$1) continuation;
            int i = invalidS3ObjectExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidS3ObjectExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidS3ObjectExceptionDeserializer$deserialize$1 = new InvalidS3ObjectExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidS3ObjectExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidS3ObjectExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidS3ObjectException.ActionBar actionBar2 = new InvalidS3ObjectException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidS3ObjectExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            invalidS3ObjectExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidS3ObjectExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (InvalidS3ObjectException.ActionBar) invalidS3ObjectExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C21779hM.KWHzl(actionBar, bArr);
        }
        actionBar.OLrzqt();
        return actionBar.EZpvd();
    }
}
