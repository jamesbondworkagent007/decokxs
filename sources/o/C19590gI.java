package o;

import aws.sdk.kotlin.services.rekognition.serde.GetFaceSearchOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.WrapperListAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C19590gI implements BB<WrapperListAdapter> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super WrapperListAdapter> continuation) throws java.lang.Throwable {
        GetFaceSearchOperationDeserializer$deserialize$1 getFaceSearchOperationDeserializer$deserialize$1;
        WrapperListAdapter.Application application;
        byte[] bArr;
        if (continuation instanceof GetFaceSearchOperationDeserializer$deserialize$1) {
            getFaceSearchOperationDeserializer$deserialize$1 = (GetFaceSearchOperationDeserializer$deserialize$1) continuation;
            int i = getFaceSearchOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getFaceSearchOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getFaceSearchOperationDeserializer$deserialize$1 = new GetFaceSearchOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getFaceSearchOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getFaceSearchOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (WrapperListAdapter.Application) getFaceSearchOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C19617gJ.AEQbTJ(application, bArr);
            }
            application.copydefault();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getFaceSearchOperationDeserializer$deserialize$1.label = 1;
            if (C19617gJ.OLrzqt(dt, c58859zS, getFaceSearchOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new WrapperListAdapter.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getFaceSearchOperationDeserializer$deserialize$1.L$0 = application;
        getFaceSearchOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getFaceSearchOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.copydefault();
        return application.EZpvd();
    }
}
