package o;

import com.okinc.market.discover.features.markets.sub.rank.spot.domain.GetMarketDiscoverSpotMarketCapPosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.unify_find.data.MarketCapRank;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41226qmn extends AbstractC49400uno<ChargeGroupVo, java.util.List<? extends MarketCapRank>> {
    private static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final ConcurrentHashMap<java.lang.String, SoftReference<java.util.List<MarketCapRank>>> KWHzl;
    public final C41662quz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((ChargeGroupVo) obj, (Continuation<? super java.util.List<MarketCapRank>>) continuation);
    }

    @yCM
    public C41226qmn(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = c41662quz;
        this.KWHzl = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.qmn$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qmn.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull ChargeGroupVo chargeGroupVo, @NotNull Continuation<? super java.util.List<MarketCapRank>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverSpotMarketCapPosUseCase$onExecute$1 getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1;
        java.lang.String str;
        java.util.List<MarketCapRank> list;
        C41226qmn c41226qmn;
        if (continuation instanceof GetMarketDiscoverSpotMarketCapPosUseCase$onExecute$1) {
            getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1 = (GetMarketDiscoverSpotMarketCapPosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1 = new GetMarketDiscoverSpotMarketCapPosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String key = chargeGroupVo.OLrzqt().getKey();
            SoftReference<java.util.List<MarketCapRank>> softReference = this.KWHzl.get(key);
            java.util.List<MarketCapRank> list2 = softReference != null ? softReference.get() : null;
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", key), C56390yDp.OLrzqt("num", "350"), C56390yDp.OLrzqt("rank", "0"), C56390yDp.OLrzqt("zone", C41786qxQ.AEQbTJ("24h", "utc0", "utc8")));
            C41662quz c41662quz = this.copydefault;
            getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.L$1 = key;
            getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.L$2 = list2;
            getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41662quz.EZpvd(mapGEmmrt, getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str = key;
            list = list2;
            obj = objEZpvd;
            c41226qmn = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.L$2;
            str = (java.lang.String) getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.L$1;
            c41226qmn = (C41226qmn) getMarketDiscoverSpotMarketCapPosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.List list3 = (java.util.List) obj;
        c41226qmn.KWHzl.put(str, new SoftReference<>(list3));
        return (list3 == null || !list3.isEmpty()) ? list3 : list;
    }
}
