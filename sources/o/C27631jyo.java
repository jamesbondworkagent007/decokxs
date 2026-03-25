package o;

import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.common.market.repo.MarketRepositoryImpl$getMarketInfo$2;
import com.okinc.business.market.common.market.repo.MarketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.data.model.CoinRankingWsData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27631jyo implements InterfaceC27628jyl {
    public final Json AEQbTJ;
    public final C27640jyx OLrzqt;
    public final InterfaceC27595jyE copydefault;

    @yCM
    public C27631jyo(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.copydefault = interfaceC27595jyE;
        this.OLrzqt = c27640jyx;
        this.AEQbTJ = json;
    }

    @Override // o.InterfaceC27628jyl
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<LatestMarketInfoBean, OKServerException>> continuation) {
        return kAB.EZpvd(new MarketRepositoryImpl$getMarketInfo$2(this, str, str2, str3, null), continuation);
    }

    /* JADX INFO: renamed from: o.jyo$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar implements Flow<CoinRankingWsData> {
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ C27631jyo copydefault;

        /* JADX INFO: renamed from: o.jyo$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ C27631jyo OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C27631jyo c27631jyo) {
                this.EZpvd = flowCollector;
                this.OLrzqt = c27631jyo;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                MarketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1 marketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1;
                CoinRankingWsData coinRankingWsData;
                if (continuation instanceof MarketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1) {
                    marketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1 = (MarketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1) continuation;
                    int i = marketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        marketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        marketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1 = new MarketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = marketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = marketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Json json = this.OLrzqt.AEQbTJ;
                        json.getSerializersModule();
                        coinRankingWsData = (CoinRankingWsData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) json.decodeFromString(new ArrayListSerializer(CoinRankingWsData.Companion.serializer()), str));
                    } catch (java.lang.Throwable unused) {
                        coinRankingWsData = null;
                    }
                    if (coinRankingWsData != null) {
                        marketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(coinRankingWsData, marketRepositoryImpl$subscribeMarketInfoWs$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super CoinRankingWsData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
