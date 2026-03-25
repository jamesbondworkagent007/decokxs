package o;

import aws.sdk.kotlin.services.textract.serde.GetLendingAnalysisOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C36443ob;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C39902qC implements BB<C36443ob> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C36443ob> continuation) throws java.lang.Throwable {
        GetLendingAnalysisOperationDeserializer$deserialize$1 getLendingAnalysisOperationDeserializer$deserialize$1;
        C36443ob.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof GetLendingAnalysisOperationDeserializer$deserialize$1) {
            getLendingAnalysisOperationDeserializer$deserialize$1 = (GetLendingAnalysisOperationDeserializer$deserialize$1) continuation;
            int i = getLendingAnalysisOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLendingAnalysisOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getLendingAnalysisOperationDeserializer$deserialize$1 = new GetLendingAnalysisOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getLendingAnalysisOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getLendingAnalysisOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C36443ob.TaskDescription) getLendingAnalysisOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C40145qL.copydefault(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getLendingAnalysisOperationDeserializer$deserialize$1.label = 1;
            if (C40145qL.OLrzqt(dt, c58859zS, getLendingAnalysisOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C36443ob.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getLendingAnalysisOperationDeserializer$deserialize$1.L$0 = taskDescription;
        getLendingAnalysisOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getLendingAnalysisOperationDeserializer$deserialize$1);
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
