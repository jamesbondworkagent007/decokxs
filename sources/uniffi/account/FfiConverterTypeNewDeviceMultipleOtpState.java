package uniffi.account;

import o.C58724zMz;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceMultipleOtpState extends BaseFfiConverterTypeLong<C58724zMz> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceMultipleOtpState INSTANCE = new FfiConverterTypeNewDeviceMultipleOtpState();

    private FfiConverterTypeNewDeviceMultipleOtpState() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58724zMz lift(long j) {
        return new C58724zMz(C60184zxu.INSTANCE, j);
    }
}
