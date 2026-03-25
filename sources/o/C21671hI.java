package o;

import aws.sdk.kotlin.services.rekognition.model.InvalidPaginationTokenException;
import aws.sdk.kotlin.services.rekognition.serde.InvalidPaginationTokenExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C21671hI implements BB<InvalidPaginationTokenException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidPaginationTokenException> continuation) throws java.lang.Throwable {
        InvalidPaginationTokenExceptionDeserializer$deserialize$1 invalidPaginationTokenExceptionDeserializer$deserialize$1;
        InvalidPaginationTokenException.StateListAnimator stateListAnimator;
        if (continuation instanceof InvalidPaginationTokenExceptionDeserializer$deserialize$1) {
            invalidPaginationTokenExceptionDeserializer$deserialize$1 = (InvalidPaginationTokenExceptionDeserializer$deserialize$1) continuation;
            int i = invalidPaginationTokenExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidPaginationTokenExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidPaginationTokenExceptionDeserializer$deserialize$1 = new InvalidPaginationTokenExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidPaginationTokenExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidPaginationTokenExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidPaginationTokenException.StateListAnimator stateListAnimator2 = new InvalidPaginationTokenException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidPaginationTokenExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            invalidPaginationTokenExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidPaginationTokenExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (InvalidPaginationTokenException.StateListAnimator) invalidPaginationTokenExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C21590hF.KWHzl(stateListAnimator, bArr);
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.AEQbTJ();
    }
}
