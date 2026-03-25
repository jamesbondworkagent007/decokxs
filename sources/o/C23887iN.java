package o;

import aws.sdk.kotlin.services.rekognition.model.MalformedPolicyDocumentException;
import aws.sdk.kotlin.services.rekognition.serde.MalformedPolicyDocumentExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23887iN implements BB<MalformedPolicyDocumentException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MalformedPolicyDocumentException> continuation) throws java.lang.Throwable {
        MalformedPolicyDocumentExceptionDeserializer$deserialize$1 malformedPolicyDocumentExceptionDeserializer$deserialize$1;
        MalformedPolicyDocumentException.Activity activity;
        if (continuation instanceof MalformedPolicyDocumentExceptionDeserializer$deserialize$1) {
            malformedPolicyDocumentExceptionDeserializer$deserialize$1 = (MalformedPolicyDocumentExceptionDeserializer$deserialize$1) continuation;
            int i = malformedPolicyDocumentExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                malformedPolicyDocumentExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                malformedPolicyDocumentExceptionDeserializer$deserialize$1 = new MalformedPolicyDocumentExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = malformedPolicyDocumentExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = malformedPolicyDocumentExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            MalformedPolicyDocumentException.Activity activity2 = new MalformedPolicyDocumentException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            malformedPolicyDocumentExceptionDeserializer$deserialize$1.L$0 = activity2;
            malformedPolicyDocumentExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, malformedPolicyDocumentExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (MalformedPolicyDocumentException.Activity) malformedPolicyDocumentExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C23941iP.KWHzl(activity, bArr);
        }
        activity.copydefault();
        return activity.OLrzqt();
    }
}
