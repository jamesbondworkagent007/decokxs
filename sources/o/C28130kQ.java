package o;

import aws.sdk.kotlin.services.rekognition.serde.StartMediaAnalysisJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C10470bp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28130kQ implements BB<C10470bp> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C10470bp> continuation) throws java.lang.Throwable {
        StartMediaAnalysisJobOperationDeserializer$deserialize$1 startMediaAnalysisJobOperationDeserializer$deserialize$1;
        C10470bp.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof StartMediaAnalysisJobOperationDeserializer$deserialize$1) {
            startMediaAnalysisJobOperationDeserializer$deserialize$1 = (StartMediaAnalysisJobOperationDeserializer$deserialize$1) continuation;
            int i = startMediaAnalysisJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startMediaAnalysisJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startMediaAnalysisJobOperationDeserializer$deserialize$1 = new StartMediaAnalysisJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startMediaAnalysisJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startMediaAnalysisJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C10470bp.TaskDescription) startMediaAnalysisJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C28103kP.AEQbTJ(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startMediaAnalysisJobOperationDeserializer$deserialize$1.label = 1;
            if (C28103kP.AEQbTJ(dt, c58859zS, startMediaAnalysisJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C10470bp.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startMediaAnalysisJobOperationDeserializer$deserialize$1.L$0 = taskDescription;
        startMediaAnalysisJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startMediaAnalysisJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.AEQbTJ();
        return taskDescription.OLrzqt();
    }
}
