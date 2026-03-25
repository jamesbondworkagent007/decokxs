package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DescribeResourceServerOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.IntDef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ResolveInfo implements BB<IntDef> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super IntDef> continuation) throws java.lang.Throwable {
        DescribeResourceServerOperationDeserializer$deserialize$1 describeResourceServerOperationDeserializer$deserialize$1;
        IntDef.Application application;
        byte[] bArr;
        if (continuation instanceof DescribeResourceServerOperationDeserializer$deserialize$1) {
            describeResourceServerOperationDeserializer$deserialize$1 = (DescribeResourceServerOperationDeserializer$deserialize$1) continuation;
            int i = describeResourceServerOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeResourceServerOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeResourceServerOperationDeserializer$deserialize$1 = new DescribeResourceServerOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeResourceServerOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeResourceServerOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (IntDef.Application) describeResourceServerOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                ShortcutInfo.AEQbTJ(application, bArr);
            }
            application.KWHzl();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeResourceServerOperationDeserializer$deserialize$1.label = 1;
            if (ShortcutInfo.KWHzl(dt, c58859zS, describeResourceServerOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new IntDef.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeResourceServerOperationDeserializer$deserialize$1.L$0 = application;
        describeResourceServerOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeResourceServerOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.KWHzl();
        return application.EZpvd();
    }
}
