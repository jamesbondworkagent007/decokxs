package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;

/* JADX INFO: renamed from: o.aFj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5929aFj implements InterfaceC58162ywA<PasskeyApiService> {
    public final PasskeyApiService.PasskeyApiServiceHiltModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public PasskeyApiService get() {
        return copydefault(this.copydefault);
    }

    public static PasskeyApiService copydefault(PasskeyApiService.PasskeyApiServiceHiltModule passkeyApiServiceHiltModule) {
        return (PasskeyApiService) C58165ywD.KWHzl(passkeyApiServiceHiltModule.OLrzqt());
    }
}
