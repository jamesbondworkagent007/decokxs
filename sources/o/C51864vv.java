package o;

import aws.sdk.kotlin.services.translate.serde.ListTerminologiesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C45888tA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C51864vv implements BB<C45888tA> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C45888tA> continuation) throws java.lang.Throwable {
        ListTerminologiesOperationDeserializer$deserialize$1 listTerminologiesOperationDeserializer$deserialize$1;
        C45888tA.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof ListTerminologiesOperationDeserializer$deserialize$1) {
            listTerminologiesOperationDeserializer$deserialize$1 = (ListTerminologiesOperationDeserializer$deserialize$1) continuation;
            int i = listTerminologiesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listTerminologiesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listTerminologiesOperationDeserializer$deserialize$1 = new ListTerminologiesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listTerminologiesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listTerminologiesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (C45888tA.ActionBar) listTerminologiesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C52076vz.AEQbTJ(actionBar, bArr);
            }
            actionBar.EZpvd();
            return actionBar.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listTerminologiesOperationDeserializer$deserialize$1.label = 1;
            if (C52076vz.OLrzqt(dt, c58859zS, listTerminologiesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new C45888tA.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listTerminologiesOperationDeserializer$deserialize$1.L$0 = actionBar;
        listTerminologiesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listTerminologiesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.EZpvd();
        return actionBar.copydefault();
    }
}
