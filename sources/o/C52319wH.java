package o;

import aws.sdk.kotlin.services.translate.serde.UpdateParallelDataOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C49041uh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C52319wH implements BB<C49041uh> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C49041uh> continuation) throws java.lang.Throwable {
        UpdateParallelDataOperationDeserializer$deserialize$1 updateParallelDataOperationDeserializer$deserialize$1;
        C49041uh.Application application;
        byte[] bArr;
        if (continuation instanceof UpdateParallelDataOperationDeserializer$deserialize$1) {
            updateParallelDataOperationDeserializer$deserialize$1 = (UpdateParallelDataOperationDeserializer$deserialize$1) continuation;
            int i = updateParallelDataOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateParallelDataOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                updateParallelDataOperationDeserializer$deserialize$1 = new UpdateParallelDataOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = updateParallelDataOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = updateParallelDataOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (C49041uh.Application) updateParallelDataOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C52265wF.OLrzqt(application, bArr);
            }
            application.KWHzl();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            updateParallelDataOperationDeserializer$deserialize$1.label = 1;
            if (C52265wF.copydefault(dt, c58859zS, updateParallelDataOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new C49041uh.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        updateParallelDataOperationDeserializer$deserialize$1.L$0 = application;
        updateParallelDataOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, updateParallelDataOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.KWHzl();
        return application.EZpvd();
    }
}
