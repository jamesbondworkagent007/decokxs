package o;

import aws.sdk.kotlin.services.textract.serde.StartExpenseAnalysisOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C35985oL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C45028si implements BB<C35985oL> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C35985oL> continuation) throws java.lang.Throwable {
        StartExpenseAnalysisOperationDeserializer$deserialize$1 startExpenseAnalysisOperationDeserializer$deserialize$1;
        C35985oL.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof StartExpenseAnalysisOperationDeserializer$deserialize$1) {
            startExpenseAnalysisOperationDeserializer$deserialize$1 = (StartExpenseAnalysisOperationDeserializer$deserialize$1) continuation;
            int i = startExpenseAnalysisOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startExpenseAnalysisOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startExpenseAnalysisOperationDeserializer$deserialize$1 = new StartExpenseAnalysisOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startExpenseAnalysisOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startExpenseAnalysisOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C35985oL.TaskDescription) startExpenseAnalysisOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C44975sh.OLrzqt(taskDescription, bArr);
            }
            taskDescription.EZpvd();
            return taskDescription.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startExpenseAnalysisOperationDeserializer$deserialize$1.label = 1;
            if (C44975sh.EZpvd(dt, c58859zS, startExpenseAnalysisOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C35985oL.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startExpenseAnalysisOperationDeserializer$deserialize$1.L$0 = taskDescription;
        startExpenseAnalysisOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startExpenseAnalysisOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.EZpvd();
        return taskDescription.OLrzqt();
    }
}
