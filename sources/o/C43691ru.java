package o;

import aws.sdk.kotlin.services.textract.serde.ListAdapterVersionsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C37026om;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C43691ru implements BB<C37026om> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C37026om> continuation) throws java.lang.Throwable {
        ListAdapterVersionsOperationDeserializer$deserialize$1 listAdapterVersionsOperationDeserializer$deserialize$1;
        C37026om.Activity activity;
        byte[] bArr;
        if (continuation instanceof ListAdapterVersionsOperationDeserializer$deserialize$1) {
            listAdapterVersionsOperationDeserializer$deserialize$1 = (ListAdapterVersionsOperationDeserializer$deserialize$1) continuation;
            int i = listAdapterVersionsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listAdapterVersionsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listAdapterVersionsOperationDeserializer$deserialize$1 = new ListAdapterVersionsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listAdapterVersionsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listAdapterVersionsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C37026om.Activity) listAdapterVersionsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C43532rr.KWHzl(activity, bArr);
            }
            activity.copydefault();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listAdapterVersionsOperationDeserializer$deserialize$1.label = 1;
            if (C43532rr.KWHzl(dt, c58859zS, listAdapterVersionsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C37026om.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listAdapterVersionsOperationDeserializer$deserialize$1.L$0 = activity;
        listAdapterVersionsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listAdapterVersionsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.copydefault();
        return activity.KWHzl();
    }
}
