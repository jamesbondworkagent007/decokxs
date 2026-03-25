package o;

import com.okinc.trade.experience.bridge.UDOKMarketBridge;
import com.okinc.trade.experience.view.UDOKBoostQuoteCard;
import com.okinc.trade.experience.view.UDOKMarketQuoteCard;
import com.okinc.trade.experience.view.UDOKMarketReferralView;
import com.okinc.trade.experience.view.UDOKMarketSearchLua;
import com.okinc.trade.experience.view.UDOKMarketUnlockTokenScheduleView;
import o.C7325ahh;
import o.C8010aue;

/* JADX INFO: renamed from: o.unT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49379unT extends AbstractC7372aib {
    @Override // o.InterfaceC7378aih
    public java.lang.Class<?>[] registerConstants() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.TaskDescription[] registerConverter() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.LoaderManager[] registerStaticClass() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public InterfaceC7380aij registerRouter() {
        return new C49378unS();
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application("OKMarketBridge", UDOKMarketBridge.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        java.lang.String[] strArrKWHzl = UDOKMarketReferralView.Companion.KWHzl();
        C8010aue.AssistContent assistContentKWHzl = C8010aue.KWHzl("OKMarketOverviewCampaignCard", UDOKMarketReferralView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
        java.lang.String[] strArrEZpvd = UDOKMarketUnlockTokenScheduleView.Companion.EZpvd();
        C8010aue.AssistContent assistContentKWHzl2 = C8010aue.KWHzl("OKMarketOverviewUnlockScheduleView", UDOKMarketUnlockTokenScheduleView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArrEZpvd, strArrEZpvd.length));
        java.lang.String[] strArrAEQbTJ = UDOKMarketQuoteCard.Companion.AEQbTJ();
        C8010aue.AssistContent assistContentKWHzl3 = C8010aue.KWHzl("OKMarketQuoteCard", UDOKMarketQuoteCard.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArrAEQbTJ, strArrAEQbTJ.length));
        java.lang.String[] strArrCopydefault = UDOKMarketSearchLua.Companion.copydefault();
        C8010aue.AssistContent assistContentKWHzl4 = C8010aue.KWHzl("OKMarketSearch", UDOKMarketSearchLua.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArrCopydefault, strArrCopydefault.length));
        java.lang.String[] strArrCopydefault2 = UDOKBoostQuoteCard.Companion.copydefault();
        return new C8010aue.AssistContent[]{assistContentKWHzl, assistContentKWHzl2, assistContentKWHzl3, assistContentKWHzl4, C8010aue.KWHzl("OKMarketBoostCard", UDOKBoostQuoteCard.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArrCopydefault2, strArrCopydefault2.length))};
    }
}
