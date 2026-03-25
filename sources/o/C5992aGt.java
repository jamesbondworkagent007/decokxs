package o;

import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.okinc.auth.impl.passkey.model.SecurityFido2ManagementUseCaseModule;

/* JADX INFO: renamed from: o.aGt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5992aGt implements InterfaceC58162ywA<Fido2ApiClient> {
    public final InterfaceC58164ywC<android.content.Context> EZpvd;
    public final SecurityFido2ManagementUseCaseModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Fido2ApiClient get() {
        return OLrzqt(this.copydefault, this.EZpvd.get());
    }

    public static Fido2ApiClient OLrzqt(SecurityFido2ManagementUseCaseModule securityFido2ManagementUseCaseModule, android.content.Context context) {
        return (Fido2ApiClient) C58165ywD.KWHzl(securityFido2ManagementUseCaseModule.KWHzl(context));
    }
}
