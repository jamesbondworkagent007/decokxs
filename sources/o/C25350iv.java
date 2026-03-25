package o;

import aws.sdk.kotlin.services.rekognition.serde.ListProjectPoliciesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.N;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C25350iv implements BB<N> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super N> continuation) throws java.lang.Throwable {
        ListProjectPoliciesOperationDeserializer$deserialize$1 listProjectPoliciesOperationDeserializer$deserialize$1;
        N.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof ListProjectPoliciesOperationDeserializer$deserialize$1) {
            listProjectPoliciesOperationDeserializer$deserialize$1 = (ListProjectPoliciesOperationDeserializer$deserialize$1) continuation;
            int i = listProjectPoliciesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listProjectPoliciesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listProjectPoliciesOperationDeserializer$deserialize$1 = new ListProjectPoliciesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listProjectPoliciesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listProjectPoliciesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (N.ActionBar) listProjectPoliciesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C23536iA.EZpvd(actionBar, bArr);
            }
            actionBar.OLrzqt();
            return actionBar.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listProjectPoliciesOperationDeserializer$deserialize$1.label = 1;
            if (C23536iA.copydefault(dt, c58859zS, listProjectPoliciesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new N.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listProjectPoliciesOperationDeserializer$deserialize$1.L$0 = actionBar;
        listProjectPoliciesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listProjectPoliciesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.OLrzqt();
        return actionBar.copydefault();
    }
}
