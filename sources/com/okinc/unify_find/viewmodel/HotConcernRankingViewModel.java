package com.okinc.unify_find.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_find.data.HotRankResponse;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.data.RankListRequestGroup;
import com.okinc.unify_find.viewmodel.HotConcernRankingViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55524xla;
import o.AbstractC58185ywX;
import o.C55488xkr;
import o.C55611xnH;
import o.C56403yEb;
import o.C58266yxz;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.pUU;
import o.yBP;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class HotConcernRankingViewModel extends RankModel {
    public InterfaceC58217yxC AEQbTJ;
    public String AYXKKw;
    public String AhwBna;
    public List<String> KWHzl;
    public String djBIcL;
    public boolean valueOf;
    public final MutableLiveData<Unit> EZpvd = new MutableLiveData<>();
    public ArrayList<AbstractC55524xla> OLrzqt = new ArrayList<>();
    public String copydefault = "0";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AbstractC55524xla> OLrzqt() {
        return this.OLrzqt;
    }

    @Override // com.okinc.unify_find.viewmodel.RankModel
    public void EZpvd(final Boolean bool) {
        super.EZpvd(bool);
        InterfaceC58217yxC interfaceC58217yxCFARcdN = fARcdN();
        if (interfaceC58217yxCFARcdN != null) {
            interfaceC58217yxCFARcdN.dispose();
        }
        KWHzl(OLrzqt(new Function1() { // from class: o.xnl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HotConcernRankingViewModel.EZpvd(this.KWHzl, bool, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
    }

    public static final Unit EZpvd(HotConcernRankingViewModel hotConcernRankingViewModel, Boolean bool, boolean z) {
        hotConcernRankingViewModel.OLrzqt(bool);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadHotConcernRanking$default(HotConcernRankingViewModel hotConcernRankingViewModel, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        hotConcernRankingViewModel.OLrzqt(bool);
    }

    public final void OLrzqt(final Boolean bool) {
        Objects.toString(bool);
        String str = this.djBIcL;
        String str2 = this.AYXKKw;
        String str3 = this.copydefault;
        Boolean bool2 = Boolean.TRUE;
        RankListRequestGroup rankListRequestGroup = new RankListRequestGroup(Intrinsics.EZpvd(bool, bool2), false, new RankListRequest(str, str2, Intrinsics.EZpvd(bool, bool2) ? AuCTel() : iwGUEr(), str3, (String) null, (String) null, this.AhwBna, 48, (DefaultConstructorMarker) null), 2, (DefaultConstructorMarker) null);
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<SourceResp<ArrayList<HotRankResponse>>> abstractC58185ywXKWHzl = C55488xkr.KWHzl.copydefault(rankListRequestGroup, bool).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.xnc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HotConcernRankingViewModel.EZpvd(bool, this, (SourceResp) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.xnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return HotConcernRankingViewModel.OLrzqt(function1, obj);
            }
        }).KWHzl(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xng
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HotConcernRankingViewModel.OLrzqt(bool, this, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xni
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                HotConcernRankingViewModel.AEQbTJ(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.xnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HotConcernRankingViewModel.KWHzl(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        this.AEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                HotConcernRankingViewModel.AhwBna(function13, obj);
            }
        });
    }

    public static final List OLrzqt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final List EZpvd(Boolean bool, HotConcernRankingViewModel hotConcernRankingViewModel, SourceResp sourceResp) {
        Intrinsics.checkNotNullParameter(sourceResp, "");
        pUU.KWHzl("RankModel", "loadHotConcernRanking() convertResponse: isHome = " + bool);
        if (sourceResp.getData() != null) {
            Object data = sourceResp.getData();
            Intrinsics.copydefault(data);
            return hotConcernRankingViewModel.copydefault((ArrayList<HotRankResponse>) data, bool);
        }
        return yDY.AhwBna();
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Boolean bool, HotConcernRankingViewModel hotConcernRankingViewModel, List list) {
        pUU.KWHzl("RankModel", "loadHotConcernRanking() receive data : isHome = " + bool);
        hotConcernRankingViewModel.OLrzqt.clear();
        hotConcernRankingViewModel.OLrzqt.addAll(list);
        hotConcernRankingViewModel.AEQbTJ();
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            ArrayList<AbstractC55524xla> arrayList = hotConcernRankingViewModel.OLrzqt;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AbstractC55524xla) it.next()).KWHzl());
            }
            hotConcernRankingViewModel.KWHzl(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.OqFWZa(arrayList2)));
        }
        MutableLiveData<Boolean> mutableLiveDataAkhnZx = hotConcernRankingViewModel.AkhnZx();
        Boolean bool2 = Boolean.FALSE;
        mutableLiveDataAkhnZx.setValue(bool2);
        MutableLiveData<Unit> mutableLiveData = hotConcernRankingViewModel.EZpvd;
        Unit unit = Unit.INSTANCE;
        mutableLiveData.setValue(unit);
        hotConcernRankingViewModel.ejfBZ().setValue(bool2);
        return unit;
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(HotConcernRankingViewModel hotConcernRankingViewModel, Throwable th) {
        hotConcernRankingViewModel.AkhnZx().setValue(Boolean.FALSE);
        hotConcernRankingViewModel.ejfBZ().setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ArrayList convertResponse$default(HotConcernRankingViewModel hotConcernRankingViewModel, ArrayList arrayList, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = Boolean.FALSE;
        }
        return hotConcernRankingViewModel.copydefault((ArrayList<HotRankResponse>) arrayList, bool);
    }

    public final ArrayList<AbstractC55524xla> copydefault(ArrayList<HotRankResponse> arrayList, Boolean bool) {
        ArrayList<AbstractC55524xla> arrayList2 = new ArrayList<>();
        ArrayList<HotRankResponse> arrayListOLrzqt = Intrinsics.EZpvd(bool, Boolean.TRUE) ? OLrzqt(arrayList) : arrayList;
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayListOLrzqt, 10));
        int i = 0;
        for (Object obj : arrayListOLrzqt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            HotRankResponse hotRankResponse = (HotRankResponse) obj;
            AbstractC55524xla.Application application = new AbstractC55524xla.Application("", "", hotRankResponse.getHotIndex(), hotRankResponse.getLastPrice(), C55611xnH.EZpvd(hotRankResponse.getChangePerDay24h(), hotRankResponse.getChangePerDayUtc0(), hotRankResponse.getChangePerDayUtc8()), hotRankResponse.getIconV2(), hotRankResponse.getVolumeV2(), hotRankResponse.getTurnOverV2(), hotRankResponse.getFullNameV2(), hotRankResponse.getCcyV2(), hotRankResponse.getDisplayId());
            application.AEQbTJ(hotRankResponse.getInstId());
            application.copydefault(Boolean.valueOf(AYXKKw(valueOf(hotRankResponse.getInstId()))));
            EZpvd(hotRankResponse.getInstId(), application, application.AYXKKw());
            application.AEQbTJ(i);
            arrayList3.add(application);
            i++;
        }
        arrayList2.addAll(arrayList3);
        if (Intrinsics.EZpvd(bool, Boolean.TRUE) && arrayList2.size() >= 7) {
            arrayList2.add(new AbstractC55524xla.StateListAnimator(0));
        }
        if (!this.valueOf || arrayList2.size() < 30) {
            return arrayList2;
        }
        ArrayList<AbstractC55524xla> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2.subList(0, 30));
        return arrayList4;
    }

    @Override // com.okinc.unify_find.viewmodel.RankModel
    public void bA_() {
        super.bA_();
        InterfaceC58217yxC interfaceC58217yxCFARcdN = fARcdN();
        if (interfaceC58217yxCFARcdN != null) {
            interfaceC58217yxCFARcdN.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.ArrayList<o.xla> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        List<String> list = this.KWHzl;
        if (list != null) {
            ArrayList<AbstractC55524xla> arrayList = this.OLrzqt;
            ArrayList<AbstractC55524xla> arrayList2 = new ArrayList<>();
            for (Object obj : arrayList) {
                if (list.contains(((AbstractC55524xla) obj).copydefault())) {
                    arrayList2.add(obj);
                }
            }
            this.OLrzqt = arrayList2;
        }
    }
}
