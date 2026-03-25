package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DescribeUserPoolOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C5391Px;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RuntimePermissionPresentationInfo implements BB<C5391Px> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C5391Px> continuation) throws java.lang.Throwable {
        DescribeUserPoolOperationDeserializer$deserialize$1 describeUserPoolOperationDeserializer$deserialize$1;
        C5391Px.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof DescribeUserPoolOperationDeserializer$deserialize$1) {
            describeUserPoolOperationDeserializer$deserialize$1 = (DescribeUserPoolOperationDeserializer$deserialize$1) continuation;
            int i = describeUserPoolOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeUserPoolOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeUserPoolOperationDeserializer$deserialize$1 = new DescribeUserPoolOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeUserPoolOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeUserPoolOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (C5391Px.ActionBar) describeUserPoolOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                AssetFileDescriptor.OLrzqt(actionBar, bArr);
            }
            actionBar.AEQbTJ();
            return actionBar.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeUserPoolOperationDeserializer$deserialize$1.label = 1;
            if (AssetFileDescriptor.EZpvd(dt, c58859zS, describeUserPoolOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new C5391Px.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeUserPoolOperationDeserializer$deserialize$1.L$0 = actionBar;
        describeUserPoolOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeUserPoolOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.AEQbTJ();
        return actionBar.OLrzqt();
    }
}
