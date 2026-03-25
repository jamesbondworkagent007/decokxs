package o;

import aws.sdk.kotlin.services.rekognition.serde.ListFacesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.K;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C25085iq implements BB<K> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super K> continuation) throws java.lang.Throwable {
        ListFacesOperationDeserializer$deserialize$1 listFacesOperationDeserializer$deserialize$1;
        K.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof ListFacesOperationDeserializer$deserialize$1) {
            listFacesOperationDeserializer$deserialize$1 = (ListFacesOperationDeserializer$deserialize$1) continuation;
            int i = listFacesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listFacesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listFacesOperationDeserializer$deserialize$1 = new ListFacesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listFacesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listFacesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (K.ActionBar) listFacesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C25191is.AEQbTJ(actionBar, bArr);
            }
            actionBar.KWHzl();
            return actionBar.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listFacesOperationDeserializer$deserialize$1.label = 1;
            if (C25191is.AEQbTJ(dt, c58859zS, listFacesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new K.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listFacesOperationDeserializer$deserialize$1.L$0 = actionBar;
        listFacesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listFacesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.KWHzl();
        return actionBar.OLrzqt();
    }
}
