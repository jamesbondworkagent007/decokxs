package o;

import aws.sdk.kotlin.services.rekognition.serde.ListDatasetLabelsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.I;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C24715ij implements BB<I> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super I> continuation) throws java.lang.Throwable {
        ListDatasetLabelsOperationDeserializer$deserialize$1 listDatasetLabelsOperationDeserializer$deserialize$1;
        I.Application application;
        byte[] bArr;
        if (continuation instanceof ListDatasetLabelsOperationDeserializer$deserialize$1) {
            listDatasetLabelsOperationDeserializer$deserialize$1 = (ListDatasetLabelsOperationDeserializer$deserialize$1) continuation;
            int i = listDatasetLabelsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listDatasetLabelsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listDatasetLabelsOperationDeserializer$deserialize$1 = new ListDatasetLabelsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listDatasetLabelsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listDatasetLabelsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (I.Application) listDatasetLabelsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C24874im.copydefault(application, bArr);
            }
            application.OLrzqt();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listDatasetLabelsOperationDeserializer$deserialize$1.label = 1;
            if (C24874im.copydefault(dt, c58859zS, listDatasetLabelsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new I.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listDatasetLabelsOperationDeserializer$deserialize$1.L$0 = application;
        listDatasetLabelsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listDatasetLabelsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.OLrzqt();
        return application.EZpvd();
    }
}
