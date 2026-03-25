package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ranking.core.engine.domain.GetFuturesRankingVosUseCase$onExecute$1;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.market.ranking.core.model.po.RankingFuturesType;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41614quD extends AbstractC49400uno<C41615quE, java.util.List<? extends RankingHotCryptoVo>> {
    public final CoroutineDispatcher KWHzl;
    public final C41616quF OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C41614quD(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41616quF c41616quF) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41616quF, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c41616quF;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41615quE c41615quE, @NotNull Continuation<? super java.util.List<RankingHotCryptoVo>> continuation) throws java.lang.Throwable {
        GetFuturesRankingVosUseCase$onExecute$1 getFuturesRankingVosUseCase$onExecute$1;
        C41614quD c41614quD;
        if (continuation instanceof GetFuturesRankingVosUseCase$onExecute$1) {
            getFuturesRankingVosUseCase$onExecute$1 = (GetFuturesRankingVosUseCase$onExecute$1) continuation;
            int i = getFuturesRankingVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getFuturesRankingVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getFuturesRankingVosUseCase$onExecute$1 = new GetFuturesRankingVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getFuturesRankingVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getFuturesRankingVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41616quF c41616quF = this.OLrzqt;
            getFuturesRankingVosUseCase$onExecute$1.L$0 = this;
            getFuturesRankingVosUseCase$onExecute$1.L$1 = c41615quE;
            getFuturesRankingVosUseCase$onExecute$1.label = 1;
            objEZpvd = c41616quF.EZpvd(c41615quE, getFuturesRankingVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41614quD = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41615quE = (C41615quE) getFuturesRankingVosUseCase$onExecute$1.L$1;
            c41614quD = (C41614quD) getFuturesRankingVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List<FuturesRankItemPo> list = (java.util.List) objEZpvd;
        java.util.List<RankingHotCryptoVo> listOLrzqt = list != null ? c41614quD.OLrzqt(list, c41615quE.djBIcL(), c41615quE.gEmmrt()) : null;
        if (listOLrzqt != null && !listOLrzqt.isEmpty()) {
            return listOLrzqt;
        }
        throw new java.lang.RuntimeException("Futures ranking data is empty for period: " + c41615quE);
    }

    public final java.util.List<RankingHotCryptoVo> OLrzqt(java.util.List<FuturesRankItemPo> list, PeriodEnum periodEnum, RankingFuturesType rankingFuturesType) {
        java.lang.String turnOver;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            FuturesRankItemPo futuresRankItemPo = (FuturesRankItemPo) obj;
            if (rankingFuturesType == RankingFuturesType.MARKET_CAP) {
                turnOver = futuresRankItemPo.getMarketCap();
            } else {
                turnOver = futuresRankItemPo.getTurnOver();
            }
            java.lang.String volume = futuresRankItemPo.getVolume();
            java.lang.String strEZpvd = C41786qxQ.EZpvd(futuresRankItemPo.getInstId());
            java.lang.String strKWHzl = C41786qxQ.KWHzl(futuresRankItemPo.getInstId());
            arrayList.add(new RankingHotCryptoVo(i2, futuresRankItemPo.getInstId(), futuresRankItemPo.getInstType(), futuresRankItemPo.getIcon(), strEZpvd, turnOver, futuresRankItemPo.getLastPrice(), false, null, false, pTF.KWHzl.AEQbTJ(pTB.formatICUPercent$default(C33129mqd.EZpvd(futuresRankItemPo.getChangePer()), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null)), C41786qxQ.OLrzqt(C33129mqd.EZpvd(futuresRankItemPo.getChangePer())), false, false, false, false, null, null, false, strKWHzl, false, null, true, null, null, null, false, 0L, "", periodEnum, null, null, volume, null, null, -810028160, 6, null));
            i = i2;
        }
        return arrayList;
    }
}
