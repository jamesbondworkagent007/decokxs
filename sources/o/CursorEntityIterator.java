package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ConfirmDeviceOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.BidirectionalTypeConverter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CursorEntityIterator implements BB<BidirectionalTypeConverter> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super BidirectionalTypeConverter> continuation) throws java.lang.Throwable {
        ConfirmDeviceOperationDeserializer$deserialize$1 confirmDeviceOperationDeserializer$deserialize$1;
        BidirectionalTypeConverter.Application application;
        byte[] bArr;
        if (continuation instanceof ConfirmDeviceOperationDeserializer$deserialize$1) {
            confirmDeviceOperationDeserializer$deserialize$1 = (ConfirmDeviceOperationDeserializer$deserialize$1) continuation;
            int i = confirmDeviceOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmDeviceOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmDeviceOperationDeserializer$deserialize$1 = new ConfirmDeviceOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = confirmDeviceOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = confirmDeviceOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (BidirectionalTypeConverter.Application) confirmDeviceOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                ContentValues.AEQbTJ(application, bArr);
            }
            application.AEQbTJ();
            return application.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            confirmDeviceOperationDeserializer$deserialize$1.label = 1;
            if (ContentValues.copydefault(dt, c58859zS, confirmDeviceOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new BidirectionalTypeConverter.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        confirmDeviceOperationDeserializer$deserialize$1.L$0 = application;
        confirmDeviceOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, confirmDeviceOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.AEQbTJ();
        return application.copydefault();
    }
}
