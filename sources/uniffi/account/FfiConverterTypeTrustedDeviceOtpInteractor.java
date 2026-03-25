package uniffi.account;

import o.C3174Agv;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeTrustedDeviceOtpInteractor extends BaseFfiConverterTypeLong<C3174Agv> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTrustedDeviceOtpInteractor INSTANCE = new FfiConverterTypeTrustedDeviceOtpInteractor();

    private FfiConverterTypeTrustedDeviceOtpInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3174Agv lift(long j) {
        return new C3174Agv(C60184zxu.INSTANCE, j);
    }
}
