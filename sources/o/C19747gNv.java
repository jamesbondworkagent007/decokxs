package o;

import com.okinc.business.dex.tee.domain.model.SignAndBroadcastParams;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.tee.domain.usecase.market.TeeMarketTeePlaceOrderUseCase$signAndBroadcast$1;
import com.okinc.business.dex.tee.domain.usecase.market.TeeMarketTeePlaceOrderUseCase$signAndBroadcastgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19747gNv {
    public final InterfaceC19736gNk EZpvd;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C19747gNv(@NotNull InterfaceC19736gNk interfaceC19736gNk, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC19736gNk, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC19736gNk;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull SignAndBroadcastParams signAndBroadcastParams, @NotNull Continuation<? super Result<SignAndBroadcastRes>> continuation) {
        TeeMarketTeePlaceOrderUseCase$signAndBroadcast$1 teeMarketTeePlaceOrderUseCase$signAndBroadcast$1;
        if (continuation instanceof TeeMarketTeePlaceOrderUseCase$signAndBroadcast$1) {
            teeMarketTeePlaceOrderUseCase$signAndBroadcast$1 = (TeeMarketTeePlaceOrderUseCase$signAndBroadcast$1) continuation;
            int i = teeMarketTeePlaceOrderUseCase$signAndBroadcast$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeMarketTeePlaceOrderUseCase$signAndBroadcast$1.label = i - Integer.MIN_VALUE;
            } else {
                teeMarketTeePlaceOrderUseCase$signAndBroadcast$1 = new TeeMarketTeePlaceOrderUseCase$signAndBroadcast$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = teeMarketTeePlaceOrderUseCase$signAndBroadcast$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeMarketTeePlaceOrderUseCase$signAndBroadcast$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            TeeMarketTeePlaceOrderUseCase$signAndBroadcastgIAlus$$inlined$dexRunCatching$1 teeMarketTeePlaceOrderUseCase$signAndBroadcastgIAlus$$inlined$dexRunCatching$1 = new TeeMarketTeePlaceOrderUseCase$signAndBroadcastgIAlus$$inlined$dexRunCatching$1(null, this, signAndBroadcastParams);
            teeMarketTeePlaceOrderUseCase$signAndBroadcast$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, teeMarketTeePlaceOrderUseCase$signAndBroadcastgIAlus$$inlined$dexRunCatching$1, teeMarketTeePlaceOrderUseCase$signAndBroadcast$1);
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
