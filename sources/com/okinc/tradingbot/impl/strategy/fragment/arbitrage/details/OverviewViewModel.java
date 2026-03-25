package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.dto.GridReinvestedProfitsQueryVO;
import com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryVO;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56390yDp;
import o.vNB;
import o.wTK;
import o.wTO;
import o.wTT;
import o.wTW;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OverviewViewModel extends ViewModel {
    public final MutableStateFlow<vNB<InterestInfoResponse>> AEQbTJ;
    public final CoroutineDispatcher AYXKKw;
    public final Flow<vNB<Pair<List<BillsArchive>, InterestInfoResponse>>> AhwBna;
    public final StateFlow<BotLeadProfitProfitOrderDetails> AkhnZx;
    public final Flow<vNB<TaskDescription>> DbNXlk;
    public final MutableStateFlow<vNB<GridReinvestedProfitsQueryVO>> EZpvd;
    public final MutableStateFlow<vNB<List<BillsArchive>>> KWHzl;
    public final MutableStateFlow<vNB<GridWithdrawnProfitsQueryVO>> OLrzqt;
    public final MutableStateFlow<BotLeadProfitProfitOrderDetails> copydefault;
    public final wTO djBIcL;
    public final wTT fetchVPNInfo;
    public final wTW gEmmrt;
    public final wTK valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<BotLeadProfitProfitOrderDetails> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<vNB<TaskDescription>> KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<vNB<Pair<List<BillsArchive>, InterestInfoResponse>>> OLrzqt() {
        return this.AhwBna;
    }

    @yCM
    public OverviewViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull wTK wtk, @NotNull wTT wtt, @NotNull wTO wto, @NotNull wTW wtw) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(wtk, "");
        Intrinsics.checkNotNullParameter(wtt, "");
        Intrinsics.checkNotNullParameter(wto, "");
        Intrinsics.checkNotNullParameter(wtw, "");
        this.AYXKKw = coroutineDispatcher;
        this.valueOf = wtk;
        this.fetchVPNInfo = wtt;
        this.djBIcL = wto;
        this.gEmmrt = wtw;
        MutableStateFlow<BotLeadProfitProfitOrderDetails> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        vNB.Activity activity = vNB.Activity.copydefault;
        MutableStateFlow<vNB<List<BillsArchive>>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(activity);
        this.KWHzl = MutableStateFlow2;
        MutableStateFlow<vNB<InterestInfoResponse>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(activity);
        this.AEQbTJ = MutableStateFlow3;
        this.AhwBna = FlowKt.flowCombine(MutableStateFlow2, MutableStateFlow3, new OverviewViewModel$borrowInterest$1(null));
        MutableStateFlow<vNB<GridReinvestedProfitsQueryVO>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(activity);
        this.EZpvd = MutableStateFlow4;
        MutableStateFlow<vNB<GridWithdrawnProfitsQueryVO>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(activity);
        this.OLrzqt = MutableStateFlow5;
        this.DbNXlk = FlowKt.flowCombine(MutableStateFlow4, MutableStateFlow5, new OverviewViewModel$gridProfits$1(null));
    }

    public final void OLrzqt(Long l, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<vNB<List<BillsArchive>>> mutableStateFlow = this.KWHzl;
        vNB.Activity activity = vNB.Activity.copydefault;
        mutableStateFlow.setValue(activity);
        this.AEQbTJ.setValue(activity);
        AEQbTJ(l);
        if (z) {
            this.AEQbTJ.setValue(new vNB.TaskDescription(null));
        } else {
            KWHzl(str);
        }
    }

    private final void AEQbTJ(Long l) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new OverviewViewModel$getBillArchive$1(this, l, null), 2, null);
    }

    private final void KWHzl(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new OverviewViewModel$getInterestInfo$1(this, str, null), 2, null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new OverviewViewModel$fetchLeadDetailInfo$1(str, this, null), 2, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<vNB<GridReinvestedProfitsQueryVO>> mutableStateFlow = this.EZpvd;
        vNB.Activity activity = vNB.Activity.copydefault;
        mutableStateFlow.setValue(activity);
        this.OLrzqt.setValue(activity);
        OLrzqt(str);
        AEQbTJ(str);
    }

    public final void OLrzqt(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new OverviewViewModel$getReinvestedProfits$1(this, str, null), 2, null);
    }

    public final void AEQbTJ(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new OverviewViewModel$getWithdrawnProfits$1(this, str, null), 2, null);
    }

    public static final class TaskDescription {
        public static final StateListAnimator Companion = new StateListAnimator(null);
        public final Pair<GridReinvestedProfitsQueryVO, GridWithdrawnProfitsQueryVO> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String AhwBna(Pair<? extends GridReinvestedProfitsQueryVO, ? extends GridWithdrawnProfitsQueryVO> pair) {
            return "GridProfits(pair=" + pair + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static Pair<? extends GridReinvestedProfitsQueryVO, ? extends GridWithdrawnProfitsQueryVO> KWHzl(@NotNull Pair<GridReinvestedProfitsQueryVO, GridWithdrawnProfitsQueryVO> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            return pair;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 kotlin.Pair) A[MD:(kotlin.Pair):void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewViewModel.TaskDescription.<init>(kotlin.Pair):void type: CONSTRUCTOR */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final /* synthetic */ TaskDescription OLrzqt(Pair pair) {
            return new TaskDescription(pair);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean OLrzqt(Pair<? extends GridReinvestedProfitsQueryVO, ? extends GridWithdrawnProfitsQueryVO> pair, Object obj) {
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(pair, ((TaskDescription) obj).EZpvd());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static int copydefault(Pair<? extends GridReinvestedProfitsQueryVO, ? extends GridWithdrawnProfitsQueryVO> pair) {
            return pair.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final /* synthetic */ Pair EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            return OLrzqt(this.KWHzl, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return copydefault(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return AhwBna(this.KWHzl);
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewViewModel.TaskDescription.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }
        }

        /* JADX DEBUG: Marked for inline */
        /* JADX DEBUG: Method not inlined, still used in: [com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewViewModel.TaskDescription.OLrzqt(kotlin.Pair):com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewViewModel$TaskDescription] */
        public /* synthetic */ TaskDescription(Pair pair) {
            this.KWHzl = pair;
        }

        public static Pair<? extends GridReinvestedProfitsQueryVO, ? extends GridWithdrawnProfitsQueryVO> OLrzqt(@NotNull GridReinvestedProfitsQueryVO gridReinvestedProfitsQueryVO, @NotNull GridWithdrawnProfitsQueryVO gridWithdrawnProfitsQueryVO) {
            Intrinsics.checkNotNullParameter(gridReinvestedProfitsQueryVO, "");
            Intrinsics.checkNotNullParameter(gridWithdrawnProfitsQueryVO, "");
            return KWHzl(C56390yDp.OLrzqt(gridReinvestedProfitsQueryVO, gridWithdrawnProfitsQueryVO));
        }

        public static final GridReinvestedProfitsQueryVO AEQbTJ(Pair<? extends GridReinvestedProfitsQueryVO, ? extends GridWithdrawnProfitsQueryVO> pair) {
            return pair.getFirst();
        }

        public static final GridWithdrawnProfitsQueryVO EZpvd(Pair<? extends GridReinvestedProfitsQueryVO, ? extends GridWithdrawnProfitsQueryVO> pair) {
            return pair.getSecond();
        }
    }
}
