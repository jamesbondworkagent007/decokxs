package o;

import com.okinc.planet.mlnservice.MLNPlanetBridge;
import com.okinc.planet.mlnservice.socket.MLNPlanetWsListener;
import com.okinc.planet.mlnservice.socket.UDPlanetWsArgV5;
import com.okinc.planet.mlnservice.view.UDOKMarketNewsTitleView;
import com.okinc.planet.mlnservice.view.UDOKMarketPostView;
import com.okinc.planet.mlnservice.view.UDOKMarketVoteView;
import com.okinc.planet.mlnservice.view.UDPlanetPluginView;
import o.C7325ahh;
import o.C8010aue;

/* JADX INFO: renamed from: o.tTg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46409tTg extends AbstractC7372aib {
    @Override // o.InterfaceC7378aih
    public java.lang.Class<?>[] registerConstants() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.TaskDescription[] registerConverter() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public InterfaceC7380aij registerRouter() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.LoaderManager[] registerStaticClass() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application("OKPlanetBridge", MLNPlanetBridge.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        java.lang.String[] strArrEZpvd = UDOKMarketPostView.Companion.EZpvd();
        C8010aue.AssistContent assistContentKWHzl = C8010aue.KWHzl("OKMarketPostView", UDOKMarketPostView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArrEZpvd, strArrEZpvd.length));
        java.lang.String[] strArrCopydefault = UDOKMarketNewsTitleView.Companion.copydefault();
        C8010aue.AssistContent assistContentKWHzl2 = C8010aue.KWHzl("OKMarketNewsTitleView", UDOKMarketNewsTitleView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArrCopydefault, strArrCopydefault.length));
        java.lang.String[] strArrEZpvd2 = UDOKMarketVoteView.Companion.EZpvd();
        C8010aue.AssistContent assistContentKWHzl3 = C8010aue.KWHzl("OKMarketVoteView", UDOKMarketVoteView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArrEZpvd2, strArrEZpvd2.length));
        C8010aue.AssistContent assistContentKWHzl4 = C8010aue.KWHzl("OKPlanetPluginView", UDPlanetPluginView.class, false, true, new java.lang.String[0]);
        java.lang.String[] strArrKWHzl = MLNPlanetWsListener.Companion.KWHzl();
        C8010aue.AssistContent assistContentKWHzl5 = C8010aue.KWHzl("OKOrbitWSListener", MLNPlanetWsListener.class, false, false, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
        java.lang.String[] strArr = UDPlanetWsArgV5.EZpvd;
        return new C8010aue.AssistContent[]{assistContentKWHzl, assistContentKWHzl2, assistContentKWHzl3, assistContentKWHzl4, assistContentKWHzl5, C8010aue.KWHzl("OKOrbitWSSubscribeArgV5Web3", UDPlanetWsArgV5.class, false, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))};
    }
}
