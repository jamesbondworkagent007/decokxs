package o;

import com.okinc.dexkline.market.domain.MarketTradeUseCase$isDisplayToken$1;
import com.okinc.dexkline.market.domain.MarketTradeUseCase$isDisplayTokenIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.domain.MarketTradeUseCase$updateTokenDisplay$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.domain.MarketTradeUseCase$updateTokenDisplay$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mVP {
    public final InterfaceC32263mVn EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public mVP(@NotNull InterfaceC32263mVn interfaceC32263mVn, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32263mVn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC32263mVn;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketTradeUseCase$updateTokenDisplay$1 marketTradeUseCase$updateTokenDisplay$1;
        if (continuation instanceof MarketTradeUseCase$updateTokenDisplay$1) {
            marketTradeUseCase$updateTokenDisplay$1 = (MarketTradeUseCase$updateTokenDisplay$1) continuation;
            int i = marketTradeUseCase$updateTokenDisplay$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketTradeUseCase$updateTokenDisplay$1.label = i - Integer.MIN_VALUE;
            } else {
                marketTradeUseCase$updateTokenDisplay$1 = new MarketTradeUseCase$updateTokenDisplay$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketTradeUseCase$updateTokenDisplay$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketTradeUseCase$updateTokenDisplay$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            MarketTradeUseCase$updateTokenDisplay$$inlined$dexRunCatching$1 marketTradeUseCase$updateTokenDisplay$$inlined$dexRunCatching$1 = new MarketTradeUseCase$updateTokenDisplay$$inlined$dexRunCatching$1(null, this, z);
            marketTradeUseCase$updateTokenDisplay$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, marketTradeUseCase$updateTokenDisplay$$inlined$dexRunCatching$1, marketTradeUseCase$updateTokenDisplay$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        MarketTradeUseCase$isDisplayToken$1 marketTradeUseCase$isDisplayToken$1;
        if (continuation instanceof MarketTradeUseCase$isDisplayToken$1) {
            marketTradeUseCase$isDisplayToken$1 = (MarketTradeUseCase$isDisplayToken$1) continuation;
            int i = marketTradeUseCase$isDisplayToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketTradeUseCase$isDisplayToken$1.label = i - Integer.MIN_VALUE;
            } else {
                marketTradeUseCase$isDisplayToken$1 = new MarketTradeUseCase$isDisplayToken$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketTradeUseCase$isDisplayToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketTradeUseCase$isDisplayToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            MarketTradeUseCase$isDisplayTokenIoAF18A$$inlined$dexRunCatching$1 marketTradeUseCase$isDisplayTokenIoAF18A$$inlined$dexRunCatching$1 = new MarketTradeUseCase$isDisplayTokenIoAF18A$$inlined$dexRunCatching$1(null, this);
            marketTradeUseCase$isDisplayToken$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, marketTradeUseCase$isDisplayTokenIoAF18A$$inlined$dexRunCatching$1, marketTradeUseCase$isDisplayToken$1);
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
