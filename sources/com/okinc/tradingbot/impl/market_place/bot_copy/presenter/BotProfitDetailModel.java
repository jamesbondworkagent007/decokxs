package com.okinc.tradingbot.impl.market_place.bot_copy.presenter;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.BotLeadProfitProfitTopDetails;
import com.okinc.unify_trade.biz.BotLeadProfitProfitDetails;
import com.okinc.unify_trade.biz.BotLeadProfitProfitDetailsUser;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import com.okinc.unify_trade.biz.BotLeadProfitProfitUserListDetails;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56204xyR;
import o.C56205xyS;
import o.InterfaceC54501xKt;
import o.pTA;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotProfitDetailModel extends AbsPresenter {
    public final TradeLiveData<BotLeadProfitProfitOrderDetails> AEQbTJ;
    public final C56204xyR AYXKKw;
    public final TradeLiveData<Boolean> AhwBna;
    public int AkhnZx;
    public BotLeadProfitProfitUserListDetails DbNXlk;
    public ArrayList<Object> EZpvd;
    public BotLeadStrateShowData KWHzl;
    public final TradeLiveData<BotLeadProfitProfitDetails> OLrzqt;
    public final TradeLiveData<BotLeadProfitProfitDetails> copydefault;
    public final TradeLiveData<Boolean> djBIcL;
    public String fetchVPNInfo;
    public BotLeadProfitProfitDetailsUser gEmmrt;
    public final Application isConnected;
    public final C56205xyS valueOf;
    public final StateListAnimator values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Object> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56204xyR EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotLeadProfitProfitOrderDetails> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(BotLeadStrateShowData botLeadStrateShowData) {
        this.KWHzl = botLeadStrateShowData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56205xyS copydefault() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotProfitDetailModel(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = new TradeLiveData<>();
        this.copydefault = new TradeLiveData<>();
        this.OLrzqt = new TradeLiveData<>();
        this.AEQbTJ = new TradeLiveData<>();
        this.EZpvd = new ArrayList<>();
        this.DbNXlk = new BotLeadProfitProfitUserListDetails((ArrayList) null, 1, (DefaultConstructorMarker) null);
        this.AhwBna = new TradeLiveData<>();
        this.AYXKKw = new C56204xyR();
        this.valueOf = new C56205xyS();
        this.AkhnZx = 1;
        this.fetchVPNInfo = "10";
        this.values = new StateListAnimator();
        this.isConnected = new Application();
    }

    public static /* synthetic */ void setHeaderData$default(BotProfitDetailModel botProfitDetailModel, BotLeadStrateShowData botLeadStrateShowData, int i, Object obj) {
        if ((i & 1) != 0) {
            botLeadStrateShowData = null;
        }
        botProfitDetailModel.KWHzl(botLeadStrateShowData);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList<BotLeadProfitProfitDetailsUser> details = this.DbNXlk.getDetails();
        if (details != null) {
            details.clear();
        }
        this.EZpvd.clear();
        KWHzl(str);
    }

    public final void OLrzqt(String str) {
        C56204xyR c56204xyR = this.AYXKKw;
        int i = this.AkhnZx;
        c56204xyR.EZpvd(str, String.valueOf(i), this.fetchVPNInfo);
        c56204xyR.djBIcL();
        c56204xyR.OLrzqt(this.copydefault, this.values);
        xKK.Activity.execute$default(c56204xyR, 0L, 1, null);
    }

    public final void KWHzl(String str) {
        C56205xyS c56205xyS = this.valueOf;
        c56205xyS.copydefault(str);
        c56205xyS.djBIcL();
        c56205xyS.OLrzqt(this.AEQbTJ, new ActionBar(str));
        xKK.Activity.execute$default(c56205xyS, 0L, 1, null);
    }

    public static final class ActionBar implements InterfaceC54501xKt<List<? extends BotLeadProfitProfitOrderDetails>, BotLeadProfitProfitOrderDetails> {
        public final /* synthetic */ String EZpvd;

        public ActionBar(String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public BotLeadProfitProfitOrderDetails KWHzl(List<BotLeadProfitProfitOrderDetails> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails = list.isEmpty() ^ true ? list.get(0) : new BotLeadProfitProfitOrderDetails((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
            BotProfitDetailModel.this.KWHzl().setValue(botLeadProfitProfitOrderDetails);
            BotProfitDetailModel.this.EZpvd(botLeadProfitProfitOrderDetails);
            BotProfitDetailModel.this.OLrzqt(this.EZpvd);
            return botLeadProfitProfitOrderDetails;
        }
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx++;
        AYXKKw(str);
    }

    public final void AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56204xyR c56204xyR = this.AYXKKw;
        int i = this.AkhnZx;
        c56204xyR.EZpvd(str, String.valueOf(i), this.fetchVPNInfo);
        c56204xyR.djBIcL();
        c56204xyR.OLrzqt(this.OLrzqt, this.isConnected);
        xKK.Activity.execute$default(c56204xyR, 0L, 1, null);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends BotLeadProfitProfitDetails>, BotLeadProfitProfitDetails> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public BotLeadProfitProfitDetails KWHzl(List<BotLeadProfitProfitDetails> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BotLeadProfitProfitDetails botLeadProfitProfitDetails = list.isEmpty() ^ true ? list.get(0) : new BotLeadProfitProfitDetails((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
            BotProfitDetailModel.this.AkhnZx = C33129mqd.AhwBna(botLeadProfitProfitDetails.getPage());
            BotProfitDetailModel.this.AEQbTJ(botLeadProfitProfitDetails);
            return botLeadProfitProfitDetails;
        }
    }

    public static final class Application implements InterfaceC54501xKt<List<? extends BotLeadProfitProfitDetails>, BotLeadProfitProfitDetails> {
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ BotLeadProfitProfitDetails KWHzl(List<? extends BotLeadProfitProfitDetails> list) {
            return KWHzl2((List<BotLeadProfitProfitDetails>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public BotLeadProfitProfitDetails KWHzl2(List<BotLeadProfitProfitDetails> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BotLeadProfitProfitDetails botLeadProfitProfitDetails = list.isEmpty() ^ true ? list.get(0) : new BotLeadProfitProfitDetails((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
            BotProfitDetailModel.this.AkhnZx = C33129mqd.AhwBna(botLeadProfitProfitDetails.getPage());
            List<BotLeadProfitProfitDetailsUser> details = botLeadProfitProfitDetails.getDetails();
            Integer numValueOf = details != null ? Integer.valueOf(details.size()) : null;
            Intrinsics.copydefault(numValueOf);
            BotProfitDetailModel.this.AhwBna().setValue(Boolean.valueOf(numValueOf.intValue() < C33129mqd.AhwBna(BotProfitDetailModel.this.fetchVPNInfo)));
            BotProfitDetailModel.this.OLrzqt(botLeadProfitProfitDetails);
            return botLeadProfitProfitDetails;
        }
    }

    public final void EZpvd(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
        BotLeadProfitProfitTopDetails botLeadProfitProfitTopDetails = new BotLeadProfitProfitTopDetails(null, null, 3, null);
        BotLeadStrateShowData botLeadStrateShowData = this.KWHzl;
        if (botLeadStrateShowData == null) {
            botLeadStrateShowData = new BotLeadStrateShowData(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        }
        botLeadProfitProfitTopDetails.OLrzqt(botLeadStrateShowData);
        botLeadProfitProfitTopDetails.OLrzqt(botLeadProfitProfitOrderDetails);
        this.EZpvd.add(botLeadProfitProfitTopDetails);
        this.EZpvd.add(this.DbNXlk);
    }

    public final void AEQbTJ(BotLeadProfitProfitDetails botLeadProfitProfitDetails) {
        ArrayList<BotLeadProfitProfitDetailsUser> details = this.DbNXlk.getDetails();
        if (details != null) {
            details.clear();
        }
        EZpvd(botLeadProfitProfitDetails);
    }

    public final void OLrzqt(BotLeadProfitProfitDetails botLeadProfitProfitDetails) {
        EZpvd(botLeadProfitProfitDetails);
    }

    public final void EZpvd(BotLeadProfitProfitDetails botLeadProfitProfitDetails) {
        ArrayList<BotLeadProfitProfitDetailsUser> details;
        List<BotLeadProfitProfitDetailsUser> details2 = botLeadProfitProfitDetails.getDetails();
        if (details2 != null && (details = this.DbNXlk.getDetails()) != null) {
            details.addAll(details2);
        }
        KWHzl(this.DbNXlk.getDetails());
        this.djBIcL.setValue(Boolean.TRUE);
    }

    public final String EZpvd(String str) {
        return pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(str)), null, 1, null);
    }

    public final boolean AEQbTJ(String str, String str2) {
        return Intrinsics.EZpvd((Object) EZpvd(str), (Object) EZpvd(str2));
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AYXKKw, this.valueOf);
    }

    public final void KWHzl(ArrayList<BotLeadProfitProfitDetailsUser> arrayList) {
        String settlementTime;
        this.gEmmrt = null;
        if (arrayList != null) {
            for (BotLeadProfitProfitDetailsUser botLeadProfitProfitDetailsUser : arrayList) {
                BotLeadProfitProfitDetailsUser botLeadProfitProfitDetailsUser2 = this.gEmmrt;
                if (botLeadProfitProfitDetailsUser2 == null) {
                    botLeadProfitProfitDetailsUser.setTopTime(true);
                } else {
                    if (botLeadProfitProfitDetailsUser2 == null || (settlementTime = botLeadProfitProfitDetailsUser2.getSettlementTime()) == null) {
                        settlementTime = "";
                    }
                    botLeadProfitProfitDetailsUser.setTopTime(!AEQbTJ(settlementTime, botLeadProfitProfitDetailsUser.getSettlementTime() != null ? r4 : ""));
                }
                this.gEmmrt = botLeadProfitProfitDetailsUser;
            }
        }
    }
}
