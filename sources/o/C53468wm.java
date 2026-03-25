package o;

import aws.sdk.kotlin.services.translate.serde.TranslateDocumentOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C48670ua;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C53468wm implements BB<C48670ua> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C48670ua> continuation) throws java.lang.Throwable {
        TranslateDocumentOperationDeserializer$deserialize$1 translateDocumentOperationDeserializer$deserialize$1;
        C48670ua.Activity activity;
        byte[] bArr;
        if (continuation instanceof TranslateDocumentOperationDeserializer$deserialize$1) {
            translateDocumentOperationDeserializer$deserialize$1 = (TranslateDocumentOperationDeserializer$deserialize$1) continuation;
            int i = translateDocumentOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                translateDocumentOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                translateDocumentOperationDeserializer$deserialize$1 = new TranslateDocumentOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = translateDocumentOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = translateDocumentOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C48670ua.Activity) translateDocumentOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C53415wl.AEQbTJ(activity, bArr);
            }
            activity.EZpvd();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            translateDocumentOperationDeserializer$deserialize$1.label = 1;
            if (C53415wl.KWHzl(dt, c58859zS, translateDocumentOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C48670ua.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        translateDocumentOperationDeserializer$deserialize$1.L$0 = activity;
        translateDocumentOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, translateDocumentOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.EZpvd();
        return activity.KWHzl();
    }
}
