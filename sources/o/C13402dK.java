package o;

import aws.sdk.kotlin.services.rekognition.serde.CreateProjectVersionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.CursorAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13402dK implements BB<CursorAdapter> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CursorAdapter> continuation) throws java.lang.Throwable {
        CreateProjectVersionOperationDeserializer$deserialize$1 createProjectVersionOperationDeserializer$deserialize$1;
        CursorAdapter.Application application;
        byte[] bArr;
        if (continuation instanceof CreateProjectVersionOperationDeserializer$deserialize$1) {
            createProjectVersionOperationDeserializer$deserialize$1 = (CreateProjectVersionOperationDeserializer$deserialize$1) continuation;
            int i = createProjectVersionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createProjectVersionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createProjectVersionOperationDeserializer$deserialize$1 = new CreateProjectVersionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createProjectVersionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createProjectVersionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (CursorAdapter.Application) createProjectVersionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C13375dJ.OLrzqt(application, bArr);
            }
            application.EZpvd();
            return application.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createProjectVersionOperationDeserializer$deserialize$1.label = 1;
            if (C13375dJ.copydefault(dt, c58859zS, createProjectVersionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new CursorAdapter.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createProjectVersionOperationDeserializer$deserialize$1.L$0 = application;
        createProjectVersionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createProjectVersionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.EZpvd();
        return application.KWHzl();
    }
}
