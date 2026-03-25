package o;

import aws.sdk.kotlin.services.rekognition.serde.UntagResourceOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C12760ct;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C32940mn implements BB<C12760ct> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C12760ct> continuation) throws java.lang.Throwable {
        UntagResourceOperationDeserializer$deserialize$1 untagResourceOperationDeserializer$deserialize$1;
        if (continuation instanceof UntagResourceOperationDeserializer$deserialize$1) {
            untagResourceOperationDeserializer$deserialize$1 = (UntagResourceOperationDeserializer$deserialize$1) continuation;
            int i = untagResourceOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                untagResourceOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                untagResourceOperationDeserializer$deserialize$1 = new UntagResourceOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = untagResourceOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = untagResourceOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                untagResourceOperationDeserializer$deserialize$1.label = 1;
                if (C32993mo.AEQbTJ(dt, c58859zS, untagResourceOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C12760ct.ActionBar actionBar = new C12760ct.ActionBar();
                actionBar.copydefault();
                return actionBar.AEQbTJ();
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
