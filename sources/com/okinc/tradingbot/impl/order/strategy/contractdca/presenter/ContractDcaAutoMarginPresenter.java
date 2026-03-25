package com.okinc.tradingbot.impl.order.strategy.contractdca.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54589xNz;
import o.C56152xxS;
import o.C56402yEa;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ContractDcaAutoMarginPresenter extends AbsPresenter {
    public final C56152xxS EZpvd;
    public String KWHzl;
    public final TradeLiveData<List<StrategyResponse>> OLrzqt;
    public TacticsData copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56152xxS AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        this.copydefault = tacticsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<StrategyResponse>> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaAutoMarginPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C56152xxS();
        this.OLrzqt = new TradeLiveData<>();
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaAutoMarginPresenter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final TacticsData KWHzl() {
        TacticsData tacticsData = this.copydefault;
        if (tacticsData != null) {
            return tacticsData;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean AhwBna() {
        return KWHzl().getAutoMarginReloadSwitch();
    }

    public final BizInstrument copydefault() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, KWHzl().getInstType(), KWHzl().getInstId(), null, null, 12, null);
        }
        return null;
    }

    public final void valueOf() {
        C56152xxS c56152xxS = this.EZpvd;
        c56152xxS.copydefault(new EditContractDcaReq(KWHzl().getAlgoId(), null, null, null, null, null, null, null, "contract_dca", null, "2", !AhwBna(), AhwBna() ? null : this.KWHzl, 766, null));
        c56152xxS.AEQbTJ(this.OLrzqt);
        xKK.Activity.execute$default(c56152xxS, 0L, 1, null);
    }

    public final String EZpvd() {
        String quoteSymbol;
        String str = "";
        if (!KWHzl().getAutoMarginReloadSwitch()) {
            return "";
        }
        xMR xmr = xMR.copydefault;
        String autoMarginReloadMaxAmount = KWHzl().getAutoMarginReloadMaxAmount();
        if (autoMarginReloadMaxAmount == null) {
            autoMarginReloadMaxAmount = "";
        }
        String strCopydefault = xmr.copydefault(autoMarginReloadMaxAmount);
        BizInstrument bizInstrumentCopydefault = copydefault();
        if (bizInstrumentCopydefault != null && (quoteSymbol = bizInstrumentCopydefault.getQuoteSymbol()) != null) {
            str = quoteSymbol;
        }
        return strCopydefault + " " + str;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.EZpvd);
    }
}
