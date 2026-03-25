package uniffi.dex;

import o.AAL;
import o.AEX;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureStrategyChainListWithOKFFIError extends BaseFfiConverterTypeLong<AEX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureStrategyChainListWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureStrategyChainListWithOKFFIError();

    private FfiConverterTypeOKRustFutureStrategyChainListWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AEX lift(long j) {
        return new AEX(C60184zxu.INSTANCE, j);
    }
}
