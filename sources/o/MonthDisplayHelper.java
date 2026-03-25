package o;

import aws.sdk.kotlin.services.comprehend.model.ResourceLimitExceededException;
import aws.sdk.kotlin.services.comprehend.serde.ResourceLimitExceededExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MonthDisplayHelper implements BB<ResourceLimitExceededException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ResourceLimitExceededException> continuation) throws java.lang.Throwable {
        ResourceLimitExceededExceptionDeserializer$deserialize$1 resourceLimitExceededExceptionDeserializer$deserialize$1;
        ResourceLimitExceededException.ActionBar actionBar;
        if (continuation instanceof ResourceLimitExceededExceptionDeserializer$deserialize$1) {
            resourceLimitExceededExceptionDeserializer$deserialize$1 = (ResourceLimitExceededExceptionDeserializer$deserialize$1) continuation;
            int i = resourceLimitExceededExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resourceLimitExceededExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                resourceLimitExceededExceptionDeserializer$deserialize$1 = new ResourceLimitExceededExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = resourceLimitExceededExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resourceLimitExceededExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ResourceLimitExceededException.ActionBar actionBar2 = new ResourceLimitExceededException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            resourceLimitExceededExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            resourceLimitExceededExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, resourceLimitExceededExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (ResourceLimitExceededException.ActionBar) resourceLimitExceededExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            MutableBoolean.EZpvd(actionBar, bArr);
        }
        actionBar.OLrzqt();
        return actionBar.EZpvd();
    }
}
