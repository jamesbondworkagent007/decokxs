package o;

import aws.sdk.kotlin.services.rekognition.serde.GetPersonTrackingOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C8296b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C20022gY implements BB<C8296b> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C8296b> continuation) throws java.lang.Throwable {
        GetPersonTrackingOperationDeserializer$deserialize$1 getPersonTrackingOperationDeserializer$deserialize$1;
        C8296b.Application application;
        byte[] bArr;
        if (continuation instanceof GetPersonTrackingOperationDeserializer$deserialize$1) {
            getPersonTrackingOperationDeserializer$deserialize$1 = (GetPersonTrackingOperationDeserializer$deserialize$1) continuation;
            int i = getPersonTrackingOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPersonTrackingOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getPersonTrackingOperationDeserializer$deserialize$1 = new GetPersonTrackingOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getPersonTrackingOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getPersonTrackingOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (C8296b.Application) getPersonTrackingOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C19968gW.OLrzqt(application, bArr);
            }
            application.KWHzl();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getPersonTrackingOperationDeserializer$deserialize$1.label = 1;
            if (C19968gW.copydefault(dt, c58859zS, getPersonTrackingOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new C8296b.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getPersonTrackingOperationDeserializer$deserialize$1.L$0 = application;
        getPersonTrackingOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getPersonTrackingOperationDeserializer$deserialize$1);
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
