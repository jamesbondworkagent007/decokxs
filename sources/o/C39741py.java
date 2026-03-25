package o;

import aws.sdk.kotlin.services.textract.model.BadDocumentException;
import aws.sdk.kotlin.services.textract.serde.BadDocumentExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C39741py implements BB<BadDocumentException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super BadDocumentException> continuation) throws java.lang.Throwable {
        BadDocumentExceptionDeserializer$deserialize$1 badDocumentExceptionDeserializer$deserialize$1;
        BadDocumentException.ActionBar actionBar;
        if (continuation instanceof BadDocumentExceptionDeserializer$deserialize$1) {
            badDocumentExceptionDeserializer$deserialize$1 = (BadDocumentExceptionDeserializer$deserialize$1) continuation;
            int i = badDocumentExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                badDocumentExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                badDocumentExceptionDeserializer$deserialize$1 = new BadDocumentExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = badDocumentExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = badDocumentExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            BadDocumentException.ActionBar actionBar2 = new BadDocumentException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            badDocumentExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            badDocumentExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, badDocumentExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (BadDocumentException.ActionBar) badDocumentExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C39582pv.AEQbTJ(actionBar, bArr);
        }
        actionBar.EZpvd();
        return actionBar.KWHzl();
    }
}
