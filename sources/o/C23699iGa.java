package o;

import com.okinc.business.invest_biz.data.bean.AggregateData;
import com.okinc.business.invest_biz.data.usecase.DexEntranceProductQuery;
import com.okinc.business.invest_biz.data.usecase.InvestDexRecommendListUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.InvestDexRecommendListUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iGa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23699iGa implements iFY {
    public final InterfaceC23635iDr EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C23699iGa(@NotNull InterfaceC23635iDr interfaceC23635iDr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23635iDr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC23635iDr;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iFY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DexEntranceProductQuery dexEntranceProductQuery, @NotNull Continuation<? super Result<AggregateData>> continuation) {
        InvestDexRecommendListUseCaseImpl$invoke$1 investDexRecommendListUseCaseImpl$invoke$1;
        if (continuation instanceof InvestDexRecommendListUseCaseImpl$invoke$1) {
            investDexRecommendListUseCaseImpl$invoke$1 = (InvestDexRecommendListUseCaseImpl$invoke$1) continuation;
            int i = investDexRecommendListUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investDexRecommendListUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                investDexRecommendListUseCaseImpl$invoke$1 = new InvestDexRecommendListUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investDexRecommendListUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investDexRecommendListUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            InvestDexRecommendListUseCaseImpl$invoke$2 investDexRecommendListUseCaseImpl$invoke$2 = new InvestDexRecommendListUseCaseImpl$invoke$2(this, dexEntranceProductQuery, null);
            investDexRecommendListUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investDexRecommendListUseCaseImpl$invoke$2, investDexRecommendListUseCaseImpl$invoke$1);
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
