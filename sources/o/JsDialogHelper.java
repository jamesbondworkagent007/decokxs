package o;

import aws.sdk.kotlin.services.polly.model.SsmlMarksNotSupportedForTextTypeException;
import aws.sdk.kotlin.services.polly.serde.SsmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class JsDialogHelper implements BB<SsmlMarksNotSupportedForTextTypeException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super SsmlMarksNotSupportedForTextTypeException> continuation) throws java.lang.Throwable {
        SsmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1 ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1;
        SsmlMarksNotSupportedForTextTypeException.ActionBar actionBar;
        if (continuation instanceof SsmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1) {
            ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1 = (SsmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1) continuation;
            int i = ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1 = new SsmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            SsmlMarksNotSupportedForTextTypeException.ActionBar actionBar2 = new SsmlMarksNotSupportedForTextTypeException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (SsmlMarksNotSupportedForTextTypeException.ActionBar) ssmlMarksNotSupportedForTextTypeExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            JsResult.AEQbTJ(actionBar, bArr);
        }
        actionBar.OLrzqt();
        return actionBar.copydefault();
    }
}
