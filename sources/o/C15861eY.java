package o;

import aws.sdk.kotlin.services.rekognition.serde.DescribeProjectsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Magnifier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C15861eY implements BB<Magnifier> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Magnifier> continuation) throws java.lang.Throwable {
        DescribeProjectsOperationDeserializer$deserialize$1 describeProjectsOperationDeserializer$deserialize$1;
        Magnifier.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof DescribeProjectsOperationDeserializer$deserialize$1) {
            describeProjectsOperationDeserializer$deserialize$1 = (DescribeProjectsOperationDeserializer$deserialize$1) continuation;
            int i = describeProjectsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeProjectsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeProjectsOperationDeserializer$deserialize$1 = new DescribeProjectsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeProjectsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeProjectsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (Magnifier.TaskDescription) describeProjectsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C18049fb.copydefault(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeProjectsOperationDeserializer$deserialize$1.label = 1;
            if (C18049fb.EZpvd(dt, c58859zS, describeProjectsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new Magnifier.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeProjectsOperationDeserializer$deserialize$1.L$0 = taskDescription;
        describeProjectsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeProjectsOperationDeserializer$deserialize$1);
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
