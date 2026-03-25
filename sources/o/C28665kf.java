package o;

import aws.sdk.kotlin.services.rekognition.serde.SearchUsersOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C6635aT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28665kf implements BB<C6635aT> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C6635aT> continuation) throws java.lang.Throwable {
        SearchUsersOperationDeserializer$deserialize$1 searchUsersOperationDeserializer$deserialize$1;
        C6635aT.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof SearchUsersOperationDeserializer$deserialize$1) {
            searchUsersOperationDeserializer$deserialize$1 = (SearchUsersOperationDeserializer$deserialize$1) continuation;
            int i = searchUsersOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchUsersOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                searchUsersOperationDeserializer$deserialize$1 = new SearchUsersOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = searchUsersOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = searchUsersOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (C6635aT.StateListAnimator) searchUsersOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C28771kh.KWHzl(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            searchUsersOperationDeserializer$deserialize$1.label = 1;
            if (C28771kh.copydefault(dt, c58859zS, searchUsersOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new C6635aT.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        searchUsersOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        searchUsersOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, searchUsersOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.copydefault();
    }
}
