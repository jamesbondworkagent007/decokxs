package o;

import aws.sdk.kotlin.services.textract.serde.GetAdapterOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C34008nO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C41133ql implements BB<C34008nO> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C34008nO> continuation) throws java.lang.Throwable {
        GetAdapterOperationDeserializer$deserialize$1 getAdapterOperationDeserializer$deserialize$1;
        C34008nO.Application application;
        byte[] bArr;
        if (continuation instanceof GetAdapterOperationDeserializer$deserialize$1) {
            getAdapterOperationDeserializer$deserialize$1 = (GetAdapterOperationDeserializer$deserialize$1) continuation;
            int i = getAdapterOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAdapterOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getAdapterOperationDeserializer$deserialize$1 = new GetAdapterOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getAdapterOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getAdapterOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (C34008nO.Application) getAdapterOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C41239qn.OLrzqt(application, bArr);
            }
            application.EZpvd();
            return application.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getAdapterOperationDeserializer$deserialize$1.label = 1;
            if (C41239qn.copydefault(dt, c58859zS, getAdapterOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new C34008nO.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getAdapterOperationDeserializer$deserialize$1.L$0 = application;
        getAdapterOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getAdapterOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.EZpvd();
        return application.copydefault();
    }
}
