package uniffi.dex;

import o.AAL;
import o.AFR;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError extends BaseFfiConverterTypeLong<AFR> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError();

    private FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AFR lift(long j) {
        return new AFR(C60184zxu.INSTANCE, j);
    }
}
