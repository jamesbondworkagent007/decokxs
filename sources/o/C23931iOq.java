package o;

import com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo;
import com.okinc.business.invest_biz.mln.repo.DeFiMiniDetailsDaliBonusCacheRepo$getBonus$1;
import com.okinc.business.invest_biz.mln.repo.DeFiMiniDetailsDaliBonusCacheRepo$getBonus$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iOq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23931iOq {
    public final CoroutineDispatcher AEQbTJ;

    @yCM
    public C23931iOq(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(long j, @NotNull Continuation<? super Result<InvestmentBonusInfo>> continuation) throws java.lang.Throwable {
        DeFiMiniDetailsDaliBonusCacheRepo$getBonus$1 deFiMiniDetailsDaliBonusCacheRepo$getBonus$1;
        if (continuation instanceof DeFiMiniDetailsDaliBonusCacheRepo$getBonus$1) {
            deFiMiniDetailsDaliBonusCacheRepo$getBonus$1 = (DeFiMiniDetailsDaliBonusCacheRepo$getBonus$1) continuation;
            int i = deFiMiniDetailsDaliBonusCacheRepo$getBonus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailsDaliBonusCacheRepo$getBonus$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailsDaliBonusCacheRepo$getBonus$1 = new DeFiMiniDetailsDaliBonusCacheRepo$getBonus$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiMiniDetailsDaliBonusCacheRepo$getBonus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailsDaliBonusCacheRepo$getBonus$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
        DeFiMiniDetailsDaliBonusCacheRepo$getBonus$2 deFiMiniDetailsDaliBonusCacheRepo$getBonus$2 = new DeFiMiniDetailsDaliBonusCacheRepo$getBonus$2(j, null);
        deFiMiniDetailsDaliBonusCacheRepo$getBonus$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, deFiMiniDetailsDaliBonusCacheRepo$getBonus$2, deFiMiniDetailsDaliBonusCacheRepo$getBonus$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
