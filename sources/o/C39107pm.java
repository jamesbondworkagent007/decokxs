package o;

import aws.sdk.kotlin.services.textract.serde.AnalyzeExpenseOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C34490nd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C39107pm implements BB<C34490nd> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C34490nd> continuation) throws java.lang.Throwable {
        AnalyzeExpenseOperationDeserializer$deserialize$1 analyzeExpenseOperationDeserializer$deserialize$1;
        C34490nd.Application application;
        byte[] bArr;
        if (continuation instanceof AnalyzeExpenseOperationDeserializer$deserialize$1) {
            analyzeExpenseOperationDeserializer$deserialize$1 = (AnalyzeExpenseOperationDeserializer$deserialize$1) continuation;
            int i = analyzeExpenseOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                analyzeExpenseOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                analyzeExpenseOperationDeserializer$deserialize$1 = new AnalyzeExpenseOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = analyzeExpenseOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = analyzeExpenseOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (C34490nd.Application) analyzeExpenseOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C39001pk.OLrzqt(application, bArr);
            }
            application.AEQbTJ();
            return application.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            analyzeExpenseOperationDeserializer$deserialize$1.label = 1;
            if (C39001pk.copydefault(dt, c58859zS, analyzeExpenseOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new C34490nd.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        analyzeExpenseOperationDeserializer$deserialize$1.L$0 = application;
        analyzeExpenseOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, analyzeExpenseOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.AEQbTJ();
        return application.OLrzqt();
    }
}
