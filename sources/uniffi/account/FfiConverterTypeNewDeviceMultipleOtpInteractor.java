package uniffi.account;

import o.C58713zMo;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceMultipleOtpInteractor extends BaseFfiConverterTypeLong<C58713zMo> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceMultipleOtpInteractor INSTANCE = new FfiConverterTypeNewDeviceMultipleOtpInteractor();

    private FfiConverterTypeNewDeviceMultipleOtpInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58713zMo lift(long j) {
        return new C58713zMo(C60184zxu.INSTANCE, j);
    }
}
