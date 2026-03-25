package o;

import aws.sdk.kotlin.services.polly.model.LanguageNotSupportedException;
import aws.sdk.kotlin.services.polly.serde.LanguageNotSupportedExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TextSelection implements BB<LanguageNotSupportedException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super LanguageNotSupportedException> continuation) throws java.lang.Throwable {
        LanguageNotSupportedExceptionDeserializer$deserialize$1 languageNotSupportedExceptionDeserializer$deserialize$1;
        LanguageNotSupportedException.TaskDescription taskDescription;
        if (continuation instanceof LanguageNotSupportedExceptionDeserializer$deserialize$1) {
            languageNotSupportedExceptionDeserializer$deserialize$1 = (LanguageNotSupportedExceptionDeserializer$deserialize$1) continuation;
            int i = languageNotSupportedExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageNotSupportedExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                languageNotSupportedExceptionDeserializer$deserialize$1 = new LanguageNotSupportedExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = languageNotSupportedExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = languageNotSupportedExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            LanguageNotSupportedException.TaskDescription taskDescription2 = new LanguageNotSupportedException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            languageNotSupportedExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            languageNotSupportedExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, languageNotSupportedExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (LanguageNotSupportedException.TaskDescription) languageNotSupportedExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            TextClassifierImplNative.copydefault(taskDescription, bArr);
        }
        taskDescription.AEQbTJ();
        return taskDescription.OLrzqt();
    }
}
