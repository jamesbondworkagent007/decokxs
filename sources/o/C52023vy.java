package o;

import aws.sdk.kotlin.services.translate.serde.ListTextTranslationJobsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C45970tD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C52023vy implements BB<C45970tD> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C45970tD> continuation) throws java.lang.Throwable {
        ListTextTranslationJobsOperationDeserializer$deserialize$1 listTextTranslationJobsOperationDeserializer$deserialize$1;
        C45970tD.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof ListTextTranslationJobsOperationDeserializer$deserialize$1) {
            listTextTranslationJobsOperationDeserializer$deserialize$1 = (ListTextTranslationJobsOperationDeserializer$deserialize$1) continuation;
            int i = listTextTranslationJobsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listTextTranslationJobsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listTextTranslationJobsOperationDeserializer$deserialize$1 = new ListTextTranslationJobsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listTextTranslationJobsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listTextTranslationJobsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C45970tD.TaskDescription) listTextTranslationJobsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C50049vA.AEQbTJ(taskDescription, bArr);
            }
            taskDescription.EZpvd();
            return taskDescription.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listTextTranslationJobsOperationDeserializer$deserialize$1.label = 1;
            if (C50049vA.AEQbTJ(dt, c58859zS, listTextTranslationJobsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C45970tD.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listTextTranslationJobsOperationDeserializer$deserialize$1.L$0 = taskDescription;
        listTextTranslationJobsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listTextTranslationJobsOperationDeserializer$deserialize$1);
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
