package o;

import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import com.okinc.dexkline.market.features.token_detail.domain.MapTokenDetailUseCase$map$1;
import com.okinc.dexkline.market.features.token_detail.domain.MapTokenDetailUseCase$map$3;
import com.okinc.dexkline.market.features.token_detail.domain.MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.token_detail.domain.MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.neg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34576neg {
    public final CoroutineDispatcher AEQbTJ;
    public final C34541ndy EZpvd;
    public final InterfaceC46557tYt copydefault;

    @yCM
    public C34576neg(@NotNull C34541ndy c34541ndy, @NotNull InterfaceC46557tYt interfaceC46557tYt, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c34541ndy, "");
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c34541ndy;
        this.copydefault = interfaceC46557tYt;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(LatestMarketInfoBean latestMarketInfoBean, @NotNull Continuation<? super Result<TokenDetail>> continuation) throws java.lang.Throwable {
        MapTokenDetailUseCase$map$1 mapTokenDetailUseCase$map$1;
        if (continuation instanceof MapTokenDetailUseCase$map$1) {
            mapTokenDetailUseCase$map$1 = (MapTokenDetailUseCase$map$1) continuation;
            int i = mapTokenDetailUseCase$map$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapTokenDetailUseCase$map$1.label = i - Integer.MIN_VALUE;
            } else {
                mapTokenDetailUseCase$map$1 = new MapTokenDetailUseCase$map$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapTokenDetailUseCase$map$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapTokenDetailUseCase$map$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$1 mapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$1 = new MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$1(null, latestMarketInfoBean, this);
            mapTokenDetailUseCase$map$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$1, mapTokenDetailUseCase$map$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull MarketTxWsInfoItemBean marketTxWsInfoItemBean, @NotNull Continuation<? super Result<TokenDetail>> continuation) throws java.lang.Throwable {
        MapTokenDetailUseCase$map$3 mapTokenDetailUseCase$map$3;
        if (continuation instanceof MapTokenDetailUseCase$map$3) {
            mapTokenDetailUseCase$map$3 = (MapTokenDetailUseCase$map$3) continuation;
            int i = mapTokenDetailUseCase$map$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapTokenDetailUseCase$map$3.label = i - Integer.MIN_VALUE;
            } else {
                mapTokenDetailUseCase$map$3 = new MapTokenDetailUseCase$map$3(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapTokenDetailUseCase$map$3.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapTokenDetailUseCase$map$3.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$2 mapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$2 = new MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$2(null, marketTxWsInfoItemBean, this);
            mapTokenDetailUseCase$map$3.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$2, mapTokenDetailUseCase$map$3);
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
