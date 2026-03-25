package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectFacesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.MenuItemHoverListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C18685fn implements BB<MenuItemHoverListener> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MenuItemHoverListener> continuation) throws java.lang.Throwable {
        DetectFacesOperationDeserializer$deserialize$1 detectFacesOperationDeserializer$deserialize$1;
        MenuItemHoverListener.Application application;
        byte[] bArr;
        if (continuation instanceof DetectFacesOperationDeserializer$deserialize$1) {
            detectFacesOperationDeserializer$deserialize$1 = (DetectFacesOperationDeserializer$deserialize$1) continuation;
            int i = detectFacesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                detectFacesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                detectFacesOperationDeserializer$deserialize$1 = new DetectFacesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = detectFacesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = detectFacesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (MenuItemHoverListener.Application) detectFacesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C18632fm.AEQbTJ(application, bArr);
            }
            application.OLrzqt();
            return application.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            detectFacesOperationDeserializer$deserialize$1.label = 1;
            if (C18632fm.EZpvd(dt, c58859zS, detectFacesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new MenuItemHoverListener.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        detectFacesOperationDeserializer$deserialize$1.L$0 = application;
        detectFacesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, detectFacesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.OLrzqt();
        return application.KWHzl();
    }
}
