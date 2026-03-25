package o;

import com.okinc.business.invest_biz.mln.DeFiWSListenerBridge;
import com.okinc.business.invest_biz.mln.bridge.DeFiMiniDetailPageBridge;
import com.okinc.business.invest_biz.mln.bridge.InvestDataFormatBridge;
import com.okinc.business.invest_biz.mln.ui.DeFiMiniDetailFaqStyleLabel;
import com.okinc.business.invest_biz.mln.ui.kline.DeFiMiniDetailPageKlineView;
import o.C7325ahh;
import o.C8010aue;

/* JADX INFO: renamed from: o.iwN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25417iwN extends AbstractC7372aib {
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
        return new C25425iwV();
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application("OKInvestDataFormat", InvestDataFormatBridge.class), new C7325ahh.Application("InvestDetailBridge", DeFiMiniDetailPageBridge.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        return new C8010aue.AssistContent[]{new C8010aue.AssistContent("OKDeFiDetailKlineView", DeFiMiniDetailPageKlineView.class, false, DeFiMiniDetailPageKlineView.Companion.copydefault()), new C8010aue.AssistContent("OKInvestFaqStyleLabel", DeFiMiniDetailFaqStyleLabel.class, false, DeFiMiniDetailFaqStyleLabel.Companion.KWHzl()), new C8010aue.AssistContent(DeFiWSListenerBridge.LUA_CLASS_NAME, DeFiWSListenerBridge.class, false, false, DeFiWSListenerBridge.methods)};
    }
}
