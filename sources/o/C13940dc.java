package o;

import aws.sdk.kotlin.services.rekognition.serde.CompareFacesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AbsSeekBar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13940dc implements BB<AbsSeekBar> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AbsSeekBar> continuation) throws java.lang.Throwable {
        CompareFacesOperationDeserializer$deserialize$1 compareFacesOperationDeserializer$deserialize$1;
        AbsSeekBar.Application application;
        byte[] bArr;
        if (continuation instanceof CompareFacesOperationDeserializer$deserialize$1) {
            compareFacesOperationDeserializer$deserialize$1 = (CompareFacesOperationDeserializer$deserialize$1) continuation;
            int i = compareFacesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                compareFacesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                compareFacesOperationDeserializer$deserialize$1 = new CompareFacesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = compareFacesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = compareFacesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (AbsSeekBar.Application) compareFacesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C13834da.copydefault(application, bArr);
            }
            application.EZpvd();
            return application.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            compareFacesOperationDeserializer$deserialize$1.label = 1;
            if (C13834da.AEQbTJ(dt, c58859zS, compareFacesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new AbsSeekBar.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        compareFacesOperationDeserializer$deserialize$1.L$0 = application;
        compareFacesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, compareFacesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.EZpvd();
        return application.AEQbTJ();
    }
}
