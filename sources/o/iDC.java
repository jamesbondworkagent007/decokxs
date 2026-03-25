package o;

import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$cleargIAlus$$inlined$runOnIogIAlus$1;
import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryKt$clear$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class iDC {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull InterfaceC23639iDv interfaceC23639iDv, @NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        InvestSpRepositoryKt$clear$1 investSpRepositoryKt$clear$1;
        if (continuation instanceof InvestSpRepositoryKt$clear$1) {
            investSpRepositoryKt$clear$1 = (InvestSpRepositoryKt$clear$1) continuation;
            int i = investSpRepositoryKt$clear$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investSpRepositoryKt$clear$1.label = i - Integer.MIN_VALUE;
            } else {
                investSpRepositoryKt$clear$1 = new InvestSpRepositoryKt$clear$1(continuation);
            }
        }
        java.lang.Object objWithContext = investSpRepositoryKt$clear$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investSpRepositoryKt$clear$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            Intrinsics.copydefault(interfaceC23639iDv, "");
            C23642iDy c23642iDy = (C23642iDy) interfaceC23639iDv;
            CoroutineDispatcher coroutineDispatcher = c23642iDy.AEQbTJ;
            InvestSpRepositoryImpl$cleargIAlus$$inlined$runOnIogIAlus$1 investSpRepositoryImpl$cleargIAlus$$inlined$runOnIogIAlus$1 = new InvestSpRepositoryImpl$cleargIAlus$$inlined$runOnIogIAlus$1(null, c23642iDy, str);
            investSpRepositoryKt$clear$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investSpRepositoryImpl$cleargIAlus$$inlined$runOnIogIAlus$1, investSpRepositoryKt$clear$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
