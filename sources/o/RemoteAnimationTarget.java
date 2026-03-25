package o;

import aws.sdk.kotlin.services.comprehend.model.UnsupportedLanguageException;
import aws.sdk.kotlin.services.comprehend.serde.UnsupportedLanguageExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RemoteAnimationTarget implements BB<UnsupportedLanguageException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UnsupportedLanguageException> continuation) throws java.lang.Throwable {
        UnsupportedLanguageExceptionDeserializer$deserialize$1 unsupportedLanguageExceptionDeserializer$deserialize$1;
        UnsupportedLanguageException.ActionBar actionBar;
        if (continuation instanceof UnsupportedLanguageExceptionDeserializer$deserialize$1) {
            unsupportedLanguageExceptionDeserializer$deserialize$1 = (UnsupportedLanguageExceptionDeserializer$deserialize$1) continuation;
            int i = unsupportedLanguageExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unsupportedLanguageExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unsupportedLanguageExceptionDeserializer$deserialize$1 = new UnsupportedLanguageExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unsupportedLanguageExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unsupportedLanguageExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UnsupportedLanguageException.ActionBar actionBar2 = new UnsupportedLanguageException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            unsupportedLanguageExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            unsupportedLanguageExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, unsupportedLanguageExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (UnsupportedLanguageException.ActionBar) unsupportedLanguageExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            RenderNode.EZpvd(actionBar, bArr);
        }
        actionBar.EZpvd();
        return actionBar.copydefault();
    }
}
