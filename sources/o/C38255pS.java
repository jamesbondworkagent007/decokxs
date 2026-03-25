package o;

import aws.sdk.kotlin.services.textract.serde.DeleteAdapterVersionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C35528nx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38255pS implements BB<C35528nx> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C35528nx> continuation) throws java.lang.Throwable {
        DeleteAdapterVersionOperationDeserializer$deserialize$1 deleteAdapterVersionOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteAdapterVersionOperationDeserializer$deserialize$1) {
            deleteAdapterVersionOperationDeserializer$deserialize$1 = (DeleteAdapterVersionOperationDeserializer$deserialize$1) continuation;
            int i = deleteAdapterVersionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteAdapterVersionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteAdapterVersionOperationDeserializer$deserialize$1 = new DeleteAdapterVersionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteAdapterVersionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteAdapterVersionOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteAdapterVersionOperationDeserializer$deserialize$1.label = 1;
                if (C38148pO.AEQbTJ(dt, c58859zS, deleteAdapterVersionOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C35528nx.Activity activity = new C35528nx.Activity();
                activity.copydefault();
                return activity.KWHzl();
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
