package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ranking.core.engine.domain.GetMarketCapRankUseCase$onExecute$1;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.unify_find.data.MarketCapRank;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41617quG extends AbstractC49400uno<C41622quL, java.util.List<? extends RankingHotCryptoVo>> {
    public final CoroutineDispatcher OLrzqt;
    public final C41662quz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((C41622quL) obj, (Continuation<? super java.util.List<RankingHotCryptoVo>>) continuation);
    }

    @yCM
    public C41617quG(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = c41662quz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41622quL c41622quL, @NotNull Continuation<? super java.util.List<RankingHotCryptoVo>> continuation) throws java.lang.Throwable {
        GetMarketCapRankUseCase$onExecute$1 getMarketCapRankUseCase$onExecute$1;
        C41617quG c41617quG;
        java.util.List<RankingHotCryptoVo> listKWHzl;
        if (continuation instanceof GetMarketCapRankUseCase$onExecute$1) {
            getMarketCapRankUseCase$onExecute$1 = (GetMarketCapRankUseCase$onExecute$1) continuation;
            int i = getMarketCapRankUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketCapRankUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketCapRankUseCase$onExecute$1 = new GetMarketCapRankUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getMarketCapRankUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketCapRankUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.Map<java.lang.String, java.lang.String> mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("type", c41622quL.copydefault()));
            C41662quz c41662quz = this.copydefault;
            getMarketCapRankUseCase$onExecute$1.L$0 = this;
            getMarketCapRankUseCase$onExecute$1.label = 1;
            objEZpvd = c41662quz.EZpvd(mapEZpvd, getMarketCapRankUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41617quG = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41617quG = (C41617quG) getMarketCapRankUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List<MarketCapRank> list = (java.util.List) objEZpvd;
        return (list == null || (listKWHzl = c41617quG.KWHzl(list)) == null) ? yDY.AhwBna() : listKWHzl;
    }

    public final java.util.List<RankingHotCryptoVo> KWHzl(java.util.List<MarketCapRank> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            MarketCapRank marketCapRank = (MarketCapRank) obj;
            java.lang.String strEZpvd = C55611xnH.EZpvd(marketCapRank.getChangePerDay24h(), marketCapRank.getChangePerDayUtc0(), marketCapRank.getChangePerDayUtc8());
            java.lang.String strEZpvd2 = C41786qxQ.EZpvd(marketCapRank.getInstId());
            java.lang.String strKWHzl = C41786qxQ.KWHzl(marketCapRank.getInstId());
            java.lang.String instType = marketCapRank.getInstType();
            java.lang.String instId = marketCapRank.getInstId();
            java.lang.String localized$default = pTB.formatLocalized$default(marketCapRank.getLastPrice(), null, 1, null);
            java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(strEZpvd), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null);
            int iOLrzqt = C41786qxQ.OLrzqt(C33129mqd.EZpvd(strEZpvd));
            arrayList.add(new RankingHotCryptoVo(i2, instId, instType, marketCapRank.getIconV2(), strEZpvd2, marketCapRank.getMarketCap(), localized$default, false, null, false, iCUPercent$default, iOLrzqt, false, false, false, false, null, null, false, strKWHzl, false, null, true, null, null, null, false, 0L, null, null, null, null, null, null, null, -4721792, 7, null));
            i = i2;
        }
        return arrayList;
    }
}
