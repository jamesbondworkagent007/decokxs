package o;

import aws.sdk.kotlin.services.rekognition.model.InvalidImageFormatException;
import aws.sdk.kotlin.services.rekognition.serde.InvalidImageFormatExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C21563hE implements BB<InvalidImageFormatException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidImageFormatException> continuation) throws java.lang.Throwable {
        InvalidImageFormatExceptionDeserializer$deserialize$1 invalidImageFormatExceptionDeserializer$deserialize$1;
        InvalidImageFormatException.ActionBar actionBar;
        if (continuation instanceof InvalidImageFormatExceptionDeserializer$deserialize$1) {
            invalidImageFormatExceptionDeserializer$deserialize$1 = (InvalidImageFormatExceptionDeserializer$deserialize$1) continuation;
            int i = invalidImageFormatExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidImageFormatExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidImageFormatExceptionDeserializer$deserialize$1 = new InvalidImageFormatExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidImageFormatExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidImageFormatExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidImageFormatException.ActionBar actionBar2 = new InvalidImageFormatException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidImageFormatExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            invalidImageFormatExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidImageFormatExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (InvalidImageFormatException.ActionBar) invalidImageFormatExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C21455hA.AEQbTJ(actionBar, bArr);
        }
        actionBar.copydefault();
        return actionBar.KWHzl();
    }
}
