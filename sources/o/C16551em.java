package o;

import aws.sdk.kotlin.services.rekognition.serde.DeleteFacesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ForwardingListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C16551em implements BB<ForwardingListener> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ForwardingListener> continuation) throws java.lang.Throwable {
        DeleteFacesOperationDeserializer$deserialize$1 deleteFacesOperationDeserializer$deserialize$1;
        ForwardingListener.Activity activity;
        byte[] bArr;
        if (continuation instanceof DeleteFacesOperationDeserializer$deserialize$1) {
            deleteFacesOperationDeserializer$deserialize$1 = (DeleteFacesOperationDeserializer$deserialize$1) continuation;
            int i = deleteFacesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteFacesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteFacesOperationDeserializer$deserialize$1 = new DeleteFacesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = deleteFacesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = deleteFacesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (ForwardingListener.Activity) deleteFacesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C16763eq.copydefault(activity, bArr);
            }
            activity.OLrzqt();
            return activity.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            deleteFacesOperationDeserializer$deserialize$1.label = 1;
            if (C16763eq.OLrzqt(dt, c58859zS, deleteFacesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new ForwardingListener.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        deleteFacesOperationDeserializer$deserialize$1.L$0 = activity;
        deleteFacesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, deleteFacesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.OLrzqt();
        return activity.copydefault();
    }
}
