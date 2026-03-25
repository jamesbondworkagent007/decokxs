package com.okinc.unify_trade.bot.contract_grid.viewModel;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55886xsR;
import o.C55887xsS;
import o.C56390yDp;
import o.InterfaceC55881xsM;
import o.pUU;
import o.xKK;
import o.xVA;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ContractGridTriggerPresenter extends AbsPresenter {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public String AEQbTJ;
    public C55887xsS EZpvd;
    public ContractGridReq KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.EZpvd = c55887xsS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        this.KWHzl = contractGridReq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGridTriggerPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = "";
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.contract_grid.viewModel.ContractGridTriggerPresenter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final ContractGridReq copydefault() {
        ContractGridReq contractGridReq = this.KWHzl;
        if (contractGridReq != null) {
            return contractGridReq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C55887xsS KWHzl() {
        C55887xsS c55887xsS = this.EZpvd;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void copydefault(Bundle bundle) {
        String string;
        ContractGridReq contractGridReq;
        ContractGridReq contractGridReq2;
        if (bundle == null || (string = bundle.getString("bot_condition_type")) == null) {
            string = TtmlNode.START;
        }
        this.AEQbTJ = string;
        if (bundle == null || (contractGridReq2 = (ContractGridReq) bundle.getParcelable("bot_grid_req")) == null || (contractGridReq = (ContractGridReq) xVA.EZpvd(contractGridReq2)) == null) {
            contractGridReq = new ContractGridReq((String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null);
        }
        copydefault(contractGridReq);
        OLrzqt(new C55887xsS(copydefault().getInstType(), copydefault().getInstId()));
    }

    public final void copydefault(AdvancedTriggerSign advancedTriggerSign) {
        String triggerAction = advancedTriggerSign != null ? advancedTriggerSign.getTriggerAction() : null;
        if (Intrinsics.EZpvd((Object) triggerAction, (Object) TtmlNode.START)) {
            copydefault().getSignParams().set(0, advancedTriggerSign);
        } else if (Intrinsics.EZpvd((Object) triggerAction, (Object) "stop")) {
            copydefault().getSignParams().set(1, advancedTriggerSign);
        }
    }

    public final AdvancedTriggerSign EZpvd() {
        return (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(copydefault().getSignParams());
    }

    public final AdvancedTriggerSign AhwBna() {
        return (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AubY(copydefault().getSignParams());
    }

    public final void EZpvd(@NotNull String str) {
        String str2;
        AdvancedTriggerSign advancedTriggerSign;
        Intrinsics.checkNotNullParameter(str, "");
        String mode = TriggerCond.BELOW.getMode();
        String direction = copydefault().getDirection();
        if (Intrinsics.EZpvd((Object) direction, (Object) "short")) {
            mode = TriggerCond.ABOVE.getMode();
            str2 = "70";
        } else if (Intrinsics.EZpvd((Object) direction, (Object) "neutral")) {
            mode = TriggerCond.CROSS.getMode();
            str2 = "50";
        } else {
            pUU.EZpvd("FutureGridTriggerPresenter", "direction is not exists by start!!!");
            str2 = "30";
        }
        String str3 = mode;
        String str4 = str2;
        ArrayList<AdvancedTriggerSign> signParams = copydefault().getSignParams();
        if (Intrinsics.EZpvd((Object) str, (Object) GridStartTriggerType.RSI_14.getMode())) {
            advancedTriggerSign = new AdvancedTriggerSign(TtmlNode.START, str, (String) null, (String) null, (String) null, "14", TimeFrame.THREE_M.getFrame(), str3, str4, (String) null, (String) null, (String) null, 3612, (DefaultConstructorMarker) null);
        } else {
            advancedTriggerSign = new AdvancedTriggerSign(TtmlNode.START, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4092, (DefaultConstructorMarker) null);
        }
        signParams.set(0, advancedTriggerSign);
    }

    public final void OLrzqt(@NotNull String str) {
        String str2;
        AdvancedTriggerSign advancedTriggerSign;
        Intrinsics.checkNotNullParameter(str, "");
        String frame = TimeFrame.THREE_M.getFrame();
        String mode = TriggerCond.ABOVE.getMode();
        String direction = copydefault().getDirection();
        if (Intrinsics.EZpvd((Object) direction, (Object) "short")) {
            mode = TriggerCond.BELOW.getMode();
            str2 = "30";
        } else if (Intrinsics.EZpvd((Object) direction, (Object) "neutral")) {
            frame = TimeFrame.FIFTEEN_M.getFrame();
            mode = TriggerCond.CROSS.getMode();
            str2 = "50";
        } else {
            pUU.EZpvd("FutureGridTriggerPresenter", "direction is not exists by stop!!!");
            str2 = "70";
        }
        String str3 = frame;
        String str4 = mode;
        String str5 = str2;
        ArrayList<AdvancedTriggerSign> signParams = copydefault().getSignParams();
        if (Intrinsics.EZpvd((Object) str, (Object) GridStopTriggerType.RSI_14.getMode())) {
            advancedTriggerSign = new AdvancedTriggerSign("stop", str, (String) null, (String) null, (String) null, "14", str3, str4, str5, (String) null, "1", (String) null, 2588, (DefaultConstructorMarker) null);
        } else {
            advancedTriggerSign = new AdvancedTriggerSign("stop", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "1", (String) null, 3068, (DefaultConstructorMarker) null);
        }
        signParams.set(1, advancedTriggerSign);
    }

    public final Pair<Boolean, Boolean> OLrzqt() {
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        return C56390yDp.OLrzqt(Boolean.valueOf(!(interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt(KWHzl().fetchVPNInfo(), "contract_grid"))), Boolean.valueOf(true ^ GridStopTriggerType.Companion.copydefault(copydefault().getSignParams())));
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
