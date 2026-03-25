package o;

import aws.sdk.kotlin.services.rekognition.serde.SearchUsersByImageOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C6845aX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28506kc implements BB<C6845aX> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C6845aX> continuation) throws java.lang.Throwable {
        SearchUsersByImageOperationDeserializer$deserialize$1 searchUsersByImageOperationDeserializer$deserialize$1;
        C6845aX.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof SearchUsersByImageOperationDeserializer$deserialize$1) {
            searchUsersByImageOperationDeserializer$deserialize$1 = (SearchUsersByImageOperationDeserializer$deserialize$1) continuation;
            int i = searchUsersByImageOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchUsersByImageOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                searchUsersByImageOperationDeserializer$deserialize$1 = new SearchUsersByImageOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = searchUsersByImageOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = searchUsersByImageOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (C6845aX.ActionBar) searchUsersByImageOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C28877kj.EZpvd(actionBar, bArr);
            }
            actionBar.KWHzl();
            return actionBar.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            searchUsersByImageOperationDeserializer$deserialize$1.label = 1;
            if (C28877kj.EZpvd(dt, c58859zS, searchUsersByImageOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new C6845aX.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        searchUsersByImageOperationDeserializer$deserialize$1.L$0 = actionBar;
        searchUsersByImageOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, searchUsersByImageOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.KWHzl();
        return actionBar.EZpvd();
    }
}
