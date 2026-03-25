package o;

import aws.sdk.kotlin.services.textract.model.InvalidJobIdException;
import aws.sdk.kotlin.services.textract.serde.InvalidJobIdExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C40442qW implements BB<InvalidJobIdException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidJobIdException> continuation) throws java.lang.Throwable {
        InvalidJobIdExceptionDeserializer$deserialize$1 invalidJobIdExceptionDeserializer$deserialize$1;
        InvalidJobIdException.StateListAnimator stateListAnimator;
        if (continuation instanceof InvalidJobIdExceptionDeserializer$deserialize$1) {
            invalidJobIdExceptionDeserializer$deserialize$1 = (InvalidJobIdExceptionDeserializer$deserialize$1) continuation;
            int i = invalidJobIdExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidJobIdExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidJobIdExceptionDeserializer$deserialize$1 = new InvalidJobIdExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidJobIdExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidJobIdExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidJobIdException.StateListAnimator stateListAnimator2 = new InvalidJobIdException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidJobIdExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            invalidJobIdExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidJobIdExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (InvalidJobIdException.StateListAnimator) invalidJobIdExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C40469qX.KWHzl(stateListAnimator, bArr);
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.AEQbTJ();
    }
}
