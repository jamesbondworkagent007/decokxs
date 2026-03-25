package o;

import aws.sdk.kotlin.services.textract.serde.AnalyzeIDOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C34701nh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C39423ps implements BB<C34701nh> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C34701nh> continuation) throws java.lang.Throwable {
        AnalyzeIDOperationDeserializer$deserialize$1 analyzeIDOperationDeserializer$deserialize$1;
        C34701nh.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof AnalyzeIDOperationDeserializer$deserialize$1) {
            analyzeIDOperationDeserializer$deserialize$1 = (AnalyzeIDOperationDeserializer$deserialize$1) continuation;
            int i = analyzeIDOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                analyzeIDOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                analyzeIDOperationDeserializer$deserialize$1 = new AnalyzeIDOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = analyzeIDOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = analyzeIDOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C34701nh.TaskDescription) analyzeIDOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C39266pp.OLrzqt(taskDescription, bArr);
            }
            taskDescription.EZpvd();
            return taskDescription.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            analyzeIDOperationDeserializer$deserialize$1.label = 1;
            if (C39266pp.OLrzqt(dt, c58859zS, analyzeIDOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C34701nh.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        analyzeIDOperationDeserializer$deserialize$1.L$0 = taskDescription;
        analyzeIDOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, analyzeIDOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.EZpvd();
        return taskDescription.AEQbTJ();
    }
}
