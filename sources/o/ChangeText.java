package o;

import aws.sdk.kotlin.services.comprehend.serde.ListEndpointsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.UpdateEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ChangeText implements BB<UpdateEngine> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UpdateEngine> continuation) throws java.lang.Throwable {
        ListEndpointsOperationDeserializer$deserialize$1 listEndpointsOperationDeserializer$deserialize$1;
        UpdateEngine.Application application;
        byte[] bArr;
        if (continuation instanceof ListEndpointsOperationDeserializer$deserialize$1) {
            listEndpointsOperationDeserializer$deserialize$1 = (ListEndpointsOperationDeserializer$deserialize$1) continuation;
            int i = listEndpointsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listEndpointsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listEndpointsOperationDeserializer$deserialize$1 = new ListEndpointsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listEndpointsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listEndpointsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (UpdateEngine.Application) listEndpointsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                CircularPropagation.AEQbTJ(application, bArr);
            }
            application.KWHzl();
            return application.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listEndpointsOperationDeserializer$deserialize$1.label = 1;
            if (CircularPropagation.EZpvd(dt, c58859zS, listEndpointsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new UpdateEngine.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listEndpointsOperationDeserializer$deserialize$1.L$0 = application;
        listEndpointsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listEndpointsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.KWHzl();
        return application.copydefault();
    }
}
