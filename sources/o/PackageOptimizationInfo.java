package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DescribeUserPoolDomainOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.MainThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PackageOptimizationInfo implements BB<MainThread> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MainThread> continuation) throws java.lang.Throwable {
        DescribeUserPoolDomainOperationDeserializer$deserialize$1 describeUserPoolDomainOperationDeserializer$deserialize$1;
        MainThread.Application application;
        byte[] bArr;
        if (continuation instanceof DescribeUserPoolDomainOperationDeserializer$deserialize$1) {
            describeUserPoolDomainOperationDeserializer$deserialize$1 = (DescribeUserPoolDomainOperationDeserializer$deserialize$1) continuation;
            int i = describeUserPoolDomainOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeUserPoolDomainOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeUserPoolDomainOperationDeserializer$deserialize$1 = new DescribeUserPoolDomainOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeUserPoolDomainOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeUserPoolDomainOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (MainThread.Application) describeUserPoolDomainOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                RuntimePermissionPresenter.AEQbTJ(application, bArr);
            }
            application.copydefault();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeUserPoolDomainOperationDeserializer$deserialize$1.label = 1;
            if (RuntimePermissionPresenter.AEQbTJ(dt, c58859zS, describeUserPoolDomainOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new MainThread.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeUserPoolDomainOperationDeserializer$deserialize$1.L$0 = application;
        describeUserPoolDomainOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeUserPoolDomainOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.copydefault();
        return application.EZpvd();
    }
}
