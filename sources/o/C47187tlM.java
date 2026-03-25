package o;

import com.okinc.oksearch.analytics.FuzzySearchEventTrackerLuaBridge;
import com.okinc.oksearch.mlnservice.FuzzySearchBridge;
import o.C7325ahh;
import o.C8010aue;

/* JADX INFO: renamed from: o.tlM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47187tlM extends AbstractC7372aib {
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
    public C8010aue.AssistContent[] registerUserData() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application("FuzzySearchBridge", FuzzySearchBridge.class), new C7325ahh.Application("FuzzySearchEventTrackerLuaBridge", FuzzySearchEventTrackerLuaBridge.class)};
    }
}
