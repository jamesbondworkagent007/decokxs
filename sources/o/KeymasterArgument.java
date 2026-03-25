package o;

import aws.sdk.kotlin.services.comprehend.serde.ClassifyDocumentOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.TrafficStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class KeymasterArgument implements BB<TrafficStats> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TrafficStats> continuation) throws java.lang.Throwable {
        ClassifyDocumentOperationDeserializer$deserialize$1 classifyDocumentOperationDeserializer$deserialize$1;
        TrafficStats.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof ClassifyDocumentOperationDeserializer$deserialize$1) {
            classifyDocumentOperationDeserializer$deserialize$1 = (ClassifyDocumentOperationDeserializer$deserialize$1) continuation;
            int i = classifyDocumentOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                classifyDocumentOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                classifyDocumentOperationDeserializer$deserialize$1 = new ClassifyDocumentOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = classifyDocumentOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = classifyDocumentOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (TrafficStats.ActionBar) classifyDocumentOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                KeymasterLongArgument.KWHzl(actionBar, bArr);
            }
            actionBar.AEQbTJ();
            return actionBar.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            classifyDocumentOperationDeserializer$deserialize$1.label = 1;
            if (KeymasterLongArgument.KWHzl(dt, c58859zS, classifyDocumentOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new TrafficStats.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        classifyDocumentOperationDeserializer$deserialize$1.L$0 = actionBar;
        classifyDocumentOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, classifyDocumentOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.AEQbTJ();
        return actionBar.EZpvd();
    }
}
