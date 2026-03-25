package o;

import androidx.databinding.ViewDataBinding;
import com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardMessageContent;
import com.okinc.buysell.ui.otcagent.initmessage.OtcAgentGetQuoteMessageContent;
import com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageContent;
import com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider;
import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.Unit;
import o.InterfaceC35178nqS;

/* JADX INFO: renamed from: o.lKi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30058lKi extends AbstractC43215rlA implements InterfaceC35178nqS {
    @Override // o.InterfaceC35178nqS
    public Unit EZpvd() {
        return InterfaceC35178nqS.Application.OLrzqt(this);
    }

    @Override // o.InterfaceC35178nqS
    public java.util.List<C35244nrf> OLrzqt() {
        return InterfaceC35178nqS.Application.KWHzl(this);
    }

    @Override // o.InterfaceC35178nqS
    public java.util.List<AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding>> AhwBna() {
        return yDY.gEmmrt(new C30060lKk(), new OtcAgentTradeCardMessageViewProvider(), new C30056lKg());
    }

    @Override // o.InterfaceC35178nqS
    public java.util.List<C35244nrf> copydefault() {
        return yDY.gEmmrt(new C35244nrf("assistant-api", C56402yEa.EZpvd("OTC_INTERNAL_PROMPT_MESSAGE"), OtcAgentGetQuoteMessageContent.class), new C35244nrf("assistant-api", C56402yEa.EZpvd("OTC_TRADE_CARD_MESSAGE"), OtcAgentTradeCardMessageContent.class), new C35244nrf("assistant-api", C56402yEa.EZpvd("OTC_DEPOSIT_CARD_MESSAGE"), OtcAgentDepositCardMessageContent.class));
    }

    @Override // o.InterfaceC35178nqS
    public java.util.List<C35245nrg> AEQbTJ() {
        IMPageType iMPageType = IMPageType.OTC_AGENT_BOT;
        C35285nsT c35285nsT = new C35285nsT();
        c35285nsT.OLrzqt(true);
        c35285nsT.AhwBna(false);
        c35285nsT.EZpvd(false);
        c35285nsT.copydefault(false);
        c35285nsT.KWHzl(true);
        c35285nsT.AEQbTJ(false);
        return C56402yEa.EZpvd(new C35245nrg(iMPageType, c35285nsT));
    }

    @Override // o.InterfaceC35178nqS
    public java.util.List<C35247nri> KWHzl() {
        return C56402yEa.EZpvd(new C35247nri(IMPageType.OTC_AGENT_BOT, new C30057lKh()));
    }

    @Override // o.InterfaceC35178nqS
    public java.util.List<C35252nrn> djBIcL() {
        return C56402yEa.EZpvd(new C35252nrn(IMPageType.OTC_AGENT_BOT, new C30055lKf()));
    }
}
