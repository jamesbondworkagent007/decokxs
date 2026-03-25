package com.okinc.tradingbot.impl.market_place.presenter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.SettlementBean;
import com.okinc.unify_trade.biz.SignalBotSettlementDetailBean;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56109xwc;
import o.C56209xyW;
import o.C56402yEa;
import o.InterfaceC54501xKt;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BotLeadSignalBotSettlementPresenter extends AbsPresenter {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public String AEQbTJ;
    public final C56209xyW EZpvd;
    public final TradeLiveData<Boolean> KWHzl;
    public final TradeLiveData<List<SettlementBean>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<SettlementBean>> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56209xyW KWHzl() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadSignalBotSettlementPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C56209xyW();
        this.copydefault = new TradeLiveData<>();
        this.KWHzl = new TradeLiveData<>();
        this.AEQbTJ = "0";
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.presenter.BotLeadSignalBotSettlementPresenter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C56209xyW c56209xyW = this.EZpvd;
        c56209xyW.EZpvd(C33129mqd.addS$default(this.AEQbTJ, 1, null, null, null, 14, null), "10", str, str2);
        c56209xyW.OLrzqt(new C56109xwc(), new Activity());
        xKK.Activity.execute$default(c56209xyW, 0L, 1, null);
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends SignalBotSettlementDetailBean>, SignalBotSettlementDetailBean> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public SignalBotSettlementDetailBean KWHzl(List<SignalBotSettlementDetailBean> list) {
            String page;
            List<SettlementBean> value;
            List<SettlementBean> listAhwBna;
            Intrinsics.checkNotNullParameter(list, "");
            SignalBotSettlementDetailBean signalBotSettlementDetailBean = (SignalBotSettlementDetailBean) CollectionsKt___CollectionsKt.firstOrNull(list);
            BotLeadSignalBotSettlementPresenter botLeadSignalBotSettlementPresenter = BotLeadSignalBotSettlementPresenter.this;
            if (signalBotSettlementDetailBean == null || (page = signalBotSettlementDetailBean.getPage()) == null) {
                page = BotLeadSignalBotSettlementPresenter.this.AEQbTJ;
            }
            botLeadSignalBotSettlementPresenter.AEQbTJ = page;
            if (Intrinsics.EZpvd((Object) BotLeadSignalBotSettlementPresenter.this.AEQbTJ, (Object) "1") || (value = BotLeadSignalBotSettlementPresenter.this.AEQbTJ().getValue()) == null) {
                value = yDY.AhwBna();
            }
            TradeLiveData<List<SettlementBean>> tradeLiveDataAEQbTJ = BotLeadSignalBotSettlementPresenter.this.AEQbTJ();
            ArrayList arrayList = new ArrayList(value);
            if (signalBotSettlementDetailBean == null || (listAhwBna = signalBotSettlementDetailBean.getSettlements()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            arrayList.addAll(listAhwBna);
            tradeLiveDataAEQbTJ.setValue(arrayList);
            TradeLiveData<Boolean> tradeLiveDataEZpvd = BotLeadSignalBotSettlementPresenter.this.EZpvd();
            String totalCount = signalBotSettlementDetailBean != null ? signalBotSettlementDetailBean.getTotalCount() : null;
            List<SettlementBean> value2 = BotLeadSignalBotSettlementPresenter.this.AEQbTJ().getValue();
            tradeLiveDataEZpvd.setValue(Boolean.valueOf(C33129mqd.AEQbTJ(totalCount, value2 != null ? Integer.valueOf(value2.size()) : null)));
            return signalBotSettlementDetailBean;
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.EZpvd);
    }
}
