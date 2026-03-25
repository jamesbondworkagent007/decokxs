package o;

import com.okinc.crcore.shared.service.mln.OKCRCoreBridge;
import o.C7325ahh;
import o.C8010aue;

/* JADX INFO: renamed from: o.mDx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31787mDx extends AbstractC7372aib {
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

    public java.lang.Void copydefault() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public /* synthetic */ java.lang.Class[] registerConstants() {
        return (java.lang.Class[]) AEQbTJ();
    }

    @Override // o.InterfaceC7378aih
    public /* synthetic */ C7325ahh.TaskDescription[] registerConverter() {
        return (C7325ahh.TaskDescription[]) EZpvd();
    }

    @Override // o.InterfaceC7378aih
    public /* synthetic */ InterfaceC7380aij registerRouter() {
        return (InterfaceC7380aij) KWHzl();
    }

    @Override // o.InterfaceC7378aih
    public /* synthetic */ C8010aue.LoaderManager[] registerStaticClass() {
        return (C8010aue.LoaderManager[]) OLrzqt();
    }

    @Override // o.InterfaceC7378aih
    public /* synthetic */ C8010aue.AssistContent[] registerUserData() {
        return (C8010aue.AssistContent[]) copydefault();
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application(OKCRCoreBridge.LUA_CLASS_NAME, OKCRCoreBridge.class)};
    }
}
