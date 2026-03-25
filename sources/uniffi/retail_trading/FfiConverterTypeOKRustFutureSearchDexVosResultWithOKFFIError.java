package uniffi.retail_trading;

import o.BlA;
import o.C4623Bky;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureSearchDexVosResultWithOKFFIError extends BaseFfiConverterTypeLong<C4623Bky> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureSearchDexVosResultWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureSearchDexVosResultWithOKFFIError();

    private FfiConverterTypeOKRustFutureSearchDexVosResultWithOKFFIError() {
        super(BlA.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4623Bky lift(long j) {
        return new C4623Bky(C60184zxu.INSTANCE, j);
    }
}
