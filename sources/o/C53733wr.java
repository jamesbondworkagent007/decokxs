package o;

import aws.sdk.kotlin.services.translate.serde.TranslateTextOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C48776uc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C53733wr implements BB<C48776uc> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C48776uc> continuation) throws java.lang.Throwable {
        TranslateTextOperationDeserializer$deserialize$1 translateTextOperationDeserializer$deserialize$1;
        C48776uc.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof TranslateTextOperationDeserializer$deserialize$1) {
            translateTextOperationDeserializer$deserialize$1 = (TranslateTextOperationDeserializer$deserialize$1) continuation;
            int i = translateTextOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                translateTextOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                translateTextOperationDeserializer$deserialize$1 = new TranslateTextOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = translateTextOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = translateTextOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C48776uc.TaskDescription) translateTextOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C53786ws.copydefault(taskDescription, bArr);
            }
            taskDescription.EZpvd();
            return taskDescription.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            translateTextOperationDeserializer$deserialize$1.label = 1;
            if (C53786ws.AEQbTJ(dt, c58859zS, translateTextOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C48776uc.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        translateTextOperationDeserializer$deserialize$1.L$0 = taskDescription;
        translateTextOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, translateTextOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.EZpvd();
        return taskDescription.copydefault();
    }
}
