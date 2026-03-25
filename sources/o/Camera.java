package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ListGroupsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.FragmentBreadCrumbs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Camera implements BB<FragmentBreadCrumbs> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super FragmentBreadCrumbs> continuation) throws java.lang.Throwable {
        ListGroupsOperationDeserializer$deserialize$1 listGroupsOperationDeserializer$deserialize$1;
        FragmentBreadCrumbs.Application application;
        byte[] bArr;
        if (continuation instanceof ListGroupsOperationDeserializer$deserialize$1) {
            listGroupsOperationDeserializer$deserialize$1 = (ListGroupsOperationDeserializer$deserialize$1) continuation;
            int i = listGroupsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listGroupsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listGroupsOperationDeserializer$deserialize$1 = new ListGroupsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listGroupsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listGroupsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (FragmentBreadCrumbs.Application) listGroupsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                CameraInfo.KWHzl(application, bArr);
            }
            application.AEQbTJ();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listGroupsOperationDeserializer$deserialize$1.label = 1;
            if (CameraInfo.EZpvd(dt, c58859zS, listGroupsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new FragmentBreadCrumbs.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listGroupsOperationDeserializer$deserialize$1.L$0 = application;
        listGroupsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listGroupsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.AEQbTJ();
        return application.EZpvd();
    }
}
