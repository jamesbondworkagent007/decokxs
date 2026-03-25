package o;

import aws.sdk.kotlin.services.textract.model.AccessDeniedException;
import aws.sdk.kotlin.services.textract.serde.AccessDeniedExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38471pa implements BB<AccessDeniedException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AccessDeniedException> continuation) throws java.lang.Throwable {
        AccessDeniedExceptionDeserializer$deserialize$1 accessDeniedExceptionDeserializer$deserialize$1;
        AccessDeniedException.StateListAnimator stateListAnimator;
        if (continuation instanceof AccessDeniedExceptionDeserializer$deserialize$1) {
            accessDeniedExceptionDeserializer$deserialize$1 = (AccessDeniedExceptionDeserializer$deserialize$1) continuation;
            int i = accessDeniedExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessDeniedExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                accessDeniedExceptionDeserializer$deserialize$1 = new AccessDeniedExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = accessDeniedExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = accessDeniedExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            AccessDeniedException.StateListAnimator stateListAnimator2 = new AccessDeniedException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            accessDeniedExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            accessDeniedExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, accessDeniedExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (AccessDeniedException.StateListAnimator) accessDeniedExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C38524pb.KWHzl(stateListAnimator, bArr);
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.OLrzqt();
    }
}
