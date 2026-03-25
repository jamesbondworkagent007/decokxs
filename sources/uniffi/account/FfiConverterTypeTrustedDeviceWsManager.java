package uniffi.account;

import o.C3146AgT;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeTrustedDeviceWsManager extends BaseFfiConverterTypeLong<C3146AgT> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTrustedDeviceWsManager INSTANCE = new FfiConverterTypeTrustedDeviceWsManager();

    private FfiConverterTypeTrustedDeviceWsManager() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3146AgT lift(long j) {
        return new C3146AgT(C60184zxu.INSTANCE, j);
    }
}
