package com.okinc.tradingbot.impl.market_place.my_bot.presenter;

import android.app.Application;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListData;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.CustomerSignalsItem;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SwitchRenewData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C51716vsK;
import o.C56111xwe;
import o.C56277xzl;
import o.C56279xzn;
import o.C56286xzu;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class MyBotSignalListPresenter extends AbsPresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final C56286xzu AEQbTJ;
    public final C56111xwe<MySignalListData> AYXKKw;
    public final C56111xwe<List<EmptyResp>> EZpvd;
    public final C56111xwe<List<EmptyResp>> KWHzl;
    public final C56279xzn copydefault;
    public String djBIcL;
    public final C56277xzl gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56277xzl AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<EmptyResp>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<EmptyResp>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<MySignalListData> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56286xzu copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBotSignalListPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C56111xwe<>();
        this.AEQbTJ = new C56286xzu();
        this.EZpvd = new C56111xwe<>();
        this.copydefault = new C56279xzn();
        this.AYXKKw = new C56111xwe<>();
        this.gEmmrt = new C56277xzl();
        this.djBIcL = "1";
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotSignalListPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void KWHzl(@NotNull SwitchRenewData switchRenewData) {
        Intrinsics.checkNotNullParameter(switchRenewData, "");
        C56286xzu c56286xzu = this.AEQbTJ;
        c56286xzu.copydefault(switchRenewData);
        c56286xzu.AEQbTJ(this.KWHzl);
        xKK.Activity.execute$default(c56286xzu, 0L, 1, null);
    }

    public final void EZpvd(@NotNull SwitchRenewData switchRenewData) {
        Intrinsics.checkNotNullParameter(switchRenewData, "");
        C56279xzn c56279xzn = this.copydefault;
        c56279xzn.AEQbTJ(switchRenewData);
        c56279xzn.AEQbTJ(this.EZpvd);
        xKK.Activity.execute$default(c56279xzn, 0L, 1, null);
    }

    public final void AYXKKw() {
        C56277xzl c56277xzl = this.gEmmrt;
        c56277xzl.copydefault(this.djBIcL);
        c56277xzl.KWHzl("15");
        c56277xzl.OLrzqt(this.AYXKKw, new C51716vsK());
        xKK.Activity.execute$default(c56277xzl, 0L, 1, null);
    }

    public final SignalDetails copydefault(@NotNull CustomerSignalsItem customerSignalsItem) {
        Intrinsics.checkNotNullParameter(customerSignalsItem, "");
        String signalChanId = customerSignalsItem.getSignalChanId();
        String str = signalChanId == null ? "" : signalChanId;
        String userSubscriptionType = customerSignalsItem.getUserSubscriptionType();
        String subscriptionFee = customerSignalsItem.getSubscriptionFee();
        String str2 = subscriptionFee == null ? "" : subscriptionFee;
        String username = customerSignalsItem.getUsername();
        String str3 = username == null ? "" : username;
        String avatar = customerSignalsItem.getAvatar();
        String str4 = avatar == null ? "" : avatar;
        String subscriptionExpireTime = customerSignalsItem.getSubscriptionExpireTime();
        return new SignalDetails(str, null, null, null, null, null, null, userSubscriptionType, false, null, null, subscriptionExpireTime == null ? "" : subscriptionExpireTime, str2, null, null, null, null, str3, str4, null, customerSignalsItem.getAutoRenewal(), null, null, null, null, null, 65660798, null);
    }

    public final BotTradeData OLrzqt(@NotNull CustomerSignalsItem customerSignalsItem) {
        Intrinsics.checkNotNullParameter(customerSignalsItem, "");
        String signalChanId = customerSignalsItem.getSignalChanId();
        String signalChanName = customerSignalsItem.getSignalChanName();
        String str = signalChanName == null ? "" : signalChanName;
        String type = customerSignalsItem.getType();
        String userSubscriptionType = customerSignalsItem.getUserSubscriptionType();
        String subscriptionFee = customerSignalsItem.getSubscriptionFee();
        String str2 = subscriptionFee == null ? "" : subscriptionFee;
        String profitSharingRatio = customerSignalsItem.getProfitSharingRatio();
        String str3 = profitSharingRatio == null ? "" : profitSharingRatio;
        String username = customerSignalsItem.getUsername();
        String str4 = username == null ? "" : username;
        String avatar = customerSignalsItem.getAvatar();
        return new BotTradeData("signal_bot", "", "SWAP", (Parcelable) new SignalListItem((String) null, signalChanId, str, (String) null, userSubscriptionType, str3, str2, str4, avatar == null ? "" : avatar, type, (String) null, (String) null, (String) null, (String) null, false, 31753, (DefaultConstructorMarker) null), false, (String) null, (String) null, false, (List) null, 496, (DefaultConstructorMarker) null);
    }

    public final SignalListItem EZpvd(@NotNull CustomerSignalsItem customerSignalsItem) {
        Intrinsics.checkNotNullParameter(customerSignalsItem, "");
        return new SignalListItem((String) null, customerSignalsItem.getSignalChanId(), customerSignalsItem.getSignalChanName(), customerSignalsItem.getSignalDescription(), (String) null, (String) null, (String) null, (String) null, (String) null, customerSignalsItem.getType(), (String) null, (String) null, (String) null, (String) null, false, 32241, (DefaultConstructorMarker) null);
    }

    public final SwitchRenewData AEQbTJ(@NotNull SignalDetails signalDetails) {
        Intrinsics.checkNotNullParameter(signalDetails, "");
        return new SwitchRenewData(signalDetails.getSignalChanId(), Boolean.valueOf(signalDetails.getAutoRenewal()));
    }

    public final boolean gEmmrt() {
        return Intrinsics.EZpvd((Object) this.djBIcL, (Object) "1");
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AEQbTJ, this.copydefault, this.gEmmrt);
    }
}
