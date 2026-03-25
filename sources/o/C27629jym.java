package o;

import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.common.market.MarketUseCase$getMarketInfo$1;
import com.okinc.business.market.common.market.MarketUseCase$getMarketInfo0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27629jym {
    public final kKG EZpvd;
    public final InterfaceC27628jyl KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C27629jym(@NotNull kKG kkg, @NotNull InterfaceC27628jyl interfaceC27628jyl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(interfaceC27628jyl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = kkg;
        this.KWHzl = interfaceC27628jyl;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<LatestMarketInfoBean>> continuation) throws java.lang.Throwable {
        MarketUseCase$getMarketInfo$1 marketUseCase$getMarketInfo$1;
        if (continuation instanceof MarketUseCase$getMarketInfo$1) {
            marketUseCase$getMarketInfo$1 = (MarketUseCase$getMarketInfo$1) continuation;
            int i = marketUseCase$getMarketInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUseCase$getMarketInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUseCase$getMarketInfo$1 = new MarketUseCase$getMarketInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketUseCase$getMarketInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUseCase$getMarketInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            MarketUseCase$getMarketInfo0E7RQCE$$inlined$dexRunCatching$1 marketUseCase$getMarketInfo0E7RQCE$$inlined$dexRunCatching$1 = new MarketUseCase$getMarketInfo0E7RQCE$$inlined$dexRunCatching$1(null, this, str2, str);
            marketUseCase$getMarketInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, marketUseCase$getMarketInfo0E7RQCE$$inlined$dexRunCatching$1, marketUseCase$getMarketInfo$1);
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
