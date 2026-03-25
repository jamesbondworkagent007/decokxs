package com.okinc.unify_find.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.data.RankListRequestGroup;
import com.okinc.unify_find.data.UpDownRank;
import com.okinc.unify_find.viewmodel.PercentChangeRankingViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55526xlc;
import o.AbstractC58185ywX;
import o.C55488xkr;
import o.C55611xnH;
import o.C56403yEb;
import o.C58266yxz;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.yBP;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public abstract class PercentChangeRankingViewModel extends RankModel {
    public String AYXKKw;
    public String DbNXlk;
    public String djBIcL;
    public InterfaceC58217yxC gEmmrt;
    public String values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final String copydefault = "24h";
    public static final String KWHzl = "utc0";
    public static final String EZpvd = "utc8";
    public final MutableLiveData<Unit> valueOf = new MutableLiveData<>();
    public final ArrayList<AbstractC55526xlc> AhwBna = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> AhwBna() {
        return this.valueOf;
    }

    public abstract String EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(String str) {
        this.DbNXlk = str;
    }

    public abstract boolean copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AbstractC55526xlc> djBIcL() {
        return this.AhwBna;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.viewmodel.PercentChangeRankingViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String copydefault() {
            return PercentChangeRankingViewModel.copydefault;
        }

        public final String KWHzl() {
            return PercentChangeRankingViewModel.KWHzl;
        }

        public final String AEQbTJ() {
            return PercentChangeRankingViewModel.EZpvd;
        }
    }

    @Override // com.okinc.unify_find.viewmodel.RankModel
    public void EZpvd(final Boolean bool) {
        super.EZpvd(bool);
        InterfaceC58217yxC interfaceC58217yxCFARcdN = fARcdN();
        if (interfaceC58217yxCFARcdN != null) {
            interfaceC58217yxCFARcdN.dispose();
        }
        KWHzl(OLrzqt(new Function1() { // from class: o.xnA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PercentChangeRankingViewModel.EZpvd(this.copydefault, bool, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
    }

    public static final Unit EZpvd(PercentChangeRankingViewModel percentChangeRankingViewModel, Boolean bool, boolean z) {
        percentChangeRankingViewModel.AEQbTJ(bool);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadPercentChangeRank$default(PercentChangeRankingViewModel percentChangeRankingViewModel, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadPercentChangeRank");
        }
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        percentChangeRankingViewModel.AEQbTJ(bool);
    }

    public final void AEQbTJ(final Boolean bool) {
        String str = this.values;
        String str2 = this.djBIcL;
        String strEZpvd = EZpvd();
        String str3 = this.AYXKKw;
        Boolean bool2 = Boolean.TRUE;
        RankListRequestGroup rankListRequestGroup = new RankListRequestGroup(Intrinsics.EZpvd(bool, bool2), false, new RankListRequest(str, str2, Intrinsics.EZpvd(bool, bool2) ? AuCTel() : iwGUEr(), strEZpvd, str3, C55611xnH.EZpvd(copydefault, KWHzl, EZpvd), this.DbNXlk), 2, (DefaultConstructorMarker) null);
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<SourceResp<ArrayList<UpDownRank>>> abstractC58185ywXKWHzl = (copydefault() ? C55488xkr.KWHzl.OLrzqt(rankListRequestGroup, bool) : C55488xkr.KWHzl.AEQbTJ(rankListRequestGroup)).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.xnv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PercentChangeRankingViewModel.KWHzl(this.KWHzl, bool, (SourceResp) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.xnw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return PercentChangeRankingViewModel.AEQbTJ(function1, obj);
            }
        }).KWHzl(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PercentChangeRankingViewModel.copydefault(this.KWHzl, bool, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xnu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                PercentChangeRankingViewModel.EZpvd(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.xnB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PercentChangeRankingViewModel.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        this.gEmmrt = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xnz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                PercentChangeRankingViewModel.AYXKKw(function13, obj);
            }
        });
    }

    public static final List AEQbTJ(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final List KWHzl(PercentChangeRankingViewModel percentChangeRankingViewModel, Boolean bool, SourceResp sourceResp) {
        Intrinsics.checkNotNullParameter(sourceResp, "");
        if (sourceResp.getData() != null) {
            Object data = sourceResp.getData();
            Intrinsics.copydefault(data);
            return percentChangeRankingViewModel.OLrzqt(bool, (List<UpDownRank>) data);
        }
        return yDY.AhwBna();
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(PercentChangeRankingViewModel percentChangeRankingViewModel, Boolean bool, List list) {
        percentChangeRankingViewModel.AhwBna.clear();
        percentChangeRankingViewModel.AhwBna.addAll(list);
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            ArrayList<AbstractC55526xlc> arrayList = percentChangeRankingViewModel.AhwBna;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AbstractC55526xlc) it.next()).KWHzl());
            }
            percentChangeRankingViewModel.KWHzl(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.OqFWZa(arrayList2)));
        }
        MutableLiveData<Unit> mutableLiveData = percentChangeRankingViewModel.valueOf;
        Unit unit = Unit.INSTANCE;
        mutableLiveData.setValue(unit);
        MutableLiveData<Boolean> mutableLiveDataAkhnZx = percentChangeRankingViewModel.AkhnZx();
        Boolean bool2 = Boolean.FALSE;
        mutableLiveDataAkhnZx.setValue(bool2);
        percentChangeRankingViewModel.ejfBZ().setValue(bool2);
        percentChangeRankingViewModel.AkhnZx().setValue(bool2);
        return unit;
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(PercentChangeRankingViewModel percentChangeRankingViewModel, Throwable th) {
        percentChangeRankingViewModel.AkhnZx().setValue(Boolean.FALSE);
        percentChangeRankingViewModel.ejfBZ().setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ List convertResponse$default(PercentChangeRankingViewModel percentChangeRankingViewModel, Boolean bool, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertResponse");
        }
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        return percentChangeRankingViewModel.OLrzqt(bool, (List<UpDownRank>) list);
    }

    public final List<AbstractC55526xlc> OLrzqt(Boolean bool, List<UpDownRank> list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            arrayList = OLrzqt(new ArrayList(list));
        } else {
            arrayList = new ArrayList(list);
        }
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            UpDownRank upDownRank = (UpDownRank) obj;
            AbstractC55526xlc.ActionBar actionBar = new AbstractC55526xlc.ActionBar("", "", "", upDownRank.getLastPrice(), upDownRank.getLastPrice(), upDownRank.getChangePer(), upDownRank.getIconV2(), upDownRank.getVolumeV2(), upDownRank.getTurnOverV2(), upDownRank.getFullNameV2(), upDownRank.getCcyV2());
            actionBar.AEQbTJ(upDownRank.getInstId());
            actionBar.copydefault(Boolean.valueOf(AYXKKw(valueOf(upDownRank.getInstId()))));
            RankModel.setRankData$default(this, upDownRank.getInstId(), actionBar, null, 4, null);
            actionBar.AEQbTJ(i);
            arrayList3.add(actionBar);
            i++;
        }
        arrayList2.addAll(arrayList3);
        if (Intrinsics.EZpvd(bool, Boolean.TRUE) && arrayList2.size() >= 7) {
            arrayList2.add(new AbstractC55526xlc.TaskDescription(copydefault() ? 1 : 2));
        }
        return arrayList2;
    }

    @Override // com.okinc.unify_find.viewmodel.RankModel
    public void bA_() {
        super.bA_();
        InterfaceC58217yxC interfaceC58217yxCFARcdN = fARcdN();
        if (interfaceC58217yxCFARcdN != null) {
            interfaceC58217yxCFARcdN.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }
}
