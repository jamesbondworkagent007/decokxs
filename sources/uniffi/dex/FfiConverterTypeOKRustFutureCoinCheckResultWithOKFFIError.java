package uniffi.dex;

import o.AAL;
import o.ACT;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureCoinCheckResultWithOKFFIError extends BaseFfiConverterTypeLong<ACT> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureCoinCheckResultWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureCoinCheckResultWithOKFFIError();

    private FfiConverterTypeOKRustFutureCoinCheckResultWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public ACT lift(long j) {
        return new ACT(C60184zxu.INSTANCE, j);
    }
}
