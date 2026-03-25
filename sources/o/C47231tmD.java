package o;

import com.okinc.okuser.hilt.UserModule;

/* JADX INFO: renamed from: o.tmD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47231tmD implements InterfaceC58162ywA<InterfaceC4968Bxs> {
    public final InterfaceC58164ywC<InterfaceC5017Bzn> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC4968Bxs get() {
        return copydefault(this.copydefault.get());
    }

    public static InterfaceC4968Bxs copydefault(InterfaceC5017Bzn interfaceC5017Bzn) {
        return (InterfaceC4968Bxs) C58165ywD.KWHzl(UserModule.EZpvd.copydefault(interfaceC5017Bzn));
    }
}
