package uniffi.dex;

import o.AAL;
import o.ACF;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureBridgePlatformCheckResponseWithOKFFIError extends BaseFfiConverterTypeLong<ACF> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureBridgePlatformCheckResponseWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureBridgePlatformCheckResponseWithOKFFIError();

    private FfiConverterTypeOKRustFutureBridgePlatformCheckResponseWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public ACF lift(long j) {
        return new ACF(C60184zxu.INSTANCE, j);
    }
}
