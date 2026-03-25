package o;

import aws.sdk.kotlin.services.translate.model.UnsupportedDisplayLanguageCodeException;
import aws.sdk.kotlin.services.translate.serde.UnsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C54157wz implements BB<UnsupportedDisplayLanguageCodeException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UnsupportedDisplayLanguageCodeException> continuation) throws java.lang.Throwable {
        UnsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1 unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1;
        UnsupportedDisplayLanguageCodeException.TaskDescription taskDescription;
        if (continuation instanceof UnsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1) {
            unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1 = (UnsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1) continuation;
            int i = unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1 = new UnsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UnsupportedDisplayLanguageCodeException.TaskDescription taskDescription2 = new UnsupportedDisplayLanguageCodeException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (UnsupportedDisplayLanguageCodeException.TaskDescription) unsupportedDisplayLanguageCodeExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C52238wE.AEQbTJ(taskDescription, bArr);
        }
        taskDescription.copydefault();
        return taskDescription.OLrzqt();
    }
}
