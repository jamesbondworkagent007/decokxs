package o;

import aws.sdk.kotlin.services.rekognition.serde.SearchFacesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C6688aU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28453kb implements BB<C6688aU> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C6688aU> continuation) throws java.lang.Throwable {
        SearchFacesOperationDeserializer$deserialize$1 searchFacesOperationDeserializer$deserialize$1;
        C6688aU.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof SearchFacesOperationDeserializer$deserialize$1) {
            searchFacesOperationDeserializer$deserialize$1 = (SearchFacesOperationDeserializer$deserialize$1) continuation;
            int i = searchFacesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchFacesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                searchFacesOperationDeserializer$deserialize$1 = new SearchFacesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = searchFacesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = searchFacesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (C6688aU.StateListAnimator) searchFacesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C28400ka.AEQbTJ(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            searchFacesOperationDeserializer$deserialize$1.label = 1;
            if (C28400ka.AEQbTJ(dt, c58859zS, searchFacesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new C6688aU.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        searchFacesOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        searchFacesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, searchFacesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.EZpvd();
    }
}
