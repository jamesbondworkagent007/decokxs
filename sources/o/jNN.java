package o;

import com.okinc.business.market.features.coindetail.domain.CoinDetailUseCase$closeBanner$2;
import com.okinc.business.market.features.coindetail.domain.CoinDetailUseCase$getNativeTokenPrice$1;
import com.okinc.business.market.features.coindetail.domain.CoinDetailUseCase$getNativeTokenPricegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jNN {
    public final CoroutineDispatcher EZpvd;
    public final jNW KWHzl;
    public final InterfaceC27636jyt copydefault;

    @yCM
    public jNN(@NotNull InterfaceC27636jyt interfaceC27636jyt, @NotNull jNW jnw, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27636jyt, "");
        Intrinsics.checkNotNullParameter(jnw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC27636jyt;
        this.KWHzl = jnw;
        this.EZpvd = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new CoinDetailUseCase$closeBanner$2(this, str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<jNY>> continuation) {
        CoinDetailUseCase$getNativeTokenPrice$1 coinDetailUseCase$getNativeTokenPrice$1;
        if (continuation instanceof CoinDetailUseCase$getNativeTokenPrice$1) {
            coinDetailUseCase$getNativeTokenPrice$1 = (CoinDetailUseCase$getNativeTokenPrice$1) continuation;
            int i = coinDetailUseCase$getNativeTokenPrice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coinDetailUseCase$getNativeTokenPrice$1.label = i - Integer.MIN_VALUE;
            } else {
                coinDetailUseCase$getNativeTokenPrice$1 = new CoinDetailUseCase$getNativeTokenPrice$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = coinDetailUseCase$getNativeTokenPrice$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coinDetailUseCase$getNativeTokenPrice$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            CoinDetailUseCase$getNativeTokenPricegIAlus$$inlined$dexRunCatching$1 coinDetailUseCase$getNativeTokenPricegIAlus$$inlined$dexRunCatching$1 = new CoinDetailUseCase$getNativeTokenPricegIAlus$$inlined$dexRunCatching$1(null, this, str);
            coinDetailUseCase$getNativeTokenPrice$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, coinDetailUseCase$getNativeTokenPricegIAlus$$inlined$dexRunCatching$1, coinDetailUseCase$getNativeTokenPrice$1);
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
