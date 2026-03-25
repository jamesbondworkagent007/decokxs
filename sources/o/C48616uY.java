package o;

import aws.sdk.kotlin.services.translate.model.InternalServerException;
import aws.sdk.kotlin.services.translate.serde.InternalServerExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48616uY implements BB<InternalServerException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InternalServerException> continuation) throws java.lang.Throwable {
        InternalServerExceptionDeserializer$deserialize$1 internalServerExceptionDeserializer$deserialize$1;
        InternalServerException.ActionBar actionBar;
        if (continuation instanceof InternalServerExceptionDeserializer$deserialize$1) {
            internalServerExceptionDeserializer$deserialize$1 = (InternalServerExceptionDeserializer$deserialize$1) continuation;
            int i = internalServerExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                internalServerExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                internalServerExceptionDeserializer$deserialize$1 = new InternalServerExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = internalServerExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = internalServerExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InternalServerException.ActionBar actionBar2 = new InternalServerException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            internalServerExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            internalServerExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, internalServerExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (InternalServerException.ActionBar) internalServerExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C50804vb.EZpvd(actionBar, bArr);
        }
        actionBar.AEQbTJ();
        return actionBar.KWHzl();
    }
}
