package o;

import aws.sdk.kotlin.services.comprehend.serde.ListDocumentClassifiersOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.TokenWatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Rfc822Tokenizer implements BB<TokenWatcher> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TokenWatcher> continuation) throws java.lang.Throwable {
        ListDocumentClassifiersOperationDeserializer$deserialize$1 listDocumentClassifiersOperationDeserializer$deserialize$1;
        TokenWatcher.Application application;
        byte[] bArr;
        if (continuation instanceof ListDocumentClassifiersOperationDeserializer$deserialize$1) {
            listDocumentClassifiersOperationDeserializer$deserialize$1 = (ListDocumentClassifiersOperationDeserializer$deserialize$1) continuation;
            int i = listDocumentClassifiersOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listDocumentClassifiersOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listDocumentClassifiersOperationDeserializer$deserialize$1 = new ListDocumentClassifiersOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listDocumentClassifiersOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listDocumentClassifiersOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (TokenWatcher.Application) listDocumentClassifiersOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                UpdateLayout.EZpvd(application, bArr);
            }
            application.AEQbTJ();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listDocumentClassifiersOperationDeserializer$deserialize$1.label = 1;
            if (UpdateLayout.OLrzqt(dt, c58859zS, listDocumentClassifiersOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new TokenWatcher.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listDocumentClassifiersOperationDeserializer$deserialize$1.L$0 = application;
        listDocumentClassifiersOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listDocumentClassifiersOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.AEQbTJ();
        return application.EZpvd();
    }
}
