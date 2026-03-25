package o;

import aws.sdk.kotlin.services.rekognition.serde.DeleteCollectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Editor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C16286eh implements BB<Editor> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Editor> continuation) throws java.lang.Throwable {
        DeleteCollectionOperationDeserializer$deserialize$1 deleteCollectionOperationDeserializer$deserialize$1;
        Editor.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof DeleteCollectionOperationDeserializer$deserialize$1) {
            deleteCollectionOperationDeserializer$deserialize$1 = (DeleteCollectionOperationDeserializer$deserialize$1) continuation;
            int i = deleteCollectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteCollectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteCollectionOperationDeserializer$deserialize$1 = new DeleteCollectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = deleteCollectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = deleteCollectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (Editor.ActionBar) deleteCollectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C16339ei.copydefault(actionBar, bArr);
            }
            actionBar.OLrzqt();
            return actionBar.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            deleteCollectionOperationDeserializer$deserialize$1.label = 1;
            if (C16339ei.EZpvd(dt, c58859zS, deleteCollectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new Editor.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        deleteCollectionOperationDeserializer$deserialize$1.L$0 = actionBar;
        deleteCollectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, deleteCollectionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.OLrzqt();
        return actionBar.KWHzl();
    }
}
