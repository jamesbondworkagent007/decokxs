package o;

import aws.sdk.kotlin.services.rekognition.serde.ListCollectionsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.B;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C22130hZ implements BB<B> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super B> continuation) throws java.lang.Throwable {
        ListCollectionsOperationDeserializer$deserialize$1 listCollectionsOperationDeserializer$deserialize$1;
        B.Activity activity;
        byte[] bArr;
        if (continuation instanceof ListCollectionsOperationDeserializer$deserialize$1) {
            listCollectionsOperationDeserializer$deserialize$1 = (ListCollectionsOperationDeserializer$deserialize$1) continuation;
            int i = listCollectionsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listCollectionsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listCollectionsOperationDeserializer$deserialize$1 = new ListCollectionsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listCollectionsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listCollectionsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (B.Activity) listCollectionsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C24662ii.AEQbTJ(activity, bArr);
            }
            activity.KWHzl();
            return activity.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listCollectionsOperationDeserializer$deserialize$1.label = 1;
            if (C24662ii.EZpvd(dt, c58859zS, listCollectionsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new B.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listCollectionsOperationDeserializer$deserialize$1.L$0 = activity;
        listCollectionsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listCollectionsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.KWHzl();
        return activity.OLrzqt();
    }
}
