package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ranking.core.engine.domain.GetTurnoverRankUseCase$onExecute$1;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_find.data.TurnOverRank;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41620quJ extends AbstractC49400uno<C41622quL, java.util.List<? extends RankingHotCryptoVo>> {
    public final C41662quz AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

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
    public C41620quJ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = c41662quz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41622quL c41622quL, @NotNull Continuation<? super java.util.List<RankingHotCryptoVo>> continuation) throws java.lang.Throwable {
        GetTurnoverRankUseCase$onExecute$1 getTurnoverRankUseCase$onExecute$1;
        C41620quJ c41620quJ;
        java.util.List<RankingHotCryptoVo> listAEQbTJ;
        if (continuation instanceof GetTurnoverRankUseCase$onExecute$1) {
            getTurnoverRankUseCase$onExecute$1 = (GetTurnoverRankUseCase$onExecute$1) continuation;
            int i = getTurnoverRankUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTurnoverRankUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getTurnoverRankUseCase$onExecute$1 = new GetTurnoverRankUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objGEmmrt = getTurnoverRankUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTurnoverRankUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objGEmmrt);
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", c41622quL.copydefault()), C56390yDp.OLrzqt(TypedValues.CycleType.S_WAVE_PERIOD, c41622quL.KWHzl().getInputPara()));
            C41662quz c41662quz = this.AEQbTJ;
            getTurnoverRankUseCase$onExecute$1.L$0 = this;
            getTurnoverRankUseCase$onExecute$1.L$1 = c41622quL;
            getTurnoverRankUseCase$onExecute$1.label = 1;
            objGEmmrt = c41662quz.gEmmrt(mapGEmmrt, getTurnoverRankUseCase$onExecute$1);
            if (objGEmmrt == objCopydefault) {
                return objCopydefault;
            }
            c41620quJ = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41622quL = (C41622quL) getTurnoverRankUseCase$onExecute$1.L$1;
            c41620quJ = (C41620quJ) getTurnoverRankUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objGEmmrt);
        }
        java.util.List<TurnOverRank> list = (java.util.List) objGEmmrt;
        return (list == null || (listAEQbTJ = c41620quJ.AEQbTJ(list, c41622quL.KWHzl())) == null) ? yDY.AhwBna() : listAEQbTJ;
    }

    private final java.util.List<RankingHotCryptoVo> AEQbTJ(java.util.List<TurnOverRank> list, PeriodEnum periodEnum) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            TurnOverRank turnOverRank = (TurnOverRank) obj;
            java.lang.String strEZpvd = C41786qxQ.EZpvd(turnOverRank.getInstId());
            java.lang.String strKWHzl = C41786qxQ.KWHzl(turnOverRank.getInstId());
            java.lang.String instType = turnOverRank.getInstType();
            java.lang.String instId = turnOverRank.getInstId();
            java.lang.String localized$default = pTB.formatLocalized$default(turnOverRank.getLastPrice(), null, 1, null);
            java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(turnOverRank.getChangePerV2()), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null);
            int iOLrzqt = C41786qxQ.OLrzqt(C33129mqd.EZpvd(turnOverRank.getChangePerV2()));
            arrayList.add(new RankingHotCryptoVo(i2, instId, instType, turnOverRank.getIconV2(), strEZpvd, turnOverRank.getTurnOver(), localized$default, false, null, false, iCUPercent$default, iOLrzqt, false, false, false, false, null, null, false, strKWHzl, false, null, true, null, null, null, false, 0L, null, periodEnum, null, null, null, null, null, -541592704, 7, null));
            i = i2;
        }
        return arrayList;
    }
}
