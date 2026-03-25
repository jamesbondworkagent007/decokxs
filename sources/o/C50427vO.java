package o;

import aws.sdk.kotlin.services.translate.serde.StartTextTranslationJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C46267tO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C50427vO implements BB<C46267tO> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C46267tO> continuation) throws java.lang.Throwable {
        StartTextTranslationJobOperationDeserializer$deserialize$1 startTextTranslationJobOperationDeserializer$deserialize$1;
        C46267tO.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof StartTextTranslationJobOperationDeserializer$deserialize$1) {
            startTextTranslationJobOperationDeserializer$deserialize$1 = (StartTextTranslationJobOperationDeserializer$deserialize$1) continuation;
            int i = startTextTranslationJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startTextTranslationJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startTextTranslationJobOperationDeserializer$deserialize$1 = new StartTextTranslationJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startTextTranslationJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startTextTranslationJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C46267tO.TaskDescription) startTextTranslationJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C50400vN.copydefault(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startTextTranslationJobOperationDeserializer$deserialize$1.label = 1;
            if (C50400vN.KWHzl(dt, c58859zS, startTextTranslationJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C46267tO.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startTextTranslationJobOperationDeserializer$deserialize$1.L$0 = taskDescription;
        startTextTranslationJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startTextTranslationJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.AEQbTJ();
        return taskDescription.KWHzl();
    }
}
