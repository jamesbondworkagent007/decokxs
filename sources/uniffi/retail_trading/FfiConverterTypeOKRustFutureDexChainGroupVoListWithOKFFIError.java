package uniffi.retail_trading;

import o.BjX;
import o.BlA;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureDexChainGroupVoListWithOKFFIError extends BaseFfiConverterTypeLong<BjX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureDexChainGroupVoListWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureDexChainGroupVoListWithOKFFIError();

    private FfiConverterTypeOKRustFutureDexChainGroupVoListWithOKFFIError() {
        super(BlA.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BjX lift(long j) {
        return new BjX(C60184zxu.INSTANCE, j);
    }
}
