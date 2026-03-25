package o;

import aws.sdk.kotlin.services.polly.serde.DescribeVoicesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AccessibilityManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AutofillPopupWindow implements BB<AccessibilityManager> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AccessibilityManager> continuation) throws java.lang.Throwable {
        DescribeVoicesOperationDeserializer$deserialize$1 describeVoicesOperationDeserializer$deserialize$1;
        AccessibilityManager.Activity activity;
        byte[] bArr;
        if (continuation instanceof DescribeVoicesOperationDeserializer$deserialize$1) {
            describeVoicesOperationDeserializer$deserialize$1 = (DescribeVoicesOperationDeserializer$deserialize$1) continuation;
            int i = describeVoicesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeVoicesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeVoicesOperationDeserializer$deserialize$1 = new DescribeVoicesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeVoicesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeVoicesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (AccessibilityManager.Activity) describeVoicesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                BaseInputConnection.AEQbTJ(activity, bArr);
            }
            activity.copydefault();
            return activity.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeVoicesOperationDeserializer$deserialize$1.label = 1;
            if (BaseInputConnection.OLrzqt(dt, c58859zS, describeVoicesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new AccessibilityManager.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeVoicesOperationDeserializer$deserialize$1.L$0 = activity;
        describeVoicesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeVoicesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.copydefault();
        return activity.OLrzqt();
    }
}
