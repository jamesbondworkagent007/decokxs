package o;

import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import com.okinc.business.invest_biz.data.usecase.InvestDexRecommendHeaderUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.InvestDexRecommendHeaderUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFX implements iFU {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC23635iDr KWHzl;

    @yCM
    public iFX(@NotNull InterfaceC23635iDr interfaceC23635iDr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23635iDr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC23635iDr;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iFU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(long j, @NotNull java.lang.String str, @NotNull Continuation<? super Result<SearchHeaderInfoResponse>> continuation) {
        InvestDexRecommendHeaderUseCaseImpl$invoke$1 investDexRecommendHeaderUseCaseImpl$invoke$1;
        if (continuation instanceof InvestDexRecommendHeaderUseCaseImpl$invoke$1) {
            investDexRecommendHeaderUseCaseImpl$invoke$1 = (InvestDexRecommendHeaderUseCaseImpl$invoke$1) continuation;
            int i = investDexRecommendHeaderUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investDexRecommendHeaderUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                investDexRecommendHeaderUseCaseImpl$invoke$1 = new InvestDexRecommendHeaderUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investDexRecommendHeaderUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investDexRecommendHeaderUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            InvestDexRecommendHeaderUseCaseImpl$invoke$2 investDexRecommendHeaderUseCaseImpl$invoke$2 = new InvestDexRecommendHeaderUseCaseImpl$invoke$2(this, j, str, null);
            investDexRecommendHeaderUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investDexRecommendHeaderUseCaseImpl$invoke$2, investDexRecommendHeaderUseCaseImpl$invoke$1);
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
