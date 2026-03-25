package uniffi.dex;

import o.AAL;
import o.AFB;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureSwapChainListWithOKFFIError extends BaseFfiConverterTypeLong<AFB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureSwapChainListWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureSwapChainListWithOKFFIError();

    private FfiConverterTypeOKRustFutureSwapChainListWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AFB lift(long j) {
        return new AFB(C60184zxu.INSTANCE, j);
    }
}
