package o;

import com.okinc.tradingbot.impl.mln.OKTradingBotBridge;
import com.okinc.tradingbot.impl.mln.ud.MlnBotKLineTopView;
import com.okinc.tradingbot.impl.mln.ud.MlnChargeConvertor;
import com.okinc.tradingbot.impl.mln.ud.MlnFeeConvertor;
import com.okinc.tradingbot.impl.mln.ud.MlnTradeConvertor;
import com.okinc.tradingbot.impl.mln.ud.SmartArbRecommendationView;
import o.C7325ahh;
import o.C8010aue;
import org.luaj.vm2.LuaUserdata;

/* JADX INFO: renamed from: o.vxy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52021vxy extends AbstractC7372aib {
    public java.lang.Void AEQbTJ() {
        return null;
    }

    public java.lang.Void EZpvd() {
        return null;
    }

    public java.lang.Void KWHzl() {
        return null;
    }

    public java.lang.Void OLrzqt() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public /* synthetic */ java.lang.Class[] registerConstants() {
        return (java.lang.Class[]) KWHzl();
    }

    @Override // o.InterfaceC7378aih
    public /* synthetic */ C7325ahh.TaskDescription[] registerConverter() {
        return (C7325ahh.TaskDescription[]) AEQbTJ();
    }

    @Override // o.InterfaceC7378aih
    public /* synthetic */ InterfaceC7380aij registerRouter() {
        return (InterfaceC7380aij) OLrzqt();
    }

    @Override // o.InterfaceC7378aih
    public /* synthetic */ C8010aue.LoaderManager[] registerStaticClass() {
        return (C8010aue.LoaderManager[]) EZpvd();
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application("OKTradingBotBridge", OKTradingBotBridge.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        java.lang.String[] strArrKWHzl = MlnChargeConvertor.Companion.KWHzl();
        C8010aue.AssistContent assistContentCopydefault = C8010aue.copydefault("ChargeConvertor", (java.lang.Class<? extends LuaUserdata>) MlnChargeConvertor.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
        java.lang.String[] strArrKWHzl2 = MlnTradeConvertor.Companion.KWHzl();
        C8010aue.AssistContent assistContentCopydefault2 = C8010aue.copydefault("TradeConvertor", (java.lang.Class<? extends LuaUserdata>) MlnTradeConvertor.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl2, strArrKWHzl2.length));
        java.lang.String[] strArrAEQbTJ = MlnFeeConvertor.Companion.AEQbTJ();
        C8010aue.AssistContent assistContentCopydefault3 = C8010aue.copydefault("FeeConvertor", (java.lang.Class<? extends LuaUserdata>) MlnFeeConvertor.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArrAEQbTJ, strArrAEQbTJ.length));
        java.lang.String[] strArrKWHzl3 = SmartArbRecommendationView.Companion.KWHzl();
        C8010aue.AssistContent assistContentKWHzl = C8010aue.KWHzl("SmartArbRecommendationView", SmartArbRecommendationView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl3, strArrKWHzl3.length));
        java.lang.String[] strArrKWHzl4 = MlnBotKLineTopView.Companion.KWHzl();
        return new C8010aue.AssistContent[]{assistContentCopydefault, assistContentCopydefault2, assistContentCopydefault3, assistContentKWHzl, C8010aue.KWHzl("BotKLineTopView", MlnBotKLineTopView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl4, strArrKWHzl4.length))};
    }
}
