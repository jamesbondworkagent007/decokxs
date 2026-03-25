package o;

import aws.sdk.kotlin.services.translate.serde.ListParallelDataOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C47753tw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C51599vq implements BB<C47753tw> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C47753tw> continuation) throws java.lang.Throwable {
        ListParallelDataOperationDeserializer$deserialize$1 listParallelDataOperationDeserializer$deserialize$1;
        C47753tw.Activity activity;
        byte[] bArr;
        if (continuation instanceof ListParallelDataOperationDeserializer$deserialize$1) {
            listParallelDataOperationDeserializer$deserialize$1 = (ListParallelDataOperationDeserializer$deserialize$1) continuation;
            int i = listParallelDataOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listParallelDataOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listParallelDataOperationDeserializer$deserialize$1 = new ListParallelDataOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listParallelDataOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listParallelDataOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C47753tw.Activity) listParallelDataOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C51546vp.KWHzl(activity, bArr);
            }
            activity.KWHzl();
            return activity.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listParallelDataOperationDeserializer$deserialize$1.label = 1;
            if (C51546vp.OLrzqt(dt, c58859zS, listParallelDataOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C47753tw.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listParallelDataOperationDeserializer$deserialize$1.L$0 = activity;
        listParallelDataOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listParallelDataOperationDeserializer$deserialize$1);
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
