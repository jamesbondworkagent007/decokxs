package uniffi.account;

import o.C58669zKy;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceConfirmInteractor extends BaseFfiConverterTypeLong<C58669zKy> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceConfirmInteractor INSTANCE = new FfiConverterTypeNewDeviceConfirmInteractor();

    private FfiConverterTypeNewDeviceConfirmInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58669zKy lift(long j) {
        return new C58669zKy(C60184zxu.INSTANCE, j);
    }
}
