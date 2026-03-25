package o;

import aws.sdk.kotlin.services.textract.serde.GetAdapterVersionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C33981nN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C41292qo implements BB<C33981nN> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C33981nN> continuation) throws java.lang.Throwable {
        GetAdapterVersionOperationDeserializer$deserialize$1 getAdapterVersionOperationDeserializer$deserialize$1;
        C33981nN.Activity activity;
        byte[] bArr;
        if (continuation instanceof GetAdapterVersionOperationDeserializer$deserialize$1) {
            getAdapterVersionOperationDeserializer$deserialize$1 = (GetAdapterVersionOperationDeserializer$deserialize$1) continuation;
            int i = getAdapterVersionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAdapterVersionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getAdapterVersionOperationDeserializer$deserialize$1 = new GetAdapterVersionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getAdapterVersionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getAdapterVersionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C33981nN.Activity) getAdapterVersionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C41398qq.KWHzl(activity, bArr);
            }
            activity.copydefault();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getAdapterVersionOperationDeserializer$deserialize$1.label = 1;
            if (C41398qq.AEQbTJ(dt, c58859zS, getAdapterVersionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C33981nN.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getAdapterVersionOperationDeserializer$deserialize$1.L$0 = activity;
        getAdapterVersionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getAdapterVersionOperationDeserializer$deserialize$1);
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
