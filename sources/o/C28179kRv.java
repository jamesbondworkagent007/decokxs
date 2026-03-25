package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$fetchHistoryList$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$fetchHistoryList$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$fetchMarketInfo$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$fetchMarketInfo$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$fetchTokenPrice$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$fetchTokenPrice$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$getHistoryFilters$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$getHistoryFiltersIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$getSwitchTypes$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$getSwitchTypes$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$observePrivatePush$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$observePublicPush$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$subscribeMarketInfo$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$subscribeMarketInfogIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$subscribeOrderBook$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$subscribeOrderBookgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedOrderBookFilter;
import com.okinc.business.trade.features.home.ui.cefi.data.OrderBookInfo;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import o.InterfaceC28152kQv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28179kRv {
    public final C30651lfF AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC28152kQv copydefault;

    @yCM
    public C28179kRv(@NotNull InterfaceC28152kQv interfaceC28152kQv, @NotNull C30651lfF c30651lfF, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28152kQv, "");
        Intrinsics.checkNotNullParameter(c30651lfF, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC28152kQv;
        this.AEQbTJ = c30651lfF;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull Continuation<? super Flow<? extends java.lang.Object>> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new AdvancedMarketPriceUseCase$observePublicPush$2(this, dexMultiTokenInfoBean, null), continuation);
    }

    public final java.lang.Object KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull Continuation<? super Flow<? extends java.lang.Object>> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new AdvancedMarketPriceUseCase$observePrivatePush$2(this, dexMultiTokenInfoBean, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull C27614jyX c27614jyX, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        AdvancedMarketPriceUseCase$subscribeMarketInfo$1 advancedMarketPriceUseCase$subscribeMarketInfo$1;
        if (continuation instanceof AdvancedMarketPriceUseCase$subscribeMarketInfo$1) {
            advancedMarketPriceUseCase$subscribeMarketInfo$1 = (AdvancedMarketPriceUseCase$subscribeMarketInfo$1) continuation;
            int i = advancedMarketPriceUseCase$subscribeMarketInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketPriceUseCase$subscribeMarketInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketPriceUseCase$subscribeMarketInfo$1 = new AdvancedMarketPriceUseCase$subscribeMarketInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMarketPriceUseCase$subscribeMarketInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketPriceUseCase$subscribeMarketInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AdvancedMarketPriceUseCase$subscribeMarketInfogIAlus$$inlined$dexRunCatching$1 advancedMarketPriceUseCase$subscribeMarketInfogIAlus$$inlined$dexRunCatching$1 = new AdvancedMarketPriceUseCase$subscribeMarketInfogIAlus$$inlined$dexRunCatching$1(null, this, c27614jyX);
            advancedMarketPriceUseCase$subscribeMarketInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMarketPriceUseCase$subscribeMarketInfogIAlus$$inlined$dexRunCatching$1, advancedMarketPriceUseCase$subscribeMarketInfo$1);
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
    public final java.lang.Object OLrzqt(@NotNull OrderBookInfo orderBookInfo, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        AdvancedMarketPriceUseCase$subscribeOrderBook$1 advancedMarketPriceUseCase$subscribeOrderBook$1;
        if (continuation instanceof AdvancedMarketPriceUseCase$subscribeOrderBook$1) {
            advancedMarketPriceUseCase$subscribeOrderBook$1 = (AdvancedMarketPriceUseCase$subscribeOrderBook$1) continuation;
            int i = advancedMarketPriceUseCase$subscribeOrderBook$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketPriceUseCase$subscribeOrderBook$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketPriceUseCase$subscribeOrderBook$1 = new AdvancedMarketPriceUseCase$subscribeOrderBook$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMarketPriceUseCase$subscribeOrderBook$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketPriceUseCase$subscribeOrderBook$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AdvancedMarketPriceUseCase$subscribeOrderBookgIAlus$$inlined$dexRunCatching$1 advancedMarketPriceUseCase$subscribeOrderBookgIAlus$$inlined$dexRunCatching$1 = new AdvancedMarketPriceUseCase$subscribeOrderBookgIAlus$$inlined$dexRunCatching$1(null, orderBookInfo, this);
            advancedMarketPriceUseCase$subscribeOrderBook$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMarketPriceUseCase$subscribeOrderBookgIAlus$$inlined$dexRunCatching$1, advancedMarketPriceUseCase$subscribeOrderBook$1);
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
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<? extends java.util.List<C55276xgr>>> continuation) throws java.lang.Throwable {
        AdvancedMarketPriceUseCase$getHistoryFilters$1 advancedMarketPriceUseCase$getHistoryFilters$1;
        C28179kRv c28179kRv;
        if (continuation instanceof AdvancedMarketPriceUseCase$getHistoryFilters$1) {
            advancedMarketPriceUseCase$getHistoryFilters$1 = (AdvancedMarketPriceUseCase$getHistoryFilters$1) continuation;
            int i = advancedMarketPriceUseCase$getHistoryFilters$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketPriceUseCase$getHistoryFilters$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketPriceUseCase$getHistoryFilters$1 = new AdvancedMarketPriceUseCase$getHistoryFilters$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMarketPriceUseCase$getHistoryFilters$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketPriceUseCase$getHistoryFilters$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AdvancedMarketPriceUseCase$getHistoryFiltersIoAF18A$$inlined$dexRunCatching$1 advancedMarketPriceUseCase$getHistoryFiltersIoAF18A$$inlined$dexRunCatching$1 = new AdvancedMarketPriceUseCase$getHistoryFiltersIoAF18A$$inlined$dexRunCatching$1(null, this);
            advancedMarketPriceUseCase$getHistoryFilters$1.L$0 = this;
            advancedMarketPriceUseCase$getHistoryFilters$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMarketPriceUseCase$getHistoryFiltersIoAF18A$$inlined$dexRunCatching$1, advancedMarketPriceUseCase$getHistoryFilters$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c28179kRv = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28179kRv = (C28179kRv) advancedMarketPriceUseCase$getHistoryFilters$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            try {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(c28179kRv.AEQbTJ.KWHzl((java.util.List<AdvancedOrderBookFilter>) objM7386unboximpl));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7386unboximpl = C56391yDq.EZpvd(th);
            }
        }
        return Result.m7377constructorimpl(objM7386unboximpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<C55276xgr>> continuation) throws java.lang.Throwable {
        AdvancedMarketPriceUseCase$getSwitchTypes$1 advancedMarketPriceUseCase$getSwitchTypes$1;
        if (continuation instanceof AdvancedMarketPriceUseCase$getSwitchTypes$1) {
            advancedMarketPriceUseCase$getSwitchTypes$1 = (AdvancedMarketPriceUseCase$getSwitchTypes$1) continuation;
            int i = advancedMarketPriceUseCase$getSwitchTypes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketPriceUseCase$getSwitchTypes$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketPriceUseCase$getSwitchTypes$1 = new AdvancedMarketPriceUseCase$getSwitchTypes$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMarketPriceUseCase$getSwitchTypes$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketPriceUseCase$getSwitchTypes$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AdvancedMarketPriceUseCase$getSwitchTypes$$inlined$dexRunCatching$1 advancedMarketPriceUseCase$getSwitchTypes$$inlined$dexRunCatching$1 = new AdvancedMarketPriceUseCase$getSwitchTypes$$inlined$dexRunCatching$1(null);
            advancedMarketPriceUseCase$getSwitchTypes$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMarketPriceUseCase$getSwitchTypes$$inlined$dexRunCatching$1, advancedMarketPriceUseCase$getSwitchTypes$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        C56391yDq.AEQbTJ(objM7386unboximpl);
        return objM7386unboximpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull OrderBookInfo orderBookInfo, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<C28230kTs>, OKServerException>> continuation) throws java.lang.Throwable {
        AdvancedMarketPriceUseCase$fetchHistoryList$1 advancedMarketPriceUseCase$fetchHistoryList$1;
        if (continuation instanceof AdvancedMarketPriceUseCase$fetchHistoryList$1) {
            advancedMarketPriceUseCase$fetchHistoryList$1 = (AdvancedMarketPriceUseCase$fetchHistoryList$1) continuation;
            int i = advancedMarketPriceUseCase$fetchHistoryList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketPriceUseCase$fetchHistoryList$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketPriceUseCase$fetchHistoryList$1 = new AdvancedMarketPriceUseCase$fetchHistoryList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMarketPriceUseCase$fetchHistoryList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketPriceUseCase$fetchHistoryList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AdvancedMarketPriceUseCase$fetchHistoryList$$inlined$dexRunCatching$1 advancedMarketPriceUseCase$fetchHistoryList$$inlined$dexRunCatching$1 = new AdvancedMarketPriceUseCase$fetchHistoryList$$inlined$dexRunCatching$1(null, this, orderBookInfo, dexMultiTokenInfoBean);
            advancedMarketPriceUseCase$fetchHistoryList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMarketPriceUseCase$fetchHistoryList$$inlined$dexRunCatching$1, advancedMarketPriceUseCase$fetchHistoryList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        C56391yDq.AEQbTJ(objM7386unboximpl);
        return objM7386unboximpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<C28222kTk, OKServerException>> continuation) throws java.lang.Throwable {
        AdvancedMarketPriceUseCase$fetchTokenPrice$1 advancedMarketPriceUseCase$fetchTokenPrice$1;
        if (continuation instanceof AdvancedMarketPriceUseCase$fetchTokenPrice$1) {
            advancedMarketPriceUseCase$fetchTokenPrice$1 = (AdvancedMarketPriceUseCase$fetchTokenPrice$1) continuation;
            int i = advancedMarketPriceUseCase$fetchTokenPrice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketPriceUseCase$fetchTokenPrice$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketPriceUseCase$fetchTokenPrice$1 = new AdvancedMarketPriceUseCase$fetchTokenPrice$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMarketPriceUseCase$fetchTokenPrice$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketPriceUseCase$fetchTokenPrice$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AdvancedMarketPriceUseCase$fetchTokenPrice$$inlined$dexRunCatching$1 advancedMarketPriceUseCase$fetchTokenPrice$$inlined$dexRunCatching$1 = new AdvancedMarketPriceUseCase$fetchTokenPrice$$inlined$dexRunCatching$1(null, this, str, str2);
            advancedMarketPriceUseCase$fetchTokenPrice$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMarketPriceUseCase$fetchTokenPrice$$inlined$dexRunCatching$1, advancedMarketPriceUseCase$fetchTokenPrice$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        C56391yDq.AEQbTJ(objM7386unboximpl);
        return objM7386unboximpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<C28222kTk, OKServerException>> continuation) throws java.lang.Throwable {
        AdvancedMarketPriceUseCase$fetchMarketInfo$1 advancedMarketPriceUseCase$fetchMarketInfo$1;
        if (continuation instanceof AdvancedMarketPriceUseCase$fetchMarketInfo$1) {
            advancedMarketPriceUseCase$fetchMarketInfo$1 = (AdvancedMarketPriceUseCase$fetchMarketInfo$1) continuation;
            int i = advancedMarketPriceUseCase$fetchMarketInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketPriceUseCase$fetchMarketInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketPriceUseCase$fetchMarketInfo$1 = new AdvancedMarketPriceUseCase$fetchMarketInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMarketPriceUseCase$fetchMarketInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketPriceUseCase$fetchMarketInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AdvancedMarketPriceUseCase$fetchMarketInfo$$inlined$dexRunCatching$1 advancedMarketPriceUseCase$fetchMarketInfo$$inlined$dexRunCatching$1 = new AdvancedMarketPriceUseCase$fetchMarketInfo$$inlined$dexRunCatching$1(null, this, str, str2);
            advancedMarketPriceUseCase$fetchMarketInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMarketPriceUseCase$fetchMarketInfo$$inlined$dexRunCatching$1, advancedMarketPriceUseCase$fetchMarketInfo$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        C56391yDq.AEQbTJ(objM7386unboximpl);
        return objM7386unboximpl;
    }

    public final void AEQbTJ() {
        InterfaceC28152kQv.Activity.unsubscribeMarketInfo$default(this.copydefault, null, 1, null);
    }

    public final void copydefault() {
        this.copydefault.KWHzl("dex-market-trade-history");
        Unit unit = Unit.INSTANCE;
        this.copydefault.KWHzl("dex-market-trade-history-batch");
    }
}
