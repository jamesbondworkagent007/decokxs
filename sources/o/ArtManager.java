package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DescribeUserPoolClientOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.LayoutRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ArtManager implements BB<LayoutRes> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super LayoutRes> continuation) throws java.lang.Throwable {
        DescribeUserPoolClientOperationDeserializer$deserialize$1 describeUserPoolClientOperationDeserializer$deserialize$1;
        LayoutRes.Application application;
        byte[] bArr;
        if (continuation instanceof DescribeUserPoolClientOperationDeserializer$deserialize$1) {
            describeUserPoolClientOperationDeserializer$deserialize$1 = (DescribeUserPoolClientOperationDeserializer$deserialize$1) continuation;
            int i = describeUserPoolClientOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeUserPoolClientOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeUserPoolClientOperationDeserializer$deserialize$1 = new DescribeUserPoolClientOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeUserPoolClientOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeUserPoolClientOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (LayoutRes.Application) describeUserPoolClientOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                XmlSerializerAndParser.AEQbTJ(application, bArr);
            }
            application.OLrzqt();
            return application.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeUserPoolClientOperationDeserializer$deserialize$1.label = 1;
            if (XmlSerializerAndParser.copydefault(dt, c58859zS, describeUserPoolClientOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new LayoutRes.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeUserPoolClientOperationDeserializer$deserialize$1.L$0 = application;
        describeUserPoolClientOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeUserPoolClientOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.OLrzqt();
        return application.KWHzl();
    }
}
