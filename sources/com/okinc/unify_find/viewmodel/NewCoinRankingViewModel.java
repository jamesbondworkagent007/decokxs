package com.okinc.unify_find.viewmodel;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.MutableLiveData;
import com.okinc.core.util.SPUtils;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_find.data.NewCoinFuturesRankPo;
import com.okinc.unify_find.data.NewCoinGroupResponse;
import com.okinc.unify_find.data.NewCoinRank;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.data.RankListRequestGroup;
import com.okinc.unify_find.data.WaitOnlineRank;
import com.okinc.unify_find.viewmodel.NewCoinRankingViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC55470xkZ;
import o.AbstractC58185ywX;
import o.C33129mqd;
import o.C49380unU;
import o.C55487xkq;
import o.C55488xkr;
import o.C55611xnH;
import o.C56403yEb;
import o.C58266yxz;
import o.C59449zhJ;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.pUU;
import o.pWT;
import o.yBP;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class NewCoinRankingViewModel extends RankModel {
    public String AYXKKw;
    public InterfaceC58217yxC EZpvd;
    public boolean valueOf;
    public final MutableLiveData<Unit> OLrzqt = new MutableLiveData<>();
    public final MutableLiveData<Unit> copydefault = new MutableLiveData<>();
    public final MutableLiveData<Unit> AhwBna = new MutableLiveData<>();
    public final ArrayList<AbstractC55470xkZ> values = new ArrayList<>();
    public final ArrayList<AbstractC55470xkZ> djBIcL = new ArrayList<>();
    public final ArrayList<AbstractC55470xkZ> AEQbTJ = new ArrayList<>();
    public final ArrayList<AbstractC55470xkZ> KWHzl = new ArrayList<>();
    public String gEmmrt = "0";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AbstractC55470xkZ> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AbstractC55470xkZ> AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AbstractC55470xkZ> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AbstractC55470xkZ> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> gEmmrt() {
        return this.AhwBna;
    }

    @Override // com.okinc.unify_find.viewmodel.RankModel
    public void EZpvd(final Boolean bool) {
        pUU.EZpvd("NewCoin", "NewCoinRankingViewModel refresh invoke, isHome: " + bool);
        super.EZpvd(bool);
        this.valueOf = Intrinsics.EZpvd(bool, Boolean.TRUE);
        InterfaceC58217yxC interfaceC58217yxCFARcdN = fARcdN();
        if (interfaceC58217yxCFARcdN != null) {
            interfaceC58217yxCFARcdN.dispose();
        }
        KWHzl(OLrzqt(new Function1() { // from class: o.xny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return NewCoinRankingViewModel.EZpvd(this.EZpvd, bool, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
    }

    public static final Unit EZpvd(NewCoinRankingViewModel newCoinRankingViewModel, Boolean bool, boolean z) {
        newCoinRankingViewModel.KWHzl(bool);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadNewCoinRanking$default(NewCoinRankingViewModel newCoinRankingViewModel, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        newCoinRankingViewModel.KWHzl(bool);
    }

    public final void KWHzl(final Boolean bool) {
        pUU.EZpvd("NewCoin", "NewCoinRankingViewModel loadNewCoinRanking invoke, isHome: " + bool);
        String str = this.gEmmrt;
        Boolean bool2 = Boolean.TRUE;
        RankListRequestGroup rankListRequestGroup = new RankListRequestGroup(Intrinsics.EZpvd(bool, bool2), false, new RankListRequest((String) null, (String) null, Intrinsics.EZpvd(bool, bool2) ? AuCTel() : iwGUEr(), str, (String) null, (String) null, this.AYXKKw, 51, (DefaultConstructorMarker) null), 2, (DefaultConstructorMarker) null);
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<SourceResp<NewCoinGroupResponse>> abstractC58185ywXKWHzl = C55488xkr.KWHzl.AEQbTJ(rankListRequestGroup, bool).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.xnn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return NewCoinRankingViewModel.AEQbTJ(this.KWHzl, bool, (SourceResp) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.xnr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return NewCoinRankingViewModel.EZpvd(function1, obj);
            }
        }).KWHzl(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xns
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return NewCoinRankingViewModel.OLrzqt(this.KWHzl, bool, (Quartet) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xnq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                NewCoinRankingViewModel.gEmmrt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.xnp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return NewCoinRankingViewModel.EZpvd(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        this.EZpvd = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xnt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                NewCoinRankingViewModel.AEQbTJ(function13, obj);
            }
        });
    }

    public static final Quartet EZpvd(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Quartet) function1.invoke(obj);
    }

    public static final Quartet AEQbTJ(NewCoinRankingViewModel newCoinRankingViewModel, Boolean bool, SourceResp sourceResp) {
        Quartet<List<AbstractC55470xkZ>, List<AbstractC55470xkZ>, List<AbstractC55470xkZ>, List<AbstractC55470xkZ>> quartetAEQbTJ;
        Intrinsics.checkNotNullParameter(sourceResp, "");
        NewCoinGroupResponse newCoinGroupResponse = (NewCoinGroupResponse) sourceResp.getData();
        return (newCoinGroupResponse == null || (quartetAEQbTJ = newCoinRankingViewModel.AEQbTJ(bool, C49380unU.AEQbTJ(C49380unU.copydefault(C49380unU.OLrzqt(newCoinGroupResponse.getWaitOnlineNew(), newCoinGroupResponse.getOnline()), newCoinGroupResponse.getFuturesOnline()), newCoinGroupResponse.getFuturesWaitOnline()))) == null) ? new Quartet(yDY.AhwBna(), yDY.AhwBna(), null, null) : quartetAEQbTJ;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(NewCoinRankingViewModel newCoinRankingViewModel, Boolean bool, Quartet quartet) {
        pUU.EZpvd("NewCoin", "NewCoinRankingViewModel onSubscribe ok, " + quartet);
        newCoinRankingViewModel.values.clear();
        newCoinRankingViewModel.values.addAll((Collection) quartet.getFirst());
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            Iterable iterable = (Iterable) quartet.getSecond();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC55470xkZ) it.next()).KWHzl());
            }
            newCoinRankingViewModel.KWHzl(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.OqFWZa(arrayList)));
        }
        newCoinRankingViewModel.AEQbTJ.clear();
        newCoinRankingViewModel.AEQbTJ.addAll((Collection) quartet.getSecond());
        newCoinRankingViewModel.djBIcL.clear();
        List list = (List) quartet.getFourth();
        if (list != null) {
            newCoinRankingViewModel.djBIcL.addAll(list);
        }
        newCoinRankingViewModel.KWHzl.clear();
        List list2 = (List) quartet.getThird();
        if (list2 != null) {
            newCoinRankingViewModel.KWHzl.addAll(list2);
        }
        MutableLiveData<Unit> mutableLiveData = newCoinRankingViewModel.OLrzqt;
        Unit unit = Unit.INSTANCE;
        mutableLiveData.setValue(unit);
        MutableLiveData<Boolean> mutableLiveDataAkhnZx = newCoinRankingViewModel.AkhnZx();
        Boolean bool2 = Boolean.FALSE;
        mutableLiveDataAkhnZx.setValue(bool2);
        if (!newCoinRankingViewModel.values.isEmpty()) {
            newCoinRankingViewModel.copydefault.setValue(unit);
        }
        if (!newCoinRankingViewModel.djBIcL.isEmpty()) {
            newCoinRankingViewModel.AhwBna.setValue(unit);
        }
        newCoinRankingViewModel.ejfBZ().setValue(bool2);
        newCoinRankingViewModel.AkhnZx().setValue(bool2);
        return unit;
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(NewCoinRankingViewModel newCoinRankingViewModel, Throwable th) {
        pUU.EZpvd("NewCoin", "NewCoinRankingViewModel onSubscribe error, " + th);
        newCoinRankingViewModel.AkhnZx().setValue(Boolean.FALSE);
        newCoinRankingViewModel.ejfBZ().setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Quartet convertResponse$default(NewCoinRankingViewModel newCoinRankingViewModel, Boolean bool, Quartet quartet, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        return newCoinRankingViewModel.AEQbTJ(bool, (Quartet<? extends List<WaitOnlineRank>, ? extends List<NewCoinRank>, ? extends List<NewCoinFuturesRankPo>, ? extends List<WaitOnlineRank>>) quartet);
    }

    public final Quartet<List<AbstractC55470xkZ>, List<AbstractC55470xkZ>, List<AbstractC55470xkZ>, List<AbstractC55470xkZ>> AEQbTJ(Boolean bool, Quartet<? extends List<WaitOnlineRank>, ? extends List<NewCoinRank>, ? extends List<NewCoinFuturesRankPo>, ? extends List<WaitOnlineRank>> quartet) {
        ArrayList<WaitOnlineRank> arrayList;
        ArrayList<WaitOnlineRank> arrayList2;
        ArrayList arrayList3;
        pUU.KWHzl("NewCoin", "NewCoinRankingViewModel convertResponse");
        ArrayList<AbstractC55470xkZ> arrayList4 = new ArrayList<>();
        List<WaitOnlineRank> first = quartet.getFirst();
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : first) {
                if (C55487xkq.KWHzl((WaitOnlineRank) obj)) {
                    arrayList5.add(obj);
                }
            }
            arrayList = OLrzqt(new ArrayList(arrayList5));
        } else {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : first) {
                if (C55487xkq.KWHzl((WaitOnlineRank) obj2)) {
                    arrayList6.add(obj2);
                }
            }
            arrayList = new ArrayList<>(arrayList6);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            WaitOnlineRank waitOnlineRank = arrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(waitOnlineRank, "");
            if (OLrzqt(waitOnlineRank)) {
                OLrzqt(arrayList4, arrayList, i);
            } else {
                WaitOnlineRank waitOnlineRank2 = arrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(waitOnlineRank2, "");
                if (copydefault(waitOnlineRank2)) {
                    OLrzqt(arrayList4, arrayList, i);
                }
            }
        }
        int size2 = arrayList4.size();
        List<NewCoinRank> second = quartet.getSecond();
        ArrayList arrayList7 = new ArrayList();
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            if (arrayList4.size() >= fIwbmz()) {
                arrayList7 = new ArrayList();
                Unit unit = Unit.INSTANCE;
            } else {
                ArrayList arrayListKWHzl = KWHzl(Integer.valueOf(fIwbmz() - arrayList4.size()), new ArrayList(second));
                ArrayList arrayList8 = new ArrayList(C56403yEb.AYXKKw(arrayListKWHzl, 10));
                int i2 = 0;
                for (Object obj3 : arrayListKWHzl) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    NewCoinRank newCoinRank = (NewCoinRank) obj3;
                    AbstractC55470xkZ.ActionBar actionBar = new AbstractC55470xkZ.ActionBar(null, newCoinRank.getIcon(), "", "", newCoinRank.getOnlineTs(), newCoinRank.getLastPrice(), C55611xnH.EZpvd(newCoinRank.getChangePerDay24h(), newCoinRank.getChangePerDayUtc0(), newCoinRank.getChangePerDayUtc8()), C33129mqd.AEQbTJ(newCoinRank.getLastPrice()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(newCoinRank.getChangePerDay24h()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(newCoinRank.getChangePerDayUtc0()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(newCoinRank.getChangePerDayUtc8()) == AudioStats.AUDIO_AMPLITUDE_NONE, null, newCoinRank.getDisplayId(), newCoinRank.getRuleType(), newCoinRank.getState(), 257, null);
                    actionBar.AEQbTJ(newCoinRank.getInstId());
                    actionBar.copydefault(Boolean.valueOf(AYXKKw(valueOf(newCoinRank.getInstId()))));
                    EZpvd(newCoinRank.getInstId(), actionBar, newCoinRank.getDisplayId());
                    actionBar.AEQbTJ(i2 + size2);
                    arrayList8.add(actionBar);
                    i2++;
                }
                arrayList7.addAll(arrayList8);
            }
        } else {
            ArrayList arrayList9 = new ArrayList(C56403yEb.AYXKKw(second, 10));
            int i3 = 0;
            for (Object obj4 : second) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                NewCoinRank newCoinRank2 = (NewCoinRank) obj4;
                AbstractC55470xkZ.ActionBar actionBar2 = new AbstractC55470xkZ.ActionBar(null, newCoinRank2.getIcon(), "", "", newCoinRank2.getOnlineTs(), newCoinRank2.getLastPrice(), C55611xnH.EZpvd(newCoinRank2.getChangePerDay24h(), newCoinRank2.getChangePerDayUtc0(), newCoinRank2.getChangePerDayUtc8()), C33129mqd.AEQbTJ(newCoinRank2.getLastPrice()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(newCoinRank2.getChangePerDay24h()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(newCoinRank2.getChangePerDayUtc0()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(newCoinRank2.getChangePerDayUtc8()) == AudioStats.AUDIO_AMPLITUDE_NONE, null, newCoinRank2.getDisplayId(), newCoinRank2.getRuleType(), newCoinRank2.getState(), 257, null);
                actionBar2.AEQbTJ(newCoinRank2.getInstId());
                actionBar2.copydefault(Boolean.valueOf(AYXKKw(valueOf(newCoinRank2.getInstId()))));
                EZpvd(newCoinRank2.getInstId(), actionBar2, newCoinRank2.getDisplayId());
                actionBar2.AEQbTJ(i3 + size2);
                arrayList9.add(actionBar2);
                i3++;
            }
            arrayList7.addAll(arrayList9);
        }
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool2) && arrayList7.size() + arrayList.size() >= 7) {
            arrayList7.add(new AbstractC55470xkZ.Application(3));
        }
        pUU.EZpvd("RankModel", "NewCoinRankingViewModel convertResponse, spotList size: " + arrayList7.size());
        ArrayList<AbstractC55470xkZ> arrayList10 = new ArrayList<>();
        List<WaitOnlineRank> fourth = quartet.getFourth();
        if (Intrinsics.EZpvd(bool, bool2)) {
            if (fourth != null) {
                arrayList3 = new ArrayList();
                for (Object obj5 : fourth) {
                    if (C55487xkq.KWHzl((WaitOnlineRank) obj5)) {
                        arrayList3.add(obj5);
                    }
                }
            } else {
                arrayList3 = null;
            }
            arrayList2 = OLrzqt(new ArrayList(arrayList3));
        } else {
            ArrayList arrayList11 = new ArrayList();
            for (Object obj6 : first) {
                if (C55487xkq.KWHzl((WaitOnlineRank) obj6)) {
                    arrayList11.add(obj6);
                }
            }
            arrayList2 = new ArrayList<>(arrayList11);
        }
        int size3 = arrayList2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            WaitOnlineRank waitOnlineRank3 = arrayList2.get(i4);
            Intrinsics.checkNotNullExpressionValue(waitOnlineRank3, "");
            if (OLrzqt(waitOnlineRank3)) {
                OLrzqt(arrayList10, arrayList2, i4);
            } else {
                WaitOnlineRank waitOnlineRank4 = arrayList2.get(i4);
                Intrinsics.checkNotNullExpressionValue(waitOnlineRank4, "");
                if (copydefault(waitOnlineRank4)) {
                    OLrzqt(arrayList10, arrayList2, i4);
                }
            }
        }
        int size4 = arrayList10.size();
        List<NewCoinFuturesRankPo> third = quartet.getThird();
        ArrayList arrayList12 = new ArrayList();
        if (Intrinsics.EZpvd(bool, Boolean.TRUE) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) "USDT") && third != null) {
            if (arrayList10.size() < fIwbmz()) {
                ArrayList arrayListKWHzl2 = KWHzl(Integer.valueOf(fIwbmz() - arrayList10.size()), new ArrayList(third));
                ArrayList arrayList13 = new ArrayList(C56403yEb.AYXKKw(arrayListKWHzl2, 10));
                int i5 = 0;
                for (Object obj7 : arrayListKWHzl2) {
                    if (i5 < 0) {
                        yDY.AYXKKw();
                    }
                    NewCoinFuturesRankPo newCoinFuturesRankPo = (NewCoinFuturesRankPo) obj7;
                    AbstractC55470xkZ.ActionBar actionBar3 = new AbstractC55470xkZ.ActionBar(newCoinFuturesRankPo.getInstType(), newCoinFuturesRankPo.getIcon(), "", "", newCoinFuturesRankPo.getOnlineTs(), newCoinFuturesRankPo.getLastPrice(), C55611xnH.EZpvd(newCoinFuturesRankPo.getChangePerDay24h(), newCoinFuturesRankPo.getChangePerDayUtc0(), newCoinFuturesRankPo.getChangePerDayUtc8()), C33129mqd.AEQbTJ(newCoinFuturesRankPo.getLastPrice()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(newCoinFuturesRankPo.getChangePerDay24h()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(newCoinFuturesRankPo.getChangePerDayUtc0()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(newCoinFuturesRankPo.getChangePerDayUtc8()) == AudioStats.AUDIO_AMPLITUDE_NONE, newCoinFuturesRankPo, null, newCoinFuturesRankPo.getRuleType(), null, 2560, null);
                    actionBar3.AEQbTJ(newCoinFuturesRankPo.getInstId());
                    Intrinsics.copydefault(newCoinFuturesRankPo);
                    actionBar3.copydefault(Boolean.valueOf(KWHzl(newCoinFuturesRankPo)));
                    EZpvd(newCoinFuturesRankPo.getInstId(), actionBar3, actionBar3.djBIcL());
                    actionBar3.AEQbTJ(i5 + size4);
                    arrayList13.add(actionBar3);
                    i5++;
                }
                arrayList12.addAll(arrayList13);
            }
            if (arrayList12.size() + size4 >= 7) {
                arrayList12.add(new AbstractC55470xkZ.Application(3));
            }
            pUU.EZpvd("RankModel", "NewCoinRankingViewModel convertResponse, FuturesList size: " + arrayList12.size());
        }
        return C49380unU.AEQbTJ(C49380unU.copydefault(C49380unU.OLrzqt(arrayList4, arrayList7), arrayList12), arrayList10);
    }

    public final boolean KWHzl(NewCoinFuturesRankPo newCoinFuturesRankPo) {
        return uzCIH().EZpvd(newCoinFuturesRankPo.toFuturesWatchingListData$OKMarket_market_impl());
    }

    public final void OLrzqt(ArrayList<AbstractC55470xkZ> arrayList, ArrayList<WaitOnlineRank> arrayList2, int i) {
        String icon = arrayList2.get(i).getIcon();
        String onlineTs = arrayList2.get(i).getOnlineTs();
        String waitOnlineTime = arrayList2.get(i).getWaitOnlineTime();
        String noticeUrlCn = arrayList2.get(i).getNoticeUrlCn();
        String noticeUrlEn = arrayList2.get(i).getNoticeUrlEn();
        String type = arrayList2.get(i).getType();
        WaitOnlineRank waitOnlineRank = arrayList2.get(i);
        Intrinsics.checkNotNullExpressionValue(waitOnlineRank, "");
        AbstractC55470xkZ.StateListAnimator stateListAnimator = new AbstractC55470xkZ.StateListAnimator(icon, "", "", onlineTs, waitOnlineTime, noticeUrlCn, noticeUrlEn, type, C55487xkq.KWHzl(waitOnlineRank), arrayList2.get(i).getDisplayId(), arrayList2.get(i).getRuleType());
        stateListAnimator.AEQbTJ(arrayList2.get(i).getInstId());
        stateListAnimator.copydefault(Boolean.valueOf(AYXKKw(valueOf(stateListAnimator.copydefault()))));
        EZpvd(arrayList2.get(i).getInstId(), stateListAnimator, arrayList2.get(i).getDisplayId());
        stateListAnimator.AEQbTJ(i);
        arrayList.add(stateListAnimator);
    }

    public final boolean djBIcL() {
        String string = SPUtils.getString("sp_lang_setting", null, pWT.EZpvd.copydefault());
        if (string == null || StringsKt__StringsKt.fARcdN((CharSequence) string)) {
            string = Locale.getDefault().getLanguage();
        }
        Intrinsics.copydefault((Object) string);
        return C59449zhJ.startsWith$default(string, "zh", false, 2, null);
    }

    public final boolean OLrzqt(WaitOnlineRank waitOnlineRank) {
        return djBIcL() && waitOnlineRank.getNoticeUrlCn().length() > 0;
    }

    public final boolean copydefault(WaitOnlineRank waitOnlineRank) {
        return !djBIcL() && waitOnlineRank.getNoticeUrlEn().length() > 0;
    }

    @Override // com.okinc.unify_find.viewmodel.RankModel
    public void bA_() {
        super.bA_();
        InterfaceC58217yxC interfaceC58217yxCFARcdN = fARcdN();
        if (interfaceC58217yxCFARcdN != null) {
            interfaceC58217yxCFARcdN.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }
}
