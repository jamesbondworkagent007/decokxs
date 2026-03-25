package com.okinc.tradingbot.impl.market_place.my_bot.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.github.mikephil.charting.data.Entry;
import com.okinc.core.util.SPUtils;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.tradingbot.impl.market_place.my_bot.view.MyBotAssetDateType;
import com.okinc.tradingbot.impl.strategy.bean.BotAssetsChartData;
import com.okinc.unify_trade.biz.BotAssetsHistoryData;
import com.okinc.unify_trade.biz.BotUserSummaryData;
import com.okinc.unify_trade.biz.BotUserSummaryReq;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C33129mqd;
import o.C43251rlk;
import o.C55697xoo;
import o.C56033xvF;
import o.C56203xyQ;
import o.C56275xzj;
import o.InterfaceC8218ayb;
import o.pTA;
import o.xAL;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class MyBotAssetsChartPresenter extends AbsPresenter {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final TradeLiveData<List<BotAssetsHistoryData>> AEQbTJ;
    public boolean AYXKKw;
    public final C56275xzj AhwBna;
    public final xAL AkhnZx;
    public final TradeLiveData<BotAssetsChartData> EZpvd;
    public final C56203xyQ KWHzl;
    public String OLrzqt;
    public String djBIcL;
    public final TradeLiveData<BotAssetsChartData> gEmmrt;
    public boolean valueOf;
    public final TradeLiveData<BotUserSummaryData> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56203xyQ AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotAssetsChartData> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotUserSummaryData> AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotAssetsChartData> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<BotAssetsHistoryData>> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56275xzj djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAL values() {
        return this.AkhnZx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBotAssetsChartPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = "";
        this.valueOf = true;
        this.OLrzqt = "";
        this.AkhnZx = new xAL();
        this.values = new TradeLiveData<>();
        this.AhwBna = new C56275xzj();
        this.KWHzl = new C56203xyQ();
        this.AEQbTJ = new TradeLiveData<>();
        this.gEmmrt = new TradeLiveData<>();
        this.EZpvd = new TradeLiveData<>();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotAssetsChartPresenter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ void queryUserSummary$default(MyBotAssetsChartPresenter myBotAssetsChartPresenter, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            bool = Boolean.FALSE;
        }
        myBotAssetsChartPresenter.OLrzqt(str, bool);
    }

    public final void OLrzqt(String str, Boolean bool) {
        if (str == null || str.length() == 0) {
            str = ((InterfaceC8218ayb) C43251rlk.copydefault(InterfaceC8218ayb.class)).OLrzqt().getValue().getUnit();
        }
        xAL xal = this.AkhnZx;
        xal.OLrzqt(new BotUserSummaryReq(!isConnected(), str, isConnected() ? "smart_arbitrage" : null), bool);
        xal.AEQbTJ(this.values);
        xKK.Activity.execute$default(xal, 0L, 1, null);
    }

    public static /* synthetic */ void querySingleAssetsHistoryData$default(MyBotAssetsChartPresenter myBotAssetsChartPresenter, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = myBotAssetsChartPresenter.OLrzqt().getType();
        }
        myBotAssetsChartPresenter.KWHzl(str, str2);
    }

    public final void KWHzl(String str, String str2) {
        C56275xzj c56275xzj = this.AhwBna;
        c56275xzj.AEQbTJ(this.AEQbTJ);
        c56275xzj.AEQbTJ(str);
        c56275xzj.copydefault(str2);
        xKK.Activity.execute$default(c56275xzj, 0L, 1, null);
    }

    public static /* synthetic */ void queryAssetsHistoryData$default(MyBotAssetsChartPresenter myBotAssetsChartPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = myBotAssetsChartPresenter.OLrzqt().getType();
        }
        myBotAssetsChartPresenter.EZpvd(str);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (isConnected()) {
            KWHzl(str, "smart_arbitrage");
            return;
        }
        C56203xyQ c56203xyQ = this.KWHzl;
        c56203xyQ.AEQbTJ(this.AEQbTJ);
        c56203xyQ.copydefault(str);
        xKK.Activity.execute$default(c56203xyQ, 0L, 1, null);
    }

    public final void EZpvd(@NotNull List<BotAssetsHistoryData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new MyBotAssetsChartPresenter$doParseChartData$1(list, this, null), 2, null);
    }

    public final BotUserSummaryData EZpvd() {
        BotUserSummaryData value = this.values.getValue();
        return value == null ? new BotUserSummaryData(null, null, null, null, 0, null, 0, null, 0, null, null, false, 0, null, 16383, null) : value;
    }

    public final List<BotAssetsHistoryData> valueOf() {
        List<BotAssetsHistoryData> value = this.AEQbTJ.getValue();
        return value == null ? yDY.AhwBna() : value;
    }

    public final BotAssetsChartData gEmmrt() {
        BotAssetsChartData value = this.gEmmrt.getValue();
        return value == null ? new BotAssetsChartData(null, null, null, false, null, 31, null) : value;
    }

    public final boolean fJNWhG() {
        return SPUtils.getBoolean("bot_assets_eye", true);
    }

    public final void EZpvd(boolean z) {
        SPUtils.put("bot_assets_eye", Boolean.valueOf(z));
    }

    public final BotUserSummaryData OLrzqt(@NotNull Entry entry) {
        String strCopydefault;
        String assets;
        Intrinsics.checkNotNullParameter(entry, "");
        BotUserSummaryData botUserSummaryDataEZpvd = EZpvd();
        Object data = entry.getData();
        BotAssetsHistoryData botAssetsHistoryData = data instanceof BotAssetsHistoryData ? (BotAssetsHistoryData) data : null;
        String str = (botAssetsHistoryData == null || (assets = botAssetsHistoryData.getAssets()) == null) ? "" : assets;
        if (!botUserSummaryDataEZpvd.isNeedTransfer()) {
            String ccy = botUserSummaryDataEZpvd.getOrigin().getCcy();
            if (ccy == null) {
                ccy = "USDT";
            }
            strCopydefault = C56033xvF.copydefault(str, ccy, (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : "2", (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null);
        } else {
            strCopydefault = C56033xvF.copydefault(C33129mqd.mulS$default(str, botUserSummaryDataEZpvd.getMultiplierForBotAssets(), Integer.valueOf(botUserSummaryDataEZpvd.getPrecision()), null, null, 12, null), botUserSummaryDataEZpvd.getAssetSymbol(), (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : String.valueOf(botUserSummaryDataEZpvd.getPrecision()), (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null);
        }
        return new BotUserSummaryData(null, strCopydefault, null, null, 0, null, 0, null, 0, null, null, false, 0, null, 16381, null);
    }

    public final MyBotAssetDateType OLrzqt() {
        MyBotAssetDateType myBotAssetDateType;
        String string = SPUtils.getString(AuCTel(), MyBotAssetDateType.ONE_DAY.getType());
        MyBotAssetDateType[] myBotAssetDateTypeArrValues = MyBotAssetDateType.values();
        int length = myBotAssetDateTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                myBotAssetDateType = null;
                break;
            }
            myBotAssetDateType = myBotAssetDateTypeArrValues[i];
            if (Intrinsics.EZpvd((Object) myBotAssetDateType.getType(), (Object) string)) {
                break;
            }
            i++;
        }
        return myBotAssetDateType == null ? MyBotAssetDateType.ONE_DAY : myBotAssetDateType;
    }

    public final void copydefault(@NotNull MyBotAssetDateType myBotAssetDateType) {
        Intrinsics.checkNotNullParameter(myBotAssetDateType, "");
        SPUtils.put(AuCTel(), myBotAssetDateType.getType());
    }

    private final String AuCTel() {
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        return (c55697xoo.isConnected() ? c55697xoo.copydefault() : "") + "_my_bot_assets_date";
    }

    public final List<String> AEQbTJ(@NotNull List<BotAssetsHistoryData> list, @NotNull MyBotAssetDateType myBotAssetDateType) {
        OKDateEnum oKDateEnum;
        OKTimeEnum oKTimeEnum;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(myBotAssetDateType, "");
        BotAssetsHistoryData botAssetsHistoryData = (BotAssetsHistoryData) CollectionsKt___CollectionsKt.firstOrNull(list);
        long jValueOf = C33129mqd.valueOf(botAssetsHistoryData != null ? botAssetsHistoryData.getTs() : null);
        BotAssetsHistoryData botAssetsHistoryData2 = (BotAssetsHistoryData) CollectionsKt___CollectionsKt.wlaJM(list);
        long jValueOf2 = C33129mqd.valueOf(botAssetsHistoryData2 != null ? botAssetsHistoryData2.getTs() : null);
        if (list.isEmpty() || jValueOf == jValueOf2 || jValueOf == 0) {
            return yDY.AhwBna();
        }
        if (myBotAssetDateType == MyBotAssetDateType.ONE_DAY) {
            oKDateEnum = OKDateEnum.NONE;
            oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
        } else {
            oKDateEnum = OKDateEnum.DATE_FORMAT_SIMPLE_MD;
            oKTimeEnum = OKTimeEnum.NONE;
        }
        ArrayList arrayList = new ArrayList();
        for (double dAddD$default = 0.1d; C33129mqd.gEmmrt(Double.valueOf(dAddD$default), 1); dAddD$default = C33129mqd.addD$default(Double.valueOf(dAddD$default), Double.valueOf(0.2d), null, null, null, 14, null)) {
            int iAhwBna = C33129mqd.AhwBna(Double.valueOf(Math.rint(C33129mqd.mulD$default(Integer.valueOf(list.size()), Double.valueOf(dAddD$default), null, null, null, 14, null))));
            if (iAhwBna >= list.size() - 1) {
                iAhwBna--;
            }
            arrayList.add(pTA.format$default(new Date(C33129mqd.valueOf(list.get(iAhwBna).getTs())), oKDateEnum, oKTimeEnum, null, null, false, 28, null));
        }
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AkhnZx, this.KWHzl, this.AhwBna);
    }

    public final boolean AkhnZx() {
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) "explore");
    }

    public final boolean isConnected() {
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) "SmartArbRecommendationView");
    }
}
