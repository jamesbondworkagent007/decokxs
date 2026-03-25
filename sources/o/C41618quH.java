package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ranking.core.engine.domain.GetHotRankUseCase$onExecute$1;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_find.data.HotRankResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41618quH extends AbstractC49400uno<C41622quL, java.util.List<? extends RankingHotCryptoVo>> {
    public final C41662quz AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC54577xNn OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41618quH(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = interfaceC54577xNn;
        this.AEQbTJ = c41662quz;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41622quL c41622quL, @NotNull Continuation<? super java.util.List<RankingHotCryptoVo>> continuation) throws java.lang.Throwable {
        GetHotRankUseCase$onExecute$1 getHotRankUseCase$onExecute$1;
        C41618quH c41618quH;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        C41618quH c41618quH2;
        java.util.List<RankingHotCryptoVo> listAEQbTJ;
        if (continuation instanceof GetHotRankUseCase$onExecute$1) {
            getHotRankUseCase$onExecute$1 = (GetHotRankUseCase$onExecute$1) continuation;
            int i = getHotRankUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHotRankUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getHotRankUseCase$onExecute$1 = new GetHotRankUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getHotRankUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getHotRankUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC54577xNn interfaceC54577xNn = this.OLrzqt;
            if (interfaceC54577xNn != null) {
                getHotRankUseCase$onExecute$1.L$0 = this;
                getHotRankUseCase$onExecute$1.L$1 = c41622quL;
                getHotRankUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, getHotRankUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c41618quH = this;
            } else {
                c41618quH = this;
                java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", c41622quL.copydefault()), C56390yDp.OLrzqt(TypedValues.CycleType.S_WAVE_PERIOD, c41622quL.KWHzl().getInputPara()), C56390yDp.OLrzqt("zone", c41622quL.gEmmrt()));
                C41662quz c41662quz = c41618quH.AEQbTJ;
                getHotRankUseCase$onExecute$1.L$0 = c41618quH;
                getHotRankUseCase$onExecute$1.L$1 = c41622quL;
                getHotRankUseCase$onExecute$1.label = 2;
                objAEQbTJ = c41662quz.AEQbTJ(mapGEmmrt, getHotRankUseCase$onExecute$1);
                if (objAEQbTJ != objCopydefault) {
                    return objCopydefault;
                }
                c41618quH2 = c41618quH;
                java.util.List<HotRankResponse> list = (java.util.List) objAEQbTJ;
                if (list != null) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c41622quL = (C41622quL) getHotRankUseCase$onExecute$1.L$1;
                c41618quH2 = (C41618quH) getHotRankUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                java.util.List<HotRankResponse> list2 = (java.util.List) objAEQbTJ;
                return (list2 != null || (listAEQbTJ = c41618quH2.AEQbTJ(list2, c41622quL.KWHzl())) == null) ? yDY.AhwBna() : listAEQbTJ;
            }
            c41622quL = (C41622quL) getHotRankUseCase$onExecute$1.L$1;
            c41618quH = (C41618quH) getHotRankUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            objM8790ensureInitialize0E7RQCE$default = ((Result) objAEQbTJ).m7386unboximpl();
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        java.util.Map<java.lang.String, java.lang.String> mapGEmmrt2 = C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", c41622quL.copydefault()), C56390yDp.OLrzqt(TypedValues.CycleType.S_WAVE_PERIOD, c41622quL.KWHzl().getInputPara()), C56390yDp.OLrzqt("zone", c41622quL.gEmmrt()));
        C41662quz c41662quz2 = c41618quH.AEQbTJ;
        getHotRankUseCase$onExecute$1.L$0 = c41618quH;
        getHotRankUseCase$onExecute$1.L$1 = c41622quL;
        getHotRankUseCase$onExecute$1.label = 2;
        objAEQbTJ = c41662quz2.AEQbTJ(mapGEmmrt2, getHotRankUseCase$onExecute$1);
        if (objAEQbTJ != objCopydefault) {
        }
    }

    public final java.util.List<RankingHotCryptoVo> AEQbTJ(java.util.List<HotRankResponse> list, PeriodEnum periodEnum) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            HotRankResponse hotRankResponse = (HotRankResponse) obj;
            java.lang.String turnOverV2 = hotRankResponse.getTurnOverV2();
            java.lang.String strEZpvd = C41786qxQ.EZpvd(hotRankResponse.getInstId());
            java.lang.String strKWHzl = C41786qxQ.KWHzl(hotRankResponse.getInstId());
            arrayList.add(new RankingHotCryptoVo(i2, hotRankResponse.getInstId(), hotRankResponse.getInstType(), hotRankResponse.getIconV2(), strEZpvd, turnOverV2, hotRankResponse.getLastPrice().length() == 0 ? "--" : pTB.formatLocalized$default(hotRankResponse.getLastPrice(), null, 1, null), false, null, false, pTF.KWHzl.AEQbTJ(pTB.formatICUPercent$default(C33129mqd.EZpvd(hotRankResponse.getChangePerV2()), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null)), C41786qxQ.OLrzqt(C33129mqd.EZpvd(hotRankResponse.getChangePerV2())), false, false, false, false, null, null, false, strKWHzl, false, null, true, null, null, null, false, 0L, null, periodEnum, null, null, null, null, null, -541592704, 7, null));
            i = i2;
        }
        return arrayList;
    }
}
