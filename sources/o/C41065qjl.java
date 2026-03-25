package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.domain.usecase.MarketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1;
import com.okinc.unify_find.data.UpDownRank;
import kotlin.Result;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qjl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41065qjl extends AbstractC49400uno<C41086qkF, java.util.List<? extends C41120qkn>> {
    public final C41068qjo EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final C41662quz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C41065qjl(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41068qjo c41068qjo, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41068qjo, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = c41068qjo;
        this.copydefault = c41662quz;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41086qkF c41086qkF, @NotNull Continuation<? super java.util.List<C41120qkn>> continuation) throws java.lang.Throwable {
        MarketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1 marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1;
        C41065qjl c41065qjl;
        C41086qkF c41086qkF2;
        java.lang.Object objM7377constructorimpl;
        java.util.Map map;
        if (continuation instanceof MarketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1) {
            marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1 = (MarketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1) continuation;
            int i = marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1 = new MarketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1.label;
        int i3 = 0;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", c41086qkF.AYXKKw()), C56390yDp.OLrzqt(TypedValues.CycleType.S_WAVE_PERIOD, c41086qkF.copydefault().getInputPara()), C56390yDp.OLrzqt("zone", c41086qkF.djBIcL()), C56390yDp.OLrzqt("rank", c41086qkF.AEQbTJ()), C56390yDp.OLrzqt("num", c41086qkF.OLrzqt()), C56390yDp.OLrzqt("plateType", c41086qkF.EZpvd()));
            try {
                Result.Application application = Result.Companion;
                C41662quz c41662quz = this.copydefault;
                marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1.L$0 = this;
                marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1.L$1 = c41086qkF;
                marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1.label = 1;
                objValueOf = c41662quz.valueOf(mapGEmmrt, marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
                c41065qjl = this;
                c41086qkF2 = c41086qkF;
            } catch (java.lang.Throwable th) {
                th = th;
                c41065qjl = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41086qkF2 = (C41086qkF) marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1.L$1;
            c41065qjl = (C41065qjl) marketDiscoverOverviewTrendingCategoryCryptoUseCase$onExecute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objValueOf);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        java.util.List list = (java.util.List) objValueOf;
        objM7377constructorimpl = Result.m7377constructorimpl((list == null || (map = (java.util.Map) list.get(0)) == null) ? null : (java.util.List) map.get(C55488xkr.KWHzl.KWHzl(c41086qkF2.djBIcL())));
        java.util.List list2 = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (list2 == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            UpDownRank upDownRank = (UpDownRank) obj;
            Triple triple = (Triple) c41065qjl.EZpvd.OLrzqt(upDownRank);
            java.lang.CharSequence charSequence = (java.lang.CharSequence) triple.component1();
            java.lang.CharSequence charSequence2 = (java.lang.CharSequence) triple.component2();
            arrayList.add(new C41120qkn(i4, upDownRank.getInstId(), upDownRank.getInstType(), upDownRank.getIconV2(), C41786qxQ.EZpvd(upDownRank.getInstId()), C33129mqd.gEmmrt((java.lang.CharSequence) triple.component3()), C33129mqd.gEmmrt(charSequence), false, C33129mqd.gEmmrt(charSequence2), false, C41786qxQ.OLrzqt(upDownRank.getChangePer()), C41786qxQ.OLrzqt(C33129mqd.EZpvd(upDownRank.getChangePer())), false, 4736, null));
            i3 = i4;
        }
        return arrayList;
    }
}
