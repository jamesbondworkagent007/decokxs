package o;

import aws.sdk.kotlin.services.polly.model.MarksNotSupportedForFormatException;
import aws.sdk.kotlin.services.polly.serde.MarksNotSupportedForFormatExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CookieManager implements BB<MarksNotSupportedForFormatException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MarksNotSupportedForFormatException> continuation) throws java.lang.Throwable {
        MarksNotSupportedForFormatExceptionDeserializer$deserialize$1 marksNotSupportedForFormatExceptionDeserializer$deserialize$1;
        MarksNotSupportedForFormatException.ActionBar actionBar;
        if (continuation instanceof MarksNotSupportedForFormatExceptionDeserializer$deserialize$1) {
            marksNotSupportedForFormatExceptionDeserializer$deserialize$1 = (MarksNotSupportedForFormatExceptionDeserializer$deserialize$1) continuation;
            int i = marksNotSupportedForFormatExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marksNotSupportedForFormatExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                marksNotSupportedForFormatExceptionDeserializer$deserialize$1 = new MarksNotSupportedForFormatExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = marksNotSupportedForFormatExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marksNotSupportedForFormatExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            MarksNotSupportedForFormatException.ActionBar actionBar2 = new MarksNotSupportedForFormatException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            marksNotSupportedForFormatExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            marksNotSupportedForFormatExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, marksNotSupportedForFormatExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (MarksNotSupportedForFormatException.ActionBar) marksNotSupportedForFormatExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            DateSorter.copydefault(actionBar, bArr);
        }
        actionBar.copydefault();
        return actionBar.AEQbTJ();
    }
}
