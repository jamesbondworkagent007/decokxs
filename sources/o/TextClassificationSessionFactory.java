package o;

import aws.sdk.kotlin.services.polly.model.InvalidTaskIdException;
import aws.sdk.kotlin.services.polly.serde.InvalidTaskIdExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TextClassificationSessionFactory implements BB<InvalidTaskIdException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidTaskIdException> continuation) throws java.lang.Throwable {
        InvalidTaskIdExceptionDeserializer$deserialize$1 invalidTaskIdExceptionDeserializer$deserialize$1;
        InvalidTaskIdException.StateListAnimator stateListAnimator;
        if (continuation instanceof InvalidTaskIdExceptionDeserializer$deserialize$1) {
            invalidTaskIdExceptionDeserializer$deserialize$1 = (InvalidTaskIdExceptionDeserializer$deserialize$1) continuation;
            int i = invalidTaskIdExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidTaskIdExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidTaskIdExceptionDeserializer$deserialize$1 = new InvalidTaskIdExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidTaskIdExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidTaskIdExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidTaskIdException.StateListAnimator stateListAnimator2 = new InvalidTaskIdException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidTaskIdExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            invalidTaskIdExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidTaskIdExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (InvalidTaskIdException.StateListAnimator) invalidTaskIdExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            TextClassificationManager.copydefault(stateListAnimator, bArr);
        }
        stateListAnimator.OLrzqt();
        return stateListAnimator.KWHzl();
    }
}
