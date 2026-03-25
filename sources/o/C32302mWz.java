package o;

import com.okinc.dexkline.market.features.coincheck.domain.CoinCheckUsecase$getRiskCheck$1;
import com.okinc.dexkline.market.features.coincheck.domain.CoinCheckUsecase$getRiskCheck0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mWz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32302mWz {
    public final InterfaceC32301mWy AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    @yCM
    public C32302mWz(@NotNull InterfaceC32301mWy interfaceC32301mWy, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32301mWy, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC32301mWy;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<C32299mWw>> continuation) throws java.lang.Throwable {
        CoinCheckUsecase$getRiskCheck$1 coinCheckUsecase$getRiskCheck$1;
        if (continuation instanceof CoinCheckUsecase$getRiskCheck$1) {
            coinCheckUsecase$getRiskCheck$1 = (CoinCheckUsecase$getRiskCheck$1) continuation;
            int i = coinCheckUsecase$getRiskCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coinCheckUsecase$getRiskCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                coinCheckUsecase$getRiskCheck$1 = new CoinCheckUsecase$getRiskCheck$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = coinCheckUsecase$getRiskCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coinCheckUsecase$getRiskCheck$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            CoinCheckUsecase$getRiskCheck0E7RQCE$$inlined$dexRunCatching$1 coinCheckUsecase$getRiskCheck0E7RQCE$$inlined$dexRunCatching$1 = new CoinCheckUsecase$getRiskCheck0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            coinCheckUsecase$getRiskCheck$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, coinCheckUsecase$getRiskCheck0E7RQCE$$inlined$dexRunCatching$1, coinCheckUsecase$getRiskCheck$1);
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
