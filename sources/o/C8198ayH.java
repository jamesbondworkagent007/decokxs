package o;

import com.okinc.auth.impl.passkey.MfaMlnService;
import com.okinc.auth.impl.passkey.PasskeyMlnService;
import o.C7325ahh;
import o.C8010aue;

/* JADX INFO: renamed from: o.ayH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8198ayH extends AbstractC7372aib {
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
        return new C7325ahh.Application[]{new C7325ahh.Application(PasskeyMlnService.LUA_CLASS_NAME, PasskeyMlnService.class), new C7325ahh.Application(MfaMlnService.LUA_CLASS_NAME, MfaMlnService.class)};
    }
}
