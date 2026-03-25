package o;

import androidx.camera.video.AudioStats;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ranking.core.engine.domain.GetNewCoinRankUseCase$onExecute$1;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.core.model.RankingNewListPo;
import com.okinc.unify_find.data.NewCoinFuturesRankPo;
import com.okinc.unify_find.data.NewCoinGroupResponse;
import com.okinc.unify_find.data.NewCoinRank;
import com.okinc.unify_find.data.WaitOnlineRank;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C43035rhg;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41619quI extends AbstractC49400uno<C41622quL, RankingNewListPo> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final C41662quz AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C41619quI(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = c41662quz;
    }

    /* JADX INFO: renamed from: o.quI$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.quI.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41622quL c41622quL, @NotNull Continuation<? super RankingNewListPo> continuation) throws java.lang.Throwable {
        GetNewCoinRankUseCase$onExecute$1 getNewCoinRankUseCase$onExecute$1;
        C41619quI c41619quI;
        RankingNewListPo rankingNewListPoAEQbTJ;
        if (continuation instanceof GetNewCoinRankUseCase$onExecute$1) {
            getNewCoinRankUseCase$onExecute$1 = (GetNewCoinRankUseCase$onExecute$1) continuation;
            int i = getNewCoinRankUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNewCoinRankUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getNewCoinRankUseCase$onExecute$1 = new GetNewCoinRankUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getNewCoinRankUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getNewCoinRankUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.util.Map<java.lang.String, java.lang.String> mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("type", c41622quL.copydefault()));
            C41662quz c41662quz = this.AEQbTJ;
            getNewCoinRankUseCase$onExecute$1.L$0 = this;
            getNewCoinRankUseCase$onExecute$1.label = 1;
            objOLrzqt = c41662quz.OLrzqt(mapEZpvd, getNewCoinRankUseCase$onExecute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c41619quI = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41619quI = (C41619quI) getNewCoinRankUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.List<NewCoinGroupResponse> list = (java.util.List) objOLrzqt;
        return (list == null || (rankingNewListPoAEQbTJ = c41619quI.AEQbTJ(list)) == null) ? new RankingNewListPo(false, null, null, 7, null) : rankingNewListPoAEQbTJ;
    }

    public final RankingNewListPo AEQbTJ(java.util.List<NewCoinGroupResponse> list) {
        java.util.List<RankingHotCryptoVo> listAhwBna;
        java.util.List<RankingHotCryptoVo> listAhwBna2;
        java.util.List<RankingHotCryptoVo> listAhwBna3;
        java.util.List<RankingHotCryptoVo> listAhwBna4;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            C55631xnb c55631xnb = C55631xnb.AEQbTJ;
            java.util.ArrayList<NewCoinRank> arrayListAEQbTJ = c55631xnb.AEQbTJ(list.get(0).getOnline());
            java.util.ArrayList<WaitOnlineRank> arrayListAYXKKw = c55631xnb.AYXKKw(list.get(0).getWaitOnlineNew());
            java.util.ArrayList<NewCoinFuturesRankPo> arrayListKWHzl = c55631xnb.KWHzl(list.get(0).getFuturesOnline());
            java.util.ArrayList<WaitOnlineRank> arrayListAYXKKw2 = c55631xnb.AYXKKw(list.get(0).getFuturesWaitOnline());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (arrayListAYXKKw == null || (listAhwBna = AhwBna(arrayListAYXKKw)) == null) {
                listAhwBna = yDY.AhwBna();
            }
            arrayList.addAll(listAhwBna);
            if (arrayListAEQbTJ == null || (listAhwBna2 = KWHzl(arrayListAEQbTJ)) == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            arrayList.addAll(listAhwBna2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (arrayListAYXKKw2 == null || (listAhwBna3 = EZpvd(arrayListAYXKKw2)) == null) {
                listAhwBna3 = yDY.AhwBna();
            }
            arrayList2.addAll(listAhwBna3);
            if (arrayListKWHzl == null || (listAhwBna4 = copydefault(arrayListKWHzl)) == null) {
                listAhwBna4 = yDY.AhwBna();
            }
            arrayList2.addAll(listAhwBna4);
            return new RankingNewListPo(OLrzqt(arrayList), arrayList, arrayList2);
        }
        return new RankingNewListPo(false, null, null, 7, null);
    }

    public final java.util.List<RankingHotCryptoVo> AhwBna(java.util.List<WaitOnlineRank> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            WaitOnlineRank waitOnlineRank = (WaitOnlineRank) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) waitOnlineRank.getType(), (java.lang.Object) "2") && C55487xkq.KWHzl(waitOnlineRank)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        int i = 0;
        for (java.lang.Object obj2 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            WaitOnlineRank waitOnlineRank2 = (WaitOnlineRank) obj2;
            java.lang.String strEZpvd = C41786qxQ.EZpvd(waitOnlineRank2.getInstId());
            java.lang.String instId = waitOnlineRank2.getInstId();
            java.lang.String icon = waitOnlineRank2.getIcon();
            java.lang.String simpleDate$default = Intrinsics.EZpvd((java.lang.Object) waitOnlineRank2.getType(), (java.lang.Object) "0") ? pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(waitOnlineRank2.getOnlineTs())), null, 1, null) : "--";
            java.lang.String waitOnlineTime = waitOnlineRank2.getWaitOnlineTime();
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) waitOnlineRank2.getType(), (java.lang.Object) "0");
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) waitOnlineRank2.getType(), (java.lang.Object) "0") ? qZH.PendingIntent.getSessionID : qZH.PendingIntent.RihMUf);
            java.lang.String onlineTs = waitOnlineRank2.getOnlineTs();
            java.lang.String displayId = waitOnlineRank2.getDisplayId();
            java.lang.String instId2 = java.lang.Boolean.valueOf(C33129mqd.OLrzqt((java.lang.CharSequence) displayId)).booleanValue() ? displayId : null;
            if (instId2 == null) {
                instId2 = waitOnlineRank2.getInstId();
            }
            arrayList3.add(java.lang.Boolean.valueOf(arrayList.add(new RankingHotCryptoVo(i2, instId, "SPOT", icon, strEZpvd, simpleDate$default, null, false, null, false, null, 0, false, false, zEZpvd, true, strAYXKKw, waitOnlineTime, true, C41786qxQ.KWHzl(instId2), false, onlineTs, false, null, null, null, false, 0L, null, null, null, null, null, null, null, -7328448, 7, null))));
            i = i2;
        }
        return arrayList;
    }

    public final java.util.List<RankingHotCryptoVo> EZpvd(java.util.List<WaitOnlineRank> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            WaitOnlineRank waitOnlineRank = (WaitOnlineRank) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) waitOnlineRank.getType(), (java.lang.Object) "2") && C55487xkq.KWHzl(waitOnlineRank)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        int i = 0;
        for (java.lang.Object obj2 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            WaitOnlineRank waitOnlineRank2 = (WaitOnlineRank) obj2;
            java.lang.String str = C41786qxQ.EZpvd(waitOnlineRank2.getInstId()) + "USDT";
            java.lang.String instId = waitOnlineRank2.getInstId();
            java.lang.String icon = waitOnlineRank2.getIcon();
            java.lang.String simpleDate$default = Intrinsics.EZpvd((java.lang.Object) waitOnlineRank2.getType(), (java.lang.Object) "0") ? pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(waitOnlineRank2.getOnlineTs())), null, 1, null) : "--";
            java.lang.String waitOnlineTime = waitOnlineRank2.getWaitOnlineTime();
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) waitOnlineRank2.getType(), (java.lang.Object) "0");
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) waitOnlineRank2.getType(), (java.lang.Object) "0") ? qZH.PendingIntent.getSessionID : qZH.PendingIntent.RihMUf);
            java.lang.String onlineTs = waitOnlineRank2.getOnlineTs();
            java.lang.String displayId = waitOnlineRank2.getDisplayId();
            java.lang.String instId2 = java.lang.Boolean.valueOf(C33129mqd.OLrzqt((java.lang.CharSequence) displayId)).booleanValue() ? displayId : null;
            if (instId2 == null) {
                instId2 = waitOnlineRank2.getInstId();
            }
            arrayList3.add(java.lang.Boolean.valueOf(arrayList.add(new RankingHotCryptoVo(i2, instId, "SWAP", icon, str, simpleDate$default, null, false, null, false, null, 0, false, false, zEZpvd, true, strAYXKKw, waitOnlineTime, true, C41786qxQ.KWHzl(instId2), false, onlineTs, false, null, null, null, false, 0L, null, null, null, null, null, waitOnlineRank2.getRuleType(), null, -7328448, 5, null))));
            i = i2;
        }
        return arrayList;
    }

    public final boolean EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return C33129mqd.AEQbTJ(str) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(str2) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(str3) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(str4) == AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public final boolean OLrzqt(java.util.List<RankingHotCryptoVo> list) {
        if (list != null && !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((RankingHotCryptoVo) it.next()).isShowCountDown()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.util.List<RankingHotCryptoVo> KWHzl(java.util.List<NewCoinRank> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            NewCoinRank newCoinRank = (NewCoinRank) obj;
            java.lang.String strEZpvd = C55611xnH.EZpvd(newCoinRank.getChangePerDay24h(), newCoinRank.getChangePerDayUtc0(), newCoinRank.getChangePerDayUtc8());
            boolean zEZpvd = EZpvd(newCoinRank.getLastPrice(), newCoinRank.getChangePerDay24h(), newCoinRank.getChangePerDayUtc0(), newCoinRank.getChangePerDayUtc8());
            java.lang.String strEZpvd2 = C41786qxQ.EZpvd(newCoinRank.getInstId());
            java.lang.String instId = newCoinRank.getInstId();
            java.lang.String icon = newCoinRank.getIcon();
            java.lang.String localized$default = !zEZpvd ? pTB.formatLocalized$default(newCoinRank.getLastPrice(), null, 1, null) : "--";
            java.lang.String iCUPercent$default = zEZpvd ? "--" : pTB.formatICUPercent$default(C33129mqd.EZpvd(strEZpvd), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null);
            int iOLrzqt = !zEZpvd ? C41786qxQ.OLrzqt(C33129mqd.EZpvd(strEZpvd)) : 5;
            java.lang.String simpleDate$default = pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(newCoinRank.getOnlineTs())), null, 1, null);
            java.lang.String displayId = newCoinRank.getDisplayId();
            java.lang.String instId2 = C33129mqd.OLrzqt((java.lang.CharSequence) displayId) ? displayId : null;
            if (instId2 == null) {
                instId2 = newCoinRank.getInstId();
            }
            arrayList.add(new RankingHotCryptoVo(i2, instId, "SPOT", icon, strEZpvd2, simpleDate$default, localized$default, false, null, false, iCUPercent$default, iOLrzqt, false, false, false, false, null, null, true, C41786qxQ.KWHzl(instId2), false, null, false, null, null, null, false, 0L, null, null, null, null, null, null, newCoinRank.getState(), -4984448, 3, null));
            i = i2;
        }
        return arrayList;
    }

    public final java.util.List<RankingHotCryptoVo> copydefault(java.util.List<NewCoinFuturesRankPo> list) {
        java.lang.String strCopydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            NewCoinFuturesRankPo newCoinFuturesRankPo = (NewCoinFuturesRankPo) obj;
            boolean zEZpvd = EZpvd(newCoinFuturesRankPo.getLastPrice(), newCoinFuturesRankPo.getChangePerDay24h(), newCoinFuturesRankPo.getChangePerDayUtc0(), newCoinFuturesRankPo.getChangePerDayUtc8());
            java.lang.String strEZpvd = C55611xnH.EZpvd(newCoinFuturesRankPo.getChangePerDay24h(), newCoinFuturesRankPo.getChangePerDayUtc0(), newCoinFuturesRankPo.getChangePerDayUtc8());
            if (Intrinsics.EZpvd((java.lang.Object) newCoinFuturesRankPo.getInstType(), (java.lang.Object) "PREMARKET")) {
                strCopydefault = C33069mpW.copydefault(C43035rhg.Application.EZpvd, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", C41786qxQ.EZpvd(newCoinFuturesRankPo.getInstId()) + "USDT")));
            } else {
                strCopydefault = C41786qxQ.EZpvd(newCoinFuturesRankPo.getInstId()) + "USDT";
            }
            java.lang.String str = strCopydefault;
            java.lang.String str2 = "FUTURES";
            if (!Intrinsics.EZpvd((java.lang.Object) newCoinFuturesRankPo.getInstType(), (java.lang.Object) "PREMARKET") && !Intrinsics.EZpvd((java.lang.Object) newCoinFuturesRankPo.getInstType(), (java.lang.Object) "FUTURES")) {
                str2 = "SWAP";
            }
            java.lang.String instId = newCoinFuturesRankPo.getInstId();
            java.lang.String localized$default = !zEZpvd ? pTB.formatLocalized$default(newCoinFuturesRankPo.getLastPrice(), null, 1, null) : "--";
            java.lang.String icon = newCoinFuturesRankPo.getIcon();
            java.lang.String simpleDate$default = pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(newCoinFuturesRankPo.getOnlineTs())), null, 1, null);
            java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(strEZpvd), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null);
            int iOLrzqt = C41786qxQ.OLrzqt(C33129mqd.EZpvd(strEZpvd));
            java.lang.String strKWHzl = C41786qxQ.KWHzl(newCoinFuturesRankPo.getInstId());
            boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) newCoinFuturesRankPo.getInstType(), (java.lang.Object) "PREMARKET");
            java.lang.String alias = newCoinFuturesRankPo.getAlias();
            java.lang.String str3 = alias == null ? "" : alias;
            java.lang.String expTime = newCoinFuturesRankPo.getExpTime();
            arrayList.add(new RankingHotCryptoVo(i2, instId, str2, icon, str, simpleDate$default, localized$default, false, null, false, iCUPercent$default, iOLrzqt, false, false, false, false, null, null, false, strKWHzl, zEZpvd2, null, false, null, str3, expTime == null ? "" : expTime, false, 0L, null, null, null, null, null, newCoinFuturesRankPo.getRuleType(), null, -56364672, 5, null));
            i = i2;
        }
        return arrayList;
    }
}
