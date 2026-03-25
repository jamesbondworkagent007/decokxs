package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.ranking.core.engine.domain.GetUpDownRankUseCase$onExecute$1;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_find.data.UpDownRank;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41623quM extends AbstractC49400uno<C41622quL, java.util.List<? extends RankingHotCryptoVo>> {
    public final CoroutineDispatcher AEQbTJ;
    public final C41662quz OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C41623quM(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = c41662quz;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41622quL c41622quL, @NotNull Continuation<? super java.util.List<RankingHotCryptoVo>> continuation) throws java.lang.Throwable {
        GetUpDownRankUseCase$onExecute$1 getUpDownRankUseCase$onExecute$1;
        C41623quM c41623quM;
        java.util.Map map;
        java.util.List<UpDownRank> list;
        java.util.List<RankingHotCryptoVo> listCopydefault;
        if (continuation instanceof GetUpDownRankUseCase$onExecute$1) {
            getUpDownRankUseCase$onExecute$1 = (GetUpDownRankUseCase$onExecute$1) continuation;
            int i = getUpDownRankUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getUpDownRankUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getUpDownRankUseCase$onExecute$1 = new GetUpDownRankUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = getUpDownRankUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getUpDownRankUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", c41622quL.copydefault()), C56390yDp.OLrzqt(TypedValues.CycleType.S_WAVE_PERIOD, c41622quL.KWHzl().getInputPara()), C56390yDp.OLrzqt("zone", c41622quL.gEmmrt()), C56390yDp.OLrzqt("rank", c41622quL.AEQbTJ()));
            C41662quz c41662quz = this.OLrzqt;
            getUpDownRankUseCase$onExecute$1.L$0 = this;
            getUpDownRankUseCase$onExecute$1.L$1 = c41622quL;
            getUpDownRankUseCase$onExecute$1.label = 1;
            objValueOf = c41662quz.valueOf(mapGEmmrt, getUpDownRankUseCase$onExecute$1);
            if (objValueOf == objCopydefault) {
                return objCopydefault;
            }
            c41623quM = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41622quL = (C41622quL) getUpDownRankUseCase$onExecute$1.L$1;
            c41623quM = (C41623quM) getUpDownRankUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objValueOf);
        }
        java.util.List list2 = (java.util.List) objValueOf;
        return (list2 == null || (map = (java.util.Map) list2.get(0)) == null || (list = (java.util.List) map.get(C55488xkr.KWHzl.KWHzl(c41622quL.gEmmrt()))) == null || (listCopydefault = c41623quM.copydefault(list, c41622quL.KWHzl())) == null) ? yDY.AhwBna() : listCopydefault;
    }

    private final java.util.List<RankingHotCryptoVo> copydefault(java.util.List<UpDownRank> list, PeriodEnum periodEnum) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            UpDownRank upDownRank = (UpDownRank) obj;
            java.lang.String strEZpvd = C41786qxQ.EZpvd(upDownRank.getInstId());
            java.lang.String strKWHzl = C41786qxQ.KWHzl(upDownRank.getInstId());
            java.lang.String instType = upDownRank.getInstType();
            arrayList.add(new RankingHotCryptoVo(i2, upDownRank.getInstId(), instType, upDownRank.getIconV2(), strEZpvd, upDownRank.getTurnOverV2(), pTB.formatLocalized$default(upDownRank.getLastPrice(), null, 1, null), false, null, false, C41786qxQ.OLrzqt(upDownRank.getChangePer()), C41786qxQ.OLrzqt(C33129mqd.EZpvd(upDownRank.getChangePer())), false, false, false, false, null, null, false, strKWHzl, false, null, true, null, null, null, false, 0L, null, periodEnum, null, null, null, null, null, -541592704, 7, null));
            i = i2;
        }
        return arrayList;
    }
}
