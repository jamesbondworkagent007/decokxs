package o;

import com.okinc.ok_kyc_core_okx_impl.foebidden.mlnservice.FeatureRestrictionBridge;
import o.C7325ahh;
import o.C8010aue;

/* JADX INFO: loaded from: classes10.dex */
public final class rUJ extends AbstractC7372aib {
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
        return new C7325ahh.Application[]{new C7325ahh.Application("OKFeatureRestrictionBridge", FeatureRestrictionBridge.class)};
    }
}
