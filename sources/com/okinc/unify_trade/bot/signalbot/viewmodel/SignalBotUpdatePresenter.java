package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.SignalBotUpdateReq;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54507xKz;
import o.C56235xyw;
import o.xAX;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalBotUpdatePresenter extends AbsPresenter {
    public final C56235xyw AEQbTJ;
    public final xAX AYXKKw;
    public final TradeLiveData<StrategyConfigInfo> EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public final TradeLiveData<List<SignalListItem>> copydefault;
    public SignalListItem gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56235xyw AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<SignalListItem>> AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalListItem AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        this.gEmmrt = signalListItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAX gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotUpdatePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = "";
        this.KWHzl = "";
        this.gEmmrt = new SignalListItem((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 32767, (DefaultConstructorMarker) null);
        this.AYXKKw = new xAX();
        this.copydefault = new TradeLiveData<>();
        this.AEQbTJ = new C56235xyw();
        this.EZpvd = new TradeLiveData<>();
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.gEmmrt.setSignalChanName(str);
        this.gEmmrt.setSignalDescription(str2);
    }

    public final void DbNXlk() {
        xAX xax = this.AYXKKw;
        xax.AEQbTJ(this.copydefault);
        xax.copydefault(KWHzl());
        xKK.Activity.execute$default(xax, 0L, 1, null);
    }

    public final void OLrzqt() {
        C56235xyw c56235xyw = this.AEQbTJ;
        c56235xyw.KWHzl("signal_bot");
        c56235xyw.AEQbTJ("BTC-USDT-SWAP");
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final SignalBotUpdateReq KWHzl() {
        return new SignalBotUpdateReq(this.gEmmrt.getSignalChanId(), this.gEmmrt.getSignalChanName(), this.gEmmrt.getSignalDescription());
    }

    public final boolean valueOf() {
        return Intrinsics.EZpvd((Object) this.gEmmrt.getSignalChanName(), (Object) this.OLrzqt) && Intrinsics.EZpvd((Object) this.gEmmrt.getSignalDescription(), (Object) this.KWHzl);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AYXKKw, this.AEQbTJ);
    }
}
