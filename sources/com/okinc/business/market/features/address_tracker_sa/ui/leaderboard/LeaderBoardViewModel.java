package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.common.constants.RankingSortType;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardContentUIModel;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC25708jDk;
import o.C19700gMb;
import o.C22416heu;
import o.C23272hvB;
import o.C24324ibg;
import o.C25382ivf;
import o.C25389ivm;
import o.C25667jBx;
import o.C25701jDd;
import o.C25702jDe;
import o.C25706jDi;
import o.C25983jNp;
import o.C27634jyr;
import o.C28586kda;
import o.C52761wXj;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.InterfaceC25414iwK;
import o.InterfaceC9738bbJ;
import o.gWI;
import o.jAH;
import o.jAO;
import o.jBB;
import o.jBD;
import o.jBF;
import o.jBH;
import o.jBI;
import o.jBN;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<C25706jDi> AEQbTJ;
    public LeaderBoardFilterModel AYXKKw;
    public List<MarketChainBean> AhwBna;
    public final C19700gMb AkhnZx;
    public Job AuCTel;
    public List<jBF> AubY;
    public final C25983jNp DbNXlk;
    public List<TrackingAddressAlias> EZpvd;
    public MutableStateFlow<AbstractC25708jDk> KWHzl;
    public MutableStateFlow<C25702jDe> copydefault;
    public Map<String, Boolean> djBIcL;
    public final jAO ejfBZ;
    public boolean fARcdN;
    public final jAH fIwbmz;
    public final C28586kda fJNWhG;
    public final C27634jyr fetchVPNInfo;
    public StateFlow<Integer> gEmmrt;
    public final StateFlow<AbstractC25708jDk> getFieldNames;
    public final StateFlow<C25702jDe> getNewProxyInstance;
    public final StateFlow<C25706jDi> hDKMBd;
    public jBF isConnected;
    public jBI iwGUEr;
    public final jBD uzCIH;
    public final gWI valueOf;
    public final InterfaceC25414iwK values;
    public List<String> wlaJM;
    public Job zsXlph;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RankingSortType.values().length];
            try {
                iArr[RankingSortType.CATEGORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RankingSortType.RANKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RankingSortType.DURATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C25702jDe> AEQbTJ() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C25706jDi> AYXKKw() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC25708jDk> valueOf() {
        return this.getFieldNames;
    }

    @yCM
    public LeaderBoardViewModel(@NotNull C28586kda c28586kda, @NotNull jBD jbd, @NotNull C25983jNp c25983jNp, @NotNull jAO jao, @NotNull jAH jah, @NotNull C27634jyr c27634jyr, @NotNull gWI gwi, @NotNull C19700gMb c19700gMb, @NotNull InterfaceC25414iwK interfaceC25414iwK) {
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(jbd, "");
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        Intrinsics.checkNotNullParameter(jao, "");
        Intrinsics.checkNotNullParameter(jah, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        Intrinsics.checkNotNullParameter(gwi, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        this.fJNWhG = c28586kda;
        this.uzCIH = jbd;
        this.DbNXlk = c25983jNp;
        this.ejfBZ = jao;
        this.fIwbmz = jah;
        this.fetchVPNInfo = c27634jyr;
        this.valueOf = gwi;
        this.AkhnZx = c19700gMb;
        this.values = interfaceC25414iwK;
        this.AubY = yDY.AhwBna();
        MutableStateFlow<C25702jDe> MutableStateFlow = StateFlowKt.MutableStateFlow(new C25702jDe(null, false, null, null, null, null, 63, null));
        this.copydefault = MutableStateFlow;
        this.getNewProxyInstance = MutableStateFlow;
        MutableStateFlow<C25706jDi> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C25706jDi(false, true, false, null, 13, null));
        this.AEQbTJ = MutableStateFlow2;
        this.hDKMBd = MutableStateFlow2;
        MutableStateFlow<AbstractC25708jDk> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow3;
        this.getFieldNames = MutableStateFlow3;
        this.iwGUEr = new jBI(0, 0, 3, null);
        this.djBIcL = C56424yEw.KWHzl();
        this.gEmmrt = StateFlowKt.MutableStateFlow(0);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void OLrzqt() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardViewModel$fetchBoardConfigs$1(this, null), 3, null);
    }

    public final void DbNXlk() {
        if (this.iwGUEr.OLrzqt() || this.hDKMBd.getValue().copydefault()) {
            fetchBoardContent$default(this, false, false, false, 7, null);
        }
    }

    public static /* synthetic */ void fetchBoardContent$default(LeaderBoardViewModel leaderBoardViewModel, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        leaderBoardViewModel.AEQbTJ(z, z2, z3);
    }

    public final void AEQbTJ(boolean z, boolean z2, boolean z3) {
        jBF jbf;
        if (this.fARcdN) {
            if (z || z2 || z3) {
                this.iwGUEr = new jBI(0, 0, 3, null);
                if (z && (jbf = this.isConnected) != null) {
                    this.AYXKKw = new LeaderBoardFilterModel(null, null, null, jbf.EZpvd(), null, null, null, null, null, null, 1015, null);
                }
            }
            LeaderBoardFilterModel leaderBoardFilterModel = this.AYXKKw;
            if (leaderBoardFilterModel != null) {
                boolean zDbNXlk = leaderBoardFilterModel.DbNXlk();
                MutableStateFlow<C25702jDe> mutableStateFlow = this.copydefault;
                mutableStateFlow.setValue(C25702jDe.copy$default(mutableStateFlow.getValue(), null, zDbNXlk, null, null, null, null, 61, null));
            }
            boolean zOLrzqt = this.iwGUEr.OLrzqt();
            Job job = this.AuCTel;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.AuCTel = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardViewModel$fetchBoardContent$3(zOLrzqt, z3, this, z2, null), 3, null);
        }
    }

    public final void EZpvd(LeaderBoardContentUIModel leaderBoardContentUIModel, int i, int i2) {
        LinkedHashMap linkedHashMap;
        List<LeaderBoardCardUIModel> leaderBoardCardUIModel;
        try {
            AbstractC25708jDk value = this.getFieldNames.getValue();
            AbstractC25708jDk.ActionBar actionBar = value instanceof AbstractC25708jDk.ActionBar ? (AbstractC25708jDk.ActionBar) value : null;
            List<LeaderBoardCardUIModel> listOLrzqt = actionBar != null ? actionBar.OLrzqt() : null;
            if (listOLrzqt == null) {
                return;
            }
            if (leaderBoardContentUIModel == null || (leaderBoardCardUIModel = leaderBoardContentUIModel.getLeaderBoardCardUIModel()) == null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(leaderBoardCardUIModel, 10)), 16));
                for (Object obj : leaderBoardCardUIModel) {
                    linkedHashMap.put(((LeaderBoardCardUIModel) obj).getWalletAddress(), obj);
                }
            }
            if (!linkedHashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                for (LeaderBoardCardUIModel leaderBoardCardUIModel2 : listOLrzqt) {
                    LeaderBoardCardUIModel leaderBoardCardUIModel3 = (LeaderBoardCardUIModel) linkedHashMap.get(leaderBoardCardUIModel2.getWalletAddress());
                    if (leaderBoardCardUIModel3 != null) {
                        leaderBoardCardUIModel2 = leaderBoardCardUIModel3;
                    }
                    arrayList.add(leaderBoardCardUIModel2);
                }
                this.KWHzl.setValue(new AbstractC25708jDk.ActionBar(arrayList, i, i2, null, 8, null));
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.copydefault("updateWSData", message);
        }
    }

    public final boolean copydefault(LeaderBoardContentUIModel leaderBoardContentUIModel) {
        if (leaderBoardContentUIModel == null) {
            return this.iwGUEr.AEQbTJ() < this.iwGUEr.copydefault();
        }
        boolean z = leaderBoardContentUIModel.getRankEnd() <= leaderBoardContentUIModel.getTotalCount();
        int rankEnd = leaderBoardContentUIModel.getRankEnd();
        this.iwGUEr = new jBI(rankEnd, (z ? 10 : leaderBoardContentUIModel.getTotalCount() - leaderBoardContentUIModel.getRankEnd()) + rankEnd);
        return z;
    }

    public final void EZpvd(@NotNull String str, boolean z) {
        ArrayList arrayList;
        List<LeaderBoardCardUIModel> listAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            List<String> list = this.wlaJM;
            Set setDXXBbs = list != null ? CollectionsKt___CollectionsKt.DXXBbs(list) : null;
            if (setDXXBbs != null) {
                setDXXBbs.add(str);
            }
            this.wlaJM = setDXXBbs != null ? CollectionsKt___CollectionsKt.AxsJAYsNCnLh(setDXXBbs) : null;
        } else {
            List<String> list2 = this.wlaJM;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!Intrinsics.EZpvd(obj, (Object) str)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            this.wlaJM = arrayList;
        }
        AbstractC25708jDk value = this.getFieldNames.getValue();
        AbstractC25708jDk.ActionBar actionBar = value instanceof AbstractC25708jDk.ActionBar ? (AbstractC25708jDk.ActionBar) value : null;
        if (actionBar == null || (listAhwBna = actionBar.OLrzqt()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        Iterator<LeaderBoardCardUIModel> it = listAhwBna.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((Object) it.next().getWalletAddress(), (Object) str)) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i;
        if (listAhwBna.isEmpty()) {
            this.KWHzl.setValue(new AbstractC25708jDk.StateListAnimator());
            return;
        }
        if (i2 < 0 || i2 >= listAhwBna.size()) {
            return;
        }
        LeaderBoardCardUIModel leaderBoardCardUIModel = listAhwBna.get(i2);
        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) listAhwBna);
        LeaderBoardSortModel leaderBoardSortModelAEQbTJ = this.getNewProxyInstance.getValue().AEQbTJ();
        if (Intrinsics.EZpvd((Object) (leaderBoardSortModelAEQbTJ != null ? leaderBoardSortModelAEQbTJ.getFilterId() : null), (Object) "following")) {
            listFJNWhG.remove(i2);
            if (listAhwBna.isEmpty()) {
                this.KWHzl.setValue(new AbstractC25708jDk.StateListAnimator());
                return;
            } else {
                this.KWHzl.setValue(new AbstractC25708jDk.ActionBar(listFJNWhG, i2, 1, "follow_item_removed"));
                return;
            }
        }
        listFJNWhG.set(i2, leaderBoardCardUIModel.copy((8388351 & 1) != 0 ? leaderBoardCardUIModel.id : null, (8388351 & 2) != 0 ? leaderBoardCardUIModel.walletAddress : null, (8388351 & 4) != 0 ? leaderBoardCardUIModel.walletLogoUrl : null, (8388351 & 8) != 0 ? leaderBoardCardUIModel.kolTwitterLink : null, (8388351 & 16) != 0 ? leaderBoardCardUIModel.addressAlias : null, (8388351 & 32) != 0 ? leaderBoardCardUIModel.accountName : null, (8388351 & 64) != 0 ? leaderBoardCardUIModel.isBookmarked : z, (8388351 & 128) != 0 ? leaderBoardCardUIModel.type : null, (8388351 & 256) != 0 ? leaderBoardCardUIModel.isSelected : false, (8388351 & 512) != 0 ? leaderBoardCardUIModel.chartItems : null, (8388351 & 1024) != 0 ? leaderBoardCardUIModel.chainId : null, (8388351 & 2048) != 0 ? leaderBoardCardUIModel.chainLogoUrl : null, (8388351 & 4096) != 0 ? leaderBoardCardUIModel.tokenPrice : null, (8388351 & 8192) != 0 ? leaderBoardCardUIModel.tokenBalance : null, (8388351 & 16384) != 0 ? leaderBoardCardUIModel.pnlAmount : null, (8388351 & 32768) != 0 ? leaderBoardCardUIModel.roiPercentage : null, (8388351 & 65536) != 0 ? leaderBoardCardUIModel.winRatePercentage : null, (8388351 & 131072) != 0 ? leaderBoardCardUIModel.winLossToken : null, (8388351 & 262144) != 0 ? leaderBoardCardUIModel.transactions : 0, (8388351 & 524288) != 0 ? leaderBoardCardUIModel.lastTime : null, (8388351 & 1048576) != 0 ? leaderBoardCardUIModel.periodType : null, (8388351 & 2097152) != 0 ? leaderBoardCardUIModel.emoji : null, (8388351 & 4194304) != 0 ? leaderBoardCardUIModel.addressDisplayColorHex : null));
        this.KWHzl.setValue(new AbstractC25708jDk.ActionBar(listFJNWhG, i2, 1, "follow_state_changed"));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f A[LOOP:1: B:48:0x0109->B:50:0x010f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        LeaderBoardViewModel$updateAllFollowStateAndAlias$1 leaderBoardViewModel$updateAllFollowStateAndAlias$1;
        LeaderBoardViewModel leaderBoardViewModel;
        LeaderBoardViewModel leaderBoardViewModel2;
        AbstractC25708jDk.ActionBar actionBar;
        List<LeaderBoardCardUIModel> list;
        ArrayList arrayList;
        Iterator it;
        if (continuation instanceof LeaderBoardViewModel$updateAllFollowStateAndAlias$1) {
            leaderBoardViewModel$updateAllFollowStateAndAlias$1 = (LeaderBoardViewModel$updateAllFollowStateAndAlias$1) continuation;
            int i = leaderBoardViewModel$updateAllFollowStateAndAlias$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                leaderBoardViewModel$updateAllFollowStateAndAlias$1.label = i - Integer.MIN_VALUE;
            } else {
                leaderBoardViewModel$updateAllFollowStateAndAlias$1 = new LeaderBoardViewModel$updateAllFollowStateAndAlias$1(this, continuation);
            }
        }
        Object objAEQbTJ = leaderBoardViewModel$updateAllFollowStateAndAlias$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = leaderBoardViewModel$updateAllFollowStateAndAlias$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            leaderBoardViewModel$updateAllFollowStateAndAlias$1.L$0 = this;
            leaderBoardViewModel$updateAllFollowStateAndAlias$1.label = 1;
            objAEQbTJ = AEQbTJ(leaderBoardViewModel$updateAllFollowStateAndAlias$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            leaderBoardViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) leaderBoardViewModel$updateAllFollowStateAndAlias$1.L$2;
                actionBar = (AbstractC25708jDk.ActionBar) leaderBoardViewModel$updateAllFollowStateAndAlias$1.L$1;
                leaderBoardViewModel2 = (LeaderBoardViewModel) leaderBoardViewModel$updateAllFollowStateAndAlias$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    LeaderBoardCardUIModel leaderBoardCardUIModel = (LeaderBoardCardUIModel) obj;
                    LeaderBoardSortModel leaderBoardSortModelAEQbTJ = leaderBoardViewModel2.getNewProxyInstance.getValue().AEQbTJ();
                    if (!Intrinsics.EZpvd((Object) (leaderBoardSortModelAEQbTJ != null ? leaderBoardSortModelAEQbTJ.getFilterId() : null), (Object) "following") || leaderBoardCardUIModel.isBookmarked()) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(C25667jBx.KWHzl((LeaderBoardCardUIModel) it.next(), leaderBoardViewModel2.wlaJM, leaderBoardViewModel2.EZpvd));
                }
                if (!arrayList.isEmpty()) {
                    leaderBoardViewModel2.KWHzl.setValue(new AbstractC25708jDk.StateListAnimator());
                } else {
                    leaderBoardViewModel2.KWHzl.setValue(new AbstractC25708jDk.ActionBar(arrayList, actionBar.AEQbTJ(), actionBar.copydefault(), "follow_state_changed"));
                }
                return Unit.INSTANCE;
            }
            leaderBoardViewModel = (LeaderBoardViewModel) leaderBoardViewModel$updateAllFollowStateAndAlias$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        String str = (String) objAEQbTJ;
        ArrayList arrayList3 = new ArrayList();
        AbstractC25708jDk value = leaderBoardViewModel.getFieldNames.getValue();
        AbstractC25708jDk.ActionBar actionBar2 = value instanceof AbstractC25708jDk.ActionBar ? (AbstractC25708jDk.ActionBar) value : null;
        if (actionBar2 == null) {
            return Unit.INSTANCE;
        }
        List<LeaderBoardCardUIModel> listOLrzqt = actionBar2.OLrzqt();
        if (listOLrzqt.isEmpty()) {
            return Unit.INSTANCE;
        }
        arrayList3.add(C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(leaderBoardViewModel), null, null, new LeaderBoardViewModel$updateAllFollowStateAndAlias$2(leaderBoardViewModel, str, null), 3, null));
        arrayList3.add(C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(leaderBoardViewModel), null, null, new LeaderBoardViewModel$updateAllFollowStateAndAlias$3(leaderBoardViewModel, str, null), 3, null));
        leaderBoardViewModel$updateAllFollowStateAndAlias$1.L$0 = leaderBoardViewModel;
        leaderBoardViewModel$updateAllFollowStateAndAlias$1.L$1 = actionBar2;
        leaderBoardViewModel$updateAllFollowStateAndAlias$1.L$2 = listOLrzqt;
        leaderBoardViewModel$updateAllFollowStateAndAlias$1.label = 2;
        if (AwaitKt.joinAll(arrayList3, leaderBoardViewModel$updateAllFollowStateAndAlias$1) == objCopydefault) {
            return objCopydefault;
        }
        leaderBoardViewModel2 = leaderBoardViewModel;
        actionBar = actionBar2;
        list = listOLrzqt;
        ArrayList arrayList22 = new ArrayList();
        while (r3.hasNext()) {
        }
        arrayList = new ArrayList(C56403yEb.AYXKKw(arrayList22, 10));
        it = arrayList22.iterator();
        while (it.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(jBH jbh, String str, boolean z, Continuation<? super LeaderBoardContentUIModel> continuation) throws Throwable {
        LeaderBoardViewModel$getLeaderBoardRowData$1 leaderBoardViewModel$getLeaderBoardRowData$1;
        Ref.ObjectRef objectRef;
        LeaderBoardViewModel leaderBoardViewModel;
        boolean z2;
        Ref.ObjectRef objectRef2;
        List<MarketChainBean> list;
        jBB jbb;
        if (continuation instanceof LeaderBoardViewModel$getLeaderBoardRowData$1) {
            leaderBoardViewModel$getLeaderBoardRowData$1 = (LeaderBoardViewModel$getLeaderBoardRowData$1) continuation;
            int i = leaderBoardViewModel$getLeaderBoardRowData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                leaderBoardViewModel$getLeaderBoardRowData$1.label = i - Integer.MIN_VALUE;
            } else {
                leaderBoardViewModel$getLeaderBoardRowData$1 = new LeaderBoardViewModel$getLeaderBoardRowData$1(this, continuation);
            }
        }
        LeaderBoardViewModel$getLeaderBoardRowData$1 leaderBoardViewModel$getLeaderBoardRowData$12 = leaderBoardViewModel$getLeaderBoardRowData$1;
        Object emojiAddressMapping$default = leaderBoardViewModel$getLeaderBoardRowData$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = leaderBoardViewModel$getLeaderBoardRowData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(emojiAddressMapping$default);
            objectRef = new Ref.ObjectRef();
            ArrayList arrayList = new ArrayList();
            arrayList.add(C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardViewModel$getLeaderBoardRowData$2(objectRef, this, jbh, str, null), 3, null));
            if (str.length() > 0) {
                List<String> list2 = this.wlaJM;
                if (list2 == null || list2.isEmpty() || z) {
                    arrayList.add(C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardViewModel$getLeaderBoardRowData$3(this, str, null), 3, null));
                }
                List<TrackingAddressAlias> list3 = this.EZpvd;
                if (list3 == null || list3.isEmpty() || z) {
                    arrayList.add(C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardViewModel$getLeaderBoardRowData$4(this, str, null), 3, null));
                }
            }
            leaderBoardViewModel$getLeaderBoardRowData$12.L$0 = this;
            leaderBoardViewModel$getLeaderBoardRowData$12.L$1 = objectRef;
            leaderBoardViewModel$getLeaderBoardRowData$12.Z$0 = z;
            leaderBoardViewModel$getLeaderBoardRowData$12.label = 1;
            if (AwaitKt.joinAll(arrayList, leaderBoardViewModel$getLeaderBoardRowData$12) == objCopydefault) {
                return objCopydefault;
            }
            leaderBoardViewModel = this;
            z2 = z;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) leaderBoardViewModel$getLeaderBoardRowData$12.L$1;
                leaderBoardViewModel = (LeaderBoardViewModel) leaderBoardViewModel$getLeaderBoardRowData$12.L$0;
                C56391yDq.AEQbTJ(emojiAddressMapping$default);
                Map map = (Map) emojiAddressMapping$default;
                jbb = (jBB) objectRef2.element;
                if (jbb == null) {
                    return C25667jBx.EZpvd(jbb, leaderBoardViewModel.AhwBna, leaderBoardViewModel.wlaJM, leaderBoardViewModel.EZpvd, map, leaderBoardViewModel.gEmmrt());
                }
                return null;
            }
            z2 = leaderBoardViewModel$getLeaderBoardRowData$12.Z$0;
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) leaderBoardViewModel$getLeaderBoardRowData$12.L$1;
            LeaderBoardViewModel leaderBoardViewModel2 = (LeaderBoardViewModel) leaderBoardViewModel$getLeaderBoardRowData$12.L$0;
            C56391yDq.AEQbTJ(emojiAddressMapping$default);
            objectRef = objectRef3;
            leaderBoardViewModel = leaderBoardViewModel2;
        }
        if (z2 && (list = leaderBoardViewModel.AhwBna) != null) {
            C25702jDe value = leaderBoardViewModel.getNewProxyInstance.getValue();
            String strCopydefault = value.copydefault();
            C25701jDd c25701jDdKWHzl = value.KWHzl();
            leaderBoardViewModel.copydefault.setValue(C25702jDe.copy$default(value, null, false, null, null, null, leaderBoardViewModel.copydefault(list, strCopydefault, c25701jDdKWHzl != null ? c25701jDdKWHzl.OLrzqt() : false), 31, null));
        }
        C27634jyr c27634jyr = leaderBoardViewModel.fetchVPNInfo;
        leaderBoardViewModel$getLeaderBoardRowData$12.L$0 = leaderBoardViewModel;
        leaderBoardViewModel$getLeaderBoardRowData$12.L$1 = objectRef;
        leaderBoardViewModel$getLeaderBoardRowData$12.label = 2;
        emojiAddressMapping$default = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, leaderBoardViewModel$getLeaderBoardRowData$12, 1, null);
        if (emojiAddressMapping$default == objCopydefault) {
            return objCopydefault;
        }
        objectRef2 = objectRef;
        Map map2 = (Map) emojiAddressMapping$default;
        jbb = (jBB) objectRef2.element;
        if (jbb == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[LOOP:0: B:32:0x0094->B:34:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super Unit> continuation) throws Throwable {
        LeaderBoardViewModel$initializeChainListAndChipState$1 leaderBoardViewModel$initializeChainListAndChipState$1;
        LeaderBoardViewModel leaderBoardViewModel;
        List<MarketChainBean> list;
        Iterator<T> it;
        if (continuation instanceof LeaderBoardViewModel$initializeChainListAndChipState$1) {
            leaderBoardViewModel$initializeChainListAndChipState$1 = (LeaderBoardViewModel$initializeChainListAndChipState$1) continuation;
            int i = leaderBoardViewModel$initializeChainListAndChipState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                leaderBoardViewModel$initializeChainListAndChipState$1.label = i - Integer.MIN_VALUE;
            } else {
                leaderBoardViewModel$initializeChainListAndChipState$1 = new LeaderBoardViewModel$initializeChainListAndChipState$1(this, continuation);
            }
        }
        Object objKWHzl = leaderBoardViewModel$initializeChainListAndChipState$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = leaderBoardViewModel$initializeChainListAndChipState$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            List<MarketChainBean> list2 = this.AhwBna;
            if (list2 == null || list2.isEmpty()) {
                C25983jNp c25983jNp = this.DbNXlk;
                leaderBoardViewModel$initializeChainListAndChipState$1.L$0 = this;
                leaderBoardViewModel$initializeChainListAndChipState$1.label = 1;
                if (c25983jNp.OLrzqt(leaderBoardViewModel$initializeChainListAndChipState$1) == objCopydefault) {
                    return objCopydefault;
                }
                leaderBoardViewModel = this;
            } else {
                leaderBoardViewModel = this;
                list = leaderBoardViewModel.AhwBna;
                if (list != null) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objKWHzl);
                    return Unit.INSTANCE;
                }
                leaderBoardViewModel = (LeaderBoardViewModel) leaderBoardViewModel$initializeChainListAndChipState$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                Iterable iterable = (Iterable) objKWHzl;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterable, 10)), 16));
                for (Object obj : iterable) {
                    linkedHashMap.put(((MarketChainBean) obj).getChainId(), obj);
                }
                List<jBF> list3 = leaderBoardViewModel.AubY;
                ArrayList arrayList = new ArrayList();
                it = list3.iterator();
                while (it.hasNext()) {
                    MarketChainBean marketChainBean = (MarketChainBean) linkedHashMap.get(((jBF) it.next()).EZpvd());
                    if (marketChainBean != null) {
                        arrayList.add(marketChainBean);
                    }
                }
                leaderBoardViewModel.AhwBna = arrayList;
                list = leaderBoardViewModel.AhwBna;
                if (list != null) {
                    leaderBoardViewModel$initializeChainListAndChipState$1.L$0 = null;
                    leaderBoardViewModel$initializeChainListAndChipState$1.label = 3;
                    if (leaderBoardViewModel.OLrzqt(list, leaderBoardViewModel$initializeChainListAndChipState$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            leaderBoardViewModel = (LeaderBoardViewModel) leaderBoardViewModel$initializeChainListAndChipState$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            ((Result) objKWHzl).m7386unboximpl();
        }
        C25983jNp c25983jNp2 = leaderBoardViewModel.DbNXlk;
        leaderBoardViewModel$initializeChainListAndChipState$1.L$0 = leaderBoardViewModel;
        leaderBoardViewModel$initializeChainListAndChipState$1.label = 2;
        objKWHzl = c25983jNp2.KWHzl(leaderBoardViewModel$initializeChainListAndChipState$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        Iterable iterable2 = (Iterable) objKWHzl;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterable2, 10)), 16));
        while (r8.hasNext()) {
        }
        List<jBF> list32 = leaderBoardViewModel.AubY;
        ArrayList arrayList2 = new ArrayList();
        it = list32.iterator();
        while (it.hasNext()) {
        }
        leaderBoardViewModel.AhwBna = arrayList2;
        list = leaderBoardViewModel.AhwBna;
        if (list != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(List<MarketChainBean> list, Continuation<? super Unit> continuation) throws Throwable {
        LeaderBoardViewModel$initBoardChipStates$1 leaderBoardViewModel$initBoardChipStates$1;
        LeaderBoardViewModel leaderBoardViewModel;
        List<MarketChainBean> list2;
        jBF jbf;
        List<MarketChainBean> list3;
        LeaderBoardSortModel leaderBoardSortModel;
        LeaderBoardViewModel leaderBoardViewModel2;
        if (continuation instanceof LeaderBoardViewModel$initBoardChipStates$1) {
            leaderBoardViewModel$initBoardChipStates$1 = (LeaderBoardViewModel$initBoardChipStates$1) continuation;
            int i = leaderBoardViewModel$initBoardChipStates$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                leaderBoardViewModel$initBoardChipStates$1.label = i - Integer.MIN_VALUE;
            } else {
                leaderBoardViewModel$initBoardChipStates$1 = new LeaderBoardViewModel$initBoardChipStates$1(this, continuation);
            }
        }
        Object obj = leaderBoardViewModel$initBoardChipStates$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = leaderBoardViewModel$initBoardChipStates$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            jBF jbf2 = this.isConnected;
            if (jbf2 != null) {
                jBD jbd = this.uzCIH;
                RankingSortType rankingSortType = RankingSortType.RANKING;
                leaderBoardViewModel$initBoardChipStates$1.L$0 = this;
                leaderBoardViewModel$initBoardChipStates$1.L$1 = list;
                leaderBoardViewModel$initBoardChipStates$1.L$2 = jbf2;
                leaderBoardViewModel$initBoardChipStates$1.label = 1;
                Object objOLrzqt = jbd.OLrzqt(rankingSortType, leaderBoardViewModel$initBoardChipStates$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                leaderBoardViewModel = this;
                list2 = list;
                jbf = jbf2;
                obj = objOLrzqt;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LeaderBoardSortModel leaderBoardSortModel2 = (LeaderBoardSortModel) leaderBoardViewModel$initBoardChipStates$1.L$3;
            jbf = (jBF) leaderBoardViewModel$initBoardChipStates$1.L$2;
            list3 = (List) leaderBoardViewModel$initBoardChipStates$1.L$1;
            leaderBoardViewModel2 = (LeaderBoardViewModel) leaderBoardViewModel$initBoardChipStates$1.L$0;
            C56391yDq.AEQbTJ(obj);
            leaderBoardSortModel = leaderBoardSortModel2;
            leaderBoardViewModel2.copydefault.setValue(new C25702jDe(jbf.EZpvd(), false, (LeaderBoardSortModel) CollectionsKt___CollectionsKt.firstOrNull(jbf.KWHzl()), leaderBoardSortModel, (LeaderBoardSortModel) obj, leaderBoardViewModel2.copydefault(list3, jbf.EZpvd(), leaderBoardViewModel2.uzCIH.AEQbTJ()), 2, null));
            return Unit.INSTANCE;
        }
        jbf = (jBF) leaderBoardViewModel$initBoardChipStates$1.L$2;
        list2 = (List) leaderBoardViewModel$initBoardChipStates$1.L$1;
        leaderBoardViewModel = (LeaderBoardViewModel) leaderBoardViewModel$initBoardChipStates$1.L$0;
        C56391yDq.AEQbTJ(obj);
        LeaderBoardSortModel leaderBoardSortModel3 = (LeaderBoardSortModel) obj;
        jBD jbd2 = leaderBoardViewModel.uzCIH;
        RankingSortType rankingSortType2 = RankingSortType.DURATION;
        leaderBoardViewModel$initBoardChipStates$1.L$0 = leaderBoardViewModel;
        leaderBoardViewModel$initBoardChipStates$1.L$1 = list2;
        leaderBoardViewModel$initBoardChipStates$1.L$2 = jbf;
        leaderBoardViewModel$initBoardChipStates$1.L$3 = leaderBoardSortModel3;
        leaderBoardViewModel$initBoardChipStates$1.label = 2;
        Object objOLrzqt2 = jbd2.OLrzqt(rankingSortType2, leaderBoardViewModel$initBoardChipStates$1);
        if (objOLrzqt2 == objCopydefault) {
            return objCopydefault;
        }
        list3 = list2;
        LeaderBoardViewModel leaderBoardViewModel3 = leaderBoardViewModel;
        leaderBoardSortModel = leaderBoardSortModel3;
        obj = objOLrzqt2;
        leaderBoardViewModel2 = leaderBoardViewModel3;
        leaderBoardViewModel2.copydefault.setValue(new C25702jDe(jbf.EZpvd(), false, (LeaderBoardSortModel) CollectionsKt___CollectionsKt.firstOrNull(jbf.KWHzl()), leaderBoardSortModel, (LeaderBoardSortModel) obj, leaderBoardViewModel2.copydefault(list3, jbf.EZpvd(), leaderBoardViewModel2.uzCIH.AEQbTJ()), 2, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Continuation<? super String> continuation) throws Throwable {
        LeaderBoardViewModel$getAddress$1 leaderBoardViewModel$getAddress$1;
        Object objOLrzqt;
        if (continuation instanceof LeaderBoardViewModel$getAddress$1) {
            leaderBoardViewModel$getAddress$1 = (LeaderBoardViewModel$getAddress$1) continuation;
            int i = leaderBoardViewModel$getAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                leaderBoardViewModel$getAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                leaderBoardViewModel$getAddress$1 = new LeaderBoardViewModel$getAddress$1(this, continuation);
            }
        }
        Object obj = leaderBoardViewModel$getAddress$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = leaderBoardViewModel$getAddress$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.fJNWhG;
            leaderBoardViewModel$getAddress$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(leaderBoardViewModel$getAddress$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        return (dexUserIdentity == null || dexUserIdentity.KWHzl()) ? "" : dexUserIdentity.EZpvd();
    }

    public final LeaderBoardFilterModel KWHzl() {
        LeaderBoardFilterModel leaderBoardFilterModel = this.AYXKKw;
        if (leaderBoardFilterModel == null) {
            return null;
        }
        List<MarketChainBean> listAhwBna = this.AhwBna;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        return leaderBoardFilterModel.OLrzqt((1022 & 1) != 0 ? leaderBoardFilterModel.OLrzqt : null, (1022 & 2) != 0 ? leaderBoardFilterModel.AEQbTJ : null, (1022 & 4) != 0 ? leaderBoardFilterModel.EZpvd : listAhwBna, (1022 & 8) != 0 ? leaderBoardFilterModel.valueOf : null, (1022 & 16) != 0 ? leaderBoardFilterModel.KWHzl : null, (1022 & 32) != 0 ? leaderBoardFilterModel.copydefault : null, (1022 & 64) != 0 ? leaderBoardFilterModel.AYXKKw : null, (1022 & 128) != 0 ? leaderBoardFilterModel.djBIcL : null, (1022 & 256) != 0 ? leaderBoardFilterModel.AhwBna : null, (1022 & 512) != 0 ? leaderBoardFilterModel.gEmmrt : null);
    }

    public final void EZpvd(@NotNull LeaderBoardFilterModel leaderBoardFilterModel) {
        Object next;
        Intrinsics.checkNotNullParameter(leaderBoardFilterModel, "");
        if (Intrinsics.EZpvd(leaderBoardFilterModel, this.AYXKKw)) {
            return;
        }
        if (leaderBoardFilterModel.gEmmrt().length() > 0) {
            String strGEmmrt = leaderBoardFilterModel.gEmmrt();
            jBF jbf = this.isConnected;
            Object obj = null;
            if (!Intrinsics.EZpvd((Object) strGEmmrt, (Object) (jbf != null ? jbf.EZpvd() : null))) {
                Iterator<T> it = this.AubY.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((jBF) next).EZpvd(), (Object) leaderBoardFilterModel.gEmmrt())) {
                            break;
                        }
                    }
                }
                this.isConnected = (jBF) next;
                C25702jDe value = this.getNewProxyInstance.getValue();
                jBF jbf2 = this.isConnected;
                if (jbf2 != null) {
                    List<LeaderBoardSortModel> listKWHzl = jbf2.KWHzl();
                    Iterator<T> it2 = listKWHzl.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        String filterLabel = ((LeaderBoardSortModel) next2).getFilterLabel();
                        LeaderBoardSortModel leaderBoardSortModelAEQbTJ = value.AEQbTJ();
                        if (Intrinsics.EZpvd((Object) filterLabel, (Object) (leaderBoardSortModelAEQbTJ != null ? leaderBoardSortModelAEQbTJ.getFilterLabel() : null))) {
                            obj = next2;
                            break;
                        }
                    }
                    LeaderBoardSortModel leaderBoardSortModel = (LeaderBoardSortModel) obj;
                    MutableStateFlow<C25702jDe> mutableStateFlow = this.copydefault;
                    String strGEmmrt2 = leaderBoardFilterModel.gEmmrt();
                    LeaderBoardSortModel leaderBoardSortModel2 = leaderBoardSortModel == null ? (LeaderBoardSortModel) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl) : leaderBoardSortModel;
                    List<MarketChainBean> listAhwBna = this.AhwBna;
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    String strEZpvd = jbf2.EZpvd();
                    C25701jDd c25701jDdKWHzl = value.KWHzl();
                    mutableStateFlow.setValue(C25702jDe.copy$default(value, strGEmmrt2, false, leaderBoardSortModel2, null, null, copydefault(listAhwBna, strEZpvd, c25701jDdKWHzl != null ? c25701jDdKWHzl.OLrzqt() : true), 26, null));
                }
            }
        }
        this.AYXKKw = leaderBoardFilterModel;
        fetchBoardContent$default(this, false, true, false, 5, null);
    }

    public final void isConnected() {
        C25702jDe value = this.getNewProxyInstance.getValue();
        C25701jDd c25701jDdKWHzl = value.KWHzl();
        boolean zOLrzqt = c25701jDdKWHzl != null ? c25701jDdKWHzl.OLrzqt() : true;
        boolean z = !zOLrzqt;
        this.uzCIH.EZpvd(z);
        jBN.trackLeaderboardPageClick$default(jBN.copydefault, DexTrackEventParameter.LeaderBoardButtonName.CURRENCY_MODE_IS_TOKEN_FILTER_TOGGLE, String.valueOf(zOLrzqt), String.valueOf(z), false, 8, null);
        List<MarketChainBean> list = this.AhwBna;
        if (list != null) {
            this.copydefault.setValue(C25702jDe.copy$default(value, null, false, null, null, null, copydefault(list, value.copydefault(), z), 31, null));
        }
    }

    public final void OLrzqt(@NotNull LeaderBoardSortModel leaderBoardSortModel) {
        Intrinsics.checkNotNullParameter(leaderBoardSortModel, "");
        LeaderBoardFilterModel leaderBoardFilterModel = this.AYXKKw;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardViewModel$onSortTypeSelection$1(leaderBoardSortModel, this, leaderBoardFilterModel != null ? leaderBoardFilterModel.DbNXlk() : true, null), 3, null);
    }

    public final List<LeaderBoardSortModel> copydefault(@NotNull RankingSortType rankingSortType, String str) {
        List<LeaderBoardSortModel> listKWHzl;
        List<LeaderBoardSortModel> listCopydefault;
        jBF jbf;
        List<LeaderBoardSortModel> listOLrzqt;
        Intrinsics.checkNotNullParameter(rankingSortType, "");
        int i = Application.KWHzl[rankingSortType.ordinal()];
        if (i == 1) {
            jBF jbf2 = this.isConnected;
            if (jbf2 != null && (listKWHzl = jbf2.KWHzl()) != null) {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                for (LeaderBoardSortModel leaderBoardSortModel : listKWHzl) {
                    arrayList.add(LeaderBoardSortModel.copy$default(leaderBoardSortModel, null, null, null, Intrinsics.EZpvd((Object) str, (Object) leaderBoardSortModel.getFilterId()), null, 23, null));
                }
                return arrayList;
            }
        } else if (i == 2) {
            jBF jbf3 = this.isConnected;
            if (jbf3 != null && (listCopydefault = jbf3.copydefault()) != null) {
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                for (LeaderBoardSortModel leaderBoardSortModel2 : listCopydefault) {
                    arrayList2.add(LeaderBoardSortModel.copy$default(leaderBoardSortModel2, null, null, null, Intrinsics.EZpvd((Object) str, (Object) leaderBoardSortModel2.getFilterId()), null, 23, null));
                }
                return arrayList2;
            }
        } else if (i == 3 && (jbf = this.isConnected) != null && (listOLrzqt = jbf.OLrzqt()) != null) {
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            for (LeaderBoardSortModel leaderBoardSortModel3 : listOLrzqt) {
                arrayList3.add(LeaderBoardSortModel.copy$default(leaderBoardSortModel3, null, null, null, Intrinsics.EZpvd((Object) str, (Object) leaderBoardSortModel3.getFilterId()), null, 23, null));
            }
            return arrayList3;
        }
        return null;
    }

    public final void KWHzl(int i, int i2) {
        jBH jbh = new jBH(this.getNewProxyInstance.getValue().copydefault(), this.getNewProxyInstance.getValue().AEQbTJ(), this.getNewProxyInstance.getValue().EZpvd(), this.getNewProxyInstance.getValue().OLrzqt(), this.AYXKKw, new jBI(i, i2));
        copydefault();
        this.zsXlph = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaderBoardViewModel$subscribeLeaderBoard$1(this, jbh, i, null), 3, null);
    }

    public final void copydefault() {
        Job job = this.zsXlph;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.zsXlph = null;
    }

    public final boolean djBIcL() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.AkhnZx.KWHzl();
        if (interfaceC9738bbJKWHzl == null) {
            return true;
        }
        return (interfaceC9738bbJKWHzl.getFieldNames() || interfaceC9738bbJKWHzl.ORxRYg() || interfaceC9738bbJKWHzl.zsXlph() || interfaceC9738bbJKWHzl.QfsBiF()) ? false : true;
    }

    public final boolean gEmmrt() {
        if (this.values.valueOf() && C22416heu.fetchVPNInfo()) {
            Map<String, Boolean> map = this.djBIcL;
            LeaderBoardFilterModel leaderBoardFilterModel = this.AYXKKw;
            Boolean bool = map.get(leaderBoardFilterModel != null ? leaderBoardFilterModel.gEmmrt() : null);
            if (bool != null && bool.booleanValue() && djBIcL()) {
                return true;
            }
        }
        return false;
    }

    public final boolean AhwBna() {
        return this.AkhnZx.djBIcL();
    }

    public final Object OLrzqt(@NotNull Continuation<? super Boolean> continuation) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        this.gEmmrt = FlowKt.stateIn(FlowKt.m7441catch(this.valueOf.EZpvd(), new LeaderBoardViewModel$subscribeCopyTradeCount$2(booleanRef, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 2000L, 0L, 2, null), C56443yFo.AEQbTJ(0));
        return C56443yFo.KWHzl(booleanRef.element);
    }

    public final C25701jDd copydefault(List<MarketChainBean> list, String str, boolean z) {
        Object next;
        String str2;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((MarketChainBean) next).getChainId(), (Object) str)) {
                break;
            }
        }
        MarketChainBean marketChainBean = (MarketChainBean) next;
        if (marketChainBean == null) {
            return null;
        }
        String nativeTokenSymbol = marketChainBean.getNativeTokenSymbol();
        String isoCode = C23272hvB.KWHzl.OLrzqt().getIsoCode();
        String str3 = isoCode + " / " + nativeTokenSymbol;
        if (z) {
            str2 = isoCode + " /";
        } else {
            str2 = "/ " + nativeTokenSymbol;
        }
        return new C25701jDd(z, C24324ibg.addSpanWithColor$default(C24324ibg.Companion.KWHzl(str3), str2, C25382ivf.KWHzl(C52761wXj.Activity.QwvEab), 0, 4, null).AEQbTJ());
    }
}
