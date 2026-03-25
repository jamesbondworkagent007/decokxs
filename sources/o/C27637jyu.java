package o;

import com.okinc.business.market.common.marketconfig.repository.MarketConfigRepositoryImpl$getRemoteMarketConfig$1;
import com.okinc.business.market.common.marketconfig.repository.MarketConfigRepositoryImpl$getRemoteMarketConfig$2;
import com.okinc.business.market.common.marketconfig.repository.MarketConfigRepositoryImpl$setClosedBanner$1;
import com.okinc.business.market.data.model.HolderConfigData;
import com.okinc.business.market.data.model.MarketConfigData;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27637jyu implements InterfaceC27636jyt {
    public final InterfaceC23229huL copydefault;

    @yCM
    public C27637jyu(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        this.copydefault = interfaceC23229huL;
    }

    @Override // o.InterfaceC27636jyt
    public java.lang.Object copydefault(boolean z, @NotNull Continuation<? super MarketConfigData> continuation) {
        if (z) {
            return OLrzqt(continuation);
        }
        MarketConfigData marketConfigDataKWHzl = KWHzl();
        return marketConfigDataKWHzl == null ? OLrzqt(continuation) : marketConfigDataKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super MarketConfigData> continuation) throws java.lang.Throwable {
        MarketConfigRepositoryImpl$getRemoteMarketConfig$1 marketConfigRepositoryImpl$getRemoteMarketConfig$1;
        if (continuation instanceof MarketConfigRepositoryImpl$getRemoteMarketConfig$1) {
            marketConfigRepositoryImpl$getRemoteMarketConfig$1 = (MarketConfigRepositoryImpl$getRemoteMarketConfig$1) continuation;
            int i = marketConfigRepositoryImpl$getRemoteMarketConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketConfigRepositoryImpl$getRemoteMarketConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                marketConfigRepositoryImpl$getRemoteMarketConfig$1 = new MarketConfigRepositoryImpl$getRemoteMarketConfig$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = marketConfigRepositoryImpl$getRemoteMarketConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketConfigRepositoryImpl$getRemoteMarketConfig$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCoroutineScope);
                MarketConfigRepositoryImpl$getRemoteMarketConfig$2 marketConfigRepositoryImpl$getRemoteMarketConfig$2 = new MarketConfigRepositoryImpl$getRemoteMarketConfig$2(this, null);
                marketConfigRepositoryImpl$getRemoteMarketConfig$1.label = 1;
                objCoroutineScope = CoroutineScopeKt.coroutineScope(marketConfigRepositoryImpl$getRemoteMarketConfig$2, marketConfigRepositoryImpl$getRemoteMarketConfig$1);
                if (objCoroutineScope == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCoroutineScope);
            }
            return (MarketConfigData) objCoroutineScope;
        } catch (java.lang.Exception unused) {
            return new MarketConfigData((java.util.List) null, (java.util.List) null, (HolderConfigData) null, (java.util.List) null, 15, (DefaultConstructorMarker) null);
        }
    }

    public MarketConfigData KWHzl() {
        return (MarketConfigData) SPUtils.getObject("dex_market_config", MarketConfigData.class, "dex_market");
    }

    public void copydefault(@NotNull MarketConfigData marketConfigData) {
        Intrinsics.checkNotNullParameter(marketConfigData, "");
        SPUtils.put("dex_market_config", marketConfigData, "dex_market");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC27636jyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketConfigRepositoryImpl$setClosedBanner$1 marketConfigRepositoryImpl$setClosedBanner$1;
        if (continuation instanceof MarketConfigRepositoryImpl$setClosedBanner$1) {
            marketConfigRepositoryImpl$setClosedBanner$1 = (MarketConfigRepositoryImpl$setClosedBanner$1) continuation;
            int i = marketConfigRepositoryImpl$setClosedBanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketConfigRepositoryImpl$setClosedBanner$1.label = i - Integer.MIN_VALUE;
            } else {
                marketConfigRepositoryImpl$setClosedBanner$1 = new MarketConfigRepositoryImpl$setClosedBanner$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = marketConfigRepositoryImpl$setClosedBanner$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = marketConfigRepositoryImpl$setClosedBanner$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            marketConfigRepositoryImpl$setClosedBanner$1.L$0 = str;
            marketConfigRepositoryImpl$setClosedBanner$1.label = 1;
            objCopydefault = copydefault(marketConfigRepositoryImpl$setClosedBanner$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) marketConfigRepositoryImpl$setClosedBanner$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        SPUtils.put("dex_market_closed_banner_id", CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends java.lang.String>) objCopydefault, str), "dex_market");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27636jyt
    public java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation) {
        java.util.ArrayList arrayList = SPUtils.getArrayList("dex_market_closed_banner_id", java.lang.String.class, "dex_market");
        return arrayList != null ? arrayList : yDY.AhwBna();
    }

    @Override // o.InterfaceC27636jyt
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SPUtils.put(str + "-" + str2, java.lang.Boolean.valueOf(z), "dex_market");
    }

    @Override // o.InterfaceC27636jyt
    public boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return SPUtils.getBoolean(str + "-" + str2, false, "dex_market");
    }
}
