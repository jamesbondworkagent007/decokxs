package o;

import com.okinc.business.market.data.model.traders.TradersData;
import com.okinc.business.market.features.trader.domain.model.Traders;
import com.okinc.business.market.features.trader.domain.usecase.MapTraderUseCase$map$1;
import com.okinc.business.market.features.trader.domain.usecase.MapTraderUseCase$mapgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kzC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29728kzC {
    public final C29712kyn AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    @yCM
    public C29728kzC(@NotNull C29712kyn c29712kyn, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c29712kyn;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.List<TradersData> list, @NotNull Continuation<? super Result<? extends java.util.List<Traders>>> continuation) {
        MapTraderUseCase$map$1 mapTraderUseCase$map$1;
        if (continuation instanceof MapTraderUseCase$map$1) {
            mapTraderUseCase$map$1 = (MapTraderUseCase$map$1) continuation;
            int i = mapTraderUseCase$map$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapTraderUseCase$map$1.label = i - Integer.MIN_VALUE;
            } else {
                mapTraderUseCase$map$1 = new MapTraderUseCase$map$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapTraderUseCase$map$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapTraderUseCase$map$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            MapTraderUseCase$mapgIAlus$$inlined$dexRunCatching$1 mapTraderUseCase$mapgIAlus$$inlined$dexRunCatching$1 = new MapTraderUseCase$mapgIAlus$$inlined$dexRunCatching$1(null, list, this);
            mapTraderUseCase$map$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapTraderUseCase$mapgIAlus$$inlined$dexRunCatching$1, mapTraderUseCase$map$1);
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
