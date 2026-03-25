package o;

import aws.sdk.kotlin.services.rekognition.serde.ListDatasetEntriesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.H;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.if, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C24503if implements BB<H> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super H> continuation) throws java.lang.Throwable {
        ListDatasetEntriesOperationDeserializer$deserialize$1 listDatasetEntriesOperationDeserializer$deserialize$1;
        H.Application application;
        byte[] bArr;
        if (continuation instanceof ListDatasetEntriesOperationDeserializer$deserialize$1) {
            listDatasetEntriesOperationDeserializer$deserialize$1 = (ListDatasetEntriesOperationDeserializer$deserialize$1) continuation;
            int i = listDatasetEntriesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listDatasetEntriesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listDatasetEntriesOperationDeserializer$deserialize$1 = new ListDatasetEntriesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listDatasetEntriesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listDatasetEntriesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (H.Application) listDatasetEntriesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C24450ie.copydefault(application, bArr);
            }
            application.AEQbTJ();
            return application.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listDatasetEntriesOperationDeserializer$deserialize$1.label = 1;
            if (C24450ie.KWHzl(dt, c58859zS, listDatasetEntriesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new H.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listDatasetEntriesOperationDeserializer$deserialize$1.L$0 = application;
        listDatasetEntriesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listDatasetEntriesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.AEQbTJ();
        return application.KWHzl();
    }
}
