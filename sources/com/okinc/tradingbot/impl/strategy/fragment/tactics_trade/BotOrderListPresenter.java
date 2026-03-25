package com.okinc.tradingbot.impl.strategy.fragment.tactics_trade;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.api.viewModel.IBotOrderListPresenter;
import com.okinc.tradingbot.impl.botList.dto.BacktestListPreviewDto;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.unify_trade.biz.BotAmtData;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.BotModifyResp;
import com.okinc.unify_trade.biz.BotOrderFilter;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.OrderPositionData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C32866mlf;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C53685wqE;
import o.C54589xNz;
import o.C55276xgr;
import o.C55688xof;
import o.C55697xoo;
import o.C55946xtY;
import o.C56033xvF;
import o.C56111xwe;
import o.C56231xys;
import o.C56390yDp;
import o.C56423yEv;
import o.InterfaceC49429uoQ;
import o.InterfaceC54581xNr;
import o.pUU;
import o.uJB;
import o.wUL;
import o.xAE;
import o.xCJ;
import o.xKK;
import o.xMR;
import o.xOR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOrderListPresenter extends IBotOrderListPresenter {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final StateFlow<BacktestListPreviewDto> AEQbTJ;
    public final TradeLiveData<List<BotCategoryConfig>> AYXKKw;
    public final xCJ AhwBna;
    public boolean AkhnZx;
    public final TradeLiveData<Boolean> AuCTel;
    public final C56111xwe<BotModifyResp> DbNXlk;
    public final uJB EZpvd;
    public final BotAmtData OLrzqt;
    public final MutableStateFlow<BacktestListPreviewDto> copydefault;
    public final TradeLiveData<OrderPositionData> djBIcL;
    public final InterfaceC49429uoQ fARcdN;
    public final xAE fJNWhG;
    public boolean fetchVPNInfo;
    public final C56231xys gEmmrt;
    public boolean isConnected;
    public final BotOrderFilter valueOf;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotAmtData AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49429uoQ AYXKKw() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<BotCategoryConfig>> AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<BacktestListPreviewDto> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<OrderPositionData> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.values = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> fetchVPNInfo() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCJ gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotOrderFilter valueOf() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOrderListPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.fARcdN = C53685wqE.copydefault.AEQbTJ();
        this.AhwBna = new xCJ(false, 1, null);
        this.djBIcL = new TradeLiveData<>();
        this.AuCTel = new TradeLiveData<>();
        this.gEmmrt = new C56231xys();
        this.AYXKKw = new TradeLiveData<>();
        this.EZpvd = uJB.Companion.EZpvd();
        MutableStateFlow<BacktestListPreviewDto> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        this.OLrzqt = new BotAmtData((ConcurrentHashMap) (0 == true ? 1 : 0), (ConcurrentHashMap) null, (ConcurrentHashMap) null, 7, (DefaultConstructorMarker) null);
        this.fJNWhG = new xAE();
        this.DbNXlk = new C56111xwe<>();
        this.valueOf = new BotOrderFilter(null, null, null, null, null, null, null, 127, null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void AkhnZx() {
        xCJ xcj = this.AhwBna;
        xcj.AEQbTJ(this.djBIcL);
        xKK.Activity.execute$default(xcj, 0L, 1, null);
    }

    public final void ejfBZ() {
        C56231xys c56231xys = this.gEmmrt;
        c56231xys.AEQbTJ(this.AYXKKw);
        xKK.Activity.execute$default(c56231xys, 0L, 1, null);
    }

    public final void OLrzqt(@NotNull OrderPositionData orderPositionData) {
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        this.OLrzqt.setCountMap(orderPositionData.getBotAmtData().getCountMap());
        this.AuCTel.setValue(Boolean.valueOf(values()));
    }

    public final List<C55276xgr> KWHzl() {
        xOR xorCopydefault;
        List<OrderCategory> listAEQbTJ;
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.EZpvd((Object) valueOf().getInstType(), (Object) "ANY")) {
            int totalAmt = this.OLrzqt.getTotalAmt();
            String strOLrzqt = (totalAmt <= 0 || this.values) ? "" : C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.scanPackages), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", Integer.valueOf(totalAmt))));
            arrayList.add(new C55276xgr(C33070mpX.AYXKKw(C55688xof.Application.setCurrentControllerInfo) + " " + strOLrzqt, C56390yDp.OLrzqt("all_bot", Integer.valueOf(totalAmt)), null, Intrinsics.EZpvd((Object) valueOf().getBotType(), (Object) "all_bot"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null && (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) != null && (listAEQbTJ = xorCopydefault.AEQbTJ()) != null) {
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                String strategyType = ((OrderCategory) it.next()).getStrategyType();
                if (this.values || !this.fetchVPNInfo || this.OLrzqt.getAmtFor(strategyType) > 0) {
                    arrayList.add(new C55276xgr(KWHzl(strategyType, false), C56390yDp.OLrzqt(strategyType, Integer.valueOf(this.OLrzqt.getAmtFor(strategyType))), null, Intrinsics.EZpvd((Object) valueOf().getBotType(), (Object) strategyType), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
                }
            }
        }
        if (valueOf().getInstType().length() <= 0 || Intrinsics.EZpvd((Object) valueOf().getInstType(), (Object) "ANY")) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C55946xtY c55946xtY = C55946xtY.OLrzqt;
            Object objOLrzqt = ((C55276xgr) obj).OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            if (c55946xtY.copydefault((String) ((Pair) objOLrzqt).getFirst(), valueOf().getInstType())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public String djBIcL() {
        return getBotTitle$default(this, valueOf().getBotType(), false, 2, null);
    }

    public static /* synthetic */ String getBotTitle$default(BotOrderListPresenter botOrderListPresenter, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return botOrderListPresenter.KWHzl(str, z);
    }

    public final String KWHzl(@NotNull String str, boolean z) {
        int totalAmt;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("BottomTabRunningAmt", "isHistory -> " + this.values);
        if (this.values) {
            return C56033xvF.iwGUEr(str);
        }
        if (C55697xoo.OLrzqt.isConnected()) {
            totalAmt = Intrinsics.EZpvd((Object) str, (Object) "all_bot") ? this.OLrzqt.getTotalAmt() : this.OLrzqt.getAmtFor(str);
        } else {
            totalAmt = 0;
        }
        String strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.scanPackages), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", xMR.copydefault.copydefault(C33129mqd.gEmmrt(Integer.valueOf(totalAmt))))));
        if (totalAmt > 0 || (totalAmt == 0 && z)) {
            str2 = strOLrzqt;
        }
        pUU.KWHzl("BottomTabRunningAmt", "botType -> " + str + ", num -> " + totalAmt + ", numWithBracket -> " + strOLrzqt + ", numText -> " + str2);
        return C56033xvF.iwGUEr(str) + " " + str2;
    }

    public final void OLrzqt(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("trade_strategy_list_type_select", (TrackChannel[]) null, new Function1() { // from class: o.wJk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotOrderListPresenter.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit EZpvd(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!Intrinsics.EZpvd((Object) C54589xNz.EZpvd.fetchVPNInfo(), (Object) "trade_cedefi_dex")) {
            switch (str.hashCode()) {
                case -1216369070:
                    if (!str.equals("smart_portfolio")) {
                        return true;
                    }
                    break;
                case -557961837:
                    if (str.equals("smart_arbitrage")) {
                    }
                    break;
                case 1165749981:
                    if (!str.equals("recurring")) {
                    }
                    break;
                case 1780188297:
                    if (!str.equals("arbitrage")) {
                    }
                    break;
            }
        }
        return false;
    }

    public final boolean values() {
        return this.OLrzqt.getTotalAmt() > 40;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AhwBna, this.gEmmrt, this.fJNWhG);
    }

    public final void EZpvd() {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new BotOrderListPresenter$fetchSignalCount$1(this, null), 3, null);
    }
}
