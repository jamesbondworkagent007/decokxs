package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.SignalBotCreateSignReq;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C54507xKz;
import o.C56111xwe;
import o.C56235xyw;
import o.InterfaceC54501xKt;
import o.xAT;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalBotCreateSignPresenter extends AbsPresenter {
    public final C56111xwe<Unit> AEQbTJ;
    public final TradeLiveData<SignalListItem> EZpvd;
    public final xAT KWHzl;
    public final TradeLiveData<StrategyConfigInfo> OLrzqt;
    public final C56235xyw copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAT AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<Unit> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56235xyw OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SignalListItem> valueOf() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotCreateSignPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new xAT();
        this.EZpvd = new TradeLiveData<>();
        this.copydefault = new C56235xyw();
        this.OLrzqt = new TradeLiveData<>();
        this.AEQbTJ = new C56111xwe<>();
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        xAT xat = this.KWHzl;
        xat.EZpvd(new SignalBotCreateSignReq(str, str2));
        xat.djBIcL();
        xat.OLrzqt(this.EZpvd, new TaskDescription(str, str2));
        xKK.Activity.execute$default(xat, 0L, 1, null);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends SignalListItem>, SignalListItem> {
        public final /* synthetic */ String AEQbTJ;
        public final /* synthetic */ String EZpvd;

        public TaskDescription(String str, String str2) {
            this.EZpvd = str;
            this.AEQbTJ = str2;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public SignalListItem KWHzl(List<SignalListItem> list) {
            Intrinsics.checkNotNullParameter(list, "");
            Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(list);
            String str = this.EZpvd;
            String str2 = this.AEQbTJ;
            SignalListItem signalListItem = (SignalListItem) objAuCTelauCTel;
            signalListItem.setSignalChanName(str);
            signalListItem.setSignalDescription(str2);
            return signalListItem;
        }
    }

    public final void copydefault() {
        C56235xyw c56235xyw = this.copydefault;
        c56235xyw.KWHzl("signal_bot");
        c56235xyw.AEQbTJ("BTC-USDT-SWAP");
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.OLrzqt, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final void KWHzl() {
        this.AEQbTJ.postValue(Unit.INSTANCE);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.KWHzl, this.copydefault);
    }
}
