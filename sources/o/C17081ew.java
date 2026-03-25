package o;

import aws.sdk.kotlin.services.rekognition.serde.DeleteProjectPolicyOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.FastScroller;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C17081ew implements BB<FastScroller> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super FastScroller> continuation) throws java.lang.Throwable {
        DeleteProjectPolicyOperationDeserializer$deserialize$1 deleteProjectPolicyOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteProjectPolicyOperationDeserializer$deserialize$1) {
            deleteProjectPolicyOperationDeserializer$deserialize$1 = (DeleteProjectPolicyOperationDeserializer$deserialize$1) continuation;
            int i = deleteProjectPolicyOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteProjectPolicyOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteProjectPolicyOperationDeserializer$deserialize$1 = new DeleteProjectPolicyOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteProjectPolicyOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteProjectPolicyOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteProjectPolicyOperationDeserializer$deserialize$1.label = 1;
                if (C17187ey.KWHzl(dt, c58859zS, deleteProjectPolicyOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                FastScroller.ActionBar actionBar = new FastScroller.ActionBar();
                actionBar.copydefault();
                return actionBar.EZpvd();
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
